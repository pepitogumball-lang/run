package n2;

import java.util.Iterator;
import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import f2.p;
import android.util.SparseArray;
import java.util.HashMap;
import android.os.Parcelable$Creator;

public final class a extends i2.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int C;
    public final HashMap D;
    public final SparseArray E;
    
    static {
        CREATOR = (Parcelable$Creator)new p(18);
    }
    
    public a(int i, final ArrayList list) {
        this.C = i;
        this.D = new HashMap();
        this.E = new SparseArray();
        int size;
        c c;
        String d;
        int e;
        for (size = ((List)list).size(), i = 0; i < size; ++i) {
            c = (c)((List)list).get(i);
            d = c.D;
            e = c.E;
            this.D.put((Object)d, (Object)e);
            this.E.put(e, (Object)d);
        }
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        final ArrayList list = new ArrayList();
        final HashMap d2 = this.D;
        for (final String s : d2.keySet()) {
            list.add((Object)new c(s, (int)d2.get((Object)s)));
        }
        a.a.z(parcel, 2, (List)list, false);
        a.a.E(parcel, d);
    }
}
