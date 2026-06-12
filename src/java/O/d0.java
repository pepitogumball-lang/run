package o;

import android.widget.TextView;
import android.text.StaticLayout$Builder;

public abstract class d0
{
    public abstract void a(final StaticLayout$Builder p0, final TextView p1);
    
    public boolean b(final TextView textView) {
        return (boolean)e0.e(textView, Boolean.FALSE, "getHorizontallyScrolling");
    }
}
