package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.Map;

public class CustomTabsMenuItem
{
    private int id;
    private String label;
    
    public CustomTabsMenuItem(final int id, final String label) {
        this.id = id;
        this.label = label;
    }
    
    public static CustomTabsMenuItem fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem((int)map.get((Object)"id"), (String)map.get((Object)"label"));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem)o;
            return this.id == customTabsMenuItem.id && this.label.equals((Object)customTabsMenuItem.label);
        }
        return false;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    @Override
    public int hashCode() {
        return this.label.hashCode() + this.id * 31;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public void setLabel(final String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomTabsMenuItem{id=");
        sb.append(this.id);
        sb.append(", label='");
        return a.b(sb, this.label, "'}");
    }
}
