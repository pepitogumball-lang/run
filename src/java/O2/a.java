package o2;

import android.os.Parcelable;
import android.os.Parcel;
import h1.m;
import n2.b;

public final class a extends i2.a
{
    public static final d CREATOR;
    public final int C;
    public final int D;
    public final boolean E;
    public final int F;
    public final boolean G;
    public final String H;
    public final int I;
    public final Class J;
    public final String K;
    public g L;
    public final n2.a M;
    
    static {
        CREATOR = (d)new Object();
    }
    
    public a(final int c, final int d, final boolean e, final int f, final boolean g, final String h, final int i, final String k, final b b) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        if (k == null) {
            this.J = null;
            this.K = null;
        }
        else {
            this.J = c.class;
            this.K = k;
        }
        if (b == null) {
            this.M = null;
            return;
        }
        final n2.a d2 = b.D;
        if (d2 != null) {
            this.M = d2;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
    
    public a(final int d, final boolean e, final int f, final boolean g, final String h, final int i, final Class j) {
        this.C = 1;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        if (j == null) {
            this.K = null;
        }
        else {
            this.K = j.getCanonicalName();
        }
        this.M = null;
    }
    
    public static a h(final int n, final String s) {
        return new a(7, true, 7, true, s, n, null);
    }
    
    public final String toString() {
        final m m = new m((Object)this);
        m.h("versionCode", (Object)this.C);
        m.h("typeIn", (Object)this.D);
        m.h("typeInArray", (Object)this.E);
        m.h("typeOut", (Object)this.F);
        m.h("typeOutArray", (Object)this.G);
        m.h("outputFieldName", (Object)this.H);
        m.h("safeParcelFieldId", (Object)this.I);
        String k;
        if ((k = this.K) == null) {
            k = null;
        }
        m.h("concreteTypeName", (Object)k);
        final Class j = this.J;
        if (j != null) {
            m.h("concreteType.class", (Object)j.getCanonicalName());
        }
        final n2.a i = this.M;
        if (i != null) {
            m.h("converterName", (Object)i.getClass().getCanonicalName());
        }
        return m.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.C(parcel, 3, 4);
        parcel.writeInt((int)(this.E ? 1 : 0));
        a.a.C(parcel, 4, 4);
        parcel.writeInt(this.F);
        a.a.C(parcel, 5, 4);
        parcel.writeInt((int)(this.G ? 1 : 0));
        a.a.v(parcel, 6, this.H, false);
        a.a.C(parcel, 7, 4);
        parcel.writeInt(this.I);
        final Parcelable parcelable = null;
        String k;
        if ((k = this.K) == null) {
            k = null;
        }
        a.a.v(parcel, 8, k, false);
        final n2.a m = this.M;
        Object o;
        if (m == null) {
            o = parcelable;
        }
        else {
            if (!(m instanceof n2.a)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            o = new b(m);
        }
        a.a.u(parcel, 9, (Parcelable)o, n, false);
        a.a.E(parcel, d);
    }
}
