package o;

import android.net.Uri;
import s2.a;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import C2.x;
import com.google.android.gms.internal.ads.Zr;
import android.widget.ImageView;

public class u extends ImageView
{
    public final Zr C;
    public final x D;
    public boolean E;
    
    public u(final Context context, final AttributeSet set, final int n) {
        c1.a(context);
        super(context, set, n);
        this.E = false;
        b1.a(((View)this).getContext(), (View)this);
        (this.C = new Zr((View)this)).d(set, n);
        (this.D = new x((ImageView)this)).j(set, n);
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Zr c = this.C;
        if (c != null) {
            c.a();
        }
        final x d = this.D;
        if (d != null) {
            d.d();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final Zr c = this.C;
        ColorStateList b;
        if (c != null) {
            b = c.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final Zr c = this.C;
        PorterDuff$Mode c2;
        if (c != null) {
            c2 = c.c();
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public ColorStateList getSupportImageTintList() {
        final ColorStateList list = null;
        final x d = this.D;
        ColorStateList a = list;
        if (d != null) {
            final d1 d2 = (d1)d.c;
            a = list;
            if (d2 != null) {
                a = d2.a;
            }
        }
        return a;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        final PorterDuff$Mode porterDuff$Mode = null;
        final x d = this.D;
        PorterDuff$Mode b = porterDuff$Mode;
        if (d != null) {
            final d1 d2 = (d1)d.c;
            b = porterDuff$Mode;
            if (d2 != null) {
                b = d2.b;
            }
        }
        return b;
    }
    
    public final boolean hasOverlappingRendering() {
        return !(((View)this.D.a).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final Zr c = this.C;
        if (c != null) {
            c.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final Zr c = this.C;
        if (c != null) {
            c.f(backgroundResource);
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final x d = this.D;
        if (d != null) {
            d.d();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        final x d = this.D;
        if (d != null && imageDrawable != null && !this.E) {
            d.b = imageDrawable.getLevel();
        }
        super.setImageDrawable(imageDrawable);
        if (d != null) {
            d.d();
            if (!this.E) {
                final ImageView imageView = (ImageView)d.a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(d.b);
                }
            }
        }
    }
    
    public void setImageLevel(final int imageLevel) {
        super.setImageLevel(imageLevel);
        this.E = true;
    }
    
    public void setImageResource(final int n) {
        final x d = this.D;
        if (d != null) {
            final ImageView imageView = (ImageView)d.a;
            if (n != 0) {
                final Drawable f = a.f(((View)imageView).getContext(), n);
                if (f != null) {
                    l0.a(f);
                }
                imageView.setImageDrawable(f);
            }
            else {
                imageView.setImageDrawable((Drawable)null);
            }
            d.d();
        }
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final x d = this.D;
        if (d != null) {
            d.d();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final Zr c = this.C;
        if (c != null) {
            c.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final Zr c = this.C;
        if (c != null) {
            c.i(porterDuff$Mode);
        }
    }
    
    public void setSupportImageTintList(final ColorStateList a) {
        final x d = this.D;
        if (d != null) {
            if (d.c == null) {
                d.c = new Object();
            }
            final d1 d2 = (d1)d.c;
            d2.a = a;
            d2.d = true;
            d.d();
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode b) {
        final x d = this.D;
        if (d != null) {
            if (d.c == null) {
                d.c = new Object();
            }
            final d1 d2 = (d1)d.c;
            d2.b = b;
            d2.c = true;
            d.d();
        }
    }
}
