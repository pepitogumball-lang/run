package o2;

import android.os.BaseBundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;
import android.os.Bundle;
import java.util.Iterator;
import android.util.Base64;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map$Entry;
import android.util.SparseArray;
import java.util.Map;
import h2.A;
import f2.p;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class c extends b
{
    public static final Parcelable$Creator<c> CREATOR;
    public final int C;
    public final Parcel D;
    public final int E;
    public final g F;
    public final String G;
    public int H;
    public int I;
    
    static {
        CREATOR = (Parcelable$Creator)new p(24);
    }
    
    public c(final int c, final Parcel d, final g f) {
        this.C = c;
        A.h((Object)d);
        this.D = d;
        this.E = 2;
        this.F = f;
        String e;
        if (f == null) {
            e = null;
        }
        else {
            e = f.E;
        }
        this.G = e;
        this.H = 2;
    }
    
    public static void i(final StringBuilder sb, final Map map, final Parcel parcel) {
        final SparseArray sparseArray = new SparseArray();
        for (final Map$Entry map$Entry : map.entrySet()) {
            sparseArray.put(((a)map$Entry.getValue()).I, (Object)map$Entry);
        }
        sb.append('{');
        final int v = J5.b.V(parcel);
        int n = 0;
        while (parcel.dataPosition() < v) {
            final int int1 = parcel.readInt();
            final Map$Entry map$Entry2 = (Map$Entry)sparseArray.get((int)(char)int1);
            if (map$Entry2 != null) {
                if (n != 0) {
                    sb.append(",");
                }
                final String s = (String)map$Entry2.getKey();
                final a a = (a)map$Entry2.getValue();
                sb.append("\"");
                sb.append(s);
                sb.append("\":");
                final n2.a m = a.M;
                final Parcel[] array = null;
                final boolean[] array2 = null;
                final BigDecimal[] array3 = null;
                final double[] array4 = null;
                final float[] array5 = null;
                final long[] array6 = null;
                final BigInteger[] array7 = null;
                final Parcel parcel2 = null;
                String encodeToString = null;
                final String s2 = null;
                final Object o = null;
                final Object o2 = null;
                final int f = a.F;
                if (m != null) {
                    switch (f) {
                        default: {
                            final StringBuilder sb2 = new StringBuilder(String.valueOf(f).length() + 25);
                            sb2.append("Unknown field out type = ");
                            sb2.append(f);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        case 11: {
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        }
                        case 10: {
                            final Bundle i = J5.b.m(parcel, int1);
                            final HashMap hashMap = new HashMap();
                            for (final String s3 : ((BaseBundle)i).keySet()) {
                                final String string = ((BaseBundle)i).getString(s3);
                                A.h((Object)string);
                                hashMap.put((Object)s3, (Object)string);
                            }
                            k(sb, a, b.f(a, (Object)hashMap));
                            break;
                        }
                        case 8:
                        case 9: {
                            k(sb, a, b.f(a, (Object)J5.b.n(parcel, int1)));
                            break;
                        }
                        case 7: {
                            k(sb, a, b.f(a, (Object)J5.b.q(parcel, int1)));
                            break;
                        }
                        case 6: {
                            k(sb, a, b.f(a, (Object)J5.b.J(parcel, int1)));
                            break;
                        }
                        case 5: {
                            k(sb, a, b.f(a, (Object)J5.b.l(parcel, int1)));
                            break;
                        }
                        case 4: {
                            J5.b.a0(parcel, int1, 8);
                            k(sb, a, b.f(a, (Object)parcel.readDouble()));
                            break;
                        }
                        case 3: {
                            J5.b.a0(parcel, int1, 4);
                            k(sb, a, b.f(a, (Object)parcel.readFloat()));
                            break;
                        }
                        case 2: {
                            k(sb, a, b.f(a, (Object)J5.b.M(parcel, int1)));
                            break;
                        }
                        case 1: {
                            final int o3 = J5.b.O(parcel, int1);
                            final int dataPosition = parcel.dataPosition();
                            Object o4;
                            if (o3 == 0) {
                                o4 = o2;
                            }
                            else {
                                final byte[] byteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + o3);
                                o4 = new BigInteger(byteArray);
                            }
                            k(sb, a, b.f(a, o4));
                            break;
                        }
                        case 0: {
                            k(sb, a, b.f(a, (Object)J5.b.L(parcel, int1)));
                            break;
                        }
                    }
                }
                else {
                    final boolean g = a.G;
                    final String k = a.K;
                    if (g) {
                        sb.append("[");
                        switch (f) {
                            default: {
                                throw new IllegalStateException("Unknown field type out.");
                            }
                            case 11: {
                                final int o5 = J5.b.O(parcel, int1);
                                final int dataPosition2 = parcel.dataPosition();
                                Parcel[] array8;
                                if (o5 == 0) {
                                    array8 = array;
                                }
                                else {
                                    final int int2 = parcel.readInt();
                                    array8 = new Parcel[int2];
                                    for (int j = 0; j < int2; ++j) {
                                        final int int3 = parcel.readInt();
                                        if (int3 != 0) {
                                            final int dataPosition3 = parcel.dataPosition();
                                            final Parcel obtain = Parcel.obtain();
                                            obtain.appendFrom(parcel, dataPosition3, int3);
                                            array8[j] = obtain;
                                            parcel.setDataPosition(dataPosition3 + int3);
                                        }
                                        else {
                                            array8[j] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition2 + o5);
                                }
                                for (int length = array8.length, l = 0; l < length; ++l) {
                                    if (l > 0) {
                                        sb.append(",");
                                    }
                                    array8[l].setDataPosition(0);
                                    A.h((Object)k);
                                    A.h((Object)a.L);
                                    final Map map2 = (Map)a.L.D.get((Object)k);
                                    A.h((Object)map2);
                                    i(sb, map2, array8[l]);
                                }
                                break;
                            }
                            case 8:
                            case 9:
                            case 10: {
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            }
                            case 7: {
                                final String[] r = J5.b.r(parcel, int1);
                                for (int length2 = r.length, n2 = 0; n2 < length2; ++n2) {
                                    if (n2 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(r[n2]);
                                    sb.append("\"");
                                }
                                break;
                            }
                            case 6: {
                                final int o6 = J5.b.O(parcel, int1);
                                final int dataPosition4 = parcel.dataPosition();
                                boolean[] booleanArray;
                                if (o6 == 0) {
                                    booleanArray = array2;
                                }
                                else {
                                    booleanArray = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition4 + o6);
                                }
                                for (int length3 = booleanArray.length, n3 = 0; n3 < length3; ++n3) {
                                    if (n3 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(booleanArray[n3]);
                                }
                                break;
                            }
                            case 5: {
                                final int o7 = J5.b.O(parcel, int1);
                                final int dataPosition5 = parcel.dataPosition();
                                BigDecimal[] array9;
                                if (o7 == 0) {
                                    array9 = array3;
                                }
                                else {
                                    final int int4 = parcel.readInt();
                                    array9 = new BigDecimal[int4];
                                    for (int n4 = 0; n4 < int4; ++n4) {
                                        array9[n4] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition5 + o7);
                                }
                                for (int length4 = array9.length, n5 = 0; n5 < length4; ++n5) {
                                    if (n5 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append((Object)array9[n5]);
                                }
                                break;
                            }
                            case 4: {
                                final int o8 = J5.b.O(parcel, int1);
                                final int dataPosition6 = parcel.dataPosition();
                                double[] doubleArray;
                                if (o8 == 0) {
                                    doubleArray = array4;
                                }
                                else {
                                    doubleArray = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition6 + o8);
                                }
                                for (int length5 = doubleArray.length, n6 = 0; n6 < length5; ++n6) {
                                    if (n6 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(doubleArray[n6]);
                                }
                                break;
                            }
                            case 3: {
                                final int o9 = J5.b.O(parcel, int1);
                                final int dataPosition7 = parcel.dataPosition();
                                float[] floatArray;
                                if (o9 == 0) {
                                    floatArray = array5;
                                }
                                else {
                                    floatArray = parcel.createFloatArray();
                                    parcel.setDataPosition(dataPosition7 + o9);
                                }
                                for (int length6 = floatArray.length, n7 = 0; n7 < length6; ++n7) {
                                    if (n7 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(floatArray[n7]);
                                }
                                break;
                            }
                            case 2: {
                                final int o10 = J5.b.O(parcel, int1);
                                final int dataPosition8 = parcel.dataPosition();
                                long[] longArray;
                                if (o10 == 0) {
                                    longArray = array6;
                                }
                                else {
                                    longArray = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition8 + o10);
                                }
                                for (int length7 = longArray.length, n8 = 0; n8 < length7; ++n8) {
                                    if (n8 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(longArray[n8]);
                                }
                                break;
                            }
                            case 1: {
                                final int o11 = J5.b.O(parcel, int1);
                                final int dataPosition9 = parcel.dataPosition();
                                BigInteger[] array10;
                                if (o11 == 0) {
                                    array10 = array7;
                                }
                                else {
                                    final int int5 = parcel.readInt();
                                    array10 = new BigInteger[int5];
                                    for (int n9 = 0; n9 < int5; ++n9) {
                                        array10[n9] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition9 + o11);
                                }
                                for (int length8 = array10.length, n10 = 0; n10 < length8; ++n10) {
                                    if (n10 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append((Object)array10[n10]);
                                }
                                break;
                            }
                            case 0: {
                                final int[] o12 = J5.b.o(parcel, int1);
                                for (int length9 = o12.length, n11 = 0; n11 < length9; ++n11) {
                                    if (n11 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(o12[n11]);
                                }
                                break;
                            }
                        }
                        sb.append("]");
                    }
                    else {
                        switch (f) {
                            default: {
                                throw new IllegalStateException("Unknown field type out");
                            }
                            case 11: {
                                final int o13 = J5.b.O(parcel, int1);
                                final int dataPosition10 = parcel.dataPosition();
                                Parcel obtain2;
                                if (o13 == 0) {
                                    obtain2 = parcel2;
                                }
                                else {
                                    obtain2 = Parcel.obtain();
                                    obtain2.appendFrom(parcel, dataPosition10, o13);
                                    parcel.setDataPosition(dataPosition10 + o13);
                                }
                                obtain2.setDataPosition(0);
                                A.h((Object)k);
                                A.h((Object)a.L);
                                final Map map3 = (Map)a.L.D.get((Object)k);
                                A.h((Object)map3);
                                i(sb, map3, obtain2);
                                break;
                            }
                            case 10: {
                                final Bundle m2 = J5.b.m(parcel, int1);
                                final Set keySet = ((BaseBundle)m2).keySet();
                                sb.append("{");
                                final Iterator iterator3 = keySet.iterator();
                                int n12 = 1;
                                while (iterator3.hasNext()) {
                                    final String s4 = (String)iterator3.next();
                                    if (n12 == 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(s4);
                                    sb.append("\":\"");
                                    sb.append(q2.c.a(((BaseBundle)m2).getString(s4)));
                                    sb.append("\"");
                                    n12 = 0;
                                }
                                sb.append("}");
                                break;
                            }
                            case 9: {
                                final byte[] n13 = J5.b.n(parcel, int1);
                                sb.append("\"");
                                if (n13 != null) {
                                    encodeToString = Base64.encodeToString(n13, 10);
                                }
                                sb.append(encodeToString);
                                sb.append("\"");
                                break;
                            }
                            case 8: {
                                final byte[] n14 = J5.b.n(parcel, int1);
                                sb.append("\"");
                                String encodeToString2;
                                if (n14 == null) {
                                    encodeToString2 = s2;
                                }
                                else {
                                    encodeToString2 = Base64.encodeToString(n14, 0);
                                }
                                sb.append(encodeToString2);
                                sb.append("\"");
                                break;
                            }
                            case 7: {
                                final String q = J5.b.q(parcel, int1);
                                sb.append("\"");
                                sb.append(q2.c.a(q));
                                sb.append("\"");
                                break;
                            }
                            case 6: {
                                sb.append(J5.b.J(parcel, int1));
                                break;
                            }
                            case 5: {
                                sb.append((Object)J5.b.l(parcel, int1));
                                break;
                            }
                            case 4: {
                                J5.b.a0(parcel, int1, 8);
                                sb.append(parcel.readDouble());
                                break;
                            }
                            case 3: {
                                J5.b.a0(parcel, int1, 4);
                                sb.append(parcel.readFloat());
                                break;
                            }
                            case 2: {
                                sb.append(J5.b.M(parcel, int1));
                                break;
                            }
                            case 1: {
                                final int o14 = J5.b.O(parcel, int1);
                                final int dataPosition11 = parcel.dataPosition();
                                Object o15;
                                if (o14 == 0) {
                                    o15 = o;
                                }
                                else {
                                    final byte[] byteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition11 + o14);
                                    o15 = new BigInteger(byteArray2);
                                }
                                sb.append(o15);
                                break;
                            }
                            case 0: {
                                sb.append(J5.b.L(parcel, int1));
                                break;
                            }
                        }
                    }
                }
                n = 1;
            }
        }
        if (parcel.dataPosition() == v) {
            sb.append('}');
            return;
        }
        final StringBuilder sb3 = new StringBuilder(String.valueOf(v).length() + 26);
        sb3.append("Overread allowed size end=");
        sb3.append(v);
        throw new i2.b(sb3.toString(), parcel);
    }
    
    public static final void j(StringBuilder sb, final int n, final Object o) {
        final String s = null;
        final String s2 = null;
        switch (n) {
            default: {
                sb = new StringBuilder(String.valueOf(n).length() + 15);
                sb.append("Unknown type = ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
            case 10: {
                A.h(o);
                q2.b.o(sb, (HashMap)o);
                return;
            }
            case 9: {
                sb.append("\"");
                final byte[] array = (byte[])o;
                String encodeToString;
                if (array == null) {
                    encodeToString = s2;
                }
                else {
                    encodeToString = Base64.encodeToString(array, 10);
                }
                sb.append(encodeToString);
                sb.append("\"");
                return;
            }
            case 8: {
                sb.append("\"");
                final byte[] array2 = (byte[])o;
                String encodeToString2;
                if (array2 == null) {
                    encodeToString2 = s;
                }
                else {
                    encodeToString2 = Base64.encodeToString(array2, 0);
                }
                sb.append(encodeToString2);
                sb.append("\"");
                return;
            }
            case 7: {
                sb.append("\"");
                A.h(o);
                sb.append(q2.c.a(o.toString()));
                sb.append("\"");
                return;
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                sb.append(o);
            }
        }
    }
    
    public static final void k(final StringBuilder sb, final a a, final Object o) {
        final boolean e = a.E;
        final int d = a.D;
        if (e) {
            final ArrayList list = (ArrayList)o;
            sb.append("[");
            for (int size = list.size(), i = 0; i < size; ++i) {
                if (i != 0) {
                    sb.append(",");
                }
                j(sb, d, list.get(i));
            }
            sb.append("]");
            return;
        }
        j(sb, d, o);
    }
    
    public final Map a() {
        final g f = this.F;
        if (f == null) {
            return null;
        }
        final String g = this.G;
        A.h((Object)g);
        return (Map)f.D.get((Object)g);
    }
    
    public final Object c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    public final boolean e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    public final Parcel h() {
        final int h = this.H;
        final Parcel d = this.D;
        if (h != 0) {
            if (h == 1) {
                a.a.E(d, this.I);
                this.H = 2;
            }
        }
        else {
            a.a.E(d, this.I = a.a.D(d, 20293));
            this.H = 2;
        }
        return d;
    }
    
    public final String toString() {
        final g f = this.F;
        A.i("Cannot convert to JSON on client side.", (Object)f);
        final Parcel h = this.h();
        h.setDataPosition(0);
        final StringBuilder sb = new StringBuilder(100);
        final String g = this.G;
        A.h((Object)g);
        final Map map = (Map)f.D.get((Object)g);
        A.h((Object)map);
        i(sb, map, h);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        final Parcel h = this.h();
        if (h != null) {
            final int d2 = a.a.D(parcel, 2);
            parcel.appendFrom(h, 0, h.dataSize());
            a.a.E(parcel, d2);
        }
        Object f;
        if (this.E != 0) {
            f = this.F;
        }
        else {
            f = null;
        }
        a.a.u(parcel, 3, (Parcelable)f, n, false);
        a.a.E(parcel, d);
    }
}
