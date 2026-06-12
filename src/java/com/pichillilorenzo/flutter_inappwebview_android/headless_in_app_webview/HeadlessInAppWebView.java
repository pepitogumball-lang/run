package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.app.Activity;
import android.view.ViewGroup;
import F4.p;
import m0.a;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class HeadlessInAppWebView implements Disposable
{
    protected static final String LOG_TAG = "HeadlessInAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_headless_inappwebview_";
    public HeadlessWebViewChannelDelegate channelDelegate;
    public FlutterWebView flutterWebView;
    public final String id;
    public InAppWebViewFlutterPlugin plugin;
    
    public HeadlessInAppWebView(final InAppWebViewFlutterPlugin plugin, final String id, final FlutterWebView flutterWebView) {
        this.id = id;
        this.plugin = plugin;
        this.flutterWebView = flutterWebView;
        this.channelDelegate = new HeadlessWebViewChannelDelegate(this, new p(plugin.messenger, a.f("com.pichillilorenzo/flutter_headless_inappwebview_", id)));
    }
    
    @Override
    public void dispose() {
        final HeadlessWebViewChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            final HeadlessInAppWebViewManager headlessInAppWebViewManager = plugin.headlessInAppWebViewManager;
            if (headlessInAppWebViewManager != null && headlessInAppWebViewManager.webViews.containsKey((Object)this.id)) {
                headlessInAppWebViewManager.webViews.put((Object)this.id, (Object)null);
            }
            final Activity activity = this.plugin.activity;
            if (activity != null) {
                final ViewGroup viewGroup = (ViewGroup)activity.findViewById(16908290);
                if (viewGroup != null) {
                    final ViewGroup viewGroup2 = (ViewGroup)viewGroup.getChildAt(0);
                    if (viewGroup2 != null) {
                        final FlutterWebView flutterWebView = this.flutterWebView;
                        if (flutterWebView != null && flutterWebView.getView() != null) {
                            viewGroup2.removeView(this.flutterWebView.getView());
                        }
                    }
                }
            }
        }
        final FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null) {
            flutterWebView2.dispose();
        }
        this.flutterWebView = null;
        this.plugin = null;
    }
    
    public FlutterWebView disposeAndGetFlutterWebView() {
        final FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView != null) {
            final View view = flutterWebView.getView();
            if (view != null) {
                view.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
                view.setVisibility(0);
                final ViewGroup viewGroup = (ViewGroup)view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            this.flutterWebView = null;
            this.dispose();
        }
        return flutterWebView;
    }
    
    public Size2D getSize() {
        final FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView != null && flutterWebView.webView != null) {
            final View view = flutterWebView.getView();
            if (view != null) {
                final float pixelDensity = Util.getPixelDensity(view.getContext());
                final Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                final double width = fullscreenSize.getWidth();
                final int width2 = layoutParams.width;
                double n = width2;
                if (width != n) {
                    n = width2 / pixelDensity;
                }
                final double height = fullscreenSize.getHeight();
                final int height2 = layoutParams.height;
                double n2 = height2;
                if (height != n2) {
                    n2 = height2 / pixelDensity;
                }
                return new Size2D(n, n2);
            }
        }
        return null;
    }
    
    public void onWebViewCreated() {
        final HeadlessWebViewChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onWebViewCreated();
        }
    }
    
    public void prepare(final Map<String, Object> map) {
        final FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView != null) {
            final View view = flutterWebView.getView();
            if (view != null) {
                Size2D fromMap;
                if ((fromMap = Size2D.fromMap((Map<String, Object>)map.get((Object)"initialSize"))) == null) {
                    fromMap = new Size2D(-1.0, -1.0);
                }
                this.setSize(fromMap);
                view.setVisibility(4);
            }
        }
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            final Activity activity = plugin.activity;
            if (activity != null) {
                final ViewGroup viewGroup = (ViewGroup)activity.findViewById(16908290);
                if (viewGroup != null) {
                    final ViewGroup viewGroup2 = (ViewGroup)viewGroup.getChildAt(0);
                    if (viewGroup2 != null) {
                        final FlutterWebView flutterWebView2 = this.flutterWebView;
                        if (flutterWebView2 != null) {
                            final View view2 = flutterWebView2.getView();
                            if (view2 != null) {
                                viewGroup2.addView(view2, 0);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void setSize(final Size2D size2D) {
        final FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView != null && flutterWebView.webView != null) {
            final View view = flutterWebView.getView();
            if (view != null) {
                final float pixelDensity = Util.getPixelDensity(view.getContext());
                final Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
                double width;
                if (size2D.getWidth() == -1.0) {
                    width = fullscreenSize.getWidth();
                }
                else {
                    width = size2D.getWidth() * pixelDensity;
                }
                final int n = (int)width;
                double height;
                if (size2D.getWidth() == -1.0) {
                    height = fullscreenSize.getHeight();
                }
                else {
                    height = pixelDensity * size2D.getHeight();
                }
                view.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(n, (int)height));
            }
        }
    }
}
