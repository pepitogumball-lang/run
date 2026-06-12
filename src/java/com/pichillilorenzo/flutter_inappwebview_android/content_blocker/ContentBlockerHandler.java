package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.util.Iterator;
import android.util.Log;
import javax.net.ssl.SSLHandshakeException;
import java.io.InputStream;
import java.util.Map;
import android.text.TextUtils;
import java.util.Map$Entry;
import java.util.HashMap;
import java.io.ByteArrayInputStream;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import android.webkit.ValueCallback;
import m0.a;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URI;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.ArrayList;
import java.util.List;

public class ContentBlockerHandler
{
    protected static final String LOG_TAG = "ContentBlockerHandler";
    protected List<ContentBlocker> ruleList;
    
    public ContentBlockerHandler() {
        this.ruleList = (List<ContentBlocker>)new ArrayList();
    }
    
    public ContentBlockerHandler(final List<ContentBlocker> ruleList) {
        new ArrayList();
        this.ruleList = ruleList;
    }
    
    public WebResourceResponse checkUrl(final InAppWebView inAppWebView, final WebResourceRequestExt webResourceRequestExt) {
        return this.checkUrl(inAppWebView, webResourceRequestExt, this.getResourceTypeFromUrl(webResourceRequestExt));
    }
    
    public WebResourceResponse checkUrl(final InAppWebView inAppWebView, final WebResourceRequestExt webResourceRequestExt, final ContentBlockerTriggerResourceType contentBlockerTriggerResourceType) {
        final String s = "charset=";
        if (inAppWebView.customSettings.contentBlockers == null) {
            return null;
        }
        final String url = webResourceRequestExt.getUrl();
        URI uri;
        try {
            uri = new URI(url);
        }
        catch (final URISyntaxException ex) {
            final String s2 = url.split(":")[0];
            final URL url2 = new URL(url.replace((CharSequence)s2, (CharSequence)"https"));
            uri = new URI(s2, url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
        }
        final String host = uri.getHost();
        final int port = uri.getPort();
        final String scheme = uri.getScheme();
        final Iterator iterator = new CopyOnWriteArrayList((Collection)this.ruleList).iterator();
        Object o = s;
    Label_0859_Outer:
        while (iterator.hasNext()) {
            final ContentBlocker contentBlocker = (ContentBlocker)iterator.next();
            final ContentBlockerTrigger trigger = contentBlocker.getTrigger();
            final List<ContentBlockerTriggerResourceType> resourceType = trigger.getResourceType();
            if (resourceType.contains((Object)ContentBlockerTriggerResourceType.IMAGE)) {
                final ContentBlockerTriggerResourceType svg_DOCUMENT = ContentBlockerTriggerResourceType.SVG_DOCUMENT;
                if (!resourceType.contains((Object)svg_DOCUMENT)) {
                    resourceType.add((Object)svg_DOCUMENT);
                }
            }
            final ContentBlockerAction action = contentBlocker.getAction();
            if (trigger.getUrlFilterPatternCompiled().matcher((CharSequence)url).matches()) {
                if (!resourceType.isEmpty() && !resourceType.contains((Object)contentBlockerTriggerResourceType)) {
                    return null;
                }
                Label_0364: {
                    if (!trigger.getIfDomain().isEmpty()) {
                        for (final String s3 : trigger.getIfDomain()) {
                            if (s3.startsWith("*") && host.endsWith(s3.replace((CharSequence)"*", (CharSequence)""))) {
                                break Label_0364;
                            }
                            if (s3.equals((Object)host)) {
                                break Label_0364;
                            }
                        }
                        return null;
                    }
                }
                if (!trigger.getUnlessDomain().isEmpty()) {
                    for (final String s4 : trigger.getUnlessDomain()) {
                        if ((!s4.startsWith("*") || !host.endsWith(s4.replace((CharSequence)"*", (CharSequence)""))) && !s4.equals((Object)host)) {
                            continue;
                        }
                        return null;
                    }
                }
                Object o2 = { null };
                if (!trigger.getLoadType().isEmpty() || !trigger.getIfTopUrl().isEmpty() || !trigger.getUnlessTopUrl().isEmpty()) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Handler(inAppWebView.getWebViewLooper()).post((Runnable)new Runnable(this, o2, inAppWebView, countDownLatch) {
                        final ContentBlockerHandler this$0;
                        final CountDownLatch val$latch;
                        final InAppWebView val$webView;
                        final String[] val$webViewUrl;
                        
                        public void run() {
                            this.val$webViewUrl[0] = this.val$webView.getUrl();
                            this.val$latch.countDown();
                        }
                    });
                    countDownLatch.await();
                }
                if (o2[0] != null) {
                    if (!trigger.getLoadType().isEmpty()) {
                        final URI uri2 = new URI(o2[0]);
                        final String host2 = uri2.getHost();
                        final int port2 = uri2.getPort();
                        final Object o3 = uri2.getScheme();
                        if ((trigger.getLoadType().contains((Object)"first-party") && host2 != null && (!((String)o3).equals(scheme) || !host2.equals((Object)host) || port2 != port)) || (trigger.getLoadType().contains((Object)"third-party") && host2 != null && host2.equals((Object)host))) {
                            return null;
                        }
                    }
                    Label_0762: {
                        if (!trigger.getIfTopUrl().isEmpty()) {
                            for (final Object o3 : trigger.getIfTopUrl()) {
                                if (o2[0].startsWith((String)o3)) {
                                    break Label_0762;
                                }
                            }
                            return null;
                        }
                    }
                    if (!trigger.getUnlessTopUrl().isEmpty()) {
                        final Iterator iterator5 = trigger.getUnlessTopUrl().iterator();
                        while (iterator5.hasNext()) {
                            if (o2[0].startsWith((String)iterator5.next())) {
                                return null;
                            }
                        }
                    }
                }
                final int n = ContentBlockerHandler$3.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType[action.getType().ordinal()];
                if (n != 1) {
                    while (true) {
                        Label_1355: {
                            if (n == 2) {
                                final String selector = action.getSelector();
                                new Handler(inAppWebView.getWebViewLooper()).postDelayed((Runnable)new Runnable(this, inAppWebView, a.i("(function(d) {    function hide () {        if (d.body != null && !d.getElementById('flutter_inappwebview-css-display-none-style')) {            var c = d.createElement('style');            c.id = 'flutter_inappwebview-css-display-none-style';            c.innerHTML = '", selector, " { display: none !important; }';            d.body.appendChild(c);        }       d.querySelectorAll('", selector, "').forEach(function (item, index) {            item.setAttribute('style', 'display: none !important;');        });    };    hide();    d.addEventListener('DOMContentLoaded', function(event) { hide(); }); })(document);")) {
                                    final ContentBlockerHandler this$0;
                                    final String val$jsScript;
                                    final InAppWebView val$webView;
                                    
                                    public void run() {
                                        this.val$webView.evaluateJavascript(this.val$jsScript, (ValueCallback)null);
                                    }
                                }, 800L);
                                break Label_1355;
                            }
                            Object o4;
                            if (n != 3) {
                                o4 = o;
                            }
                            else {
                                o4 = o;
                                if (scheme.equals((Object)"http")) {
                                    if (port != -1) {
                                        o4 = o;
                                        if (port != 80) {
                                            break Label_0859;
                                        }
                                    }
                                    final HttpURLConnection httpRequest = Util.makeHttpRequest(url.replace((CharSequence)"http://", (CharSequence)"https://"), webResourceRequestExt.getMethod(), webResourceRequestExt.getHeaders());
                                    o4 = o;
                                    if (httpRequest != null) {
                                        byte[] array = (byte[])o;
                                        Label_1332: {
                                            ByteArrayInputStream byteArrayInputStream = null;
                                            Label_1132: {
                                                Object o3;
                                                try {
                                                    try {
                                                        o4 = Util.readAllBytes(((URLConnection)httpRequest).getInputStream());
                                                        if (o4 == null) {
                                                            httpRequest.disconnect();
                                                            return null;
                                                        }
                                                        array = (byte[])o;
                                                        array = (byte[])o;
                                                        byteArrayInputStream = new ByteArrayInputStream((byte[])o4);
                                                        array = (byte[])o;
                                                        o3 = ((URLConnection)httpRequest).getContentEncoding();
                                                        array = (byte[])o;
                                                        o4 = ((URLConnection)httpRequest).getContentType();
                                                        if (o4 == null) {
                                                            o2 = "text/plain";
                                                            o4 = o3;
                                                            break Label_1132;
                                                        }
                                                    }
                                                    finally {}
                                                }
                                                catch (final Exception ex2) {
                                                    o = array;
                                                    break Label_1332;
                                                }
                                                final String[] split = ((String)o4).split(";");
                                                final String trim = split[0].trim();
                                                o4 = o3;
                                                o2 = trim;
                                                if (o3 == null) {
                                                    if (split.length > 1 && split[1].contains((CharSequence)o)) {
                                                        o4 = split[1].replace((CharSequence)o, (CharSequence)"").trim();
                                                        o2 = trim;
                                                    }
                                                    else {
                                                        o4 = "utf-8";
                                                        o2 = trim;
                                                    }
                                                }
                                            }
                                            final String responseMessage = httpRequest.getResponseMessage();
                                            if (responseMessage != null) {
                                                final Object o3 = new HashMap();
                                                for (final Map$Entry map$Entry : ((URLConnection)httpRequest).getHeaderFields().entrySet()) {
                                                    final String s5 = (String)map$Entry.getKey();
                                                    final CharSequence charSequence = (CharSequence)(o = o);
                                                    try {
                                                        ((HashMap)o3).put((Object)s5, (Object)TextUtils.join((CharSequence)",", (Iterable)map$Entry.getValue()));
                                                        o = charSequence;
                                                        continue Label_0859_Outer;
                                                    }
                                                    catch (final Exception ex2) {
                                                        break Label_1332;
                                                    }
                                                    break;
                                                }
                                                final WebResourceResponse webResourceResponse = new WebResourceResponse((String)o2, (String)o4, httpRequest.getResponseCode(), responseMessage, (Map)o3, (InputStream)byteArrayInputStream);
                                                httpRequest.disconnect();
                                                return webResourceResponse;
                                            }
                                            final WebResourceResponse webResourceResponse2 = new WebResourceResponse((String)o2, (String)o4, (InputStream)byteArrayInputStream);
                                            httpRequest.disconnect();
                                            return webResourceResponse2;
                                        }
                                        final Exception ex2;
                                        if (!(ex2 instanceof SSLHandshakeException)) {
                                            Log.e("ContentBlockerHandler", "", (Throwable)ex2);
                                        }
                                        httpRequest.disconnect();
                                        break Label_1355;
                                        httpRequest.disconnect();
                                    }
                                }
                            }
                            o = o4;
                            continue Label_0859_Outer;
                        }
                        Object o4 = o;
                        continue;
                    }
                }
                return new WebResourceResponse("", "", (InputStream)null);
            }
        }
        return null;
    }
    
