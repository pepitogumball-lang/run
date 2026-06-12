package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.android.gms.internal.measurement.L;
import java.util.Arrays;
import java.util.Map;

public class CustomTabsActionButton
{
    private String description;
    private byte[] icon;
    private int id;
    private boolean shouldTint;
    
    public CustomTabsActionButton(final int id, final byte[] icon, final String description, final boolean shouldTint) {
        this.id = id;
        this.icon = icon;
        this.description = description;
        this.shouldTint = shouldTint;
    }
    
    public static CustomTabsActionButton fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsActionButton((int)map.get((Object)"id"), (byte[])map.get((Object)"icon"), (String)map.get((Object)"description"), (boolean)map.get((Object)"shouldTint"));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final CustomTabsActionButton customTabsActionButton = (CustomTabsActionButton)o;
            return this.id == customTabsActionButton.id && this.shouldTint == customTabsActionButton.shouldTint && Arrays.equals(this.icon, customTabsActionButton.icon) && this.description.equals((Object)customTabsActionButton.description);
        }
        return false;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public byte[] getIcon() {
        return this.icon;
    }
    
    public int getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return L.g((Arrays.hashCode(this.icon) + this.id * 31) * 31, this.description, 31) + (this.shouldTint ? 1 : 0);
    }
    
    public boolean isShouldTint() {
        return this.shouldTint;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setIcon(final byte[] icon) {
        this.icon = icon;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public void setShouldTint(final boolean shouldTint) {
        this.shouldTint = shouldTint;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomTabsActionButton{id=");
        sb.append(this.id);
        sb.append(", icon=");
        sb.append(Arrays.toString(this.icon));
        sb.append(", description='");
        sb.append(this.description);
        sb.append("', shouldTint=");
        sb.append(this.shouldTint);
        sb.append('}');
        return sb.toString();
    }
}
