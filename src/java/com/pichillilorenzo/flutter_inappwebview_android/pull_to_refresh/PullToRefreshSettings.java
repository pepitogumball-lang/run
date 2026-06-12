package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class PullToRefreshSettings implements ISettings<PullToRefreshLayout>
{
    public static final String LOG_TAG = "PullToRefreshSettings";
    public String backgroundColor;
    public String color;
    public Integer distanceToTriggerSync;
    public Boolean enabled;
    public Integer size;
    public Integer slingshotDistance;
    
    public PullToRefreshSettings() {
        this.enabled = Boolean.TRUE;
    }
    
    @Override
    public Map<String, Object> getRealSettings(final PullToRefreshLayout pullToRefreshLayout) {
        return this.toMap();
    }
    
    @Override
    public PullToRefreshSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            int n = -1;
            switch (s.hashCode()) {
                case 1719097976: {
                    if (!s.equals((Object)"slingshotDistance")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 1287124693: {
                    if (!s.equals((Object)"backgroundColor")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 94842723: {
                    if (!s.equals((Object)"color")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 3530753: {
                    if (!s.equals((Object)"size")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1609594047: {
                    if (!s.equals((Object)"enabled")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1878912765: {
                    if (!s.equals((Object)"distanceToTriggerSync")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    continue;
                }
                case 5: {
                    this.slingshotDistance = (Integer)value;
                    continue;
                }
                case 4: {
                    this.backgroundColor = (String)value;
                    continue;
                }
                case 3: {
                    this.color = (String)value;
                    continue;
                }
                case 2: {
                    this.size = (Integer)value;
                    continue;
                }
                case 1: {
                    this.enabled = (Boolean)value;
                    continue;
                }
                case 0: {
                    this.distanceToTriggerSync = (Integer)value;
                    continue;
                }
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"enabled", (Object)this.enabled);
        hashMap.put((Object)"color", (Object)this.color);
        hashMap.put((Object)"backgroundColor", (Object)this.backgroundColor);
        hashMap.put((Object)"distanceToTriggerSync", (Object)this.distanceToTriggerSync);
        hashMap.put((Object)"slingshotDistance", (Object)this.slingshotDistance);
        hashMap.put((Object)"size", (Object)this.size);
        return (Map<String, Object>)hashMap;
    }
}
