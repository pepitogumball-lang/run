package T;

import android.content.ClipData$Item;
import android.content.Context;
import android.content.ClipData;
import O.f;
import android.text.Spannable;
import android.text.Selection;
import android.text.Spanned;
import android.text.Editable;
import android.widget.TextView;
import android.util.Log;
import O.g;
import android.view.View;
import O.x;

public final class q implements x
{
    public final g a(final View view, final g g) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            final StringBuilder sb = new StringBuilder("onReceive: ");
            sb.append((Object)g);
            Log.d("ReceiveContent", sb.toString());
        }
        if (g.a.l() == 2) {
            return g;
        }
        final f a = g.a;
        final ClipData c = a.c();
        final int h = a.h();
        final TextView textView = (TextView)view;
        final Editable editable = (Editable)textView.getText();
        final Context context = ((View)textView).getContext();
        int i = 0;
        int n = 0;
        while (i < c.getItemCount()) {
            final ClipData$Item item = c.getItemAt(i);
            Object o;
            if ((h & 0x1) != 0x0) {
                final CharSequence charSequence = (CharSequence)(o = item.coerceToText(context));
                if (charSequence instanceof Spanned) {
                    o = charSequence.toString();
                }
            }
            else {
                o = item.coerceToStyledText(context);
            }
            int n2 = n;
            if (o != null) {
                if (n == 0) {
                    final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                    final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                    final int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    final int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection((Spannable)editable, max2);
                    editable.replace(max, max2, (CharSequence)o);
                    n2 = 1;
                }
                else {
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)"\n");
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)o);
                    n2 = n;
                }
            }
            ++i;
            n = n2;
        }
        return null;
    }
}
