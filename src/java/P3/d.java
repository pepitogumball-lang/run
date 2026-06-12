package P3;

import a.a;

public final class d extends a
{
    public static d f;
    
    public static d F() {
        final Class<d> clazz;
        monitorenter(clazz = d.class);
        Label_0030: {
            try {
                if (d.f == null) {
                    d.f = (d)new Object();
                }
                break Label_0030;
            }
            finally {
                monitorexit(clazz);
                final d f = d.f;
                monitorexit(clazz);
                return f;
            }
        }
    }
    
    @Override
    public final String i() {
        return "com.google.firebase.perf.ExperimentTTID";
    }
    
    @Override
    public final String k() {
        return "experiment_app_start_ttid";
    }
}
