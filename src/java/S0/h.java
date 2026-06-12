package S0;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import z0.b;
import android.content.Context;
import v0.a;

public final class h extends a
{
    public final int c;
    public final Context d;
    
    public h(final Context d) {
        this.c = 1;
        super(9, 10);
        this.d = d;
    }
    
    public h(final Context d, final int n, final int n2) {
        this.c = 0;
        super(n, n2);
        this.d = d;
    }
    
    @Override
    public final void a(final b b) {
        switch (this.c) {
            default: {
                b.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                final Context d = this.d;
                final SharedPreferences sharedPreferences = d.getSharedPreferences("androidx.work.util.preferences", 0);
                final boolean contains = sharedPreferences.contains("reschedule_needed");
                final SQLiteDatabase sqLiteDatabase = (SQLiteDatabase)b.D;
                Label_0191: {
                    if (!contains && !sharedPreferences.contains("last_cancel_all_time_ms")) {
                        break Label_0191;
                    }
                    long n = 0L;
                    final long long1 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        n = 1L;
                    }
                    b.a();
                    try {
                        sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "last_cancel_all_time_ms", long1 });
                        sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", n });
                        sharedPreferences.edit().clear().apply();
                        b.k();
                        b.g();
                        final SharedPreferences sharedPreferences2 = d.getSharedPreferences("androidx.work.util.id", 0);
                        if (!sharedPreferences2.contains("next_job_scheduler_id") && !sharedPreferences2.contains("next_job_scheduler_id")) {
                            return;
                        }
                        final int int1 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                        final int int2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                        b.a();
                        try {
                            sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_job_scheduler_id", int1 });
                            sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_alarm_manager_id", int2 });
                            sharedPreferences2.edit().clear().apply();
                            b.k();
                        }
                        finally {
                            b.g();
                        }
                    }
                    finally {
                        b.g();
                    }
                }
            }
            case 0: {
                if (super.b >= 10) {
                    ((SQLiteDatabase)b.D).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", 1 });
                }
                else {
                    this.d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                }
            }
        }
    }
}
