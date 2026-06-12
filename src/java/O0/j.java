package O0;

import java.util.Map;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.util.ArrayList;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarInterface$SidecarCallback;
import E.m;
import N.a;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;
import L0.l;
import android.app.Activity;
import n5.h;
import android.content.Context;
import c2.k;
import java.util.LinkedHashMap;
import androidx.window.sidecar.SidecarInterface;

public final class j
{
    public final SidecarInterface a;
    public final f b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public k e;
    
    public j(final Context context) {
        h.e("context", (Object)context);
        final SidecarInterface b = O0.h.b(context);
        final f b2 = new f();
        this.a = b;
        this.b = b2;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }
    
    public final SidecarInterface d() {
        return this.a;
    }
    
    public final l e(final Activity activity) {
        final IBinder a = O0.h.a(activity);
        if (a == null) {
            return new l((List)d5.l.C);
        }
        final SidecarInterface a2 = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo;
        if (a2 != null) {
            windowLayoutInfo = a2.getWindowLayoutInfo(a);
        }
        else {
            windowLayoutInfo = null;
        }
        final SidecarInterface a3 = this.a;
        SidecarDeviceState deviceState;
        if (a3 == null || (deviceState = a3.getDeviceState()) == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.b.e(windowLayoutInfo, deviceState);
    }
    
    public final void f(final Activity activity) {
        final IBinder a = O0.h.a(activity);
        if (a == null) {
            return;
        }
        final SidecarInterface a2 = this.a;
        if (a2 != null) {
            a2.onWindowLayoutChangeListenerRemoved(a);
        }
        final LinkedHashMap d = this.d;
        final a a3 = (a)d.get((Object)activity);
        if (a3 != null) {
            if (activity instanceof m) {
                ((m)activity).removeOnConfigurationChangedListener(a3);
            }
            ((Map)d).remove((Object)activity);
        }
        final k e = this.e;
        if (e != null) {
            e.f(activity);
        }
        final LinkedHashMap c = this.c;
        final boolean b = ((Map)c).size() == 1;
        ((Map)c).remove((Object)a);
        if (b) {
            final SidecarInterface a4 = this.a;
            if (a4 != null) {
                a4.onDeviceStateListenersChanged(true);
            }
        }
    }
    
    public final void g(final IBinder binder, final Activity activity) {
        final LinkedHashMap c = this.c;
        ((Map)c).put((Object)binder, (Object)activity);
        final SidecarInterface a = this.a;
        if (a != null) {
            a.onWindowLayoutChangeListenerAdded(binder);
        }
        if (((Map)c).size() == 1) {
            final SidecarInterface a2 = this.a;
            if (a2 != null) {
                a2.onDeviceStateListenersChanged(false);
            }
        }
        final k e = this.e;
        if (e != null) {
            e.A(activity, this.e(activity));
        }
        final LinkedHashMap d = this.d;
        if (d.get((Object)activity) == null && activity instanceof m) {
            final g g = new g(this, activity);
            ((Map)d).put((Object)activity, (Object)g);
            ((m)activity).addOnConfigurationChangedListener((a)g);
        }
    }
    
    public final void h(final C2.f f) {
        this.e = new k(f);
        final SidecarInterface a = this.a;
        if (a != null) {
            a.setSidecarCallback((SidecarInterface$SidecarCallback)new DistinctElementSidecarCallback(this.b, (SidecarInterface$SidecarCallback)new SidecarCompat$TranslatingCallback(this)));
        }
    }
    
    public final boolean i() {
        boolean b = false;
        try {
            final SidecarInterface a = this.a;
            Method method = null;
            Label_0039: {
                if (a != null) {
                    final Class<? extends SidecarInterface> class1 = a.getClass();
                    if (class1 != null) {
                        method = class1.getMethod("setSidecarCallback", SidecarInterface$SidecarCallback.class);
                        break Label_0039;
                    }
                }
                method = null;
            }
            Class returnType;
            if (method != null) {
                returnType = method.getReturnType();
            }
            else {
                returnType = null;
            }
            final Class type = Void.TYPE;
            if (!h.a((Object)returnType, (Object)type)) {
                final StringBuilder sb = new StringBuilder("Illegal return type for 'setSidecarCallback': ");
                sb.append((Object)returnType);
                throw new NoSuchMethodException(sb.toString());
            }
            final SidecarInterface a2 = this.a;
            if (a2 != null) {
                a2.getDeviceState();
            }
            final SidecarInterface a3 = this.a;
            if (a3 != null) {
                a3.onDeviceStateListenersChanged(true);
            }
            final SidecarInterface a4 = this.a;
            Method method2 = null;
            Label_0138: {
                if (a4 != null) {
                    final Class<? extends SidecarInterface> class2 = a4.getClass();
                    if (class2 != null) {
                        method2 = class2.getMethod("getWindowLayoutInfo", IBinder.class);
                        break Label_0138;
                    }
                }
                method2 = null;
            }
            Class returnType2;
            if (method2 != null) {
                returnType2 = method2.getReturnType();
            }
            else {
                returnType2 = null;
            }
            if (!h.a((Object)returnType2, (Object)SidecarWindowLayoutInfo.class)) {
                final StringBuilder sb2 = new StringBuilder("Illegal return type for 'getWindowLayoutInfo': ");
                sb2.append((Object)returnType2);
                throw new NoSuchMethodException(sb2.toString());
            }
            final SidecarInterface a5 = this.a;
            Method method3 = null;
            Label_0200: {
                if (a5 != null) {
                    final Class<? extends SidecarInterface> class3 = a5.getClass();
                    if (class3 != null) {
                        method3 = class3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                        break Label_0200;
                    }
                }
                method3 = null;
            }
            Class returnType3;
            if (method3 != null) {
                returnType3 = method3.getReturnType();
            }
            else {
                returnType3 = null;
            }
            if (!h.a((Object)returnType3, (Object)type)) {
                final StringBuilder sb3 = new StringBuilder("Illegal return type for 'onWindowLayoutChangeListenerAdded': ");
                sb3.append((Object)returnType3);
                throw new NoSuchMethodException(sb3.toString());
            }
            final SidecarInterface a6 = this.a;
            Method method4 = null;
            Label_0261: {
                if (a6 != null) {
                    final Class<? extends SidecarInterface> class4 = a6.getClass();
                    if (class4 != null) {
                        method4 = class4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        break Label_0261;
                    }
                }
                method4 = null;
            }
            Class returnType4;
            if (method4 != null) {
                returnType4 = method4.getReturnType();
            }
            else {
                returnType4 = null;
            }
            if (h.a((Object)returnType4, (Object)type)) {
                final SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                try {
                    sidecarDeviceState.posture = 3;
                }
                catch (final NoSuchFieldError noSuchFieldError) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke((Object)sidecarDeviceState, new Object[] { 3 });
                    final Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class<?>[])null).invoke((Object)sidecarDeviceState, (Object[])null);
                    h.c("null cannot be cast to non-null type kotlin.Int", invoke);
                    if ((int)invoke != 3) {
                        throw new Exception("Invalid device posture getter/setter");
                    }
                }
                final SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                final Rect rect = sidecarDisplayFeature.getRect();
                h.d("displayFeature.rect", (Object)rect);
                sidecarDisplayFeature.setRect(rect);
                sidecarDisplayFeature.getType();
                sidecarDisplayFeature.setType(1);
                final SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                try {
                    final List displayFeatures = sidecarWindowLayoutInfo.displayFeatures;
                    return b;
                }
                catch (final NoSuchFieldError noSuchFieldError2) {
                    final ArrayList list = new ArrayList();
                    ((List)list).add((Object)sidecarDisplayFeature);
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke((Object)sidecarWindowLayoutInfo, new Object[] { list });
                    final Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class<?>[])null).invoke((Object)sidecarWindowLayoutInfo, (Object[])null);
                    h.c("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>", invoke2);
                    if (h.a((Object)list, (Object)invoke2)) {
                        return b;
                    }
                    throw new Exception("Invalid display feature getter/setter");
                }
                throw new Exception("Invalid device posture getter/setter");
            }
            final StringBuilder sb4 = new StringBuilder("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ");
            sb4.append((Object)returnType4);
            throw new NoSuchMethodException(sb4.toString());
        }
        finally {
            b = false;
        }
        return b;
    }
}
