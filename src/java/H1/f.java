package h1;

import com.google.android.gms.internal.play_billing.Z;
import com.google.android.gms.internal.play_billing.M;
import com.google.android.gms.internal.play_billing.q0;

public final class f
{
    public int a;
    public String b;
    
    public static e a() {
        final Object o = new Object();
        ((e)o).b = "";
        return (e)o;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int a2 = q0.a;
        final Z e = M.E;
        final Integer value = a;
        M d;
        if (!e.containsKey((Object)value)) {
            d = M.D;
        }
        else {
            d = (M)e.get((Object)value);
        }
        final String string = d.toString();
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("Response Code: ");
        sb.append(string);
        sb.append(", Debug Message: ");
        sb.append(b);
        return sb.toString();
    }
}
