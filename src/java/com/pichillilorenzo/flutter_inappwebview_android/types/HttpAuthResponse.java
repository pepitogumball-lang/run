package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.android.gms.internal.measurement.L;
import java.util.Map;

public class HttpAuthResponse
{
    private Integer action;
    private String password;
    boolean permanentPersistence;
    private String username;
    
    public HttpAuthResponse(final String username, final String password, final boolean permanentPersistence, final Integer action) {
        this.username = username;
        this.password = password;
        this.permanentPersistence = permanentPersistence;
        this.action = action;
    }
    
    public static HttpAuthResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new HttpAuthResponse((String)map.get((Object)"username"), (String)map.get((Object)"password"), (boolean)map.get((Object)"permanentPersistence"), (Integer)map.get((Object)"action"));
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
        final HttpAuthResponse httpAuthResponse = (HttpAuthResponse)o;
        if (this.permanentPersistence != httpAuthResponse.permanentPersistence) {
            return false;
        }
        if (!this.username.equals((Object)httpAuthResponse.username)) {
            return false;
        }
        if (!this.password.equals((Object)httpAuthResponse.password)) {
            return false;
        }
        final Integer action = this.action;
        final Integer action2 = httpAuthResponse.action;
        if (action != null) {
            equals = action.equals((Object)action2);
        }
        else if (action2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public Integer getAction() {
        return this.action;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int g = L.g(this.username.hashCode() * 31, this.password, 31);
        final int permanentPersistence = this.permanentPersistence ? 1 : 0;
        final Integer action = this.action;
        int hashCode;
        if (action != null) {
            hashCode = action.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (g + permanentPersistence) * 31 + hashCode;
    }
    
    public boolean isPermanentPersistence() {
        return this.permanentPersistence;
    }
    
    public void setAction(final Integer action) {
        this.action = action;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public void setPermanentPersistence(final boolean permanentPersistence) {
        this.permanentPersistence = permanentPersistence;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HttpAuthResponse{username='");
        sb.append(this.username);
        sb.append("', password='");
        sb.append(this.password);
        sb.append("', permanentPersistence=");
        sb.append(this.permanentPersistence);
        sb.append(", action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
