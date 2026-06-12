package K2;

import android.content.SharedPreferences$Editor;
import h2.A;

public final class b0
{
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final a0 e;
    
    public b0(final a0 e, final String a, final long b) {
        this.e = e;
        A.e(a);
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.D().getLong(this.a, this.b);
        }
        return this.d;
    }
    
    public final void b(final long d) {
        final SharedPreferences$Editor edit = this.e.D().edit();
        edit.putLong(this.a, d);
        edit.apply();
        this.d = d;
    }
}
