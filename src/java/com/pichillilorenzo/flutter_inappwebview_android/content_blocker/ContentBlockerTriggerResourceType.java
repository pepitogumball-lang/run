package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import m0.a;

public enum ContentBlockerTriggerResourceType
{
    private static final ContentBlockerTriggerResourceType[] $VALUES;
    
    DOCUMENT("document"), 
    FONT("font"), 
    IMAGE("image"), 
    MEDIA("media"), 
    POPUP("popup"), 
    RAW("raw"), 
    SCRIPT("script"), 
    STYLE_SHEET("style-sheet"), 
    SVG_DOCUMENT("svg-document");
    
    private final String value;
    
    private static /* synthetic */ ContentBlockerTriggerResourceType[] $values() {
        return new ContentBlockerTriggerResourceType[] { ContentBlockerTriggerResourceType.DOCUMENT, ContentBlockerTriggerResourceType.IMAGE, ContentBlockerTriggerResourceType.STYLE_SHEET, ContentBlockerTriggerResourceType.SCRIPT, ContentBlockerTriggerResourceType.FONT, ContentBlockerTriggerResourceType.SVG_DOCUMENT, ContentBlockerTriggerResourceType.MEDIA, ContentBlockerTriggerResourceType.POPUP, ContentBlockerTriggerResourceType.RAW };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ContentBlockerTriggerResourceType(final String value) {
        this.value = value;
    }
    
    public static ContentBlockerTriggerResourceType fromValue(final String s) {
        for (final ContentBlockerTriggerResourceType contentBlockerTriggerResourceType : values()) {
            if (s.equals((Object)contentBlockerTriggerResourceType.value)) {
                return contentBlockerTriggerResourceType;
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
