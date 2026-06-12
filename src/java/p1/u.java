package P1;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map$Entry;
import java.util.HashMap;
import android.content.Context;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

public final class u
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;
    public final Context c;
    public final Object d;
    
    public u(final Context c) {
        this.d = new Object();
        this.c = c;
    }
    
    public final String a(final String s) {
        this.e();
        final Object d = this.d;
        synchronized (d) {
            final String string = this.a.getString(s, (String)null);
            this.b.remove(s).commit();
            return string;
        }
    }
    
    public final HashMap b() {
        this.e();
        final Object d;
        monitorenter(d = this.d);
        Label_0169: {
            try {
                final Map all = this.a.getAll();
                final HashMap hashMap = new HashMap();
                for (final Map$Entry map$Entry : all.entrySet()) {
                    if (map$Entry.getValue() instanceof String && !Objects.equals(map$Entry.getKey(), (Object)"pn") && !Objects.equals(map$Entry.getKey(), (Object)"vc") && !Objects.equals(map$Entry.getKey(), (Object)"dm") && !Objects.equals(map$Entry.getKey(), (Object)"aav")) {
                        hashMap.put((Object)map$Entry.getKey(), (Object)map$Entry.getValue());
                    }
                }
                break Label_0169;
            }
            finally {
                monitorexit(d);
                monitorexit(d);
                return;
            }
        }
    }
    
    public final void c() {
        this.e();
        final Object d = this.d;
        synchronized (d) {
            this.b.clear().commit();
        }
    }
    
    public final void d(final String s, final String s2, final int n, final int n2) {
        this.e();
        final Object d = this.d;
        synchronized (d) {
            this.b.putString("pn", s).putInt("vc", n).putString("dm", s2).putInt("aav", n2).commit();
        }
    }
    
    public final void e() {
        final Object d;
        monitorenter(d = this.d);
        Label_0023: {
            try {
                if (this.a != null) {
                    monitorexit(d);
                    return;
                }
                break Label_0023;
            }
            finally {
                monitorexit(d);
                final SharedPreferences sharedPreferences = this.c.getSharedPreferences("query_info_shared_prefs", 0);
                this.a = sharedPreferences;
                this.b = sharedPreferences.edit();
                monitorexit(d);
            }
        }
    }
}
