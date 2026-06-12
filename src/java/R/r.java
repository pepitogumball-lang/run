package r;

import android.os.BaseBundle;
import android.os.Parcelable;
import android.net.Uri;
import android.os.RemoteException;
import b.c;
import android.os.Bundle;
import android.content.ComponentName;
import b.d;

public final class r
{
    public final Object a;
    public final d b;
    public final f c;
    public final ComponentName d;
    
    public r(final d b, final f c, final ComponentName d) {
        this.a = new Object();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Bundle a(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }
    
    public final boolean b(Bundle a) {
        a = this.a(a);
        try {
            return ((c)this.b).i5(this.c, a);
        }
        catch (final SecurityException ex) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", (Throwable)ex);
        }
    }
    
    public final int c(final String s, final Bundle bundle) {
        final Bundle a = this.a(bundle);
        final Object a2;
        monitorenter(a2 = this.a);
        try {
            try {
                final int t2 = ((c)this.b).t2(this.c, s, a);
                monitorexit(a2);
                return t2;
            }
            finally {
                monitorexit(a2);
            }
        }
        catch (final RemoteException ex) {}
    }
    
    public final boolean d(final Uri uri, final Uri uri2, final Bundle bundle) {
        try {
            final Bundle bundle2 = new Bundle();
            if (uri2 != null) {
                bundle2.putParcelable("target_origin", (Parcelable)uri2);
            }
            final boolean empty = ((BaseBundle)bundle2).isEmpty();
            Bundle bundle3 = bundle2;
            if (empty) {
                bundle3 = null;
            }
            final f c = this.c;
            final d b = this.b;
            if (bundle3 != null) {
                bundle.putAll(bundle3);
                return ((c)b).h2(c, uri, bundle);
            }
            return ((c)b).y4(c, uri);
        }
        catch (final RemoteException ex) {
            return false;
        }
    }
}
