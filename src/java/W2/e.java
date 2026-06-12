package w2;

import java.util.AbstractMap;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import android.app.Activity;
import C.q;
import C.r;
import android.view.ViewGroup;
import android.os.BaseBundle;
import android.content.res.ColorStateList;
import L3.z;
import android.os.Parcel;
import android.content.ComponentName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import android.content.SharedPreferences$Editor;
import java.util.concurrent.ScheduledFuture;
import android.content.ClipDescription;
import java.util.Set;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import X4.M;
import androidx.lifecycle.V;
import androidx.lifecycle.m;
import android.content.ActivityNotFoundException;
import io.flutter.plugins.urllauncher.WebViewActivity;
import r.k;
import java.util.Locale;
import io.flutter.embedding.android.FlutterActivity;
import android.app.Notification;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import androidx.core.graphics.drawable.IconCompat;
import n3.u0;
import android.graphics.Bitmap;
import h2.A;
import android.os.SystemClock;
import android.graphics.Color;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.Intent;
import C.s;
import android.media.RingtoneManager;
import android.app.NotificationManager;
import android.os.Build$VERSION;
import android.content.pm.PackageManager$NameNotFoundException;
import O2.j;
import java.util.concurrent.ExecutorService;
import java.net.MalformedURLException;
import L3.u;
import java.net.URL;
import android.text.TextUtils;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.app.KeyguardManager;
import com.google.firebase.messaging.FirebaseMessagingService;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.internal.ads.o1;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.os.Looper;
import android.content.res.Resources$NotFoundException;
import android.util.TypedValue;
import android.graphics.Typeface;
import C2.g0;
import o.p;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import android.os.Bundle;
import java.util.Map;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.net.Uri;
import com.google.android.gms.internal.ads.O7;
import android.os.Handler;
import androidx.lifecycle.t;
import androidx.lifecycle.w;
import android.location.LocationManager;
import android.content.res.TypedArray;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import c4.o;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import c4.l;
import c4.c;
import c4.i;
import F4.v;
import android.util.Log;
import n5.h;
import K2.C;
import android.content.Context;
import F4.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;
import p1.b;
import O2.d;
import S.g;
import F4.n;
import C2.W;
import U1.a;

public final class e implements a, W, n, g, X4.g, d, b
{
    public static e G;
    public static e H;
    public final int C;
    public Object D;
    public Object E;
    public Object F;
    
    public e(final int c) {
        switch (this.C = c) {
            default: {
                this.D = new ConcurrentLinkedQueue();
                return;
            }
            case 11: {
                this.D = Collections.emptyList();
                this.E = Collections.emptyList();
                return;
            }
            case 8: {
                this.D = new AtomicBoolean(false);
            }
        }
    }
    
