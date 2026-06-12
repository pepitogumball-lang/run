package P3;

import a.a;

public final class c extends a
{
    public static c f;
    
    public static c F() {
        final Class<c> clazz;
        monitorenter(clazz = c.class);
        Label_0030: {
            try {
                if (c.f == null) {
                    c.f = (c)new Object();
                }
                break Label_0030;
            }
            finally {
                monitorexit(clazz);
                final c f = c.f;
                monitorexit(clazz);
                return f;
            }
        }
    }
    
    @Override
    public final String i() {
        return "isEnabled";
    }
    
    @Override
    public final String k() {
        return "firebase_performance_collection_enabled";
    }
}
