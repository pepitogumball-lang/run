package p2;

import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import io.flutter.plugin.platform.p;
import android.os.Build$VERSION;
import h2.K;
import android.util.Log;
import s2.b;
import java.util.concurrent.Executor;
import android.content.ServiceConnection;
import android.content.Intent;
import android.content.Context;
import h2.A;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
    public static final Object b;
    public static volatile a c;
    public final ConcurrentHashMap a;
    
    static {
        b = new Object();
    }
    
    public a() {
        this.a = new ConcurrentHashMap();
    }
    
    public static a b() {
        if (a.c == null) {
            final Object b;
            monitorenter(b = a.b);
            Label_0039: {
                try {
                    if (a.c == null) {
                        a.c = new a();
                    }
                    break Label_0039;
                }
                finally {
                    monitorexit(b);
                    monitorexit(b);
                }
            }
        }
        final a c = a.c;
        A.h((Object)c);
        return c;
    }
    
    public final boolean a(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n) {
        return this.d(context, context.getClass().getName(), intent, serviceConnection, n, null);
    }
    
    public final void c(final Context p0, final ServiceConnection p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lh2/K;
        //     4: ifne            52
        //     7: aload_0        
        //     8: getfield        p2/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    11: astore_3       
        //    12: aload_3        
        //    13: aload_2        
        //    14: invokevirtual   java/util/concurrent/ConcurrentHashMap.containsKey:(Ljava/lang/Object;)Z
        //    17: ifeq            52
        //    20: aload_3        
        //    21: aload_2        
        //    22: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    25: checkcast       Landroid/content/ServiceConnection;
        //    28: astore          4
        //    30: aload_1        
        //    31: aload           4
        //    33: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    36: aload_3        
        //    37: aload_2        
        //    38: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    41: pop            
        //    42: return         
        //    43: astore_1       
        //    44: aload_3        
        //    45: aload_2        
        //    46: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    49: pop            
        //    50: aload_1        
        //    51: athrow         
        //    52: aload_1        
        //    53: aload_2        
        //    54: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    57: return         
        //    58: astore_1       
        //    59: goto            36
        //    62: astore_1       
        //    63: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     30     43     52     Any
        //  30     36     58     62     Ljava/lang/IllegalArgumentException;
        //  30     36     58     62     Ljava/lang/IllegalStateException;
        //  30     36     58     62     Ljava/util/NoSuchElementException;
        //  30     36     43     52     Any
        //  52     57     62     66     Ljava/lang/IllegalArgumentException;
        //  52     57     62     66     Ljava/lang/IllegalStateException;
        //  52     57     62     66     Ljava/util/NoSuchElementException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    public final boolean d(final Context context, String s, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        final ComponentName component = intent.getComponent();
        while (true) {
            if (component == null) {
                break Label_0062;
            }
            final String packageName = component.getPackageName();
            "com.google.android.gms".equals((Object)packageName);
            try {
                if ((s2.b.a(context).a(0, packageName).flags & 0x200000) != 0x0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
                if (!(serviceConnection instanceof K)) {
                    final ConcurrentHashMap a = this.a;
                    final ServiceConnection serviceConnection2 = (ServiceConnection)a.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
                    if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { serviceConnection, s, intent.getAction() }));
                    }
                    if ((s = (String)executor) == null) {
                        s = null;
                    }
                    try {
                        boolean b;
                        if (Build$VERSION.SDK_INT >= 29 && s != null) {
                            b = p.i(context, intent, n, (Executor)s, serviceConnection);
                        }
                        else {
                            b = context.bindService(intent, serviceConnection, n);
                        }
                        if (b) {
                            return b;
                        }
                        return false;
                    }
                    finally {
                        a.remove((Object)serviceConnection, (Object)serviceConnection);
                    }
                }
                if ((s = (String)executor) == null) {
                    s = null;
                }
                boolean b;
                if (Build$VERSION.SDK_INT >= 29 && s != null) {
                    b = p.i(context, intent, n, (Executor)s, serviceConnection);
                }
                else {
                    b = context.bindService(intent, serviceConnection, n);
                }
                return b;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
}
