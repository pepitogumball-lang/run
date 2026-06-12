package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import com.google.android.gms.internal.measurement.L;
import android.print.PrintAttributes$Resolution;
import java.util.Map;

public class ResolutionExt
{
    private int horizontalDpi;
    private String id;
    private String label;
    private int verticalDpi;
    
    public ResolutionExt(final String id, final String label, final int verticalDpi, final int horizontalDpi) {
        this.id = id;
        this.label = label;
        this.verticalDpi = verticalDpi;
        this.horizontalDpi = horizontalDpi;
    }
    
    public static ResolutionExt fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ResolutionExt((String)map.get((Object)"id"), (String)map.get((Object)"label"), (int)map.get((Object)"verticalDpi"), (int)map.get((Object)"horizontalDpi"));
    }
    
    public static ResolutionExt fromResolution(final PrintAttributes$Resolution printAttributes$Resolution) {
        if (printAttributes$Resolution == null) {
            return null;
        }
        return new ResolutionExt(printAttributes$Resolution.getId(), printAttributes$Resolution.getLabel(), printAttributes$Resolution.getVerticalDpi(), printAttributes$Resolution.getHorizontalDpi());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ResolutionExt resolutionExt = (ResolutionExt)o;
            return this.verticalDpi == resolutionExt.verticalDpi && this.horizontalDpi == resolutionExt.horizontalDpi && this.id.equals((Object)resolutionExt.id) && this.label.equals((Object)resolutionExt.label);
        }
        return false;
    }
    
    public int getHorizontalDpi() {
        return this.horizontalDpi;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public int getVerticalDpi() {
        return this.verticalDpi;
    }
    
    @Override
    public int hashCode() {
        return (L.g(this.id.hashCode() * 31, this.label, 31) + this.verticalDpi) * 31 + this.horizontalDpi;
    }
    
    public void setHorizontalDpi(final int horizontalDpi) {
        this.horizontalDpi = horizontalDpi;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setLabel(final String label) {
        this.label = label;
    }
    
    public void setVerticalDpi(final int verticalDpi) {
        this.verticalDpi = verticalDpi;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)this.id);
        hashMap.put((Object)"label", (Object)this.label);
        hashMap.put((Object)"verticalDpi", (Object)this.verticalDpi);
        hashMap.put((Object)"horizontalDpi", (Object)this.horizontalDpi);
        return (Map<String, Object>)hashMap;
    }
    
    public PrintAttributes$Resolution toResolution() {
        return new PrintAttributes$Resolution(this.id, this.label, this.horizontalDpi, this.verticalDpi);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResolutionExt{id='");
        sb.append(this.id);
        sb.append("', label='");
        sb.append(this.label);
        sb.append("', verticalDpi=");
        sb.append(this.verticalDpi);
        sb.append(", horizontalDpi=");
        sb.append(this.horizontalDpi);
        sb.append('}');
        return sb.toString();
    }
}
