package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import G0.c;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
import G0.t;
import G0.z;
import G0.l;
import F0.d;
import F4.o;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.google.android.gms.internal.measurement.L;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import android.net.Uri;
import F0.n;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import F4.p;
import F4.f;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import F0.a;
import F0.v;
import java.util.Set;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class WebMessageListener implements Disposable
{
    static final boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;
    public String id;
    public String jsObjectName;
    public v listener;
    public a replyProxy;
    public InAppWebViewInterface webView;
    
    public WebMessageListener(final String id, final InAppWebViewInterface webView, final f f, final String jsObjectName, final Set<String> allowedOriginRules) {
        this.id = id;
        this.webView = webView;
        this.jsObjectName = jsObjectName;
        this.allowedOriginRules = allowedOriginRules;
        final StringBuilder sb = new StringBuilder("com.pichillilorenzo/flutter_inappwebview_web_message_listener_");
        sb.append(this.id);
        sb.append("_");
        sb.append(this.jsObjectName);
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new p(f, sb.toString()));
        if (this.webView instanceof InAppWebView) {
            this.listener = (v)new v(this) {
                final WebMessageListener this$0;
                
                public void onPostMessage(final WebView webView, final n n, final Uri uri, final boolean b, final a replyProxy) {
                    final WebMessageListener this$0 = this.this$0;
                    this$0.replyProxy = replyProxy;
                    final WebMessageListenerChannelDelegate channelDelegate = this$0.channelDelegate;
                    if (channelDelegate != null) {
                        final WebMessageCompatExt fromMapWebMessageCompat = WebMessageCompatExt.fromMapWebMessageCompat(n);
                        String string;
                        if (uri.toString().equals((Object)"null")) {
                            string = null;
                        }
                        else {
                            string = uri.toString();
                        }
                        channelDelegate.onPostMessage(fromMapWebMessageCompat, string, b);
                    }
                }
            };
        }
    }
    
    public static WebMessageListener fromMap(final InAppWebViewInterface inAppWebViewInterface, final f f, final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String)map.get((Object)"id"), inAppWebViewInterface, f, (String)map.get((Object)"jsObjectName"), (Set<String>)new HashSet((Collection)map.get((Object)"allowedOriginRules")));
    }
    
    public void assertOriginRulesValid() {
        final Iterator iterator = this.allowedOriginRules.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (s == null) {
                throw new Exception(Y3.a.j(n, "allowedOriginRules[", "] is null"));
            }
            if (s.isEmpty()) {
                throw new Exception(Y3.a.j(n, "allowedOriginRules[", "] is empty"));
            }
            if ("*".equals((Object)s)) {
                continue;
            }
            final Uri parse = Uri.parse(s);
            final String scheme = parse.getScheme();
            final String host = parse.getHost();
            final String path = parse.getPath();
            final int port = parse.getPort();
            if (scheme == null) {
                throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
            }
            if (("http".equals((Object)scheme) || "https".equals((Object)scheme)) && (host == null || host.isEmpty())) {
                throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
            }
            if (!"http".equals((Object)scheme) && !"https".equals((Object)scheme) && (host != null || port != -1)) {
                throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
            }
            if ((host == null || host.isEmpty()) && port != -1) {
                throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
            }
            if (!path.isEmpty()) {
                throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
            }
            if (host != null) {
                final int index = host.indexOf("*");
                if (index != 0 || (index == 0 && !host.startsWith("*."))) {
                    throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
                }
                if (host.startsWith("[")) {
                    if (!host.endsWith("]")) {
                        throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
                    }
                    if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                        throw new Exception(m0.a.g("allowedOriginRules ", s, " is invalid"));
                    }
                }
            }
            ++n;
        }
    }
    
    @Override
    public void dispose() {
        final WebMessageListenerChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }
    
    public void initJsInstance() {
        if (this.webView != null) {
            final String replaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            final ArrayList list = new ArrayList();
            for (final String s : this.allowedOriginRules) {
                if ("*".equals((Object)s)) {
                    list.add((Object)"'*'");
                }
                else {
                    final Uri parse = Uri.parse(s);
                    final String host = parse.getHost();
                    final String s2 = "null";
                    String string;
                    if (host != null) {
                        final StringBuilder sb = new StringBuilder("'");
                        sb.append(Util.replaceAll(parse.getHost(), "'", "\\'"));
                        sb.append("'");
                        string = sb.toString();
                    }
                    else {
                        string = "null";
                    }
                    final StringBuilder sb2 = new StringBuilder("{scheme: '");
                    sb2.append(parse.getScheme());
                    sb2.append("', host: ");
                    sb2.append(string);
                    sb2.append(", port: ");
                    Object value = s2;
                    if (parse.getPort() != -1) {
                        value = parse.getPort();
                    }
                    sb2.append(value);
                    sb2.append("}");
                    list.add((Object)sb2.toString());
                }
            }
            final String b = x.a.b(L.m("(function() {  var allowedOriginRules = [", TextUtils.join((CharSequence)", ", (Iterable)list), "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window.flutter_inappwebview._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['", replaceAll, "'] = new FlutterInAppWebViewWebMessageListener('"), replaceAll, "');  }})();");
            final UserContentController userContentController = this.webView.getUserContentController();
            final StringBuilder sb3 = new StringBuilder("WebMessageListener-");
            sb3.append(this.jsObjectName);
            userContentController.addPluginScript(new PluginScript(sb3.toString(), b, UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
        }
    }
    
    public boolean isOriginAllowed(final String p0, final String p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageListener.allowedOriginRules:Ljava/util/Set;
        //     4: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //     9: astore          12
        //    11: aload           12
        //    13: invokeinterface java/util/Iterator.hasNext:()Z
        //    18: istore          8
        //    20: iconst_0       
        //    21: istore          7
        //    23: iload           8
        //    25: ifeq            404
        //    28: aload           12
        //    30: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    35: checkcast       Ljava/lang/String;
        //    38: astore          9
        //    40: ldc             "*"
        //    42: aload           9
        //    44: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    47: ifeq            52
        //    50: iconst_1       
        //    51: ireturn        
        //    52: aload_1        
        //    53: ifnull          11
        //    56: aload_1        
        //    57: invokevirtual   java/lang/String.isEmpty:()Z
        //    60: ifeq            66
        //    63: goto            11
        //    66: aload_1        
        //    67: invokevirtual   java/lang/String.isEmpty:()Z
        //    70: ifeq            96
        //    73: aload_2        
        //    74: ifnull          84
        //    77: aload_2        
        //    78: invokevirtual   java/lang/String.isEmpty:()Z
        //    81: ifeq            96
        //    84: iload_3        
        //    85: ifeq            11
        //    88: iload_3        
        //    89: iconst_m1      
        //    90: if_icmpne       96
        //    93: goto            11
        //    96: aload           9
        //    98: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   101: astore          13
        //   103: aload           13
        //   105: invokevirtual   android/net/Uri.getPort:()I
        //   108: istore          4
        //   110: bipush          80
        //   112: istore          5
        //   114: iload           4
        //   116: iconst_m1      
        //   117: if_icmpeq       141
        //   120: aload           13
        //   122: invokevirtual   android/net/Uri.getPort:()I
        //   125: ifne            131
        //   128: goto            141
        //   131: aload           13
        //   133: invokevirtual   android/net/Uri.getPort:()I
        //   136: istore          4
        //   138: goto            166
        //   141: ldc             "https"
        //   143: aload           13
        //   145: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   148: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   151: ifeq            162
        //   154: sipush          443
        //   157: istore          4
        //   159: goto            166
        //   162: bipush          80
        //   164: istore          4
        //   166: iload_3        
        //   167: ifeq            184
        //   170: iload_3        
        //   171: iconst_m1      
        //   172: if_icmpne       178
        //   175: goto            184
        //   178: iload_3        
        //   179: istore          5
        //   181: goto            198
        //   184: ldc             "https"
        //   186: aload_1        
        //   187: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   190: ifeq            198
        //   193: sipush          443
        //   196: istore          5
        //   198: aload           13
        //   200: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   203: astore          9
        //   205: aconst_null    
        //   206: astore          10
        //   208: aload           9
        //   210: ifnull          253
        //   213: aload           13
        //   215: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   218: ldc             "["
        //   220: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   223: ifeq            253
        //   226: aload           13
        //   228: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   231: iconst_1       
        //   232: aload           13
        //   234: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   237: invokevirtual   java/lang/String.length:()I
        //   240: iconst_1       
        //   241: isub           
        //   242: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   245: invokestatic    com/pichillilorenzo/flutter_inappwebview_android/Util.normalizeIPv6:(Ljava/lang/String;)Ljava/lang/String;
        //   248: astore          9
        //   250: goto            256
        //   253: aconst_null    
        //   254: astore          9
        //   256: aload_2        
        //   257: invokestatic    com/pichillilorenzo/flutter_inappwebview_android/Util.normalizeIPv6:(Ljava/lang/String;)Ljava/lang/String;
        //   260: astore          11
        //   262: aload           11
        //   264: astore          10
        //   266: aload           13
        //   268: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   271: aload_1        
        //   272: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   275: istore          8
        //   277: aload           13
        //   279: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   282: ifnull          374
        //   285: aload           13
        //   287: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   290: invokevirtual   java/lang/String.isEmpty:()Z
        //   293: ifne            374
        //   296: aload           13
        //   298: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   301: aload_2        
        //   302: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   305: ifne            374
        //   308: aload           13
        //   310: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   313: ldc             "*"
        //   315: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   318: ifeq            345
        //   321: aload_2        
        //   322: ifnull          345
        //   325: aload_2        
        //   326: aload           13
        //   328: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   331: ldc_w           "\\*"
        //   334: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   337: iconst_1       
        //   338: aaload         
        //   339: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   342: ifne            374
        //   345: aload           10
        //   347: ifnull          368
        //   350: aload           9
        //   352: ifnull          368
        //   355: aload           10
        //   357: aload           9
        //   359: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   362: ifeq            368
        //   365: goto            374
        //   368: iconst_0       
        //   369: istore          6
        //   371: goto            377
        //   374: iconst_1       
        //   375: istore          6
        //   377: iload           4
        //   379: iload           5
        //   381: if_icmpne       387
        //   384: iconst_1       
        //   385: istore          7
        //   387: iload           8
        //   389: ifeq            11
        //   392: iload           6
        //   394: ifeq            11
        //   397: iload           7
        //   399: ifeq            11
        //   402: iconst_1       
        //   403: ireturn        
        //   404: iconst_0       
        //   405: ireturn        
        //   406: astore          9
        //   408: goto            253
        //   411: astore          11
        //   413: goto            266
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  226    250    406    411    Ljava/lang/Exception;
        //  256    262    411    416    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0256:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void postMessageForInAppWebView(final WebMessageCompatExt webMessageCompatExt, final o o) {
        if (this.replyProxy != null && d.a("WEB_MESSAGE_LISTENER")) {
            final Object data = webMessageCompatExt.getData();
            if (data != null) {
                if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && webMessageCompatExt.getType() == 1) {
                    final a replyProxy = this.replyProxy;
                    final byte[] array = (byte[])data;
                    final l l = (l)replyProxy;
                    l.getClass();
                    if (!((c)z.u).b()) {
                        throw z.a();
                    }
                    l.a.postMessageWithPayload((InvocationHandler)new J5.a((FeatureFlagHolderBoundaryInterface)new t(array)));
                }
                else {
                    final a replyProxy2 = this.replyProxy;
                    final String string = data.toString();
                    final l i = (l)replyProxy2;
                    i.getClass();
                    if (!((c)z.J).b()) {
                        throw z.a();
                    }
                    i.a.postMessage(string);
                }
            }
        }
        o.success((Object)Boolean.TRUE);
    }
}
