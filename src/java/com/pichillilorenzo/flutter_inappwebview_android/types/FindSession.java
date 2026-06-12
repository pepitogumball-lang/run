package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

public class FindSession
{
    private int highlightedResultIndex;
    private int resultCount;
    private int searchResultDisplayStyle;
    
    public FindSession(final int resultCount, final int highlightedResultIndex) {
        this.searchResultDisplayStyle = 2;
        this.resultCount = resultCount;
        this.highlightedResultIndex = highlightedResultIndex;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final FindSession findSession = (FindSession)o;
        if (this.resultCount != findSession.resultCount) {
            return false;
        }
        if (this.highlightedResultIndex != findSession.highlightedResultIndex) {
            return false;
        }
        if (this.searchResultDisplayStyle != findSession.searchResultDisplayStyle) {
            b = false;
        }
        return b;
    }
    
    public int getHighlightedResultIndex() {
        return this.highlightedResultIndex;
    }
    
    public int getResultCount() {
        return this.resultCount;
    }
    
    public int getSearchResultDisplayStyle() {
        return this.searchResultDisplayStyle;
    }
    
    @Override
    public int hashCode() {
        return (this.resultCount * 31 + this.highlightedResultIndex) * 31 + this.searchResultDisplayStyle;
    }
    
    public void setHighlightedResultIndex(final int highlightedResultIndex) {
        this.highlightedResultIndex = highlightedResultIndex;
    }
    
    public void setResultCount(final int resultCount) {
        this.resultCount = resultCount;
    }
    
    public void setSearchResultDisplayStyle(final int searchResultDisplayStyle) {
        this.searchResultDisplayStyle = searchResultDisplayStyle;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"resultCount", (Object)this.resultCount);
        hashMap.put((Object)"highlightedResultIndex", (Object)this.highlightedResultIndex);
        hashMap.put((Object)"searchResultDisplayStyle", (Object)this.searchResultDisplayStyle);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FindSession{resultCount=");
        sb.append(this.resultCount);
        sb.append(", highlightedResultIndex=");
        sb.append(this.highlightedResultIndex);
        sb.append(", searchResultDisplayStyle=");
        sb.append(this.searchResultDisplayStyle);
        sb.append('}');
        return sb.toString();
    }
}
