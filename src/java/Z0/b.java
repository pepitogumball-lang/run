package z0;

import android.database.sqlite.SQLiteDatabase$CursorFactory;
import y0.c;
import F1.c0;
import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteClosable;
import java.io.Closeable;

public class b implements Closeable
{
    public static final String[] E;
    public final int C;
    public final SQLiteClosable D;
    
    static {
        E = new String[0];
    }
    
    public void a() {
        ((SQLiteDatabase)this.D).beginTransaction();
    }
    
    public void b(final int n, final byte[] array) {
        ((SQLiteProgram)this.D).bindBlob(n, array);
    }
    
    public void c(final long n, final int n2) {
        ((SQLiteProgram)this.D).bindLong(n2, n);
    }
    
    public final void close() {
        switch (this.C) {
            default: {
                ((SQLiteClosable)this.D).close();
                return;
            }
            case 0: {
                ((SQLiteClosable)this.D).close();
            }
        }
    }
    
    public void d(final int n) {
        ((SQLiteProgram)this.D).bindNull(n);
    }
    
    public void f(final int n, final String s) {
        ((SQLiteProgram)this.D).bindString(n, s);
    }
    
    public void g() {
        ((SQLiteDatabase)this.D).endTransaction();
    }
    
    public void h(final String s) {
        ((SQLiteDatabase)this.D).execSQL(s);
    }
    
    public Cursor i(final String s) {
        return this.j((c)new c0(s, 2));
    }
    
    public Cursor j(final c c) {
        return ((SQLiteDatabase)this.D).rawQueryWithFactory((SQLiteDatabase$CursorFactory)new a(c), c.a(), b.E, (String)null);
    }
    
    public void k() {
        ((SQLiteDatabase)this.D).setTransactionSuccessful();
    }
}
