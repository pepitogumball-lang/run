package C;

import android.os.BaseBundle;
import android.graphics.PorterDuff$Mode;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.app.Notification$Builder;
import android.os.Build$VERSION;
import L3.A;
import android.app.Notification;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import android.app.PendingIntent;
import java.util.ArrayList;
import android.content.Context;

public final class t
{
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public u l;
    public boolean m;
    public Bundle n;
    public int o;
    public int p;
    public String q;
    public final boolean r;
    public final Notification s;
    public final ArrayList t;
    
    public t(final Context a, final String q) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.m = false;
        this.o = 0;
        this.p = 0;
        final Notification s = new Notification();
        this.s = s;
        this.a = a;
        this.q = q;
        s.when = System.currentTimeMillis();
        s.audioStreamType = -1;
        this.j = 0;
        this.t = new ArrayList();
        this.r = true;
    }
    
    public static CharSequence b(final String s) {
        if (s == null) {
            return (CharSequence)s;
        }
        Object subSequence = s;
        if (s.length() > 5120) {
            subSequence = s.subSequence(0, 5120);
        }
        return (CharSequence)subSequence;
    }
    
    public final Notification a() {
        final A a = new A(this);
        final t t = (t)a.F;
        final u l = t.l;
        if (l != null) {
            l.e(a);
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Notification$Builder notification$Builder = (Notification$Builder)a.E;
        Notification notification;
        if (sdk_INT >= 26) {
            notification = notification$Builder.build();
        }
        else {
            notification = notification$Builder.build();
        }
        if (l != null) {
            t.l.getClass();
        }
        if (l != null) {
            final Bundle extras = notification.extras;
            if (extras != null) {
                ((BaseBundle)extras).putString("androidx.core.app.extra.COMPAT_TEMPLATE", l.g());
            }
        }
        return notification;
    }
    
    public final void c(final boolean b) {
        final Notification s = this.s;
        if (b) {
            s.flags |= 0x10;
        }
        else {
            s.flags &= 0xFFFFFFEF;
        }
    }
    
    public final void d(Bitmap scaledBitmap) {
        IconCompat h;
        if (scaledBitmap == null) {
            h = null;
        }
        else {
            if (Build$VERSION.SDK_INT < 27) {
                final Resources resources = this.a.getResources();
                final int dimensionPixelSize = resources.getDimensionPixelSize(2131099737);
                final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131099736);
                if (scaledBitmap.getWidth() > dimensionPixelSize || scaledBitmap.getHeight() > dimensionPixelSize2) {
                    final double min = Math.min(dimensionPixelSize / (double)Math.max(1, scaledBitmap.getWidth()), dimensionPixelSize2 / (double)Math.max(1, scaledBitmap.getHeight()));
                    scaledBitmap = Bitmap.createScaledBitmap(scaledBitmap, (int)Math.ceil(scaledBitmap.getWidth() * min), (int)Math.ceil(scaledBitmap.getHeight() * min), true);
                }
            }
            final PorterDuff$Mode k = IconCompat.k;
            scaledBitmap.getClass();
            final IconCompat iconCompat = new IconCompat(1);
            iconCompat.b = scaledBitmap;
            h = iconCompat;
        }
        this.h = h;
    }
    
    public final void e(final u l) {
        if (this.l != l) {
            this.l = l;
            if (l.C != this) {
                ((t)(l.C = this)).e(l);
            }
        }
    }
}
