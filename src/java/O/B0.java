package o;

import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;
import android.text.StaticLayout$Builder;

public class b0 extends d0
{
    @Override
    public void a(final StaticLayout$Builder staticLayout$Builder, final TextView textView) {
        staticLayout$Builder.setTextDirection((TextDirectionHeuristic)e0.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
