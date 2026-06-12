package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import java.util.Map;

public class ProxyRuleExt
{
    private String schemeFilter;
    private String url;
    
    public ProxyRuleExt(final String schemeFilter, final String url) {
        this.schemeFilter = schemeFilter;
        this.url = url;
    }
    
    public static ProxyRuleExt fromMap(final Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new ProxyRuleExt((String)map.get((Object)"schemeFilter"), (String)map.get((Object)"url"));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ProxyRuleExt proxyRuleExt = (ProxyRuleExt)o;
            final String schemeFilter = this.schemeFilter;
            if (schemeFilter != null) {
                if (schemeFilter.equals((Object)proxyRuleExt.schemeFilter)) {
                    return this.url.equals((Object)proxyRuleExt.url);
                }
            }
            else if (proxyRuleExt.schemeFilter == null) {
                return this.url.equals((Object)proxyRuleExt.url);
            }
            return false;
        }
        return false;
    }
    
    public String getSchemeFilter() {
        return this.schemeFilter;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final String schemeFilter = this.schemeFilter;
        int hashCode;
        if (schemeFilter != null) {
            hashCode = schemeFilter.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.url.hashCode() + hashCode * 31;
    }
    
    public void setSchemeFilter(final String schemeFilter) {
        this.schemeFilter = schemeFilter;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public Map<String, String> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)this.url);
        hashMap.put((Object)"schemeFilter", (Object)this.schemeFilter);
        return (Map<String, String>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProxyRuleExt{schemeFilter='");
        sb.append(this.schemeFilter);
        sb.append("', url='");
        return a.b(sb, this.url, "'}");
    }
}
