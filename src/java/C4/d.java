package c4;

import java.nio.Buffer;
import com.google.android.gms.internal.ads.Io;
import com.google.android.gms.internal.ads.pG;
import org.json.JSONArray;
import java.util.Date;
import org.json.JSONObject;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.qC;
import android.media.MediaCodec$CryptoInfo;
import android.media.MediaCodec$CryptoInfo$Pattern;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.a0;
import java.util.Arrays;
import com.google.android.gms.internal.ads.Bm;
import com.google.android.gms.internal.ads.U1;
import com.google.android.gms.internal.ads.PC;
import com.google.android.gms.internal.ads.lG;
import java.nio.ByteBuffer;
import K2.p1;

public final class d
{
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    
    public static p1 d(p1 p4, long c, final ByteBuffer byteBuffer, int n) {
        p1 p5;
        long n2;
        int i;
        while (true) {
            p5 = p4;
            n2 = c;
            i = n;
            if (c < p4.D) {
                break;
            }
            p4 = (p1)p4.F;
        }
        while (i > 0) {
            final int min = Math.min(i, (int)(p5.D - n2));
            final lG lg = (lG)p5.E;
            final byte[] a = lg.a;
            c = p5.C;
            lg.getClass();
            byteBuffer.put(a, (int)(n2 - c), min);
            n = i - min;
            c = (n2 += min);
            i = n;
            if (c == p5.D) {
                p5 = (p1)p5.F;
                n2 = c;
                i = n;
            }
        }
        return p5;
    }
    
    public static p1 e(p1 p4, long n, final byte[] array, final int n2) {
        while (n >= p4.D) {
            p4 = (p1)p4.F;
        }
        int n3;
        long n4;
        for (int i = n2; i > 0; i = n3, n = n4) {
            final int min = Math.min(i, (int)(p4.D - n));
            final lG lg = (lG)p4.E;
            final byte[] a = lg.a;
            final long c = p4.C;
            lg.getClass();
            System.arraycopy((Object)a, (int)(n - c), (Object)array, n2 - i, min);
            n3 = i - min;
            n4 = n + min;
            i = n3;
            n = n4;
            if (n4 == p4.D) {
                p4 = (p1)p4.F;
            }
        }
        return p4;
    }
    
    public static p1 f(p1 p4, final PC pc, final U1 u1, final Bm bm) {
        p1 p5 = p4;
        if (((Io)pc).a(1073741824)) {
            final long e = u1.E;
            bm.g(1);
            p4 = e(p4, e, bm.a, 1);
            final long n = e + 1L;
            final byte[] a = bm.a;
            final int n2 = 0;
            final byte b = a[0];
            final int n3 = b & 0x7F;
            final qC d = pc.d;
            final byte[] a2 = d.a;
            if (a2 == null) {
                d.a = new byte[16];
            }
            else {
                Arrays.fill(a2, (byte)0);
            }
            final boolean b2 = (b & 0x80) != 0x0;
            p4 = e(p4, n, d.a, n3);
            long n4 = n + n3;
            int a3;
            if (b2) {
                bm.g(2);
                p4 = e(p4, n4, bm.a, 2);
                n4 += 2L;
                a3 = bm.A();
            }
            else {
                a3 = 1;
            }
            final int[] d2 = d.d;
            int[] array = null;
            Label_0211: {
                if (d2 != null) {
                    array = d2;
                    if (d2.length >= a3) {
                        break Label_0211;
                    }
                }
                array = new int[a3];
            }
            final int[] e2 = d.e;
            int[] array2 = null;
            Label_0241: {
                if (e2 != null) {
                    array2 = e2;
                    if (e2.length >= a3) {
                        break Label_0241;
                    }
                }
                array2 = new int[a3];
            }
            if (b2) {
                final int n5 = a3 * 6;
                bm.g(n5);
                final p1 e3 = e(p4, n4, bm.a, n5);
                final long n6 = n4 + n5;
                bm.j(0);
                int n7 = n2;
                while (true) {
                    n4 = n6;
                    p4 = e3;
                    if (n7 >= a3) {
                        break;
                    }
                    array[n7] = bm.A();
                    array2[n7] = bm.z();
                    ++n7;
                }
            }
            else {
                array2[array[0] = 0] = u1.D - (int)(n4 - u1.E);
            }
            final a0 a4 = (a0)u1.F;
            final int a5 = co.a;
            final byte[] b3 = a4.b;
            final byte[] a6 = d.a;
            d.f = a3;
            d.d = array;
            d.e = array2;
            d.b = b3;
            d.a = a6;
            final int a7 = a4.a;
            d.c = a7;
            final int c = a4.c;
            d.g = c;
            final int d3 = a4.d;
            d.h = d3;
            final MediaCodec$CryptoInfo i = d.i;
            i.numSubSamples = a3;
            i.numBytesOfClearData = array;
            i.numBytesOfEncryptedData = array2;
            i.key = b3;
            i.iv = a6;
            i.mode = a7;
            if (co.a >= 24) {
                final gr j = d.j;
                j.getClass();
                final MediaCodec$CryptoInfo$Pattern pattern = (MediaCodec$CryptoInfo$Pattern)j.D;
                pattern.set(c, d3);
                ((MediaCodec$CryptoInfo)j.C).setPattern(pattern);
            }
            final long e4 = u1.E;
            final int n8 = (int)(n4 - e4);
            u1.E = e4 + n8;
            u1.D -= n8;
            p5 = p4;
        }
        if (((Io)pc).a(268435456)) {
            bm.g(4);
            p4 = e(p5, u1.E, bm.a, 4);
            final int z = bm.z();
            u1.E += 4L;
            u1.D -= 4;
            pc.e(z);
            final p1 d4 = d(p4, u1.E, pc.e, z);
            u1.E += z;
            final int d5 = u1.D - z;
            u1.D = d5;
            final ByteBuffer h = pc.h;
            if (h != null && ((Buffer)h).capacity() >= d5) {
                pc.h.clear();
            }
            else {
                pc.h = ByteBuffer.allocate(d5);
            }
            p4 = d(d4, u1.E, pc.h, u1.D);
        }
        else {
            pc.e(u1.D);
            p4 = d(p5, u1.E, pc.e, u1.D);
        }
        return p4;
    }
    
