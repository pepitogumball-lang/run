package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

public class NavigationAction
{
    boolean hasGesture;
    boolean isForMainFrame;
    boolean isRedirect;
    URLRequest request;
    
    public NavigationAction(final URLRequest request, final boolean isForMainFrame, final boolean hasGesture, final boolean isRedirect) {
        this.request = request;
        this.isForMainFrame = isForMainFrame;
        this.hasGesture = hasGesture;
        this.isRedirect = isRedirect;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final NavigationAction navigationAction = (NavigationAction)o;
            return this.isForMainFrame == navigationAction.isForMainFrame && this.hasGesture == navigationAction.hasGesture && this.isRedirect == navigationAction.isRedirect && this.request.equals(navigationAction.request);
        }
        return false;
    }
    
    public URLRequest getRequest() {
        return this.request;
    }
    
    @Override
    public int hashCode() {
        return ((this.request.hashCode() * 31 + (this.isForMainFrame ? 1 : 0)) * 31 + (this.hasGesture ? 1 : 0)) * 31 + (this.isRedirect ? 1 : 0);
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
    
    public void setRedirect(final boolean isRedirect) {
        this.isRedirect = isRedirect;
    }
    
    public void setRequest(final URLRequest request) {
        this.request = request;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"request", (Object)this.request.toMap());
        hashMap.put((Object)"isForMainFrame", (Object)this.isForMainFrame);
        hashMap.put((Object)"hasGesture", (Object)this.hasGesture);
        hashMap.put((Object)"isRedirect", (Object)this.isRedirect);
        hashMap.put((Object)"navigationType", (Object)null);
        hashMap.put((Object)"sourceFrame", (Object)null);
        hashMap.put((Object)"targetFrame", (Object)null);
        hashMap.put((Object)"shouldPerformDownload", (Object)null);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NavigationAction{request=");
        sb.append((Object)this.request);
        sb.append(", isForMainFrame=");
        sb.append(this.isForMainFrame);
        sb.append(", hasGesture=");
        sb.append(this.hasGesture);
        sb.append(", isRedirect=");
        sb.append(this.isRedirect);
        sb.append('}');
        return sb.toString();
    }
}
