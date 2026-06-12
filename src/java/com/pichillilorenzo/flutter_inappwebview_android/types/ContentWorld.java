package com.pichillilorenzo.flutter_inappwebview_android.types;

import x.a;
import java.util.Map;

public class ContentWorld
{
    static final boolean $assertionsDisabled = false;
    public static final ContentWorld DEFAULT_CLIENT;
    public static final ContentWorld PAGE;
    private String name;
    
    static {
        PAGE = new ContentWorld("page");
        DEFAULT_CLIENT = new ContentWorld("defaultClient");
    }
    
    private ContentWorld(final String name) {
        this.name = name;
    }
    
    public static ContentWorld fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ContentWorld((String)map.get((Object)"name"));
    }
    
    public static ContentWorld world(final String s) {
        return new ContentWorld(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.name.equals((Object)((ContentWorld)o).name));
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return a.b(new StringBuilder("ContentWorld{name='"), this.name, "'}");
    }
}
