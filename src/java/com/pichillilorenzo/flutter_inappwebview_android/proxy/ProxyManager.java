package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import G0.c;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import F0.b;
import java.util.ArrayList;
import F0.d;
import G0.B;
import G0.z;
import G0.m;
import java.util.concurrent.Executor;
import F4.o;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import F0.e;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class ProxyManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static e proxyController;
    public InAppWebViewFlutterPlugin plugin;
    
    public ProxyManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_proxycontroller"));
        this.plugin = plugin;
    }
    
    private void clearProxyOverride(final o o) {
        final e proxyController = ProxyManager.proxyController;
        if (proxyController != null) {
            final Executor executor = (Executor)new Executor(this) {
                final ProxyManager this$0;
                
                public void execute(final Runnable runnable) {
                    runnable.run();
                }
            };
            final Runnable runnable = (Runnable)new Runnable(this, o) {
                final ProxyManager this$0;
                final o val$result;
                
                public void run() {
                    this.val$result.success((Object)Boolean.TRUE);
                }
            };
            final m m = (m)proxyController;
            if (!((c)z.F).b()) {
                throw z.a();
            }
            if (m.a == null) {
                m.a = B.a.getProxyController();
            }
            m.a.clearProxyOverride((Runnable)runnable, (Executor)executor);
        }
    }
    
    public static void init() {
        if (ProxyManager.proxyController == null && d.a("PROXY_OVERRIDE")) {
            if (!d.a("PROXY_OVERRIDE")) {
                throw new UnsupportedOperationException("Proxy override not supported");
            }
            ProxyManager.proxyController = (e)d.a;
        }
    }
    
    private void setProxyOverride(final ProxySettings proxySettings, final o o) {
        if (ProxyManager.proxyController != null) {
            final ArrayList list = new ArrayList();
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = proxySettings.bypassRules.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)iterator.next());
            }
            final Iterator iterator2 = proxySettings.directs.iterator();
            while (iterator2.hasNext()) {
                list.add((Object)new b((String)iterator2.next(), "direct://"));
            }
            for (final ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
                if (proxyRuleExt.getSchemeFilter() != null) {
                    list.add((Object)new b(proxyRuleExt.getSchemeFilter(), proxyRuleExt.getUrl()));
                }
                else {
                    list.add((Object)new b("*", proxyRuleExt.getUrl()));
                }
            }
            final Boolean bypassSimpleHostnames = proxySettings.bypassSimpleHostnames;
            if (bypassSimpleHostnames != null && bypassSimpleHostnames) {
                list2.add((Object)"<local>");
            }
            final Boolean removeImplicitRules = proxySettings.removeImplicitRules;
            if (removeImplicitRules != null && removeImplicitRules) {
                list2.add((Object)"<-loopback>");
            }
            final boolean b = proxySettings.reverseBypassEnabled != null && d.a("PROXY_OVERRIDE_REVERSE_BYPASS") && proxySettings.reverseBypassEnabled;
            final e proxyController = ProxyManager.proxyController;
            final Executor executor = (Executor)new Executor(this) {
                final ProxyManager this$0;
                
                public void execute(final Runnable runnable) {
                    runnable.run();
                }
            };
            final Runnable runnable = (Runnable)new Runnable(this, o) {
                final ProxyManager this$0;
                final o val$result;
                
                public void run() {
                    this.val$result.success((Object)Boolean.TRUE);
                }
            };
            final m m = (m)proxyController;
            m.getClass();
            final G0.b f = z.F;
            final G0.b l = z.L;
            final List unmodifiableList = Collections.unmodifiableList((List)list);
            final String[][] array = new String[unmodifiableList.size()][2];
            for (int i = 0; i < unmodifiableList.size(); ++i) {
                array[i][0] = ((b)unmodifiableList.get(i)).a;
                array[i][1] = ((b)unmodifiableList.get(i)).b;
            }
            final String[] array2 = (String[])Collections.unmodifiableList((List)list2).toArray((Object[])new String[0]);
            if (((c)f).b() && !b) {
                if (m.a == null) {
                    m.a = B.a.getProxyController();
                }
                m.a.setProxyOverride(array, array2, (Runnable)runnable, (Executor)executor);
            }
            else {
                if (!((c)f).b() || !((c)l).b()) {
                    throw z.a();
                }
                if (m.a == null) {
                    m.a = B.a.getProxyController();
                }
                m.a.setProxyOverride(array, array2, (Runnable)runnable, (Executor)executor, b);
            }
        }
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
    
    @Override
    public void onMethodCall(final F4.m m, final o o) {
        init();
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"clearProxyOverride")) {
            if (!a.equals((Object)"setProxyOverride")) {
                o.notImplemented();
            }
            else if (ProxyManager.proxyController != null) {
                final HashMap hashMap = (HashMap)m.a("settings");
                final ProxySettings proxySettings = new ProxySettings();
                if (hashMap != null) {
                    proxySettings.parse((Map<String, Object>)hashMap);
                }
                this.setProxyOverride(proxySettings, o);
            }
            else {
                o.success((Object)Boolean.FALSE);
            }
        }
        else if (ProxyManager.proxyController != null) {
            this.clearProxyOverride(o);
        }
        else {
            o.success((Object)Boolean.FALSE);
        }
    }
}
