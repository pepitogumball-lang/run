package F4;

import org.json.JSONObject;
import java.util.Map;

public final class m
{
    public final String a;
    public final Object b;
    
    public m(final String a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final String s) {
        final Object b = this.b;
        if (b == null) {
            return null;
        }
        if (b instanceof Map) {
            return ((Map)b).get((Object)s);
        }
        if (b instanceof JSONObject) {
            return ((JSONObject)b).opt(s);
        }
        throw new ClassCastException();
    }
}
