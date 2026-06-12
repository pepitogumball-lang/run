package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.inputmethod.EditorInfo;
import android.os.IBinder;
import android.os.Handler;
import android.view.inputmethod.InputConnection;
import android.view.View;

final class ThreadedInputConnectionProxyAdapterView extends View
{
    private InputConnection cachedConnection;
    final View containerView;
    final Handler imeHandler;
    private boolean isLocked;
    final View rootView;
    final View targetView;
    private boolean triggerDelayed;
    final IBinder windowToken;
    
    public ThreadedInputConnectionProxyAdapterView(final View containerView, final View targetView, final Handler imeHandler) {
        super(containerView.getContext());
        this.triggerDelayed = true;
        this.isLocked = false;
        this.imeHandler = imeHandler;
        this.containerView = containerView;
        this.targetView = targetView;
        this.windowToken = containerView.getWindowToken();
        this.rootView = containerView.getRootView();
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.setVisibility(0);
    }
    
    public boolean checkInputConnectionProxy(final View view) {
        return true;
    }
    
    public Handler getHandler() {
        return this.imeHandler;
    }
    
    public View getRootView() {
        return this.rootView;
    }
    
    public IBinder getWindowToken() {
        return this.windowToken;
    }
    
    public boolean hasWindowFocus() {
        return true;
    }
    
    public boolean isFocused() {
        return true;
    }
    
    public boolean isTriggerDelayed() {
        return this.triggerDelayed;
    }
    
    public boolean onCheckIsTextEditor() {
        return true;
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        this.triggerDelayed = false;
        InputConnection cachedConnection;
        if (this.isLocked) {
            cachedConnection = this.cachedConnection;
        }
        else {
            cachedConnection = this.targetView.onCreateInputConnection(editorInfo);
        }
        this.triggerDelayed = true;
        return this.cachedConnection = cachedConnection;
    }
    
    public void setLocked(final boolean isLocked) {
        this.isLocked = isLocked;
    }
}
