package c0;

import android.view.View;
import java.lang.ref.Reference;
import android.text.Spannable;
import android.text.Selection;
import a0.i;
import android.text.InputFilter;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import a0.g;

public final class d extends g
{
    public final WeakReference a;
    public final WeakReference b;
    
    public d(final TextView textView, final e e) {
        this.a = new WeakReference((Object)textView);
        this.b = new WeakReference((Object)e);
    }
    
    @Override
    public final void b() {
        final TextView textView = (TextView)((Reference)this.a).get();
        final InputFilter inputFilter = (InputFilter)((Reference)this.b).get();
        if (inputFilter != null) {
            if (textView != null) {
                final InputFilter[] filters = textView.getFilters();
                if (filters != null) {
                    for (int i = 0; i < filters.length; ++i) {
                        if (filters[i] == inputFilter) {
                            if (((View)textView).isAttachedToWindow()) {
                                final CharSequence text = textView.getText();
                                final i a = i.a();
                                int length;
                                if (text == null) {
                                    length = 0;
                                }
                                else {
                                    a.getClass();
                                    length = text.length();
                                }
                                final CharSequence e = a.e(text, 0, length);
                                if (text == e) {
                                    return;
                                }
                                final int selectionStart = Selection.getSelectionStart(e);
                                final int selectionEnd = Selection.getSelectionEnd(e);
                                textView.setText(e);
                                if (e instanceof Spannable) {
                                    final Spannable spannable = (Spannable)e;
                                    if (selectionStart >= 0 && selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    }
                                    else if (selectionStart >= 0) {
                                        Selection.setSelection(spannable, selectionStart);
                                    }
                                    else if (selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionEnd);
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
