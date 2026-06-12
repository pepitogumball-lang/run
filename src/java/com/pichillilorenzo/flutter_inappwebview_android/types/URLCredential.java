package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import java.util.Map;

public class URLCredential
{
    private Long id;
    private String password;
    private Long protectionSpaceId;
    private String username;
    
    public URLCredential(final Long id, final String username, final String password, final Long protectionSpaceId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.protectionSpaceId = protectionSpaceId;
    }
    
    public URLCredential(final String username, final String password) {
        this.username = username;
        this.password = password;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final URLCredential urlCredential = (URLCredential)o;
            final String username = this.username;
            Label_0064: {
                if (username != null) {
                    if (username.equals((Object)urlCredential.username)) {
                        break Label_0064;
                    }
                }
                else if (urlCredential.username == null) {
                    break Label_0064;
                }
                return false;
            }
            final String password = this.password;
            final String password2 = urlCredential.password;
            if (password != null) {
                equals = password.equals((Object)password2);
            }
            else if (password2 != null) {
                equals = false;
            }
            return equals;
        }
        return false;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public Long getProtectionSpaceId() {
        return this.protectionSpaceId;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final String username = this.username;
        int hashCode = 0;
        int hashCode2;
        if (username != null) {
            hashCode2 = username.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String password = this.password;
        if (password != null) {
            hashCode = password.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public void setProtectionSpaceId(final Long protectionSpaceId) {
        this.protectionSpaceId = protectionSpaceId;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"username", (Object)this.username);
        hashMap.put((Object)"password", (Object)this.password);
        hashMap.put((Object)"certificates", (Object)null);
        hashMap.put((Object)"persistence", (Object)null);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("URLCredential{username='");
        sb.append(this.username);
        sb.append("', password='");
        return a.b(sb, this.password, "'}");
    }
}
