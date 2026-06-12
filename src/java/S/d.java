package S;

import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputConnection;
import E4.b;
import android.view.inputmethod.InputConnectionWrapper;

public final class d extends InputConnectionWrapper
{
    public final b a;
    
    public d(final InputConnection inputConnection, final b a) {
        this.a = a;
        super(inputConnection, false);
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
        C2.b b = null;
        if (inputContentInfo != null) {
            if (Build$VERSION.SDK_INT >= 25) {
                b = new C2.b((Object)new f(inputContentInfo), 26);
            }
        }
        return this.a.h(b, n, bundle) || super.commitContent(inputContentInfo, n, bundle);
    }
}
