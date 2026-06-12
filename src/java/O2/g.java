package o2;

import java.util.List;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Map;
import h2.A;
import java.util.ArrayList;
import f2.p;
import java.util.HashMap;
import android.os.Parcelable$Creator;
import i2.a;

public final class g extends a
{
    public static final Parcelable$Creator<g> CREATOR;
    public final int C;
    public final HashMap D;
    public final String E;
    
    static {
        CREATOR = (Parcelable$Creator)new p(22);
    }
    
    public g(int i, final String e, final ArrayList list) {
        this.C = i;
        final HashMap d = new HashMap();
        int size;
        e e2;
        String d2;
        HashMap hashMap;
        ArrayList e3;
        int size2;
        int j;
        f f;
        for (size = list.size(), i = 0; i < size; ++i) {
            e2 = (e)list.get(i);
            d2 = e2.D;
            hashMap = new HashMap();
            e3 = e2.E;
            A.h((Object)e3);
            for (size2 = e3.size(), j = 0; j < size2; ++j) {
                f = (f)e3.get(j);
                hashMap.put((Object)f.D, (Object)f.E);
            }
            d.put((Object)d2, (Object)hashMap);
        }
        this.D = d;
        A.h((Object)e);
        this.E = e;
        final Iterator iterator = d.keySet().iterator();
        while (iterator.hasNext()) {
            final Map map = (Map)d.get((Object)iterator.next());
            final Iterator iterator2 = map.keySet().iterator();
            while (iterator2.hasNext()) {
                ((o2.a)map.get((Object)iterator2.next())).L = this;
            }
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final HashMap d = this.D;
        for (final String s : d.keySet()) {
            sb.append(s);
            sb.append(":\n");
            final Map map = (Map)d.get((Object)s);
            for (final String s2 : map.keySet()) {
                sb.append("  ");
                sb.append(s2);
                sb.append(": ");
                sb.append(map.get((Object)s2));
            }
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        final ArrayList list = new ArrayList();
        final HashMap d2 = this.D;
        for (final String s : d2.keySet()) {
            list.add((Object)new e(s, (Map)d2.get((Object)s)));
        }
        a.a.z(parcel, 2, (List)list, false);
        a.a.v(parcel, 3, this.E, false);
        a.a.E(parcel, d);
    }
}
