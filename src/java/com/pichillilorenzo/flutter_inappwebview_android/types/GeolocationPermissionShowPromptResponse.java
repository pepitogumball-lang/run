package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class GeolocationPermissionShowPromptResponse
{
    boolean allow;
    private String origin;
    boolean retain;
    
    public GeolocationPermissionShowPromptResponse(final String origin, final boolean allow, final boolean retain) {
        this.origin = origin;
        this.allow = allow;
        this.retain = retain;
    }
    
    public static GeolocationPermissionShowPromptResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new GeolocationPermissionShowPromptResponse((String)map.get((Object)"origin"), (boolean)map.get((Object)"allow"), (boolean)map.get((Object)"retain"));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse = (GeolocationPermissionShowPromptResponse)o;
            return this.allow == geolocationPermissionShowPromptResponse.allow && this.retain == geolocationPermissionShowPromptResponse.retain && this.origin.equals((Object)geolocationPermissionShowPromptResponse.origin);
        }
        return false;
    }
    
    public String getOrigin() {
        return this.origin;
    }
    
    @Override
    public int hashCode() {
        return (this.origin.hashCode() * 31 + (this.allow ? 1 : 0)) * 31 + (this.retain ? 1 : 0);
    }
    
    public boolean isAllow() {
        return this.allow;
    }
    
    public boolean isRetain() {
        return this.retain;
    }
    
    public void setAllow(final boolean allow) {
        this.allow = allow;
    }
    
    public void setOrigin(final String origin) {
        this.origin = origin;
    }
    
    public void setRetain(final boolean retain) {
        this.retain = retain;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeolocationPermissionShowPromptResponse{origin='");
        sb.append(this.origin);
        sb.append("', allow=");
        sb.append(this.allow);
        sb.append(", retain=");
        sb.append(this.retain);
        sb.append('}');
        return sb.toString();
    }
}
