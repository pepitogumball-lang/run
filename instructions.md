# Instrucciones para Replit AI: Discord Bot Designer

Este repositorio contiene el código fuente de una aplicación móvil Android, "Bot Designer For Discord", desarrollada con Flutter. El objetivo de este documento es proporcionar a Replit AI las instrucciones necesarias para configurar el entorno, construir y ejecutar la aplicación, teniendo en cuenta las características para usuarios de F-Droid y la persistencia de los bots.

## 1. Descripción del Proyecto

"Bot Designer For Discord" es una aplicación que permite a los usuarios diseñar y crear bots para Discord sin necesidad de codificación. La aplicación está implementada en Flutter, lo que significa que utiliza un único código base para compilarse en aplicaciones nativas para Android. La intención es que esta aplicación sea adecuada para la distribución en plataformas como F-Droid, lo que implica un enfoque en la transparencia, la privacidad y, en la medida de lo posible, la funcionalidad offline para la gestión de configuraciones de bots.

## 2. Requisitos Previos

Para construir y ejecutar esta aplicación, Replit AI necesitará el siguiente entorno configurado:

*   **Flutter SDK**: La versión compatible con este proyecto. Dada la naturaleza de los archivos extraídos, asumiremos una versión reciente y estable de Flutter.
*   **Android SDK**: Para compilar la aplicación Android. Esto incluye las herramientas de línea de comandos de Android y una versión adecuada de la plataforma Android (API 24 o superior, según `minSdkVersion` en `AndroidManifest.xml`).
*   **Java Development Kit (JDK)**: Requerido por el Android SDK.

## 3. Configuración del Entorno en Replit

Replit AI debe asegurarse de que el entorno tenga Flutter y Android SDK configurados correctamente. Los pasos generales serían:

1.  **Instalar Flutter SDK**: Si no está preinstalado, descargar y configurar Flutter.
    ```bash
    git clone https://github.com/flutter/flutter.git -b stable
    export PATH="$PATH:$(pwd)/flutter/bin"
    flutter doctor
    ```
2.  **Configurar Android SDK**: Asegurarse de que el Android SDK esté disponible y que las licencias sean aceptadas.
    ```bash
    flutter doctor --android-licenses
    ```
3.  **Verificar la configuración**: Ejecutar `flutter doctor` para asegurarse de que no haya problemas pendientes.

## 4. Construcción y Ejecución del Proyecto

Una vez que el entorno esté configurado, Replit AI puede proceder a construir y ejecutar la aplicación:

1.  **Navegar al directorio del proyecto**: El código fuente de la aplicación se encuentra en el directorio raíz de este repositorio.
    ```bash
    cd /home/ubuntu/run_repo
    ```
2.  **Obtener dependencias de Flutter**: Descargar todos los paquetes y dependencias necesarios para el proyecto Flutter.
    ```bash
    flutter pub get
    ```
3.  **Construir la aplicación Android**: Compilar la aplicación para Android. Esto generará un archivo APK o AppBundle.
    ```bash
    flutter build apk --release
    # O para un AppBundle:
    # flutter build appbundle --release
    ```
4.  **Ejecutar la aplicación (opcional)**: Si Replit AI tiene la capacidad de emular o conectar un dispositivo Android, puede ejecutar la aplicación.
    ```bash
    flutter run
    ```
    Para ejecutar en un dispositivo específico o emulador, primero liste los dispositivos disponibles:
    ```bash
    flutter devices
    flutter run -d <device_id>
    ```

## 5. Consideraciones Adicionales para Replit AI

### 5.1. Base de Datos Offline para Configuraciones de Bots

La aplicación debe permitir a los usuarios recordar y gestionar sus bots incluso sin conexión a internet. Esto implica el uso de una base de datos local en el dispositivo Android. Flutter ofrece varias opciones para esto, como:

*   **SQLite (a través de `sqflite` o `drift`):** Ideal para datos estructurados y relaciones complejas.
*   **Hive:** Una base de datos NoSQL ligera y rápida, adecuada para almacenar objetos Dart.
*   **Shared Preferences:** Para datos clave-valor simples y pequeños.

Replit AI deberá identificar la implementación existente o sugerir la integración de una de estas soluciones para la persistencia de las configuraciones de los bots dentro de la aplicación.

### 5.2. Persistencia de Bots (Activos 24/7)

La solicitud es que los bots creados estén activos "de por vida" y automáticamente. Esto generalmente requiere que el bot se ejecute en un servidor, no directamente desde la aplicación móvil. Si bien la aplicación móvil es la interfaz de diseño, el bot en sí necesita un entorno de alojamiento constante.

Para lograr que los bots estén activos 24/7 en Replit, Replit AI puede considerar las siguientes estrategias:

*   **Replit Always On (si está disponible y es viable):** Algunos planes de Replit ofrecen la opción de mantener los "repls" activos continuamente.
*   **Monitoreo Externo (Uptime Robot):** Configurar un servicio externo como Uptime Robot para enviar solicitudes HTTP periódicas al bot alojado en Replit. Esto evita que el "repl" entre en suspensión por inactividad. Requeriría que el bot exponga un endpoint HTTP simple.
*   **Servicios de Alojamiento Dedicados:** Para una fiabilidad óptima 24/7, especialmente para bots con alta demanda, se recomienda un servicio de alojamiento de bots dedicado o un Servidor Privado Virtual (VPS). Replit AI debería considerar esto como una opción a largo plazo si la funcionalidad "Always On" no es suficiente o no está disponible.

Replit AI deberá adaptar la lógica de alojamiento del bot para asegurar su ejecución continua, posiblemente extrayendo la lógica del bot de la aplicación móvil y desplegándola como un servicio separado en Replit.

### 5.3. Configuración de Comandos Automáticos

La capacidad de configurar comandos automáticamente implica que la aplicación móvil debe tener una interfaz para definir estos comandos y que el bot alojado debe ser capaz de interpretarlos y ejecutarlos. Replit AI deberá asegurarse de que la comunicación entre la aplicación (donde se diseñan los comandos) y el bot alojado (que los ejecuta) sea fluida y segura. Esto podría implicar el uso de una API o un sistema de mensajería para actualizar las configuraciones del bot en tiempo real.

## 6. Notas Adicionales

*   El `AndroidManifest.xml` indica que la aplicación es una aplicación Flutter. Los archivos `dex-files` y `jar-files` son probablemente artefactos de compilaciones anteriores o dependencias que Flutter gestionará automáticamente.
*   El `info.json` proporciona metadatos básicos del paquete.
*   La aplicación requiere permisos de Internet, notificaciones y acceso a servicios de Google (Firebase, AdMob, Billing), lo que sugiere que es una aplicación con funcionalidades en línea y posiblemente monetización. Estos servicios deben ser considerados al adaptar la aplicación para F-Droid, ya que F-Droid a menudo prefiere aplicaciones sin dependencias de servicios propietarios de Google.

Al seguir estos pasos y considerar las recomendaciones, Replit AI debería poder reconstruir y ejecutar la aplicación "Bot Designer For Discord", adaptándola a las necesidades de persistencia y la filosofía de F-Droid.
