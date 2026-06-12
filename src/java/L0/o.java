package L0;

import O.k0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import android.view.DisplayCutout;
import O.n0;
import C2.d0;
import O.t0;
import android.content.res.Resources;
import android.view.Display;
import java.lang.reflect.Field;
import I0.b;
import O.h0;
import O.i0;
import O.j0;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.graphics.Rect;
import android.content.res.Configuration;
import n5.h;
import K2.G0;
import android.view.WindowManager;
import android.os.Build$VERSION;
import android.app.Activity;
import java.util.Collection;
import java.util.ArrayList;
import d5.a;

public final class o implements n
{
    public static final int b = 0;
    
    static {
        final ArrayList list = new ArrayList((Collection)new a((Object[])new Integer[] { 1, 2, 4, 8, 16, 32, 64, 128 }, true));
    }
    
    public static m a(final Activity activity) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        Rect rect = null;
        Label_0349: {
            if (sdk_INT >= 30) {
                rect = G0.e(G0.r((WindowManager)((Context)activity).getSystemService((Class)WindowManager.class)));
                h.d("wm.currentWindowMetrics.bounds", (Object)rect);
            }
            else if (sdk_INT >= 29) {
                final Configuration configuration = ((Context)activity).getResources().getConfiguration();
                Label_0178: {
                    Label_0163: {
                        Label_0148: {
                            try {
                                final Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                                ((AccessibleObject)declaredField).setAccessible(true);
                                final Object value = declaredField.get((Object)configuration);
                                final Object invoke = value.getClass().getDeclaredMethod("getBounds", (Class<?>[])null).invoke(value, (Object[])null);
                                h.c("null cannot be cast to non-null type android.graphics.Rect", invoke);
                                rect = new Rect((Rect)invoke);
                                break Label_0349;
                            }
                            catch (final InvocationTargetException ex) {}
                            catch (final IllegalAccessException ex2) {
                                break Label_0148;
                            }
                            catch (final NoSuchMethodException ex3) {
                                break Label_0163;
                            }
                            catch (final NoSuchFieldException ex4) {
                                break Label_0178;
                            }
                            final InvocationTargetException ex;
                            Log.w("o", (Throwable)ex);
                            rect = b(activity);
                            break Label_0349;
                        }
                        final IllegalAccessException ex2;
                        Log.w("o", (Throwable)ex2);
                        rect = b(activity);
                        break Label_0349;
                    }
                    final NoSuchMethodException ex3;
                    Log.w("o", (Throwable)ex3);
                    rect = b(activity);
                    break Label_0349;
                }
                final NoSuchFieldException ex4;
                Log.w("o", (Throwable)ex4);
                rect = b(activity);
            }
            else if (sdk_INT >= 28) {
                rect = b(activity);
            }
            else {
                final Rect rect2 = new Rect();
                final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect2);
                rect = rect2;
                if (!activity.isInMultiWindowMode()) {
                    final Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    final Resources resources = ((Context)activity).getResources();
                    final int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize;
                    if (identifier > 0) {
                        dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                    }
                    else {
                        dimensionPixelSize = 0;
                    }
                    final int bottom = rect2.bottom + dimensionPixelSize;
                    if (bottom == point.y) {
                        rect2.bottom = bottom;
                        rect = rect2;
                    }
                    else {
                        final int right = rect2.right + dimensionPixelSize;
                        rect = rect2;
                        if (right == point.x) {
                            rect2.right = right;
                            rect = rect2;
                        }
                    }
                }
            }
        }
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        t0 t0;
        if (sdk_INT2 >= 30) {
            if (sdk_INT2 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            t0 = P0.a.a.a((Context)activity);
        }
        else {
            Object o;
            if (sdk_INT2 >= 30) {
                o = new j0();
            }
            else if (sdk_INT2 >= 29) {
                o = new i0();
            }
            else {
                o = new h0();
            }
            t0 = ((k0)o).b();
            h.d("{\n            WindowInse\u2026ilder().build()\n        }", (Object)t0);
        }
        return new m(new b(rect), t0);
    }
    
    public static Rect b(final Activity activity) {
        final Rect rect = new Rect();
        final Configuration configuration = ((Context)activity).getResources().getConfiguration();
        final DisplayCutout displayCutout = null;
        Label_0249: {
            Label_0227: {
                Label_0202: {
                    Label_0177: {
                        Label_0152: {
                            Object value;
                            try {
                                final Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                                ((AccessibleObject)declaredField).setAccessible(true);
                                value = declaredField.get((Object)configuration);
                                if (activity.isInMultiWindowMode()) {
                                    final Object invoke = value.getClass().getDeclaredMethod("getBounds", (Class<?>[])null).invoke(value, (Object[])null);
                                    h.c("null cannot be cast to non-null type android.graphics.Rect", invoke);
                                    rect.set((Rect)invoke);
                                    break Label_0249;
                                }
                            }
                            catch (final InvocationTargetException ex) {
                                break Label_0152;
                            }
                            catch (final IllegalAccessException ex2) {
                                break Label_0177;
                            }
                            catch (final NoSuchMethodException ex3) {
                                break Label_0202;
                            }
                            catch (final NoSuchFieldException ex4) {
                                break Label_0227;
                            }
                            final Object invoke2 = value.getClass().getDeclaredMethod("getAppBounds", (Class<?>[])null).invoke(value, (Object[])null);
                            h.c("null cannot be cast to non-null type android.graphics.Rect", invoke2);
                            rect.set((Rect)invoke2);
                            break Label_0249;
                        }
                        final InvocationTargetException ex;
                        Log.w("o", (Throwable)ex);
                        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                        break Label_0249;
                    }
                    final IllegalAccessException ex2;
                    Log.w("o", (Throwable)ex2);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                    break Label_0249;
                }
                final NoSuchMethodException ex3;
                Log.w("o", (Throwable)ex3);
                activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                break Label_0249;
            }
            final NoSuchFieldException ex4;
            Log.w("o", (Throwable)ex4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        final Point point = new Point();
        h.d("currentDisplay", (Object)defaultDisplay);
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            final Resources resources = ((Context)activity).getResources();
            final int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize;
            if (identifier > 0) {
                dimensionPixelSize = resources.getDimensionPixelSize(identifier);
            }
            else {
                dimensionPixelSize = 0;
            }
            final int bottom = rect.bottom + dimensionPixelSize;
            if (bottom == point.y) {
                rect.bottom = bottom;
            }
            else {
                final int right = rect.right + dimensionPixelSize;
                if (right == point.x) {
                    rect.right = right;
                }
                else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            DisplayCutout l = null;
            Label_0636: {
                Label_0626: {
                    Label_0613: {
                        Label_0600: {
                            Label_0587: {
                                Label_0574: {
                                    try {
                                        final java.lang.reflect.Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class<?>[])null);
                                        ((AccessibleObject)constructor).setAccessible(true);
                                        final Object instance = constructor.newInstance((Object[])null);
                                        final Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", instance.getClass());
                                        ((AccessibleObject)declaredMethod).setAccessible(true);
                                        declaredMethod.invoke((Object)defaultDisplay, new Object[] { instance });
                                        final Field declaredField2 = instance.getClass().getDeclaredField("displayCutout");
                                        ((AccessibleObject)declaredField2).setAccessible(true);
                                        final Object value2 = declaredField2.get(instance);
                                        l = displayCutout;
                                        if (d0.B(value2)) {
                                            l = d0.l(value2);
                                        }
                                        break Label_0636;
                                    }
                                    catch (final InstantiationException ex5) {}
                                    catch (final InvocationTargetException ex6) {
                                        break Label_0574;
                                    }
                                    catch (final IllegalAccessException ex7) {
                                        break Label_0587;
                                    }
                                    catch (final NoSuchFieldException ex8) {
                                        break Label_0600;
                                    }
                                    catch (final NoSuchMethodException ex9) {
                                        break Label_0613;
                                    }
                                    catch (final ClassNotFoundException ex10) {
                                        break Label_0626;
                                    }
                                    final InstantiationException ex5;
                                    Log.w("o", (Throwable)ex5);
                                    l = displayCutout;
                                    break Label_0636;
                                }
                                final InvocationTargetException ex6;
                                Log.w("o", (Throwable)ex6);
                                l = displayCutout;
                                break Label_0636;
                            }
                            final IllegalAccessException ex7;
                            Log.w("o", (Throwable)ex7);
                            l = displayCutout;
                            break Label_0636;
                        }
                        final NoSuchFieldException ex8;
                        Log.w("o", (Throwable)ex8);
                        l = displayCutout;
                        break Label_0636;
                    }
                    final NoSuchMethodException ex9;
                    Log.w("o", (Throwable)ex9);
                    l = displayCutout;
                    break Label_0636;
                }
                final ClassNotFoundException ex10;
                Log.w("o", (Throwable)ex10);
                l = displayCutout;
            }
            if (l != null) {
                if (rect.left == n0.y(l)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == n0.D(l)) {
                    rect.right += n0.D(l);
                }
                if (rect.top == n0.a(l)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == n0.C(l)) {
                    rect.bottom += n0.C(l);
                }
            }
        }
        return rect;
    }
}
