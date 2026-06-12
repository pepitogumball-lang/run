package H;

import android.os.ParcelFileDescriptor;
import java.lang.reflect.AccessibleObject;
import android.net.Uri;
import android.content.ContentResolver;
import java.util.Map;
import java.util.Collections;
import n3.u0;
import java.util.HashMap;
import java.io.IOException;
import android.graphics.Typeface$Builder;
import android.os.CancellationSignal;
import android.content.res.Resources;
import G.f;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.content.res.AssetManager;
import android.util.Log;
import android.graphics.fonts.FontVariationAxis;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class i extends g
{
    public final Class k;
    public final Constructor l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;
    public final Method q;
    
    public i() {
        Class k = null;
        java.lang.reflect.Constructor<?> constructor = null;
        Method o = null;
        Object q = null;
        Object method = null;
        Method method2 = null;
        Method method3 = null;
        Label_0146: {
            try {
                final Class<?> forName = Class.forName("android.graphics.FontFamily");
                constructor = forName.getConstructor((Class<?>[])null);
                o = O(forName);
                q = Integer.TYPE;
                method = forName.getMethod("addFontFromBuffer", ByteBuffer.class, (Class)q, FontVariationAxis[].class, (Class)q, (Class)q);
                method2 = forName.getMethod("freeze", (Class[])null);
                method3 = forName.getMethod("abortCreation", (Class[])null);
                q = this.P(forName);
                k = forName;
                break Label_0146;
            }
            catch (final NoSuchMethodException q) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(((Class)q).getClass().getName()), (Throwable)q);
            final Class clazz = null;
            constructor = null;
            final java.lang.reflect.Constructor<?> constructor2 = (java.lang.reflect.Constructor<?>)(method = constructor);
            method2 = (method3 = (Method)method);
            o = (Method)constructor2;
            q = clazz;
        }
        this.k = k;
        this.l = constructor;
        this.m = o;
        this.n = (Method)method;
        this.o = method2;
        this.p = method3;
        this.q = (Method)q;
    }
    
    public static Method O(final Class clazz) {
        final Class type = Integer.TYPE;
        return clazz.getMethod("addFontFromAssetManager", AssetManager.class, String.class, type, Boolean.TYPE, type, type, type, FontVariationAxis[].class);
    }
    
    public final void I(final Object o) {
        try {
            this.p.invoke(o, (Object[])null);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {}
    }
    
    public final boolean J(final Context context, final Object o, final String s, final int n, final int n2, final int n3, final FontVariationAxis[] array) {
        final boolean b = false;
        try {
            return (boolean)this.m.invoke(o, new Object[] { context.getAssets(), s, 0, Boolean.FALSE, n, n2, n3, array });
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return b;
        }
    }
    
    public Typeface K(final Object o) {
        try {
            final Object instance = Array.newInstance(this.k, 1);
            Array.set(instance, 0, o);
            return (Typeface)this.q.invoke((Object)null, new Object[] { instance, -1, -1 });
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final boolean L(final Object o) {
        try {
            return (boolean)this.o.invoke(o, (Object[])null);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public final boolean M() {
        final Method m = this.m;
        if (m == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return m != null;
    }
    
    public final Object N() {
        Object instance = null;
        try {
            instance = this.l.newInstance((Object[])null);
            return instance;
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return instance;
        }
    }
    
    public Method P(Class class1) {
        class1 = Array.newInstance((Class)class1, 1).getClass();
        final Class type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, type, type);
        ((AccessibleObject)declaredMethod).setAccessible(true);
        return declaredMethod;
    }
    
    @Override
    public final Typeface h(final Context context, final f f, final Resources resources, int i) {
        if (!this.M()) {
            return super.h(context, f, resources, i);
        }
        final Object n = this.N();
        if (n == null) {
            return null;
        }
        final G.g[] a = f.a;
        int length;
        G.g g;
        for (length = a.length, i = 0; i < length; ++i) {
            g = a[i];
            if (!this.J(context, n, g.a, g.e, g.b, g.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(g.d))) {
                this.I(n);
                return null;
            }
        }
        if (!this.L(n)) {
            return null;
        }
        return this.K(n);
    }
    
    @Override
    public final Typeface i(Context context, final L.g[] array, final int n) {
        if (array.length < 1) {
            return null;
        }
        if (!this.M()) {
            final L.g l = this.l(array, n);
            final ContentResolver contentResolver = context.getContentResolver();
            try {
                context = (Context)contentResolver.openFileDescriptor(l.a, "r", (CancellationSignal)null);
                if (context == null) {
                    if (context != null) {
                        ((ParcelFileDescriptor)context).close();
                    }
                    return null;
                }
                try {
                    final Typeface build = new Typeface$Builder(((ParcelFileDescriptor)context).getFileDescriptor()).setWeight(l.c).setItalic(l.d).build();
                    ((ParcelFileDescriptor)context).close();
                    return build;
                }
                finally {
                    try {
                        ((ParcelFileDescriptor)context).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)(Object)array).addSuppressed(t);
                    }
                }
            }
            catch (final IOException ex) {
                return null;
            }
        }
        final HashMap hashMap = new HashMap();
        for (final L.g g : array) {
            if (g.e == 0) {
                final Uri a = g.a;
                if (!hashMap.containsKey((Object)a)) {
                    hashMap.put((Object)a, (Object)u0.r(context, a));
                }
            }
        }
        final Map unmodifiableMap = Collections.unmodifiableMap((Map)hashMap);
        context = (Context)this.N();
        if (context == null) {
            return null;
        }
        final int length2 = array.length;
        int j = 0;
        boolean b = false;
        while (j < length2) {
            final L.g g2 = array[j];
            final ByteBuffer byteBuffer = (ByteBuffer)unmodifiableMap.get((Object)g2.a);
            if (byteBuffer != null) {
                final int b2 = g2.b;
                final int c = g2.c;
                final int d = g2.d ? 1 : 0;
                boolean booleanValue;
                try {
                    booleanValue = (boolean)this.n.invoke((Object)context, new Object[] { byteBuffer, b2, null, c, d });
                }
                catch (final IllegalAccessException | InvocationTargetException ex2) {
                    booleanValue = false;
                }
                if (!booleanValue) {
                    this.I(context);
                    return null;
                }
                b = true;
            }
            ++j;
        }
        if (!b) {
            this.I(context);
            return null;
        }
        if (!this.L(context)) {
            return null;
        }
        final Typeface k = this.K(context);
        if (k == null) {
            return null;
        }
        return Typeface.create(k, n);
    }
    
    public final Typeface k(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!this.M()) {
            return super.k(context, resources, n, s, n2);
        }
        final Object n3 = this.N();
        if (n3 == null) {
            return null;
        }
        if (!this.J(context, n3, s, 0, -1, -1, null)) {
            this.I(n3);
            return null;
        }
        if (!this.L(n3)) {
            return null;
        }
        return this.K(n3);
    }
}
