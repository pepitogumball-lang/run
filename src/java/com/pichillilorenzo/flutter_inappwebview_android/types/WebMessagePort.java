package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Iterator;
import java.util.List;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import android.text.TextUtils;
import java.util.ArrayList;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import x.a;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;

public class WebMessagePort
{
    public boolean isClosed;
    public boolean isStarted;
    public boolean isTransferred;
    public String name;
    public WebMessageChannel webMessageChannel;
    
    public WebMessagePort(final String name, final WebMessageChannel webMessageChannel) {
        this.isClosed = false;
        this.isTransferred = false;
        this.isStarted = false;
        this.name = name;
        this.webMessageChannel = webMessageChannel;
    }
    
    public void close(final ValueCallback<Void> valueCallback) {
        if (!this.isTransferred) {
            this.isClosed = true;
            final WebMessageChannel webMessageChannel = this.webMessageChannel;
            InAppWebViewInterface webView = null;
            Label_0035: {
                if (webMessageChannel != null) {
                    webView = webMessageChannel.webView;
                    if (webView != null) {
                        break Label_0035;
                    }
                }
                webView = null;
            }
            if (webView != null) {
                final StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
                sb.append(this.webMessageChannel.id);
                sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
                webView.evaluateJavascript(a.b(sb, this.name, ".close();  }})();"), null, (ValueCallback<String>)new ValueCallback<String>(this, valueCallback) {
                    final WebMessagePort this$0;
                    final ValueCallback val$callback;
                    
                    public void onReceiveValue(final String s) {
                        this.val$callback.onReceiveValue((Object)null);
                    }
                });
            }
            else {
                valueCallback.onReceiveValue((Object)null);
            }
            return;
        }
        throw new Exception("Port is already transferred");
    }
    
    public void dispose() {
        this.isClosed = true;
        this.webMessageChannel = null;
    }
    
    public void postMessage(final WebMessage webMessage, final ValueCallback<Void> valueCallback) {
        if (!this.isClosed && !this.isTransferred) {
            final WebMessageChannel webMessageChannel = this.webMessageChannel;
            InAppWebViewInterface webView = null;
            Label_0037: {
                if (webMessageChannel != null) {
                    webView = webMessageChannel.webView;
                    if (webView != null) {
                        break Label_0037;
                    }
                }
                webView = null;
            }
            if (webView != null) {
                final List<WebMessagePort> ports = webMessage.ports;
                String replaceAll = "null";
                String string;
                if (ports != null) {
                    final ArrayList list = new ArrayList();
                    for (final WebMessagePort webMessagePort : ports) {
                        if (webMessagePort == this) {
                            throw new Exception("Source port cannot be transferred");
                        }
                        if (webMessagePort.isStarted) {
                            throw new Exception("Port is already started");
                        }
                        if (webMessagePort.isClosed || webMessagePort.isTransferred) {
                            throw new Exception("Port is already closed or transferred");
                        }
                        webMessagePort.isTransferred = true;
                        final StringBuilder sb = new StringBuilder("window.flutter_inappwebview._webMessageChannels['");
                        sb.append(this.webMessageChannel.id);
                        sb.append("'].");
                        sb.append(webMessagePort.name);
                        list.add((Object)sb.toString());
                    }
                    final StringBuilder sb2 = new StringBuilder("[");
                    sb2.append(TextUtils.join((CharSequence)", ", (Iterable)list));
                    sb2.append("]");
                    string = sb2.toString();
                }
                else {
                    string = "null";
                }
                final String data = webMessage.data;
                if (data != null) {
                    replaceAll = Util.replaceAll(data, "'", "\\'");
                }
                final StringBuilder sb3 = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
                sb3.append(this.webMessageChannel.id);
                sb3.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
                sb3.append(this.name);
                sb3.append(".postMessage('");
                sb3.append(replaceAll);
                sb3.append("', ");
                webView.evaluateJavascript(a.b(sb3, string, ");  }})();"), null, (ValueCallback<String>)new ValueCallback<String>(this, valueCallback) {
                    final WebMessagePort this$0;
                    final ValueCallback val$callback;
                    
                    public void onReceiveValue(final String s) {
                        this.val$callback.onReceiveValue((Object)null);
                    }
                });
            }
            else {
                valueCallback.onReceiveValue((Object)null);
            }
            webMessage.dispose();
            return;
        }
        throw new Exception("Port is already closed or transferred");
    }
    
    public void setWebMessageCallback(final ValueCallback<Void> valueCallback) {
        if (!this.isClosed && !this.isTransferred) {
            this.isStarted = true;
            final WebMessageChannel webMessageChannel = this.webMessageChannel;
            InAppWebViewInterface webView = null;
            Label_0042: {
                if (webMessageChannel != null) {
                    webView = webMessageChannel.webView;
                    if (webView != null) {
                        break Label_0042;
                    }
                }
                webView = null;
            }
            if (webView != null) {
                final boolean equals = this.name.equals((Object)"port1");
                final StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
                sb.append(this.webMessageChannel.id);
                sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
                sb.append(this.name);
                sb.append(".onmessage = function (event) {          window.flutter_inappwebview.callHandler('onWebMessagePortMessageReceived', {              'webMessageChannelId': '");
                sb.append(this.webMessageChannel.id);
                sb.append("',              'index': ");
                sb.append((int)((true ^ equals) ? 1 : 0));
                sb.append(",              'message': event.data          });      }  }})();");
                webView.evaluateJavascript(sb.toString(), null, (ValueCallback<String>)new ValueCallback<String>(this, valueCallback) {
                    final WebMessagePort this$0;
                    final ValueCallback val$callback;
                    
                    public void onReceiveValue(final String s) {
                        final ValueCallback val$callback = this.val$callback;
                        if (val$callback != null) {
                            val$callback.onReceiveValue((Object)null);
                        }
                    }
                });
            }
            else if (valueCallback != null) {
                valueCallback.onReceiveValue((Object)null);
            }
            return;
        }
        throw new Exception("Port is already closed or transferred");
    }
}
