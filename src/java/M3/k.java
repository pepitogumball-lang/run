package m3;

import java.util.logging.Level;
import com.google.android.gms.internal.ads.Tl;
import java.util.NoSuchElementException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import java.io.Closeable;

public final class k implements Closeable
{
    public static final Logger I;
    public final RandomAccessFile C;
    public int D;
    public int E;
    public h F;
    public h G;
    public final byte[] H;
    
    static {
        I = Logger.getLogger(k.class.getName());
    }
    
    public k(final File file) {
        final byte[] h = new byte[16];
        this.H = h;
        if (!file.exists()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(".tmp");
            final File file2 = new File(sb.toString());
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                final byte[] array = new byte[16];
                int i = 0;
                int n = 0;
                while (i < 4) {
                    n(array, n, (new int[] { 4096, 0, 0, 0 })[i]);
                    n += 4;
                    ++i;
                }
                randomAccessFile.write(array);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            }
            finally {
                randomAccessFile.close();
            }
        }
        final RandomAccessFile c = new RandomAccessFile(file, "rwd");
        (this.C = c).seek(0L);
        c.readFully(h);
        final int g = g(0, h);
        this.D = g;
        if (g <= c.length()) {
            this.E = g(4, h);
            final int g2 = g(8, h);
            final int g3 = g(12, h);
            this.F = this.f(g2);
            this.G = this.f(g3);
            return;
        }
        final StringBuilder sb2 = new StringBuilder("File is truncated. Expected length: ");
        sb2.append(this.D);
        sb2.append(", Actual length: ");
        sb2.append(c.length());
        throw new IOException(sb2.toString());
    }
    
    public static int g(final int n, final byte[] array) {
        return ((array[n] & 0xFF) << 24) + ((array[n + 1] & 0xFF) << 16) + ((array[n + 2] & 0xFF) << 8) + (array[n + 3] & 0xFF);
    }
    
    public static void n(final byte[] array, final int n, final int n2) {
        array[n] = (byte)(n2 >> 24);
        array[n + 1] = (byte)(n2 >> 16);
        array[n + 2] = (byte)(n2 >> 8);
        array[n + 3] = (byte)n2;
    }
    
    public final void a(final byte[] array) {
        final int length = array.length;
        monitorenter(this);
        Label_0176: {
            if (length < 0) {
                break Label_0176;
            }
            Label_0172: {
                try {
                    if (length > array.length) {
                        throw new IndexOutOfBoundsException();
                    }
                    this.b(length);
                    final boolean d = this.d();
                    int l;
                    if (d) {
                        l = 16;
                    }
                    else {
                        final h g = this.G;
                        l = this.l(g.a + 4 + g.b);
                    }
                    final h h = new h(l, length);
                    n(this.H, 0, length);
                    this.j(this.H, l, 4);
                    this.j(array, l + 4, length);
                    int a;
                    if (d) {
                        a = l;
                    }
                    else {
                        a = this.F.a;
                    }
                    this.m(this.D, this.E + 1, a, l);
                    this.G = h;
                    ++this.E;
                    if (d) {
                        this.F = h;
                    }
                    break Label_0172;
                }
                finally {
                    monitorexit(this);
                    throw new IndexOutOfBoundsException();
                    monitorexit(this);
                }
            }
        }
    }
    
    public final void b(int n) {
        final int n2 = n + 4;
        int n3 = this.D - this.k();
        if (n3 >= n2) {
            return;
        }
        n = this.D;
        int i;
        int d;
        do {
            i = n3 + n;
            d = n << 1;
            n3 = i;
            n = d;
        } while (i < n2);
        final RandomAccessFile c = this.C;
        c.setLength((long)d);
        c.getChannel().force(true);
        final h g = this.G;
        n = this.l(g.a + 4 + g.b);
        if (n < this.F.a) {
            final FileChannel channel = c.getChannel();
            channel.position((long)this.D);
            final long n4 = n - 4;
            if (channel.transferTo(16L, n4, (WritableByteChannel)channel) != n4) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        final int a = this.G.a;
        n = this.F.a;
        if (a < n) {
            final int n5 = this.D + a - 16;
            this.m(d, this.E, n, n5);
            this.G = new h(n5, this.G.b);
        }
        else {
            this.m(d, this.E, n, a);
        }
        this.D = d;
    }
    
    public final void c(final j j) {
        monitorenter(this);
        Label_0084: {
            try {
                int n = this.F.a;
                for (int i = 0; i < this.E; ++i) {
                    final h f = this.f(n);
                    j.b(new i(this, f), f.b);
                    n = this.l(f.a + 4 + f.b);
                }
                break Label_0084;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    public final void close() {
        synchronized (this) {
            this.C.close();
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            return this.E == 0;
        }
    }
    
    public final h f(final int n) {
        if (n == 0) {
            return h.c;
        }
        final long n2 = n;
        final RandomAccessFile c = this.C;
        c.seek(n2);
        return new h(n, c.readInt());
    }
    
    public final void h() {
        k k = this;
        monitorenter(this);
        try {
            if (!this.d()) {
                Label_0192: {
                    if (this.E == 1) {
                        k = this;
                        synchronized (this) {
                            this.m(4096, 0, 0, 0);
                            this.E = 0;
                            final h c = h.c;
                            this.F = c;
                            this.G = c;
                            if (this.D > 4096) {
                                final RandomAccessFile c2 = this.C;
                                c2.setLength((long)4096);
                                c2.getChannel().force(true);
                            }
                            this.D = 4096;
                            break Label_0192;
                        }
                    }
                    final h f = this.F;
                    final int l = this.l(f.a + 4 + f.b);
                    this.i(l, 0, 4, this.H);
                    final int g = g(0, this.H);
                    this.m(this.D, this.E - 1, l, this.G.a);
                    --this.E;
                    this.F = new h(l, g);
                }
                monitorexit(k);
                return;
            }
            throw new NoSuchElementException();
        }
        finally {
            monitorexit(k);
            throw new NoSuchElementException();
        }
    }
    
    public final void i(int l, final int n, final int n2, final byte[] array) {
        l = this.l(l);
        final int d = this.D;
        final RandomAccessFile c = this.C;
        if (l + n2 <= d) {
            c.seek((long)l);
            c.readFully(array, n, n2);
        }
        else {
            final int n3 = d - l;
            c.seek((long)l);
            c.readFully(array, n, n3);
            c.seek(16L);
            c.readFully(array, n + n3, n2 - n3);
        }
    }
    
    public final void j(final byte[] array, int l, final int n) {
        l = this.l(l);
        final int d = this.D;
        final RandomAccessFile c = this.C;
        if (l + n <= d) {
            c.seek((long)l);
            c.write(array, 0, n);
        }
        else {
            final int n2 = d - l;
            c.seek((long)l);
            c.write(array, 0, n2);
            c.seek(16L);
            c.write(array, n2, n - n2);
        }
    }
    
    public final int k() {
        if (this.E == 0) {
            return 16;
        }
        final h g = this.G;
        final int a = g.a;
        final int a2 = this.F.a;
        if (a >= a2) {
            return a - a2 + 4 + g.b + 16;
        }
        return a + 4 + g.b + this.D - a2;
    }
    
    public final int l(int n) {
        final int d = this.D;
        if (n >= d) {
            n = n + 16 - d;
        }
        return n;
    }
    
    public final void m(final int n, final int n2, final int n3, final int n4) {
        final byte[] h = this.H;
        int i = 0;
        int n5 = 0;
        while (i < 4) {
            n(h, n5, (new int[] { n, n2, n3, n4 })[i]);
            n5 += 4;
            ++i;
        }
        final RandomAccessFile c = this.C;
        c.seek(0L);
        c.write(h);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(k.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.D);
        sb.append(", size=");
        sb.append(this.E);
        sb.append(", first=");
        sb.append((Object)this.F);
        sb.append(", last=");
        sb.append((Object)this.G);
        sb.append(", element lengths=[");
        try {
            this.c((j)new Tl(sb));
        }
        catch (final IOException ex) {
            k.I.log(Level.WARNING, "read error", (Throwable)ex);
        }
        sb.append("]]");
        return sb.toString();
    }
}
