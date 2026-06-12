package c0;

import a0.s;
import android.text.Editable;
import android.text.Editable$Factory;

public final class a extends Editable$Factory
{
    public static final Object a;
    public static volatile a b;
    public static Class c;
    
    static {
        a = new Object();
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class c = c0.a.c;
        if (c != null) {
            return (Editable)new s(c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
