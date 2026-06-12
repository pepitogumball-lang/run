package Y1;

import java.util.List;
import android.os.Parcel;
import java.util.Map;
import o2.a;
import t.j;
import java.util.ArrayList;
import t.b;
import android.os.Parcelable$Creator;
import com.google.android.gms.internal.auth.d;

public final class c extends d
{
    public static final Parcelable$Creator<c> CREATOR;
    public static final b I;
    public final int C;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    
    static {
        CREATOR = (Parcelable$Creator)new U1.d(6);
        final j i = new j();
        ((j)(I = (b)i)).put((Object)"registered", (Object)a.h(2, "registered"));
        i.put((Object)"in_progress", (Object)a.h(3, "in_progress"));
        i.put((Object)"success", (Object)a.h(4, "success"));
        i.put((Object)"failed", (Object)a.h(5, "failed"));
        i.put((Object)"escrowed", (Object)a.h(6, "escrowed"));
    }
    
    public c(final int c, final ArrayList d, final ArrayList e, final ArrayList f, final ArrayList g, final ArrayList h) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
    }
    
    public final Map a() {
        return (Map)c.I;
    }
    
    public final Object b(final a a) {
        switch (a.I) {
            default: {
                final StringBuilder sb = new StringBuilder("Unknown SafeParcelable id=");
                sb.append(a.I);
                throw new IllegalStateException(sb.toString());
            }
            case 6: {
                return this.H;
            }
            case 5: {
                return this.G;
            }
            case 4: {
                return this.F;
            }
            case 3: {
                return this.E;
            }
            case 2: {
                return this.D;
            }
            case 1: {
                return this.C;
            }
        }
    }
    
    public final boolean d(final a a) {
        return true;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.x(parcel, 2, (List)this.D);
        a.a.x(parcel, 3, (List)this.E);
        a.a.x(parcel, 4, (List)this.F);
        a.a.x(parcel, 5, (List)this.G);
        a.a.x(parcel, 6, (List)this.H);
        a.a.E(parcel, d);
    }
}
