package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.Map;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.List;

public class ContentBlockerTrigger
{
    private List<String> ifDomain;
    private List<String> ifTopUrl;
    private List<String> loadType;
    private List<ContentBlockerTriggerResourceType> resourceType;
    private List<String> unlessDomain;
    private List<String> unlessTopUrl;
    private String urlFilter;
    private Boolean urlFilterIsCaseSensitive;
    private Pattern urlFilterPatternCompiled;
    
    public ContentBlockerTrigger(final String urlFilter, final Boolean b, List<ContentBlockerTriggerResourceType> resourceType, List<String> ifDomain, List<String> unlessDomain, List<String> loadType, List<String> ifTopUrl, List<String> unlessTopUrl) {
        this.resourceType = (List<ContentBlockerTriggerResourceType>)new ArrayList();
        this.ifDomain = (List<String>)new ArrayList();
        this.unlessDomain = (List<String>)new ArrayList();
        this.loadType = (List<String>)new ArrayList();
        this.ifTopUrl = (List<String>)new ArrayList();
        this.unlessTopUrl = (List<String>)new ArrayList();
        int n = 0;
        final boolean b2 = b != null && b;
        this.urlFilterIsCaseSensitive = b2;
        this.urlFilter = urlFilter;
        if (!b2) {
            n = 2;
        }
        this.urlFilterPatternCompiled = Pattern.compile(urlFilter, n);
        if (resourceType == null) {
            resourceType = this.resourceType;
        }
        this.resourceType = resourceType;
        if (ifDomain == null) {
            ifDomain = this.ifDomain;
        }
        this.ifDomain = ifDomain;
        if (unlessDomain == null) {
            unlessDomain = this.unlessDomain;
        }
        this.unlessDomain = unlessDomain;
        if (!ifDomain.isEmpty() && !this.unlessDomain.isEmpty()) {
            throw new AssertionError();
        }
        if (loadType == null) {
            loadType = this.loadType;
        }
        this.loadType = loadType;
        if (loadType.size() > 2) {
            throw new AssertionError();
        }
        if (ifTopUrl == null) {
            ifTopUrl = this.ifTopUrl;
        }
        this.ifTopUrl = ifTopUrl;
        if (unlessTopUrl == null) {
            unlessTopUrl = this.unlessTopUrl;
        }
        this.unlessTopUrl = unlessTopUrl;
        if (!ifTopUrl.isEmpty() && !this.unlessTopUrl.isEmpty()) {
            throw new AssertionError();
        }
    }
    
