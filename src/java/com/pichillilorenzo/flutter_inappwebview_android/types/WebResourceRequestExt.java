package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import G0.z;
import F0.d;
import android.webkit.WebResourceRequest;
import java.util.Map;

public class WebResourceRequestExt
{
    private boolean hasGesture;
    private Map<String, String> headers;
    private boolean isForMainFrame;
    private boolean isRedirect;
    private String method;
    private String url;
    
    public WebResourceRequestExt(final String url, final Map<String, String> headers, final boolean isRedirect, final boolean hasGesture, final boolean isForMainFrame, final String method) {
        this.url = url;
        this.headers = headers;
        this.isRedirect = isRedirect;
        this.hasGesture = hasGesture;
        this.isForMainFrame = isForMainFrame;
        this.method = method;
    }
    
    public static WebResourceRequestExt fromWebResourceRequest(final WebResourceRequest webResourceRequest) {
        boolean b;
        if (d.a("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
            z.m.getClass();
            b = webResourceRequest.isRedirect();
        }
        else {
            b = webResourceRequest.isRedirect();
        }
        return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), (Map<String, String>)webResourceRequest.getRequestHeaders(), b, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final WebResourceRequestExt webResourceRequestExt = (WebResourceRequestExt)o;
        if (this.isRedirect != webResourceRequestExt.isRedirect) {
            return false;
        }
        if (this.hasGesture != webResourceRequestExt.hasGesture) {
            return false;
        }
        if (this.isForMainFrame != webResourceRequestExt.isForMainFrame) {
            return false;
        }
        if (!this.url.equals((Object)webResourceRequestExt.url)) {
            return false;
        }
        final Map<String, String> headers = this.headers;
        Label_0121: {
            if (headers != null) {
                if (headers.equals((Object)webResourceRequestExt.headers)) {
                    break Label_0121;
                }
            }
            else if (webResourceRequestExt.headers == null) {
                break Label_0121;
            }
            return false;
        }
        final String method = this.method;
        final String method2 = webResourceRequestExt.method;
        if (method != null) {
            equals = method.equals((Object)method2);
        }
        else if (method2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public Map<String, String> getHeaders() {
        return this.headers;
    }
    
    public String getMethod() {
        return this.method;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.url.hashCode();
        final Map<String, String> headers = this.headers;
        int hashCode2 = 0;
        int hashCode3;
        if (headers != null) {
            hashCode3 = headers.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int isRedirect = this.isRedirect ? 1 : 0;
        final int hasGesture = this.hasGesture ? 1 : 0;
        final int isForMainFrame = this.isForMainFrame ? 1 : 0;
        final String method = this.method;
        if (method != null) {
            hashCode2 = method.hashCode();
        }
        return ((((hashCode * 31 + hashCode3) * 31 + isRedirect) * 31 + hasGesture) * 31 + isForMainFrame) * 31 + hashCode2;
    }
    
    public boolean isForMainFrame() {
        return this.isForMainFrame;
    }
    
    public boolean isHasGesture() {
        return this.hasGesture;
    }
    
    public boolean isRedirect() {
        return this.isRedirect;
    }
    
    public void setForMainFrame(final boolean isForMainFrame) {
        this.isForMainFrame = isForMainFrame;
    }
    
    public void setHasGesture(final boolean hasGesture) {
        this.hasGesture = hasGesture;
    }
    
    public void setHeaders(final Map<String, String> headers) {
        this.headers = headers;
    }
    
    public void setMethod(final String method) {
        this.method = method;
    }
    
    public void setRedirect(final boolean isRedirect) {
        this.isRedirect = isRedirect;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)this.url);
        hashMap.put((Object)"headers", (Object)this.headers);
        hashMap.put((Object)"isRedirect", (Object)this.isRedirect);
        hashMap.put((Object)"hasGesture", (Object)this.hasGesture);
        hashMap.put((Object)"isForMainFrame", (Object)this.isForMainFrame);
        hashMap.put((Object)"method", (Object)this.method);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WebResourceRequestExt{url=");
        sb.append(this.url);
        sb.append(", headers=");
        sb.append((Object)this.headers);
        sb.append(", isRedirect=");
        sb.append(this.isRedirect);
        sb.append(", hasGesture=");
        sb.append(this.hasGesture);
        sb.append(", isForMainFrame=");
        sb.append(this.isForMainFrame);
        sb.append(", method='");
        return a.b(sb, this.method, "'}");
    }
}
