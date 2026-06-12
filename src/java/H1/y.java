package h1;

import x.a;
import java.util.Objects;
import org.json.JSONObject;

public final class y
{
    public final String a = jsonObject.optString("productId");
    public final String b = jsonObject.optString("productType");
    public final String c;
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return this.a.equals((Object)y.a) && this.b.equals((Object)y.b) && Objects.equals((Object)this.c, (Object)y.c);
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
