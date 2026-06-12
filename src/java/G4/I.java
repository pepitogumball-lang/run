package g4;

import z3.e;

public enum i implements e
{
    D("COLLECTION_SDK_NOT_INSTALLED", 1, 1), 
    E("COLLECTION_ENABLED", 2, 2), 
    F("COLLECTION_DISABLED", 3, 3);
    
    public static final i[] G;
    public final int C;
    
    public i(final String s, final int n, final int c) {
        this.C = c;
    }
    
    public final int a() {
        return this.C;
    }
}
