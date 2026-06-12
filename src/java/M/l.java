package m;

import java.lang.ref.Reference;
import F4.e;
import java.nio.ByteBuffer;
import O.e0;
import com.google.android.gms.internal.auth.h;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.BaseInterpolator;
import android.os.Trace;
import java.util.Objects;
import android.util.Log;
import java.util.List;
import java.util.Iterator;
import O.d0;
import X.a;
import c0.b;
import F4.d;
import x4.i;
import V4.G;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import F4.f;

public final class l implements f
{
    public long C;
    public boolean D;
    public final Object E;
    public Object F;
    public Object G;
    public final Object H;
    
    public l() {
        this.C = -1L;
        this.H = new k(this);
        this.E = new ArrayList();
    }
    
    public l(final FlutterJNI e, final AssetManager f, final long c) {
        this.D = false;
        final G g = new G((Object)this, 23);
        this.E = e;
        this.F = f;
        this.C = c;
        final i g2 = new i(e);
        ((i)(this.G = g2)).l("flutter/isolate", (d)g, (b)null);
        this.H = new a((Object)g2, 25);
        if (e.isAttached()) {
            this.D = true;
        }
    }
    
    public void a() {
        if (!this.D) {
            return;
        }
        final Iterator iterator = ((ArrayList)this.E).iterator();
        while (iterator.hasNext()) {
            ((d0)iterator.next()).b();
        }
        this.D = false;
    }
    
    public void b(final x4.a a, final List list) {
        if (this.D) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        a5.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString((Object)a);
            ((FlutterJNI)this.E).runBundleAndSnapshotFromLibrary(a.a, a.c, a.b, (AssetManager)this.F, (List<String>)list, this.C);
            this.D = true;
            Trace.endSection();
        }
        finally {
            try {
                Trace.endSection();
            }
            finally {
                final Throwable t;
                ((Throwable)list).addSuppressed(t);
            }
        }
    }
    
    public void c() {
        if (this.D) {
            return;
        }
        for (final d0 d0 : (ArrayList)this.E) {
            final long c = this.C;
            if (c >= 0L) {
                d0.c(c);
            }
            final BaseInterpolator interpolator = (BaseInterpolator)this.F;
            if (interpolator != null) {
                final View view = (View)((Reference)d0.a).get();
                if (view != null) {
                    view.animate().setInterpolator((TimeInterpolator)interpolator);
                }
            }
            if (this.G != null) {
                d0.d((e0)this.H);
            }
            final View view2 = (View)((Reference)d0.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.D = true;
    }
    
    public void f(final String s, final d d) {
        ((a)this.H).f(s, d);
    }
    
    public b i(final F4.k k) {
        return ((i)((a)this.H).D).i(k);
    }
    
    public void j(final String s, final ByteBuffer byteBuffer, final e e) {
        ((a)this.H).j(s, byteBuffer, e);
    }
    
    public void k(final String s, final ByteBuffer byteBuffer) {
        ((a)this.H).k(s, byteBuffer);
    }
    
    public void l(final String s, final d d, final b b) {
        ((a)this.H).l(s, d, b);
    }
}
