package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.ArrayList;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import java.util.List;
import F0.c;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class ProxySettings implements ISettings<c>
{
    List<String> bypassRules;
    Boolean bypassSimpleHostnames;
    List<String> directs;
    List<ProxyRuleExt> proxyRules;
    Boolean removeImplicitRules;
    Boolean reverseBypassEnabled;
    
    public ProxySettings() {
        this.bypassRules = (List<String>)new ArrayList();
        this.directs = (List<String>)new ArrayList();
        this.proxyRules = (List<ProxyRuleExt>)new ArrayList();
        this.bypassSimpleHostnames = null;
        this.removeImplicitRules = null;
        this.reverseBypassEnabled = Boolean.FALSE;
    }
    
    @Override
    public Map<String, Object> getRealSettings(final c c) {
        this.toMap();
        new ArrayList();
        throw null;
    }
    
    @Override
    public ProxySettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            int n = -1;
            switch (s.hashCode()) {
                case 1670504874: {
                    if (!s.equals((Object)"directs")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 1021951215: {
                    if (!s.equals((Object)"bypassRules")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -940646418: {
                    if (!s.equals((Object)"removeImplicitRules")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1033831049: {
                    if (!s.equals((Object)"reverseBypassEnabled")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1872895191: {
                    if (!s.equals((Object)"proxyRules")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -2059288826: {
                    if (!s.equals((Object)"bypassSimpleHostnames")) {
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
                    this.directs = (List<String>)value;
                    continue;
                }
                case 4: {
                    this.bypassRules = (List<String>)value;
                    continue;
                }
                case 3: {
                    this.removeImplicitRules = (Boolean)value;
                    continue;
                }
                case 2: {
                    this.reverseBypassEnabled = (Boolean)value;
                    continue;
                }
                case 1: {
                    this.proxyRules = (List<ProxyRuleExt>)new ArrayList();
                    final Iterator iterator2 = ((List)value).iterator();
                    while (iterator2.hasNext()) {
                        final ProxyRuleExt fromMap = ProxyRuleExt.fromMap((Map<String, String>)iterator2.next());
                        if (fromMap != null) {
                            this.proxyRules.add((Object)fromMap);
                        }
                    }
                    continue;
                }
                case 0: {
                    this.bypassSimpleHostnames = (Boolean)value;
                    continue;
                }
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = this.proxyRules.iterator();
        while (iterator.hasNext()) {
            list.add((Object)((ProxyRuleExt)iterator.next()).toMap());
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"bypassRules", (Object)this.bypassRules);
        hashMap.put((Object)"directs", (Object)this.directs);
        hashMap.put((Object)"proxyRules", (Object)list);
        hashMap.put((Object)"bypassSimpleHostnames", (Object)this.bypassSimpleHostnames);
        hashMap.put((Object)"removeImplicitRules", (Object)this.removeImplicitRules);
        hashMap.put((Object)"reverseBypassEnabled", (Object)this.reverseBypassEnabled);
        return (Map<String, Object>)hashMap;
    }
}
