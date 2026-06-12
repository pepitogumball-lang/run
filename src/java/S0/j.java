package S0;

import java.util.Iterator;
import java.io.File;
import java.util.HashMap;
import android.content.Context;
import R0.m;

public abstract class j
{
    public static final String a;
    public static final String[] b;
    
    static {
        a = m.h("WrkDbPathHelper");
        b = new String[] { "-journal", "-shm", "-wal" };
    }
    
    public static void a(final Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            final m e = m.e();
            final String a = j.a;
            e.c(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            final HashMap hashMap = new HashMap();
            final File databasePath = context.getDatabasePath("androidx.work.workdb");
            final File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put((Object)databasePath, (Object)file);
            for (final String s : j.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append(databasePath.getPath());
                sb.append(s);
                final File file2 = new File(sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(file.getPath());
                sb2.append(s);
                hashMap.put((Object)file2, (Object)new File(sb2.toString()));
            }
            for (final File file3 : hashMap.keySet()) {
                final File file4 = (File)hashMap.get((Object)file3);
                if (file3.exists() && file4 != null) {
                    if (file4.exists()) {
                        m.e().i(a, String.format("Over-writing contents of %s", new Object[] { file4 }), new Throwable[0]);
                    }
                    String s2;
                    if (file3.renameTo(file4)) {
                        s2 = String.format("Migrated %s to %s", new Object[] { file3, file4 });
                    }
                    else {
                        s2 = String.format("Renaming %s to %s failed", new Object[] { file3, file4 });
                    }
                    m.e().c(a, s2, new Throwable[0]);
                }
            }
        }
    }
}
