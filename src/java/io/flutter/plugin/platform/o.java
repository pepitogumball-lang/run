package io.flutter.plugin.platform;

import android.app.Dialog;
import io.flutter.embedding.android.FlutterActivity;
import E4.e;
import android.view.View$OnAttachStateChangeListener;
import android.os.Build$VERSION;
import java.util.Iterator;
import android.view.MotionEvent;
import android.view.MotionEvent$PointerProperties;
import android.view.MotionEvent$PointerCoords;
import java.util.ArrayList;
import java.util.List;
import v4.u;
import E4.d;
import A4.a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import android.content.Context;
import v4.l;
import android.graphics.Canvas;
import android.view.Surface;
import android.hardware.display.VirtualDisplay;
import android.util.DisplayMetrics;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View$OnFocusChangeListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.PorterDuff$Mode;
import android.os.Handler;
import android.hardware.display.VirtualDisplay$Callback;
import android.hardware.display.DisplayManager;
import a5.c;
import J5.b;
import Z4.B;
import com.google.android.gms.internal.measurement.L;
import android.view.View;
import android.util.Log;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.HashMap;

public final class o implements h, i
{
    public final int a;
    public Object b;
    
    public o(final int a) {
        switch (this.a = a) {
            default: {
                this.b = new HashMap();
                return;
            }
            case 4: {}
        }
    }
    
    public void a(final int n, final int n2) {
        ((TextureRegistry$SurfaceProducer)this.b).setSize(n, n2);
    }
    
    public long b() {
        return ((TextureRegistry$SurfaceProducer)this.b).id();
    }
    
    public void c(final int n) {
        switch (this.a) {
            default: {
                final f f = (f)((q)this.b).K.get(n);
                if (f == null) {
                    final StringBuilder sb = new StringBuilder("Clearing focus on an unknown view with id: ");
                    sb.append(n);
                    Log.e("PlatformViewsController2", sb.toString());
                }
                else {
                    final View view = f.getView();
                    if (view == null) {
                        final StringBuilder sb2 = new StringBuilder("Clearing focus on a null view with id: ");
                        sb2.append(n);
                        Log.e("PlatformViewsController2", sb2.toString());
                    }
                    else {
                        view.clearFocus();
                    }
                }
                return;
            }
            case 0: {
                final r r = (r)this.b;
                View view2;
                if (r.b(n)) {
                    view2 = ((D)r.L.get((Object)n)).a();
                }
                else {
                    final f f2 = (f)r.N.get(n);
                    if (f2 == null) {
                        final StringBuilder sb3 = new StringBuilder("Clearing focus on an unknown view with id: ");
                        sb3.append(n);
                        Log.e("PlatformViewsController", sb3.toString());
                        return;
                    }
                    view2 = f2.getView();
                }
                if (view2 == null) {
                    final StringBuilder sb4 = new StringBuilder("Clearing focus on a null view with id: ");
                    sb4.append(n);
                    Log.e("PlatformViewsController", sb4.toString());
                }
                else {
                    view2.clearFocus();
                }
            }
        }
    }
    
