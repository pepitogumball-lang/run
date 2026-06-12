package Z4;

import java.io.ByteArrayOutputStream;
import java.security.cert.Certificate;
import android.net.http.SslCertificate;
import android.net.http.SslCertificate$DName;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import java.security.cert.X509Certificate;
import java.security.PrivateKey;
import android.webkit.ClientCertRequest;
import android.os.Message;
import android.webkit.HttpAuthHandler;
import android.webkit.GeolocationPermissions$Callback;
import android.view.View;
import android.webkit.WebChromeClient$CustomViewCallback;
import android.webkit.PermissionRequest;
import java.util.Arrays;
import android.webkit.WebChromeClient$FileChooserParams;
import android.webkit.WebStorage;
import android.webkit.DownloadListener;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.CookieManager;
import E4.b;
import android.webkit.ConsoleMessage;
import java.lang.reflect.Proxy;
import G0.A;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import G0.z;
import F0.p;
import android.webkit.WebResourceError;
import android.webkit.WebResourceResponse;
import d5.e;
import java.util.Collections;
import android.webkit.WebResourceRequest;
import java.util.Map;
import java.util.List;
import F4.t;
import java.nio.ByteBuffer;
import android.util.Log;
import n5.h;
import F1.n;
import X4.c;

public final class g extends c
{
    public final n e;
    
    public g(final n e) {
        h.e("registrar", (Object)e);
        super(1);
        this.e = e;
    }
    
    public static final void l(final String s, final Object o, final Throwable t) {
        final StringBuilder sb = new StringBuilder("Failed to create new Dart proxy instance of ");
        sb.append(s);
        sb.append(": ");
        sb.append(o);
        sb.append(". ");
        sb.append((Object)t);
        Log.w("PigeonProxyApiBaseCodec", sb.toString());
    }
    
    @Override
    public final Object f(final byte b, final ByteBuffer byteBuffer) {
        h.e("buffer", (Object)byteBuffer);
        if (b == -128) {
            final Object e = this.e(byteBuffer);
            h.c("null cannot be cast to non-null type kotlin.Long", e);
            final long longValue = (long)e;
            final Object e2 = ((Z4.c)this.e.E).e(longValue);
            if (e2 == null) {
                final StringBuilder sb = new StringBuilder("Failed to find instance with identifier: ");
                sb.append(longValue);
                Log.e("PigeonProxyApiBaseCodec", sb.toString());
            }
            return e2;
        }
        return super.f(b, byteBuffer);
    }
    
