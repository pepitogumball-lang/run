package io.flutter.embedding.engine.renderer;

import android.view.View;
import io.flutter.embedding.android.FlutterActivity;
import android.os.Build$VERSION;
import v4.x;
import java.util.Iterator;
import v4.e;
import v4.l;

public final class a implements k
{
    public final int a;
    public final Object b;
    
    private final void c() {
    }
    
    @Override
    public final void a() {
        switch (this.a) {
            default: {
                return;
            }
            case 2: {
                final l l = (l)this.b;
                l.I = false;
                final Iterator iterator = l.H.iterator();
                while (iterator.hasNext()) {
                    ((k)iterator.next()).a();
                }
                return;
            }
            case 1: {
                final e e = (e)this.b;
                e.a.getClass();
                e.h = false;
                return;
            }
            case 0: {
                ((j)this.b).d = false;
            }
        }
    }
    
    @Override
    public final void b() {
        switch (this.a) {
            default: {
                final x x = (x)this.b;
                ((View)x.C).setAlpha(1.0f);
                final j d = x.D;
                if (d != null) {
                    d.g(this);
                }
                return;
            }
            case 2: {
                final l l = (l)this.b;
                l.I = true;
                final Iterator iterator = l.H.iterator();
                while (iterator.hasNext()) {
                    ((k)iterator.next()).b();
                }
                return;
            }
            case 1: {
                final e e = (e)this.b;
                final FlutterActivity a = e.a;
                if (Build$VERSION.SDK_INT >= 29) {
                    a.reportFullyDrawn();
                }
                else {
                    a.getClass();
                }
                e.h = true;
                e.i = true;
                return;
            }
            case 0: {
                ((j)this.b).d = true;
            }
        }
    }
}
