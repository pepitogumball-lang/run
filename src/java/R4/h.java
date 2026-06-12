package R4;

import io.flutter.plugin.platform.f;
import java.util.Map;
import android.content.Context;
import com.google.android.ads.nativetemplates.TemplateView;
import S4.b;
import K2.F1;
import c2.k;

public final class H extends j
{
    public final k b;
    public final String c;
    public final F1 d;
    public final r e;
    public final m f;
    public final J g;
    public final b h;
    public TemplateView i;
    public final Context j;
    
    public H(final Context j, final int n, final k b, final String c, final m f, final F1 d, final Map map, final J g, final b h) {
        super(n);
        this.j = j;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.g = g;
        this.h = h;
    }
    
    public H(final Context j, final int n, final k b, final String c, final r e, final F1 d, final Map map, final J g, final b h) {
        super(n);
        this.j = j;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void b() {
        final TemplateView i = this.i;
        if (i != null) {
            i.E.a();
            this.i = null;
        }
    }
    
    @Override
    public final f c() {
        final TemplateView i = this.i;
        if (i != null) {
            return new K(i, 0);
        }
        return null;
    }
}
