package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class ServerTrustAuthResponse
{
    private Integer action;
    
    public ServerTrustAuthResponse(final Integer action) {
        this.action = action;
    }
    
    public static ServerTrustAuthResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ServerTrustAuthResponse((Integer)map.get((Object)"action"));
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ServerTrustAuthResponse serverTrustAuthResponse = (ServerTrustAuthResponse)o;
            final Integer action = this.action;
            final Integer action2 = serverTrustAuthResponse.action;
            if (action != null) {
                equals = action.equals((Object)action2);
            }
            else if (action2 != null) {
                equals = false;
            }
            return equals;
        }
        return false;
    }
    
    public Integer getAction() {
        return this.action;
    }
    
    @Override
    public int hashCode() {
        final Integer action = this.action;
        int hashCode;
        if (action != null) {
            hashCode = action.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public void setAction(final Integer action) {
        this.action = action;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServerTrustAuthResponse{action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
