package z0;

import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteStatement;

public final class f extends b
{
    public final SQLiteStatement F;
    
    public f(final SQLiteStatement f) {
        super((SQLiteClosable)f, 1);
        this.F = f;
    }
    
    public final void l() {
        this.F.executeUpdateDelete();
    }
}
