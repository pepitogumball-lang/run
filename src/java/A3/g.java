package A3;

import java.util.Iterator;
import x3.d;
import java.util.Map;
import java.util.Collection;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.lang.annotation.Annotation;
import java.io.ByteArrayOutputStream;
import com.google.android.gms.internal.measurement.L;
import java.util.HashMap;
import java.io.OutputStream;
import x3.c;
import java.nio.charset.Charset;
import x3.e;

public final class g implements e
{
    public static final Charset f;
    public static final c g;
    public static final c h;
    public static final f i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final f d;
    public final i e;
    
    static {
        f = Charset.forName("UTF-8");
        g = new c("key", L.o(L.n((Class)A3.e.class, new a(1))));
        h = new c("value", L.o(L.n((Class)A3.e.class, new a(2))));
        i = new f(0);
    }
    
    public g(final ByteArrayOutputStream a, final HashMap b, final HashMap c, final f d) {
        this.e = new i(this);
        this.a = (OutputStream)a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static int j(final c c) {
        final A3.e e = (A3.e)c.b.get((Object)A3.e.class);
        if (e != null) {
            return ((a)e).a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }
    
    @Override
    public final e a(final c c, final double n) {
        this.d(c, n, true);
        return this;
    }
    
    @Override
    public final e b(final c c, final int n) {
        this.e(c, n, true);
        return this;
    }
    
    @Override
    public final e c(final c c, final long n) {
        if (n != 0L) {
            final A3.e e = (A3.e)c.b.get((Object)A3.e.class);
            if (e == null) {
                throw new RuntimeException("Field has no @Protobuf config");
            }
            this.k(((a)e).a << 3);
            this.l(n);
        }
        return this;
    }
    
    public final void d(final c c, final double n, final boolean b) {
        if (b && n == 0.0) {
            return;
        }
        this.k(j(c) << 3 | 0x1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(n).array());
    }
    
    public final void e(final c c, final int n, final boolean b) {
        if (b && n == 0) {
            return;
        }
        final A3.e e = (A3.e)c.b.get((Object)A3.e.class);
        if (e != null) {
            this.k(((a)e).a << 3);
            this.k(n);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }
    
    @Override
    public final e f(final c c, final boolean b) {
        this.e(c, b ? 1 : 0, true);
        return this;
    }
    
    @Override
    public final e g(final c c, final Object o) {
        this.h(c, o, true);
        return this;
    }
    
    public final void h(final c c, final Object o, final boolean b) {
        if (o == null) {
            return;
        }
        if (o instanceof CharSequence) {
            final CharSequence charSequence = (CharSequence)o;
            if (b && charSequence.length() == 0) {
                return;
            }
            this.k(j(c) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(A3.g.f);
            this.k(bytes.length);
            this.a.write(bytes);
        }
        else {
            if (o instanceof Collection) {
                final Iterator iterator = ((Collection)o).iterator();
                while (iterator.hasNext()) {
                    this.h(c, iterator.next(), false);
                }
                return;
            }
            if (o instanceof Map) {
                final Iterator iterator2 = ((Map)o).entrySet().iterator();
                while (iterator2.hasNext()) {
                    this.i(A3.g.i, c, iterator2.next(), false);
                }
                return;
            }
            if (o instanceof Double) {
                this.d(c, (double)o, b);
                return;
            }
            if (o instanceof Float) {
                final float floatValue = (float)o;
                if (!b || floatValue != 0.0f) {
                    this.k(j(c) << 3 | 0x5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
                return;
            }
            if (o instanceof Number) {
                final long longValue = ((Number)o).longValue();
                if (!b || longValue != 0L) {
                    final A3.e e = (A3.e)c.b.get((Object)A3.e.class);
                    if (e == null) {
                        throw new RuntimeException("Field has no @Protobuf config");
                    }
                    this.k(((a)e).a << 3);
                    this.l(longValue);
                }
                return;
            }
            if (o instanceof Boolean) {
                this.e(c, ((boolean)o) ? 1 : 0, b);
                return;
            }
            if (o instanceof byte[]) {
                final byte[] array = (byte[])o;
                if (b && array.length == 0) {
                    return;
                }
                this.k(j(c) << 3 | 0x2);
                this.k(array.length);
                this.a.write(array);
            }
            else {
                final d d = (d)this.b.get((Object)o.getClass());
                if (d != null) {
                    this.i(d, c, o, b);
                    return;
                }
                final x3.f f = (x3.f)this.c.get((Object)o.getClass());
                if (f != null) {
                    final i e2 = this.e;
                    e2.a = false;
                    e2.c = c;
                    e2.b = b;
                    ((x3.a)f).a(o, e2);
                    return;
                }
                if (o instanceof A3.c) {
                    this.e(c, ((A3.c)o).a(), true);
                    return;
                }
                if (o instanceof Enum) {
                    this.e(c, ((Enum)o).ordinal(), true);
                    return;
                }
                this.i(this.d, c, o, b);
            }
        }
    }
    
    public final void i(final d p0, final c p1, final Object p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/io/OutputStream.<init>:()V
        //     7: astore          7
        //     9: aload           7
        //    11: lconst_0       
        //    12: putfield        A3/b.C:J
        //    15: aload_0        
        //    16: getfield        A3/g.a:Ljava/io/OutputStream;
        //    19: astore          8
        //    21: aload_0        
        //    22: aload           7
        //    24: putfield        A3/g.a:Ljava/io/OutputStream;
        //    27: aload_1        
        //    28: aload_3        
        //    29: aload_0        
        //    30: invokeinterface x3/a.a:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    35: aload_0        
        //    36: aload           8
        //    38: putfield        A3/g.a:Ljava/io/OutputStream;
        //    41: aload           7
        //    43: getfield        A3/b.C:J
        //    46: lstore          5
        //    48: aload           7
        //    50: invokevirtual   java/io/OutputStream.close:()V
        //    53: iload           4
        //    55: ifeq            66
        //    58: lload           5
        //    60: lconst_0       
        //    61: lcmp           
        //    62: ifne            66
        //    65: return         
        //    66: aload_0        
        //    67: aload_2        
        //    68: invokestatic    A3/g.j:(Lx3/c;)I
        //    71: iconst_3       
        //    72: ishl           
        //    73: iconst_2       
        //    74: ior            
        //    75: invokevirtual   A3/g.k:(I)V
        //    78: aload_0        
        //    79: lload           5
        //    81: invokevirtual   A3/g.l:(J)V
        //    84: aload_1        
        //    85: aload_3        
        //    86: aload_0        
        //    87: invokeinterface x3/a.a:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    92: return         
        //    93: astore_1       
        //    94: goto            106
        //    97: astore_1       
        //    98: aload_0        
        //    99: aload           8
        //   101: putfield        A3/g.a:Ljava/io/OutputStream;
        //   104: aload_1        
        //   105: athrow         
        //   106: aload           7
        //   108: invokevirtual   java/io/OutputStream.close:()V
        //   111: goto            120
        //   114: astore_2       
        //   115: aload_1        
        //   116: aload_2        
        //   117: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   120: aload_1        
        //   121: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  15     27     93     122    Any
        //  27     35     97     106    Any
        //  35     48     93     122    Any
        //  98     106    93     122    Any
        //  106    111    114    120    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void k(int n) {
        while ((n & 0xFFFFFF80) != 0x0L) {
            this.a.write((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write(n & 0x7F);
    }
    
    public final void l(long n) {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.a.write(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write((int)n & 0x7F);
    }
}
