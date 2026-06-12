package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class HttpAuthenticationChallenge extends URLAuthenticationChallenge
{
    private int previousFailureCount;
    URLCredential proposedCredential;
    
    public HttpAuthenticationChallenge(final URLProtectionSpace urlProtectionSpace, final int previousFailureCount, final URLCredential proposedCredential) {
        super(urlProtectionSpace);
        this.previousFailureCount = previousFailureCount;
        this.proposedCredential = proposedCredential;
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
        if (!super.equals(o)) {
            return false;
        }
        final HttpAuthenticationChallenge httpAuthenticationChallenge = (HttpAuthenticationChallenge)o;
        if (this.previousFailureCount != httpAuthenticationChallenge.previousFailureCount) {
            return false;
        }
        final URLCredential proposedCredential = this.proposedCredential;
        final URLCredential proposedCredential2 = httpAuthenticationChallenge.proposedCredential;
        if (proposedCredential != null) {
            equals = proposedCredential.equals(proposedCredential2);
        }
        else if (proposedCredential2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public int getPreviousFailureCount() {
        return this.previousFailureCount;
    }
    
    public URLCredential getProposedCredential() {
        return this.proposedCredential;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode();
        final int previousFailureCount = this.previousFailureCount;
        final URLCredential proposedCredential = this.proposedCredential;
        int hashCode2;
        if (proposedCredential != null) {
            hashCode2 = proposedCredential.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return (hashCode * 31 + previousFailureCount) * 31 + hashCode2;
    }
    
    public void setPreviousFailureCount(final int previousFailureCount) {
        this.previousFailureCount = previousFailureCount;
    }
    
    public void setProposedCredential(final URLCredential proposedCredential) {
        this.proposedCredential = proposedCredential;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final Map<String, Object> map = super.toMap();
        map.put((Object)"previousFailureCount", (Object)this.previousFailureCount);
        final URLCredential proposedCredential = this.proposedCredential;
        Map map2;
        if (proposedCredential != null) {
            map2 = proposedCredential.toMap();
        }
        else {
            map2 = null;
        }
        map.put((Object)"proposedCredential", (Object)map2);
        map.put((Object)"failureResponse", (Object)null);
        map.put((Object)"error", (Object)null);
        return map;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HttpAuthenticationChallenge{previousFailureCount=");
        sb.append(this.previousFailureCount);
        sb.append(", proposedCredential=");
        sb.append((Object)this.proposedCredential);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
