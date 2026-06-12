package v4;

import android.view.View;
import android.graphics.Region$Op;
import android.graphics.Region;
import io.flutter.embedding.engine.FlutterJNI;
import android.view.Surface;
import android.util.Log;
import io.flutter.embedding.engine.renderer.k;
import android.view.SurfaceHolder$Callback;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.l;
import android.view.SurfaceView;

public final class h extends SurfaceView implements l
{
    public boolean C;
    public boolean D;
    public j E;
    public final x F;
    
    public h(final FlutterActivity flutterActivity, final boolean b) {
        super((Context)flutterActivity, (AttributeSet)null);
        this.C = false;
        this.D = false;
        final x f = new x(new g(this), this, this.E);
        this.F = f;
        if (b) {
            this.getHolder().setFormat(-2);
            this.setZOrderOnTop(true);
        }
        this.getHolder().addCallback((SurfaceHolder$Callback)f);
    }
    
    public final void a() {
        if (this.E != null) {
            if (((View)this).getWindowToken() != null) {
                final j e = this.E;
                if (e == null) {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
                e.j();
            }
            final w g = this.F.G;
            switch (g.a) {
                default: {
                    final x b = g.b;
                    ((View)b.C).setAlpha(0.0f);
                    final j d = b.D;
                    if (d != null) {
                        d.g((k)b.F);
                    }
                    b.D = null;
                    break;
                }
                case 0: {
                    g.b.D = null;
                    break;
                }
            }
            this.E = null;
        }
        else {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
        }
    }
    
    public final void b() {
        if (this.E == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        final w g = this.F.G;
        switch (g.a) {
            default: {
                final x b = g.b;
                final j d = b.D;
                if (d != null) {
                    d.a((k)b.F);
                }
            }
            case 0: {
                if (this.C) {
                    this.e();
                }
                this.D = false;
            }
        }
    }
    
    public final void c(final j d) {
        final j e = this.E;
        if (e != null) {
            e.j();
        }
        this.E = d;
        final w g = this.F.G;
        switch (g.a) {
            default: {
                final x b = g.b;
                final j d2 = b.D;
                if (d2 != null) {
                    d2.g((k)b.F);
                }
                b.D = d;
                break;
            }
            case 0: {
                g.b.D = d;
                break;
            }
        }
        this.b();
    }
    
    public final void d() {
        if (this.E == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.D = true;
    }
    
    public final void e() {
        if (this.E != null && this.getHolder() != null) {
            final j e = this.E;
            final Surface surface = this.getHolder().getSurface();
            final boolean d = this.D;
            if (!d) {
                e.j();
            }
            e.c = surface;
            final FlutterJNI a = e.a;
            if (d) {
                a.onSurfaceWindowChanged(surface);
            }
            else {
                a.onSurfaceCreated(surface);
            }
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }
    
    public final boolean gatherTransparentRegion(final Region region) {
        if (((View)this).getAlpha() < 1.0f) {
            return false;
        }
        final int[] array = new int[2];
        ((View)this).getLocationInWindow(array);
        final int n = array[0];
        region.op(n, array[1], ((View)this).getRight() + n - ((View)this).getLeft(), ((View)this).getBottom() + array[1] - ((View)this).getTop(), Region$Op.DIFFERENCE);
        return true;
    }
    
    public j getAttachedRenderer() {
        return this.E;
    }
}
