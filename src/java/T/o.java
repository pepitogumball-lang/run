package T;

import android.text.PrecomputedText$Params;
import android.widget.TextView;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;

public abstract class o
{
    public static CharSequence a(final PrecomputedText precomputedText) {
        return (CharSequence)precomputedText;
    }
    
    public static String[] b(final DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }
    
    public static PrecomputedText$Params c(final TextView textView) {
        return textView.getTextMetricsParams();
    }
    
    public static void d(final TextView textView, final int firstBaselineToTopHeight) {
        textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
    }
}
