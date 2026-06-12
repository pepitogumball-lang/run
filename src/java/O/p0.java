package o;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import I.a;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public final class p0 extends Drawable implements Drawable$Callback
{
    public Drawable C;
    public boolean D;
    
    public final void a(final Canvas canvas) {
        this.C.draw(canvas);
    }
    
    public final void b(final float n, final float n2) {
        a.e(this.C, n, n2);
    }
    
    public final void c(final int n, final int n2, final int n3, final int n4) {
        a.f(this.C, n, n2, n3, n4);
    }
    
    public final boolean d(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.C.setVisible(b, b2);
    }
    
    public final void draw(final Canvas canvas) {
        if (this.D) {
            this.a(canvas);
        }
    }
    
    public final int getChangingConfigurations() {
        return this.C.getChangingConfigurations();
    }
    
    public final Drawable getCurrent() {
        return this.C.getCurrent();
    }
    
    public final int getIntrinsicHeight() {
        return this.C.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.C.getIntrinsicWidth();
    }
    
    public final int getMinimumHeight() {
        return this.C.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.C.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.C.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.C.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.C.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.C.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return this.C.isAutoMirrored();
    }
    
    public final boolean isStateful() {
        return this.C.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.C.jumpToCurrentState();
    }
    
    public final void onBoundsChange(final Rect bounds) {
        this.C.setBounds(bounds);
    }
    
    public final boolean onLevelChange(final int level) {
        return this.C.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.C.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean autoMirrored) {
        this.C.setAutoMirrored(autoMirrored);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.C.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.C.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.C.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.C.setFilterBitmap(filterBitmap);
    }
    
    public final void setHotspot(final float n, final float n2) {
        if (this.D) {
            this.b(n, n2);
        }
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        if (this.D) {
            this.c(n, n2, n3, n4);
        }
    }
    
    public final boolean setState(final int[] state) {
        return this.D && this.C.setState(state);
    }
    
    public final void setTint(final int n) {
        a.g(this.C, n);
    }
    
    public final void setTintList(final ColorStateList list) {
        a.h(this.C, list);
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        a.i(this.C, porterDuff$Mode);
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        return this.D && this.d(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