    public e a() {
        return new e((JSONObject)this.b, (Date)this.d, (JSONArray)this.e, (JSONObject)this.c, this.a, (JSONArray)this.f);
    }
    
    public void b(final long n) {
        if (n != -1L) {
            p1 d;
            while (true) {
                d = (p1)this.c;
                if (n >= d.D) {
                    final pG pg = (pG)this.f;
                    final lG lg = (lG)d.E;
                    synchronized (pg) {
                        pg.d[pg.c++] = lg;
                        --pg.b;
                        pg.notifyAll();
                        monitorexit(pg);
                        final p1 p = (p1)this.c;
                        p.E = null;
                        final p1 c = (p1)p.F;
                        p.F = null;
                        this.c = c;
                        continue;
                    }
                    break;
                }
                break;
            }
            if (((p1)this.d).C < d.C) {
                this.d = d;
            }
        }
    }
    
    public int c(final int n) {
        final p1 p = (p1)this.e;
        if (p.E == null) {
            final pG pg = (pG)this.f;
            final pG pg2;
            monitorenter(pg2 = pg);
        Label_0157_Outer:
            while (true) {
                try {
                    final int b = pg.b + 1;
                    pg.b = b;
                    final int c = pg.c;
                    if (c <= 0) {
                        break Label_0157_Outer;
                    }
                    final lG[] d = pg.d;
                    final int c2 = c - 1;
                    pg.c = c2;
                    final lG e = d[c2];
                    if (e != null) {
                        d[c2] = null;
                        break Label_0132;
                    }
                    throw null;
                }
                finally {
                    monitorexit(pg2);
                    throw null;
                    while (true) {
                        final p1 f = new p1(((p1)this.e).D);
                        final lG e;
                        p.E = e;
                        p.F = f;
                        return Math.min(n, (int)(((p1)this.e).D - this.a));
                        monitorexit(pg2);
                        continue;
                        Label_0138: {
                            final lG[] d2;
                            final int length;
                            pg.d = (lG[])Arrays.copyOf((Object[])d2, length + length);
                        }
                        monitorexit(pg2);
                        continue;
                    }
                    final lG e = new lG(new byte[65536]);
                    final lG[] d2 = pg.d;
                    final int length = d2.length;
                    final int b;
                    iftrue(Label_0138:)(b > length);
                    continue Label_0157_Outer;
                }
                break;
            }
        }
        return Math.min(n, (int)(((p1)this.e).D - this.a));
    }
}
