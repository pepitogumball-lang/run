package k3;

import java.util.HashMap;

public enum f
{
    C("UNKNOWN", 7);
    
    public static final HashMap D;
    public static final f[] E;
    
    static {
        final Enum enum1 = new Enum("X86_32", 0);
        final Enum enum2 = new Enum("X86_64", 1);
        final Enum enum3 = new Enum("ARM_UNKNOWN", 2);
        final Enum enum4 = new Enum("PPC", 3);
        final Enum enum5 = new Enum("PPC64", 4);
        final Enum enum6 = new Enum("ARMV6", 5);
        final Enum enum7 = new Enum("ARMV7", 6);
        final Enum enum8 = new Enum("ARMV7S", 8);
        final Enum enum9 = new Enum("ARM64", 9);
        final f f;
        E = new f[] { (f)enum1, (f)enum2, (f)enum3, (f)enum4, (f)enum5, (f)enum6, (f)enum7, f, (f)enum8, (f)enum9 };
        final HashMap d = new HashMap(4);
        (D = d).put((Object)"armeabi-v7a", (Object)enum7);
        d.put((Object)"armeabi", (Object)enum6);
        d.put((Object)"arm64-v8a", (Object)enum9);
        d.put((Object)"x86", (Object)enum1);
    }
}
