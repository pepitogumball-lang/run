package c0;

import android.widget.TextView;
import android.os.BaseBundle;
import android.text.Editable;
import a0.f;
import java.nio.ByteBuffer;
import com.google.android.gms.internal.ads.Rc;
import android.os.Bundle;
import a0.i;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.view.inputmethod.InputConnectionWrapper;

public final class c extends InputConnectionWrapper
{
    public final EditText a;
    public final b b;
    
    public c(final EditText a, final InputConnection inputConnection, final EditorInfo editorInfo) {
        final Object b = new Object();
        super(inputConnection, false);
        this.a = a;
        this.b = (b)b;
        if (i.j != null) {
            final i a2 = i.a();
            if (a2.b() == 1) {
                if (editorInfo != null) {
                    if (editorInfo.extras == null) {
                        editorInfo.extras = new Bundle();
                    }
                    final f e = a2.e;
                    e.getClass();
                    final Bundle extras = editorInfo.extras;
                    final b0.b b2 = (b0.b)((Rc)e.b).D;
                    final int a3 = b2.a(4);
                    int int1;
                    if (a3 != 0) {
                        int1 = ((ByteBuffer)b2.d).getInt(a3 + b2.a);
                    }
                    else {
                        int1 = 0;
                    }
                    ((BaseBundle)extras).putInt("android.support.text.emoji.emojiCompat_metadataVersion", int1);
                    final Bundle extras2 = editorInfo.extras;
                    e.c.getClass();
                    ((BaseBundle)extras2).putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
                }
            }
        }
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        final Editable editableText = ((TextView)this.a).getEditableText();
        this.b.getClass();
        boolean b = false;
        if (c0.b.p(this, editableText, n, n2, false) || super.deleteSurroundingText(n, n2)) {
            b = true;
        }
        return b;
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        final Editable editableText = ((TextView)this.a).getEditableText();
        this.b.getClass();
        boolean b = true;
        if (!c0.b.p(this, editableText, n, n2, true)) {
            b = (super.deleteSurroundingTextInCodePoints(n, n2) && b);
        }
        return b;
    }
}
