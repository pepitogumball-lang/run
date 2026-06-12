package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class CustomTabsSecondaryToolbar
{
    private List<AndroidResource> clickableIDs;
    private AndroidResource layout;
    
    public CustomTabsSecondaryToolbar(final AndroidResource layout, final List<AndroidResource> clickableIDs) {
        new ArrayList();
        this.layout = layout;
        this.clickableIDs = clickableIDs;
    }
    
    public static CustomTabsSecondaryToolbar fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        final AndroidResource fromMap = AndroidResource.fromMap((Map<String, Object>)map.get((Object)"layout"));
        final ArrayList list = new ArrayList();
        final List list2 = (List)map.get((Object)"clickableIDs");
        if (list2 != null) {
            final Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                final AndroidResource fromMap2 = AndroidResource.fromMap((Map<String, Object>)((Map)iterator.next()).get((Object)"id"));
                if (fromMap2 != null) {
                    list.add((Object)fromMap2);
                }
            }
        }
        return new CustomTabsSecondaryToolbar(fromMap, (List<AndroidResource>)list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final CustomTabsSecondaryToolbar customTabsSecondaryToolbar = (CustomTabsSecondaryToolbar)o;
            return this.layout.equals(customTabsSecondaryToolbar.layout) && this.clickableIDs.equals((Object)customTabsSecondaryToolbar.clickableIDs);
        }
        return false;
    }
    
    public List<AndroidResource> getClickableIDs() {
        return this.clickableIDs;
    }
    
    public AndroidResource getLayout() {
        return this.layout;
    }
    
    @Override
    public int hashCode() {
        return this.clickableIDs.hashCode() + this.layout.hashCode() * 31;
    }
    
    public void setClickableIDs(final List<AndroidResource> clickableIDs) {
        this.clickableIDs = clickableIDs;
    }
    
    public void setLayout(final AndroidResource layout) {
        this.layout = layout;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomTabsSecondaryToolbar{layout=");
        sb.append((Object)this.layout);
        sb.append(", clickableIDs=");
        sb.append((Object)this.clickableIDs);
        sb.append('}');
        return sb.toString();
    }
}
