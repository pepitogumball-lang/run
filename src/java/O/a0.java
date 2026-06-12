package o;

import android.util.Log;
import android.text.StaticLayout$Builder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import android.text.Layout$Alignment;

public abstract class a0
{
    public static StaticLayout a(CharSequence obtain, final Layout$Alignment alignment, int maxLines, final int n, final TextView textView, final TextPaint textPaint, final d0 d0) {
        obtain = (CharSequence)StaticLayout$Builder.obtain(obtain, 0, obtain.length(), textPaint, maxLines);
        final StaticLayout$Builder setHyphenationFrequency = ((StaticLayout$Builder)obtain).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        maxLines = n;
        if (n == -1) {
            maxLines = Integer.MAX_VALUE;
        }
        setHyphenationFrequency.setMaxLines(maxLines);
        try {
            d0.a((StaticLayout$Builder)obtain, textView);
        }
        catch (final ClassCastException ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return ((StaticLayout$Builder)obtain).build();
    }
}
