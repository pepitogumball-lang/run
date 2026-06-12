package com.pichillilorenzo.flutter_inappwebview_android.webview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class ContextMenuSettings implements ISettings<Object>
{
    public static final String LOG_TAG = "ContextMenuOptions";
    public Boolean hideDefaultSystemContextMenuItems;
    
    public ContextMenuSettings() {
        this.hideDefaultSystemContextMenuItems = Boolean.FALSE;
    }
    
    @Override
    public Map<String, Object> getRealSettings(final Object o) {
        return this.toMap();
    }
    
    @Override
    public ContextMenuSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            if (!s.equals((Object)"hideDefaultSystemContextMenuItems")) {
                continue;
            }
            this.hideDefaultSystemContextMenuItems = (Boolean)value;
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"hideDefaultSystemContextMenuItems", (Object)this.hideDefaultSystemContextMenuItems);
        return (Map<String, Object>)hashMap;
    }
}
