package io.flutter.plugin.platform;

import android.os.Build$VERSION;
import io.flutter.view.n;

public final class y implements n
{
    public final z a;
    
    public y(final z a) {
        this.a = a;
    }
    
    @Override
    public final void onTrimMemory(final int n) {
        if (n == 80 && Build$VERSION.SDK_INT >= 29) {
            this.a.f = true;
        }
    }
}
