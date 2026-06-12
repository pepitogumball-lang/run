package a5;

import android.os.Trace;
import com.google.android.gms.internal.auth.m;

public abstract class a implements AutoCloseable
{
    public static String a(String string) {
        if (string.length() >= 124) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string.substring(0, 124));
            sb.append("...");
            string = sb.toString();
        }
        return string;
    }
    
    public static void b(final String s) {
        Trace.beginSection(m.D(a(s)));
    }
}
