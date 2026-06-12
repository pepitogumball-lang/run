package x4;

import java.nio.Buffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import android.os.Trace;
import com.google.android.gms.internal.auth.m;
import android.os.Build$VERSION;
import a5.a;
import java.nio.ByteBuffer;
import X4.C;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.HashMap;
import io.flutter.embedding.engine.FlutterJNI;
import F4.f;

public final class i implements f, j
{
    public final FlutterJNI C;
    public final HashMap D;
    public final HashMap E;
    public final Object F;
    public final AtomicBoolean G;
    public final HashMap H;
    public int I;
    public final k J;
    public final WeakHashMap K;
    public final C L;
    
    public i(final FlutterJNI c) {
        final C l = new C(21);
        l.D = c2.k.t().F;
        this.D = new HashMap();
        this.E = new HashMap();
        this.F = new Object();
        this.G = new AtomicBoolean(false);
        this.H = new HashMap();
        this.I = 1;
        this.J = new k();
        this.K = new WeakHashMap();
        this.C = c;
        this.L = l;
    }
    
    public final void a(final String s, final e e, final ByteBuffer byteBuffer, final int n, final long n2) {
        d b;
        if (e != null) {
            b = e.b;
        }
        else {
            b = null;
        }
        final StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
        sb.append(s);
        final String a = a5.a.a(sb.toString());
        Label_0161: {
            if (Build$VERSION.SDK_INT >= 29) {
                C0.a.a(n, m.D(a));
            }
            else {
                final String d = m.D(a);
                Label_0154: {
                    try {
                        if (m.d == null) {
                            m.d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                        }
                    }
                    catch (final Exception ex) {
                        break Label_0154;
                    }
                    m.d.invoke((Object)null, new Object[] { m.b, d, n });
                    break Label_0161;
                }
                final Exception ex;
                m.o("asyncTraceBegin", ex);
            }
        }
        final b b2 = new b(this, s, n, e, byteBuffer, n2);
        d j = b;
        if (b == null) {
            j = this.J;
        }
        j.a(b2);
    }
    
    public final void f(final String s, final F4.d d) {
        this.l(s, d, null);
    }
    
    public final c0.b i(final F4.k k) {
        final C l = this.L;
        l.getClass();
        final h h = new h((ExecutorService)l.D);
        final Object o = new Object();
        this.K.put(o, (Object)h);
        return (c0.b)o;
    }
    
    public final void j(final String s, final ByteBuffer byteBuffer, final F4.e e) {
        final StringBuilder sb = new StringBuilder("DartMessenger#send on ");
        sb.append(s);
        a.b(sb.toString());
        Label_0065: {
            try {
                final int n = this.I++;
                if (e != null) {
                    this.H.put((Object)n, (Object)e);
                }
                break Label_0065;
            }
            finally {
                try {
                    Trace.endSection();
                }
                finally {
                    final Throwable t;
                    ((Throwable)s).addSuppressed(t);
                }
                final FlutterJNI c = this.C;
                iftrue(Label_0084:)(byteBuffer != null);
                while (true) {
                    final int n;
                    Block_5: {
                        break Block_5;
                        Trace.endSection();
                        return;
                        Label_0084: {
                            c.dispatchPlatformMessage(s, byteBuffer, ((Buffer)byteBuffer).position(), n);
                        }
                        continue;
                    }
                    c.dispatchEmptyPlatformMessage(s, n);
                    continue;
                }
            }
        }
    }
    
    public final void k(final String s, final ByteBuffer byteBuffer) {
        this.j(s, byteBuffer, null);
    }
    
    public final void l(final String s, final F4.d d, final c0.b b) {
        if (d == null) {
            final Object f = this.F;
            synchronized (f) {
                this.D.remove((Object)s);
                return;
            }
        }
        d d2;
        if (b != null) {
            d2 = (d)this.K.get((Object)b);
            if (d2 == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        }
        else {
            d2 = null;
        }
        final Object f2;
        monitorenter(f2 = this.F);
        Label_0131: {
            try {
                this.D.put((Object)s, (Object)new e(d, d2));
                final List list = (List)this.E.remove((Object)s);
                if (list == null) {
                    monitorexit(f2);
                    return;
                }
                break Label_0131;
            }
            finally {
                monitorexit(f2);
                while (true) {
                    final Iterator iterator;
                    iftrue(Label_0191:)(!iterator.hasNext());
                    Block_11: {
                        break Block_11;
                        monitorexit(f2);
                        final List list;
                        iterator = list.iterator();
                        continue;
                        Label_0191: {
                            return;
                        }
                    }
                    final c c = (c)iterator.next();
                    this.a(s, (e)this.D.get((Object)s), c.a, c.b, c.c);
                    continue;
                }
            }
        }
    }
}
