package m;

import android.view.MenuInflater;
import n.B;
import android.view.Menu;
import android.view.View;
import android.content.Context;
import android.view.ActionMode;

public final class g extends ActionMode
{
    public final Context a;
    public final b b;
    
    public g(final Context a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public final void finish() {
        this.b.a();
    }
    
    public final View getCustomView() {
        return this.b.b();
    }
    
    public final Menu getMenu() {
        return (Menu)new B(this.a, this.b.d());
    }
    
    public final MenuInflater getMenuInflater() {
        return this.b.e();
    }
    
    public final CharSequence getSubtitle() {
        return this.b.g();
    }
    
    public final Object getTag() {
        return this.b.C;
    }
    
    public final CharSequence getTitle() {
        return this.b.h();
    }
    
    public final boolean getTitleOptionalHint() {
        return this.b.D;
    }
    
    public final void invalidate() {
        this.b.i();
    }
    
    public final boolean isTitleOptional() {
        return this.b.j();
    }
    
    public final void setCustomView(final View view) {
        this.b.k(view);
    }
    
    public final void setSubtitle(final int n) {
        this.b.l(n);
    }
    
    public final void setSubtitle(final CharSequence charSequence) {
        this.b.m(charSequence);
    }
    
    public final void setTag(final Object c) {
        this.b.C = c;
    }
    
    public final void setTitle(final int n) {
        this.b.n(n);
    }
    
    public final void setTitle(final CharSequence charSequence) {
        this.b.o(charSequence);
    }
    
    public final void setTitleOptionalHint(final boolean b) {
        this.b.p(b);
    }
}
