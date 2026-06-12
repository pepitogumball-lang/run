package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class SafeBrowsingResponse
{
    private Integer action;
    private boolean report;
    
    public SafeBrowsingResponse(final boolean report, final Integer action) {
        this.report = report;
        this.action = action;
    }
    
    public static SafeBrowsingResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new SafeBrowsingResponse((boolean)map.get((Object)"report"), (Integer)map.get((Object)"action"));
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final SafeBrowsingResponse safeBrowsingResponse = (SafeBrowsingResponse)o;
        if (this.report != safeBrowsingResponse.report) {
            return false;
        }
        final Integer action = this.action;
        final Integer action2 = safeBrowsingResponse.action;
        if (action != null) {
            equals = action.equals((Object)action2);
        }
        else if (action2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public Integer getAction() {
        return this.action;
    }
    
    @Override
    public int hashCode() {
        final int report = this.report ? 1 : 0;
        final Integer action = this.action;
        int hashCode;
        if (action != null) {
            hashCode = action.hashCode();
        }
        else {
            hashCode = 0;
        }
        return report * 31 + hashCode;
    }
    
    public boolean isReport() {
        return this.report;
    }
    
    public void setAction(final Integer action) {
        this.action = action;
    }
    
    public void setReport(final boolean report) {
        this.report = report;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SafeBrowsingResponse{report=");
        sb.append(this.report);
        sb.append(", action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
