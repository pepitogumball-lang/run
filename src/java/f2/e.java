package f2;

import com.google.android.gms.common.api.Status;

public class e extends Exception
{
    public final Status C;
    
    public e(final Status c) {
        final int c2 = c.C;
        String d = c.D;
        if (d == null) {
            d = "";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 2 + String.valueOf((Object)d).length());
        sb.append(c2);
        sb.append(": ");
        sb.append(d);
        super(sb.toString());
        this.C = c;
    }
}
