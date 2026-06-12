package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Arrays;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import android.webkit.WebResourceResponse;
import java.util.Map;

public class WebResourceResponseExt
{
    private String contentEncoding;
    private String contentType;
    private byte[] data;
    private Map<String, String> headers;
    private String reasonPhrase;
    private Integer statusCode;
    
    public WebResourceResponseExt(final String contentType, final String contentEncoding, final Integer statusCode, final String reasonPhrase, final Map<String, String> headers, final byte[] data) {
        this.contentType = contentType;
        this.contentEncoding = contentEncoding;
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
        this.headers = headers;
        this.data = data;
    }
    
    public static WebResourceResponseExt fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebResourceResponseExt((String)map.get((Object)"contentType"), (String)map.get((Object)"contentEncoding"), (Integer)map.get((Object)"statusCode"), (String)map.get((Object)"reasonPhrase"), (Map<String, String>)map.get((Object)"headers"), (byte[])map.get((Object)"data"));
    }
    
    public static WebResourceResponseExt fromWebResourceResponse(final WebResourceResponse webResourceResponse) {
        return new WebResourceResponseExt(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), (Map<String, String>)webResourceResponse.getResponseHeaders(), Util.readAllBytes(webResourceResponse.getData()));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final WebResourceResponseExt webResourceResponseExt = (WebResourceResponseExt)o;
            final String contentType = this.contentType;
            Label_0062: {
                if (contentType != null) {
                    if (contentType.equals((Object)webResourceResponseExt.contentType)) {
                        break Label_0062;
                    }
                }
                else if (webResourceResponseExt.contentType == null) {
                    break Label_0062;
                }
                return false;
            }
            final String contentEncoding = this.contentEncoding;
            Label_0094: {
                if (contentEncoding != null) {
                    if (contentEncoding.equals((Object)webResourceResponseExt.contentEncoding)) {
                        break Label_0094;
                    }
                }
                else if (webResourceResponseExt.contentEncoding == null) {
                    break Label_0094;
                }
                return false;
            }
            final Integer statusCode = this.statusCode;
            Label_0126: {
                if (statusCode != null) {
                    if (statusCode.equals((Object)webResourceResponseExt.statusCode)) {
                        break Label_0126;
                    }
                }
                else if (webResourceResponseExt.statusCode == null) {
                    break Label_0126;
                }
                return false;
            }
            final String reasonPhrase = this.reasonPhrase;
            Label_0158: {
                if (reasonPhrase != null) {
                    if (reasonPhrase.equals((Object)webResourceResponseExt.reasonPhrase)) {
                        break Label_0158;
                    }
                }
                else if (webResourceResponseExt.reasonPhrase == null) {
                    break Label_0158;
                }
                return false;
            }
            final Map<String, String> headers = this.headers;
            if (headers != null) {
                if (headers.equals((Object)webResourceResponseExt.headers)) {
                    return Arrays.equals(this.data, webResourceResponseExt.data);
                }
            }
            else if (webResourceResponseExt.headers == null) {
                return Arrays.equals(this.data, webResourceResponseExt.data);
            }
            return false;
        }
        return false;
    }
    
    public String getContentEncoding() {
        return this.contentEncoding;
    }
    
    public String getContentType() {
        return this.contentType;
    }
    
    public byte[] getData() {
        return this.data;
    }
    
    public Map<String, String> getHeaders() {
        return this.headers;
    }
    
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }
    
    public Integer getStatusCode() {
        return this.statusCode;
    }
    
    @Override
    public int hashCode() {
        final String contentType = this.contentType;
        int hashCode = 0;
        int hashCode2;
        if (contentType != null) {
            hashCode2 = contentType.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String contentEncoding = this.contentEncoding;
        int hashCode3;
        if (contentEncoding != null) {
            hashCode3 = contentEncoding.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Integer statusCode = this.statusCode;
        int hashCode4;
        if (statusCode != null) {
            hashCode4 = statusCode.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final String reasonPhrase = this.reasonPhrase;
        int hashCode5;
        if (reasonPhrase != null) {
            hashCode5 = reasonPhrase.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final Map<String, String> headers = this.headers;
        if (headers != null) {
            hashCode = headers.hashCode();
        }
        return Arrays.hashCode(this.data) + ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode) * 31;
    }
    
    public void setContentEncoding(final String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }
    
    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }
    
    public void setData(final byte[] data) {
        this.data = data;
    }
    
    public void setHeaders(final Map<String, String> headers) {
        this.headers = headers;
    }
    
    public void setReasonPhrase(final String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }
    
    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"contentType", (Object)this.contentType);
        hashMap.put((Object)"contentEncoding", (Object)this.contentEncoding);
        hashMap.put((Object)"statusCode", (Object)this.statusCode);
        hashMap.put((Object)"reasonPhrase", (Object)this.reasonPhrase);
        hashMap.put((Object)"headers", (Object)this.headers);
        hashMap.put((Object)"data", (Object)this.data);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WebResourceResponseExt{contentType='");
        sb.append(this.contentType);
        sb.append("', contentEncoding='");
        sb.append(this.contentEncoding);
        sb.append("', statusCode=");
        sb.append((Object)this.statusCode);
        sb.append(", reasonPhrase='");
        sb.append(this.reasonPhrase);
        sb.append("', headers=");
        sb.append((Object)this.headers);
        sb.append(", data=");
        sb.append(Arrays.toString(this.data));
        sb.append('}');
        return sb.toString();
    }
}