    @Override
    public final void k(final t t, final Object o) {
        if (o instanceof Boolean || o instanceof byte[] || o instanceof Double || o instanceof double[] || o instanceof float[] || o instanceof Integer || o instanceof int[] || o instanceof List || o instanceof Long || o instanceof long[] || o instanceof Map || o instanceof String || o instanceof s || o instanceof j || o instanceof w || o instanceof M || o instanceof v || o == null) {
            super.k(t, o);
            return;
        }
        final boolean b = o instanceof WebResourceRequest;
        final n e = this.e;
        if (b) {
            e.getClass();
            final WebResourceRequest webResourceRequest = (WebResourceRequest)o;
            final f f = new f(o, 0);
            final Z4.c c = (Z4.c)e.E;
            if (!c.d(webResourceRequest)) {
                final long b2 = c.b(webResourceRequest);
                final String string = webResourceRequest.getUrl().toString();
                final boolean forMainFrame = webResourceRequest.isForMainFrame();
                final boolean redirect = webResourceRequest.isRedirect();
                final boolean hasGesture = webResourceRequest.hasGesture();
                final String method = webResourceRequest.getMethod();
                Map map;
                if (webResourceRequest.getRequestHeaders() == null) {
                    map = Collections.emptyMap();
                }
                else {
                    map = webResourceRequest.getRequestHeaders();
                }
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", e.c(), null).t(d5.e.D(new Object[] { b2, string, forMainFrame, redirect, hasGesture, method, map }), (F4.c)new B(f, 13));
            }
        }
        else if (o instanceof WebResourceResponse) {
            e.getClass();
            final WebResourceResponse webResourceResponse = (WebResourceResponse)o;
            final f f2 = new f(o, 26);
            final Z4.c c2 = (Z4.c)e.E;
            if (!c2.d(webResourceResponse)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", e.c(), null).t(d5.e.D((Object[])new Long[] { c2.b(webResourceResponse), (Long)webResourceResponse.getStatusCode() }), (F4.c)new B(f2, 14));
            }
        }
        else if (o instanceof WebResourceError) {
            e.getClass();
            final WebResourceError webResourceError = (WebResourceError)o;
            final f f3 = new f(o, 12);
            final Z4.c c3 = (Z4.c)e.E;
            if (!c3.d(webResourceError)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", e.c(), null).t(d5.e.D(new Object[] { c3.b(webResourceError), webResourceError.getErrorCode(), webResourceError.getDescription().toString() }), (F4.c)new B(f3, 11));
            }
        }
        else if (o instanceof p) {
            e.getClass();
            final p p2 = (p)o;
            final f f4 = new f(o, 13);
            final Z4.c c4 = (Z4.c)e.E;
            if (!c4.d(p2)) {
                final long b3 = c4.b(p2);
                final G0.v v = (G0.v)p2;
                z.o.getClass();
                if (v.a == null) {
                    v.a = (WebResourceError)((WebkitToCompatConverterBoundaryInterface)A.a.D).convertWebResourceError(Proxy.getInvocationHandler((Object)v.b));
                }
                final long n = v.a.getErrorCode();
                z.n.getClass();
                if (v.a == null) {
                    v.a = (WebResourceError)((WebkitToCompatConverterBoundaryInterface)A.a.D).convertWebResourceError(Proxy.getInvocationHandler((Object)v.b));
                }
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", e.c(), null).t(d5.e.D(new Object[] { b3, n, v.a.getDescription().toString() }), (F4.c)new B(f4, 12));
            }
        }
        else if (o instanceof Z) {
            e.getClass();
            final Z z = (Z)o;
            final f f5 = new f(o, 14);
            final Z4.c c5 = (Z4.c)e.E;
            if (!c5.d(z)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", e.c(), null).t(d5.e.D((Object[])new Long[] { c5.b(z), z.a, z.b }), (F4.c)new B(f5, 21));
            }
        }
        else if (o instanceof ConsoleMessage) {
            e.getClass();
            final ConsoleMessage consoleMessage = (ConsoleMessage)o;
            final f f6 = new f(o, 15);
            final Z4.c c6 = (Z4.c)e.E;
            if (!c6.d(consoleMessage)) {
                final long b4 = c6.b(consoleMessage);
                final long n2 = consoleMessage.lineNumber();
                final String message = consoleMessage.message();
                final int n3 = k.a[((Enum)consoleMessage.messageLevel()).ordinal()];
                j j;
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                if (n3 != 5) {
                                    j = Z4.j.J;
                                }
                                else {
                                    j = Z4.j.E;
                                }
                            }
                            else {
                                j = Z4.j.F;
                            }
                        }
                        else {
                            j = Z4.j.I;
                        }
                    }
                    else {
                        j = Z4.j.G;
                    }
                }
                else {
                    j = Z4.j.H;
                }
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", e.c(), null).t(d5.e.D(new Object[] { b4, n2, message, j, consoleMessage.sourceId() }), (F4.c)new b((Object)f6, 24));
            }
        }
        else if (o instanceof CookieManager) {
            e.getClass();
            final CookieManager cookieManager = (CookieManager)o;
            final f f7 = new f(o, 16);
            final Z4.c c7 = (Z4.c)e.E;
            if (!c7.d(cookieManager)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c7.b(cookieManager)), (F4.c)new b((Object)f7, 25));
            }
        }
        else if (o instanceof WebView) {
            e.getClass();
            final WebView webView = (WebView)o;
            final f f8 = new f(o, 17);
            final Z4.c c8 = (Z4.c)e.E;
            if (!c8.d(webView)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c8.b(webView)), (F4.c)new B(f8, 18));
            }
        }
        else if (o instanceof WebSettings) {
            e.getClass();
            final WebSettings webSettings = (WebSettings)o;
            final f f9 = new f(o, 18);
            final Z4.c c9 = (Z4.c)e.E;
            if (!c9.d(webSettings)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c9.b(webSettings)), (F4.c)new B(f9, 15));
            }
        }
        else if (o instanceof u) {
            e.getClass();
            if (!((Z4.c)e.E).d(o)) {
                l("JavaScriptChannel", o, c5.e.a(com.google.android.gms.internal.auth.h.k((Throwable)new a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", ""))));
            }
        }
        else if (o instanceof WebViewClient) {
            e.getClass();
            final WebViewClient webViewClient = (WebViewClient)o;
            final f f10 = new f(o, 11);
            final Z4.c c10 = (Z4.c)e.E;
            if (!c10.d(webViewClient)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c10.b(webViewClient)), (F4.c)new B(f10, 19));
            }
        }
        else if (o instanceof DownloadListener) {
            e.getClass();
            if (!((Z4.c)e.E).d(o)) {
                l("DownloadListener", o, c5.e.a(com.google.android.gms.internal.auth.h.k((Throwable)new a("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", ""))));
            }
        }
        else if (o instanceof S) {
            e.getClass();
            if (!((Z4.c)e.E).d(o)) {
                l("WebChromeClient", o, c5.e.a(com.google.android.gms.internal.auth.h.k((Throwable)new a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""))));
            }
        }
        else if (o instanceof Z4.t) {
            e.getClass();
            final Z4.t t2 = (Z4.t)o;
            final f f11 = new f(o, 19);
            final Z4.c c11 = (Z4.c)e.E;
            if (!c11.d(t2)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c11.b(t2)), (F4.c)new b((Object)f11, 29));
            }
        }
        else if (o instanceof WebStorage) {
            e.getClass();
            final WebStorage webStorage = (WebStorage)o;
            final f f12 = new f(o, 20);
            final Z4.c c12 = (Z4.c)e.E;
            if (!c12.d(webStorage)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c12.b(webStorage)), (F4.c)new B(f12, 16));
            }
        }
        else if (o instanceof WebChromeClient$FileChooserParams) {
            e.getClass();
            final WebChromeClient$FileChooserParams webChromeClient$FileChooserParams = (WebChromeClient$FileChooserParams)o;
            final f f13 = new f(o, 21);
            final Z4.c c13 = (Z4.c)e.E;
            if (!c13.d(webChromeClient$FileChooserParams)) {
                final long b5 = c13.b(webChromeClient$FileChooserParams);
                final boolean captureEnabled = webChromeClient$FileChooserParams.isCaptureEnabled();
                final List list = Arrays.asList((Object[])webChromeClient$FileChooserParams.getAcceptTypes());
                final int mode = webChromeClient$FileChooserParams.getMode();
                s s;
                if (mode != 0) {
                    if (mode != 1) {
                        if (mode != 3) {
                            s = Z4.s.H;
                        }
                        else {
                            s = Z4.s.G;
                        }
                    }
                    else {
                        s = Z4.s.F;
                    }
                }
                else {
                    s = Z4.s.E;
                }
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", e.c(), null).t(d5.e.D(new Object[] { b5, captureEnabled, list, s, webChromeClient$FileChooserParams.getFilenameHint() }), (F4.c)new b((Object)f13, 28));
            }
        }
        else if (o instanceof PermissionRequest) {
            e.getClass();
            final PermissionRequest permissionRequest = (PermissionRequest)o;
            final f f14 = new f(o, 22);
            final Z4.c c14 = (Z4.c)e.E;
            if (!c14.d(permissionRequest)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", e.c(), null).t(d5.e.D(new Object[] { c14.b(permissionRequest), Arrays.asList((Object[])permissionRequest.getResources()) }), (F4.c)new B(f14, 3));
            }
        }
        else if (o instanceof WebChromeClient$CustomViewCallback) {
            e.getClass();
            final WebChromeClient$CustomViewCallback webChromeClient$CustomViewCallback = (WebChromeClient$CustomViewCallback)o;
            final f f15 = new f(o, 23);
            final Z4.c c15 = (Z4.c)e.E;
            if (!c15.d(webChromeClient$CustomViewCallback)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c15.b(webChromeClient$CustomViewCallback)), (F4.c)new b((Object)f15, 26));
            }
        }
        else if (o instanceof View) {
            e.getClass();
            final View view = (View)o;
            final f f16 = new f(o, 24);
            final Z4.c c16 = (Z4.c)e.E;
            if (!c16.d(view)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c16.b(view)), (F4.c)new B(f16, 10));
            }
        }
        else if (o instanceof GeolocationPermissions$Callback) {
            e.getClass();
            final GeolocationPermissions$Callback geolocationPermissions$Callback = (GeolocationPermissions$Callback)o;
            final f f17 = new f(o, 25);
            final Z4.c c17 = (Z4.c)e.E;
            if (!c17.d(geolocationPermissions$Callback)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c17.b(geolocationPermissions$Callback)), (F4.c)new B(f17, 0));
            }
        }
        else if (o instanceof HttpAuthHandler) {
            e.getClass();
            final HttpAuthHandler httpAuthHandler = (HttpAuthHandler)o;
            final f f18 = new f(o, 1);
            final Z4.c c18 = (Z4.c)e.E;
            if (!c18.d(httpAuthHandler)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c18.b(httpAuthHandler)), (F4.c)new B(f18, 1));
            }
        }
        else if (o instanceof Message) {
            e.getClass();
            final Message message2 = (Message)o;
            final f f19 = new f(o, 2);
            final Z4.c c19 = (Z4.c)e.E;
            if (!c19.d(message2)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c19.b(message2)), (F4.c)new b((Object)f19, 21));
            }
        }
        else if (o instanceof ClientCertRequest) {
            e.getClass();
            final ClientCertRequest clientCertRequest = (ClientCertRequest)o;
            final f f20 = new f(o, 3);
            final Z4.c c20 = (Z4.c)e.E;
            if (!c20.d(clientCertRequest)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c20.b(clientCertRequest)), (F4.c)new b((Object)f20, 23));
            }
        }
        else if (o instanceof PrivateKey) {
            e.getClass();
            final PrivateKey privateKey = (PrivateKey)o;
            final f f21 = new f(o, 4);
            final Z4.c c21 = (Z4.c)e.E;
            if (!c21.d(privateKey)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c21.b(privateKey)), (F4.c)new B(f21, 4));
            }
        }
        else if (o instanceof X509Certificate) {
            e.getClass();
            final X509Certificate x509Certificate = (X509Certificate)o;
            final f f22 = new f(o, 5);
            final Z4.c c22 = (Z4.c)e.E;
            if (!c22.d(x509Certificate)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c22.b(x509Certificate)), (F4.c)new B(f22, 22));
            }
        }
        else if (o instanceof SslErrorHandler) {
            e.getClass();
            final SslErrorHandler sslErrorHandler = (SslErrorHandler)o;
            final f f23 = new f(o, 6);
            final Z4.c c23 = (Z4.c)e.E;
            if (!c23.d(sslErrorHandler)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c23.b(sslErrorHandler)), (F4.c)new B(f23, 9));
            }
        }
        else if (o instanceof SslError) {
            e.getClass();
            final SslError sslError = (SslError)o;
            final f f24 = new f(o, 7);
            final Z4.c c24 = (Z4.c)e.E;
            if (!c24.d(sslError)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", e.c(), null).t(d5.e.D(new Object[] { c24.b(sslError), sslError.getCertificate(), sslError.getUrl() }), (F4.c)new B(f24, 7));
            }
        }
        else if (o instanceof SslCertificate$DName) {
            e.getClass();
            final SslCertificate$DName sslCertificate$DName = (SslCertificate$DName)o;
            final f f25 = new f(o, 8);
            final Z4.c c25 = (Z4.c)e.E;
            if (!c25.d(sslCertificate$DName)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c25.b(sslCertificate$DName)), (F4.c)new B(f25, 6));
            }
        }
        else if (o instanceof SslCertificate) {
            e.getClass();
            final SslCertificate sslCertificate = (SslCertificate)o;
            final f f26 = new f(o, 9);
            final Z4.c c26 = (Z4.c)e.E;
            if (!c26.d(sslCertificate)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c26.b(sslCertificate)), (F4.c)new B(f26, 5));
            }
        }
        else if (o instanceof Certificate) {
            e.getClass();
            final Certificate certificate = (Certificate)o;
            final f f27 = new f(o, 10);
            final Z4.c c27 = (Z4.c)e.E;
            if (!c27.d(certificate)) {
                new Y0.h(e.D, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", e.c(), null).t(com.google.android.gms.internal.auth.h.t((Object)c27.b(certificate)), (F4.c)new b((Object)f27, 22));
            }
        }
        if (((Z4.c)e.E).d(o)) {
            ((ByteArrayOutputStream)t).write(128);
            final Z4.c c28 = (Z4.c)e.E;
            c28.f();
            final Long n4 = (Long)c28.b.get((Object)new Z4.b(o));
            if (n4 != null) {
                c28.d.put((Object)n4, o);
            }
            this.k(t, n4);
            return;
        }
        final String name = o.getClass().getName();
        final StringBuilder sb = new StringBuilder("Unsupported value: '");
        sb.append(o);
        sb.append("' of type '");
        sb.append(name);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }
}
