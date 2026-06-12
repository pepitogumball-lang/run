package P1;

import android.content.pm.PackageInfo;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Base64;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import E1.o;
import org.json.JSONException;
import s2.b;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import J1.a;
import java.util.ArrayList;
import android.content.pm.ApplicationInfo;
import android.content.Context;

public final class v
{
    public final Context a;
    public final ApplicationInfo b;
    public final ArrayList c;
    public final a d;
    public final JSONObject e;
    public final AtomicBoolean f;
    
    public v(final Context a, final ArrayList c, final a d) {
        this.e = new JSONObject();
        this.f = new AtomicBoolean(false);
        this.a = a;
        this.b = a.getApplicationInfo();
        this.c = c;
        this.d = d;
    }
    
    public final JSONObject a() {
        if (!this.f.get()) {
            this.b();
        }
        return this.e;
    }
    
    public final void b() {
        if (this.f.getAndSet(true)) {
            return;
        }
        Object o = this.b;
        Object e = null;
        int i = 0;
        Object c = e;
        while (true) {
            if (o == null) {
                break Label_0050;
            }
            try {
                c = s2.b.a(this.a).c(0, ((ApplicationInfo)o).packageName);
                e = this.e;
                Label_0091: {
                    if (c != null) {
                        Label_0276: {
                            try {
                                ((JSONObject)e).put("vc", ((PackageInfo)c).versionCode);
                                ((JSONObject)e).put("vnm", (Object)((PackageInfo)c).versionName);
                            }
                            catch (final JSONException ex) {
                                break Label_0276;
                            }
                            break Label_0091;
                        }
                        final JSONException ex;
                        E1.o.B.g.h("PawAppSignalGenerator.initialize", (Throwable)ex);
                        return;
                    }
                }
                if (o != null) {
                    ((JSONObject)e).put("pn", (Object)((ApplicationInfo)o).packageName);
                }
                o = this.c;
                final ArrayList list = new ArrayList();
                for (String[] split = ((String)q.d.c.a(D7.z9)).split(",", -1); i < split.length; ++i) {
                    final String s = split[i];
                    if (((ArrayList)o).contains((Object)s)) {
                        list.add((Object)s);
                    }
                }
                ((JSONObject)e).put("eid", (Object)list);
                ((JSONObject)e).put("js", (Object)this.d.C);
                final Iterator keys = ((JSONObject)e).keys();
                while (keys.hasNext()) {
                    final String s2 = (String)keys.next();
                    o = ((JSONObject)e).get(s2);
                    if (o != null) {
                        ((JSONObject)e).put(s2, (Object)Base64.encodeToString(o.toString().getBytes(), 2));
                    }
                }
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                c = e;
                continue;
            }
            break;
        }
    }
}
