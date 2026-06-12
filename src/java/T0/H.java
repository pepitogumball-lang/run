package t0;

import android.view.View;
import java.util.concurrent.TimeUnit;
import android.os.Trace;
import K.k;
import com.google.android.gms.internal.ads.em;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import com.google.android.gms.internal.ads.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import K2.J0;

public final class h implements Runnable
{
    public static final ThreadLocal G;
    public static final J0 H;
    public ArrayList C;
    public long D;
    public long E;
    public ArrayList F;
    
    static {
        G = new ThreadLocal();
        H = new J0(4);
    }
    
    public final void a(final RecyclerView recyclerView, final int a, final int b) {
        if (recyclerView.O && this.D == 0L) {
            this.D = recyclerView.getNanoTime();
            ((View)recyclerView).post((Runnable)this);
        }
        final b y0 = recyclerView.y0;
        y0.a = a;
        y0.b = b;
    }
    
    public final void b(final long n) {
        final ArrayList c = this.C;
        final int size = c.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final RecyclerView recyclerView = (RecyclerView)c.get(i);
            int n3 = n2;
            if (((View)recyclerView).getWindowVisibility() == 0) {
                final b y0 = recyclerView.y0;
                y0.c = 0;
                n3 = n2 + y0.c;
            }
            ++i;
            n2 = n3;
        }
        final ArrayList f = this.F;
        f.ensureCapacity(n2);
        for (int j = 0; j < size; ++j) {
            final RecyclerView recyclerView2 = (RecyclerView)c.get(j);
            if (((View)recyclerView2).getWindowVisibility() == 0) {
                final b y2 = recyclerView2.y0;
                Math.abs(y2.a);
                Math.abs(y2.b);
                if (y2.c * 2 > 0) {
                    if (f.size() <= 0) {
                        f.add(new Object());
                    }
                    else {
                        final g g = (g)f.get(0);
                    }
                    throw null;
                }
            }
        }
        Collections.sort((List)f, (Comparator)h.H);
        if (f.size() > 0) {
            final g g2 = (g)f.get(0);
            final RecyclerView d = g2.d;
            if (d != null) {
                final int e = g2.e;
                if (d.F.E() <= 0) {
                    final em c2 = d.C;
                    try {
                        ++d.b0;
                        c2.c(e);
                        throw null;
                    }
                    finally {
                        final int b0 = d.b0 - 1;
                        d.b0 = b0;
                        if (b0 < 1) {
                            d.b0 = 0;
                        }
                    }
                }
                RecyclerView.j(d.F.D(0));
                throw null;
            }
        }
    }
    
    public final void run() {
        while (true) {
            Label_0144: {
                long n = 0L;
            Label_0102:
                while (true) {
                    int a;
                    long max;
                    try {
                        a = k.a;
                        Trace.beginSection("RV Prefetch");
                        final ArrayList c = this.C;
                        if (c.isEmpty()) {
                            this.D = 0L;
                            Trace.endSection();
                            return;
                        }
                        final int size = c.size();
                        a = 0;
                        n = 0L;
                        if (a >= size) {
                            break Label_0102;
                        }
                        final RecyclerView recyclerView = (RecyclerView)c.get(a);
                        max = n;
                        if (((View)recyclerView).getWindowVisibility() == 0) {
                            max = Math.max(((View)recyclerView).getDrawingTime(), n);
                        }
                    }
                    finally {
                        break Label_0144;
                    }
                    ++a;
                    n = max;
                    continue;
                }
                if (n == 0L) {
                    this.D = 0L;
                    Trace.endSection();
                    return;
                }
                this.b(TimeUnit.MILLISECONDS.toNanos(n) + this.E);
                this.D = 0L;
                Trace.endSection();
                return;
            }
            this.D = 0L;
            final int a2 = k.a;
            Trace.endSection();
        }
    }
}
