package F0;

import java.lang.reflect.AccessibleObject;
import G0.c;
import G0.f;
import G0.F;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.List;
import G0.e;
import java.util.Collection;
import java.util.ArrayList;
import android.webkit.ValueCallback;
import java.util.HashSet;
import G0.s;
import G0.u;
import G0.B;
import G0.C;
import android.content.pm.PackageManager$NameNotFoundException;
import C3.i;
import android.content.pm.PackageInfo;
import android.content.Context;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.os.Looper;
import C2.d0;
import android.os.Build$VERSION;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
import J5.a;
import G0.E;
import J5.b;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import G0.z;
import G0.o;
import java.util.Set;
import android.webkit.WebView;
import java.util.WeakHashMap;
import android.net.Uri;

public abstract class w
{
    public static final Uri a;
    public static final Uri b;
    public static final boolean c;
    public static final WeakHashMap d;
    
    static {
        a = Uri.parse("*");
        b = Uri.parse("");
        c = true;
        d = new WeakHashMap();
    }
    
    public static o a(final WebView webView, final String s, final Set set) {
        if (((c)z.K).b()) {
            return new o((ScriptHandlerBoundaryInterface)J5.b.i((Class)ScriptHandlerBoundaryInterface.class, f(webView).a.addDocumentStartJavaScript(s, (String[])set.toArray((Object[])new String[0]))));
        }
        throw z.a();
    }
    
    public static void b(final WebView webView, final String s, final Set set, final v v) {
        if (((c)z.J).b()) {
            f(webView).a.addWebMessageListener(s, (String[])set.toArray((Object[])new String[0]), (InvocationHandler)new a((FeatureFlagHolderBoundaryInterface)new E((Object)v, 4)));
            return;
        }
        throw z.a();
    }
    
    public static void c(WebView f) {
        if (Build$VERSION.SDK_INT >= 28) {
            f = (InvocationTargetException)d0.f((WebView)f);
            if (f == Looper.myLooper()) {
                return;
            }
            final StringBuilder sb = new StringBuilder("A WebView method was called on thread '");
            sb.append(Thread.currentThread().getName());
            sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
            sb.append((Object)f);
            sb.append(" called on ");
            sb.append((Object)Looper.myLooper());
            sb.append(", FYI main Looper is ");
            sb.append((Object)Looper.getMainLooper());
            sb.append(")");
            throw new RuntimeException(sb.toString());
        }
        try {
            final Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", (Class<?>[])null);
            ((AccessibleObject)declaredMethod).setAccessible(true);
            declaredMethod.invoke((Object)f, (Object[])null);
            return;
        }
        catch (final InvocationTargetException f) {}
        catch (final IllegalAccessException f) {}
        catch (final NoSuchMethodException ex) {}
        throw new RuntimeException((Throwable)f);
    }
    
    public static PackageInfo d(final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final PackageInfo packageInfo = null;
        PackageInfo packageInfo2;
        if (sdk_INT >= 26) {
            packageInfo2 = i.g();
        }
        else {
            try {
                packageInfo2 = e();
            }
            catch (final ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                packageInfo2 = null;
            }
        }
        if (packageInfo2 != null) {
            return packageInfo2;
        }
        try {
            final String s = (String)Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", (Class<?>[])null).invoke((Object)null, (Object[])null);
            PackageInfo packageInfo3;
            if (s == null) {
                packageInfo3 = packageInfo;
            }
            else {
                packageInfo3 = context.getPackageManager().getPackageInfo(s, 0);
            }
            return packageInfo3;
        }
        catch (final ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | PackageManager$NameNotFoundException ex2) {
            return packageInfo;
        }
    }
    
    public static PackageInfo e() {
        return (PackageInfo)Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", (Class<?>[])null).invoke((Object)null, (Object[])null);
    }
    
    public static C f(final WebView webView) {
        if (((c)z.R).b() && w.c) {
            final WeakHashMap d = w.d;
            C c;
            if ((c = (C)d.get((Object)webView)) == null) {
                c = new C(B.a.createWebView(webView));
                d.put((Object)webView, (Object)c);
            }
            return c;
        }
        return new C(B.a.createWebView(webView));
    }
    
    public static void g(final WebView webView, final n n, final Uri uri) {
        Uri b = uri;
        if (w.a.equals((Object)uri)) {
            b = w.b;
        }
        final G0.b x = z.x;
        x.getClass();
        final int d = n.d;
        if (d == 0) {
            webView.postWebMessage(u.b(n), b);
        }
        else {
            if (!((c)x).b() || (d != 0 && (d != 1 || !((c)z.u).b()))) {
                throw z.a();
            }
            c(webView);
            f(webView).a.postMessageToMainFrame((InvocationHandler)new a((FeatureFlagHolderBoundaryInterface)new s(n)), b);
        }
    }
    
    public static void h(final HashSet set, final ValueCallback valueCallback) {
        final G0.b f = z.f;
        final G0.b e = z.e;
        if (((c)f).b()) {
            B.a.getStatics().setSafeBrowsingAllowlist((Set)set, valueCallback);
            return;
        }
        final ArrayList list = new ArrayList((Collection)set);
        if (e.a()) {
            G0.e.i(list, valueCallback);
        }
        else {
            if (!((c)e).b()) {
                throw z.a();
            }
            B.a.getStatics().setSafeBrowsingWhitelist((List)list, valueCallback);
        }
    }
    
    public static void i(final InAppWebView inAppWebView, final InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient) {
        final G0.b d = z.D;
        final boolean a = d.a();
        final InvocationHandler invocationHandler = null;
        final F f = null;
        if (a) {
            F f2 = f;
            if (inAppWebViewRenderProcessClient != null) {
                f2 = new F(inAppWebViewRenderProcessClient);
            }
            G0.f.s(inAppWebView, f2);
        }
        else {
            if (!((c)d).b()) {
                throw z.a();
            }
            c((WebView)inAppWebView);
            final C f3 = f((WebView)inAppWebView);
            Object webViewRendererClient = invocationHandler;
            if (inAppWebViewRenderProcessClient != null) {
                webViewRendererClient = new a((FeatureFlagHolderBoundaryInterface)new E((Object)inAppWebViewRenderProcessClient, 0));
            }
            f3.a.setWebViewRendererClient((InvocationHandler)webViewRendererClient);
        }
    }
}