    public e(final f e, final Context d, final C f) {
        this.C = 13;
        h.e("messenger", (Object)e);
        h.e("context", (Object)d);
        this.E = e;
        this.D = d;
        this.F = f;
        try {
            X4.g.f.getClass();
            X4.f.b(e, (X4.g)this, "shared_preferences");
        }
        catch (final Exception ex) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", (Throwable)ex);
        }
    }
    
    public e(final f d, final String e) {
        this.C = 5;
        final v b = v.b;
        this.D = d;
        this.E = e;
        this.F = b;
    }
    
    public e(final X2.f f, final F3.e e, final i i, final c c, final Context context, final String s, final l l, final ScheduledExecutorService e2) {
        this.C = 16;
        final LinkedHashSet d = new LinkedHashSet();
        this.D = d;
        this.F = new o(f, e, i, c, context, s, d, l, e2);
        this.E = e2;
    }
    
    public e(final X4.C d) {
        this.C = 24;
        this.D = d;
        this.E = new E1.d(9);
        this.F = new ArrayList();
    }
    
    public e(final Context context, final int c) {
        switch (this.C = c) {
            default: {
                final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.E = singleThreadScheduledExecutor;
                this.F = Executors.newSingleThreadExecutor();
                this.D = context;
                singleThreadScheduledExecutor.scheduleAtFixedRate((Runnable)new g2.n((Object)this, 11), 0L, 86400L, TimeUnit.SECONDS);
                return;
            }
            case 14: {
                final E4.b e = new E4.b((Object)context, 19);
                this.D = context;
                this.E = e;
            }
        }
    }
    
    public e(final Context d, final J1.a a) {
        this.C = 10;
        this.D = d;
        this.E = d.getPackageName();
        this.F = a.C;
    }
    
    public e(final Context d, final TypedArray e) {
        this.C = 22;
        this.D = d;
        this.E = e;
    }
    
    public e(final Context d, final LocationManager e) {
        this.C = 20;
        this.F = new Object();
        this.D = d;
        this.E = e;
    }
    
    public e(final w w) {
        this.C = 15;
        this.D = new androidx.lifecycle.v((t)w);
        this.E = new Handler();
    }
    
    public e(final O7 e, final Context d, final Uri f) {
        this.C = 6;
        this.E = e;
        this.D = d;
        this.F = f;
    }
    
    public e(final String d) {
        this.C = 17;
        final Object o = new Object();
        this.E = o;
        this.F = o;
        this.D = d;
    }
    
    public e(final x.f f) {
        this.C = 26;
        this.D = new ArrayList();
        this.E = new Object();
        this.F = f;
    }
    
    public static e H(final Context context, final AttributeSet set, final int[] array, final int n) {
        return new e(context, context.obtainStyledAttributes(set, array, n, 0));
    }
    
    public static void M(final f f, final e e) {
        final Y4.c d = Y4.c.d;
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", (Object)d, (Object)null);
        if (e != null) {
            h.u((F4.b)new Y4.d(e, 0));
        }
        else {
            h.u((F4.b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", (Object)d, (Object)null);
        if (e != null) {
            h2.u((F4.b)new Y4.d(e, 1));
        }
        else {
            h2.u((F4.b)null);
        }
        final Y0.h h3 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", (Object)d, (Object)null);
        if (e != null) {
            h3.u((F4.b)new Y4.d(e, 2));
        }
        else {
            h3.u((F4.b)null);
        }
        final Y0.h h4 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", (Object)d, (Object)null);
        if (e != null) {
            h4.u((F4.b)new Y4.d(e, 3));
        }
        else {
            h4.u((F4.b)null);
        }
        final Y0.h h5 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", (Object)d, (Object)null);
        if (e != null) {
            h5.u((F4.b)new Y4.d(e, 4));
        }
        else {
            h5.u((F4.b)null);
        }
    }
    
    public static final SharedPreferences R(final Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }
    
    public static final void S(final Context context) {
        if (!R(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            final String value = String.valueOf((Object)context.getPackageName());
            String concat;
            if (value.length() != 0) {
                concat = "Failed to store app set ID last used time for App ".concat(value);
            }
            else {
                concat = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", concat);
            throw new Exception("Failed to store the app set ID last used time.");
        }
    }
    
    public static Bundle y(final Map map) {
        final Bundle bundle = new Bundle();
        for (final String s : map.keySet()) {
            ((BaseBundle)bundle).putString(s, (String)map.get((Object)s));
        }
        return bundle;
    }
    
    public Drawable A(final int n) {
        final TypedArray typedArray = (TypedArray)this.E;
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                return s2.a.f((Context)this.D, resourceId);
            }
        }
        return typedArray.getDrawable(n);
    }
    
    public Drawable B(int resourceId) {
        if (((TypedArray)this.E).hasValue(resourceId)) {
            resourceId = ((TypedArray)this.E).getResourceId(resourceId, 0);
            if (resourceId != 0) {
                final p a = p.a();
                final Context context = (Context)this.D;
                synchronized (a) {
                    return a.a.d(context, resourceId, true);
                }
            }
        }
        return null;
    }
    
    public Typeface C(int resourceId, final int n, g0 a) {
        resourceId = ((TypedArray)this.E).getResourceId(resourceId, 0);
        final g0 g0 = null;
        if (resourceId == 0) {
            return null;
        }
        if (this.F == null) {
            this.F = new TypedValue();
        }
        final TypedValue typedValue = (TypedValue)this.F;
        final ThreadLocal a2 = G.n.a;
        final Context context = (Context)this.D;
        if (context.isRestricted()) {
            a = g0;
        }
        else {
            final Resources resources = context.getResources();
            resources.getValue(resourceId, typedValue, true);
            final CharSequence string = typedValue.string;
            if (string == null) {
                final StringBuilder sb = new StringBuilder("Resource \"");
                sb.append(resources.getResourceName(resourceId));
                sb.append("\" (");
                sb.append(Integer.toHexString(resourceId));
                sb.append(") is not a Font: ");
                sb.append((Object)typedValue);
                throw new Resources$NotFoundException(sb.toString());
            }
            final String string2 = string.toString();
            if (!string2.startsWith("res/")) {
                a.a();
                a = g0;
            }
            else {
                final int assetCookie = typedValue.assetCookie;
                final o1 b = H.f.b;
                final Object o = b.c((Object)H.f.b(resources, resourceId, string2, assetCookie, n));
                if (o != null) {
                    new Handler(Looper.getMainLooper()).post((Runnable)new G.l((Object)a, 0, o));
                    a = (g0)o;
                }
                else {
                    Label_0433: {
                        Label_0416: {
                            Label_0396: {
                                Label_0296: {
                                    G.e e;
                                    try {
                                        if (!string2.toLowerCase().endsWith(".xml")) {
                                            break Label_0296;
                                        }
                                        e = G.b.e(resources.getXml(resourceId), resources);
                                        if (e == null) {
                                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                                            a.a();
                                            a = g0;
                                            return (Typeface)a;
                                        }
                                    }
                                    catch (final IOException ex) {
                                        break Label_0396;
                                    }
                                    catch (final XmlPullParserException ex2) {
                                        break Label_0416;
                                    }
                                    a = (g0)H.f.a(context, e, resources, resourceId, string2, typedValue.assetCookie, n, a);
                                    return (Typeface)a;
                                }
                                final int assetCookie2 = typedValue.assetCookie;
                                final Object k = H.f.a.k(context, resources, resourceId, string2, n);
                                if (k != null) {
                                    b.e((Object)H.f.b(resources, resourceId, string2, assetCookie2, n), k);
                                }
                                if (k != null) {
                                    new Handler(Looper.getMainLooper()).post((Runnable)new G.l((Object)a, 0, k));
                                }
                                else {
                                    a.a();
                                }
                                a = (g0)k;
                                return (Typeface)a;
                            }
                            final IOException ex;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string2), (Throwable)ex);
                            break Label_0433;
                        }
                        final XmlPullParserException ex2;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string2), (Throwable)ex2);
                    }
                    a.a();
                    a = null;
                }
            }
        }
        return (Typeface)a;
    }
    
    public View D(final int n) {
        return ((ViewGroup)((X4.C)this.D).D).getChildAt(n);
    }
    
    public int E() {
        return ((ViewGroup)((X4.C)this.D).D).getChildCount();
    }
    
    public boolean F() {
        if (((C2.b)this.E).n("gcm.n.noui")) {
            return true;
        }
        final FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService)this.D;
        if (!((KeyguardManager)((Context)firebaseMessagingService).getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            final int myPid = Process.myPid();
            final List runningAppProcesses = ((ActivityManager)((Context)firebaseMessagingService).getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                    if (activityManager$RunningAppProcessInfo.pid == myPid) {
                        if (activityManager$RunningAppProcessInfo.importance == 100) {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        final String v = ((C2.b)this.E).v("gcm.n.image");
        Object o = null;
        Label_0216: {
            Label_0147: {
                if (!TextUtils.isEmpty((CharSequence)v)) {
                    try {
                        o = new u(new URL(v));
                    }
                    catch (final MalformedURLException ex) {
                        final StringBuilder sb = new StringBuilder("Not downloading image, bad URL: ");
                        sb.append(v);
                        Log.w("FirebaseMessaging", sb.toString());
                        break Label_0147;
                    }
                    break Label_0216;
                }
            }
            o = null;
        }
        if (o != null) {
            final ExecutorService executorService = (ExecutorService)this.F;
            final j j = new j();
            ((u)o).D = executorService.submit((Runnable)new G.l(o, 2, (Object)j));
            ((u)o).E = j.a;
        }
        Object b;
        while (true) {
            final FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService)this.D;
            b = this.E;
            final AtomicInteger a = L3.e.a;
            final PackageManager packageManager = ((Context)firebaseMessagingService2).getPackageManager();
            final String packageName = ((Context)firebaseMessagingService2).getPackageName();
            while (true) {
                try {
                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                    if (applicationInfo != null) {
                        final Object d = applicationInfo.metaData;
                        if (d != null) {
                            break;
                        }
                    }
                }
                catch (final PackageManager$NameNotFoundException ex2) {
                    final StringBuilder sb2 = new StringBuilder("Couldn't get own application info: ");
                    sb2.append((Object)ex2);
                    Log.w("FirebaseMessaging", sb2.toString());
                }
                final Object d = Bundle.EMPTY;
                continue;
            }
        }
        String s = ((C2.b)b).v("gcm.n.android_channel_id");
        Label_0408: {
            if (Build$VERSION.SDK_INT >= 26) {
                break Label_0408;
            }
            while (true) {
                s = null;
                Label_0637: {
                    break Label_0637;
                    try {
                        final FirebaseMessagingService firebaseMessagingService2;
                        if (((Context)firebaseMessagingService2).getPackageManager().getApplicationInfo(((Context)firebaseMessagingService2).getPackageName(), 0).targetSdkVersion < 26) {
                            continue;
                        }
                        final NotificationManager notificationManager = (NotificationManager)((Context)firebaseMessagingService2).getSystemService((Class)NotificationManager.class);
                        if (!TextUtils.isEmpty((CharSequence)s)) {
                            if (C3.i.e(notificationManager, s) != null) {
                                break Label_0637;
                            }
                            final StringBuilder sb3 = new StringBuilder("Notification Channel requested (");
                            sb3.append(s);
                            sb3.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                            Log.w("FirebaseMessaging", sb3.toString());
                        }
                        Object d = null;
                        s = ((BaseBundle)d).getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty((CharSequence)s)) {
                            if (C3.i.e(notificationManager, s) != null) {
                                break Label_0637;
                            }
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        else {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        }
                        if (C3.i.A(notificationManager) == null) {
                            final int identifier = ((Context)firebaseMessagingService2).getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", ((Context)firebaseMessagingService2).getPackageName());
                            String string;
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            }
                            else {
                                string = ((Context)firebaseMessagingService2).getString(identifier);
                            }
                            C3.i.t(notificationManager, C3.i.f(string));
                        }
                        s = "fcm_fallback_notification_channel";
                        final String packageName2 = ((Context)firebaseMessagingService2).getPackageName();
                        final Resources resources = ((Context)firebaseMessagingService2).getResources();
                        final PackageManager packageManager2 = ((Context)firebaseMessagingService2).getPackageManager();
                        final C.t t = new C.t((Context)firebaseMessagingService2, s);
                        final String u = ((C2.b)b).u(resources, packageName2, "gcm.n.title");
                        if (!TextUtils.isEmpty((CharSequence)u)) {
                            t.e = C.t.b(u);
                        }
                        final String u2 = ((C2.b)b).u(resources, packageName2, "gcm.n.body");
                        if (!TextUtils.isEmpty((CharSequence)u2)) {
                            t.f = C.t.b(u2);
                            final Object o2 = new Object();
                            ((r)o2).D = C.t.b(u2);
                            t.e((C.u)o2);
                        }
                        final String v2 = ((C2.b)b).v("gcm.n.icon");
                        int icon = 0;
                        Label_0977: {
                            if (!TextUtils.isEmpty((CharSequence)v2)) {
                                icon = resources.getIdentifier(v2, "drawable", packageName2);
                                if (icon != 0 && L3.e.a(resources, icon)) {
                                    break Label_0977;
                                }
                                icon = resources.getIdentifier(v2, "mipmap", packageName2);
                                if (icon != 0 && L3.e.a(resources, icon)) {
                                    break Label_0977;
                                }
                                final StringBuilder sb4 = new StringBuilder("Icon resource ");
                                sb4.append(v2);
                                sb4.append(" not found. Notification will use default icon.");
                                Log.w("FirebaseMessaging", sb4.toString());
                            }
                            final int int1 = ((BaseBundle)d).getInt("com.google.firebase.messaging.default_notification_icon", 0);
                            Label_0954: {
                                if (int1 != 0) {
                                    icon = int1;
                                    if (L3.e.a(resources, int1)) {
                                        break Label_0954;
                                    }
                                }
                                try {
                                    icon = packageManager2.getApplicationInfo(packageName2, 0).icon;
                                }
                                catch (final PackageManager$NameNotFoundException ex3) {
                                    final StringBuilder sb5 = new StringBuilder("Couldn't get own application info: ");
                                    sb5.append((Object)ex3);
                                    Log.w("FirebaseMessaging", sb5.toString());
                                    icon = int1;
                                }
                            }
                            if (icon == 0 || !L3.e.a(resources, icon)) {
                                icon = 17301651;
                            }
                        }
                        t.s.icon = icon;
                        String s2;
                        if (TextUtils.isEmpty((CharSequence)(s2 = ((C2.b)b).v("gcm.n.sound2")))) {
                            s2 = ((C2.b)b).v("gcm.n.sound");
                        }
                        Uri sound;
                        if (TextUtils.isEmpty((CharSequence)s2)) {
                            sound = null;
                        }
                        else if (!"default".equals((Object)s2) && resources.getIdentifier(s2, "raw", packageName2) != 0) {
                            final StringBuilder sb6 = new StringBuilder("android.resource://");
                            sb6.append(packageName2);
                            sb6.append("/raw/");
                            sb6.append(s2);
                            sound = Uri.parse(sb6.toString());
                        }
                        else {
                            sound = RingtoneManager.getDefaultUri(2);
                        }
                        if (sound != null) {
                            final Notification s3 = t.s;
                            s3.sound = sound;
                            s3.audioStreamType = -1;
                            s3.audioAttributes = C.s.a(C.s.e(C.s.c(C.s.b(), 4), 5));
                        }
                        final String v3 = ((C2.b)b).v("gcm.n.click_action");
                        Intent intent;
                        if (!TextUtils.isEmpty((CharSequence)v3)) {
                            intent = new Intent(v3);
                            intent.setPackage(packageName2);
                            intent.setFlags(268435456);
                        }
                        else {
                            String s4;
                            if (TextUtils.isEmpty((CharSequence)(s4 = ((C2.b)b).v("gcm.n.link_android")))) {
                                s4 = ((C2.b)b).v("gcm.n.link");
                            }
                            Uri parse;
                            if (!TextUtils.isEmpty((CharSequence)s4)) {
                                parse = Uri.parse(s4);
                            }
                            else {
                                parse = null;
                            }
                            if (parse != null) {
                                final Intent intent2 = new Intent("android.intent.action.VIEW");
                                intent2.setPackage(packageName2);
                                intent2.setData(parse);
                                intent = intent2;
                            }
                            else {
                                final Intent launchIntentForPackage = packageManager2.getLaunchIntentForPackage(packageName2);
                                if ((intent = launchIntentForPackage) == null) {
                                    Log.w("FirebaseMessaging", "No activity found to launch app");
                                    intent = launchIntentForPackage;
                                }
                            }
                        }
                        final AtomicInteger a2 = L3.e.a;
                        PendingIntent activity;
                        if (intent == null) {
                            activity = null;
                        }
                        else {
                            intent.addFlags(67108864);
                            final Bundle bundle = (Bundle)((C2.b)b).D;
                            final Bundle bundle2 = new Bundle(bundle);
                            for (final String s5 : ((BaseBundle)bundle).keySet()) {
                                if (s5.startsWith("google.c.") || s5.startsWith("gcm.n.") || s5.startsWith("gcm.notification.")) {
                                    bundle2.remove(s5);
                                }
                            }
                            intent.putExtras(bundle2);
                            if (((C2.b)b).n("google.c.a.e")) {
                                intent.putExtra("gcm.n.analytics_data", ((C2.b)b).z());
                            }
                            activity = PendingIntent.getActivity((Context)firebaseMessagingService2, a2.incrementAndGet(), intent, 1140850688);
                        }
                        t.g = activity;
                        PendingIntent broadcast;
                        if (!((C2.b)b).n("google.c.a.e")) {
                            broadcast = null;
                        }
                        else {
                            broadcast = PendingIntent.getBroadcast((Context)firebaseMessagingService2, a2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(((Context)firebaseMessagingService2).getPackageName()).putExtra("wrapped_intent", (Parcelable)new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(((C2.b)b).z())), 1140850688);
                        }
                        if (broadcast != null) {
                            t.s.deleteIntent = broadcast;
                        }
                        final String v4 = ((C2.b)b).v("gcm.n.color");
                        Integer n = null;
                        Label_1722: {
                            if (!TextUtils.isEmpty((CharSequence)v4)) {
                                try {
                                    n = Color.parseColor(v4);
                                    break Label_1722;
                                }
                                catch (final IllegalArgumentException ex4) {
                                    final StringBuilder sb7 = new StringBuilder("Color is invalid: ");
                                    sb7.append(v4);
                                    sb7.append(". Notification will use default color.");
                                    Log.w("FirebaseMessaging", sb7.toString());
                                }
                            }
                            final int int2 = ((BaseBundle)d).getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (int2 != 0) {
                                try {
                                    n = E.b.a((Context)firebaseMessagingService2, int2);
                                    break Label_1722;
                                }
                                catch (final Resources$NotFoundException ex5) {
                                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                }
                            }
                            n = null;
                        }
                        if (n != null) {
                            t.o = n;
                        }
                        t.c(((C2.b)b).n("gcm.n.sticky") ^ true);
                        t.m = ((C2.b)b).n("gcm.n.local_only");
                        final String v5 = ((C2.b)b).v("gcm.n.ticker");
                        if (v5 != null) {
                            t.s.tickerText = C.t.b(v5);
                        }
                        d = ((C2.b)b).o("gcm.n.notification_priority");
                        Object o3 = null;
                        Label_1881: {
                            if (d != null) {
                                if ((int)d >= -2) {
                                    o3 = d;
                                    if ((int)d <= 2) {
                                        break Label_1881;
                                    }
                                }
                                final StringBuilder sb8 = new StringBuilder("notificationPriority is invalid ");
                                sb8.append(d);
                                sb8.append(". Skipping setting notificationPriority.");
                                Log.w("FirebaseMessaging", sb8.toString());
                            }
                            o3 = null;
                        }
                        if (o3 != null) {
                            t.j = (int)o3;
                        }
                        d = ((C2.b)b).o("gcm.n.visibility");
                        Object o4 = null;
                        Label_1983: {
                            if (d != null) {
                                if ((int)d >= -1) {
                                    o4 = d;
                                    if ((int)d <= 1) {
                                        break Label_1983;
                                    }
                                }
                                final StringBuilder sb9 = new StringBuilder("visibility is invalid: ");
                                sb9.append(d);
                                sb9.append(". Skipping setting visibility.");
                                Log.w("NotificationParams", sb9.toString());
                            }
                            o4 = null;
                        }
                        if (o4 != null) {
                            t.p = (int)o4;
                        }
                        d = ((C2.b)b).o("gcm.n.notification_count");
                        Object o5 = null;
                        Label_2075: {
                            if (d != null) {
                                o5 = d;
                                if ((int)d >= 0) {
                                    break Label_2075;
                                }
                                final StringBuilder sb10 = new StringBuilder("notificationCount is invalid: ");
                                sb10.append(d);
                                sb10.append(". Skipping setting notificationCount.");
                                Log.w("FirebaseMessaging", sb10.toString());
                            }
                            o5 = null;
                        }
                        if (o5 != null) {
                            t.i = (int)o5;
                        }
                        final Long t2 = ((C2.b)b).t();
                        if (t2 != null) {
                            t.k = true;
                            t.s.when = t2;
                        }
                        final long[] w = ((C2.b)b).w();
                        if (w != null) {
                            t.s.vibrate = w;
                        }
                        final int[] q = ((C2.b)b).q();
                        if (q != null) {
                            final int ledARGB = q[0];
                            final int ledOnMS = q[1];
                            final int ledOffMS = q[2];
                            final Notification s6 = t.s;
                            s6.ledARGB = ledARGB;
                            s6.ledOnMS = ledOnMS;
                            s6.ledOffMS = ledOffMS;
                            s6.flags = (((ledOnMS != 0 && ledOffMS != 0) ? 1 : 0) | (0xFFFFFFFE & s6.flags));
                        }
                        int n2;
                        final boolean b2 = (n2 = (((C2.b)b).n("gcm.n.default_sound") ? 1 : 0)) != 0;
                        if (((C2.b)b).n("gcm.n.default_vibrate_timings")) {
                            n2 = ((b2 ? 1 : 0) | 0x2);
                        }
                        if (((C2.b)b).n("gcm.n.default_light_settings")) {
                            n2 |= 0x4;
                        }
                        final Notification s7 = t.s;
                        s7.defaults = n2;
                        if ((n2 & 0x4) != 0x0) {
                            s7.flags |= 0x1;
                        }
                        String s8 = ((C2.b)b).v("gcm.n.tag");
                        if (TextUtils.isEmpty((CharSequence)s8)) {
                            final StringBuilder sb11 = new StringBuilder("FCM-Notification:");
                            sb11.append(SystemClock.uptimeMillis());
                            s8 = sb11.toString();
                        }
                        Label_2553: {
                            if (o != null) {
                                try {
                                    d = ((u)o).E;
                                    A.h(d);
                                    b = u0.d((O2.t)d, 5L, TimeUnit.SECONDS);
                                    t.d((Bitmap)b);
                                    final Object o6 = new Object();
                                    if (b == null) {
                                        d = null;
                                    }
                                    else {
                                        d = new IconCompat(1);
                                        ((IconCompat)d).b = b;
                                    }
                                    ((q)o6).D = (IconCompat)d;
                                    ((q)o6).E = null;
                                    ((q)o6).F = true;
                                    t.e((C.u)o6);
                                    break Label_2553;
                                }
                                catch (final ExecutionException o) {}
                                catch (final TimeoutException d) {
                                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                    ((u)o).close();
                                    break Label_2553;
                                }
                                catch (final InterruptedException d) {
                                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                    ((u)o).close();
                                    Thread.currentThread().interrupt();
                                    break Label_2553;
                                }
                                d = new StringBuilder("Failed to download image: ");
                                ((StringBuilder)d).append((Object)((Throwable)o).getCause());
                                Log.w("FirebaseMessaging", ((StringBuilder)d).toString());
                            }
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Showing notification");
                        }
                        ((NotificationManager)((Context)this.D).getSystemService("notification")).notify(s8, 0, t.a());
                        return true;
                    }
                    catch (final PackageManager$NameNotFoundException ex6) {
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public boolean G(int g, final A.f f, final x.e e) {
        final int[] o0 = e.o0;
        final int a = o0[0];
        final y.b b = (y.b)this.E;
        b.a = a;
        boolean e2 = true;
        b.b = o0[1];
        b.c = e.o();
        b.d = e.i();
        b.i = false;
        b.j = g;
        if (b.a == 3) {
            g = 1;
        }
        else {
            g = 0;
        }
        final boolean b2 = b.b == 3;
        if (g != 0 && e.V > 0.0f) {
            g = 1;
        }
        else {
            g = 0;
        }
        final boolean b3 = b2 && e.V > 0.0f;
        final int[] t = e.t;
        if (g != 0 && t[0] == 4) {
            b.a = 1;
        }
        if (b3 && t[1] == 4) {
            b.b = 1;
        }
        f.b(e, b);
        e.K(b.e);
        e.H(b.f);
        e.E = b.h;
        g = b.g;
        if ((e.Z = g) <= 0) {
            e2 = false;
        }
        e.E = e2;
        b.j = 0;
        return b.i;
    }
    
    public Boolean I(String putExtra, final Boolean b, final Y4.e e, final Y4.a a) {
        Label_0428: {
            if (this.F == null) {
                break Label_0428;
            }
            final Bundle y = y(e.c);
        Label_0334:
            while (true) {
                if (!b) {
                    break Label_0334;
                }
                final Iterator iterator = e.c.keySet().iterator();
                while (iterator.hasNext()) {
                    final String lowerCase = ((String)iterator.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    int n = -1;
                    switch (lowerCase.hashCode()) {
                        case 802785917: {
                            if (!lowerCase.equals((Object)"accept-language")) {
                                break;
                            }
                            n = 3;
                            break;
                        }
                        case 785670158: {
                            if (!lowerCase.equals((Object)"content-type")) {
                                break;
                            }
                            n = 2;
                            break;
                        }
                        case -1229727188: {
                            if (!lowerCase.equals((Object)"content-language")) {
                                break;
                            }
                            n = 1;
                            break;
                        }
                        case -1423461112: {
                            if (!lowerCase.equals((Object)"accept")) {
                                break;
                            }
                            n = 0;
                            break;
                        }
                    }
                    switch (n) {
                        case 0:
                        case 1:
                        case 2:
                        case 3: {
                            continue;
                        }
                        default: {
                            break Label_0334;
                        }
                    }
                }
                final Uri parse = Uri.parse((String)putExtra);
                final FlutterActivity flutterActivity = (FlutterActivity)this.F;
                final k k = new k();
                k.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", (int)(((boolean)a.a) ? 1 : 0));
                final r.l a2 = k.a();
                final Intent a3 = a2.a;
                a3.putExtra("com.android.browser.headers", y);
                try {
                    a3.setData(parse);
                    ((Context)flutterActivity).startActivity(a3, a2.b);
                    return Boolean.TRUE;
                    final FlutterActivity flutterActivity2 = (FlutterActivity)this.F;
                    final boolean booleanValue = e.a;
                    final boolean booleanValue2 = e.b;
                    final int g = WebViewActivity.G;
                    putExtra = (ActivityNotFoundException)new Intent((Context)flutterActivity2, (Class)WebViewActivity.class).putExtra("url", (String)putExtra).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", y);
                    try {
                        ((Activity)this.F).startActivity((Intent)putExtra);
                        return Boolean.TRUE;
                    }
                    catch (final ActivityNotFoundException putExtra) {
                        return Boolean.FALSE;
                    }
                    throw new Y4.b();
                }
                catch (final ActivityNotFoundException ex) {
                    continue Label_0334;
                }
                break;
            }
        }
    }
    
    public void J(final m m) {
        final V v = (V)this.F;
        if (v != null) {
            v.run();
        }
        final V f = new V((androidx.lifecycle.v)this.D, m);
        this.F = f;
        ((Handler)this.E).postAtFrontOfQueue((Runnable)f);
    }
    
    public void K() {
        ((TypedArray)this.E).recycle();
    }
    
    public void L(final F4.h h) {
        Object o;
        if (h == null) {
            o = null;
        }
        else {
            o = new c2.k(this, h);
        }
        ((f)this.D).f((String)this.E, (F4.d)o);
    }
    
    public void N(x.f f, final int s0, final int n, final int n2) {
        final int a0 = f.a0;
        final int b0 = f.b0;
        f.a0 = 0;
        f.b0 = 0;
        f.K(n);
        f.H(n2);
        if (a0 < 0) {
            f.a0 = 0;
        }
        else {
            f.a0 = a0;
        }
        if (b0 < 0) {
            f.b0 = 0;
        }
        else {
            f.b0 = b0;
        }
        f = (x.f)this.F;
        f.s0 = s0;
        f.Q();
    }
    
    public void O(final long n, final a4.c c) {
        if (this.F != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        final z4.d d = (z4.d)c2.k.t().D;
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post((Runnable)new O4.a(this, d, handler, c, n));
    }
    
    public void P(final x.f f) {
        final ArrayList list = (ArrayList)this.D;
        list.clear();
        for (int size = f.p0.size(), i = 0; i < size; ++i) {
            final x.e e = (x.e)f.p0.get(i);
            final int[] o0 = e.o0;
            if (o0[0] == 3 || o0[1] == 3) {
                list.add((Object)e);
            }
        }
        f.r0.a = true;
    }
    
    public e Q() {
        return new e(((C2.V)this.D).a(), ((c2.k)this.E).I(), ((C2.V)this.F).a(), 3);
    }
    
    public Double b(final String s, final X4.h h) {
        final SharedPreferences w = this.w(h);
        Double n;
        if (w.contains(s)) {
            final Object c = M.c((Object)w.getString(s, ""), (C)this.F);
            h.c("null cannot be cast to non-null type kotlin.Double", c);
            n = (Double)c;
        }
        else {
            n = null;
        }
        return n;
    }
    
    public O2.t c() {
        final j j = new j();
        ((Executor)this.F).execute((Runnable)new j0.c(3, (Object)this, (Object)j, false));
        return j.a;
    }
    
    public List d(final List list, final X4.h h) {
        final Map all = this.w(h).getAll();
        h.d("getAll(...)", (Object)all);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map$Entry map$Entry : all.entrySet()) {
            final Object key = map$Entry.getKey();
            h.d("<get-key>(...)", key);
            final String s = (String)key;
            final Object value = map$Entry.getValue();
            Set n;
            if (list != null) {
                n = d5.d.N((Iterable)list);
            }
            else {
                n = null;
            }
            if (M.b(s, value, n)) {
                ((Map)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
            }
        }
        return d5.d.L((Iterable)linkedHashMap.keySet());
    }
    
    public void e(final String s, final String s2, final X4.h h) {
        this.w(h).edit().putString(s, s2).apply();
    }
    
    public Object f() {
        return null;
    }
    
    public Uri g() {
        return (Uri)this.D;
    }
    
    public Object get() {
        switch (this.C) {
            default: {
                return new t1.c((Context)((X4.C)this.D).D, (u1.d)((b5.a)this.E).get(), (t1.a)((c0.f)this.F).get());
            }
            case 21: {
                return new n1.p((w1.a)new c0.f(22), (w1.a)new Object(), (s1.b)((F1.n)this.D).get(), (t1.h)((q3.c)this.E).get(), (t1.i)((Y0.h)this.F).get());
            }
        }
    }
    
    public ClipDescription getDescription() {
        return (ClipDescription)this.E;
    }
    
    public Boolean h(final String s, final X4.h h) {
        final SharedPreferences w = this.w(h);
        Boolean value;
        if (w.contains(s)) {
            value = w.getBoolean(s, true);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public void i(final String s, final boolean b, final X4.h h) {
        this.w(h).edit().putBoolean(s, b).apply();
    }
    
    public String j(String string, final X4.h h) {
        final SharedPreferences w = this.w(h);
        if (w.contains(string)) {
            string = w.getString(string, "");
        }
        else {
            string = null;
        }
        return string;
    }
    
    public void k() {
    }
    
    public void l(final O2.i i) {
        final d2.b b = (d2.b)this.D;
        final String s = (String)this.E;
        final ScheduledFuture scheduledFuture = (ScheduledFuture)this.F;
        final t.j a = b.a;
        synchronized (a) {
            b.a.remove((Object)s);
            monitorexit(a);
            ((Future)scheduledFuture).cancel(false);
        }
    }
    
    public Long m(final String s, final X4.h h) {
        final SharedPreferences w = this.w(h);
        Long value;
        if (w.contains(s)) {
            value = w.getLong(s, 0L);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public Uri n() {
        return (Uri)this.F;
    }
    
    public void o(final String s, final double n, final X4.h h) {
        final SharedPreferences$Editor edit = this.w(h).edit();
        final StringBuilder sb = new StringBuilder("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu");
        sb.append(n);
        edit.putString(s, sb.toString()).apply();
    }
    
    public void onMethodCall(final F4.m m, final F4.o o) {
        if (m.a.equals((Object)"MessagingBackground#initialized")) {
            ((AtomicBoolean)this.D).set(true);
            final List j = FlutterFirebaseMessagingBackgroundService.J;
            Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
            final List i = FlutterFirebaseMessagingBackgroundService.J;
            final List list;
            monitorenter(list = i);
            Label_0091: {
                try {
                    final Iterator iterator = i.iterator();
                    while (iterator.hasNext()) {
                        FlutterFirebaseMessagingBackgroundService.K.x((Intent)iterator.next(), null);
                    }
                    break Label_0091;
                }
                finally {
                    monitorexit(list);
                    FlutterFirebaseMessagingBackgroundService.J.clear();
                    monitorexit(list);
                    ((E4.j)o).success((Object)Boolean.TRUE);
                    return;
                }
            }
        }
        ((E4.j)o).notImplemented();
    }
    
    public void p(final String s, final List list, final X4.h h) {
        this.w(h).edit().putString(s, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((C)this.F).c(list))).apply();
    }
    
    public ArrayList q(final String s, final X4.h h) {
        final SharedPreferences w = this.w(h);
        final boolean contains = w.contains(s);
        ArrayList list = null;
        if (contains) {
            final List list2 = (List)M.c((Object)w.getString(s, ""), (C)this.F);
            list = list;
            if (list2 != null) {
                final Iterable iterable = (Iterable)list2;
                final ArrayList list3 = new ArrayList();
                final Iterator iterator = iterable.iterator();
                while (true) {
                    list = list3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final Object next = iterator.next();
                    if (!(next instanceof String)) {
                        continue;
                    }
                    list3.add(next);
                }
            }
        }
        return list;
    }
    
    public void r(final List list, final X4.h h) {
        final SharedPreferences w = this.w(h);
        final SharedPreferences$Editor edit = w.edit();
        h.d("edit(...)", (Object)edit);
        final Map all = w.getAll();
        h.d("getAll(...)", (Object)all);
        final ArrayList list2 = new ArrayList();
        for (final String s : all.keySet()) {
            final Object value = all.get((Object)s);
            Set n;
            if (list != null) {
                n = d5.d.N((Iterable)list);
            }
            else {
                n = null;
            }
            if (M.b(s, value, n)) {
                list2.add((Object)s);
            }
        }
        final Iterator iterator2 = list2.iterator();
        h.d("iterator(...)", (Object)iterator2);
        while (iterator2.hasNext()) {
            final Object next = iterator2.next();
            h.d("next(...)", next);
            edit.remove((String)next);
        }
        edit.apply();
    }
    
    public Map s(final List list, final X4.h h) {
        final Map all = this.w(h).getAll();
        h.d("getAll(...)", (Object)all);
        final HashMap hashMap = new HashMap();
        for (final Map$Entry map$Entry : all.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            Set n;
            if (list != null) {
                n = d5.d.N((Iterable)list);
            }
            else {
                n = null;
            }
            if (M.b(s, value, n)) {
                final Object value2 = map$Entry.getValue();
                if (value2 == null) {
                    continue;
                }
                final Object key = map$Entry.getKey();
                final Object c = M.c(value2, (C)this.F);
                h.c("null cannot be cast to non-null type kotlin.Any", c);
                hashMap.put(key, c);
            }
        }
        return (Map)hashMap;
    }
    
    public void t(final String s, final long n, final X4.h h) {
        this.w(h).edit().putLong(s, n).apply();
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 24: {
                final StringBuilder sb = new StringBuilder();
                sb.append(((E1.d)this.E).toString());
                sb.append(", hidden list:");
                sb.append(((ArrayList)this.F).size());
                return sb.toString();
            }
            case 17: {
                final StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String)this.D);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.k k = ((com.google.android.gms.internal.play_billing.k)this.E).b;
                String s = "";
                while (k != null) {
                    final Object a = k.a;
                    sb2.append(s);
                    if (a != null && a.getClass().isArray()) {
                        final String deepToString = Arrays.deepToString(new Object[] { a });
                        sb2.append((CharSequence)deepToString, 1, deepToString.length() - 1);
                    }
                    else {
                        sb2.append(a);
                    }
                    k = k.b;
                    s = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            }
        }
    }
    
    public void u() {
        synchronized (this) {
            if (!((Set)this.D).isEmpty()) {
                ((o)this.F).e(0L);
            }
        }
    }
    
    public Boolean v(String shortString) {
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(shortString));
        final ComponentName resolveActivity = intent.resolveActivity(((Context)((E4.b)this.E).D).getPackageManager());
        if (resolveActivity == null) {
            shortString = null;
        }
        else {
            shortString = resolveActivity.toShortString();
        }
        if (shortString == null) {
            return Boolean.FALSE;
        }
        return "{com.android.fallback/com.android.fallback.Fallback}".equals((Object)shortString) ^ true;
    }
    
    public SharedPreferences w(final X4.h h) {
        final String a = h.a;
        final Context context = (Context)this.D;
        SharedPreferences sharedPreferences;
        if (a == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append("_preferences");
            sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
            h.b((Object)sharedPreferences);
        }
        else {
            sharedPreferences = context.getSharedPreferences(a, 0);
            h.b((Object)sharedPreferences);
        }
        return sharedPreferences;
    }
    
    public void x(Intent obtain, final CountDownLatch countDownLatch) {
        if (this.F == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        Object o;
        if (countDownLatch != null) {
            o = new O4.b(countDownLatch);
        }
        else {
            o = null;
        }
        final byte[] byteArrayExtra = obtain.getByteArrayExtra("notification");
        if (byteArrayExtra != null) {
            obtain = (Intent)Parcel.obtain();
            try {
                ((Parcel)obtain).unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                ((Parcel)obtain).setDataPosition(0);
                final HashMap v = u2.f.v((z)z.CREATOR.createFromParcel((Parcel)obtain));
                final F4.p p2 = (F4.p)this.E;
                final HashMap hashMap = new HashMap();
                ((AbstractMap)hashMap).put((Object)"userCallbackHandle", (Object)s2.a.c.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L));
                ((AbstractMap)hashMap).put((Object)"message", (Object)v);
                p2.a("MessagingBackground#onMessage", (Object)hashMap, (F4.o)o);
                return;
            }
            finally {
                ((Parcel)obtain).recycle();
            }
        }
        Log.e("FLTFireBGExecutor", "RemoteMessage byte array not found in Intent.");
    }
    
    public ColorStateList z(final int n) {
        final TypedArray typedArray = (TypedArray)this.E;
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList e = s2.a.e((Context)this.D, resourceId);
                if (e != null) {
                    return e;
                }
            }
        }
        return typedArray.getColorStateList(n);
    }
}
