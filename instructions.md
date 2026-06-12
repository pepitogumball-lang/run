# Instrucciones para Replit AI: Discord Bot Designer (Guía Definitiva de Reconstrucción y Despliegue)

Este documento es la guía técnica definitiva para Replit AI, diseñada para la reconstrucción, optimización y despliegue del proyecto "Bot Designer For Discord". El objetivo es transformar el concepto de una aplicación móvil de diseño de bots en un sistema robusto y persistente, compatible con F-Droid y con capacidades avanzadas, asegurando que los bots creados estén "activos de por vida" y sean altamente configurables.

## 1. Comprensión Profunda del Proyecto y el Rol de Replit AI

El archivo ZIP (`com.jakubtomana.discordbotdesinger.zip`) contiene una **aplicación móvil Flutter para Android**. Es fundamental entender que esta aplicación es un **entorno de diseño y configuración de bots**, no el bot de Discord en sí mismo. La lógica del bot, es decir, cómo responde a comandos y eventos, se define *a través* de esta aplicación. Por lo tanto, el rol de Replit AI se desglosa en:

1.  **Análisis de la Salida de la Aplicación Móvil:** Determinar cómo la aplicación móvil serializa la configuración de un bot (ej. a un archivo JSON, YAML, o un formato propietario). Aunque no tenemos el código fuente de Flutter directamente, la aplicación debe generar algún tipo de artefacto que defina el bot.
2.  **Desarrollo del "Bot Runner" en Replit:** Crear un servicio en Replit (el "Bot Runner") que pueda interpretar esta configuración generada por la aplicación móvil y ejecutar el bot de Discord en consecuencia.
3.  **Alojamiento Persistente:** Implementar una infraestructura que garantice la ejecución 24/7 del "Bot Runner".
4.  **Automatización de Builds para F-Droid:** Establecer un pipeline de CI/CD para la aplicación móvil que genere APKs compatibles con F-Droid.
5.  **Extensibilidad:** Considerar un sistema de plugins para el "Bot Runner".

## 2. Arquitectura del Sistema: Separación de la Lógica del Bot

La clave para este proyecto es la **separación clara entre la interfaz de usuario (la aplicación Flutter) y la lógica de ejecución del bot (el "Bot Runner")**. La aplicación Flutter es el *front-end* para el diseño, mientras que el "Bot Runner" es el *back-end* que ejecuta el bot real.

### 2.1. Extracción Conceptual de la Lógica del Bot

Dado que el proyecto original es una aplicación Android compilada, la "lógica del bot" no es directamente accesible como código fuente de Discord. En cambio, la aplicación móvil probablemente:

*   **Genera un Archivo de Configuración:** Al "guardar" o "exportar" un bot, la aplicación crea un archivo (ej. `bot_config.json`) que contiene la definición de comandos, eventos, respuestas, etc.
*   **Se Comunica con un Backend:** Alternativamente, la aplicación podría enviar esta configuración a un backend (que Replit AI tendría que emular o construir) que luego la pasa al "Bot Runner".

**Acción para Replit AI:**
1.  **Hipótesis de Formato de Configuración:** Asumir que la aplicación genera un archivo JSON o YAML con la estructura de los comandos y eventos del bot. Replit AI deberá definir un esquema JSON/YAML para esta configuración.
2.  **Creación del "Bot Runner" (Ejemplo Python):** Desarrollar un script Python (usando `discord.py`) o Node.js (usando `discord.js`) que lea este archivo de configuración y use la API de Discord para inicializar y ejecutar el bot. Este script será el corazón del "Bot Runner".

```python
# Ejemplo conceptual de bot_runner.py
import discord
import json
import os

# Cargar el token de Discord de forma segura
TOKEN = os.getenv('DISCORD_BOT_TOKEN')

# Cargar la configuración del bot (asumiendo que la app Flutter la genera)
with open('bot_config.json', 'r') as f:
    config = json.load(f)

intents = discord.Intents.default()
intents.message_content = True # Habilitar si el bot necesita leer el contenido de los mensajes

client = discord.Client(intents=intents)

@client.event
async def on_ready():
    print(f'Bot conectado como {client.user}')
    # Aquí se podría implementar la lógica para registrar comandos dinámicamente

@client.event
async def on_message(message):
    if message.author == client.user:
        return

    # Lógica de comandos basada en la configuración cargada
    for command_name, command_details in config.get('commands', {}).items():
        if message.content.startswith(f"!{command_name}"):
            await message.channel.send(command_details.get('response', 'Comando no configurado.'))
            return

client.run(TOKEN)
```

