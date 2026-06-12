package io.flutter.view;

import java.util.HashSet;
import java.util.Arrays;
import com.google.android.gms.internal.measurement.L;
import java.util.Iterator;
import android.text.TextUtils;
import L3.A;
import android.text.SpannableString;
import android.opengl.Matrix;
import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import android.graphics.Rect;
import java.util.ArrayList;

public final class f
{
    public String A;
    public String B;
    public int C;
    public int D;
    public boolean E;
    public long F;
    public int G;
    public int H;
    public int I;
    public float J;
    public String K;
    public String L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float[] Q;
    public f R;
    public final ArrayList S;
    public final ArrayList T;
    public ArrayList U;
    public e V;
    public e W;
    public boolean X;
    public float[] Y;
    public boolean Z;
    public final g a;
    public float[] a0;
    public int b;
    public Rect b0;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public String o;
    public String p;
    public ArrayList q;
    public String r;
    public ArrayList s;
    public String t;
    public ArrayList u;
    public String v;
    public ArrayList w;
    public String x;
    public ArrayList y;
    public String z;
    
    public f(final g a) {
        this.b = -1;
        this.D = -1;
        this.E = false;
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.X = true;
        this.Z = true;
        this.a = a;
    }
    
    public static ArrayList C(final ByteBuffer byteBuffer, final ByteBuffer[] array) {
        final int int1 = byteBuffer.getInt();
        if (int1 == -1) {
            return null;
        }
        final ArrayList list = new ArrayList(int1);
        for (int i = 0; i < int1; ++i) {
            final int int2 = byteBuffer.getInt();
            final int int3 = byteBuffer.getInt();
            final int n = v.e.e(2)[byteBuffer.getInt()];
            final int d = v.e.d(n);
            if (d != 0) {
                if (d == 1) {
                    final ByteBuffer byteBuffer2 = array[byteBuffer.getInt()];
                    final Object o = new Object();
                    ((j)o).a = int2;
                    ((j)o).b = int3;
                    ((j)o).c = n;
                    ((h)o).d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                    list.add(o);
                }
            }
            else {
                byteBuffer.getInt();
                final Object o2 = new Object();
                ((j)o2).a = int2;
                ((j)o2).b = int3;
                ((j)o2).c = n;
                list.add(o2);
            }
        }
        return list;
    }
    
    public static void G(final float[] array, final float[] array2, final float[] array3) {
        Matrix.multiplyMV(array, 0, array2, 0, array3, 0);
        final float n = array[3];
        array[0] /= n;
        array[1] /= n;
        array[2] /= n;
        array[3] = 0.0f;
    }
    
    public static Rect d(final f f) {
        return f.b0;
    }
    
    public static boolean j(final f f, final d d) {
        return (f.d & d.C) != 0x0;
    }
    
    public static SpannableString r(final f f) {
        final A a = new A(19, false);
        a.D = f.r;
        a.E = f.s;
        a.F = f.A();
        return a.d();
    }
    
    public static CharSequence s(final f f) {
        final A a = new A(19, false);
        a.D = f.p;
        a.E = f.q;
        a.G = f.A;
        a.F = f.A();
        final SpannableString d = a.d();
        final A a2 = new A(19, false);
        a2.D = f.x;
        a2.E = f.y;
        a2.F = f.A();
        final SpannableString d2 = a2.d();
        CharSequence charSequence = null;
        CharSequence concat;
        for (int i = 0; i < 2; ++i, charSequence = concat) {
            final CharSequence charSequence2 = (new CharSequence[] { (CharSequence)d, (CharSequence)d2 })[i];
            concat = charSequence;
            if (charSequence2 != null) {
                concat = charSequence;
                if (charSequence2.length() > 0) {
                    if (charSequence != null && charSequence.length() != 0) {
                        concat = TextUtils.concat(new CharSequence[] { charSequence, (CharSequence)", ", charSequence2 });
                    }
                    else {
                        concat = charSequence2;
                    }
                }
            }
        }
        return charSequence;
    }
    
    public static CharSequence t(final f f) {
        final A a = new A(19, false);
        a.D = f.r;
        a.E = f.s;
        a.F = f.A();
        final SpannableString d = a.d();
        final A a2 = new A(19, false);
        a2.D = f.p;
        a2.E = f.q;
        a2.G = f.A;
        a2.F = f.A();
        final SpannableString d2 = a2.d();
        final A a3 = new A(19, false);
        a3.D = f.x;
        a3.E = f.y;
        a3.F = f.A();
        final SpannableString d3 = a3.d();
        CharSequence charSequence = null;
        CharSequence concat;
        for (int i = 0; i < 3; ++i, charSequence = concat) {
            final CharSequence charSequence2 = (new CharSequence[] { (CharSequence)d, (CharSequence)d2, (CharSequence)d3 })[i];
            concat = charSequence;
            if (charSequence2 != null) {
                concat = charSequence;
                if (charSequence2.length() > 0) {
                    if (charSequence != null && charSequence.length() != 0) {
                        concat = TextUtils.concat(new CharSequence[] { charSequence, (CharSequence)", ", charSequence2 });
                    }
                    else {
                        concat = charSequence2;
                    }
                }
            }
        }
        return charSequence;
    }
    
