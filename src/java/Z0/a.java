package z0;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteClosable;
import android.database.Cursor;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import y0.c;
import android.database.sqlite.SQLiteDatabase$CursorFactory;

public final class a implements SQLiteDatabase$CursorFactory
{
    public final c a;
    
    public a(final c a) {
        this.a = a;
    }
    
    public final Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
        this.a.b(new b((SQLiteClosable)sqLiteQuery, 1));
        return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
    }
}
