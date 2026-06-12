package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

public class Size2D
{
    static final boolean $assertionsDisabled = false;
    private double height;
    private double width;
    
    public Size2D(final double width, final double height) {
        this.width = width;
        this.height = height;
    }
    
    public static Size2D fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new Size2D((double)map.get((Object)"width"), (double)map.get((Object)"height"));
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
        final Size2D size2D = (Size2D)o;
        if (Double.compare(size2D.width, this.width) != 0) {
            return false;
        }
        if (Double.compare(size2D.height, this.height) != 0) {
            b = false;
        }
        return b;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.width);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.height);
        return n * 31 + (int)(doubleToLongBits2 >>> 32 ^ doubleToLongBits2);
    }
    
    public void setHeight(final double height) {
        this.height = height;
    }
    
    public void setWidth(final double width) {
        this.width = width;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"width", (Object)this.width);
        hashMap.put((Object)"height", (Object)this.height);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Size{width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append('}');
        return sb.toString();
    }
}
