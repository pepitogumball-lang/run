package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import com.google.android.gms.internal.measurement.L;
import java.util.Arrays;
import java.util.Map;

public class CustomSchemeResponse
{
    private String contentEncoding;
    private String contentType;
    private byte[] data;
    
    public CustomSchemeResponse(final byte[] data, final String contentType, final String contentEncoding) {
        this.data = data;
        this.contentType = contentType;
        this.contentEncoding = contentEncoding;
    }
    
    public static CustomSchemeResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomSchemeResponse((byte[])map.get((Object)"data"), (String)map.get((Object)"contentType"), (String)map.get((Object)"contentEncoding"));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final CustomSchemeResponse customSchemeResponse = (CustomSchemeResponse)o;
            return Arrays.equals(this.data, customSchemeResponse.data) && this.contentType.equals((Object)customSchemeResponse.contentType) && this.contentEncoding.equals((Object)customSchemeResponse.contentEncoding);
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
    
    @Override
    public int hashCode() {
        return this.contentEncoding.hashCode() + L.g(Arrays.hashCode(this.data) * 31, this.contentType, 31);
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
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomSchemeResponse{data=");
        sb.append(Arrays.toString(this.data));
        sb.append(", contentType='");
        sb.append(this.contentType);
        sb.append("', contentEncoding='");
        return a.b(sb, this.contentEncoding, "'}");
    }
}
