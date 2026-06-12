package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

public final class v extends ContextWrapper
{
    public final E a;
    public E b;
    public final Context c;
    
    public v(final Context context, final E a, final Context c) {
        super(context);
        this.a = a;
        this.c = c;
    }
    
    public final Object getSystemService(final String s) {
        if ("window".equals((Object)s)) {
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int n = 0; n < stackTrace.length && n < 11; ++n) {
                if (stackTrace[n].getClassName().equals((Object)AlertDialog.class.getCanonicalName()) && stackTrace[n].getMethodName().equals((Object)"<init>")) {
                    return this.c.getSystemService(s);
                }
            }
            if (this.b == null) {
                this.b = this.a;
            }
            return this.b;
        }
        return super.getSystemService(s);
    }
}
