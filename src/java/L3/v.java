package L3;

import org.json.JSONObject;
import m5.l;
import java.util.Collection;
import e5.j;
import java.util.ArrayList;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import m5.p;
import B5.t;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.pm.PackageInfo;
import y5.n;
import c5.h;
import f5.a;
import z5.b;
import e5.d;
import y5.o;
import X2.f;
import com.google.android.gms.internal.ads.z7;
import F1.q;
import com.google.android.gms.internal.ads.D7;
import android.content.Context;
import e5.i;
import L0.k;
import java.io.Serializable;
import z5.c;

public final class v implements c
{
    public final int C;
    public final Object D;
    public int E;
    public int F;
    public Serializable G;
    public Object H;
    
    public v(final k k, final i d, final int e, final int f) {
        this.C = 2;
        this.C = 2;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = (Serializable)k;
        this.H = k;
    }
    
    public v(final Context context, final int c) {
        switch (this.C = c) {
            default: {
                this.F = 0;
                this.D = context;
                return;
            }
            case 1: {
                this.G = (Serializable)"";
                this.D = context;
                this.H = context.getApplicationInfo();
                final z7 t8 = D7.T8;
                final q d = q.d;
                this.E = (int)d.c.a(t8);
                this.F = (int)d.c.a(D7.U8);
            }
        }
    }
    
