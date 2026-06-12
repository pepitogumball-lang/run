package f2;

import java.util.AbstractCollection;
import u0.l;
import java.util.List;
import android.os.BaseBundle;
import v.e;
import O2.t;
import android.view.MotionEvent;
import v4.u;
import h2.N;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import v0.a;
import java.util.TreeMap;
import java.util.ArrayList;
import k3.v;
import z0.b;
import java.util.Locale;
import android.os.Bundle;
import java.util.Iterator;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.util.Map;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.gms.internal.ads.g2;
import java.io.IOException;
import q3.c;
import android.view.View;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import io.flutter.view.g;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.util.Log;
import t0.H;
import c0.f;
import io.flutter.view.FlutterCallbackInformation;
import android.content.res.AssetManager;
import android.content.res.Resources;
import h2.A;
import android.content.Context;
import java.util.Objects;
import android.app.AlertDialog;
import O2.p;
import java.util.PriorityQueue;
import android.util.LongSparseArray;
import O2.h;
import io.flutter.plugin.platform.k;

public final class d implements k, h
{
    public static d F;
    public final int C;
    public Object D;
    public Object E;
    
    public d() {
        this.C = 13;
        this.D = new LongSparseArray();
        this.E = new PriorityQueue();
    }
    
    public d(final p e, final AlertDialog d) {
        this.C = 1;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public d(final Context d, final int c) {
        switch (this.C = c) {
            default: {
                A.h((Object)d);
                final Resources resources = d.getResources();
                this.D = resources;
                this.E = resources.getResourcePackageName(2131689521);
                return;
            }
            case 8: {
                this.E = null;
                this.D = d;
            }
        }
    }
    
    public d(final AssetManager assetManager, final String e, final FlutterCallbackInformation d) {
        this.C = 14;
        this.E = e;
        this.D = d;
    }
    
    public d(final String e, final com.google.android.gms.internal.auth.h d, final f f) {
        this.C = 0;
        this.E = e;
        this.D = d;
    }
    
    public d(final H d) {
        this.C = 10;
        this.D = d;
        final Object e = new Object();
        ((g2)e).a = 0;
        this.E = e;
    }
    
    public d(final v.d e) {
        this.C = 12;
        this.E = e;
    }
    
    public static void f(final String s) {
        if (!s.equalsIgnoreCase(":memory:")) {
            if (s.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(s));
                try {
                    SQLiteDatabase.deleteDatabase(new File(s));
                }
                catch (final Exception ex) {
                    Log.w("SupportSQLite", "delete failed: ", (Throwable)ex);
                }
            }
        }
    }
    
    @Override
    public void a(final g g) {
        ((r)this.D).K.a = g;
        ((q)this.E).J.a = g;
    }
    
    @Override
    public boolean b(final int n) {
        final q q = (q)this.E;
        boolean b;
        if (q.c(n) != null) {
            q.getClass();
            b = false;
        }
        else {
            b = ((r)this.D).b(n);
        }
        return b;
    }
    
    @Override
    public View c(final int n) {
        final q q = (q)this.E;
        View view;
        if (q.c(n) != null) {
            view = q.c(n);
        }
        else {
            view = ((r)this.D).c(n);
        }
        return view;
    }
    
    @Override
    public void d() {
        ((r)this.D).d();
        ((q)this.E).d();
    }
    
