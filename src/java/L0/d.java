package L0;

import b1.f;
import java.lang.reflect.Method;
import n5.p;
import android.graphics.Rect;
import android.app.Activity;
import androidx.window.extensions.core.util.function.Consumer;
import android.content.Context;
import java.lang.reflect.Modifier;
import n5.h;
import m5.a;
import n5.i;

public final class d extends i implements a
{
    public final int D;
    public final e E;
    
    public final Object b() {
        switch (this.D) {
            default: {
                final e e = this.E;
                final Class loadClass = ((ClassLoader)e.c.D).loadClass("androidx.window.extensions.WindowExtensions");
                h.d("loader.loadClass(WindowE\u2026.WINDOW_EXTENSIONS_CLASS)", (Object)loadClass);
                final Method method = loadClass.getMethod("getWindowLayoutComponent", (Class[])null);
                final Class loadClass2 = e.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d("loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)", (Object)loadClass2);
                h.d("getWindowLayoutComponentMethod", (Object)method);
                return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(loadClass2);
            }
            case 2: {
                final Class loadClass3 = this.E.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d("loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)", (Object)loadClass3);
                final Method method2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                final Method method3 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                h.d("addListenerMethod", (Object)method2);
                if (Modifier.isPublic(method2.getModifiers())) {
                    h.d("removeListenerMethod", (Object)method3);
                    if (Modifier.isPublic(method3.getModifiers())) {
                        return true;
                    }
                }
                return false;
            }
            case 1: {
                final e e2 = this.E;
                final f b2 = e2.b;
                Class n;
                try {
                    n = b2.n();
                }
                catch (final ClassNotFoundException ex) {
                    n = null;
                }
                Boolean b3;
                if (n == null) {
                    b3 = Boolean.FALSE;
                }
                else {
                    final Class loadClass4 = e2.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    h.d("loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)", (Object)loadClass4);
                    final Method method4 = loadClass4.getMethod("addWindowLayoutInfoListener", Activity.class, n);
                    final Method method5 = loadClass4.getMethod("removeWindowLayoutInfoListener", n);
                    h.d("addListenerMethod", (Object)method4);
                    boolean b4 = false;
                    Label_0348: {
                        if (Modifier.isPublic(method4.getModifiers())) {
                            h.d("removeListenerMethod", (Object)method5);
                            if (Modifier.isPublic(method5.getModifiers())) {
                                b4 = true;
                                break Label_0348;
                            }
                        }
                        b4 = false;
                    }
                    b3 = b4;
                }
                return b3;
            }
            case 0: {
                final Class loadClass5 = this.E.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                h.d("loader.loadClass(FOLDING_FEATURE_CLASS)", (Object)loadClass5);
                final Method method6 = loadClass5.getMethod("getBounds", (Class[])null);
                final Method method7 = loadClass5.getMethod("getType", (Class[])null);
                final Method method8 = loadClass5.getMethod("getState", (Class[])null);
                h.d("getBoundsMethod", (Object)method6);
                if (com.google.android.gms.internal.auth.h.l(method6, p.a((Class)Rect.class)) && Modifier.isPublic(method6.getModifiers())) {
                    h.d("getTypeMethod", (Object)method7);
                    final Class type = Integer.TYPE;
                    if (com.google.android.gms.internal.auth.h.l(method7, p.a(type)) && Modifier.isPublic(method7.getModifiers())) {
                        h.d("getStateMethod", (Object)method8);
                        if (com.google.android.gms.internal.auth.h.l(method8, p.a(type)) && Modifier.isPublic(method8.getModifiers())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
    }
}
