package io.flutter.plugin.platform;

import I1.r;
import android.view.View;
import android.view.View$OnSystemUiVisibilityChangeListener;

public final class e implements View$OnSystemUiVisibilityChangeListener
{
    public final View a;
    public final r b;
    
    public e(final r b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onSystemUiVisibilityChange(final int n) {
        this.a.post((Runnable)new d(this, n));
    }
}
