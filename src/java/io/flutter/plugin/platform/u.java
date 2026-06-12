package io.flutter.plugin.platform;

import android.view.Display;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.content.ContextWrapper;

public final class u extends ContextWrapper
{
    public final InputMethodManager a;
    
    public u(final Context context, InputMethodManager a) {
        super(context);
        if (a == null) {
            a = (InputMethodManager)context.getSystemService("input_method");
        }
        this.a = a;
    }
    
    public final Context createDisplayContext(final Display display) {
        return (Context)new u(super.createDisplayContext(display), this.a);
    }
    
    public final Object getSystemService(final String s) {
        if ("input_method".equals((Object)s)) {
            return this.a;
        }
        return super.getSystemService(s);
    }
}
