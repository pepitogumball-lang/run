package c4;

import android.content.SharedPreferences;
import java.util.Date;

public final class l
{
    public static final Date e;
    public static final Date f;
    public final SharedPreferences a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    static {
        e = new Date(-1L);
        f = new Date(-1L);
    }
    
    public l(final SharedPreferences a) {
        this.a = a;
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
    }
    
    public final k a() {
        final Object c = this.c;
        synchronized (c) {
            final int int1 = this.a.getInt("num_failed_fetches", 0);
            final Date b = new Date(this.a.getLong("backoff_end_time_in_millis", -1L));
            final Object o = new Object();
            ((k)o).a = int1;
            ((k)o).b = b;
            return (k)o;
        }
    }
    
    public final k b() {
        final Object d = this.d;
        synchronized (d) {
            final int int1 = this.a.getInt("num_failed_realtime_streams", 0);
            final Date b = new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L));
            final Object o = new Object();
            ((k)o).a = int1;
            ((k)o).b = b;
            return (k)o;
        }
    }
    
    public final void c(final int n, final Date date) {
        final Object c = this.c;
        synchronized (c) {
            this.a.edit().putInt("num_failed_fetches", n).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
    
    public final void d(final int n, final Date date) {
        final Object d = this.d;
        synchronized (d) {
            this.a.edit().putInt("num_failed_realtime_streams", n).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
