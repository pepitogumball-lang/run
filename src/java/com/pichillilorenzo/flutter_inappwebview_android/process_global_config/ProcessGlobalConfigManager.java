package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import androidx.webkit.ProcessGlobalConfig;
import android.content.Context;
import java.util.Map;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class ProcessGlobalConfigManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "ProcessGlobalConfigM";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_processglobalconfig";
    public InAppWebViewFlutterPlugin plugin;
    
    public ProcessGlobalConfigManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_processglobalconfig"));
        this.plugin = plugin;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"apply")) {
            o.notImplemented();
        }
        else {
            final InAppWebViewFlutterPlugin plugin = this.plugin;
            if (plugin != null && plugin.activity != null) {
                final ProcessGlobalConfigSettings parse = new ProcessGlobalConfigSettings().parse((Map<String, Object>)m.a("settings"));
                try {
                    ProcessGlobalConfig.a(parse.toProcessGlobalConfig((Context)this.plugin.activity));
                    o.success((Object)Boolean.TRUE);
                }
                catch (final Exception ex) {
                    o.error("ProcessGlobalConfigM", "", (Object)ex);
                }
            }
            else {
                o.success((Object)Boolean.FALSE);
            }
        }
    }
}
