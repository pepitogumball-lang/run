package E4;

import org.json.JSONObject;

public final class p
{
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public p(final String a, final int b, final int c, final int d, final int e) {
        if ((b != -1 || c != -1) && (b < 0 || c < 0)) {
            final StringBuilder sb = new StringBuilder("invalid selection: (");
            sb.append(String.valueOf(b));
            sb.append(", ");
            sb.append(String.valueOf(c));
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if ((d != -1 || e != -1) && (d < 0 || d > e)) {
            final StringBuilder sb2 = new StringBuilder("invalid composing range: (");
            sb2.append(String.valueOf(d));
            sb2.append(", ");
            sb2.append(String.valueOf(e));
            sb2.append(")");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (e > a.length()) {
            final StringBuilder sb3 = new StringBuilder("invalid composing start: ");
            sb3.append(String.valueOf(d));
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (b > a.length()) {
            final StringBuilder sb4 = new StringBuilder("invalid selection start: ");
            sb4.append(String.valueOf(b));
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        if (c <= a.length()) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            return;
        }
        final StringBuilder sb5 = new StringBuilder("invalid selection end: ");
        sb5.append(String.valueOf(c));
        throw new IndexOutOfBoundsException(sb5.toString());
    }
    
    public static p a(final JSONObject jsonObject) {
        return new p(jsonObject.getString("text"), jsonObject.getInt("selectionBase"), jsonObject.getInt("selectionExtent"), jsonObject.getInt("composingBase"), jsonObject.getInt("composingExtent"));
    }
}
