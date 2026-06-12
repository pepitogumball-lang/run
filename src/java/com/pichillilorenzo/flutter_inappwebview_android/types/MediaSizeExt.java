package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import android.print.PrintAttributes$MediaSize;
import java.util.Map;

public class MediaSizeExt
{
    private int heightMils;
    private String id;
    private String label;
    private int widthMils;
    
    public MediaSizeExt(final String id, final String label, final int widthMils, final int heightMils) {
        this.id = id;
        this.label = label;
        this.widthMils = widthMils;
        this.heightMils = heightMils;
    }
    
    public static MediaSizeExt fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MediaSizeExt((String)map.get((Object)"id"), (String)map.get((Object)"label"), (int)map.get((Object)"widthMils"), (int)map.get((Object)"heightMils"));
    }
    
    public static MediaSizeExt fromMediaSize(final PrintAttributes$MediaSize printAttributes$MediaSize) {
        if (printAttributes$MediaSize == null) {
            return null;
        }
        return new MediaSizeExt(printAttributes$MediaSize.getId(), null, printAttributes$MediaSize.getHeightMils(), printAttributes$MediaSize.getWidthMils());
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
        final MediaSizeExt mediaSizeExt = (MediaSizeExt)o;
        if (this.widthMils != mediaSizeExt.widthMils) {
            return false;
        }
        if (this.heightMils != mediaSizeExt.heightMils) {
            return false;
        }
        if (!this.id.equals((Object)mediaSizeExt.id)) {
            return false;
        }
        final String label = this.label;
        final String label2 = mediaSizeExt.label;
        if (label != null) {
            equals = label.equals((Object)label2);
        }
        else if (label2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public int getHeightMils() {
        return this.heightMils;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public int getWidthMils() {
        return this.widthMils;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String label = this.label;
        int hashCode2;
        if (label != null) {
            hashCode2 = label.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return ((hashCode * 31 + hashCode2) * 31 + this.widthMils) * 31 + this.heightMils;
    }
    
    public void setHeightMils(final int heightMils) {
        this.heightMils = heightMils;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setLabel(final String label) {
        this.label = label;
    }
    
    public void setWidthMils(final int widthMils) {
        this.widthMils = widthMils;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)this.id);
        hashMap.put((Object)"label", (Object)this.label);
        hashMap.put((Object)"heightMils", (Object)this.heightMils);
        hashMap.put((Object)"widthMils", (Object)this.widthMils);
        return (Map<String, Object>)hashMap;
    }
    
    public PrintAttributes$MediaSize toMediaSize() {
        return new PrintAttributes$MediaSize(this.id, "Custom", this.widthMils, this.heightMils);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MediaSizeExt{id='");
        sb.append(this.id);
        sb.append("', label='");
        sb.append(this.label);
        sb.append("', widthMils=");
        sb.append(this.widthMils);
        sb.append(", heightMils=");
        sb.append(this.heightMils);
        sb.append('}');
        return sb.toString();
    }
}
