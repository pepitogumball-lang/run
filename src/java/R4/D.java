package R4;

import android.view.ViewGroup;
import c2.k;
import android.view.View;
import android.content.Context;
import android.util.Log;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugin.platform.f;
import android.view.View$OnLayoutChangeListener;
import android.widget.ScrollView;

public final class d extends o
{
    public ScrollView h;
    public int i;
    
    @Override
    public final void a() {
        final z1.c g = super.g;
        if (g != null) {
            ((View)g).addOnLayoutChangeListener((View$OnLayoutChangeListener)new c(this, 0));
            super.b.w(super.a, ((y1.k)super.g).getResponseInfo());
        }
    }
    
    @Override
    public final void b() {
        final z1.c g = super.g;
        if (g != null) {
            ((y1.k)g).a();
            super.g = null;
        }
        final ScrollView h = this.h;
        if (h != null) {
            ((ViewGroup)h).removeAllViews();
            this.h = null;
        }
    }
    
    @Override
    public final f c() {
        if (super.g == null) {
            return null;
        }
        final ScrollView h = this.h;
        if (h != null) {
            return new K(h, 0);
        }
        final k b = super.b;
        ScrollView h2;
        if (b.D == null) {
            Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
            h2 = null;
        }
        else {
            h2 = new ScrollView((Context)b.D);
        }
        if (h2 == null) {
            return null;
        }
        ((ViewGroup)h2).setClipChildren(false);
        ((View)h2).setVerticalScrollBarEnabled(false);
        ((View)h2).setHorizontalScrollBarEnabled(false);
        ((ViewGroup)(this.h = h2)).addView((View)super.g);
        return new K(super.g, 0);
    }
}
