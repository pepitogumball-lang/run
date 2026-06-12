package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.android.gms.internal.measurement.L;

public enum PreferredContentModeOptionType
{
    private static final PreferredContentModeOptionType[] $VALUES;
    
    DESKTOP(2), 
    MOBILE(1), 
    RECOMMENDED(0);
    
    private final int value;
    
    private static /* synthetic */ PreferredContentModeOptionType[] $values() {
        return new PreferredContentModeOptionType[] { PreferredContentModeOptionType.RECOMMENDED, PreferredContentModeOptionType.MOBILE, PreferredContentModeOptionType.DESKTOP };
    }
    
    static {
        $VALUES = $values();
    }
    
    private PreferredContentModeOptionType(final int value) {
        this.value = value;
    }
    
    public static PreferredContentModeOptionType fromValue(final int n) {
        for (final PreferredContentModeOptionType preferredContentModeOptionType : values()) {
            if (n == preferredContentModeOptionType.toValue()) {
                return preferredContentModeOptionType;
            }
        }
        throw new IllegalArgumentException(L.h(n, "No enum constant: "));
    }
    
    public boolean equalsValue(final int n) {
        return this.value == n;
    }
    
    public int toValue() {
        return this.value;
    }
}