    public void d(final E4.f f) {
        final r r = (r)this.b;
        r.getClass();
        io.flutter.plugin.platform.r.h(19);
        io.flutter.plugin.platform.r.e(r, f);
        if (r.G.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        r.f(f, false);
        io.flutter.plugin.platform.r.h(19);
        if (!r.G.IsSurfaceControlEnabled()) {
            return;
        }
        throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
    }
    
    public long e(final E4.f f) {
        final r r = (r)this.b;
        io.flutter.plugin.platform.r.e(r, f);
        final SparseArray q = r.Q;
        final int a = f.a;
        if (q.get(a) != null) {
            throw new IllegalStateException(L.h(a, "Trying to create an already created platform view, view id: "));
        }
        if (r.H == null) {
            throw new IllegalStateException(L.h(a, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (r.F == null) {
            throw new IllegalStateException(L.h(a, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        final f f2 = r.f(f, true);
        final View view = f2.getView();
        if (view.getParent() == null) {
            final boolean t = J5.b.T(view, (c)new B((Object)io.flutter.plugin.platform.r.Z, 23));
            final double d = f.d;
            final double c = f.c;
            if (t) {
                if (f.h == 2) {
                    io.flutter.plugin.platform.r.h(19);
                    if (!r.G.IsSurfaceControlEnabled()) {
                        return -2L;
                    }
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                else if (!r.X) {
                    io.flutter.plugin.platform.r.h(20);
                    final i l = io.flutter.plugin.platform.r.l(r.H);
                    final int o = r.o(c);
                    final int o2 = r.o(d);
                    final Activity e = r.E;
                    final m m = new m(r, f, 1);
                    final A i = D.i;
                    Object o4;
                    final Object o3 = o4 = null;
                    if (o != 0) {
                        if (o2 == 0) {
                            o4 = o3;
                        }
                        else {
                            final DisplayManager displayManager = (DisplayManager)((Context)e).getSystemService("display");
                            final DisplayMetrics displayMetrics = ((Context)e).getResources().getDisplayMetrics();
                            l.a(o, o2);
                            final StringBuilder sb = new StringBuilder("flutter-vd#");
                            final int a2 = f.a;
                            sb.append(a2);
                            final VirtualDisplay virtualDisplay = displayManager.createVirtualDisplay(sb.toString(), o, o2, displayMetrics.densityDpi, l.getSurface(), 0, (VirtualDisplay$Callback)D.i, (Handler)null);
                            if (virtualDisplay == null) {
                                o4 = o3;
                            }
                            else {
                                o4 = new D(e, r.K, virtualDisplay, f2, l, m, a2);
                            }
                        }
                    }
                    if (o4 != null) {
                        r.L.put((Object)a, o4);
                        final View view2 = f2.getView();
                        r.M.put((Object)view2.getContext(), (Object)view2);
                        return l.b();
                    }
                    final StringBuilder sb2 = new StringBuilder("Failed creating virtual display for a ");
                    sb2.append(f.b);
                    sb2.append(" with id: ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            io.flutter.plugin.platform.r.h(23);
            final int o5 = r.o(c);
            final int o6 = r.o(d);
            j j;
            long b;
            if (r.X) {
                j = new j(r.E);
                b = -1L;
            }
            else {
                final i k = io.flutter.plugin.platform.r.l(r.H);
                j = new j(r.E);
                j.H = k;
                final Surface surface = k.getSurface();
                if (surface != null) {
                    final Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                    try {
                        lockHardwareCanvas.drawColor(0, PorterDuff$Mode.CLEAR);
                    }
                    finally {
                        surface.unlockCanvasAndPost(lockHardwareCanvas);
                    }
                }
                b = k.b();
            }
            j.setTouchProcessor(r.D);
            final i h = j.H;
            if (h != null) {
                h.a(o5, o6);
            }
            final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(o5, o6);
            final int o7 = r.o(f.e);
            final int o8 = r.o(f.f);
            layoutParams.topMargin = o7;
            layoutParams.leftMargin = o8;
            j.setLayoutParams(layoutParams);
            final View view3 = f2.getView();
            view3.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(o5, o6));
            view3.setImportantForAccessibility(4);
            ((ViewGroup)j).addView(view3);
            j.setOnDescendantFocusChangeListener((View$OnFocusChangeListener)new m(r, f, 0));
            ((ViewGroup)r.F).addView((View)j);
            q.append(a, (Object)j);
            final l f3 = r.F;
            if (f3 != null) {
                f2.onFlutterViewAttached((View)f3);
            }
            return b;
        }
        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
    }
    
    public void f(final E4.f f) {
        final q q = (q)this.b;
        final HashMap hashMap = (HashMap)q.C.b;
        final String b = f.b;
        final g g = (g)hashMap.get((Object)b);
        if (g == null) {
            final StringBuilder sb = new StringBuilder("Trying to create a platform view of unregistered type: ");
            sb.append(b);
            throw new IllegalStateException(sb.toString());
        }
        final ByteBuffer i = f.i;
        Object b2;
        if (i != null) {
            b2 = g.getCreateArgsCodec().b(i);
        }
        else {
            b2 = null;
        }
        final Activity e = q.E;
        final int a = f.a;
        final f create = g.create((Context)e, a, b2);
        final View view = create.getView();
        if (view != null) {
            view.setLayoutDirection(f.g);
            q.K.put(a, (Object)create);
            final l f2 = q.F;
            if (f2 != null) {
                create.onFlutterViewAttached((View)f2);
            }
            return;
        }
        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
    }
    
    public void g(final int n) {
        switch (this.a) {
            default: {
                final q q = (q)this.b;
                final f f = (f)q.K.get(n);
                if (f == null) {
                    final StringBuilder sb = new StringBuilder("Disposing unknown platform view with id: ");
                    sb.append(n);
                    Log.e("PlatformViewsController2", sb.toString());
                }
                else {
                    if (f.getView() != null) {
                        final View view = f.getView();
                        final ViewGroup viewGroup = (ViewGroup)view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    q.K.remove(n);
                    try {
                        f.dispose();
                    }
                    catch (final RuntimeException ex) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", (Throwable)ex);
                    }
                    final SparseArray l = q.L;
                    final A4.b b = (A4.b)l.get(n);
                    if (b != null) {
                        ((ViewGroup)b).removeAllViews();
                        b.a();
                        final ViewGroup viewGroup2 = (ViewGroup)((View)b).getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView((View)b);
                        }
                        l.remove(n);
                    }
                }
                return;
            }
            case 0: {
                final r r = (r)this.b;
                final f f2 = (f)r.N.get(n);
                if (f2 == null) {
                    final StringBuilder sb2 = new StringBuilder("Disposing unknown platform view with id: ");
                    sb2.append(n);
                    Log.e("PlatformViewsController", sb2.toString());
                }
                else {
                    if (f2.getView() != null) {
                        final View view2 = f2.getView();
                        final ViewGroup viewGroup3 = (ViewGroup)view2.getParent();
                        if (viewGroup3 != null) {
                            viewGroup3.removeView(view2);
                        }
                    }
                    r.N.remove(n);
                    try {
                        f2.dispose();
                    }
                    catch (final RuntimeException ex2) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", (Throwable)ex2);
                    }
                    if (r.b(n)) {
                        final HashMap i = r.L;
                        final D d = (D)i.get((Object)n);
                        final View a = d.a();
                        if (a != null) {
                            r.M.remove((Object)a.getContext());
                        }
                        ((Dialog)d.a).cancel();
                        d.a.detachState();
                        d.h.release();
                        d.f.release();
                        i.remove((Object)n);
                    }
                    else {
                        final SparseArray q2 = r.Q;
                        final j j = (j)q2.get(n);
                        if (j != null) {
                            ((ViewGroup)j).removeAllViews();
                            final i h = j.H;
                            if (h != null) {
                                h.release();
                                j.H = null;
                            }
                            final ViewTreeObserver viewTreeObserver = ((View)j).getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                final a k = j.I;
                                if (k != null) {
                                    j.I = null;
                                    viewTreeObserver.removeOnGlobalFocusChangeListener((ViewTreeObserver$OnGlobalFocusChangeListener)k);
                                }
                            }
                            final ViewGroup viewGroup4 = (ViewGroup)((View)j).getParent();
                            if (viewGroup4 != null) {
                                viewGroup4.removeView((View)j);
                            }
                            q2.remove(n);
                        }
                        else {
                            final SparseArray o = r.O;
                            final A4.b b2 = (A4.b)o.get(n);
                            if (b2 != null) {
                                ((ViewGroup)b2).removeAllViews();
                                b2.a();
                                final ViewGroup viewGroup5 = (ViewGroup)((View)b2).getParent();
                                if (viewGroup5 != null) {
                                    viewGroup5.removeView((View)b2);
                                }
                                o.remove(n);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer)this.b).getHeight();
    }
    
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer)this.b).getSurface();
    }
    
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer)this.b).getWidth();
    }
    
    public CharSequence h(final d p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        io/flutter/plugin/platform/o.b:Ljava/lang/Object;
        //     4: checkcast       LI1/r;
        //     7: getfield        I1/r.b:Ljava/lang/Object;
        //    10: checkcast       Lio/flutter/embedding/android/FlutterActivity;
        //    13: astore          6
        //    15: aload           6
        //    17: ldc_w           "clipboard"
        //    20: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    23: checkcast       Landroid/content/ClipboardManager;
        //    26: astore_3       
        //    27: aload_3        
        //    28: invokevirtual   android/content/ClipboardManager.hasPrimaryClip:()Z
        //    31: istore_2       
        //    32: aconst_null    
        //    33: astore          4
        //    35: aconst_null    
        //    36: astore          5
        //    38: iload_2        
        //    39: ifne            48
        //    42: aload           4
        //    44: astore_3       
        //    45: goto            303
        //    48: aload_3        
        //    49: invokevirtual   android/content/ClipboardManager.getPrimaryClip:()Landroid/content/ClipData;
        //    52: astore          7
        //    54: aload           7
        //    56: ifnonnull       65
        //    59: aload           4
        //    61: astore_3       
        //    62: goto            303
        //    65: aload_1        
        //    66: ifnull          93
        //    69: aload           4
        //    71: astore_3       
        //    72: aload_1        
        //    73: getstatic       E4/d.D:LE4/d;
        //    76: if_acmpne       303
        //    79: goto            93
        //    82: astore_1       
        //    83: aload           5
        //    85: astore_3       
        //    86: goto            258
        //    89: astore_1       
        //    90: goto            289
        //    93: aload           7
        //    95: iconst_0       
        //    96: invokevirtual   android/content/ClipData.getItemAt:(I)Landroid/content/ClipData$Item;
        //    99: astore_3       
        //   100: aload_3        
        //   101: invokevirtual   android/content/ClipData$Item.getText:()Ljava/lang/CharSequence;
        //   104: astore_1       
        //   105: aload_1        
        //   106: ifnonnull       253
        //   109: aload_3        
        //   110: invokevirtual   android/content/ClipData$Item.getUri:()Landroid/net/Uri;
        //   113: astore          7
        //   115: aload           7
        //   117: ifnonnull       149
        //   120: ldc_w           "PlatformPlugin"
        //   123: ldc_w           "Clipboard item contained no textual content nor a URI to retrieve it from."
        //   126: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   129: pop            
        //   130: aload           4
        //   132: astore_3       
        //   133: goto            303
        //   136: aload_1        
        //   137: astore_3       
        //   138: aload           4
        //   140: astore_1       
        //   141: goto            258
        //   144: astore          4
        //   146: goto            136
        //   149: aload           7
        //   151: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   154: astore          5
        //   156: aload           5
        //   158: ldc_w           "content"
        //   161: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   164: ifne            210
        //   167: new             Ljava/lang/StringBuilder;
        //   170: astore_3       
        //   171: aload_3        
        //   172: ldc_w           "Clipboard item contains a Uri with scheme '"
        //   175: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   178: aload_3        
        //   179: aload           5
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: pop            
        //   185: aload_3        
        //   186: ldc_w           "'that is unhandled."
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: pop            
        //   193: ldc_w           "PlatformPlugin"
        //   196: aload_3        
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   203: pop            
        //   204: aload           4
        //   206: astore_3       
        //   207: goto            303
        //   210: aload           6
        //   212: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   215: aload           7
        //   217: ldc_w           "text/*"
        //   220: aconst_null    
        //   221: invokevirtual   android/content/ContentResolver.openTypedAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;
        //   224: astore          5
        //   226: aload_3        
        //   227: aload           6
        //   229: invokevirtual   android/content/ClipData$Item.coerceToText:(Landroid/content/Context;)Ljava/lang/CharSequence;
        //   232: astore_3       
        //   233: aload           5
        //   235: ifnull          250
        //   238: aload           5
        //   240: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   243: goto            250
        //   246: astore_1       
        //   247: goto            258
        //   250: goto            303
        //   253: aload_1        
        //   254: astore_3       
        //   255: goto            303
        //   258: ldc_w           "PlatformPlugin"
        //   261: ldc_w           "Failed to close AssetFileDescriptor while trying to read text from URI."
        //   264: aload_1        
        //   265: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   268: pop            
        //   269: goto            303
        //   272: astore_1       
        //   273: ldc_w           "PlatformPlugin"
        //   276: ldc_w           "Clipboard text was unable to be received from content URI."
        //   279: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   282: pop            
        //   283: aload           4
        //   285: astore_3       
        //   286: goto            303
        //   289: ldc_w           "PlatformPlugin"
        //   292: ldc_w           "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"
        //   295: aload_1        
        //   296: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   299: pop            
        //   300: aload           4
        //   302: astore_3       
        //   303: aload_3        
        //   304: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  48     54     89     93     Ljava/lang/SecurityException;
        //  48     54     272    289    Ljava/io/FileNotFoundException;
        //  48     54     82     89     Ljava/io/IOException;
        //  72     79     89     93     Ljava/lang/SecurityException;
        //  72     79     272    289    Ljava/io/FileNotFoundException;
        //  72     79     82     89     Ljava/io/IOException;
        //  93     105    89     93     Ljava/lang/SecurityException;
        //  93     105    272    289    Ljava/io/FileNotFoundException;
        //  93     105    82     89     Ljava/io/IOException;
        //  109    115    89     93     Ljava/lang/SecurityException;
        //  109    115    272    289    Ljava/io/FileNotFoundException;
        //  109    115    144    149    Ljava/io/IOException;
        //  120    130    89     93     Ljava/lang/SecurityException;
        //  120    130    272    289    Ljava/io/FileNotFoundException;
        //  120    130    144    149    Ljava/io/IOException;
        //  149    204    89     93     Ljava/lang/SecurityException;
        //  149    204    272    289    Ljava/io/FileNotFoundException;
        //  149    204    144    149    Ljava/io/IOException;
        //  210    233    89     93     Ljava/lang/SecurityException;
        //  210    233    272    289    Ljava/io/FileNotFoundException;
        //  210    233    144    149    Ljava/io/IOException;
        //  238    243    89     93     Ljava/lang/SecurityException;
        //  238    243    272    289    Ljava/io/FileNotFoundException;
        //  238    243    246    250    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 146 out of bounds for length 146
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
    
    public void i(int o, final double n, final double n2) {
        final r r = (r)this.b;
        if (r.b(o)) {
            return;
        }
        final j j = (j)r.Q.get(o);
        if (j == null) {
            final StringBuilder sb = new StringBuilder("Setting offset for unknown platform view with id: ");
            sb.append(o);
            Log.e("PlatformViewsController", sb.toString());
            return;
        }
        final int o2 = r.o(n);
        o = r.o(n2);
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)((View)j).getLayoutParams();
        layoutParams.topMargin = o2;
        layoutParams.leftMargin = o;
        j.setLayoutParams(layoutParams);
    }
    
    public void j(final E4.g g) {
        switch (this.a) {
            default: {
                final q q = (q)this.b;
                final float density = ((Context)q.E).getResources().getDisplayMetrics().density;
                final SparseArray k = q.K;
                final int a = g.a;
                final f f = (f)k.get(a);
                if (f == null) {
                    final StringBuilder sb = new StringBuilder("Sending touch to an unknown view with id: ");
                    sb.append(a);
                    Log.e("PlatformViewsController2", sb.toString());
                }
                else {
                    final View view = f.getView();
                    if (view == null) {
                        final StringBuilder sb2 = new StringBuilder("Sending touch to a null view with id: ");
                        sb2.append(a);
                        Log.e("PlatformViewsController2", sb2.toString());
                    }
                    else {
                        final MotionEvent l = q.M.l(new u(g.p));
                        final List list = (List)g.g;
                        final ArrayList list2 = new ArrayList();
                        for (final List list3 : list) {
                            final MotionEvent$PointerCoords motionEvent$PointerCoords = new MotionEvent$PointerCoords();
                            motionEvent$PointerCoords.orientation = (float)(double)list3.get(0);
                            motionEvent$PointerCoords.pressure = (float)(double)list3.get(1);
                            motionEvent$PointerCoords.size = (float)(double)list3.get(2);
                            final double doubleValue = (double)list3.get(3);
                            final double n = density;
                            motionEvent$PointerCoords.toolMajor = (float)(doubleValue * n);
                            motionEvent$PointerCoords.toolMinor = (float)((double)list3.get(4) * n);
                            motionEvent$PointerCoords.touchMajor = (float)((double)list3.get(5) * n);
                            motionEvent$PointerCoords.touchMinor = (float)((double)list3.get(6) * n);
                            motionEvent$PointerCoords.x = (float)((double)list3.get(7) * n);
                            motionEvent$PointerCoords.y = (float)((double)list3.get(8) * n);
                            list2.add((Object)motionEvent$PointerCoords);
                        }
                        final int e = g.e;
                        final MotionEvent$PointerCoords[] array = (MotionEvent$PointerCoords[])list2.toArray((Object[])new MotionEvent$PointerCoords[e]);
                        MotionEvent obtain;
                        if (l != null) {
                            if (array.length < 1) {
                                obtain = l;
                            }
                            else {
                                l.offsetLocation(array[0].x - l.getX(), array[0].y - l.getY());
                                obtain = l;
                            }
                        }
                        else {
                            final List list4 = (List)g.f;
                            final ArrayList list5 = new ArrayList();
                            for (final List list6 : list4) {
                                final MotionEvent$PointerProperties motionEvent$PointerProperties = new MotionEvent$PointerProperties();
                                motionEvent$PointerProperties.id = (int)list6.get(0);
                                motionEvent$PointerProperties.toolType = (int)list6.get(1);
                                list5.add((Object)motionEvent$PointerProperties);
                            }
                            obtain = MotionEvent.obtain(g.b.longValue(), g.c.longValue(), g.d, g.e, (MotionEvent$PointerProperties[])list5.toArray((Object[])new MotionEvent$PointerProperties[e]), array, g.h, g.i, g.j, g.k, g.l, g.m, g.n, g.o);
                        }
                        view.dispatchTouchEvent(obtain);
                    }
                }
                return;
            }
            case 0: {
                final r r = (r)this.b;
                final float density2 = ((Context)r.E).getResources().getDisplayMetrics().density;
                final int a2 = g.a;
                if (r.b(a2)) {
                    final D d = (D)r.L.get((Object)a2);
                    final MotionEvent n2 = r.n(density2, g, true);
                    final SingleViewPresentation a3 = d.a;
                    if (a3 != null) {
                        ((Dialog)a3).dispatchTouchEvent(n2);
                    }
                }
                else {
                    final f f2 = (f)r.N.get(a2);
                    if (f2 == null) {
                        final StringBuilder sb3 = new StringBuilder("Sending touch to an unknown view with id: ");
                        sb3.append(a2);
                        Log.e("PlatformViewsController", sb3.toString());
                    }
                    else {
                        final View view2 = f2.getView();
                        if (view2 == null) {
                            final StringBuilder sb4 = new StringBuilder("Sending touch to a null view with id: ");
                            sb4.append(a2);
                            Log.e("PlatformViewsController", sb4.toString());
                        }
                        else {
                            view2.dispatchTouchEvent(r.n(density2, g, false));
                        }
                    }
                }
            }
        }
    }
    
    public boolean k(final String s, final g g) {
        final HashMap hashMap = (HashMap)this.b;
        if (hashMap.containsKey((Object)s)) {
            return false;
        }
        hashMap.put((Object)s, (Object)g);
        return true;
    }
    
    public void l(final E4.i i, final E4.h h) {
        final r r = (r)this.b;
        final int o = r.o(i.b);
        final int o2 = r.o(i.c);
        final int a = i.a;
        if (r.b(a)) {
            final float j = r.j();
            final D d = (D)r.L.get((Object)a);
            final io.flutter.plugin.editing.j k = r.I;
            if (k != null) {
                if (k.e.b == 3) {
                    k.p = true;
                }
                final SingleViewPresentation a2 = d.a;
                if (a2 != null) {
                    if (a2.getView() != null) {
                        d.a.getView().onInputConnectionLocked();
                    }
                }
            }
            final n n = new n(this, d, j, h);
            final int width = d.f.getWidth();
            final i f = d.f;
            if (o == width && o2 == f.getHeight()) {
                d.a().postDelayed((Runnable)n, 0L);
            }
            else if (Build$VERSION.SDK_INT >= 31) {
                final View a3 = d.a();
                f.a(o, o2);
                d.h.resize(o, o2, d.d);
                d.h.setSurface(f.getSurface());
                a3.postDelayed((Runnable)n, 0L);
            }
            else {
                final boolean focused = d.a().isFocused();
                final w detachState = d.a.detachState();
                d.h.setSurface((Surface)null);
                d.h.release();
                final DisplayManager displayManager = (DisplayManager)((Context)d.b).getSystemService("display");
                f.a(o, o2);
                final StringBuilder sb = new StringBuilder("flutter-vd#");
                sb.append(d.e);
                d.h = displayManager.createVirtualDisplay(sb.toString(), o, o2, d.d, f.getSurface(), 0, (VirtualDisplay$Callback)D.i, (Handler)null);
                final View a4 = d.a();
                a4.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new O0.i(a4, n));
                final SingleViewPresentation a5 = new SingleViewPresentation((Context)d.b, d.h.getDisplay(), d.c, detachState, (View$OnFocusChangeListener)d.g, focused);
                ((Dialog)a5).show();
                ((Dialog)d.a).cancel();
                d.a = a5;
            }
            return;
        }
        final f f2 = (f)r.N.get(a);
        final j l = (j)r.Q.get(a);
        if (f2 != null && l != null) {
            if (o > l.getRenderTargetWidth() || o2 > l.getRenderTargetHeight()) {
                final i h2 = l.H;
                if (h2 != null) {
                    h2.a(o, o2);
                }
            }
            final ViewGroup$LayoutParams layoutParams = ((View)l).getLayoutParams();
            layoutParams.width = o;
            layoutParams.height = o2;
            ((View)l).setLayoutParams(layoutParams);
            final View view = f2.getView();
            if (view != null) {
                final ViewGroup$LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = o;
                layoutParams2.height = o2;
                view.setLayoutParams(layoutParams2);
            }
            final int n2 = (int)Math.round(l.getRenderTargetWidth() / (double)r.j());
            final int n3 = (int)Math.round(l.getRenderTargetHeight() / (double)r.j());
            final E4.j d2 = h.D;
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"width", (Object)(double)n2);
            hashMap.put((Object)"height", (Object)(double)n3);
            d2.success((Object)hashMap);
            return;
        }
        final StringBuilder sb2 = new StringBuilder("Resizing unknown platform view with id: ");
        sb2.append(a);
        Log.e("PlatformViewsController", sb2.toString());
    }
    
    public void m(final int n, final int n2) {
        switch (this.a) {
            default: {
                final f f = (f)((q)this.b).K.get(n);
                if (f == null) {
                    final StringBuilder sb = new StringBuilder("Setting direction to an unknown view with id: ");
                    sb.append(n);
                    Log.e("PlatformViewsController2", sb.toString());
                }
                else {
                    final View view = f.getView();
                    if (view == null) {
                        final StringBuilder sb2 = new StringBuilder("Setting direction to a null view with id: ");
                        sb2.append(n);
                        Log.e("PlatformViewsController2", sb2.toString());
                    }
                    else {
                        view.setLayoutDirection(n2);
                    }
                }
                return;
            }
            case 0: {
                if (n2 != 0 && n2 != 1) {
                    final StringBuilder sb3 = new StringBuilder("Trying to set unknown direction value: ");
                    sb3.append(n2);
                    sb3.append("(view id: ");
                    sb3.append(n);
                    sb3.append(")");
                    throw new IllegalStateException(sb3.toString());
                }
                final r r = (r)this.b;
                View view2;
                if (r.b(n)) {
                    view2 = ((D)r.L.get((Object)n)).a();
                }
                else {
                    final f f2 = (f)r.N.get(n);
                    if (f2 == null) {
                        final StringBuilder sb4 = new StringBuilder("Setting direction to an unknown view with id: ");
                        sb4.append(n);
                        Log.e("PlatformViewsController", sb4.toString());
                        return;
                    }
                    view2 = f2.getView();
                }
                if (view2 == null) {
                    final StringBuilder sb5 = new StringBuilder("Setting direction to a null view with id: ");
                    sb5.append(n);
                    Log.e("PlatformViewsController", sb5.toString());
                }
                else {
                    view2.setLayoutDirection(n2);
                }
            }
        }
    }
    
    public void n(final ArrayList list) {
        final I1.r r = (I1.r)this.b;
        r.getClass();
        int a;
        if (list.isEmpty()) {
            a = 5894;
        }
        else {
            a = 1798;
        }
        for (int i = 0; i < list.size(); ++i) {
            final int ordinal = ((Enum)list.get(i)).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    a &= 0xFFFFFDFD;
                }
            }
            else {
                a &= 0xFFFFFFFB;
            }
        }
        r.a = a;
        r.b();
    }
    
    public void o(int d) {
        final View decorView = ((FlutterActivity)((I1.r)this.b).b).getWindow().getDecorView();
        d = v.e.d(d);
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        if (d == 4) {
                            decorView.performHapticFeedback(4);
                        }
                    }
                    else {
                        decorView.performHapticFeedback(6);
                    }
                }
                else {
                    decorView.performHapticFeedback(3);
                }
            }
            else {
                decorView.performHapticFeedback(1);
            }
        }
        else {
            decorView.performHapticFeedback(0);
        }
    }
    
    public void release() {
        ((TextureRegistry$SurfaceProducer)this.b).release();
        this.b = null;
    }
    
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer)this.b).scheduleFrame();
    }
}
