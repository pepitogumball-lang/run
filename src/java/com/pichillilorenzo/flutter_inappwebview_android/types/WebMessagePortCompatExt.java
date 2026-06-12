package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import java.util.Map;

public class WebMessagePortCompatExt
{
    private int index;
    private String webMessageChannelId;
    
    public WebMessagePortCompatExt(final int index, final String webMessageChannelId) {
        this.index = index;
        this.webMessageChannelId = webMessageChannelId;
    }
    
    public static WebMessagePortCompatExt fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessagePortCompatExt((int)map.get((Object)"index"), (String)map.get((Object)"webMessageChannelId"));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final WebMessagePortCompatExt webMessagePortCompatExt = (WebMessagePortCompatExt)o;
            return this.index == webMessagePortCompatExt.index && this.webMessageChannelId.equals((Object)webMessagePortCompatExt.webMessageChannelId);
        }
        return false;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public String getWebMessageChannelId() {
        return this.webMessageChannelId;
    }
    
    @Override
    public int hashCode() {
        return this.webMessageChannelId.hashCode() + this.index * 31;
    }
    
    public void setIndex(final int index) {
        this.index = index;
    }
    
    public void setWebMessageChannelId(final String webMessageChannelId) {
        this.webMessageChannelId = webMessageChannelId;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"index", (Object)this.index);
        hashMap.put((Object)"webMessageChannelId", (Object)this.webMessageChannelId);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WebMessagePortCompatExt{index=");
        sb.append(this.index);
        sb.append(", webMessageChannelId='");
        return a.b(sb, this.webMessageChannelId, "'}");
    }
}
