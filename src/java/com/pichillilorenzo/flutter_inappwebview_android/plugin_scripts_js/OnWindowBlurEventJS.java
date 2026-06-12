package com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js;

import java.util.Set;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;

public class OnWindowBlurEventJS
{
    public static final PluginScript ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT;
    public static final String ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT_GROUP_NAME = "IN_APP_WEBVIEW_ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT";
    public static final String ON_WINDOW_BLUR_EVENT_JS_SOURCE = "(function(){  window.addEventListener('blur', function(e) {    window.flutter_inappwebview.callHandler('onWindowBlur');  });})();";
    
    static {
        ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT = new PluginScript("IN_APP_WEBVIEW_ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT", "(function(){  window.addEventListener('blur', function(e) {    window.flutter_inappwebview.callHandler('onWindowBlur');  });})();", UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null);
    }
}
