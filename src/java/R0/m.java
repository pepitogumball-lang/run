package R0;

import H1.j;
import com.google.android.gms.internal.ads.QD;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.content.Context;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.PD;
import u2.b;
import com.google.android.gms.internal.ads.Mj;
import com.google.android.gms.internal.ads.Wh;

public final class m implements Wh, Mj, b
{
    public static m E;
    public final int C;
    public int D = d;
    
    public m(final int c) {
        switch (this.C = c) {
            default: {
                return;
            }
            case 12: {
                this.D = 0;
            }
        }
    }
    
    public static m e() {
        final Class<m> clazz;
        monitorenter(clazz = m.class);
        Label_0032: {
            try {
                if (m.E == null) {
                    m.E = new m(3, 0);
                }
                break Label_0032;
            }
            finally {
                monitorexit(clazz);
                final m e = m.E;
                monitorexit(clazz);
                return e;
            }
        }
    }
    
    public static String h(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(s.substring(0, 20));
        }
        else {
            sb.append(s);
        }
        return sb.toString();
    }
    
    public int a(final Context context, final String s, final boolean b) {
        return 0;
    }
    
    public Character b(int n) {
        char c = (char)n;
        char c2;
        if ((Integer.MIN_VALUE & n) != 0x0) {
            final int d = n & Integer.MAX_VALUE;
            n = this.D;
            if (n != 0) {
                this.D = KeyCharacterMap.getDeadChar(n, d);
                c2 = c;
            }
            else {
                this.D = d;
                c2 = c;
            }
        }
        else {
            final int d2 = this.D;
            c2 = c;
            if (d2 != 0) {
                n = KeyCharacterMap.getDeadChar(d2, n);
                if (n > 0) {
                    c = (char)n;
                }
                this.D = 0;
                c2 = c;
            }
        }
        return c2;
    }
    
    public void c(final String s, final String s2, final Throwable... array) {
        if (this.D <= 3) {
            if (array.length >= 1) {
                Log.d(s, s2, array[0]);
            }
            else {
                Log.d(s, s2);
            }
        }
    }
    
    public void d(final String s, final String s2, final Throwable... array) {
        if (this.D <= 6) {
            if (array.length >= 1) {
                Log.e(s, s2, array[0]);
            }
            else {
                Log.e(s, s2);
            }
        }
    }
    
    public int f(final Context context, final String s) {
        return this.D;
    }
    
    public void g(final String s, final String s2, final Throwable... array) {
        if (this.D <= 4) {
            if (array.length >= 1) {
                Log.i(s, s2, array[0]);
            }
            else {
                Log.i(s, s2);
            }
        }
    }
    
    public void i(final String s, final String s2, final Throwable... array) {
        if (this.D <= 5) {
            if (array.length >= 1) {
                Log.w(s, s2, array[0]);
            }
            else {
                Log.w(s, s2);
            }
        }
    }
    
    public void k(final Object o) {
        switch (this.C) {
            default: {
                ((QD)o).k(this.D);
                return;
            }
            case 8: {
                ((QD)o).G(this.D);
                return;
            }
            case 7: {
                ((QD)o).r0(this.D);
                return;
            }
            case 3: {
                ((j)o).e0(this.D);
            }
        }
    }
}
