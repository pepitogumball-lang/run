package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;

public class AndroidResource
{
    private String defPackage;
    private String defType;
    private String name;
    
    public AndroidResource(final String name, final String defType, final String defPackage) {
        this.name = name;
        this.defType = defType;
        this.defPackage = defPackage;
    }
    
    public static AndroidResource fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new AndroidResource((String)map.get((Object)"name"), (String)map.get((Object)"defType"), (String)map.get((Object)"defPackage"));
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
        final AndroidResource androidResource = (AndroidResource)o;
        if (!this.name.equals((Object)androidResource.name)) {
            return false;
        }
        final String defType = this.defType;
        Label_0080: {
            if (defType != null) {
                if (defType.equals((Object)androidResource.defType)) {
                    break Label_0080;
                }
            }
            else if (androidResource.defType == null) {
                break Label_0080;
            }
            return false;
        }
        final String defPackage = this.defPackage;
        final String defPackage2 = androidResource.defPackage;
        if (defPackage != null) {
            equals = defPackage.equals((Object)defPackage2);
        }
        else if (defPackage2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public String getDefPackage() {
        return this.defPackage;
    }
    
    public String getDefType() {
        return this.defType;
    }
    
    public int getIdentifier(final Context context) {
        return context.getResources().getIdentifier(this.name, this.defType, this.defPackage);
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.name.hashCode();
        final String defType = this.defType;
        int hashCode2 = 0;
        int hashCode3;
        if (defType != null) {
            hashCode3 = defType.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String defPackage = this.defPackage;
        if (defPackage != null) {
            hashCode2 = defPackage.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    public void setDefPackage(final String defPackage) {
        this.defPackage = defPackage;
    }
    
    public void setDefType(final String defType) {
        this.defType = defType;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"name", (Object)this.name);
        hashMap.put((Object)"defType", (Object)this.defType);
        hashMap.put((Object)"defPackage", (Object)this.defPackage);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AndroidResource{name='");
        sb.append(this.name);
        sb.append("', type='");
        sb.append(this.defType);
        sb.append("', defPackage='");
        return a.b(sb, this.defPackage, "'}");
    }
}
