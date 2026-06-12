package Y4;

import android.app.Dialog;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.webkit.WebChromeClient$CustomViewCallback;
import com.google.android.gms.internal.ads.z7;
import F1.q;
import com.google.android.gms.internal.ads.D7;
import android.webkit.GeolocationPermissions$Callback;
import android.webkit.WebStorage$QuotaUpdater;
import android.webkit.WebViewClient;
import android.webkit.WebView$WebViewTransport;
import android.os.Message;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.measurement.L;
import android.webkit.ConsoleMessage;
import com.google.android.gms.ads.internal.overlay.zzm;
import android.app.AlertDialog$Builder;
import E1.a;
import com.google.android.gms.internal.ads.Be;
import com.google.android.gms.internal.ads.ve;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.wb;
import android.content.DialogInterface$OnClickListener;
import com.google.android.gms.internal.ads.am;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;
import I1.M;
import E1.o;
import J1.j;
import android.view.WindowManager$BadTokenException;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.app.Activity;
import com.google.android.gms.internal.ads.ye;
import android.content.Context;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;
import com.google.android.gms.internal.ads.Ge;
import android.view.KeyEvent$Callback;
import android.webkit.WebChromeClient;

public final class i extends WebChromeClient
{
    public final int a;
    public final KeyEvent$Callback b;
    
    public i(final Ge b) {
        this.a = 1;
        this.b = (KeyEvent$Callback)b;
    }
    
    public i(final WebViewActivity b) {
        this.a = 0;
        this.b = (KeyEvent$Callback)b;
    }
    
    public static final Context b(final WebView webView) {
        if (!(webView instanceof ye)) {
            return ((View)webView).getContext();
        }
        final ye ye = (ye)webView;
        final Activity e = ye.e();
        if (e != null) {
            return (Context)e;
        }
        return ye.getContext();
    }
    
    public boolean a(final Context context, final String s, final String title, final String s2, final String text, final JsResult jsResult, final JsPromptResult jsPromptResult, final boolean b) {
        final Ge ge = (Ge)this.b;
        Label_0106: {
            if (ge != null) {
                Label_0333: {
                    try {
                        final Be p8 = ge.C.P;
                        if (p8 != null) {
                            final a y = p8.Y;
                            if (y != null && y != null && !y.b()) {
                                final StringBuilder sb = new StringBuilder("window.");
                                sb.append(s);
                                sb.append("('");
                                sb.append(s2);
                                sb.append("')");
                                y.a(sb.toString());
                                return false;
                            }
                        }
                    }
                    catch (final WindowManager$BadTokenException ex) {
                        break Label_0333;
                    }
                    break Label_0106;
                }
                final WindowManager$BadTokenException ex;
                j.j("Fail to display Dialog.", (Throwable)ex);
                return true;
            }
        }
        final M c = o.B.c;
        final AlertDialog$Builder j = M.j(context);
        j.setTitle((CharSequence)title);
        if (b) {
            final LinearLayout view = new LinearLayout(context);
            view.setOrientation(1);
            final TextView textView = new TextView(context);
            textView.setText((CharSequence)s2);
            final EditText editText = new EditText(context);
            ((TextView)editText).setText((CharSequence)text);
            ((ViewGroup)view).addView((View)textView);
            ((ViewGroup)view).addView((View)editText);
            ((Dialog)j.setView((View)view).setPositiveButton(17039370, (DialogInterface$OnClickListener)new am((Object)jsPromptResult, 2, (Object)editText)).setNegativeButton(17039360, (DialogInterface$OnClickListener)new wb((Object)jsPromptResult, 1)).setOnCancelListener((DialogInterface$OnCancelListener)new ue((Object)jsPromptResult, 1)).create()).show();
        }
        else {
            ((Dialog)j.setMessage((CharSequence)s2).setPositiveButton(17039370, (DialogInterface$OnClickListener)new ve(jsResult, 1)).setNegativeButton(17039360, (DialogInterface$OnClickListener)new ve(jsResult, 0)).setOnCancelListener((DialogInterface$OnCancelListener)new ue((Object)jsResult, 0)).create()).show();
        }
        return true;
    }
    
    public void onCloseWindow(final WebView webView) {
        switch (this.a) {
            default: {
                super.onCloseWindow(webView);
                return;
            }
            case 1: {
                if (!(webView instanceof ye)) {
                    j.i("Tried to close a WebView that wasn't an AdWebView.");
                }
                else {
                    final zzm b0 = ((ye)webView).b0();
                    if (b0 == null) {
                        j.i("Tried to close an AdWebView not associated with an overlay.");
                    }
                    else {
                        b0.o();
                    }
                }
            }
        }
    }
    
