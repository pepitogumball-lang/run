package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.os.BaseBundle;
import android.os.RemoteException;
import b.c;
import java.util.List;
import s.b;
import r.l;
import java.util.Iterator;
import android.os.Parcelable;
import java.util.Map$Entry;
import android.os.Bundle;
import java.util.Map;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;
import r.r;
import r.a;
import r.n;
import r.g;

public class CustomTabActivityHelper implements ServiceConnectionCallback
{
    private g mClient;
    private n mConnection;
    private ConnectionCallback mConnectionCallback;
    private a mCustomTabsCallback;
    private r mCustomTabsSession;
    
    public static boolean isAvailable(final Activity activity) {
        return CustomTabsHelper.getPackageNameToUse((Context)activity) != null;
    }
    
    public static void openCustomTab(final Activity activity, final Intent intent, final Uri data, final Map<String, String> map, final Uri uri, final int n) {
        intent.setData(data);
        if (map != null) {
            final Bundle bundle = new Bundle();
            for (final Map$Entry map$Entry : map.entrySet()) {
                ((BaseBundle)bundle).putString((String)map$Entry.getKey(), (String)map$Entry.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
        if (uri != null) {
            intent.putExtra("android.intent.extra.REFERRER", (Parcelable)uri);
        }
        activity.startActivityForResult(intent, n);
    }
    
    public static void openCustomTab(final Activity activity, final l l, final Uri uri, final Map<String, String> map, final Uri uri2, final int n) {
        openCustomTab(activity, l.a, uri, map, uri2, n);
    }
    
    public static void openTrustedWebActivity(final Activity activity, final b b, final Uri uri, final Map<String, String> map, final Uri uri2, final int n) {
        openCustomTab(activity, b.a, uri, map, uri2, n);
    }
    
    public boolean bindCustomTabsService(final Activity activity) {
        if (this.mClient != null) {
            return true;
        }
        final String packageNameToUse = CustomTabsHelper.getPackageNameToUse((Context)activity);
        if (packageNameToUse == null) {
            return false;
        }
        final ServiceConnection mConnection = new ServiceConnection(this);
        this.mConnection = mConnection;
        return g.a((Context)activity, packageNameToUse, (n)mConnection);
    }
    
    public r getSession() {
        final g mClient = this.mClient;
        if (mClient == null) {
            this.mCustomTabsSession = null;
        }
        else if (this.mCustomTabsSession == null) {
            this.mCustomTabsSession = mClient.c(this.mCustomTabsCallback);
        }
        return this.mCustomTabsSession;
    }
    
    public boolean mayLaunchUrl(final Uri uri, final Bundle bundle, final List<Bundle> list) {
        final g mClient = this.mClient;
        boolean z1 = false;
        if (mClient == null) {
            return false;
        }
        final r session = this.getSession();
        if (session == null) {
            return false;
        }
        final Bundle a = session.a(bundle);
        try {
            z1 = ((c)session.b).Z1(session.c, uri, a, (List)list);
            return z1;
        }
        catch (final RemoteException ex) {
            return z1;
        }
    }
    
    @Override
    public void onServiceConnected(final g mClient) {
        (this.mClient = mClient).getClass();
        while (true) {
            try {
                ((c)mClient.a).M4();
                final ConnectionCallback mConnectionCallback = this.mConnectionCallback;
                if (mConnectionCallback != null) {
                    mConnectionCallback.onCustomTabsConnected();
                }
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        final ConnectionCallback mConnectionCallback = this.mConnectionCallback;
        if (mConnectionCallback != null) {
            mConnectionCallback.onCustomTabsDisconnected();
        }
    }
    
    public void setConnectionCallback(final ConnectionCallback mConnectionCallback) {
        this.mConnectionCallback = mConnectionCallback;
    }
    
    public void setCustomTabsCallback(final a mCustomTabsCallback) {
        this.mCustomTabsCallback = mCustomTabsCallback;
    }
    
    public void unbindCustomTabsService(final Activity activity) {
        final n mConnection = this.mConnection;
        if (mConnection == null) {
            return;
        }
        ((Context)activity).unbindService((android.content.ServiceConnection)mConnection);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }
    
    public interface ConnectionCallback
    {
        void onCustomTabsConnected();
        
        void onCustomTabsDisconnected();
    }
}
