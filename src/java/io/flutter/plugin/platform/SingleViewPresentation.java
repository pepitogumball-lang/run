package io.flutter.plugin.platform;

import android.view.ViewGroup;
import android.app.Dialog;
import android.view.View;
import android.util.Log;
import android.content.MutableContextWrapper;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.view.Display;
import android.content.Context;
import android.view.View$OnFocusChangeListener;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import android.app.Presentation;

@Keep
class SingleViewPresentation extends Presentation
{
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View$OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private t rootView;
    private boolean startFocused;
    private final w state;
    private int viewId;
    
    public SingleViewPresentation(final Context outerContext, final Display display, final a accessibilityEventsDelegate, final w state, final View$OnFocusChangeListener focusChangeListener, final boolean startFocused) {
        super((Context)new u(outerContext, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.state = state;
        this.focusChangeListener = focusChangeListener;
        this.outerContext = outerContext;
        ((Dialog)this).getWindow().setFlags(8, 8);
        this.startFocused = startFocused;
    }
    
    public SingleViewPresentation(final Context outerContext, final Display display, final f a, final a accessibilityEventsDelegate, final int viewId, final View$OnFocusChangeListener focusChangeListener) {
        super((Context)new u(outerContext, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.viewId = viewId;
        this.focusChangeListener = focusChangeListener;
        this.outerContext = outerContext;
        final Object state = new Object();
        this.state = (w)state;
        ((w)state).a = a;
        ((Dialog)this).getWindow().setFlags(8, 8);
        ((Dialog)this).getWindow().setType(2030);
    }
    
    public w detachState() {
        final FrameLayout container = this.container;
        if (container != null) {
            ((ViewGroup)container).removeAllViews();
        }
        final t rootView = this.rootView;
        if (rootView != null) {
            ((ViewGroup)rootView).removeAllViews();
        }
        return this.state;
    }
    
    public f getView() {
        return this.state.a;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Dialog)this).getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        final w state = this.state;
        if (state.c == null) {
            state.c = new s(((Dialog)this).getContext());
        }
        if (this.state.b == null) {
            final WindowManager windowManager = (WindowManager)((Dialog)this).getContext().getSystemService("window");
            final w state2 = this.state;
            state2.b = new E(windowManager, state2.c);
        }
        this.container = new FrameLayout(((Dialog)this).getContext());
        final v baseContext = new v(((Dialog)this).getContext(), this.state.b, this.outerContext);
        final View view = this.state.a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper)view.getContext()).setBaseContext((Context)baseContext);
        }
        else {
            final StringBuilder sb = new StringBuilder("Unexpected platform view context for view ID ");
            sb.append(this.viewId);
            sb.append("; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
            Log.w("PlatformViewsController", sb.toString());
        }
        ((ViewGroup)this.container).addView(view);
        ((ViewGroup)(this.rootView = new t(((Dialog)this).getContext(), this.accessibilityEventsDelegate, view))).addView((View)this.container);
        ((ViewGroup)this.rootView).addView((View)this.state.c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        ((View)this.rootView).setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        }
        else {
            ((View)this.rootView).requestFocus();
        }
        ((Dialog)this).setContentView((View)this.rootView);
    }
}
