package E1;

import android.content.Context;
import com.google.android.gms.internal.ads.W4;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import J1.e;
import F1.p;
import android.text.TextUtils;
import android.net.Uri;
import F1.u;
import android.os.RemoteException;
import J1.j;
import F1.p0;
import com.google.android.gms.internal.ads.E7;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzu;
import android.webkit.WebViewClient;

public final class k extends WebViewClient
{
    public final zzu a;
    
    public k(final zzu a) {
        this.a = a;
    }
    
    public final void onReceivedError(WebView a, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        a = (WebView)this.a;
        final u i = ((zzu)a).I;
        if (i != null) {
            try {
                i.t(E7.J(1, (String)null, (p0)null));
            }
            catch (final RemoteException ex) {
                j.k("#007 Could not call remote method.", (Exception)ex);
            }
        }
        final u j = ((zzu)a).I;
        if (j != null) {
            try {
                j.C(0);
            }
            catch (final RemoteException ex2) {
                J1.j.k("#007 Could not call remote method.", (Exception)ex2);
            }
        }
    }
    
    public final boolean shouldOverrideUrlLoading(WebView webView, String queryParameter) {
        final zzu a = this.a;
        final boolean startsWith = queryParameter.startsWith(a.q());
        final int n = 0;
        if (startsWith) {
            return false;
        }
        if (queryParameter.startsWith("gmsg://noAdLoaded")) {
            final u i = a.I;
            if (i != null) {
                try {
                    i.t(E7.J(3, (String)null, (p0)null));
                }
                catch (final RemoteException ex) {
                    j.k("#007 Could not call remote method.", (Exception)ex);
                }
            }
            final u j = a.I;
            if (j != null) {
                try {
                    j.C(3);
                }
                catch (final RemoteException ex2) {
                    J1.j.k("#007 Could not call remote method.", (Exception)ex2);
                }
            }
            a.n5(0);
            return true;
        }
        if (queryParameter.startsWith("gmsg://scriptLoadFailed")) {
            final u k = a.I;
            if (k != null) {
                try {
                    k.t(E7.J(1, (String)null, (p0)null));
                }
                catch (final RemoteException ex3) {
                    j.k("#007 Could not call remote method.", (Exception)ex3);
                }
            }
            final u l = a.I;
            if (l != null) {
                try {
                    l.C(0);
                }
                catch (final RemoteException ex4) {
                    j.k("#007 Could not call remote method.", (Exception)ex4);
                }
            }
            a.n5(0);
            return true;
        }
        final boolean startsWith2 = queryParameter.startsWith("gmsg://adResized");
        final Context f = a.F;
        Label_0273: {
            if (!startsWith2) {
                break Label_0273;
            }
            final u m = a.I;
            if (m != null) {
                try {
                    m.e();
                }
                catch (final RemoteException ex5) {
                    j.k("#007 Could not call remote method.", (Exception)ex5);
                }
            }
            queryParameter = Uri.parse(queryParameter).getQueryParameter("height");
        Block_24_Outer:
            while (true) {
                if (TextUtils.isEmpty((CharSequence)queryParameter)) {
                    final int o = n;
                    break Label_0265;
                }
                try {
                    final e a2 = p.f.a;
                    final int o = e.o(f, Integer.parseInt(queryParameter));
                    a.n5(o);
                    return true;
                Block_23_Outer:
                    while (true) {
                        while (true) {
                            final Intent intent = new Intent("android.intent.action.VIEW");
                            final String string;
                            intent.setData(Uri.parse(string));
                            f.startActivity(intent);
                            return true;
                            webView = (WebView)Uri.parse(queryParameter);
                            try {
                                webView = (WebView)a.J.a((Uri)webView, f, (View)null, (Activity)null);
                            }
                            catch (final W4 w4) {
                                j.j("Unable to process ad data", (Throwable)w4);
                            }
                            string = ((Uri)webView).toString();
                            continue Block_24_Outer;
                        }
                        Label_0320: {
                            while (true) {
                                try {
                                    final u i2;
                                    i2.r();
                                    a.I.i();
                                }
                                catch (final RemoteException ex6) {
                                    j.k("#007 Could not call remote method.", (Exception)ex6);
                                }
                                break Label_0320;
                                final u i2;
                                Label_0284: {
                                    i2 = a.I;
                                }
                                iftrue(Label_0320:)(i2 == null);
                                continue;
                            }
                            iftrue(Label_0284:)(!queryParameter.startsWith("gmsg://"));
                            return true;
                        }
                        String string = queryParameter;
                        iftrue(Label_0366:)(a.J == null);
                        continue Block_23_Outer;
                    }
                }
                catch (final NumberFormatException ex7) {
                    final int o = n;
                    continue;
                }
                break;
            }
        }
    }
}
