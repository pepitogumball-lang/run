package A;

import x.g;
import android.view.ViewGroup$MarginLayoutParams;

public final class e extends ViewGroup$MarginLayoutParams
{
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;
    public int p;
    public x.e p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    public final void a() {
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        final int width = super.width;
        if (width == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        final int height = super.height;
        if (height == -2 && this.X) {
            this.b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (width == 0 || width == -1) {
            this.a0 = false;
            if (width == 0 && this.L == 1) {
                super.width = -2;
                this.W = true;
            }
        }
        if (height == 0 || height == -1) {
            this.b0 = false;
            if (height == 0 && this.M == 1) {
                super.height = -2;
                this.X = true;
            }
        }
        if (this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.p0 instanceof g)) {
                this.p0 = (x.e)new g();
            }
            ((g)this.p0).O(this.V);
        }
    }
    
    public final void resolveLayoutDirection(int g0) {
        final int leftMargin = super.leftMargin;
        final int rightMargin = super.rightMargin;
        super.resolveLayoutDirection(g0);
        g0 = this.getLayoutDirection();
        final int n = 0;
        if (1 == g0) {
            g0 = 1;
        }
        else {
            g0 = 0;
        }
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = this.w;
        this.k0 = this.y;
        final float e = this.E;
        this.l0 = e;
        final int a = this.a;
        this.m0 = a;
        final int b = this.b;
        this.n0 = b;
        final float c = this.c;
        this.o0 = c;
        if (g0 != 0) {
            g0 = this.s;
            Label_0165: {
                if (g0 != -1) {
                    this.h0 = g0;
                }
                else {
                    final int t = this.t;
                    g0 = n;
                    if (t == -1) {
                        break Label_0165;
                    }
                    this.i0 = t;
                }
                g0 = 1;
            }
            final int u = this.u;
            if (u != -1) {
                this.g0 = u;
                g0 = 1;
            }
            final int v = this.v;
            if (v != -1) {
                this.f0 = v;
                g0 = 1;
            }
            final int a2 = this.A;
            if (a2 != Integer.MIN_VALUE) {
                this.k0 = a2;
            }
            final int b2 = this.B;
            if (b2 != Integer.MIN_VALUE) {
                this.j0 = b2;
            }
            if (g0 != 0) {
                this.l0 = 1.0f - e;
            }
            if (this.d0 && this.V == 1 && this.d) {
                if (c != -1.0f) {
                    this.o0 = 1.0f - c;
                    this.m0 = -1;
                    this.n0 = -1;
                }
                else if (a != -1) {
                    this.n0 = a;
                    this.m0 = -1;
                    this.o0 = -1.0f;
                }
                else if (b != -1) {
                    this.m0 = b;
                    this.n0 = -1;
                    this.o0 = -1.0f;
                }
            }
        }
        else {
            g0 = this.s;
            if (g0 != -1) {
                this.g0 = g0;
            }
            g0 = this.t;
            if (g0 != -1) {
                this.f0 = g0;
            }
            g0 = this.u;
            if (g0 != -1) {
                this.h0 = g0;
            }
            g0 = this.v;
            if (g0 != -1) {
                this.i0 = g0;
            }
            g0 = this.A;
            if (g0 != Integer.MIN_VALUE) {
                this.j0 = g0;
            }
            g0 = this.B;
            if (g0 != Integer.MIN_VALUE) {
                this.k0 = g0;
            }
        }
        if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
            g0 = this.g;
            if (g0 != -1) {
                this.h0 = g0;
                if (super.rightMargin <= 0 && rightMargin > 0) {
                    super.rightMargin = rightMargin;
                }
            }
            else {
                g0 = this.h;
                if (g0 != -1) {
                    this.i0 = g0;
                    if (super.rightMargin <= 0 && rightMargin > 0) {
                        super.rightMargin = rightMargin;
                    }
                }
            }
            g0 = this.e;
            if (g0 != -1) {
                this.f0 = g0;
                if (super.leftMargin <= 0 && leftMargin > 0) {
                    super.leftMargin = leftMargin;
                }
            }
            else {
                g0 = this.f;
                if (g0 != -1) {
                    this.g0 = g0;
                    if (super.leftMargin <= 0 && leftMargin > 0) {
                        super.leftMargin = leftMargin;
                    }
                }
            }
        }
    }
}
