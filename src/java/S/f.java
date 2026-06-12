package S;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class f implements g
{
    public final InputContentInfo C;
    
    public f(final Uri uri, final ClipDescription clipDescription, final Uri uri2) {
        this.C = new InputContentInfo(uri, clipDescription, uri2);
    }
    
    public f(final Object o) {
        this.C = (InputContentInfo)o;
    }
    
    @Override
    public final Object f() {
        return this.C;
    }
    
    @Override
    public final Uri g() {
        return this.C.getContentUri();
    }
    
    @Override
    public final ClipDescription getDescription() {
        return this.C.getDescription();
    }
    
    @Override
    public final void k() {
        this.C.requestPermission();
    }
    
    @Override
    public final Uri n() {
        return this.C.getLinkUri();
    }
}
