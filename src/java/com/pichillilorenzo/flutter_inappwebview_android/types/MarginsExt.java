package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import android.print.PrintAttributes$Margins;
import java.util.Map;

public class MarginsExt
{
    private double bottom;
    private double left;
    private double right;
    private double top;
    
    public MarginsExt() {
    }
    
    public MarginsExt(final double top, final double right, final double bottom, final double left) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }
    
    public static MarginsExt fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MarginsExt((double)map.get((Object)"top"), (double)map.get((Object)"right"), (double)map.get((Object)"bottom"), (double)map.get((Object)"left"));
    }
    
    public static MarginsExt fromMargins(final PrintAttributes$Margins printAttributes$Margins) {
        if (printAttributes$Margins == null) {
            return null;
        }
        final MarginsExt marginsExt = new MarginsExt();
        marginsExt.top = milsToPixels(printAttributes$Margins.getTopMils());
        marginsExt.right = milsToPixels(printAttributes$Margins.getRightMils());
        marginsExt.bottom = milsToPixels(printAttributes$Margins.getBottomMils());
        marginsExt.left = milsToPixels(printAttributes$Margins.getLeftMils());
        return marginsExt;
    }
    
    private static double milsToPixels(final int n) {
        return n * 0.09600001209449;
    }
    
    private static int pixelsToMils(final double n) {
        return (int)Math.round(n * 10.416665354331);
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
        final MarginsExt marginsExt = (MarginsExt)o;
        if (Double.compare(marginsExt.top, this.top) != 0) {
            return false;
        }
        if (Double.compare(marginsExt.right, this.right) != 0) {
            return false;
        }
        if (Double.compare(marginsExt.bottom, this.bottom) != 0) {
            return false;
        }
        if (Double.compare(marginsExt.left, this.left) != 0) {
            b = false;
        }
        return b;
    }
    
    public double getBottom() {
        return this.bottom;
    }
    
    public double getLeft() {
        return this.left;
    }
    
    public double getRight() {
        return this.right;
    }
    
    public double getTop() {
        return this.top;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.top);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.right);
        final int n2 = (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.bottom);
        final int n3 = (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32);
        final long doubleToLongBits4 = Double.doubleToLongBits(this.left);
        return ((n * 31 + n2) * 31 + n3) * 31 + (int)(doubleToLongBits4 >>> 32 ^ doubleToLongBits4);
    }
    
    public void setBottom(final double bottom) {
        this.bottom = bottom;
    }
    
    public void setLeft(final double left) {
        this.left = left;
    }
    
    public void setRight(final double right) {
        this.right = right;
    }
    
    public void setTop(final double top) {
        this.top = top;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"top", (Object)this.top);
        hashMap.put((Object)"right", (Object)this.right);
        hashMap.put((Object)"bottom", (Object)this.bottom);
        hashMap.put((Object)"left", (Object)this.left);
        return (Map<String, Object>)hashMap;
    }
    
    public PrintAttributes$Margins toMargins() {
        return new PrintAttributes$Margins(pixelsToMils(this.left), pixelsToMils(this.top), pixelsToMils(this.right), pixelsToMils(this.bottom));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarginsExt{top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(", left=");
        sb.append(this.left);
        sb.append('}');
        return sb.toString();
    }
}
