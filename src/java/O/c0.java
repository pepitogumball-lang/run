package o;

import io.flutter.plugin.platform.p;
import android.widget.TextView;
import android.text.StaticLayout$Builder;

public final class c0 extends b0
{
    @Override
    public void a(final StaticLayout$Builder staticLayout$Builder, final TextView textView) {
        staticLayout$Builder.setTextDirection(p.d(textView));
    }
    
    @Override
    public boolean b(final TextView textView) {
        return p.j(textView);
    }
}
