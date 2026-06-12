package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.AbstractMap;
import java.util.AbstractCollection;
import java.util.Collection;
import android.text.TextUtils;
import java.util.ArrayList;
import v.e;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.Iterator;
import java.util.List;
import F0.w;
import G0.o;
import F0.d;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.HashSet;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Map;
import F0.g;
import java.util.Set;

public class UserContentController implements Disposable
{
    private static final String CONTENT_WORLDS_GENERATOR_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();";
    private static final String CONTENT_WORLD_WRAPPER_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var iframeId = 'flutter_inappwebview_$IN_APP_WEBVIEW_CONTENT_WORLD_NAME';    var iframe = document.getElementById(iframeId);    if (iframe == null) {      iframe = document.createElement('iframe');      iframe.id = iframeId;      iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';      document.body.append(iframe);    }    if (iframe.contentWindow.document.querySelector('#flutter_inappwebview_plugin_scripts') == null) {      return;    }    var script = iframe.contentWindow.document.createElement('script');    script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;    iframe.contentWindow.document.body.append(script);    clearInterval(interval);  });})();";
    private static final String DOCUMENT_READY_WRAPPER_JS_SOURCE = "if (document.readyState === 'interactive' || document.readyState === 'complete') {   $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    protected static final String LOG_TAG = "UserContentController";
    private static final String USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentEndLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentEndLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentEndLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    private static final String USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentStartLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentStartLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentStartLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    private final Set<ContentWorld> contentWorlds;
    private g contentWorldsCreatorScript;
    private final Map<UserScriptInjectionTime, LinkedHashSet<PluginScript>> pluginScripts;
    private final Map<UserScript, g> scriptHandlerMap;
    private final Map<UserScriptInjectionTime, LinkedHashSet<UserScript>> userOnlyScripts;
    public WebView webView;
    
    public UserContentController(final WebView webView) {
        this.contentWorlds = (Set<ContentWorld>)new HashSet<ContentWorld>(this) {
            final UserContentController this$0;
            
            {
                ((AbstractCollection)this).add((Object)ContentWorld.PAGE);
            }
        };
        this.scriptHandlerMap = (Map<UserScript, g>)new HashMap();
        this.userOnlyScripts = (Map<UserScriptInjectionTime, LinkedHashSet<UserScript>>)new HashMap<UserScriptInjectionTime, LinkedHashSet<UserScript>>(this) {
            final UserContentController this$0;
            
            {
                ((AbstractMap)this).put((Object)UserScriptInjectionTime.AT_DOCUMENT_START, (Object)new LinkedHashSet());
                ((AbstractMap)this).put((Object)UserScriptInjectionTime.AT_DOCUMENT_END, (Object)new LinkedHashSet());
            }
        };
        this.pluginScripts = (Map<UserScriptInjectionTime, LinkedHashSet<PluginScript>>)new HashMap<UserScriptInjectionTime, LinkedHashSet<PluginScript>>(this) {
            final UserContentController this$0;
            
            {
                ((AbstractMap)this).put((Object)UserScriptInjectionTime.AT_DOCUMENT_START, (Object)new LinkedHashSet());
                ((AbstractMap)this).put((Object)UserScriptInjectionTime.AT_DOCUMENT_END, (Object)new LinkedHashSet());
            }
        };
        this.webView = webView;
    }
    
    public static String escapeCode(final String s) {
        return JSONObject.quote(s);
    }
    
    public static String escapeContentWorldName(final String s) {
        return s.replaceAll("'", "\\\\'");
    }
    
    private void updateContentWorldsCreatorScript() {
        final String generateContentWorldsCreatorCode = this.generateContentWorldsCreatorCode();
        if (d.a("DOCUMENT_START_SCRIPT")) {
            final g contentWorldsCreatorScript = this.contentWorldsCreatorScript;
            if (contentWorldsCreatorScript != null) {
                ((o)contentWorldsCreatorScript).a();
            }
            if (!generateContentWorldsCreatorCode.isEmpty()) {
                final WebView webView = this.webView;
                if (webView != null) {
                    this.contentWorldsCreatorScript = (g)w.a(webView, generateContentWorldsCreatorCode, (Set)new HashSet<String>(this) {
                        final UserContentController this$0;
                        
                        {
                            ((AbstractCollection)this).add((Object)"*");
                        }
                    });
                }
            }
        }
    }
    
    public boolean addPluginScript(final PluginScript pluginScript) {
        final ContentWorld contentWorld = pluginScript.getContentWorld();
        if (contentWorld != null) {
            this.contentWorlds.add((Object)contentWorld);
        }
        this.updateContentWorldsCreatorScript();
        if (this.webView != null && pluginScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START && d.a("DOCUMENT_START_SCRIPT")) {
            this.scriptHandlerMap.put((Object)pluginScript, (Object)w.a(this.webView, this.wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), pluginScript.getSource()), (Set)pluginScript.getAllowedOriginRules()));
        }
        return ((AbstractCollection)this.pluginScripts.get((Object)pluginScript.getInjectionTime())).add((Object)pluginScript);
    }
    
    public void addPluginScripts(final List<PluginScript> list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.addPluginScript((PluginScript)iterator.next());
        }
    }
    
    public boolean addUserOnlyScript(final UserScript userScript) {
        final ContentWorld contentWorld = userScript.getContentWorld();
        if (contentWorld != null) {
            this.contentWorlds.add((Object)contentWorld);
        }
        this.updateContentWorldsCreatorScript();
        if (this.webView != null && userScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START && d.a("DOCUMENT_START_SCRIPT")) {
            this.scriptHandlerMap.put((Object)userScript, (Object)w.a(this.webView, this.wrapSourceCodeInContentWorld(userScript.getContentWorld(), userScript.getSource()), (Set)userScript.getAllowedOriginRules()));
        }
        return ((AbstractCollection)this.userOnlyScripts.get((Object)userScript.getInjectionTime())).add((Object)userScript);
    }
    
    public void addUserOnlyScripts(final List<UserScript> list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.addUserOnlyScript((UserScript)iterator.next());
        }
    }
    
    public boolean containsPluginScript(final PluginScript pluginScript) {
        return ((AbstractCollection)this.getPluginScriptAsList()).contains((Object)pluginScript);
    }
    
    public boolean containsPluginScriptByGroupName(final String s) {
        final Iterator iterator = ((AbstractCollection)this.getPluginScriptAsList()).iterator();
        while (iterator.hasNext()) {
            if (Util.objEquals(s, ((PluginScript)iterator.next()).getGroupName())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsUserOnlyScript(final UserScript userScript) {
        return ((AbstractCollection)this.getUserOnlyScriptAsList()).contains((Object)userScript);
    }
    
    public boolean containsUserOnlyScriptByGroupName(final String s) {
        final Iterator iterator = ((AbstractCollection)this.getUserOnlyScriptAsList()).iterator();
        while (iterator.hasNext()) {
            if (Util.objEquals(s, ((UserScript)iterator.next()).getGroupName())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void dispose() {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            final g contentWorldsCreatorScript = this.contentWorldsCreatorScript;
            if (contentWorldsCreatorScript != null) {
                ((o)contentWorldsCreatorScript).a();
            }
        }
        this.removeAllUserOnlyScripts();
        this.removeAllPluginScripts();
        this.webView = null;
    }
    
    public String generateCodeForDocumentStart() {
        final UserScriptInjectionTime at_DOCUMENT_START = UserScriptInjectionTime.AT_DOCUMENT_START;
        final StringBuilder sb = new StringBuilder("");
        sb.append(this.generatePluginScriptsCodeAt(at_DOCUMENT_START));
        final StringBuilder b = e.b(sb.toString());
        b.append(this.generateContentWorldsCreatorCode());
        final StringBuilder b2 = e.b(b.toString());
        b2.append(this.generateUserOnlyScriptsCodeAt(at_DOCUMENT_START));
        return "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentStartLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentStartLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentStartLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}".replace((CharSequence)"$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", (CharSequence)b2.toString());
    }
    
    public String generateCodeForScriptEvaluation(final String s, final ContentWorld contentWorld) {
        String string = s;
        if (contentWorld != null) {
            string = s;
            if (!contentWorld.equals(ContentWorld.PAGE)) {
                final StringBuilder sb = new StringBuilder();
                if (!this.contentWorlds.contains((Object)contentWorld)) {
                    this.contentWorlds.add((Object)contentWorld);
                    final StringBuilder sb2 = new StringBuilder();
                    final Iterator iterator = ((AbstractCollection)this.getPluginScriptsRequiredInAllContentWorlds()).iterator();
                    while (iterator.hasNext()) {
                        sb2.append(((PluginScript)iterator.next()).getSource());
                    }
                    final StringBuilder sb3 = new StringBuilder("'");
                    sb3.append(escapeContentWorldName(contentWorld.getName()));
                    sb3.append("'");
                    sb.append("(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();".replace((CharSequence)"$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY", (CharSequence)sb3.toString()).replace((CharSequence)"$IN_APP_WEBVIEW_JSON_SOURCE_ENCODED", (CharSequence)escapeCode(sb2.toString())));
                    sb.append(";");
                }
                sb.append(this.wrapSourceCodeInContentWorld(contentWorld, s));
                string = sb.toString();
            }
        }
        return string;
    }
    
    public String generateContentWorldsCreatorCode() {
        if (this.contentWorlds.size() == 1) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = ((AbstractCollection)this.getPluginScriptsRequiredInAllContentWorlds()).iterator();
        while (iterator.hasNext()) {
            sb.append(((PluginScript)iterator.next()).getSource());
        }
        final ArrayList list = new ArrayList();
        for (final ContentWorld contentWorld : this.contentWorlds) {
            if (contentWorld.equals(ContentWorld.PAGE)) {
                continue;
            }
            final StringBuilder sb2 = new StringBuilder("'");
            sb2.append(escapeContentWorldName(contentWorld.getName()));
            sb2.append("'");
            list.add((Object)sb2.toString());
        }
        return "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();".replace((CharSequence)"$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY", (CharSequence)TextUtils.join((CharSequence)", ", (Iterable)list)).replace((CharSequence)"$IN_APP_WEBVIEW_JSON_SOURCE_ENCODED", (CharSequence)escapeCode(sb.toString()));
    }
    
    public String generatePluginScriptsCodeAt(final UserScriptInjectionTime userScriptInjectionTime) {
        final StringBuilder sb = new StringBuilder();
        for (final PluginScript pluginScript : this.getPluginScriptsAt(userScriptInjectionTime)) {
            final StringBuilder sb2 = new StringBuilder(";");
            sb2.append(pluginScript.getSource());
            sb.append(this.wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), sb2.toString()));
        }
        return sb.toString();
    }
    
    public String generateUserOnlyScriptsCodeAt(final UserScriptInjectionTime userScriptInjectionTime) {
        final StringBuilder sb = new StringBuilder();
        for (final UserScript userScript : this.getUserOnlyScriptsAt(userScriptInjectionTime)) {
            final StringBuilder sb2 = new StringBuilder(";");
            sb2.append(userScript.getSource());
            sb.append(this.wrapSourceCodeInContentWorld(userScript.getContentWorld(), sb2.toString()));
        }
        return sb.toString();
    }
    
    public String generateWrappedCodeForDocumentEnd() {
        final UserScriptInjectionTime at_DOCUMENT_END = UserScriptInjectionTime.AT_DOCUMENT_END;
        final boolean a = d.a("DOCUMENT_START_SCRIPT");
        String string = "";
        if (!a) {
            final StringBuilder sb = new StringBuilder("");
            sb.append(this.generateCodeForDocumentStart());
            string = sb.toString();
        }
        final StringBuilder b = e.b(string);
        b.append(this.generatePluginScriptsCodeAt(at_DOCUMENT_END));
        final StringBuilder b2 = e.b(b.toString());
        b2.append(this.generateUserOnlyScriptsCodeAt(at_DOCUMENT_END));
        return "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentEndLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentEndLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentEndLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}".replace((CharSequence)"$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", (CharSequence)b2.toString());
    }
    
    public String generateWrappedCodeForDocumentStart() {
        return Util.replaceAll("if (document.readyState === 'interactive' || document.readyState === 'complete') {   $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}", "$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", this.generateCodeForDocumentStart());
    }
    
    public LinkedHashSet<ContentWorld> getContentWorlds() {
        return (LinkedHashSet<ContentWorld>)new LinkedHashSet((Collection)this.contentWorlds);
    }
    
    public LinkedHashSet<PluginScript> getPluginScriptAsList() {
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator iterator = this.pluginScripts.values().iterator();
        while (iterator.hasNext()) {
            ((AbstractCollection)set).addAll((Collection)iterator.next());
        }
        return (LinkedHashSet<PluginScript>)set;
    }
    
    public LinkedHashSet<PluginScript> getPluginScriptsAt(final UserScriptInjectionTime userScriptInjectionTime) {
        return (LinkedHashSet<PluginScript>)new LinkedHashSet((Collection)this.pluginScripts.get((Object)userScriptInjectionTime));
    }
    
    public LinkedHashSet<PluginScript> getPluginScriptsRequiredInAllContentWorlds() {
        final LinkedHashSet set = new LinkedHashSet();
        for (final PluginScript pluginScript : this.getPluginScriptsAt(UserScriptInjectionTime.AT_DOCUMENT_START)) {
            if (pluginScript.isRequiredInAllContentWorlds()) {
                ((AbstractCollection)set).add((Object)pluginScript);
            }
        }
        return (LinkedHashSet<PluginScript>)set;
    }
    
    public LinkedHashSet<UserScript> getUserOnlyScriptAsList() {
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator iterator = this.userOnlyScripts.values().iterator();
        while (iterator.hasNext()) {
            ((AbstractCollection)set).addAll((Collection)iterator.next());
        }
        return (LinkedHashSet<UserScript>)set;
    }
    
    public LinkedHashSet<UserScript> getUserOnlyScriptsAt(final UserScriptInjectionTime userScriptInjectionTime) {
        return (LinkedHashSet<UserScript>)new LinkedHashSet((Collection)this.userOnlyScripts.get((Object)userScriptInjectionTime));
    }
    
    public void removeAllPluginScripts() {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            for (final PluginScript pluginScript : (LinkedHashSet)this.pluginScripts.get((Object)UserScriptInjectionTime.AT_DOCUMENT_START)) {
                final g g = (g)this.scriptHandlerMap.get((Object)pluginScript);
                if (g != null) {
                    ((o)g).a();
                    this.scriptHandlerMap.remove((Object)pluginScript);
                }
            }
        }
        ((AbstractCollection)this.pluginScripts.get((Object)UserScriptInjectionTime.AT_DOCUMENT_START)).clear();
        ((AbstractCollection)this.pluginScripts.get((Object)UserScriptInjectionTime.AT_DOCUMENT_END)).clear();
    }
    
    public void removeAllUserOnlyScripts() {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            for (final UserScript userScript : (LinkedHashSet)this.userOnlyScripts.get((Object)UserScriptInjectionTime.AT_DOCUMENT_START)) {
                final g g = (g)this.scriptHandlerMap.get((Object)userScript);
                if (g != null) {
                    ((o)g).a();
                    this.scriptHandlerMap.remove((Object)userScript);
                }
            }
        }
        ((AbstractCollection)this.userOnlyScripts.get((Object)UserScriptInjectionTime.AT_DOCUMENT_START)).clear();
        ((AbstractCollection)this.userOnlyScripts.get((Object)UserScriptInjectionTime.AT_DOCUMENT_END)).clear();
    }
    
    public boolean removePluginScript(final PluginScript pluginScript) {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            final g g = (g)this.scriptHandlerMap.get((Object)pluginScript);
            if (g != null) {
                ((o)g).a();
                this.scriptHandlerMap.remove((Object)pluginScript);
            }
            this.updateContentWorldsCreatorScript();
        }
        return ((AbstractCollection)this.pluginScripts.get((Object)pluginScript.getInjectionTime())).remove((Object)pluginScript);
    }
    
    public void removePluginScriptsByGroupName(final String s) {
        for (final PluginScript pluginScript : this.getPluginScriptAsList()) {
            if (Util.objEquals(s, pluginScript.getGroupName())) {
                this.removePluginScript(pluginScript);
            }
        }
    }
    
    public boolean removeUserOnlyScript(final UserScript userScript) {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            final g g = (g)this.scriptHandlerMap.get((Object)userScript);
            if (g != null) {
                ((o)g).a();
                this.scriptHandlerMap.remove((Object)userScript);
            }
            this.updateContentWorldsCreatorScript();
        }
        return ((AbstractCollection)this.userOnlyScripts.get((Object)userScript.getInjectionTime())).remove((Object)userScript);
    }
    
    public boolean removeUserOnlyScriptAt(final int n, final UserScriptInjectionTime userScriptInjectionTime) {
        return this.removeUserOnlyScript((UserScript)new ArrayList((Collection)this.userOnlyScripts.get((Object)userScriptInjectionTime)).get(n));
    }
    
    public void removeUserOnlyScriptsByGroupName(final String s) {
        for (final UserScript userScript : this.getUserOnlyScriptAsList()) {
            if (Util.objEquals(s, userScript.getGroupName())) {
                this.removeUserOnlyScript(userScript);
            }
        }
    }
    
    public void resetContentWorlds() {
        this.contentWorlds.clear();
        this.contentWorlds.add((Object)ContentWorld.PAGE);
        final Iterator iterator = ((AbstractCollection)this.getPluginScriptAsList()).iterator();
        while (iterator.hasNext()) {
            this.contentWorlds.add((Object)((PluginScript)iterator.next()).getContentWorld());
        }
        final Iterator iterator2 = ((AbstractCollection)this.getUserOnlyScriptAsList()).iterator();
        while (iterator2.hasNext()) {
            this.contentWorlds.add((Object)((UserScript)iterator2.next()).getContentWorld());
        }
    }
    
    public String wrapSourceCodeInContentWorld(final ContentWorld contentWorld, final String s) {
        String replace = s;
        if (contentWorld != null) {
            if (contentWorld.equals(ContentWorld.PAGE)) {
                replace = s;
            }
            else {
                replace = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var iframeId = 'flutter_inappwebview_$IN_APP_WEBVIEW_CONTENT_WORLD_NAME';    var iframe = document.getElementById(iframeId);    if (iframe == null) {      iframe = document.createElement('iframe');      iframe.id = iframeId;      iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';      document.body.append(iframe);    }    if (iframe.contentWindow.document.querySelector('#flutter_inappwebview_plugin_scripts') == null) {      return;    }    var script = iframe.contentWindow.document.createElement('script');    script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;    iframe.contentWindow.document.body.append(script);    clearInterval(interval);  });})();".replace((CharSequence)"$IN_APP_WEBVIEW_CONTENT_WORLD_NAME", (CharSequence)escapeContentWorldName(contentWorld.getName())).replace((CharSequence)"$IN_APP_WEBVIEW_JSON_SOURCE_ENCODED", (CharSequence)escapeCode(s));
            }
        }
        return replace;
    }
}
