package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.android.gms.internal.measurement.L;

public enum NavigationActionPolicy
{
    private static final NavigationActionPolicy[] $VALUES;
    
    ALLOW(1), 
    CANCEL(0);
    
    private final int value;
    
    private static /* synthetic */ NavigationActionPolicy[] $values() {
        return new NavigationActionPolicy[] { NavigationActionPolicy.CANCEL, NavigationActionPolicy.ALLOW };
    }
    
    static {
        $VALUES = $values();
    }
    
    private NavigationActionPolicy(final int value) {
        this.value = value;
    }
    
    public static NavigationActionPolicy fromValue(final int n) {
        for (final NavigationActionPolicy navigationActionPolicy : values()) {
            if (n == navigationActionPolicy.value) {
                return navigationActionPolicy;
            }
        }
        throw new IllegalArgumentException(L.h(n, "No enum constant: "));
    }
    
    public boolean equalsValue(final int n) {
        return this.value == n;
    }
    
    public int rawValue() {
        return this.value;
    }
    
    public String toString() {
        return String.valueOf(this.value);
    }
}