    public static boolean y(final f f, final d d) {
        return (f.G & d.C) != 0x0;
    }
    
    public final String A() {
        final String b = this.B;
        if (b != null && !b.isEmpty()) {
            return this.B;
        }
        return this.a.m;
    }
    
    public final String B() {
        if (this.D(13)) {
            final String p = this.p;
            if (p != null && !p.isEmpty()) {
                return this.p;
            }
        }
        final Iterator iterator = this.S.iterator();
        while (iterator.hasNext()) {
            final String b = ((f)iterator.next()).B();
            if (b != null && !b.isEmpty()) {
                return b;
            }
        }
        return null;
    }
    
    public final boolean D(final int n) {
        return (this.c & (long)com.google.android.gms.internal.measurement.L.e(n)) != 0x0L;
    }
    
    public final f E(final float[] array, final boolean b) {
        final float n = array[3];
        final boolean b2 = false;
        final float n2 = array[0] / n;
        final float n3 = array[1] / n;
        final float m = this.M;
        f f2;
        final f f = f2 = null;
        if (n2 >= m) {
            f2 = f;
            if (n2 < this.O) {
                f2 = f;
                if (n3 >= this.N) {
                    if (n3 >= this.P) {
                        f2 = f;
                    }
                    else {
                        final float[] array2 = new float[4];
                        for (final f f3 : this.T) {
                            if (f3.D(14)) {
                                continue;
                            }
                            if (f3.X) {
                                f3.X = false;
                                if (f3.Y == null) {
                                    f3.Y = new float[16];
                                }
                                if (!Matrix.invertM(f3.Y, 0, f3.Q, 0)) {
                                    Arrays.fill(f3.Y, 0.0f);
                                }
                            }
                            Matrix.multiplyMV(array2, 0, f3.Y, 0, array, 0);
                            final f e = f3.E(array2, b);
                            if (e != null) {
                                return e;
                            }
                        }
                        int n4 = b2 ? 1 : 0;
                        if (b) {
                            n4 = (b2 ? 1 : 0);
                            if (this.i != -1) {
                                n4 = 1;
                            }
                        }
                        if (!this.F()) {
                            f2 = f;
                            if (n4 == 0) {
                                return f2;
                            }
                        }
                        f2 = this;
                    }
                }
            }
        }
        return f2;
    }
    
    public final boolean F() {
        final boolean d = this.D(12);
        final boolean b = false;
        if (d) {
            return false;
        }
        if (this.D(22)) {
            return true;
        }
        final int d2 = this.d;
        final int z = io.flutter.view.g.z;
        if ((d2 & 0xFFFFFFC3) == 0x0 && (this.c & (long)10682871) == 0x0L) {
            final String p = this.p;
            if (p == null || p.isEmpty()) {
                final String r = this.r;
                if (r == null || r.isEmpty()) {
                    final String x = this.x;
                    boolean b2 = b;
                    if (x == null) {
                        return b2;
                    }
                    b2 = b;
                    if (x.isEmpty()) {
                        return b2;
                    }
                }
            }
        }
        return true;
    }
    
    public final void H(float[] array, final HashSet set, boolean b) {
        set.add((Object)this);
        if (this.Z) {
            b = true;
        }
        if (b) {
            if (this.a0 == null) {
                this.a0 = new float[16];
            }
            if (this.Q == null) {
                this.Q = new float[16];
            }
            Matrix.multiplyMM(this.a0, 0, array, 0, this.Q, 0);
            final float[] array2 = { 0.0f, 0.0f, 0.0f, 1.0f };
            array = new float[4];
            final float[] array3 = new float[4];
            final float[] array4 = new float[4];
            final float[] array5 = new float[4];
            array2[0] = this.M;
            array2[1] = this.N;
            G(array, this.a0, array2);
            array2[0] = this.O;
            array2[1] = this.N;
            G(array3, this.a0, array2);
            array2[0] = this.O;
            array2[1] = this.P;
            G(array4, this.a0, array2);
            array2[0] = this.M;
            array2[1] = this.P;
            G(array5, this.a0, array2);
            if (this.b0 == null) {
                this.b0 = new Rect();
            }
            this.b0.set(Math.round(Math.min(array[0], Math.min(array3[0], Math.min(array4[0], array5[0])))), Math.round(Math.min(array[1], Math.min(array3[1], Math.min(array4[1], array5[1])))), Math.round(Math.max(array[0], Math.max(array3[0], Math.max(array4[0], array5[0])))), Math.round(Math.max(array[1], Math.max(array3[1], Math.max(array4[1], array5[1])))));
            this.Z = false;
        }
        final Iterator iterator = this.S.iterator();
        int b2 = -1;
        while (iterator.hasNext()) {
            final f f = (f)iterator.next();
            f.D = b2;
            b2 = f.b;
            f.H(this.a0, set, b);
        }
    }
    
    public final void z(final ArrayList list) {
        if (this.D(12)) {
            list.add((Object)this);
        }
        final Iterator iterator = this.S.iterator();
        while (iterator.hasNext()) {
            ((f)iterator.next()).z(list);
        }
    }
}
