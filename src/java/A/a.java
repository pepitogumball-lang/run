package a;

import java.util.concurrent.Future;
import java.lang.reflect.AccessibleObject;
import w5.a0;
import java.util.List;
import android.os.Parcelable;
import android.os.IBinder;
import android.os.Bundle;
import Z4.I;
import F1.n;
import F4.b;
import Z4.x;
import X4.c;
import F4.f;
import e5.i;
import com.google.android.gms.internal.auth.m;
import java.lang.reflect.InvocationTargetException;
import android.webkit.WebView;
import C2.d0;
import java.lang.reflect.InvocationHandler;
import android.view.Window$Callback;
import java.lang.ref.Reference;
import java.util.WeakHashMap;
import java.util.ArrayList;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import O.U;
import android.os.Build$VERSION;
import O.V;
import android.view.KeyEvent;
import t0.s;
import t0.r;
import android.view.View;
import C.u;
import t0.z;
import m5.l;
import W.k;
import w5.y;
import android.os.Parcel;
import V2.q;
import com.google.android.gms.internal.ads.y7;
import J1.j;
import android.provider.Settings$Global;
import com.google.android.gms.internal.ads.c8;
import J1.g;
import android.content.Context;
import java.util.logging.Level;
import java.util.logging.Logger;
import n5.h;
import androidx.fragment.app.c0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class a
{
    public static boolean a;
    public static Method b;
    public static boolean c;
    public static Field d;
    public static String[] e;
    
    public a(final c0 c0) {
        h.e("operation", (Object)c0);
    }
    
    public static String A(final String s, final Object... array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
                }
                catch (final Exception ex) {
                    final String name = o.getClass().getName();
                    final String hexString = Integer.toHexString(System.identityHashCode(o));
                    final StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf((Object)hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    final String string = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable)ex);
                    final String name2 = ((Throwable)ex).getClass().getName();
                    final StringBuilder sb2 = new StringBuilder(name2.length() + (string.length() + 8) + 1);
                    sb2.append("<");
                    sb2.append(string);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    s2 = sb2.toString();
                }
            }
            array[n2] = s2;
            ++n2;
        }
        final StringBuilder sb3 = new StringBuilder(s.length() + length * 16);
        int n3 = 0;
        int n4 = n;
        int length2;
        while (true) {
            length2 = array.length;
            if (n4 >= length2) {
                break;
            }
            final int index = s.indexOf("%s", n3);
            if (index == -1) {
                break;
            }
            sb3.append((CharSequence)s, n3, index);
            sb3.append(array[n4]);
            n3 = index + 2;
            ++n4;
        }
        sb3.append((CharSequence)s, n3, s.length());
        if (n4 < length2) {
            sb3.append(" [");
            final int n5 = n4 + 1;
            sb3.append(array[n4]);
            for (int i = n5; i < array.length; ++i) {
                sb3.append(", ");
                sb3.append(array[i]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
    
    public static void B(final Context context) {
        final Object b = g.b;
        if (!(boolean)c8.a.p()) {
            return;
        }
        try {
            if (Settings$Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                final Object b2 = g.b;
                synchronized (b2) {
                    final boolean c = g.c;
                    monitorexit(b2);
                    if (!c) {
                        final q r = ((u)new H1.g(context)).r();
                        j.h("Updating ad debug logging enablement.");
                        y7.j(r, "AdDebugLogUpdater.updateEnablement");
                    }
                }
            }
        }
        catch (final Exception ex) {
            j.j("Fail to determine debug setting.", (Throwable)ex);
        }
    }
    
    public static void C(final Parcel parcel, final int n, final int n2) {
        parcel.writeInt(n | n2 << 16);
    }
    
    public static int D(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    public static void E(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void a(final Throwable t, final Throwable t2) {
        h.e("<this>", (Object)t);
        h.e("exception", (Object)t2);
        if (t != t2) {
            final Integer a = i5.a.a;
            if (a != null && a < 19) {
                final Method a2 = h5.a.a;
                if (a2 != null) {
                    a2.invoke((Object)t, new Object[] { t2 });
                }
            }
            else {
                t.addSuppressed(t2);
            }
        }
    }
    
    public static u.j b(final y y) {
        final Object o = new Object();
        ((u.h)o).c = (u.k)new Object();
        final u.j b = new u.j((u.h)o);
        ((u.h)o).b = b;
        ((u.h)o).a = m0.a.class;
        try {
            ((a0)y).G(false, true, (l)new k(o, 1, (Object)y));
            ((u.h)o).a = "Deferred.asListenableFuture";
        }
        catch (final Exception ex) {
            ((u.g)b.D).l((Throwable)ex);
        }
        return b;
    }
    
    public static int c(final z z, final u u, final View view, final View view2, final r r, final boolean b) {
        if (r.p() == 0 || z.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (b) {
            return Math.min(u.o(), u.i(view2) - u.k(view));
        }
        ((s)view.getLayoutParams()).getClass();
        throw null;
    }
    
    public static int d(final z z, final u u, final View view, final View view2, final r r, final boolean b) {
        if (r.p() == 0 || z.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return z.a();
        }
        u.i(view2);
        u.k(view);
        ((s)view.getLayoutParams()).getClass();
        throw null;
    }
    
    public static boolean e(View view, final KeyEvent keyEvent) {
        final WeakHashMap a = V.a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT < 28) {
            final ArrayList d = U.d;
            final U u = (U)view.getTag(2131231060);
            final Reference reference = null;
            Object o;
            if ((o = u) == null) {
                o = new Object();
                ((U)o).a = null;
                ((U)o).b = null;
                ((U)o).c = null;
                view.setTag(2131231060, o);
            }
            final WeakReference c = ((U)o).c;
            if (c == null || ((Reference)c).get() != keyEvent) {
                ((U)o).c = new WeakReference((Object)keyEvent);
                if (((U)o).b == null) {
                    ((U)o).b = new SparseArray();
                }
                final SparseArray b2 = ((U)o).b;
                Object o2 = reference;
                if (keyEvent.getAction() == 1) {
                    final int indexOfKey = b2.indexOfKey(keyEvent.getKeyCode());
                    o2 = reference;
                    if (indexOfKey >= 0) {
                        o2 = b2.valueAt(indexOfKey);
                        b2.removeAt(indexOfKey);
                    }
                }
                Object o3;
                if ((o3 = o2) == null) {
                    o3 = b2.get(keyEvent.getKeyCode());
                }
                if (o3 != null) {
                    view = (View)((Reference)o3).get();
                    if (view != null && view.isAttachedToWindow()) {
                        final ArrayList list = (ArrayList)view.getTag(2131231061);
                        if (list != null) {
                            final int n = list.size() - 1;
                            if (n >= 0) {
                                list.get(n).getClass();
                                throw new ClassCastException();
                            }
                        }
                    }
                    b = true;
                }
            }
        }
        return b;
    }
    
    public static boolean f(final O.l p0, final View p1, final Window$Callback p2, final KeyEvent p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          4
        //     3: iconst_0       
        //     4: istore          5
        //     6: aload_0        
        //     7: ifnonnull       12
        //    10: iconst_0       
        //    11: ireturn        
        //    12: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    15: bipush          28
        //    17: if_icmplt       28
        //    20: aload_0        
        //    21: aload_3        
        //    22: invokeinterface O/l.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //    27: ireturn        
        //    28: aload_2        
        //    29: instanceof      Landroid/app/Activity;
        //    32: istore          8
        //    34: aconst_null    
        //    35: astore          9
        //    37: aconst_null    
        //    38: astore          10
        //    40: iconst_1       
        //    41: istore          7
        //    43: iconst_1       
        //    44: istore          6
        //    46: iload           8
        //    48: ifeq            245
        //    51: aload_2        
        //    52: checkcast       Landroid/app/Activity;
        //    55: astore_1       
        //    56: aload_1        
        //    57: invokevirtual   android/app/Activity.onUserInteraction:()V
        //    60: aload_1        
        //    61: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //    64: astore_0       
        //    65: aload_0        
        //    66: bipush          8
        //    68: invokevirtual   android/view/Window.hasFeature:(I)Z
        //    71: ifeq            186
        //    74: aload_1        
        //    75: invokevirtual   android/app/Activity.getActionBar:()Landroid/app/ActionBar;
        //    78: astore_2       
        //    79: aload_3        
        //    80: invokevirtual   android/view/KeyEvent.getKeyCode:()I
        //    83: bipush          82
        //    85: if_icmpne       186
        //    88: aload_2        
        //    89: ifnull          186
        //    92: getstatic       a/a.a:Z
        //    95: ifne            125
        //    98: aload_2        
        //    99: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   102: ldc_w           "onMenuKeyEvent"
        //   105: iconst_1       
        //   106: anewarray       Ljava/lang/Class;
        //   109: dup            
        //   110: iconst_0       
        //   111: ldc_w           Landroid/view/KeyEvent;.class
        //   114: aastore        
        //   115: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   118: putstatic       a/a.b:Ljava/lang/reflect/Method;
        //   121: iconst_1       
        //   122: putstatic       a/a.a:Z
        //   125: getstatic       a/a.b:Ljava/lang/reflect/Method;
        //   128: astore          9
        //   130: iload           5
        //   132: istore          4
        //   134: aload           9
        //   136: ifnull          174
        //   139: aload           9
        //   141: aload_2        
        //   142: iconst_1       
        //   143: anewarray       Ljava/lang/Object;
        //   146: dup            
        //   147: iconst_0       
        //   148: aload_3        
        //   149: aastore        
        //   150: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   153: astore_2       
        //   154: aload_2        
        //   155: ifnonnull       165
        //   158: iload           5
        //   160: istore          4
        //   162: goto            174
        //   165: aload_2        
        //   166: checkcast       Ljava/lang/Boolean;
        //   169: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   172: istore          4
        //   174: iload           4
        //   176: ifeq            186
        //   179: iload           6
        //   181: istore          4
        //   183: goto            242
        //   186: aload_0        
        //   187: aload_3        
        //   188: invokevirtual   android/view/Window.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //   191: ifeq            201
        //   194: iload           6
        //   196: istore          4
        //   198: goto            242
        //   201: aload_0        
        //   202: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   205: astore_2       
        //   206: aload_2        
        //   207: aload_3        
        //   208: invokestatic    O/V.b:(Landroid/view/View;Landroid/view/KeyEvent;)Z
        //   211: ifeq            221
        //   214: iload           6
        //   216: istore          4
        //   218: goto            242
        //   221: aload           10
        //   223: astore_0       
        //   224: aload_2        
        //   225: ifnull          233
        //   228: aload_2        
        //   229: invokevirtual   android/view/View.getKeyDispatcherState:()Landroid/view/KeyEvent$DispatcherState;
        //   232: astore_0       
        //   233: aload_3        
        //   234: aload_1        
        //   235: aload_0        
        //   236: aload_1        
        //   237: invokevirtual   android/view/KeyEvent.dispatch:(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
        //   240: istore          4
        //   242: iload           4
        //   244: ireturn        
        //   245: aload_2        
        //   246: instanceof      Landroid/app/Dialog;
        //   249: ifeq            398
        //   252: aload_2        
        //   253: checkcast       Landroid/app/Dialog;
        //   256: astore_1       
        //   257: getstatic       a/a.c:Z
        //   260: ifne            286
        //   263: ldc_w           Landroid/app/Dialog;.class
        //   266: ldc_w           "mOnKeyListener"
        //   269: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   272: astore_0       
        //   273: aload_0        
        //   274: putstatic       a/a.d:Ljava/lang/reflect/Field;
        //   277: aload_0        
        //   278: iconst_1       
        //   279: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   282: iconst_1       
        //   283: putstatic       a/a.c:Z
        //   286: getstatic       a/a.d:Ljava/lang/reflect/Field;
        //   289: astore_0       
        //   290: aload_0        
        //   291: ifnull          306
        //   294: aload_0        
        //   295: aload_1        
        //   296: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   299: checkcast       Landroid/content/DialogInterface$OnKeyListener;
        //   302: astore_0       
        //   303: goto            308
        //   306: aconst_null    
        //   307: astore_0       
        //   308: aload_0        
        //   309: ifnull          334
        //   312: aload_0        
        //   313: aload_1        
        //   314: aload_3        
        //   315: invokevirtual   android/view/KeyEvent.getKeyCode:()I
        //   318: aload_3        
        //   319: invokeinterface android/content/DialogInterface$OnKeyListener.onKey:(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
        //   324: ifeq            334
        //   327: iload           7
        //   329: istore          4
        //   331: goto            395
        //   334: aload_1        
        //   335: invokevirtual   android/app/Dialog.getWindow:()Landroid/view/Window;
        //   338: astore_0       
        //   339: aload_0        
        //   340: aload_3        
        //   341: invokevirtual   android/view/Window.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //   344: ifeq            354
        //   347: iload           7
        //   349: istore          4
        //   351: goto            395
        //   354: aload_0        
        //   355: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   358: astore_2       
        //   359: aload_2        
        //   360: aload_3        
        //   361: invokestatic    O/V.b:(Landroid/view/View;Landroid/view/KeyEvent;)Z
        //   364: ifeq            374
        //   367: iload           7
        //   369: istore          4
        //   371: goto            395
        //   374: aload           9
        //   376: astore_0       
        //   377: aload_2        
        //   378: ifnull          386
        //   381: aload_2        
        //   382: invokevirtual   android/view/View.getKeyDispatcherState:()Landroid/view/KeyEvent$DispatcherState;
        //   385: astore_0       
        //   386: aload_3        
        //   387: aload_1        
        //   388: aload_0        
        //   389: aload_1        
        //   390: invokevirtual   android/view/KeyEvent.dispatch:(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
        //   393: istore          4
        //   395: iload           4
        //   397: ireturn        
        //   398: aload_1        
        //   399: ifnull          410
        //   402: aload_1        
        //   403: aload_3        
        //   404: invokestatic    O/V.b:(Landroid/view/View;Landroid/view/KeyEvent;)Z
        //   407: ifne            420
        //   410: aload_0        
        //   411: aload_3        
        //   412: invokeinterface O/l.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //   417: ifeq            423
        //   420: iconst_1       
        //   421: istore          4
        //   423: iload           4
        //   425: ireturn        
        //   426: astore          9
        //   428: goto            121
        //   431: astore_2       
        //   432: iload           5
        //   434: istore          4
        //   436: goto            174
        //   439: astore_0       
        //   440: goto            282
        //   443: astore_0       
        //   444: goto            306
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  98     121    426    431    Ljava/lang/NoSuchMethodException;
        //  139    154    431    439    Ljava/lang/IllegalAccessException;
        //  139    154    431    439    Ljava/lang/reflect/InvocationTargetException;
        //  165    174    431    439    Ljava/lang/IllegalAccessException;
        //  165    174    431    439    Ljava/lang/reflect/InvocationTargetException;
        //  263    282    439    443    Ljava/lang/NoSuchFieldException;
        //  294    303    443    447    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 228 out of bounds for length 228
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public static InvocationHandler g() {
        Object loader = null;
        Label_0046: {
            if (Build$VERSION.SDK_INT >= 28) {
                loader = d0.s();
                break Label_0046;
            }
            try {
                loader = WebView.class.getDeclaredMethod("getFactory", (Class<?>[])null);
                ((AccessibleObject)loader).setAccessible(true);
                loader = ((Method)loader).invoke((Object)null, (Object[])null);
                loader = ((Method)loader).getClass().getClassLoader();
                return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, (ClassLoader)loader).getDeclaredMethod("createWebViewProviderFactory", (Class<?>[])null).invoke((Object)null, (Object[])null);
            }
            catch (final IllegalAccessException loader) {}
            catch (final InvocationTargetException loader) {}
            catch (final NoSuchMethodException ex) {}
        }
        throw new RuntimeException((Throwable)loader);
    }
    
    public static e5.g h(e5.g g, final e5.h h) {
        h.e("key", (Object)h);
        if (!h.a((Object)g.getKey(), (Object)h)) {
            g = null;
        }
        return g;
    }
    
    public static void j(final q q) {
        if (((Future)q).isDone()) {
            boolean b = false;
            while (true) {
                try {
                    ((Future)q).get();
                    return;
                }
                catch (final InterruptedException ex) {
                    b = true;
                    continue;
                }
                finally {
                    if (b) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            }
        }
        throw new IllegalStateException(m.q("Future was expected to be done: %s", new Object[] { q }));
    }
    
    public static i m(final e5.g g, final e5.h h) {
        h.e("key", (Object)h);
        Object c = g;
        if (h.a((Object)g.getKey(), (Object)h)) {
            c = e5.j.C;
        }
        return (i)c;
    }
    
    public static void n(final f f, final Z4.i i) {
        h.e("binaryMessenger", (Object)f);
        Object c = null;
        Label_0037: {
            if (i != null) {
                final n a = i.a;
                if (a != null) {
                    c = a.c();
                    break Label_0037;
                }
            }
            c = new c(1);
        }
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", c, (Object)null);
        if (i != null) {
            h.u((b)new x(i, 0));
        }
        else {
            h.u((b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", c, (Object)null);
        if (i != null) {
            h2.u((b)new x(i, 1));
        }
        else {
            h2.u((b)null);
        }
        final Y0.h h3 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", c, (Object)null);
        if (i != null) {
            h3.u((b)new x(i, 2));
        }
        else {
            h3.u((b)null);
        }
    }
    
    public static void o(final f f, final Z4.r r) {
        h.e("binaryMessenger", (Object)f);
        Object c = null;
        Label_0037: {
            if (r != null) {
                final n a = r.a;
                if (a != null) {
                    c = a.c();
                    break Label_0037;
                }
            }
            c = new c(1);
        }
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", c, (Object)null);
        if (r != null) {
            h.u((b)new I(r, 0));
        }
        else {
            h.u((b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", c, (Object)null);
        if (r != null) {
            h2.u((b)new I(r, 15));
        }
        else {
            h2.u((b)null);
        }
        final Y0.h h3 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", c, (Object)null);
        if (r != null) {
            h3.u((b)new I(r, 16));
        }
        else {
            h3.u((b)null);
        }
        final Y0.h h4 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", c, (Object)null);
        if (r != null) {
            h4.u((b)new I(r, 1));
        }
        else {
            h4.u((b)null);
        }
        final Y0.h h5 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", c, (Object)null);
        if (r != null) {
            h5.u((b)new I(r, 2));
        }
        else {
            h5.u((b)null);
        }
        final Y0.h h6 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", c, (Object)null);
        if (r != null) {
            h6.u((b)new I(r, 3));
        }
        else {
            h6.u((b)null);
        }
        final Y0.h h7 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", c, (Object)null);
        if (r != null) {
            h7.u((b)new I(r, 4));
        }
        else {
            h7.u((b)null);
        }
        final Y0.h h8 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", c, (Object)null);
        if (r != null) {
            h8.u((b)new I(r, 5));
        }
        else {
            h8.u((b)null);
        }
        final Y0.h h9 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", c, (Object)null);
        if (r != null) {
            h9.u((b)new I(r, 6));
        }
        else {
            h9.u((b)null);
        }
        final Y0.h h10 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", c, (Object)null);
        if (r != null) {
            h10.u((b)new I(r, 7));
        }
        else {
            h10.u((b)null);
        }
        final Y0.h h11 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", c, (Object)null);
        if (r != null) {
            h11.u((b)new I(r, 8));
        }
        else {
            h11.u((b)null);
        }
        final Y0.h h12 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", c, (Object)null);
        if (r != null) {
            h12.u((b)new I(r, 9));
        }
        else {
            h12.u((b)null);
        }
        final Y0.h h13 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", c, (Object)null);
        if (r != null) {
            h13.u((b)new I(r, 10));
        }
        else {
            h13.u((b)null);
        }
        final Y0.h h14 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", c, (Object)null);
        if (r != null) {
            h14.u((b)new I(r, 11));
        }
        else {
            h14.u((b)null);
        }
        final Y0.h h15 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", c, (Object)null);
        if (r != null) {
            h15.u((b)new I(r, 12));
        }
        else {
            h15.u((b)null);
        }
        final Y0.h h16 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", c, (Object)null);
        if (r != null) {
            h16.u((b)new I(r, 13));
        }
        else {
            h16.u((b)null);
        }
        final Y0.h h17 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", c, (Object)null);
        if (r != null) {
            h17.u((b)new I(r, 14));
        }
        else {
            h17.u((b)null);
        }
    }
    
    public static boolean p(final String s) {
        return s == null || s.isEmpty();
    }
    
    public static void q(final Parcel parcel, int d, final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        d = D(parcel, d);
        parcel.writeBundle(bundle);
        E(parcel, d);
    }
    
    public static void r(final Parcel parcel, int d, final byte[] array, final boolean b) {
        if (array == null) {
            if (b) {
                C(parcel, d, 0);
            }
            return;
        }
        d = D(parcel, d);
        parcel.writeByteArray(array);
        E(parcel, d);
    }
    
    public static void s(final Parcel parcel, int d, final IBinder binder) {
        if (binder == null) {
            return;
        }
        d = D(parcel, d);
        parcel.writeStrongBinder(binder);
        E(parcel, d);
    }
    
    public static void t(final Parcel parcel, final int n, final Long n2) {
        if (n2 == null) {
            return;
        }
        C(parcel, n, 8);
        parcel.writeLong((long)n2);
    }
    
    public static void u(final Parcel parcel, int d, final Parcelable parcelable, final int n, final boolean b) {
        if (parcelable == null) {
            if (b) {
                C(parcel, d, 0);
            }
            return;
        }
        d = D(parcel, d);
        parcelable.writeToParcel(parcel, n);
        E(parcel, d);
    }
    
    public static void v(final Parcel parcel, int d, final String s, final boolean b) {
        if (s == null) {
            if (b) {
                C(parcel, d, 0);
            }
            return;
        }
        d = D(parcel, d);
        parcel.writeString(s);
        E(parcel, d);
    }
    
    public static void w(final Parcel parcel, int d, final String[] array) {
        if (array == null) {
            return;
        }
        d = D(parcel, d);
        parcel.writeStringArray(array);
        E(parcel, d);
    }
    
    public static void x(final Parcel parcel, int d, final List list) {
        if (list == null) {
            return;
        }
        d = D(parcel, d);
        parcel.writeStringList(list);
        E(parcel, d);
    }
    
    public static void y(final Parcel parcel, int i, final Parcelable[] array, final int n) {
        if (array == null) {
            return;
        }
        final int d = D(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        int dataPosition;
        int dataPosition2;
        int dataPosition3;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, n);
                dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        E(parcel, d);
    }
    
    public static void z(final Parcel parcel, int i, final List list, final boolean b) {
        if (list == null) {
            if (b) {
                C(parcel, i, 0);
            }
            return;
        }
        final int d = D(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        int dataPosition;
        int dataPosition2;
        int dataPosition3;
        for (i = 0; i < size; ++i) {
            parcelable = (Parcelable)list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        E(parcel, d);
    }
    
    public String i() {
        return null;
    }
    
    public String k() {
        return null;
    }
    
    public boolean l() {
        throw null;
    }
}
