package H;

import android.net.Uri;
import t.j;
import java.nio.channels.FileChannel;
import java.io.File;
import G.g;
import java.io.IOException;
import java.nio.channels.FileChannel$MapMode;
import java.io.FileInputStream;
import n3.u0;
import android.content.res.Resources;
import G.f;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.util.List;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import com.google.android.gms.internal.auth.m;

public final class h extends m
{
    public static final Class f;
    public static final Constructor g;
    public static final Method h;
    public static final Method i;
    
    static {
        Constructor g2 = null;
        Class<?> forName = null;
        Method method = null;
        Method method2 = null;
        Label_0108: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                final java.lang.reflect.Constructor<?> constructor = forName.getConstructor((Class<?>[])null);
                final Class type = Integer.TYPE;
                method = forName.getMethod("addFontWeightStyle", ByteBuffer.class, type, List.class, type, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class)forName, 1).getClass());
                g2 = constructor;
                break Label_0108;
            }
            catch (final NoSuchMethodException forName) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi24Impl", forName.getClass().getName(), (Throwable)forName);
            forName = null;
            method2 = (method = null);
        }
        g = g2;
        f = forName;
        h = method;
        i = method2;
    }
    
    public static boolean G(final Object o, final ByteBuffer byteBuffer, final int n, final int n2, final boolean b) {
        try {
            return (boolean)H.h.h.invoke(o, new Object[] { byteBuffer, n, null, n2, b });
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public static Typeface H(final Object o) {
        try {
            final Object instance = Array.newInstance(H.h.f, 1);
            Array.set(instance, 0, o);
            return (Typeface)H.h.i.invoke((Object)null, new Object[] { instance });
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final Typeface h(final Context context, f f, final Resources resources, int i) {
        Object instance;
        try {
            instance = H.h.g.newInstance((Object[])null);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        final g[] a = f.a;
        final int length = a.length;
        i = 0;
    Label_0070_Outer:
        while (i < length) {
            final g g = a[i];
            final int f2 = g.f;
            final File n = u0.n(context);
            Label_0075: {
                if (n != null) {
                    break Label_0075;
                }
                while (true) {
                    f = null;
                    Label_0170: {
                        break Label_0170;
                        try {
                            if (!u0.h(n, resources, f2)) {
                                continue;
                            }
                            try {
                                final FileInputStream fileInputStream = new FileInputStream(n);
                                try {
                                    final FileChannel channel = fileInputStream.getChannel();
                                    channel.map(FileChannel$MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                }
                                finally {
                                    try {
                                        fileInputStream.close();
                                    }
                                    finally {
                                        final Throwable t;
                                        ((Throwable)f).addSuppressed(t);
                                    }
                                }
                            }
                            catch (final IOException ex2) {
                                f = null;
                            }
                            n.delete();
                            if (f == null) {
                                return null;
                            }
                            if (!G(instance, (ByteBuffer)f, g.e, g.b, g.c)) {
                                return null;
                            }
                            ++i;
                            continue Label_0070_Outer;
                        }
                        finally {
                            n.delete();
                        }
                    }
                    break;
                }
            }
            break;
        }
        return H(instance);
    }
    
    public final Typeface i(final Context context, final L.g[] array, final int n) {
        Object instance;
        try {
            instance = H.h.g.newInstance((Object[])null);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        final j j = new j();
        for (final L.g g : array) {
            final Uri a = g.a;
            Object r;
            if ((r = j.getOrDefault((Object)a, (Object)null)) == null) {
                r = u0.r(context, a);
                j.put((Object)a, r);
            }
            if (r == null) {
                return null;
            }
            if (!G(instance, (ByteBuffer)r, g.b, g.c, g.d)) {
                return null;
            }
        }
        final Typeface h = H(instance);
        if (h == null) {
            return null;
        }
        return Typeface.create(h, n);
    }
}