### 2.2. Base de Datos Offline en la Aplicación Móvil (F-Droid)

Para la aplicación Flutter, la persistencia offline de las configuraciones de los bots es crucial para F-Droid. La investigación sugiere que las bases de datos locales son la mejor opción:

*   **`sqflite` (SQLite):** Para datos estructurados y complejos. Es la opción más robusta para almacenar configuraciones detalladas de bots.
*   **`Hive` o `Isar`:** Para datos no relacionales, ofrecen un rendimiento excelente y son fáciles de integrar en Flutter.

**Acción para Replit AI:** Al analizar el código Flutter (si se pudiera descompilar o si se tuviera acceso al código fuente), identificar la implementación de la base de datos. Si no existe, Replit AI debería documentar la necesidad de integrar `sqflite` para almacenar las configuraciones de los bots en el dispositivo móvil. Estas configuraciones serían luego exportadas o sincronizadas con el "Bot Runner".

## 3. Persistencia Extrema del "Bot Runner" en Replit (24/7/365)

Para garantizar que el "Bot Runner" esté siempre activo, se deben combinar varias estrategias, priorizando la estabilidad y la resiliencia.

### 3.1. Replit "Always On" y Replit Database [1]

*   **Descripción:** La función "Always On" es la base. Sin embargo, los "repls" pueden reiniciarse. La [Replit Database](https://docs.repl.it/misc/database) es una base de datos clave-valor persistente que sobrevive a los reinicios del "repl".
*   **Acción para Replit AI:**
    1.  **Activación de "Always On":** Si el plan del usuario lo permite, activar "Always On" para el "repl" del "Bot Runner".
    2.  **Uso de Replit Database:** Todas las configuraciones dinámicas del bot (comandos, eventos, estados) deben almacenarse en la Replit Database. Esto asegura que, incluso si el "repl" se reinicia, el bot cargará su estado y configuración más recientes.

### 3.2. Monitoreo Activo y "Keep-Alive" Externo (Uptime Robot) [2]

*   **Descripción:** Complementar "Always On" con un servicio de monitoreo externo. Si Replit suspende el "repl" por alguna razón, Uptime Robot lo "despertará".
*   **Acción para Replit AI:**
    1.  **Exponer un Endpoint HTTP:** El "Bot Runner" debe incluir un pequeño servidor web (ej. Flask en Python) que exponga un endpoint `/health` o `/ping`.
    2.  **Configuración de Uptime Robot:** Proporcionar instrucciones detalladas para configurar Uptime Robot para que haga ping a este endpoint cada 5 minutos. Esto garantiza que el "repl" reciba tráfico y se mantenga activo.

### 3.3. Arquitecturas Serverless y Contenedores Efímeros (Más Allá de Replit)

Para una persistencia y escalabilidad aún mayores, Replit AI debe ser consciente de soluciones más avanzadas que, aunque no se implementen directamente en Replit, representan el ideal de "de por vida".

*   **Funciones Serverless (AWS Lambda, Google Cloud Functions):** Permiten ejecutar el código del bot en respuesta a eventos (ej. mensajes de Discord) sin gestionar servidores. Son inherentemente 24/7 y escalables. [4]
*   **Contenedores (Docker, Kubernetes):** Desplegar el bot en un contenedor Docker en plataformas como Google Cloud Run, AWS ECS/EKS, o un VPS. Esto ofrece un control total sobre el entorno y una alta disponibilidad.

**Acción para Replit AI:** Documentar estas opciones como futuras mejoras o alternativas para el usuario que busque la máxima fiabilidad, explicando sus ventajas y desventajas en comparación con Replit.

## 4. Automatización de Builds para F-Droid (CI/CD)

Para que la aplicación móvil sea verdaderamente compatible con F-Droid, el proceso de build debe ser automatizado y reproducible. Esto se logra con un pipeline de Integración Continua/Despliegue Continuo (CI/CD), preferiblemente usando GitHub Actions.

### 4.1. Metadatos de F-Droid [5]

*   **Descripción:** F-Droid utiliza archivos de metadatos (`.yml`) para describir las aplicaciones y sus procesos de construcción. Estos archivos especifican cómo F-Droid debe compilar la aplicación desde el código fuente.
*   **Acción para Replit AI:**
    1.  **Creación de `com.jakubtomana.discordbotdesinger.yml`:** Crear un archivo de metadatos YAML en el repositorio `run` (o en un repositorio `fdroiddata` separado) que instruya a F-Droid cómo construir la aplicación Flutter. Esto incluirá la versión de Flutter, los comandos de build (`flutter build apk`), y cualquier parche necesario.
    2.  **Ejemplo de Metadatos (Conceptual):**
        ```yaml
        # /path/to/fdroiddata/metadata/com.jakubtomana.discordbotdesinger.yml
        Categories: 
          - Utility
          - Social
        License: Apache-2.0 # O la licencia real del proyecto
        SourceCode: https://github.com/pepitogumball-lang/run
        IssueTracker: https://github.com/pepitogumball-lang/run/issues
        AutoUpdateMode: Version
        UpdateCheckMode: Tags
        Builds:
          - versionName: 2.9.1 # Versión actual del APK
            versionCode: 2205037 # Código de versión actual
            commit: <hash-del-commit-inicial> # Hash del commit que corresponde a esta versión
            subdir: com.jakubtomana.discordbotdesinger # Si el proyecto Flutter está en un subdirectorio
            sudo: 
              - apt-get update || true
              - apt-get install -y openjdk-17-jdk # Asegurar JDK para Android
            build:
              - flutter pub get
              - flutter build apk --release
            output: build/app/outputs/flutter-apk/app-release.apk
        ```

### 4.2. GitHub Actions para Automatización [6]

*   **Descripción:** Un workflow de GitHub Actions puede automatizar la compilación de la aplicación Flutter y la generación de un APK cada vez que se realice un push a la rama `main`.
*   **Acción para Replit AI:** Crear un archivo `.github/workflows/build_fdroid_apk.yml` en el repositorio `run`.

    ```yaml
    # .github/workflows/build_fdroid_apk.yml
    name: Build F-Droid APK

on: 
  push:
    branches:
      - main
  workflow_dispatch:

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          distribution: 'temurin'
          java-version: '17'

      - uses: subosito/flutter-action@v2
        with:
          flutter-version: '3.x.x' # Usar una versión estable de Flutter

      - name: Get Flutter dependencies
        run: flutter pub get

      - name: Build Android APK for F-Droid
        run: flutter build apk --release

      - name: Upload APK artifact
        uses: actions/upload-artifact@v4
        with:
          name: app-release-apk
          path: build/app/outputs/flutter-apk/app-release.apk
    ```

## 5. Sistema de Plugins Dinámicos para el "Bot Runner" (Conceptual)

Para permitir la extensibilidad sin redepliegues constantes, el "Bot Runner" podría implementar un sistema de plugins.

*   **Descripción:** Los usuarios podrían escribir pequeños scripts (ej. Python) que el "Bot Runner" cargaría y ejecutaría dinámicamente, añadiendo nuevas funcionalidades o comandos.
*   **Implementación:**
    1.  **Directorio de Plugins:** El "Bot Runner" monitorea un directorio `plugins/`.
    2.  **Carga Dinámica:** Utiliza la función `importlib` de Python (o equivalente en Node.js) para cargar módulos de forma dinámica.
    3.  **API de Plugins:** Define una interfaz clara (ej. una clase base abstracta) que los plugins deben implementar para interactuar con el bot.
*   **Acción para Replit AI:** Documentar este concepto como una mejora avanzada. El "Bot Runner" podría tener un mecanismo para recargar estos plugins sin reiniciar el proceso principal, lo que permitiría a los usuarios añadir o modificar funcionalidades sobre la marcha.

## 6. Seguridad Avanzada y Manejo de Tokens

La seguridad de las credenciales es primordial.

*   **Variables de Entorno de Replit (Secrets):** Es la forma más segura de almacenar el `DISCORD_BOT_TOKEN` y cualquier otra clave API. [1]
*   **Principio de Mínimo Privilegio:** El token de Discord debe tener solo los permisos necesarios para las funciones del bot.
*   **Auditorías de Código:** Aunque Replit AI no realizará auditorías de seguridad, debe recomendar que el código del "Bot Runner" sea revisado periódicamente.

**Acción para Replit AI:** Reconfirmar que el `DISCORD_BOT_TOKEN` se carga exclusivamente desde las variables de entorno de Replit. Proporcionar un recordatorio explícito al usuario sobre la importancia de no exponer estas claves.

## 7. Proceso de Reconstrucción y Despliegue para Replit AI (Actualizado)

1.  **Clonar el Repositorio:** Replit AI debe clonar este repositorio.
    ```bash
    git clone https://github.com/pepitogumball-lang/run.git
    cd run
    ```
2.  **Análisis de la Aplicación Flutter (Conceptual):** Aunque el código fuente de Flutter no está presente, Replit AI debe entender que la aplicación móvil es la interfaz de diseño. El objetivo es que esta aplicación genere una `bot_config.json` (o similar) que defina el bot.
3.  **Configuración del "Bot Runner" en Replit:**
    *   Crear un nuevo "repl" en Replit (preferiblemente Python o Node.js).
    *   Copiar el `bot_runner.py` (o equivalente) y el `bot_config.json` (ejemplo) a este "repl".
    *   Configurar el `DISCORD_BOT_TOKEN` como un secreto de Replit.
    *   Implementar el endpoint `/health` para Uptime Robot.
    *   Activar "Always On" si es posible.
4.  **Despliegue y Monitoreo:**
    *   Ejecutar el "Bot Runner" en el "repl".
    *   Configurar Uptime Robot para monitorear el endpoint `/health` del "Bot Runner".
5.  **Automatización F-Droid (Opcional/Futuro):**
    *   Crear el archivo `com.jakubtomana.discordbotdesinger.yml` con los metadatos de F-Droid.
    *   Configurar el workflow de GitHub Actions (`.github/workflows/build_fdroid_apk.yml`) para automatizar la construcción de APKs.
6.  **Pruebas Exhaustivas:** Verificar la conexión del bot, la ejecución de comandos, la persistencia de la configuración y la capacidad de recuperación ante reinicios.

## 8. Referencias

[1] Replit. (2023, October 6). *Hosting Apps with Always On*. [https://replit.com/blog/alwayson](https://replit.com/blog/alwayson)
[2] Infosecwriteups. (2023, September 25). *Running Discord Bots 24/7 for Free with Replit and Uptime Robot*. [https://infosecwriteups.com/running-discord-bots-24-7-for-free-with-replit-and-uptime-robot-43caebb0cb60](https://infosecwriteups.com/running-discord-bots-24-7-for-free-with-replit-and-uptime-robot-43caebb0cb60)
[3] Stack Overflow. (2019, February 16). *Keep Discord Bot online on repl.it - python*. [https://stackoverflow.com/questions/54722596/keep-discord-bot-online-on-repl-it](https://stackoverflow.com/questions/54722596/keep-discord-bot-online-on-repl-it)
[4] OneUptime. (2026, February 12). *How to Build a Serverless Discord Bot on AWS*. [https://oneuptime.com/blog/post/2026-02-12-build-a-serverless-discord-bot-on-aws/view](https://oneuptime.com/blog/post/2026-02-12-build-a-serverless-discord-bot-on-aws/view)
[5] F-Droid. (n.d.). *Build Metadata Reference*. [https://f-droid.org/en/docs/Build_Metadata_Reference/](https://f-droid.org/en/docs/Build_Metadata_Reference/)
[6] DEV Community. (2026, May 14). *How to Publish Your Flutter App on F-Droid*. [https://dev.to/benji377/how-to-publish-your-flutter-app-on-f-droid-3ed5](https://dev.to/benji377/how-to-publish-your-flutter-app-on-f-droid-3ed5)
