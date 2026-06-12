package F4;

import org.json.JSONException;
import org.json.JSONTokener;
import org.json.JSONObject;
import I5.d;
import org.json.JSONArray;
import java.nio.ByteBuffer;

public final class k implements q
{
    public static final k a;
    
    static {
        a = (k)new Object();
    }
    
    @Override
    public ByteBuffer a(final Object o) {
        final JSONArray put = new JSONArray().put(d.q(o));
        ByteBuffer byteBuffer;
        if (put == null) {
            byteBuffer = null;
        }
        else {
            final Object q = d.q(put);
            if (q instanceof String) {
                final w b = w.b;
                final String quote = JSONObject.quote((String)q);
                b.getClass();
                byteBuffer = w.d(quote);
            }
            else {
                final w b2 = w.b;
                final String string = q.toString();
                b2.getClass();
                byteBuffer = w.d(string);
            }
        }
        return byteBuffer;
    }
    
    @Override
    public ByteBuffer b(String s, final String s2) {
        final JSONArray put = new JSONArray().put((Object)"error").put(d.q(s)).put(JSONObject.NULL).put(d.q(s2));
        ByteBuffer byteBuffer;
        if (put == null) {
            byteBuffer = null;
        }
        else {
            final Object q = d.q(put);
            if (q instanceof String) {
                final w b = w.b;
                s = JSONObject.quote((String)q);
                b.getClass();
                byteBuffer = w.d(s);
            }
            else {
                final w b2 = w.b;
                s = q.toString();
                b2.getClass();
                byteBuffer = w.d(s);
            }
        }
        return byteBuffer;
    }
    
    @Override
    public ByteBuffer c(final String s, String s2, final Object o) {
        final JSONArray put = new JSONArray().put((Object)s).put(d.q(s2)).put(d.q(o));
        ByteBuffer byteBuffer;
        if (put == null) {
            byteBuffer = null;
        }
        else {
            final Object q = d.q(put);
            if (q instanceof String) {
                final w b = w.b;
                s2 = JSONObject.quote((String)q);
                b.getClass();
                byteBuffer = w.d(s2);
            }
            else {
                final w b2 = w.b;
                s2 = q.toString();
                b2.getClass();
                byteBuffer = w.d(s2);
            }
        }
        return byteBuffer;
    }
    
    @Override
    public m d(final ByteBuffer byteBuffer) {
        Object o = null;
        Label_0050: {
            if (byteBuffer == null) {
                final Object nextValue = null;
                break Label_0050;
            }
            try {
                w.b.getClass();
                final JSONTokener jsonTokener = new JSONTokener(w.c(byteBuffer));
                final Object nextValue = jsonTokener.nextValue();
                if (!jsonTokener.more()) {
                    try {
                        if (nextValue instanceof JSONObject) {
                            final JSONObject jsonObject = (JSONObject)nextValue;
                            final Object value = jsonObject.get("method");
                            final Object opt = jsonObject.opt("args");
                            if (opt != JSONObject.NULL) {
                                o = opt;
                            }
                            if (value instanceof String) {
                                return new m((String)value, o);
                            }
                        }
                    }
                    catch (final JSONException ex) {
                        throw new IllegalArgumentException("Invalid JSON", (Throwable)ex);
                    }
                    final StringBuilder sb = new StringBuilder("Invalid method call: ");
                    sb.append(nextValue);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new IllegalArgumentException("Invalid JSON");
            }
            catch (final JSONException ex2) {
                throw new IllegalArgumentException("Invalid JSON", (Throwable)ex2);
            }
        }
        final JSONException ex;
        throw new IllegalArgumentException("Invalid JSON", (Throwable)ex);
    }
    
    @Override
    public Object e(final ByteBuffer byteBuffer) {
        Object o = null;
        final Object o2 = null;
        Label_0053: {
            if (byteBuffer == null) {
                final Object nextValue = null;
                break Label_0053;
            }
            try {
                w.b.getClass();
                final JSONTokener jsonTokener = new JSONTokener(w.c(byteBuffer));
                final Object nextValue = jsonTokener.nextValue();
                if (!jsonTokener.more()) {
                    Label_0204: {
                        JSONArray jsonArray;
                        try {
                            if (!(nextValue instanceof JSONArray)) {
                                break Label_0204;
                            }
                            jsonArray = (JSONArray)nextValue;
                            if (jsonArray.length() == 1) {
                                Object opt = jsonArray.opt(0);
                                if (opt == JSONObject.NULL) {
                                    opt = o2;
                                }
                                return opt;
                            }
                        }
                        catch (final JSONException ex) {
                            throw new IllegalArgumentException("Invalid JSON", (Throwable)ex);
                        }
                        if (jsonArray.length() == 3) {
                            final Object value = jsonArray.get(0);
                            final Object opt2 = jsonArray.opt(1);
                            final Object null = JSONObject.NULL;
                            String s;
                            if ((s = (String)opt2) == null) {
                                s = null;
                            }
                            final Object opt3 = jsonArray.opt(2);
                            if (opt3 != null) {
                                o = opt3;
                            }
                            if (value instanceof String && (s == null || s instanceof String)) {
                                throw new i((String)value, s, o);
                            }
                        }
                    }
                    final StringBuilder sb = new StringBuilder("Invalid envelope: ");
                    sb.append(nextValue);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new IllegalArgumentException("Invalid JSON");
            }
            catch (final JSONException ex2) {
                throw new IllegalArgumentException("Invalid JSON", (Throwable)ex2);
            }
        }
        final JSONException ex;
        throw new IllegalArgumentException("Invalid JSON", (Throwable)ex);
    }
    
    @Override
    public ByteBuffer f(final m m) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("method", (Object)m.a);
            jsonObject.put("args", d.q(m.b));
            final Object q = d.q(jsonObject);
            ByteBuffer byteBuffer;
            if (q instanceof String) {
                final w b = w.b;
                final String quote = JSONObject.quote((String)q);
                b.getClass();
                byteBuffer = w.d(quote);
            }
            else {
                final w b2 = w.b;
                final String string = q.toString();
                b2.getClass();
                byteBuffer = w.d(string);
            }
            return byteBuffer;
        }
        catch (final JSONException ex) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)ex);
        }
    }
}
