package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;
import java.util.List;

public class PermissionResponse
{
    private Integer action;
    private List<String> resources;
    
    public PermissionResponse(final List<String> resources, final Integer action) {
        this.resources = resources;
        this.action = action;
    }
    
    public static PermissionResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new PermissionResponse((List<String>)map.get((Object)"resources"), (Integer)map.get((Object)"action"));
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
        final PermissionResponse permissionResponse = (PermissionResponse)o;
        if (!this.resources.equals((Object)permissionResponse.resources)) {
            return false;
        }
        final Integer action = this.action;
        final Integer action2 = permissionResponse.action;
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
    
    public List<String> getResources() {
        return this.resources;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.resources.hashCode();
        final Integer action = this.action;
        int hashCode2;
        if (action != null) {
            hashCode2 = action.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    public void setAction(final Integer action) {
        this.action = action;
    }
    
    public void setResources(final List<String> resources) {
        this.resources = resources;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PermissionResponse{resources=");
        sb.append((Object)this.resources);
        sb.append(", action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
