package c4;

import java.util.Map;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Date;

public final class e
{
    public static final Date h;
    public final JSONObject a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;
    public final JSONArray g;
    
    static {
        h = new Date(0L);
    }
    
    public e(final JSONObject b, final Date c, final JSONArray d, final JSONObject e, final long f, final JSONArray g) {
        final JSONObject a = new JSONObject();
        a.put("configs_key", (Object)b);
        a.put("fetch_time_key", c.getTime());
        a.put("abt_experiments_key", (Object)d);
        a.put("personalization_metadata_key", (Object)e);
        a.put("template_version_number_key", f);
        a.put("rollout_metadata_key", (Object)g);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = a;
    }
    
    public static e a(final JSONObject jsonObject) {
        JSONObject optJSONObject;
        if ((optJSONObject = jsonObject.optJSONObject("personalization_metadata_key")) == null) {
            optJSONObject = new JSONObject();
        }
        JSONArray optJSONArray;
        if ((optJSONArray = jsonObject.optJSONArray("rollout_metadata_key")) == null) {
            optJSONArray = new JSONArray();
        }
        return new e(jsonObject.getJSONObject("configs_key"), new Date(jsonObject.getLong("fetch_time_key")), jsonObject.getJSONArray("abt_experiments_key"), optJSONObject, jsonObject.optLong("template_version_number_key"), optJSONArray);
    }
    
    public static d c() {
        final Object o = new Object();
        ((d)o).b = new JSONObject();
        ((d)o).d = e.h;
        ((d)o).e = new JSONArray();
        ((d)o).c = new JSONObject();
        ((d)o).a = 0L;
        ((d)o).f = new JSONArray();
        return (d)o;
    }
    
    public final HashMap b() {
        final HashMap hashMap = new HashMap();
        int n = 0;
        while (true) {
            final JSONArray g = this.g;
            if (n >= g.length()) {
                break;
            }
            final JSONObject jsonObject = g.getJSONObject(n);
            final String string = jsonObject.getString("rolloutId");
            final String string2 = jsonObject.getString("variantId");
            final JSONArray jsonArray = jsonObject.getJSONArray("affectedParameterKeys");
            for (int i = 0; i < jsonArray.length(); ++i) {
                final String string3 = jsonArray.getString(i);
                if (!hashMap.containsKey((Object)string3)) {
                    hashMap.put((Object)string3, (Object)new HashMap());
                }
                final Map map = (Map)hashMap.get((Object)string3);
                if (map != null) {
                    map.put((Object)string, (Object)string2);
                }
            }
            ++n;
        }
        return hashMap;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e && this.a.toString().equals((Object)((e)o).a.toString()));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
