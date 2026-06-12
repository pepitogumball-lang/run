package C2;

import android.view.View;
import java.lang.ref.Reference;
import com.google.android.gms.internal.ads.y7;
import java.util.Arrays;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import Y0.h;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import w2.e;
import java.util.WeakHashMap;
import U0.g;
import O.V;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import F1.u0;
import o.U;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import C.a;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.ps;
import com.google.android.gms.internal.ads.R3;
import java.util.ArrayList;

public final class g0
{
    public int a;
    public int b;
    public Object c = c;
    public Object d = d;
    
    public g0() {
        this.c = new long[10];
        this.d = new Object[10];
    }
    
    public g0(final int a, final ArrayList c, final int b, final R3 d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public void a() {
        new Handler(Looper.getMainLooper()).post((Runnable)new a(this, 1));
    }
    
    public void b(final Typeface typeface) {
        Typeface a = typeface;
        if (Build$VERSION.SDK_INT >= 28) {
            final int a2 = this.a;
            a = typeface;
            if (a2 != -1) {
                a = U.a(typeface, a2, (this.b & 0x2) != 0x0);
            }
        }
        final u0 u0 = (u0)this.d;
        if (u0.c) {
            u0.m = a;
            final TextView textView = (TextView)((Reference)this.c).get();
            if (textView != null) {
                final WeakHashMap a3 = V.a;
                if (((View)textView).isAttachedToWindow()) {
                    ((View)textView).post((Runnable)new g((Object)textView, (Object)a, u0.a, 4));
                }
                else {
                    textView.setTypeface(a, u0.a);
                }
            }
        }
    }
    
    public int c() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public A.g d() {
        final B b = (B)this.d;
        final int a = b.a;
        final boolean b2 = a == 8;
        final e e = (e)this.c;
        ((C2.g)e.F).b.edit().putBoolean("is_pub_misconfigured", b2).commit();
        if (a == 0) {
            throw null;
        }
        switch (a - 1) {
            default: {
                throw new Z(1, "Invalid response from server.");
            }
            case 7: {
                throw new Z(3, "Publisher misconfiguration: ".concat(String.valueOf((Object)b.e)));
            }
            case 6: {
                throw new Z(1, "Invalid response from server: ".concat(String.valueOf((Object)b.e)));
            }
            case 5: {
                this.a = 1;
                break;
            }
            case 4: {
                this.a = 2;
                break;
            }
            case 1:
            case 2:
            case 3: {
                this.a = 3;
                break;
            }
        }
        final int b3 = b.b;
        final int n = b3 - 1;
        if (b3 != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new Z(1, "Invalid response from server.");
                }
                this.b = 2;
            }
            else {
                this.b = 3;
            }
            final String s = (String)b.c;
            p p;
            if (s == null) {
                p = null;
            }
            else {
                p = new p((String)b.d, s);
            }
            ((C2.g)e.F).b.edit().putStringSet("stored_info", (Set)new HashSet((Collection)b.f)).commit();
            for (final A a2 : (List)b.g) {
                final int b4 = a2.b;
                final int n2 = b4 - 1;
                if (b4 == 0) {
                    throw null;
                }
                Object o = null;
                Label_0416: {
                    if (n2 != 0) {
                        if (n2 == 1) {
                            o = "write";
                            break Label_0416;
                        }
                        if (n2 == 2) {
                            o = "clear";
                            break Label_0416;
                        }
                    }
                    o = null;
                }
                if (o == null) {
                    continue;
                }
                final String a3 = a2.a;
                final h h = (h)e.E;
                final Y y = (Y)e.D;
                y.getClass();
                y.a.execute((Runnable)new v(o, (Object)a3, new J[] { (J)h }, 0));
            }
            return new A.g(this.a, this.b, p);
        }
        throw null;
    }
    
    public Object e() {
        synchronized (this) {
            if (this.b == 0) {
                return null;
            }
            return this.i();
        }
    }
    
    public Object f(final long n) {
        monitorenter(this);
        Object i = null;
        Label_0048: {
            try {
                while (this.b > 0 && n - ((long[])this.c)[this.a] >= 0L) {
                    i = this.i();
                }
                break Label_0048;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                return i;
            }
        }
    }
    
    public void g() {
        monitorenter(this);
        try {
            Label_0114: {
                try {
                    final ps ps = (ps)this.d;
                    if (ps.b) {
                        ps.a.X3((byte[])this.c);
                        ((ps)this.d).a.k1(this.a);
                        ((ps)this.d).a.F(this.b);
                        ((ps)this.d).a.z0();
                        ((ps)this.d).a.c();
                        monitorexit(this);
                        return;
                    }
                    break Label_0114;
                }
                finally {
                    monitorexit(this);
                    final Throwable t;
                    Log.d("GASS", "Clearcut log failed", t);
                    monitorexit(this);
                    return;
                    monitorexit(this);
                }
            }
        }
        catch (final RemoteException ex) {}
    }
    
    public void h(final long n, final Object o) {
        g0 g0 = this;
        monitorenter(this);
        Label_0097: {
            try {
                final int b = this.b;
                if (b <= 0 || n > ((long[])this.c)[(this.a + b - 1) % ((Object[])this.d).length]) {
                    break Label_0097;
                }
                g0 = this;
                synchronized (this) {
                    this.a = 0;
                    this.b = 0;
                    Arrays.fill((Object[])this.d, (Object)null);
                }
            }
            finally {
                monitorexit(g0);
                Label_0252: {
                    long[] c = null;
                    Object[] d = null;
                    Label_0235: {
                        while (true) {
                            final int n2;
                            final int a;
                            System.arraycopy((Object)this.c, 0, (Object)c, n2, a);
                            System.arraycopy((Object)this.d, 0, (Object)d, n2, this.a);
                            break Label_0235;
                            final int length;
                            final int n3;
                            Label_0119: {
                                n3 = length + length;
                            }
                            c = new long[n3];
                            d = new Object[n3];
                            final int a2 = this.a;
                            n2 = length - a2;
                            System.arraycopy((Object)this.c, a2, (Object)c, 0, n2);
                            System.arraycopy((Object)this.d, this.a, (Object)d, 0, n2);
                            a = this.a;
                            iftrue(Label_0235:)(a <= 0);
                            continue;
                        }
                        final int length = ((Object[])this.d).length;
                        iftrue(Label_0119:)(this.b >= length);
                        break Label_0252;
                    }
                    this.c = c;
                    this.d = d;
                    this.a = 0;
                }
                final int a3 = this.a;
                final int b2 = this.b;
                final Object[] array = (Object[])this.d;
                final int n4 = (a3 + b2) % array.length;
                ((long[])this.c)[n4] = n;
                array[n4] = o;
                this.b = b2 + 1;
                monitorexit(g0);
            }
        }
    }
    
    public Object i() {
        y7.Y(this.b > 0);
        final Object[] array = (Object[])this.d;
        final int a = this.a;
        final Object o = array[a];
        array[a] = null;
        this.a = (a + 1) % array.length;
        --this.b;
        return o;
    }
}
