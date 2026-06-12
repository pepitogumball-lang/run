package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.android.gms.internal.measurement.L;

public enum UserScriptInjectionTime
{
    private static final UserScriptInjectionTime[] $VALUES;
    
    AT_DOCUMENT_END(1), 
    AT_DOCUMENT_START(0);
    
    private final int value;
    
    private static /* synthetic */ UserScriptInjectionTime[] $values() {
        return new UserScriptInjectionTime[] { UserScriptInjectionTime.AT_DOCUMENT_START, UserScriptInjectionTime.AT_DOCUMENT_END };
    }
    
    static {
        $VALUES = $values();
    }
    
    private UserScriptInjectionTime(final int value) {
        this.value = value;
    }
    
    public static UserScriptInjectionTime fromValue(final int n) {
        for (final UserScriptInjectionTime userScriptInjectionTime : values()) {
            if (n == userScriptInjectionTime.toValue()) {
                return userScriptInjectionTime;
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
