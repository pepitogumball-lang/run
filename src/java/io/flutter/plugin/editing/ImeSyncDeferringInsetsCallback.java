package io.flutter.plugin.editing;

import android.view.WindowInsets$Builder;
import java.util.Iterator;
import G0.f;
import com.google.android.gms.internal.ads.sE;
import io.flutter.plugin.platform.p;
import java.util.List;
import O.t0;
import java.util.WeakHashMap;
import O.K;
import O.V;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.internal.ads.po;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.WindowInsetsAnimation$Callback;
import K2.G0;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.Keep;
import android.annotation.SuppressLint;

@SuppressLint({ "NewApi", "Override" })
@Keep
class ImeSyncDeferringInsetsCallback
{
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private a imeVisibilityListener;
    private b insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;
    
    public ImeSyncDeferringInsetsCallback(final View view) {
        this.deferredInsetTypes = G0.w();
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new b(this);
    }
    
    public static /* synthetic */ boolean access$100(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.needsSave;
    }
    
    public static /* synthetic */ boolean access$102(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, final boolean needsSave) {
        return imeSyncDeferringInsetsCallback.needsSave = needsSave;
    }
    
    public static /* synthetic */ int access$200(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.deferredInsetTypes;
    }
    
    public static /* synthetic */ boolean access$300(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.animating;
    }
    
    public static /* synthetic */ boolean access$302(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, final boolean animating) {
        return imeSyncDeferringInsetsCallback.animating = animating;
    }
    
    public static /* synthetic */ View access$400(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.view;
    }
    
    public static /* synthetic */ WindowInsets access$500(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.lastWindowInsets;
    }
    
    public static /* synthetic */ a access$600(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.imeVisibilityListener;
    }
    
    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }
    
    public a getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }
    
    public View$OnApplyWindowInsetsListener getInsetsListener() {
        return (View$OnApplyWindowInsetsListener)this.insetsListener;
    }
    
    public void install() {
        po.p(this.view, (WindowInsetsAnimation$Callback)this.animationCallback);
        this.view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)this.insetsListener);
    }
    
    public void remove() {
        po.o(this.view);
        this.view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)null);
    }
    
    public void setImeVisibilityListener(final a imeVisibilityListener) {
        this.imeVisibilityListener = imeVisibilityListener;
    }
    
    @Keep
    public class AnimationCallback extends WindowInsetsAnimation$Callback
    {
        final ImeSyncDeferringInsetsCallback this$0;
        
        public AnimationCallback(final ImeSyncDeferringInsetsCallback this$0) {
            this.this$0 = this$0;
            super(1);
        }
        
        public void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.access$300(this.this$0) && (po.c(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(this.this$0)) != 0x0) {
                ImeSyncDeferringInsetsCallback.access$302(this.this$0, false);
                if (ImeSyncDeferringInsetsCallback.access$500(this.this$0) != null && ImeSyncDeferringInsetsCallback.access$400(this.this$0) != null) {
                    ImeSyncDeferringInsetsCallback.access$400(this.this$0).dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.access$500(this.this$0));
                }
            }
            final View access$400 = ImeSyncDeferringInsetsCallback.access$400(this.this$0);
            final WeakHashMap a = V.a;
            final t0 a2 = K.a(access$400);
            if (a2 != null && ImeSyncDeferringInsetsCallback.access$600(this.this$0) != null) {
                final boolean n = a2.a.n(8);
                final X.a a3 = (X.a)ImeSyncDeferringInsetsCallback.access$600(this.this$0);
                if (!n) {
                    final j j = (j)a3.D;
                    j.b.restartInput((View)j.a);
                }
                else {
                    a3.getClass();
                }
            }
        }
        
        public void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
            ImeSyncDeferringInsetsCallback.access$102(this.this$0, true);
            if ((po.c(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(this.this$0)) != 0x0) {
                ImeSyncDeferringInsetsCallback.access$302(this.this$0, true);
            }
        }
        
        public WindowInsets onProgress(final WindowInsets windowInsets, final List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.access$300(this.this$0)) {
                if (!ImeSyncDeferringInsetsCallback.access$100(this.this$0)) {
                    final Iterator iterator = list.iterator();
                    boolean b = false;
                    while (iterator.hasNext()) {
                        if ((po.c(po.i(iterator.next())) & ImeSyncDeferringInsetsCallback.access$200(this.this$0)) != 0x0) {
                            b = true;
                        }
                    }
                    if (!b) {
                        return windowInsets;
                    }
                    final int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.access$400(this.this$0).getWindowSystemUiVisibility();
                    int o;
                    if ((windowSystemUiVisibility & 0x200) == 0x0 && (windowSystemUiVisibility & 0x2) == 0x0) {
                        o = p.o(po.u(windowInsets, G0.q()));
                    }
                    else {
                        o = 0;
                    }
                    sE.u();
                    final WindowInsets$Builder e = f.e(ImeSyncDeferringInsetsCallback.access$500(this.this$0));
                    po.q(e, ImeSyncDeferringInsetsCallback.access$200(this.this$0), sE.a(Math.max(p.o(po.u(windowInsets, ImeSyncDeferringInsetsCallback.access$200(this.this$0))) - o, 0)));
                    ImeSyncDeferringInsetsCallback.access$400(this.this$0).onApplyWindowInsets(f.f(e));
                }
            }
            return windowInsets;
        }
    }
}