    public boolean onConsoleMessage(final ConsoleMessage consoleMessage) {
        switch (this.a) {
            default: {
                return super.onConsoleMessage(consoleMessage);
            }
            case 1: {
                final String a = x.a.a(L.m("JS: ", consoleMessage.message(), " (", consoleMessage.sourceId(), ":"), consoleMessage.lineNumber(), ")");
                boolean b;
                if (a.contains((CharSequence)"Application Cache")) {
                    b = super.onConsoleMessage(consoleMessage);
                }
                else {
                    final int n = we.a[((Enum)consoleMessage.messageLevel()).ordinal()];
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3 && n != 4) {
                                if (n != 5) {
                                    j.h(a);
                                }
                                else {
                                    j.d(a);
                                }
                            }
                            else {
                                j.h(a);
                            }
                        }
                        else {
                            j.i(a);
                        }
                    }
                    else {
                        j.f(a);
                    }
                    b = super.onConsoleMessage(consoleMessage);
                }
                return b;
            }
        }
    }
    
    public final boolean onCreateWindow(WebView webView, final boolean b, final boolean b2, final Message message) {
        switch (this.a) {
            default: {
                final WebView$WebViewTransport webView$WebViewTransport = (WebView$WebViewTransport)message.obj;
                final WebView webView2 = new WebView(((View)webView).getContext());
                final Be p4 = ((Ge)this.b).C.P;
                if (p4 != null) {
                    webView2.setWebViewClient((WebViewClient)p4);
                }
                webView$WebViewTransport.setWebView(webView2);
                message.sendToTarget();
                return true;
            }
            case 0: {
                final h webViewClient = new h(this);
                webView = new WebView(((View)((WebViewActivity)this.b).E).getContext());
                webView.setWebViewClient((WebViewClient)webViewClient);
                ((WebView$WebViewTransport)message.obj).setWebView(webView);
                message.sendToTarget();
                return true;
            }
        }
    }
    
    public void onExceededDatabaseQuota(final String s, final String s2, final long n, long min, long n2, final WebStorage$QuotaUpdater webStorage$QuotaUpdater) {
        switch (this.a) {
            default: {
                super.onExceededDatabaseQuota(s, s2, n, min, n2, webStorage$QuotaUpdater);
                return;
            }
            case 1: {
                final long n3 = 5242880L - n2;
                if (n3 <= 0L) {
                    webStorage$QuotaUpdater.updateQuota(n);
                }
                else {
                    if (n == 0L) {
                        if (min > n3 || min > 1048576L) {
                            min = 0L;
                        }
                    }
                    else if (min == 0L) {
                        min = Math.min(Math.min(131072L, n3) + n, 1048576L);
                    }
                    else {
                        n2 = n;
                        if (min <= Math.min(1048576L - n, n3)) {
                            n2 = n + min;
                        }
                        min = n2;
                    }
                    webStorage$QuotaUpdater.updateQuota(min);
                }
            }
        }
    }
    
    public void onGeolocationPermissionsShowPrompt(final String s, final GeolocationPermissions$Callback geolocationPermissions$Callback) {
        switch (this.a) {
            default: {
                super.onGeolocationPermissionsShowPrompt(s, geolocationPermissions$Callback);
                return;
            }
            case 1: {
                if (geolocationPermissions$Callback != null) {
                    final M c = o.B.c;
                    final Ge ge = (Ge)this.b;
                    final boolean b = M.b(((View)ge).getContext(), "android.permission.ACCESS_FINE_LOCATION") || M.b(((View)ge).getContext(), "android.permission.ACCESS_COARSE_LOCATION");
                    final z7 pc = D7.Pc;
                    final q d = q.d;
                    if (d.c.a(pc)) {
                        geolocationPermissions$Callback.invoke(s, false, true);
                    }
                    else {
                        geolocationPermissions$Callback.invoke(s, b, true);
                    }
                    if (d.c.a(D7.Qc)) {
                        j.d("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                    }
                }
            }
        }
    }
    
    public void onHideCustomView() {
        switch (this.a) {
            default: {
                super.onHideCustomView();
                return;
            }
            case 1: {
                final zzm b0 = ((Ge)this.b).C.b0();
                if (b0 == null) {
                    j.i("Could not get ad overlay when hiding custom view.");
                }
                else {
                    b0.f();
                }
            }
        }
    }
    
    public boolean onJsAlert(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        switch (this.a) {
            default: {
                return super.onJsAlert(webView, s, s2, jsResult);
            }
            case 1: {
                return this.a(b(webView), "alert", s, s2, null, jsResult, null, false);
            }
        }
    }
    
    public boolean onJsBeforeUnload(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        switch (this.a) {
            default: {
                return super.onJsBeforeUnload(webView, s, s2, jsResult);
            }
            case 1: {
                return this.a(b(webView), "onBeforeUnload", s, s2, null, jsResult, null, false);
            }
        }
    }
    
    public boolean onJsConfirm(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        switch (this.a) {
            default: {
                return super.onJsConfirm(webView, s, s2, jsResult);
            }
            case 1: {
                return this.a(b(webView), "confirm", s, s2, null, jsResult, null, false);
            }
        }
    }
    
    public boolean onJsPrompt(final WebView webView, final String s, final String s2, final String s3, final JsPromptResult jsPromptResult) {
        switch (this.a) {
            default: {
                return super.onJsPrompt(webView, s, s2, s3, jsPromptResult);
            }
            case 1: {
                return this.a(b(webView), "prompt", s, s2, s3, null, jsPromptResult, true);
            }
        }
    }
    
    public void onShowCustomView(final View view, final int n, final WebChromeClient$CustomViewCallback j) {
        switch (this.a) {
            default: {
                super.onShowCustomView(view, n, j);
                return;
            }
            case 1: {
                final zzm b0 = ((Ge)this.b).C.b0();
                if (b0 == null) {
                    j.i("Could not get ad overlay when showing custom view.");
                    j.onCustomViewHidden();
                }
                else {
                    final Activity c = b0.C;
                    ((View)(b0.I = new FrameLayout((Context)c))).setBackgroundColor(-16777216);
                    ((ViewGroup)b0.I).addView(view, -1, -1);
                    c.setContentView((View)b0.I);
                    b0.S = true;
                    b0.J = j;
                    b0.H = true;
                    b0.n5(n);
                }
            }
        }
    }
    
    public void onShowCustomView(final View view, final WebChromeClient$CustomViewCallback webChromeClient$CustomViewCallback) {
        switch (this.a) {
            default: {
                super.onShowCustomView(view, webChromeClient$CustomViewCallback);
                return;
            }
            case 1: {
                this.onShowCustomView(view, -1, webChromeClient$CustomViewCallback);
            }
        }
    }
}
