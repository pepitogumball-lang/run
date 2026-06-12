package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.graphics.Rect;
import android.os.Build$VERSION;
import android.view.inputmethod.InputMethodManager;
import android.util.Log;
import android.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;

public class InputAwareWebView extends WebView
{
    private static final String LOG_TAG = "InputAwareWebView";
    public View containerView;
    private ThreadedInputConnectionProxyAdapterView proxyAdapterView;
    private View threadedInputConnectionProxyView;
    private boolean useHybridComposition;
    
    public InputAwareWebView(final Context context) {
        super(context);
        this.useHybridComposition = false;
        this.containerView = null;
    }
    
    public InputAwareWebView(final Context context, final AttributeSet set) {
        super(context, set);
        this.useHybridComposition = false;
        this.containerView = null;
    }
    
    public InputAwareWebView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.useHybridComposition = false;
        this.containerView = null;
    }
    
    public InputAwareWebView(final Context context, final View containerView, final Boolean b) {
        super(context);
        boolean booleanValue = false;
        this.useHybridComposition = false;
        this.containerView = containerView;
        if (b != null) {
            booleanValue = b;
        }
        this.useHybridComposition = booleanValue;
    }
    
    private boolean isCalledFromListPopupWindowShow() {
        for (final StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals((Object)ListPopupWindow.class.getCanonicalName()) && stackTraceElement.getMethodName().equals((Object)"show")) {
                return true;
            }
        }
        return false;
    }
    
    private void resetInputConnection() {
        if (this.proxyAdapterView == null) {
            return;
        }
        final View containerView = this.containerView;
        if (containerView == null) {
            Log.e("InputAwareWebView", "Can't reset the input connection to the container view because there is none.");
            return;
        }
        this.setInputConnectionTarget(containerView);
    }
    
    private void setInputConnectionTarget(final View view) {
        if (this.containerView == null) {
            Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
            return;
        }
        view.requestFocus();
        this.containerView.post((Runnable)new Runnable(this, view) {
            final InputAwareWebView this$0;
            final View val$targetView;
            
            public void run() {
                final InputAwareWebView this$0 = this.this$0;
                if (this$0.containerView == null) {
                    Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
                    return;
                }
                final InputMethodManager inputMethodManager = (InputMethodManager)((View)this$0).getContext().getSystemService("input_method");
                this.val$targetView.onWindowFocusChanged(true);
                if (Build$VERSION.SDK_INT < 29) {
                    inputMethodManager.isActive(this.this$0.containerView);
                }
            }
        });
    }
    
    public boolean checkInputConnectionProxy(final View threadedInputConnectionProxyView) {
        if (this.useHybridComposition) {
            return super.checkInputConnectionProxy(threadedInputConnectionProxyView);
        }
        if (this.threadedInputConnectionProxyView == (this.threadedInputConnectionProxyView = threadedInputConnectionProxyView)) {
            return super.checkInputConnectionProxy(threadedInputConnectionProxyView);
        }
        final View containerView = this.containerView;
        if (containerView == null) {
            Log.e("InputAwareWebView", "Can't create a proxy view because there's no container view. Text input may not work.");
            return super.checkInputConnectionProxy(threadedInputConnectionProxyView);
        }
        this.setInputConnectionTarget(this.proxyAdapterView = new ThreadedInputConnectionProxyAdapterView(containerView, threadedInputConnectionProxyView, threadedInputConnectionProxyView.getHandler()));
        return super.checkInputConnectionProxy(threadedInputConnectionProxyView);
    }
    
    public void clearFocus() {
        super.clearFocus();
        if (this.useHybridComposition) {
            return;
        }
        this.resetInputConnection();
    }
    
    public void dispose() {
        if (this.useHybridComposition) {
            return;
        }
        this.resetInputConnection();
    }
    
    public void lockInputConnection() {
        final ThreadedInputConnectionProxyAdapterView proxyAdapterView = this.proxyAdapterView;
        if (proxyAdapterView == null) {
            return;
        }
        proxyAdapterView.setLocked(true);
    }
    
    public void onFocusChanged(final boolean b, final int n, final Rect rect) {
        if (this.useHybridComposition) {
            super.onFocusChanged(b, n, rect);
            return;
        }
        if (Build$VERSION.SDK_INT < 28 && this.isCalledFromListPopupWindowShow() && !b) {
            return;
        }
        super.onFocusChanged(b, n, rect);
    }
    
    public void setContainerView(final View containerView) {
        this.containerView = containerView;
        if (this.proxyAdapterView == null) {
            return;
        }
        Log.w("InputAwareWebView", "The containerView has changed while the proxyAdapterView exists.");
        if (containerView != null) {
            this.setInputConnectionTarget(this.proxyAdapterView);
        }
    }
    
    public void unlockInputConnection() {
        final ThreadedInputConnectionProxyAdapterView proxyAdapterView = this.proxyAdapterView;
        if (proxyAdapterView == null) {
            return;
        }
        proxyAdapterView.setLocked(false);
    }
}
