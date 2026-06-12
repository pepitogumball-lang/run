package A;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseIntArray;

public final class k
{
    public static final SparseIntArray p0;
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public float d0;
    public int e;
    public float e0;
    public float f;
    public int f0;
    public boolean g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int[] i0;
    public int j;
    public String j0;
    public int k;
    public String k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public int o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    public int z;
    
    static {
        final SparseIntArray p = new SparseIntArray();
        (p0 = p).append(43, 24);
        p.append(44, 25);
        p.append(46, 28);
        p.append(47, 29);
        p.append(52, 35);
        p.append(51, 34);
        p.append(24, 4);
        p.append(23, 3);
        p.append(19, 1);
        p.append(61, 6);
        p.append(62, 7);
        p.append(31, 17);
        p.append(32, 18);
        p.append(33, 19);
        p.append(15, 90);
        p.append(0, 26);
        p.append(48, 31);
        p.append(49, 32);
        p.append(30, 10);
        p.append(29, 9);
        p.append(66, 13);
        p.append(69, 16);
        p.append(67, 14);
        p.append(64, 11);
        p.append(68, 15);
        p.append(65, 12);
        p.append(55, 38);
        p.append(41, 37);
        p.append(40, 39);
        p.append(54, 40);
        p.append(39, 20);
        p.append(53, 36);
        p.append(28, 5);
        p.append(42, 91);
        p.append(50, 91);
        p.append(45, 91);
        p.append(22, 91);
        p.append(18, 91);
        p.append(3, 23);
        p.append(5, 27);
        p.append(7, 30);
        p.append(8, 8);
        p.append(4, 33);
        p.append(6, 2);
        p.append(1, 22);
        p.append(2, 21);
        p.append(56, 41);
        p.append(34, 42);
        p.append(17, 41);
        p.append(16, 42);
        p.append(71, 76);
        p.append(25, 61);
        p.append(27, 62);
        p.append(26, 63);
        p.append(60, 69);
        p.append(38, 70);
        p.append(12, 71);
        p.append(10, 72);
        p.append(11, 73);
        p.append(13, 74);
        p.append(9, 75);
    }
    
    public final void a(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, A.s.e);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            final SparseIntArray p2 = A.k.p0;
            final int value = p2.get(index);
            switch (value) {
                default: {
                    switch (value) {
                        default: {
                            switch (value) {
                                default: {
                                    final StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(p2.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                                }
                                case 91: {
                                    final StringBuilder sb2 = new StringBuilder("unused attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append("   ");
                                    sb2.append(p2.get(index));
                                    Log.w("ConstraintSet", sb2.toString());
                                    continue;
                                }
                                case 90: {
                                    this.g = obtainStyledAttributes.getBoolean(index, this.g);
                                    continue;
                                }
                                case 89: {
                                    this.k0 = obtainStyledAttributes.getString(index);
                                    continue;
                                }
                                case 88: {
                                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                    continue;
                                }
                                case 87: {
                                    this.l0 = obtainStyledAttributes.getBoolean(index, this.l0);
                                    continue;
                                }
                                case 86: {
                                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    continue;
                                }
                                case 85: {
                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    continue;
                                }
                                case 84: {
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    continue;
                                }
                                case 83: {
                                    this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    continue;
                                }
                                case 82: {
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    continue;
                                }
                                case 81: {
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    continue;
                                }
                                case 80: {
                                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    continue;
                                }
                                case 79: {
                                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    continue;
                                }
                                case 78: {
                                    this.r = A.o.e(obtainStyledAttributes, index, this.r);
                                    continue;
                                }
                                case 77: {
                                    this.q = A.o.e(obtainStyledAttributes, index, this.q);
                                    continue;
                                }
                                case 76: {
                                    this.o0 = obtainStyledAttributes.getInt(index, this.o0);
                                    continue;
                                }
                                case 75: {
                                    this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                    continue;
                                }
                                case 74: {
                                    this.j0 = obtainStyledAttributes.getString(index);
                                    continue;
                                }
                                case 73: {
                                    this.g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.g0);
                                    continue;
                                }
                                case 72: {
                                    this.f0 = obtainStyledAttributes.getInt(index, this.f0);
                                    continue;
                                }
                                case 71: {
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                }
                                case 70: {
                                    this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                }
                                case 69: {
                                    this.d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                }
                            }
                            break;
                        }
                        case 63: {
                            this.B = obtainStyledAttributes.getFloat(index, this.B);
                            continue;
                        }
                        case 62: {
                            this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                            continue;
                        }
                        case 61: {
                            this.z = A.o.e(obtainStyledAttributes, index, this.z);
                            continue;
                        }
                    }
                    break;
                }
                case 42: {
                    A.o.f(this, obtainStyledAttributes, index, 1);
                    break;
                }
                case 41: {
                    A.o.f(this, obtainStyledAttributes, index, 0);
                    break;
                }
                case 40: {
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                    break;
                }
                case 39: {
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                    break;
                }
                case 38: {
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                    break;
                }
                case 37: {
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                    break;
                }
                case 36: {
                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                    break;
                }
                case 35: {
                    this.l = A.o.e(obtainStyledAttributes, index, this.l);
                    break;
                }
                case 34: {
                    this.m = A.o.e(obtainStyledAttributes, index, this.m);
                    break;
                }
                case 33: {
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                }
                case 32: {
                    this.t = A.o.e(obtainStyledAttributes, index, this.t);
                    break;
                }
                case 31: {
                    this.s = A.o.e(obtainStyledAttributes, index, this.s);
                    break;
                }
                case 30: {
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                }
                case 29: {
                    this.k = A.o.e(obtainStyledAttributes, index, this.k);
                    break;
                }
                case 28: {
                    this.j = A.o.e(obtainStyledAttributes, index, this.j);
                    break;
                }
                case 27: {
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                }
                case 26: {
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                    break;
                }
                case 25: {
                    this.i = A.o.e(obtainStyledAttributes, index, this.i);
                    break;
                }
                case 24: {
                    this.h = A.o.e(obtainStyledAttributes, index, this.h);
                    break;
                }
                case 23: {
                    this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                    break;
                }
                case 22: {
                    this.b = obtainStyledAttributes.getLayoutDimension(index, this.b);
                    break;
                }
                case 21: {
                    this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                }
                case 20: {
                    this.w = obtainStyledAttributes.getFloat(index, this.w);
                    break;
                }
                case 19: {
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                }
                case 18: {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                }
                case 17: {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                    break;
                }
                case 16: {
                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                }
                case 15: {
                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                }
                case 14: {
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                }
                case 13: {
                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                    break;
                }
                case 12: {
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                }
                case 11: {
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                }
                case 10: {
                    this.u = A.o.e(obtainStyledAttributes, index, this.u);
                    break;
                }
                case 9: {
                    this.v = A.o.e(obtainStyledAttributes, index, this.v);
                    break;
                }
                case 8: {
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                }
                case 7: {
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                }
                case 6: {
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                    break;
                }
                case 5: {
                    this.y = obtainStyledAttributes.getString(index);
                    break;
                }
                case 4: {
                    this.n = A.o.e(obtainStyledAttributes, index, this.n);
                    break;
                }
                case 3: {
                    this.o = A.o.e(obtainStyledAttributes, index, this.o);
                    break;
                }
                case 2: {
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                }
                case 1: {
                    this.p = A.o.e(obtainStyledAttributes, index, this.p);
                    break;
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
