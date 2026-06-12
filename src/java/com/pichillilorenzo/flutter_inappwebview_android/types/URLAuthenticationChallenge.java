package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

public class URLAuthenticationChallenge
{
    private URLProtectionSpace protectionSpace;
    
    public URLAuthenticationChallenge(final URLProtectionSpace protectionSpace) {
        this.protectionSpace = protectionSpace;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.protectionSpace.equals(((URLAuthenticationChallenge)o).protectionSpace));
    }
    
    public URLProtectionSpace getProtectionSpace() {
        return this.protectionSpace;
    }
    
    @Override
    public int hashCode() {
        return this.protectionSpace.hashCode();
    }
    
    public void setProtectionSpace(final URLProtectionSpace protectionSpace) {
        this.protectionSpace = protectionSpace;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"protectionSpace", (Object)this.protectionSpace.toMap());
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("URLAuthenticationChallenge{protectionSpace=");
        sb.append((Object)this.protectionSpace);
        sb.append('}');
        return sb.toString();
    }
}
