package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.view.g;
import android.view.SurfaceControl;
import android.view.Surface;
import java.util.ArrayList;
import f2.d;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.K1;
import io.flutter.plugin.editing.j;
import io.flutter.embedding.engine.FlutterJNI;
import v4.l;
import android.app.Activity;
import v4.a;

public final class q implements k
{
    public o C;
    public a D;
    public Activity E;
    public l F;
    public FlutterJNI G;
    public j H;
    public K1 I;
    public final io.flutter.plugin.platform.a J;
    public final SparseArray K;
    public final SparseArray L;
    public final d M;
    public final ArrayList N;
    public final ArrayList O;
    public Surface P;
    public SurfaceControl Q;
    public final o R;
    
    public q() {
        this.G = null;
        this.P = null;
        this.Q = null;
        this.R = new o(this, 3);
        this.J = (io.flutter.plugin.platform.a)new Object();
        this.K = new SparseArray();
        this.L = new SparseArray();
        this.N = new ArrayList();
        this.O = new ArrayList();
        if (d.F == null) {
            d.F = new d();
        }
        this.M = d.F;
    }
    
    public final void a(final g a) {
        this.J.a = a;
    }
    
    public final boolean b(final int n) {
        return false;
    }
    
    public final View c(final int n) {
        final f f = (f)this.K.get(n);
        if (f == null) {
            return null;
        }
        return f.getView();
    }
    
    public final void d() {
        this.J.a = null;
    }
}
