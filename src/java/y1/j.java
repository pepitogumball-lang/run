package y1;

import android.os.BaseBundle;
import org.json.JSONException;
import java.util.Iterator;
import org.json.JSONObject;
import F1.p0;
import d2.m;
import F1.R0;

public final class j
{
    public final R0 a;
    public final m b;
    
    public j(final R0 a) {
        this.a = a;
        final p0 e = a.E;
        m h;
        if (e == null) {
            h = null;
        }
        else {
            h = e.h();
        }
        this.b = h;
    }
    
    public final JSONObject a() {
        final JSONObject jsonObject = new JSONObject();
        final R0 a = this.a;
        jsonObject.put("Adapter", (Object)a.C);
        jsonObject.put("Latency", a.D);
        final String g = a.G;
        if (g == null) {
            jsonObject.put("Ad Source Name", (Object)"null");
        }
        else {
            jsonObject.put("Ad Source Name", (Object)g);
        }
        final String h = a.H;
        if (h == null) {
            jsonObject.put("Ad Source ID", (Object)"null");
        }
        else {
            jsonObject.put("Ad Source ID", (Object)h);
        }
        final String i = a.I;
        if (i == null) {
            jsonObject.put("Ad Source Instance Name", (Object)"null");
        }
        else {
            jsonObject.put("Ad Source Instance Name", (Object)i);
        }
        final String j = a.J;
        if (j == null) {
            jsonObject.put("Ad Source Instance ID", (Object)"null");
        }
        else {
            jsonObject.put("Ad Source Instance ID", (Object)j);
        }
        final JSONObject jsonObject2 = new JSONObject();
        for (final String s : ((BaseBundle)a.F).keySet()) {
            jsonObject2.put(s, ((BaseBundle)a.F).get(s));
        }
        jsonObject.put("Credentials", (Object)jsonObject2);
        final m b = this.b;
        if (b == null) {
            jsonObject.put("Ad Error", (Object)"null");
        }
        else {
            jsonObject.put("Ad Error", (Object)b.f());
        }
        return jsonObject;
    }
    
    @Override
    public final String toString() {
        String string;
        try {
            string = this.a().toString(2);
        }
        catch (final JSONException ex) {
            string = "Error forming toString output.";
        }
        return string;
    }
}
