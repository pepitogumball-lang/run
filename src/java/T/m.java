package T;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;

public abstract class m
{
    public static int a(final TextView textView) {
        return textView.getBreakStrategy();
    }
    
    public static ColorStateList b(final TextView textView) {
        return textView.getCompoundDrawableTintList();
    }
    
    public static PorterDuff$Mode c(final TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }
    
    public static int d(final TextView textView) {
        return textView.getHyphenationFrequency();
    }
    
    public static void e(final TextView textView, final int breakStrategy) {
        textView.setBreakStrategy(breakStrategy);
    }
    
    public static void f(final TextView textView, final ColorStateList compoundDrawableTintList) {
        textView.setCompoundDrawableTintList(compoundDrawableTintList);
    }
    
    public static void g(final TextView textView, final PorterDuff$Mode compoundDrawableTintMode) {
        textView.setCompoundDrawableTintMode(compoundDrawableTintMode);
    }
    
    public static void h(final TextView textView, final int hyphenationFrequency) {
        textView.setHyphenationFrequency(hyphenationFrequency);
    }
}
