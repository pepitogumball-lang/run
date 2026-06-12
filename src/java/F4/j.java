package F4;

import org.json.JSONException;
import org.json.JSONTokener;
import org.json.JSONObject;
import I5.d;
import java.nio.ByteBuffer;

public final class j implements l
{
    public static final j a;
    
    static {
        a = (j)new Object();
    }
    
    @Override
    public final ByteBuffer a(final Object o) {
        if (o == null) {
            return null;
        }
        final Object q = d.q(o);
        if (q instanceof String) {
            final w b = w.b;
            final String quote = JSONObject.quote((String)q);
            b.getClass();
            return w.d(quote);
        }
        final w b2 = w.b;
        final String string = q.toString();
        b2.getClass();
        return w.d(string);
    }
    
    @Override
    public final Object b(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            w.b.getClass();
            final JSONTokener jsonTokener = new JSONTokener(w.c(byteBuffer));
            final Object nextValue = jsonTokener.nextValue();
            if (!jsonTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        }
        catch (final JSONException ex) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)ex);
        }
    }
}
