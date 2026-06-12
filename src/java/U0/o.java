package u0;

import android.database.sqlite.SQLiteDatabase;
import z0.f;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class o
{
    public final AtomicBoolean a;
    public final l b;
    public volatile f c;
    
    public o(final l b) {
        this.a = new AtomicBoolean(false);
        this.b = b;
    }
    
    public final f a() {
        this.b.a();
        f c;
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                final String b = this.b();
                final l b2 = this.b;
                b2.a();
                b2.b();
                this.c = new f(((SQLiteDatabase)b2.c.e().D).compileStatement(b));
            }
            c = this.c;
        }
        else {
            final String b3 = this.b();
            final l b4 = this.b;
            b4.a();
            b4.b();
            c = new f(((SQLiteDatabase)b4.c.e().D).compileStatement(b3));
        }
        return c;
    }
    
    public abstract String b();
    
    public final void c(final f f) {
        if (f == this.c) {
            this.a.set(false);
        }
    }
}
