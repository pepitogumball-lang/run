package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import v4.l;
import android.view.inputmethod.BaseInputConnection;

public final class d extends BaseInputConnection
{
    public final f a;
    
    public d(final l l, final f a) {
        this.a = a;
        super((View)l, true);
    }
    
    public final Editable getEditable() {
        return (Editable)this.a;
    }
}
