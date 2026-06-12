package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class URLRequest
{
    private byte[] body;
    private Map<String, String> headers;
    private String method;
    private String url;
    
    public URLRequest(final String url, final String method, final byte[] body, final Map<String, String> headers) {
        this.url = url;
        this.method = method;
        this.body = body;
        this.headers = headers;
    }
    
    public static URLRequest fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        String s;
        if ((s = (String)map.get((Object)"url")) == null) {
            s = "about:blank";
        }
        return new URLRequest(s, (String)map.get((Object)"method"), (byte[])map.get((Object)"body"), (Map<String, String>)map.get((Object)"headers"));
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
        final URLRequest urlRequest = (URLRequest)o;
        final String url = this.url;
        Label_0064: {
            if (url != null) {
                if (url.equals((Object)urlRequest.url)) {
                    break Label_0064;
                }
            }
            else if (urlRequest.url == null) {
                break Label_0064;
            }
            return false;
        }
        final String method = this.method;
        Label_0096: {
            if (method != null) {
                if (method.equals((Object)urlRequest.method)) {
                    break Label_0096;
                }
            }
            else if (urlRequest.method == null) {
                break Label_0096;
            }
            return false;
        }
        if (!Arrays.equals(this.body, urlRequest.body)) {
            return false;
        }
        final Map<String, String> headers = this.headers;
        final Map<String, String> headers2 = urlRequest.headers;
        if (headers != null) {
            equals = headers.equals((Object)headers2);
        }
        else if (headers2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public byte[] getBody() {
        return this.body;
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
        final String url = this.url;
        int hashCode = 0;
        int hashCode2;
        if (url != null) {
            hashCode2 = url.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String method = this.method;
        int hashCode3;
        if (method != null) {
            hashCode3 = method.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int hashCode4 = Arrays.hashCode(this.body);
        final Map<String, String> headers = this.headers;
        if (headers != null) {
            hashCode = headers.hashCode();
        }
        return (hashCode4 + (hashCode2 * 31 + hashCode3) * 31) * 31 + hashCode;
    }
    
    public void setBody(final byte[] body) {
        this.body = body;
    }
    
    public void setHeaders(final Map<String, String> headers) {
        this.headers = headers;
    }
    
    public void setMethod(final String method) {
        this.method = method;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)this.url);
        hashMap.put((Object)"method", (Object)this.method);
        hashMap.put((Object)"headers", (Object)this.headers);
        hashMap.put((Object)"body", (Object)this.body);
        hashMap.put((Object)"allowsCellularAccess", (Object)null);
        hashMap.put((Object)"allowsConstrainedNetworkAccess", (Object)null);
        hashMap.put((Object)"allowsExpensiveNetworkAccess", (Object)null);
        hashMap.put((Object)"cachePolicy", (Object)null);
        hashMap.put((Object)"httpShouldHandleCookies", (Object)null);
        hashMap.put((Object)"httpShouldUsePipelining", (Object)null);
        hashMap.put((Object)"networkServiceType", (Object)null);
        hashMap.put((Object)"timeoutInterval", (Object)null);
        hashMap.put((Object)"mainDocumentURL", (Object)null);
        hashMap.put((Object)"assumesHTTP3Capable", (Object)null);
        hashMap.put((Object)"attribution", (Object)null);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("URLRequest{url='");
        sb.append(this.url);
        sb.append("', method='");
        sb.append(this.method);
        sb.append("', body=");
        sb.append(Arrays.toString(this.body));
        sb.append(", headers=");
        sb.append((Object)this.headers);
        sb.append('}');
        return sb.toString();
    }
}
