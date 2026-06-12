package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import x.a;
import java.util.Map;

public class ContentBlockerAction
{
    static final boolean $assertionsDisabled = false;
    private String selector;
    private ContentBlockerActionType type;
    
    public ContentBlockerAction(final ContentBlockerActionType type, final String selector) {
        (this.type = type).equals(ContentBlockerActionType.CSS_DISPLAY_NONE);
        this.selector = selector;
    }
    
    public static ContentBlockerAction fromMap(final Map<String, Object> map) {
        return new ContentBlockerAction(ContentBlockerActionType.fromValue((String)map.get((Object)"type")), (String)map.get((Object)"selector"));
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
        final ContentBlockerAction contentBlockerAction = (ContentBlockerAction)o;
        if (this.type != contentBlockerAction.type) {
            return false;
        }
        final String selector = this.selector;
        final String selector2 = contentBlockerAction.selector;
        if (selector != null) {
            equals = selector.equals((Object)selector2);
        }
        else if (selector2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public String getSelector() {
        return this.selector;
    }
    
    public ContentBlockerActionType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.type.hashCode();
        final String selector = this.selector;
        int hashCode2;
        if (selector != null) {
            hashCode2 = selector.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    public void setSelector(final String selector) {
        this.selector = selector;
    }
    
    public void setType(final ContentBlockerActionType type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContentBlockerAction{type=");
        sb.append((Object)this.type);
        sb.append(", selector='");
        return a.b(sb, this.selector, "'}");
    }
}
