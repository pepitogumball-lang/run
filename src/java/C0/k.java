package c0;

import android.widget.TextView;
import android.view.View;
import a0.g;
import android.text.Editable;
import android.text.Spannable;
import a0.i;
import android.text.Selection;
import android.widget.EditText;
import android.text.TextWatcher;

public final class k implements TextWatcher
{
    public final EditText C;
    public j D;
    public boolean E;
    
    public k(final EditText c) {
        this.C = c;
        this.E = true;
    }
    
    public static void a(final EditText editText, int length) {
        if (length == 1 && editText != null && ((View)editText).isAttachedToWindow()) {
            final Editable editableText = ((TextView)editText).getEditableText();
            final int selectionStart = Selection.getSelectionStart((CharSequence)editableText);
            final int selectionEnd = Selection.getSelectionEnd((CharSequence)editableText);
            final i a = i.a();
            if (editableText == null) {
                length = 0;
            }
            else {
                a.getClass();
                length = ((CharSequence)editableText).length();
            }
            a.e((CharSequence)editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection((Spannable)editableText, selectionStart, selectionEnd);
            }
            else if (selectionStart >= 0) {
                Selection.setSelection((Spannable)editableText, selectionStart);
            }
            else if (selectionEnd >= 0) {
                Selection.setSelection((Spannable)editableText, selectionEnd);
            }
        }
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, int b, final int n2) {
        final EditText c = this.C;
        if (!((View)c).isInEditMode() && this.E && i.j != null && b <= n2 && charSequence instanceof Spannable) {
            b = i.a().b();
            if (b != 0) {
                if (b == 1) {
                    i.a().e(charSequence, n, n2 + n);
                    return;
                }
                if (b != 3) {
                    return;
                }
            }
            final i a = i.a();
            if (this.D == null) {
                this.D = new j(c);
            }
            a.f(this.D);
        }
    }
}
