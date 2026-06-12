package q3;

import java.io.Writer;
import R0.m;
import java.io.FilenameFilter;
import java.io.IOException;
import android.util.Log;
import java.util.Locale;
import n3.K0;
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.io.File;
import java.util.List;
import k3.j;
import C2.z;
import java.util.concurrent.atomic.AtomicInteger;
import k3.h;
import java.nio.charset.Charset;

public final class a
{
    public static final Charset e;
    public static final int f;
    public static final o3.a g;
    public static final L.a h;
    public static final h i;
    public final AtomicInteger a;
    public final c b;
    public final z c;
    public final j d;
    
    static {
        e = Charset.forName("UTF-8");
        f = 15;
        g = (o3.a)new Object();
        h = new L.a(3);
        i = new h(2);
    }
    
    public a(final c b, final z c, final j d) {
        this.a = new AtomicInteger(0);
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static void a(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((File)iterator.next()).delete();
        }
    }
    
    public static String e(File file) {
        final byte[] array = new byte[8192];
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        file = (File)new FileInputStream(file);
        Label_0047: {
            try {
                while (true) {
                    final int read = ((FileInputStream)file).read(array);
                    if (read <= 0) {
                        break Label_0047;
                    }
                    byteArrayOutputStream.write(array, 0, read);
                }
            }
            finally {
                try {
                    ((FileInputStream)file).close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
                final String s = new String(byteArrayOutputStream.toByteArray(), a.e);
                ((FileInputStream)file).close();
                return s;
            }
        }
    }
    
    public static void f(final File file, final String s) {
        final OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), a.e);
        try {
            ((Writer)outputStreamWriter).write(s);
            outputStreamWriter.close();
        }
        finally {
            try {
                outputStreamWriter.close();
            }
            finally {
                final Throwable t;
                ((Throwable)file).addSuppressed(t);
            }
        }
    }
    
    public final ArrayList b() {
        final ArrayList list = new ArrayList();
        final c b = this.b;
        list.addAll((Collection)q3.c.j(((File)b.I).listFiles()));
        list.addAll((Collection)q3.c.j(((File)b.J).listFiles()));
        final L.a h = q3.a.h;
        Collections.sort((List)list, (Comparator)h);
        final List j = q3.c.j(((File)b.H).listFiles());
        Collections.sort(j, (Comparator)h);
        list.addAll((Collection)j);
        return list;
    }
    
    public final NavigableSet c() {
        return new TreeSet((Collection)q3.c.j(((File)this.b.G).list())).descendingSet();
    }
    
    public final void d(final K0 k0, final String s, final boolean b) {
        final c b2 = this.b;
        final m a = this.c.f().a;
        q3.a.g.getClass();
        final String t = o3.a.a.t((Object)k0);
        final String format = String.format(Locale.US, "%010d", new Object[] { this.a.getAndIncrement() });
        String s2;
        if (b) {
            s2 = "_";
        }
        else {
            s2 = "";
        }
        final String g = m0.a.g("event", format, s2);
        try {
            f(b2.e(s, g), t);
        }
        catch (final IOException ex) {
            final StringBuilder sb = new StringBuilder("Could not persist event for session ");
            sb.append(s);
            Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)ex);
        }
        final h h = new h(3);
        b2.getClass();
        final File file = new File((File)b2.G, s);
        file.mkdirs();
        final List j = q3.c.j(file.listFiles((FilenameFilter)h));
        Collections.sort(j, (Comparator)new L.a(4));
        int size = j.size();
        for (final File file2 : j) {
            if (size <= a.D) {
                break;
            }
            q3.c.i(file2);
            --size;
        }
    }
}
