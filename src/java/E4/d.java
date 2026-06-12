package E4;

import m0.a;

public enum d
{
    public static final enum d D;
    public static final d[] E;
    public String C;
    
    static {
        final Enum d = new Enum("PLAIN_TEXT", 0);
        ((d)d).C = "text/plain";
        D = (d)d;
        E = new d[] { (d)d };
    }
    
    public static d a(final String s) {
        for (final d d : values()) {
            if (d.C.equals((Object)s)) {
                return d;
            }
        }
        throw new NoSuchFieldException(a.f("No such ClipboardContentFormat: ", s));
    }
}
