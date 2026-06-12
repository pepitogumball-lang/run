package y1;

import org.json.JSONException;
import F1.p;
import org.json.JSONArray;
import org.json.JSONObject;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import android.os.RemoteException;
import F1.R0;
import java.util.ArrayList;
import F1.n0;

public final class q
{
    public final n0 a;
    public final ArrayList b;
    public final j c;
    
    public q(n0 a) {
        this.a = a;
        this.b = new ArrayList();
        if (a != null) {
            try {
                final List j = a.j();
                if (j != null) {
                    for (final R0 r0 : j) {
                        j i;
                        if (r0 != null) {
                            i = new j(r0);
                        }
                        else {
                            i = null;
                        }
                        if (i != null) {
                            this.b.add((Object)i);
                        }
                    }
                }
            }
            catch (final RemoteException ex) {
                J1.j.g("Could not forward getAdapterResponseInfo to ResponseInfo.", (Throwable)ex);
            }
        }
        a = this.a;
        if (a == null) {
            return;
        }
        try {
            final R0 c = a.c();
            if (c != null) {
                this.c = new j(c);
            }
        }
        catch (final RemoteException ex2) {
            J1.j.g("Could not forward getLoadedAdapterResponse to ResponseInfo.", (Throwable)ex2);
        }
    }
    
    public final Bundle a() {
        try {
            final n0 a = this.a;
            if (a != null) {
                return a.b();
            }
        }
        catch (final RemoteException ex) {
            J1.j.g("Could not forward getResponseExtras to ResponseInfo.", (Throwable)ex);
        }
        return new Bundle();
    }
    
    public final JSONObject b() {
        final n0 a = this.a;
        final JSONObject jsonObject = new JSONObject();
        final Object o = null;
        String e = null;
        Label_0041: {
            if (a != null) {
                try {
                    e = a.e();
                    break Label_0041;
                }
                catch (final RemoteException ex) {
                    J1.j.g("Could not forward getResponseId to ResponseInfo.", (Throwable)ex);
                }
            }
            e = null;
        }
        if (e == null) {
            jsonObject.put("Response ID", (Object)"null");
        }
        else {
            jsonObject.put("Response ID", (Object)e);
        }
        Object f = o;
        if (a != null) {
            try {
                f = a.f();
            }
            catch (final RemoteException ex2) {
                J1.j.g("Could not forward getMediationAdapterClassName to ResponseInfo.", (Throwable)ex2);
                f = o;
            }
        }
        if (f == null) {
            jsonObject.put("Mediation Adapter Class Name", (Object)"null");
        }
        else {
            jsonObject.put("Mediation Adapter Class Name", f);
        }
        final JSONArray jsonArray = new JSONArray();
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            jsonArray.put((Object)((j)iterator.next()).a());
        }
        jsonObject.put("Adapter Responses", (Object)jsonArray);
        final j c = this.c;
        if (c != null) {
            jsonObject.put("Loaded Adapter Response", (Object)c.a());
        }
        final Bundle a2 = this.a();
        if (a2 != null) {
            jsonObject.put("Response Extras", (Object)p.f.a.i(a2));
        }
        return jsonObject;
    }
    
    @Override
    public final String toString() {
        String string;
        try {
            string = this.b().toString(2);
        }
        catch (final JSONException ex) {
            string = "Error forming toString output.";
        }
        return string;
    }
}
