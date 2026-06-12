package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.internal.measurement.L;

public class DownloadStartRequest
{
    private String contentDisposition;
    private long contentLength;
    private String mimeType;
    private String suggestedFilename;
    private String textEncodingName;
    private String url;
    private String userAgent;
    
    public DownloadStartRequest(final String url, final String userAgent, final String contentDisposition, final String mimeType, final long contentLength, final String suggestedFilename, final String textEncodingName) {
        this.url = url;
        this.userAgent = userAgent;
        this.contentDisposition = contentDisposition;
        this.mimeType = mimeType;
        this.contentLength = contentLength;
        this.suggestedFilename = suggestedFilename;
        this.textEncodingName = textEncodingName;
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
        final DownloadStartRequest downloadStartRequest = (DownloadStartRequest)o;
        if (this.contentLength != downloadStartRequest.contentLength) {
            return false;
        }
        if (!this.url.equals((Object)downloadStartRequest.url)) {
            return false;
        }
        if (!this.userAgent.equals((Object)downloadStartRequest.userAgent)) {
            return false;
        }
        if (!this.contentDisposition.equals((Object)downloadStartRequest.contentDisposition)) {
            return false;
        }
        if (!this.mimeType.equals((Object)downloadStartRequest.mimeType)) {
            return false;
        }
        final String suggestedFilename = this.suggestedFilename;
        Label_0142: {
            if (suggestedFilename != null) {
                if (suggestedFilename.equals((Object)downloadStartRequest.suggestedFilename)) {
                    break Label_0142;
                }
            }
            else if (downloadStartRequest.suggestedFilename == null) {
                break Label_0142;
            }
            return false;
        }
        final String textEncodingName = this.textEncodingName;
        final String textEncodingName2 = downloadStartRequest.textEncodingName;
        if (textEncodingName != null) {
            equals = textEncodingName.equals((Object)textEncodingName2);
        }
        else if (textEncodingName2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public String getContentDisposition() {
        return this.contentDisposition;
    }
    
    public long getContentLength() {
        return this.contentLength;
    }
    
    public String getMimeType() {
        return this.mimeType;
    }
    
    public String getSuggestedFilename() {
        return this.suggestedFilename;
    }
    
    public String getTextEncodingName() {
        return this.textEncodingName;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public String getUserAgent() {
        return this.userAgent;
    }
    
    @Override
    public int hashCode() {
        final int g = L.g(L.g(L.g(this.url.hashCode() * 31, this.userAgent, 31), this.contentDisposition, 31), this.mimeType, 31);
        final long contentLength = this.contentLength;
        final int n = (int)(contentLength ^ contentLength >>> 32);
        final String suggestedFilename = this.suggestedFilename;
        int hashCode = 0;
        int hashCode2;
        if (suggestedFilename != null) {
            hashCode2 = suggestedFilename.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String textEncodingName = this.textEncodingName;
        if (textEncodingName != null) {
            hashCode = textEncodingName.hashCode();
        }
        return ((g + n) * 31 + hashCode2) * 31 + hashCode;
    }
    
    public void setContentDisposition(final String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }
    
    public void setContentLength(final long contentLength) {
        this.contentLength = contentLength;
    }
    
    public void setMimeType(final String mimeType) {
        this.mimeType = mimeType;
    }
    
    public void setSuggestedFilename(final String suggestedFilename) {
        this.suggestedFilename = suggestedFilename;
    }
    
    public void setTextEncodingName(final String textEncodingName) {
        this.textEncodingName = textEncodingName;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public void setUserAgent(final String userAgent) {
        this.userAgent = userAgent;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)this.url);
        hashMap.put((Object)"userAgent", (Object)this.userAgent);
        hashMap.put((Object)"contentDisposition", (Object)this.contentDisposition);
        hashMap.put((Object)"mimeType", (Object)this.mimeType);
        hashMap.put((Object)"contentLength", (Object)this.contentLength);
        hashMap.put((Object)"suggestedFilename", (Object)this.suggestedFilename);
        hashMap.put((Object)"textEncodingName", (Object)this.textEncodingName);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DownloadStartRequest{url='");
        sb.append(this.url);
        sb.append("', userAgent='");
        sb.append(this.userAgent);
        sb.append("', contentDisposition='");
        sb.append(this.contentDisposition);
        sb.append("', mimeType='");
        sb.append(this.mimeType);
        sb.append("', contentLength=");
        sb.append(this.contentLength);
        sb.append(", suggestedFilename='");
        sb.append(this.suggestedFilename);
        sb.append("', textEncodingName='");
        return a.b(sb, this.textEncodingName, "'}");
    }
}