    public WebResourceResponse checkUrl(final InAppWebView inAppWebView, final WebResourceRequestExt webResourceRequestExt, final String s) {
        return this.checkUrl(inAppWebView, webResourceRequestExt, this.getResourceTypeFromContentType(s));
    }
    
    public ContentBlockerTriggerResourceType getResourceTypeFromContentType(final String s) {
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        if (s.equals((Object)"text/css")) {
            contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.STYLE_SHEET;
        }
        else if (s.equals((Object)"image/svg+xml")) {
            contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.SVG_DOCUMENT;
        }
        else if (s.startsWith("image/")) {
            contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.IMAGE;
        }
        else if (s.startsWith("font/")) {
            contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.FONT;
        }
        else if (!s.startsWith("audio/") && !s.startsWith("video/") && !s.equals((Object)"application/ogg")) {
            if (s.endsWith("javascript")) {
                contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.SCRIPT;
            }
            else if (s.startsWith("text/")) {
                contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.DOCUMENT;
            }
        }
        else {
            contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.MEDIA;
        }
        return contentBlockerTriggerResourceType;
    }
    
    public ContentBlockerTriggerResourceType getResourceTypeFromUrl(final WebResourceRequestExt webResourceRequestExt) {
        final ContentBlockerTriggerResourceType raw = ContentBlockerTriggerResourceType.RAW;
        final String url = webResourceRequestExt.getUrl();
        if (!url.startsWith("http://")) {
            final ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = raw;
            if (!url.startsWith("https://")) {
                return contentBlockerTriggerResourceType;
            }
        }
        final HttpURLConnection httpRequest = Util.makeHttpRequest(url, "HEAD", webResourceRequestExt.getHeaders());
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = raw;
        if (httpRequest != null) {
            Label_0095: {
                try {
                    try {
                        final String contentType = ((URLConnection)httpRequest).getContentType();
                        if (contentType != null) {
                            this.getResourceTypeFromContentType(contentType.split(";")[0].trim());
                        }
                        break Label_0095;
                    }
                    finally {}
                }
                catch (final Exception ex) {
                    Log.e("ContentBlockerHandler", "", (Throwable)ex);
                    httpRequest.disconnect();
                    contentBlockerTriggerResourceType = raw;
                    return contentBlockerTriggerResourceType;
                    httpRequest.disconnect();
                    final ContentBlockerTriggerResourceType contentBlockerTriggerResourceType2;
                    contentBlockerTriggerResourceType = contentBlockerTriggerResourceType2;
                    return contentBlockerTriggerResourceType;
                }
            }
            httpRequest.disconnect();
        }
        return contentBlockerTriggerResourceType;
    }
    
    public List<ContentBlocker> getRuleList() {
        return this.ruleList;
    }
    
    public void setRuleList(final List<ContentBlocker> ruleList) {
        this.ruleList = ruleList;
    }
}
