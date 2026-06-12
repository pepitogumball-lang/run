package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;
import java.security.Principal;

public class ClientCertChallenge extends URLAuthenticationChallenge
{
    private String[] keyTypes;
    private Principal[] principals;
    
    public ClientCertChallenge(final URLProtectionSpace urlProtectionSpace, final Principal[] principals, final String[] keyTypes) {
        super(urlProtectionSpace);
        this.principals = principals;
        this.keyTypes = keyTypes;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final ClientCertChallenge clientCertChallenge = (ClientCertChallenge)o;
        return Arrays.equals((Object[])this.principals, (Object[])clientCertChallenge.principals) && Arrays.equals((Object[])this.keyTypes, (Object[])clientCertChallenge.keyTypes);
    }
    
    public String[] getKeyTypes() {
        return this.keyTypes;
    }
    
    public Principal[] getPrincipals() {
        return this.principals;
    }
    
    @Override
    public int hashCode() {
        return (super.hashCode() * 31 + Arrays.hashCode((Object[])this.principals)) * 31 + Arrays.hashCode((Object[])this.keyTypes);
    }
    
    public void setKeyTypes(final String[] keyTypes) {
        this.keyTypes = keyTypes;
    }
    
    public void setPrincipals(final Principal[] principals) {
        this.principals = principals;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final Principal[] principals = this.principals;
        final Object o = null;
        ArrayList list2;
        if (principals != null) {
            final ArrayList list = new ArrayList();
            final Principal[] principals2 = this.principals;
            final int length = principals2.length;
            int n = 0;
            while (true) {
                list2 = list;
                if (n >= length) {
                    break;
                }
                list.add((Object)principals2[n].getName());
                ++n;
            }
        }
        else {
            list2 = null;
        }
        final Map<String, Object> map = super.toMap();
        map.put((Object)"principals", (Object)list2);
        final String[] keyTypes = this.keyTypes;
        Object list3 = o;
        if (keyTypes != null) {
            list3 = Arrays.asList((Object[])keyTypes);
        }
        map.put((Object)"keyTypes", list3);
        return map;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientCertChallenge{principals=");
        sb.append(Arrays.toString((Object[])this.principals));
        sb.append(", keyTypes=");
        sb.append(Arrays.toString((Object[])this.keyTypes));
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
