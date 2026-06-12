package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Objects;
import F0.d;
import F0.n;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class WebMessageCompatExt
{
    private Object data;
    private List<WebMessagePortCompatExt> ports;
    private int type;
    
    public WebMessageCompatExt(final Object data, final int type, final List<WebMessagePortCompatExt> ports) {
        this.data = data;
        this.type = type;
        this.ports = ports;
    }
    
    public static WebMessageCompatExt fromMap(final Map<String, Object> map) {
        final List<WebMessagePortCompatExt> list = null;
        if (map == null) {
            return null;
        }
        final Object value = map.get((Object)"data");
        final Integer n = (Integer)map.get((Object)"type");
        final List list2 = (List)map.get((Object)"ports");
        List<WebMessagePortCompatExt> list3 = list;
        if (list2 != null) {
            list3 = list;
            if (!list2.isEmpty()) {
                final ArrayList list4 = new ArrayList();
                final Iterator iterator = list2.iterator();
                while (true) {
                    list3 = (List<WebMessagePortCompatExt>)list4;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    list4.add((Object)WebMessagePortCompatExt.fromMap((Map<String, Object>)iterator.next()));
                }
            }
        }
        return new WebMessageCompatExt(value, n, list3);
    }
    
    public static WebMessageCompatExt fromMapWebMessageCompat(final n n) {
        Object o;
        if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && n.d == 1) {
            n.a(1);
            o = n.c;
            Objects.requireNonNull(o);
        }
        else {
            n.a(0);
            o = n.b;
        }
        return new WebMessageCompatExt(o, n.d, null);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final WebMessageCompatExt webMessageCompatExt = (WebMessageCompatExt)o;
            return this.type == webMessageCompatExt.type && Objects.equals(this.data, webMessageCompatExt.data) && Objects.equals((Object)this.ports, (Object)webMessageCompatExt.ports);
        }
        return false;
    }
    
    public Object getData() {
        return this.data;
    }
    
    public List<WebMessagePortCompatExt> getPorts() {
        return this.ports;
    }
    
    public int getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final Object data = this.data;
        int hashCode = 0;
        int hashCode2;
        if (data != null) {
            hashCode2 = data.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int type = this.type;
        final List<WebMessagePortCompatExt> ports = this.ports;
        if (ports != null) {
            hashCode = ports.hashCode();
        }
        return (hashCode2 * 31 + type) * 31 + hashCode;
    }
    
    public void setData(final Object data) {
        this.data = data;
    }
    
    public void setPorts(final List<WebMessagePortCompatExt> ports) {
        this.ports = ports;
    }
    
    public void setType(final int type) {
        this.type = type;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"data", this.data);
        hashMap.put((Object)"type", (Object)this.type);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WebMessageCompatExt{data=");
        sb.append(this.data);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", ports=");
        sb.append((Object)this.ports);
        sb.append('}');
        return sb.toString();
    }
}
