package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import F0.m;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class TracingSettings implements ISettings<m>
{
    public static final String LOG_TAG = "TracingSettings";
    public List<Object> categories;
    public Integer tracingMode;
    
    public TracingSettings() {
        this.categories = (List<Object>)new ArrayList();
    }
    
    @Override
    public Map<String, Object> getRealSettings(final m m) {
        return this.toMap();
    }
    
    @Override
    public TracingSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            if (!s.equals((Object)"tracingMode")) {
                if (!s.equals((Object)"categories")) {
                    continue;
                }
                this.categories = (List<Object>)value;
            }
            else {
                this.tracingMode = (Integer)value;
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"categories", (Object)this.categories);
        hashMap.put((Object)"tracingMode", (Object)this.tracingMode);
        return (Map<String, Object>)hashMap;
    }
}
