package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import java.util.Map;
import android.webkit.WebView$HitTestResult;

public class HitTestResult
{
    private String extra;
    private int type;
    
    public HitTestResult(final int type, final String extra) {
        this.type = type;
        this.extra = extra;
    }
    
    public static HitTestResult fromWebViewHitTestResult(final WebView$HitTestResult webView$HitTestResult) {
        if (webView$HitTestResult == null) {
            return null;
        }
        return new HitTestResult(webView$HitTestResult.getType(), webView$HitTestResult.getExtra());
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
        final HitTestResult hitTestResult = (HitTestResult)o;
        if (this.type != hitTestResult.type) {
            return false;
        }
        final String extra = this.extra;
        final String extra2 = hitTestResult.extra;
        if (extra != null) {
            equals = extra.equals((Object)extra2);
        }
        else if (extra2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public String getExtra() {
        return this.extra;
    }
    
    public int getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int type = this.type;
        final String extra = this.extra;
        int hashCode;
        if (extra != null) {
            hashCode = extra.hashCode();
        }
        else {
            hashCode = 0;
        }
        return type * 31 + hashCode;
    }
    
    public void setExtra(final String extra) {
        this.extra = extra;
    }
    
    public void setType(final int type) {
        this.type = type;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"type", (Object)this.type);
        hashMap.put((Object)"extra", (Object)this.extra);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HitTestResultMap{type=");
        sb.append(this.type);
        sb.append(", extra='");
        return a.b(sb, this.extra, "'}");
    }
}
