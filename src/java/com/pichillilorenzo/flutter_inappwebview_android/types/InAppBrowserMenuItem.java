package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.android.gms.internal.measurement.L;
import java.util.Objects;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.Map;

public class InAppBrowserMenuItem
{
    private Object icon;
    private String iconColor;
    private int id;
    private Integer order;
    private boolean showAsAction;
    private String title;
    
    public InAppBrowserMenuItem(final int id, final String title, final Integer order, final Object icon, final String iconColor, final boolean showAsAction) {
        this.id = id;
        this.title = title;
        this.order = order;
        this.icon = icon;
        this.iconColor = iconColor;
        this.showAsAction = showAsAction;
    }
    
    public static InAppBrowserMenuItem fromMap(final Map<String, Object> map) {
        final Object o = null;
        if (map == null) {
            return null;
        }
        final int intValue = (int)map.get((Object)"id");
        final String s = (String)map.get((Object)"title");
        final Integer n = (Integer)map.get((Object)"order");
        Object o2 = map.get((Object)"icon");
        if (o2 instanceof Map) {
            o2 = AndroidResource.fromMap((Map<String, Object>)map.get((Object)"icon"));
        }
        else if (!(o2 instanceof byte[])) {
            o2 = o;
        }
        return new InAppBrowserMenuItem(intValue, s, n, o2, (String)map.get((Object)"iconColor"), Util.getOrDefault(map, "showAsAction", Boolean.FALSE));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final InAppBrowserMenuItem inAppBrowserMenuItem = (InAppBrowserMenuItem)o;
            return this.id == inAppBrowserMenuItem.id && this.showAsAction == inAppBrowserMenuItem.showAsAction && this.title.equals((Object)inAppBrowserMenuItem.title) && Objects.equals((Object)this.order, (Object)inAppBrowserMenuItem.order) && Objects.equals(this.icon, inAppBrowserMenuItem.icon) && Objects.equals((Object)this.iconColor, (Object)inAppBrowserMenuItem.iconColor);
        }
        return false;
    }
    
    public Object getIcon() {
        return this.icon;
    }
    
    public String getIconColor() {
        return this.iconColor;
    }
    
    public int getId() {
        return this.id;
    }
    
    public Integer getOrder() {
        return this.order;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int g = L.g(this.id * 31, this.title, 31);
        final Integer order = this.order;
        int hashCode = 0;
        int hashCode2;
        if (order != null) {
            hashCode2 = order.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object icon = this.icon;
        int hashCode3;
        if (icon != null) {
            hashCode3 = icon.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String iconColor = this.iconColor;
        if (iconColor != null) {
            hashCode = iconColor.hashCode();
        }
        return (((g + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + (this.showAsAction ? 1 : 0);
    }
    
    public boolean isShowAsAction() {
        return this.showAsAction;
    }
    
    public void setIcon(final Object icon) {
        this.icon = icon;
    }
    
    public void setIconColor(final String iconColor) {
        this.iconColor = iconColor;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public void setOrder(final Integer order) {
        this.order = order;
    }
    
    public void setShowAsAction(final boolean showAsAction) {
        this.showAsAction = showAsAction;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InAppBrowserMenuItem{id=");
        sb.append(this.id);
        sb.append(", title='");
        sb.append(this.title);
        sb.append("', order=");
        sb.append((Object)this.order);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconColor='");
        sb.append(this.iconColor);
        sb.append("', showAsAction=");
        sb.append(this.showAsAction);
        sb.append('}');
        return sb.toString();
    }
}
