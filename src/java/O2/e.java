package o2;

import java.util.List;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Map;
import f2.p;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import i2.a;

public final class e extends a
{
    public static final Parcelable$Creator<e> CREATOR;
    public final int C;
    public final String D;
    public final ArrayList E;
    
    static {
        CREATOR = (Parcelable$Creator)new p(23);
    }
    
    public e(final int c, final String d, final ArrayList e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public e(String d, final Map map) {
        this.C = 1;
        this.D = d;
        ArrayList e;
        if (map == null) {
            e = null;
        }
        else {
            final ArrayList list = new ArrayList();
            final Iterator iterator = map.keySet().iterator();
            while (true) {
                e = list;
                if (!iterator.hasNext()) {
                    break;
                }
                d = (String)iterator.next();
                list.add((Object)new f(d, (o2.a)map.get((Object)d)));
            }
        }
        this.E = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.v(parcel, 2, this.D, false);
        a.a.z(parcel, 3, (List)this.E, false);
        a.a.E(parcel, d);
    }
}