    public void e() {
        final String s = (String)this.E;
        try {
            final c c = (c)this.D;
            c.getClass();
            new File((File)c.F, s).createNewFile();
        }
        catch (final IOException ex) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(s), (Throwable)ex);
        }
    }
    
    public View g(int i, final int n, final int a, final int a2) {
        final H h = (H)this.D;
        final int p4 = h.p();
        final int d = h.d();
        int n2;
        if (n > i) {
            n2 = 1;
        }
        else {
            n2 = -1;
        }
        View view = null;
        while (i != n) {
            final View n3 = h.n(i);
            final int g = h.g(n3);
            final int q = h.q(n3);
            final g2 g2 = (g2)this.E;
            g2.b = p4;
            g2.c = d;
            g2.d = g;
            g2.e = q;
            if (a != 0) {
                g2.a = a;
                if (g2.a()) {
                    return n3;
                }
            }
            View view2 = view;
            if (a2 != 0) {
                g2.a = a2;
                view2 = view;
                if (g2.a()) {
                    view2 = n3;
                }
            }
            i += n2;
            view = view2;
        }
        return view;
    }
    
    public CctBackendFactory h(String className) {
        if (this.E == null) {
            final Context context = (Context)this.D;
            Object metaData = null;
            Label_0110: {
                while (true) {
                    try {
                        final PackageManager packageManager = context.getPackageManager();
                        if (packageManager == null) {
                            Log.w("BackendRegistry", "Context has no PackageManager.");
                        }
                        else {
                            final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class)TransportBackendDiscovery.class), 128);
                            if (serviceInfo != null) {
                                metaData = serviceInfo.metaData;
                                break Label_0110;
                            }
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        }
                        metaData = null;
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        Log.w("BackendRegistry", "Application info not found.");
                        continue;
                    }
                    break;
                }
            }
            Object emptyMap;
            if (metaData == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                emptyMap = Collections.emptyMap();
            }
            else {
                final HashMap hashMap = new HashMap();
                for (final String s : ((BaseBundle)metaData).keySet()) {
                    final Object value = ((BaseBundle)metaData).get(s);
                    if (value instanceof String && s.startsWith("backend:")) {
                        final String[] split = ((String)value).split(",", -1);
                        for (int length = split.length, i = 0; i < length; ++i) {
                            final String trim = split[i].trim();
                            if (!trim.isEmpty()) {
                                hashMap.put((Object)trim, (Object)s.substring(8));
                            }
                        }
                    }
                }
                emptyMap = hashMap;
            }
            this.E = emptyMap;
        }
        className = (String)((Map)this.E).get((Object)className);
        if (className == null) {
            return null;
        }
        Label_0476: {
            Label_0432: {
                Label_0388: {
                    Label_0370: {
                        try {
                            return (CctBackendFactory)Class.forName(className).asSubclass(CctBackendFactory.class).getDeclaredConstructor((Class<?>[])null).newInstance((Object[])null);
                        }
                        catch (final InvocationTargetException ex2) {}
                        catch (final NoSuchMethodException ex3) {
                            break Label_0370;
                        }
                        catch (final InstantiationException ex4) {
                            break Label_0388;
                        }
                        catch (final IllegalAccessException ex5) {
                            break Label_0432;
                        }
                        catch (final ClassNotFoundException ex6) {
                            break Label_0476;
                        }
                        final InvocationTargetException ex2;
                        Log.w("BackendRegistry", "Could not instantiate ".concat(className), (Throwable)ex2);
                        return null;
                    }
                    final NoSuchMethodException ex3;
                    Log.w("BackendRegistry", "Could not instantiate ".concat(className), (Throwable)ex3);
                    return null;
                }
                final StringBuilder sb = new StringBuilder("Could not instantiate ");
                sb.append(className);
                sb.append(".");
                final InstantiationException ex4;
                Log.w("BackendRegistry", sb.toString(), (Throwable)ex4);
                return null;
            }
            final StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(className);
            sb2.append(".");
            final IllegalAccessException ex5;
            Log.w("BackendRegistry", sb2.toString(), (Throwable)ex5);
            return null;
        }
        final StringBuilder sb3 = new StringBuilder("Class ");
        sb3.append(className);
        sb3.append(" is not found.");
        final ClassNotFoundException ex6;
        Log.w("BackendRegistry", sb3.toString(), (Throwable)ex6);
        return null;
    }
    
    public String i(final String s) {
        final String s2 = (String)this.E;
        final Resources resources = (Resources)this.D;
        final int identifier = resources.getIdentifier(s, "string", s2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
    
    public void j(final int n, Bundle bundle) {
        final Locale us = Locale.US;
        final StringBuilder sb = new StringBuilder("Analytics listener received message. ID: ");
        sb.append(n);
        sb.append(", Extras: ");
        sb.append((Object)bundle);
        final String string = sb.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", string, (Throwable)null);
        }
        final String string2 = ((BaseBundle)bundle).getString("name");
        if (string2 != null) {
            if ((bundle = bundle.getBundle("params")) == null) {
                bundle = new Bundle();
            }
            Object o;
            if ("clx".equals((Object)((BaseBundle)bundle).getString("_o"))) {
                o = this.D;
            }
            else {
                o = this.E;
            }
            if (o != null) {
                ((i3.b)o).s(string2, bundle);
            }
        }
    }
    
    public void k(final b b, int i, int size) {
        final v v = (v)this.D;
        final C2.b b2 = (C2.b)this.E;
        final int n = 0;
        if (v != null) {
            final u0.k k = (u0.k)v.f;
            k.getClass();
            Object emptyList = null;
            Label_0262: {
                if (i != size) {
                    final boolean b3 = size > i;
                    final ArrayList list = new ArrayList();
                    int n2 = i;
                Label_0250:
                    while (true) {
                        boolean b4;
                        do {
                            Label_0258: {
                                if (b3) {
                                    if (n2 >= size) {
                                        break Label_0258;
                                    }
                                }
                                else if (n2 <= size) {
                                    break Label_0258;
                                }
                                final TreeMap treeMap = (TreeMap)k.a.get((Object)n2);
                                if (treeMap == null) {
                                    emptyList = null;
                                    break Label_0262;
                                }
                                Object o;
                                if (b3) {
                                    o = treeMap.descendingKeySet();
                                }
                                else {
                                    o = treeMap.keySet();
                                }
                                for (final Integer n3 : o) {
                                    final int intValue = n3;
                                    if (b3) {
                                        if (intValue > size || intValue <= n2) {
                                            continue;
                                        }
                                    }
                                    else if (intValue < size || intValue >= n2) {
                                        continue;
                                    }
                                    list.add(treeMap.get((Object)n3));
                                    b4 = true;
                                    n2 = intValue;
                                    continue Label_0250;
                                }
                                b4 = false;
                                continue;
                            }
                            emptyList = list;
                            break Label_0262;
                        } while (b4);
                        continue;
                    }
                }
                emptyList = Collections.emptyList();
            }
            if (emptyList != null) {
                final ArrayList list2 = new ArrayList();
                final Cursor j = b.i("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                Label_0469: {
                    try {
                        while (j.moveToNext()) {
                            list2.add((Object)j.getString(0));
                        }
                    }
                    finally {
                        break Label_0469;
                    }
                    j.close();
                    final b b5;
                    for (final String s : list2) {
                        if (s.startsWith("room_fts_content_sync_")) {
                            b5.h("DROP TRIGGER IF EXISTS ".concat(s));
                        }
                    }
                    final Iterator iterator3 = ((List)emptyList).iterator();
                    while (iterator3.hasNext()) {
                        ((a)iterator3.next()).a(b5);
                    }
                    final N y = C2.b.y(b5);
                    if (y.a) {
                        this.m(b5);
                        return;
                    }
                    final StringBuilder sb = new StringBuilder("Migration didn't properly handle: ");
                    sb.append(y.b);
                    throw new IllegalStateException(sb.toString());
                }
                j.close();
            }
        }
        final v v2 = (v)this.D;
        if (v2 == null || ((i <= size || !v2.b) && v2.a)) {
            final StringBuilder sb2 = new StringBuilder("A migration from ");
            sb2.append(i);
            sb2.append(" to ");
            sb2.append(size);
            sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            throw new IllegalStateException(sb2.toString());
        }
        b.h("DROP TABLE IF EXISTS `Dependency`");
        b.h("DROP TABLE IF EXISTS `WorkSpec`");
        b.h("DROP TABLE IF EXISTS `WorkTag`");
        b.h("DROP TABLE IF EXISTS `SystemIdInfo`");
        b.h("DROP TABLE IF EXISTS `WorkName`");
        b.h("DROP TABLE IF EXISTS `WorkProgress`");
        b.h("DROP TABLE IF EXISTS `Preference`");
        i = WorkDatabase_Impl.s;
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)b2.D;
        final ArrayList g = ((l)workDatabase_Impl).g;
        if (g != null) {
            for (size = ((List)g).size(), i = n; i < size; ++i) {
                ((List)((l)workDatabase_Impl).g).get(i).getClass();
            }
        }
        C2.b.m(b);
    }
    
    public MotionEvent l(final u u) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long a;
        while (true) {
            priorityQueue = (PriorityQueue)this.E;
            final boolean empty = ((AbstractCollection)priorityQueue).isEmpty();
            longSparseArray = (LongSparseArray)this.D;
            a = u.a;
            if (empty || (long)priorityQueue.peek() >= a) {
                break;
            }
            longSparseArray.remove((long)priorityQueue.poll());
        }
        if (!((AbstractCollection)priorityQueue).isEmpty() && (long)priorityQueue.peek() == a) {
            priorityQueue.poll();
        }
        final MotionEvent motionEvent = (MotionEvent)longSparseArray.get(a);
        longSparseArray.remove(a);
        return motionEvent;
    }
    
    public void m(final b b) {
        b.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        b.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
    
    public t s(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aconst_null    
        //     4: astore          5
        //     6: aload_0        
        //     7: getfield        f2/d.C:I
        //    10: tableswitch {
        //               12: 369
        //          default: 28
        //        }
        //    28: aload_1        
        //    29: checkcast       Ljava/lang/Void;
        //    32: astore_1       
        //    33: aload_0        
        //    34: getfield        f2/d.D:Ljava/lang/Object;
        //    37: checkcast       Ll3/c;
        //    40: getfield        l3/c.c:Ll3/b;
        //    43: getfield        l3/b.C:Ljava/util/concurrent/ExecutorService;
        //    46: new             LG0/k;
        //    49: dup            
        //    50: aload_0        
        //    51: bipush          6
        //    53: invokespecial   G0/k.<init>:(Ljava/lang/Object;I)V
        //    56: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
        //    61: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
        //    66: checkcast       Lorg/json/JSONObject;
        //    69: astore          8
        //    71: aload           8
        //    73: ifnull          364
        //    76: aload_0        
        //    77: getfield        f2/d.E:Ljava/lang/Object;
        //    80: checkcast       LC2/z;
        //    83: astore          7
        //    85: aload           7
        //    87: getfield        C2/z.c:Ljava/lang/Object;
        //    90: checkcast       LV4/G;
        //    93: aload           8
        //    95: invokevirtual   V4/G.v:(Lorg/json/JSONObject;)Ls3/a;
        //    98: astore          6
        //   100: aload           6
        //   102: getfield        s3/a.c:J
        //   105: lstore_2       
        //   106: aload           7
        //   108: getfield        C2/z.e:Ljava/lang/Object;
        //   111: checkcast       LX/a;
        //   114: astore          4
        //   116: aload           4
        //   118: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   121: pop            
        //   122: ldc             "FirebaseCrashlytics"
        //   124: iconst_2       
        //   125: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   128: ifeq            141
        //   131: ldc             "FirebaseCrashlytics"
        //   133: ldc_w           "Writing settings to cache file..."
        //   136: aconst_null    
        //   137: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   140: pop            
        //   141: aload           8
        //   143: ldc_w           "expires_at"
        //   146: lload_2        
        //   147: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;J)Lorg/json/JSONObject;
        //   150: pop            
        //   151: new             Ljava/io/FileWriter;
        //   154: astore_1       
        //   155: aload           4
        //   157: getfield        X/a.D:Ljava/lang/Object;
        //   160: checkcast       Ljava/io/File;
        //   163: astore          4
        //   165: aload_1        
        //   166: aload           4
        //   168: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //   171: aload_1        
        //   172: astore          4
        //   174: aload_1        
        //   175: aload           8
        //   177: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   180: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   183: aload_1        
        //   184: astore          4
        //   186: aload_1        
        //   187: invokevirtual   java/io/Writer.flush:()V
        //   190: aload_1        
        //   191: ldc_w           "Failed to close settings writer."
        //   194: invokestatic    k3/g.b:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   197: goto            258
        //   200: astore          5
        //   202: aload           4
        //   204: astore_1       
        //   205: aload           5
        //   207: astore          4
        //   209: goto            354
        //   212: astore          5
        //   214: goto            241
        //   217: astore          4
        //   219: aload           5
        //   221: astore_1       
        //   222: goto            354
        //   225: astore          4
        //   227: aconst_null    
        //   228: astore_1       
        //   229: aload           4
        //   231: astore          5
        //   233: goto            241
        //   236: astore          4
        //   238: goto            227
        //   241: aload_1        
        //   242: astore          4
        //   244: ldc             "FirebaseCrashlytics"
        //   246: ldc_w           "Failed to cache settings"
        //   249: aload           5
        //   251: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   254: pop            
        //   255: goto            190
        //   258: ldc_w           "Loaded settings: "
        //   261: aload           8
        //   263: invokestatic    C2/z.l:(Ljava/lang/String;Lorg/json/JSONObject;)V
        //   266: aload           7
        //   268: getfield        C2/z.b:Ljava/lang/Object;
        //   271: checkcast       Ls3/c;
        //   274: getfield        s3/c.f:Ljava/lang/String;
        //   277: astore_1       
        //   278: aload           7
        //   280: getfield        C2/z.a:Ljava/lang/Object;
        //   283: checkcast       Landroid/content/Context;
        //   286: ldc_w           "com.google.firebase.crashlytics"
        //   289: iconst_0       
        //   290: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   293: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   298: astore          4
        //   300: aload           4
        //   302: ldc_w           "existing_instance_identifier"
        //   305: aload_1        
        //   306: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   311: pop            
        //   312: aload           4
        //   314: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   319: aload           7
        //   321: getfield        C2/z.h:Ljava/lang/Object;
        //   324: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   327: aload           6
        //   329: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   332: aload           7
        //   334: getfield        C2/z.i:Ljava/lang/Object;
        //   337: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   340: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   343: checkcast       LO2/j;
        //   346: aload           6
        //   348: invokevirtual   O2/j.d:(Ljava/lang/Object;)V
        //   351: goto            364
        //   354: aload_1        
        //   355: ldc_w           "Failed to close settings writer."
        //   358: invokestatic    k3/g.b:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   361: aload           4
        //   363: athrow         
        //   364: aconst_null    
        //   365: invokestatic    n3/u0.m:(Ljava/lang/Object;)LO2/t;
        //   368: areturn        
        //   369: aload_1        
        //   370: checkcast       Ls3/a;
        //   373: ifnonnull       394
        //   376: ldc             "FirebaseCrashlytics"
        //   378: ldc_w           "Received null app settings, cannot send reports at crash time."
        //   381: aconst_null    
        //   382: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   385: pop            
        //   386: aconst_null    
        //   387: invokestatic    n3/u0.m:(Ljava/lang/Object;)LO2/t;
        //   390: astore_1       
        //   391: goto            483
        //   394: aload_0        
        //   395: getfield        f2/d.D:Ljava/lang/Object;
        //   398: checkcast       Lk3/k;
        //   401: astore          7
        //   403: aload           7
        //   405: getfield        k3/k.f:Lk3/m;
        //   408: invokestatic    k3/m.a:(Lk3/m;)LO2/t;
        //   411: astore          5
        //   413: aload           7
        //   415: getfield        k3/k.f:Lk3/m;
        //   418: astore_1       
        //   419: aload_1        
        //   420: getfield        k3/m.m:Lq3/c;
        //   423: astore          6
        //   425: aload_1        
        //   426: getfield        k3/m.e:Ll3/c;
        //   429: getfield        l3/c.a:Ll3/b;
        //   432: astore          8
        //   434: aload           4
        //   436: astore_1       
        //   437: aload           7
        //   439: getfield        k3/k.e:Z
        //   442: ifeq            453
        //   445: aload_0        
        //   446: getfield        f2/d.E:Ljava/lang/Object;
        //   449: checkcast       Ljava/lang/String;
        //   452: astore_1       
        //   453: iconst_2       
        //   454: anewarray       LO2/i;
        //   457: dup            
        //   458: iconst_0       
        //   459: aload           5
        //   461: aastore        
        //   462: dup            
        //   463: iconst_1       
        //   464: aload           6
        //   466: aload           8
        //   468: aload_1        
        //   469: invokevirtual   q3/c.k:(Ll3/b;Ljava/lang/String;)LO2/t;
        //   472: aastore        
        //   473: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   476: checkcast       Ljava/util/List;
        //   479: invokestatic    n3/u0.A:(Ljava/util/List;)LO2/t;
        //   482: astore_1       
        //   483: aload_1        
        //   484: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  141    155    225    227    Ljava/lang/Exception;
        //  141    155    217    225    Any
        //  155    165    236    241    Ljava/lang/Exception;
        //  155    165    217    225    Any
        //  165    171    225    227    Ljava/lang/Exception;
        //  165    171    217    225    Any
        //  174    183    212    217    Ljava/lang/Exception;
        //  174    183    200    212    Any
        //  186    190    212    217    Ljava/lang/Exception;
        //  186    190    200    212    Any
        //  244    255    200    212    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0190:
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
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 14: {
                final StringBuilder sb = new StringBuilder("DartCallback( bundle path: ");
                sb.append((String)this.E);
                sb.append(", library path: ");
                final FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation)this.D;
                sb.append(flutterCallbackInformation.callbackLibraryPath);
                sb.append(", function: ");
                return x.a.b(sb, flutterCallbackInformation.callbackName, " )");
            }
            case 12: {
                final v.f f = (v.f)this.D;
                String s;
                String string = s = "[ ";
                if (f != null) {
                    int n = 0;
                    while (true) {
                        s = string;
                        if (n >= 9) {
                            break;
                        }
                        final StringBuilder b = e.b(string);
                        b.append(((v.f)this.D).J[n]);
                        b.append(" ");
                        string = b.toString();
                        ++n;
                    }
                }
                final StringBuilder c = e.c(s, "] ");
                c.append((Object)this.D);
                return c.toString();
            }
        }
    }
}
