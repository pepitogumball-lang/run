package m3;

import java.util.Locale;
import h1.w;
import java.io.Closeable;
import k3.g;
import java.io.IOException;
import android.util.Log;
import java.io.File;
import java.nio.charset.Charset;

public final class l implements c
{
    public static final Charset E;
    public final File C;
    public k D;
    
    static {
        E = Charset.forName("UTF-8");
    }
    
    public l(final File c) {
        this.C = c;
    }
    
    public final void a() {
        final File c = this.C;
        if (this.D == null) {
            try {
                this.D = new k(c);
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder("Could not open log file: ");
                sb.append((Object)c);
                Log.e("FirebaseCrashlytics", sb.toString(), (Throwable)ex);
            }
        }
    }
    
    public final void b() {
        g.b((Closeable)this.D, "There was a problem closing the Crashlytics log file.");
        this.D = null;
    }
    
    public final String d() {
        final boolean exists = this.C.exists();
        String s = null;
        w w = null;
        Label_0109: {
            if (exists) {
                this.a();
                final k d = this.D;
                if (d != null) {
                    final int[] array = { 0 };
                    final byte[] array2 = new byte[d.k()];
                    try {
                        this.D.c((j)new e(array2, array));
                    }
                    catch (final IOException ex) {
                        Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", (Throwable)ex);
                    }
                    w = new w(array2, array[0]);
                    break Label_0109;
                }
            }
            w = null;
        }
        byte[] array3;
        if (w == null) {
            array3 = null;
        }
        else {
            final int c = w.C;
            final byte[] array4 = new byte[c];
            System.arraycopy((Object)w.D, 0, (Object)array4, 0, c);
            array3 = array4;
        }
        if (array3 != null) {
            s = new String(array3, l.E);
        }
        return s;
    }
    
    public final void e(String s, final long n) {
        this.a();
        if (this.D != null) {
            String s2;
            if ((s2 = s) == null) {
                s2 = "null";
            }
            s = s2;
            Label_0166: {
                try {
                    if (s2.length() > 16384) {
                        final StringBuilder sb = new StringBuilder("...");
                        sb.append(s2.substring(s2.length() - 16384));
                        s = sb.toString();
                    }
                }
                catch (final IOException ex) {
                    break Label_0166;
                }
                s = s.replaceAll("\r", " ").replaceAll("\n", " ");
                this.D.a(String.format(Locale.US, "%d %s%n", new Object[] { n, s }).getBytes(l.E));
                while (!this.D.d() && this.D.k() > 65536) {
                    this.D.h();
                }
                return;
            }
            final IOException ex;
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", (Throwable)ex);
        }
    }
}
