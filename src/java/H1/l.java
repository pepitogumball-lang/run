package h1;

import x.a;
import java.util.Objects;
import org.json.JSONObject;

public final class l
{
    public final String a;
    public final String b;
    public final String c;
    
    public l(final JSONObject jsonObject) {
        this.a = jsonObject.optString("productId");
        this.b = jsonObject.optString("productType");
        String optString;
        if ((optString = jsonObject.optString("offerToken")).isEmpty()) {
            optString = null;
        }
        this.c = optString;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return this.a.equals((Object)l.a) && this.b.equals((Object)l.b) && Objects.equals((Object)this.c, (Object)l.c);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.a);
        sb.append(", type: ");
        sb.append(this.b);
        sb.append(", offer token: ");
        return x.a.b(sb, this.c, "}");
    }
}
