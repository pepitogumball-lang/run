package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.webkit.JavascriptInterface;
import org.json.JSONObject;
import x.a;
import org.json.JSONException;
import android.util.Log;
import android.webkit.ValueCallback;
import org.json.JSONArray;
import com.google.android.gms.internal.measurement.L;
import v.e;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import android.os.Handler;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;

public class JavaScriptBridgeInterface
{
    private static final String LOG_TAG = "JSBridgeInterface";
    private InAppWebView inAppWebView;
    
    public JavaScriptBridgeInterface(final InAppWebView inAppWebView) {
        this.inAppWebView = inAppWebView;
    }
    
    public static /* synthetic */ InAppWebView access$000(final JavaScriptBridgeInterface javaScriptBridgeInterface) {
        return javaScriptBridgeInterface.inAppWebView;
    }
    
    @JavascriptInterface
    public void _callHandler(final String s, final String s2, final String s3) {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(this.inAppWebView.getWebViewLooper()).post((Runnable)new Runnable(this, s, s3, s2) {
            final JavaScriptBridgeInterface this$0;
            final String val$_callHandlerID;
            final String val$args;
            final String val$handlerName;
            
            public void run() {
                if (JavaScriptBridgeInterface.access$000(this.this$0) == null) {
                    return;
                }
                if (this.val$handlerName.equals((Object)"onPrintRequest")) {
                    final PrintJobSettings printJobSettings = new PrintJobSettings();
                    printJobSettings.handledByClient = Boolean.TRUE;
                    final String printCurrentPage = JavaScriptBridgeInterface.access$000(this.this$0).printCurrentPage(printJobSettings);
                    if (JavaScriptBridgeInterface.access$000(this.this$0) != null && JavaScriptBridgeInterface.access$000(this.this$0).channelDelegate != null) {
                        JavaScriptBridgeInterface.access$000(this.this$0).channelDelegate.onPrintRequest(JavaScriptBridgeInterface.access$000(this.this$0).getUrl(), printCurrentPage, (WebViewChannelDelegate.PrintRequestCallback)new WebViewChannelDelegate.PrintRequestCallback(this, printCurrentPage) {
                            final JavaScriptBridgeInterface$2 this$1;
                            final String val$printJobId;
                            
                            @Override
                            public void defaultBehaviour(final Boolean b) {
                                if (JavaScriptBridgeInterface.access$000(this.this$1.this$0) != null && JavaScriptBridgeInterface.access$000(this.this$1.this$0).plugin != null && JavaScriptBridgeInterface.access$000(this.this$1.this$0).plugin.printJobManager != null) {
                                    final PrintJobController printJobController = (PrintJobController)JavaScriptBridgeInterface.access$000(this.this$1.this$0).plugin.printJobManager.jobs.get((Object)this.val$printJobId);
                                    if (printJobController != null) {
                                        printJobController.disposeNoCancel();
                                    }
                                }
                            }
                            
                            @Override
                            public void error(final String s, String s2, final Object o) {
                                final StringBuilder c = e.c(s, ", ");
                                if (s2 == null) {
                                    s2 = "";
                                }
                                L.u(c, s2, "JSBridgeInterface");
                                this.defaultBehaviour(null);
                            }
                            
                            @Override
                            public boolean nonNullSuccess(final Boolean b) {
                                return b ^ true;
                            }
                        });
                    }
                    return;
                }
                if (this.val$handlerName.equals((Object)"callAsyncJavaScript")) {
                    try {
                        final JSONObject jsonObject = new JSONArray(this.val$args).getJSONObject(0);
                        final String string = jsonObject.getString("resultUuid");
                        final ValueCallback valueCallback = (ValueCallback)JavaScriptBridgeInterface.access$000(this.this$0).callAsyncJavaScriptCallbacks.get((Object)string);
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue((Object)jsonObject.toString());
                            JavaScriptBridgeInterface.access$000(this.this$0).callAsyncJavaScriptCallbacks.remove((Object)string);
                        }
                    }
                    catch (final JSONException ex) {
                        Log.e("JSBridgeInterface", "", (Throwable)ex);
                    }
                    return;
                }
                if (this.val$handlerName.equals((Object)"evaluateJavaScriptWithContentWorld")) {
                    Label_0326: {
                        String string2 = null;
                        ValueCallback valueCallback2 = null;
                        String string3 = null;
                        Label_0299: {
                            try {
                                final JSONObject jsonObject2 = new JSONArray(this.val$args).getJSONObject(0);
                                string2 = jsonObject2.getString("resultUuid");
                                valueCallback2 = (ValueCallback)JavaScriptBridgeInterface.access$000(this.this$0).evaluateJavaScriptContentWorldCallbacks.get((Object)string2);
                                if (valueCallback2 == null) {
                                    return;
                                }
                                if (jsonObject2.has("value")) {
                                    string3 = jsonObject2.get("value").toString();
                                    break Label_0299;
                                }
                            }
                            catch (final JSONException ex2) {
                                break Label_0326;
                            }
                            string3 = "null";
                        }
                        valueCallback2.onReceiveValue((Object)string3);
                        JavaScriptBridgeInterface.access$000(this.this$0).evaluateJavaScriptContentWorldCallbacks.remove((Object)string2);
                        return;
                    }
                    final JSONException ex2;
                    Log.e("JSBridgeInterface", "", (Throwable)ex2);
                    return;
                }
                if (JavaScriptBridgeInterface.access$000(this.this$0).channelDelegate != null) {
                    JavaScriptBridgeInterface.access$000(this.this$0).channelDelegate.onCallJsHandler(this.val$handlerName, this.val$args, (WebViewChannelDelegate.CallJsHandlerCallback)new WebViewChannelDelegate.CallJsHandlerCallback(this) {
                        final JavaScriptBridgeInterface$2 this$1;
                        
                        @Override
                        public void defaultBehaviour(final Object o) {
                            if (JavaScriptBridgeInterface.access$000(this.this$1.this$0) == null) {
                                return;
                            }
                            final StringBuilder sb = new StringBuilder("if (window.flutter_inappwebview[");
                            sb.append(this.this$1.val$_callHandlerID);
                            sb.append("] != null) { window.flutter_inappwebview[");
                            sb.append(this.this$1.val$_callHandlerID);
                            sb.append("].resolve(");
                            sb.append(o);
                            sb.append("); delete window.flutter_inappwebview[");
                            JavaScriptBridgeInterface.access$000(this.this$1.this$0).evaluateJavascript(a.b(sb, this.this$1.val$_callHandlerID, "]; }"), (ValueCallback)null);
                        }
                        
                        @Override
                        public void error(String s, String string, final Object o) {
                            final StringBuilder b = e.b(s);
                            if (string != null) {
                                s = ", ".concat(string);
                            }
                            else {
                                s = "";
                            }
                            b.append(s);
                            string = b.toString();
                            Log.e("JSBridgeInterface", string);
                            if (JavaScriptBridgeInterface.access$000(this.this$1.this$0) == null) {
                                return;
                            }
                            final StringBuilder sb = new StringBuilder("if (window.flutter_inappwebview[");
                            sb.append(this.this$1.val$_callHandlerID);
                            sb.append("] != null) { window.flutter_inappwebview[");
                            sb.append(this.this$1.val$_callHandlerID);
                            sb.append("].reject(new Error(");
                            sb.append(JSONObject.quote(string));
                            sb.append(")); delete window.flutter_inappwebview[");
                            s = a.b(sb, this.this$1.val$_callHandlerID, "]; }");
                            JavaScriptBridgeInterface.access$000(this.this$1.this$0).evaluateJavascript(s, (ValueCallback)null);
                        }
                    });
                }
            }
        });
    }
    
    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(this.inAppWebView.getWebViewLooper()).post((Runnable)new Runnable(this) {
            final JavaScriptBridgeInterface this$0;
            
            public void run() {
                if (JavaScriptBridgeInterface.access$000(this.this$0) != null && JavaScriptBridgeInterface.access$000(this.this$0).floatingContextMenu != null) {
                    JavaScriptBridgeInterface.access$000(this.this$0).hideContextMenu();
                }
            }
        });
    }
    
    public void dispose() {
        this.inAppWebView = null;
    }
}
