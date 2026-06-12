package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Proxy;
import G0.A;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import android.webkit.WebResourceError;
import G0.z;
import G0.v;
import F0.d;
import F0.p;

public class WebResourceErrorExt
{
    private String description;
    private int type;
    
    public WebResourceErrorExt(final int type, final String description) {
        this.type = type;
        this.description = description;
    }
    
    public static WebResourceErrorExt fromWebResourceError(final p p) {
        int errorCode;
        if (d.a("WEB_RESOURCE_ERROR_GET_CODE")) {
            final v v = (v)p;
            v.getClass();
            z.o.getClass();
            if (v.a == null) {
                v.a = (WebResourceError)((WebkitToCompatConverterBoundaryInterface)A.a.D).convertWebResourceError(Proxy.getInvocationHandler((Object)v.b));
            }
            errorCode = v.a.getErrorCode();
        }
        else {
            errorCode = -1;
        }
        String string;
        if (d.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
            final v v2 = (v)p;
            v2.getClass();
            z.n.getClass();
            if (v2.a == null) {
                v2.a = (WebResourceError)((WebkitToCompatConverterBoundaryInterface)A.a.D).convertWebResourceError(Proxy.getInvocationHandler((Object)v2.b));
            }
            string = v2.a.getDescription().toString();
        }
        else {
            string = "";
        }
        return new WebResourceErrorExt(errorCode, string);
    }
    
    public static WebResourceErrorExt fromWebResourceError(final WebResourceError webResourceError) {
        return new WebResourceErrorExt(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final WebResourceErrorExt webResourceErrorExt = (WebResourceErrorExt)o;
            return this.type == webResourceErrorExt.type && this.description.equals((Object)webResourceErrorExt.description);
        }
        return false;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return this.description.hashCode() + this.type * 31;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setType(final int type) {
        this.type = type;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"type", (Object)this.getType());
        hashMap.put((Object)"description", (Object)this.getDescription());
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WebResourceErrorExt{type=");
        sb.append(this.type);
        sb.append(", description='");
        return a.b(sb, this.description, "'}");
    }
}
