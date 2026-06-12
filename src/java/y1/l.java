package y1;

import org.json.JSONException;
import org.json.JSONObject;
import d2.m;

public final class l extends m
{
    public final q i;
    
    public l(final int n, final String s, final String s2, final m m, final q i) {
        super(n, s, s2, m);
        this.i = i;
    }
    
    public final JSONObject f() {
        final JSONObject f = super.f();
        final q i = this.i;
        if (i == null) {
            f.put("Response Info", (Object)"null");
        }
        else {
            f.put("Response Info", (Object)i.b());
        }
        return f;
    }
    
    public final String toString() {
        String string;
        try {
            string = this.f().toString(2);
        }
        catch (final JSONException ex) {
            string = "Error forming toString output.";
        }
        return string;
    }
}
