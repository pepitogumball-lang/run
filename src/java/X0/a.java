package x0;

import androidx.lifecycle.b0;
import java.lang.reflect.AccessibleObject;
import androidx.lifecycle.I;
import E4.j;
import F4.o;
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import java.util.Collection;
import java.util.HashSet;
import androidx.lifecycle.c0;
import F4.g;
import java.util.HashMap;
import androidx.lifecycle.Q;
import androidx.lifecycle.s;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import F4.h;
import F4.n;
import androidx.lifecycle.r;

public final class a implements r, n, h
{
    public final int C;
    public Object D;
    
    public final void d(final t t, final m m) {
        switch (this.C) {
            default: {
                if (m == m.ON_CREATE) {
                    t.getLifecycle().b((s)this);
                    ((Q)this.D).c();
                    return;
                }
                final StringBuilder sb = new StringBuilder("Next event must be ON_CREATE, it was ");
                sb.append((Object)m);
                throw new IllegalStateException(sb.toString().toString());
            }
            case 3: {
                new HashMap();
                final androidx.lifecycle.h[] array = (androidx.lifecycle.h[])this.D;
                if (array.length > 0) {
                    final androidx.lifecycle.h h = array[0];
                    throw null;
                }
                if (array.length <= 0) {
                    return;
                }
                final androidx.lifecycle.h h2 = array[0];
                throw null;
            }
            case 2: {
                if (m == m.ON_STOP) {
                    this.D.getClass();
                }
                return;
            }
            case 1: {
                if (m == m.ON_START) {
                    final g g = (g)this.D;
                    if (g != null) {
                        g.a((Object)"foreground");
                        return;
                    }
                }
                if (m == m.ON_STOP) {
                    final g g2 = (g)this.D;
                    if (g2 != null) {
                        g2.a((Object)"background");
                    }
                }
                return;
            }
            case 0: {
                if (m == m.ON_CREATE) {
                    t.getLifecycle().b((s)this);
                    final x0.g g3 = (x0.g)this.D;
                    final Bundle a = g3.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (a != null) {
                        final ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
                        if (stringArrayList == null) {
                            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        }
                        for (Object savedStateRegistry : stringArrayList) {
                            try {
                                Object o = Class.forName((String)savedStateRegistry, false, a.class.getClassLoader()).asSubclass(c.class);
                                n5.h.d("{\n                Class.\u2026class.java)\n            }", o);
                                try {
                                    final Constructor declaredConstructor = ((Class)o).getDeclaredConstructor((Class[])null);
                                    ((AccessibleObject)declaredConstructor).setAccessible(true);
                                    try {
                                        o = declaredConstructor.newInstance((Object[])null);
                                        n5.h.d("{\n                constr\u2026wInstance()\n            }", o);
                                        o = o;
                                        if (!(g3 instanceof c0)) {
                                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                        }
                                        o = ((c0)g3).getViewModelStore();
                                        savedStateRegistry = g3.getSavedStateRegistry();
                                        o.getClass();
                                        final LinkedHashMap a2 = ((b0)o).a;
                                        o = new HashSet((Collection)a2.keySet()).iterator();
                                        while (((Iterator)o).hasNext()) {
                                            final String s = (String)((Iterator)o).next();
                                            n5.h.e("key", (Object)s);
                                            final W w = (W)a2.get((Object)s);
                                            n5.h.b((Object)w);
                                            P.a(w, (e)savedStateRegistry, ((t)g3).getLifecycle());
                                        }
                                        if (!new HashSet((Collection)a2.keySet()).isEmpty()) {
                                            ((e)savedStateRegistry).d();
                                            continue;
                                        }
                                        continue;
                                    }
                                    catch (final Exception ex) {
                                        throw new RuntimeException(m0.a.f("Failed to instantiate ", (String)savedStateRegistry), (Throwable)ex);
                                    }
                                }
                                catch (final NoSuchMethodException ex2) {
                                    final StringBuilder sb2 = new StringBuilder("Class ");
                                    sb2.append(((Class)o).getSimpleName());
                                    sb2.append(" must have default constructor in order to be automatically recreated");
                                    throw new IllegalStateException(sb2.toString(), (Throwable)ex2);
                                }
                            }
                            catch (final ClassNotFoundException ex3) {
                                throw new RuntimeException(m0.a.g("Class ", (String)savedStateRegistry, " wasn't found"), (Throwable)ex3);
                            }
                            break;
                        }
                    }
                    return;
                }
                throw new AssertionError((Object)"Next event must be ON_CREATE");
            }
        }
    }
    
    public void i(final Object o) {
        this.D = null;
    }
    
    public void m(final Object o, final g d) {
        this.D = d;
    }
    
    public void onMethodCall(final F4.m m, final o o) {
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"stop")) {
            if (!a.equals((Object)"start")) {
                ((j)o).notImplemented();
            }
            else {
                I.K.H.a((s)this);
            }
        }
        else {
            I.K.H.b((s)this);
        }
    }
}
