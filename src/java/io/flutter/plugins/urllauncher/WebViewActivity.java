package io.flutter.plugins.urllauncher;

import android.os.BaseBundle;
import android.view.KeyEvent;
import java.util.Iterator;
import android.content.Intent;
import android.content.BroadcastReceiver;
import E.h;
import android.webkit.WebChromeClient;
import Y4.i;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import android.view.View;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.content.IntentFilter;
import android.webkit.WebView;
import Y4.g;
import I1.E;
import android.app.Activity;

public class WebViewActivity extends Activity
{
    public static final int G = 0;
    public final E C;
    public final g D;
    public WebView E;
    public final IntentFilter F;
    
    public WebViewActivity() {
        this.C = new E((Object)this, 5);
        this.D = (g)new WebViewClient();
        this.F = new IntentFilter("close action");
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView((View)(this.E = new WebView((Context)this)));
        final Intent intent = this.getIntent();
        final String stringExtra = intent.getStringExtra("url");
        final boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        final boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        final Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        Object emptyMap;
        if (bundleExtra == null) {
            emptyMap = Collections.emptyMap();
        }
        else {
            emptyMap = new HashMap();
            for (final String s : ((BaseBundle)bundleExtra).keySet()) {
                ((HashMap)emptyMap).put((Object)s, (Object)((BaseBundle)bundleExtra).getString(s));
            }
        }
        this.E.loadUrl(stringExtra, (Map)emptyMap);
        this.E.getSettings().setJavaScriptEnabled(booleanExtra);
        this.E.getSettings().setDomStorageEnabled(booleanExtra2);
        this.E.setWebViewClient((WebViewClient)this.D);
        this.E.getSettings().setSupportMultipleWindows(true);
        this.E.setWebChromeClient((WebChromeClient)new i(this));
        h.c((Context)this, (BroadcastReceiver)this.C, this.F);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        ((Context)this).unregisterReceiver((BroadcastReceiver)this.C);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.E.canGoBack()) {
            this.E.goBack();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
}
