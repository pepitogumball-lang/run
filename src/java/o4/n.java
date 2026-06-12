package O4;

import android.content.Intent;
import android.content.ComponentName;

public abstract class n
{
    public final ComponentName a;
    public boolean b;
    public int c;
    
    public n(final ComponentName a) {
        this.a = a;
    }
    
    public abstract void a(final Intent p0);
    
    public final void b(final int c) {
        if (!this.b) {
            this.b = true;
            this.c = c;
        }
        else if (this.c != c) {
            final StringBuilder sb = new StringBuilder("Given job ID ");
            sb.append(c);
            sb.append(" is different than previous ");
            sb.append(this.c);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    public void c() {
    }
    
    public void d() {
    }
    
    public void e() {
    }
}