    public static ContentBlockerTrigger fromMap(final Map<String, Object> map) {
        final String s = (String)map.get((Object)"url-filter");
        final Boolean b = (Boolean)map.get((Object)"url-filter-is-case-sensitive");
        final List list = (List)map.get((Object)"resource-type");
        final ArrayList list2 = new ArrayList();
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)ContentBlockerTriggerResourceType.fromValue((String)iterator.next()));
            }
        }
        else {
            list2.addAll((Collection)Arrays.asList((Object[])ContentBlockerTriggerResourceType.values()));
        }
        return new ContentBlockerTrigger(s, b, (List<ContentBlockerTriggerResourceType>)list2, (List<String>)map.get((Object)"if-domain"), (List<String>)map.get((Object)"unless-domain"), (List<String>)map.get((Object)"load-type"), (List<String>)map.get((Object)"if-top-url"), (List<String>)map.get((Object)"unless-top-url"));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ContentBlockerTrigger contentBlockerTrigger = (ContentBlockerTrigger)o;
            return this.urlFilter.equals((Object)contentBlockerTrigger.urlFilter) && this.urlFilterPatternCompiled.equals(contentBlockerTrigger.urlFilterPatternCompiled) && this.urlFilterIsCaseSensitive.equals((Object)contentBlockerTrigger.urlFilterIsCaseSensitive) && this.resourceType.equals((Object)contentBlockerTrigger.resourceType) && this.ifDomain.equals((Object)contentBlockerTrigger.ifDomain) && this.unlessDomain.equals((Object)contentBlockerTrigger.unlessDomain) && this.loadType.equals((Object)contentBlockerTrigger.loadType) && this.ifTopUrl.equals((Object)contentBlockerTrigger.ifTopUrl) && this.unlessTopUrl.equals((Object)contentBlockerTrigger.unlessTopUrl);
        }
        return false;
    }
    
    public List<String> getIfDomain() {
        return this.ifDomain;
    }
    
    public List<String> getIfTopUrl() {
        return this.ifTopUrl;
    }
    
    public List<String> getLoadType() {
        return this.loadType;
    }
    
    public List<ContentBlockerTriggerResourceType> getResourceType() {
        return this.resourceType;
    }
    
    public List<String> getUnlessDomain() {
        return this.unlessDomain;
    }
    
    public List<String> getUnlessTopUrl() {
        return this.unlessTopUrl;
    }
    
    public String getUrlFilter() {
        return this.urlFilter;
    }
    
    public Boolean getUrlFilterIsCaseSensitive() {
        return this.urlFilterIsCaseSensitive;
    }
    
    public Pattern getUrlFilterPatternCompiled() {
        return this.urlFilterPatternCompiled;
    }
    
    @Override
    public int hashCode() {
        return this.unlessTopUrl.hashCode() + (this.ifTopUrl.hashCode() + (this.loadType.hashCode() + (this.unlessDomain.hashCode() + (this.ifDomain.hashCode() + (this.resourceType.hashCode() + (this.urlFilterIsCaseSensitive.hashCode() + (this.urlFilterPatternCompiled.hashCode() + this.urlFilter.hashCode() * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31;
    }
    
    public void setIfDomain(final List<String> ifDomain) {
        this.ifDomain = ifDomain;
    }
    
    public void setIfTopUrl(final List<String> ifTopUrl) {
        this.ifTopUrl = ifTopUrl;
    }
    
    public void setLoadType(final List<String> loadType) {
        this.loadType = loadType;
    }
    
    public void setResourceType(final List<ContentBlockerTriggerResourceType> resourceType) {
        this.resourceType = resourceType;
    }
    
    public void setUnlessDomain(final List<String> unlessDomain) {
        this.unlessDomain = unlessDomain;
    }
    
    public void setUnlessTopUrl(final List<String> unlessTopUrl) {
        this.unlessTopUrl = unlessTopUrl;
    }
    
    public void setUrlFilter(final String urlFilter) {
        this.urlFilter = urlFilter;
    }
    
    public void setUrlFilterIsCaseSensitive(final Boolean urlFilterIsCaseSensitive) {
        this.urlFilterIsCaseSensitive = urlFilterIsCaseSensitive;
    }
    
    public void setUrlFilterPatternCompiled(final Pattern urlFilterPatternCompiled) {
        this.urlFilterPatternCompiled = urlFilterPatternCompiled;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContentBlockerTrigger{urlFilter='");
        sb.append(this.urlFilter);
        sb.append("', urlFilterPatternCompiled=");
        sb.append((Object)this.urlFilterPatternCompiled);
        sb.append(", urlFilterIsCaseSensitive=");
        sb.append((Object)this.urlFilterIsCaseSensitive);
        sb.append(", resourceType=");
        sb.append((Object)this.resourceType);
        sb.append(", ifDomain=");
        sb.append((Object)this.ifDomain);
        sb.append(", unlessDomain=");
        sb.append((Object)this.unlessDomain);
        sb.append(", loadType=");
        sb.append((Object)this.loadType);
        sb.append(", ifTopUrl=");
        sb.append((Object)this.ifTopUrl);
        sb.append(", unlessTopUrl=");
        sb.append((Object)this.unlessTopUrl);
        sb.append('}');
        return sb.toString();
    }
}