    public static String c(final f f) {
        f.a();
        final X2.i c = f.c;
        final String e = c.e;
        if (e != null) {
            return e;
        }
        f.a();
        final String b = c.b;
        if (!b.startsWith("1:")) {
            return b;
        }
        final String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
    
    public Object a(o f, final d d) {
        b b2 = null;
        Label_0054: {
            if (d instanceof b) {
                final b b = (b)d;
                final int i = b.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    b.I = i + Integer.MIN_VALUE;
                    b2 = b;
                    break Label_0054;
                }
            }
            b2 = new b(this, (g5.c)d);
        }
        final Object g = b2.G;
        final a c = a.C;
        final int j = b2.I;
        final h a = h.a;
        if (j != 0) {
            if (j != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = b2.F;
            com.google.android.gms.internal.auth.h.z(g);
        }
        else {
            com.google.android.gms.internal.auth.h.z(g);
            b2.F = f;
            b2.I = 1;
            Object f2 = ((k)this.G).f(f, b2);
            if (f2 != c) {
                f2 = a;
            }
            if (f2 == c) {
                return c;
            }
        }
        if (((n)f).F.q()) {
            return a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }
    
    public String b() {
        monitorenter(this);
        Label_0025: {
            try {
                if (this.G == null) {
                    this.g();
                }
                break Label_0025;
            }
            finally {
                monitorexit(this);
                final String s = (String)this.G;
                monitorexit(this);
                return s;
            }
        }
    }
    
    public PackageInfo d(final String s) {
        try {
            return ((Context)this.D).getPackageManager().getPackageInfo(s, 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            final StringBuilder sb = new StringBuilder("Failed to find package ");
            sb.append((Object)ex);
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }
    
    @Override
    public Object e(final z5.d d, final d d2) {
        final A5.d d3 = new A5.d(d, this, (d)null);
        final t t = new t(d2, d2.getContext());
        Object o = s2.a.l(t, t, (p)d3);
        if (o != a.C) {
            o = h.a;
        }
        return o;
    }
    
    public boolean f() {
        monitorenter(this);
        int n;
        boolean b = false;
        PackageManager packageManager;
        Intent intent;
        List queryIntentServices;
        Intent intent2;
        List queryBroadcastReceivers;
        Block_11_Outer:Block_10_Outer:
        while (true) {
            Label_0065: {
                try {
                    n = this.F;
                    b = true;
                    if (n != 0) {
                        monitorexit(this);
                        break Label_0219;
                    }
                    packageManager = ((Context)this.D).getPackageManager();
                    if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                        Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                        monitorexit(this);
                        n = 0;
                        break Label_0219;
                    }
                    break Label_0065;
                }
                finally {
                    monitorexit(this);
                    return b;
                    iftrue(Label_0226:)(n == 0);
                    return b;
                    while (true) {
                    Label_0211_Outer:
                        while (true) {
                            this.F = 2;
                        Block_8:
                            while (true) {
                                break Label_0211;
                                iftrue(Label_0128:)(q2.b.h());
                                Block_6: {
                                    break Block_6;
                                    n = this.F;
                                    monitorexit(this);
                                    continue Block_11_Outer;
                                }
                                intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                                intent.setPackage("com.google.android.gms");
                                queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                iftrue(Label_0128:)(queryIntentServices == null || queryIntentServices.size() <= 0);
                                break Block_8;
                                Label_0206: {
                                    this.F = 1;
                                }
                                continue Block_10_Outer;
                            }
                            this.F = 1;
                            monitorexit(this);
                            n = 1;
                            continue Block_11_Outer;
                            this.F = 2;
                            monitorexit(this);
                            n = 2;
                            continue Block_11_Outer;
                            Label_0183: {
                                Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            }
                            iftrue(Label_0206:)(!q2.b.h());
                            continue Label_0211_Outer;
                        }
                        Label_0128: {
                            intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                        }
                        intent2.setPackage("com.google.android.gms");
                        queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                        iftrue(Label_0183:)(queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0);
                        continue;
                    }
                    Label_0226: {
                        b = false;
                    }
                    return b;
                }
            }
            break;
        }
    }
    
    public void g() {
        monitorenter(this);
        Label_0049: {
            try {
                final PackageInfo d = this.d(((Context)this.D).getPackageName());
                if (d != null) {
                    this.G = (Serializable)Integer.toString(d.versionCode);
                    this.H = d.versionName;
                }
                break Label_0049;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    public String h() {
        final ArrayList list = new ArrayList(4);
        final j c = j.C;
        final i i = (i)this.D;
        if (i != c) {
            final StringBuilder sb = new StringBuilder("context=");
            sb.append((Object)i);
            list.add((Object)sb.toString());
        }
        final int e = this.E;
        if (e != -3) {
            final StringBuilder sb2 = new StringBuilder("capacity=");
            sb2.append(e);
            list.add((Object)sb2.toString());
        }
        final int f = this.F;
        if (f != 1) {
            String s;
            if (f != 1) {
                if (f != 2) {
                    if (f != 3) {
                        s = "null";
                    }
                    else {
                        s = "DROP_LATEST";
                    }
                }
                else {
                    s = "DROP_OLDEST";
                }
            }
            else {
                s = "SUSPEND";
            }
            list.add((Object)"onBufferOverflow=".concat(s));
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(this.getClass().getSimpleName());
        sb3.append('[');
        sb3.append(d5.d.I((Collection)list, ", ", (String)null, (String)null, (l)null, 62));
        sb3.append(']');
        return sb3.toString();
    }
    
    public JSONObject i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        L3/v.H:Ljava/lang/Object;
        //     4: checkcast       Landroid/content/pm/ApplicationInfo;
        //     7: astore          7
        //     9: aload_0        
        //    10: getfield        L3/v.D:Ljava/lang/Object;
        //    13: checkcast       Landroid/content/Context;
        //    16: astore          8
        //    18: new             Lorg/json/JSONObject;
        //    21: dup            
        //    22: invokespecial   org/json/JSONObject.<init>:()V
        //    25: astore          6
        //    27: aload           7
        //    29: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //    32: astore          4
        //    34: getstatic       I1/M.l:LI1/I;
        //    37: astore          5
        //    39: aload           6
        //    41: ldc_w           "name"
        //    44: aload           8
        //    46: invokestatic    s2/b.a:(Landroid/content/Context;)LR4/b;
        //    49: aload           4
        //    51: invokevirtual   R4/b.b:(Ljava/lang/String;)Ljava/lang/CharSequence;
        //    54: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    57: pop            
        //    58: aload           6
        //    60: ldc_w           "packageName"
        //    63: aload           7
        //    65: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //    68: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    71: pop            
        //    72: getstatic       E1/o.B:LE1/o;
        //    75: getfield        E1/o.c:LI1/M;
        //    78: astore          4
        //    80: aconst_null    
        //    81: astore          5
        //    83: aload           8
        //    85: invokestatic    I1/M.F:(Landroid/content/Context;)Ljava/lang/String;
        //    88: astore          4
        //    90: goto            98
        //    93: astore          4
        //    95: aconst_null    
        //    96: astore          4
        //    98: aload           6
        //   100: ldc_w           "adMobAppId"
        //   103: aload           4
        //   105: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   108: pop            
        //   109: aload_0        
        //   110: getfield        L3/v.G:Ljava/io/Serializable;
        //   113: checkcast       Ljava/lang/String;
        //   116: invokevirtual   java/lang/String.isEmpty:()Z
        //   119: istore_3       
        //   120: aload_0        
        //   121: getfield        L3/v.F:I
        //   124: istore_1       
        //   125: aload_0        
        //   126: getfield        L3/v.E:I
        //   129: istore_2       
        //   130: iload_3        
        //   131: ifeq            275
        //   134: aload           8
        //   136: invokestatic    s2/b.a:(Landroid/content/Context;)LR4/b;
        //   139: astore          4
        //   141: aload           7
        //   143: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //   146: astore          7
        //   148: aload           4
        //   150: getfield        R4/b.C:Landroid/content/Context;
        //   153: astore          4
        //   155: aload           4
        //   157: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   160: aload           7
        //   162: iconst_0       
        //   163: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   166: astore          7
        //   168: aload           4
        //   170: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   173: aload           7
        //   175: invokevirtual   android/content/pm/PackageManager.getApplicationLabel:(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
        //   178: pop            
        //   179: aload           4
        //   181: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   184: aload           7
        //   186: invokevirtual   android/content/pm/PackageManager.getApplicationIcon:(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
        //   189: astore          4
        //   191: aload           4
        //   193: ifnonnull       203
        //   196: ldc             ""
        //   198: astore          4
        //   200: goto            269
        //   203: aload           4
        //   205: iconst_0       
        //   206: iconst_0       
        //   207: iload_2        
        //   208: iload_1        
        //   209: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   212: iload_2        
        //   213: iload_1        
        //   214: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   217: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   220: astore          5
        //   222: aload           4
        //   224: new             Landroid/graphics/Canvas;
        //   227: dup            
        //   228: aload           5
        //   230: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   233: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   236: new             Ljava/io/ByteArrayOutputStream;
        //   239: dup            
        //   240: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   243: astore          4
        //   245: aload           5
        //   247: getstatic       android/graphics/Bitmap$CompressFormat.PNG:Landroid/graphics/Bitmap$CompressFormat;
        //   250: bipush          100
        //   252: aload           4
        //   254: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   257: pop            
        //   258: aload           4
        //   260: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   263: iconst_2       
        //   264: invokestatic    android/util/Base64.encodeToString:([BI)Ljava/lang/String;
        //   267: astore          4
        //   269: aload_0        
        //   270: aload           4
        //   272: putfield        L3/v.G:Ljava/io/Serializable;
        //   275: aload_0        
        //   276: getfield        L3/v.G:Ljava/io/Serializable;
        //   279: checkcast       Ljava/lang/String;
        //   282: invokevirtual   java/lang/String.isEmpty:()Z
        //   285: ifne            324
        //   288: aload           6
        //   290: ldc_w           "icon"
        //   293: aload_0        
        //   294: getfield        L3/v.G:Ljava/io/Serializable;
        //   297: checkcast       Ljava/lang/String;
        //   300: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   303: pop            
        //   304: aload           6
        //   306: ldc_w           "iconWidthPx"
        //   309: iload_2        
        //   310: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   313: pop            
        //   314: aload           6
        //   316: ldc_w           "iconHeightPx"
        //   319: iload_1        
        //   320: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   323: pop            
        //   324: aload           6
        //   326: areturn        
        //   327: astore          4
        //   329: goto            58
        //   332: astore          4
        //   334: aload           5
        //   336: astore          4
        //   338: goto            191
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  27     58     327    332    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  83     90     93     98     Landroid/os/RemoteException;
        //  134    191    332    341    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0191:
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
            case 2: {
                final StringBuilder sb = new StringBuilder("block[");
                sb.append((Object)this.G);
                sb.append("] -> ");
                sb.append(this.h());
                return sb.toString();
            }
        }
    }
}
