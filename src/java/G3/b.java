package g3;

import android.content.SharedPreferences$Editor;
import k3.v;
import O2.j;
import android.content.SharedPreferences;
import X2.f;
import k3.s;

public final class b
{
    public final s a;
    
    public b(final s a) {
        this.a = a;
    }
    
    public static b a() {
        final b b = (b)f.e().c((Class)b.class);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }
    
    public final void b(final Boolean h) {
        final v b = this.a.b;
        synchronized (b) {
            b.b = false;
            b.h = h;
            final SharedPreferences$Editor edit = ((SharedPreferences)b.c).edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", (boolean)h);
            edit.apply();
            final Object e;
            monitorenter(e = b.e);
            Label_0127: {
                try {
                    if (!b.f()) {
                        break Label_0127;
                    }
                    if (!b.a) {
                        ((j)b.f).d((Object)null);
                        b.a = true;
                    }
                    break Label_0127;
                }
                finally {
                    monitorexit(e);
                    while (true) {
                        b.f = new j();
                        b.a = false;
                        break Label_0127;
                        iftrue(Label_0127:)(!b.a);
                        continue;
                    }
                    monitorexit(e);
                }
            }
        }
    }
}
