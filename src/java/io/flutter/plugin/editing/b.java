package io.flutter.plugin.editing;

import K2.G0;
import android.view.WindowInsets;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;

public final class b implements View$OnApplyWindowInsetsListener
{
    public final ImeSyncDeferringInsetsCallback a;
    
    public b(final ImeSyncDeferringInsetsCallback a) {
        this.a = a;
    }
    
    public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
        final ImeSyncDeferringInsetsCallback a = this.a;
        ImeSyncDeferringInsetsCallback.access$402(a, view);
        if (ImeSyncDeferringInsetsCallback.access$100(a)) {
            ImeSyncDeferringInsetsCallback.access$502(a, windowInsets);
            ImeSyncDeferringInsetsCallback.access$102(a, false);
        }
        if (ImeSyncDeferringInsetsCallback.access$300(a)) {
            return G0.f();
        }
        return view.onApplyWindowInsets(windowInsets);
    }
}
