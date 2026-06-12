package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import m0.a;

public enum ContentBlockerActionType
{
    private static final ContentBlockerActionType[] $VALUES;
    
    BLOCK("block"), 
    CSS_DISPLAY_NONE("css-display-none"), 
    MAKE_HTTPS("make-https");
    
    private final String value;
    
    private static /* synthetic */ ContentBlockerActionType[] $values() {
        return new ContentBlockerActionType[] { ContentBlockerActionType.BLOCK, ContentBlockerActionType.CSS_DISPLAY_NONE, ContentBlockerActionType.MAKE_HTTPS };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ContentBlockerActionType(final String value) {
        this.value = value;
    }
    
    public static ContentBlockerActionType fromValue(final String s) {
        for (final ContentBlockerActionType contentBlockerActionType : values()) {
            if (s.equals((Object)contentBlockerActionType.value)) {
                return contentBlockerActionType;
            }
        }
        throw new IllegalArgumentException(a.f("No enum constant: ", s));
    }
    
    public boolean equalsValue(final String s) {
        return this.value.equals((Object)s);
    }
    
    public String toString() {
        return this.value;
    }
}
