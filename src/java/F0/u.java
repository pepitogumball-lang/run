package F0;

import java.util.Iterator;
import android.webkit.WebResourceResponse;
import android.net.Uri;
import java.util.ArrayList;

public final class u
{
    public final ArrayList a;
    
    public u(final ArrayList a) {
        this.a = a;
    }
    
    public final WebResourceResponse a(final Uri uri) {
        final Iterator iterator = this.a.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            s d = null;
            if (!hasNext) {
                return null;
            }
            final t t = (t)iterator.next();
            t.getClass();
            final boolean equals = uri.getScheme().equals((Object)"http");
            final String c = t.c;
            if (!equals || t.a) {
                if (uri.getScheme().equals((Object)"http") || uri.getScheme().equals((Object)"https")) {
                    if (uri.getAuthority().equals((Object)t.b)) {
                        if (uri.getPath().startsWith(c)) {
                            d = t.d;
                        }
                    }
                }
            }
            if (d == null) {
                continue;
            }
            final WebResourceResponse handle = d.handle(uri.getPath().replaceFirst(c, ""));
            if (handle == null) {
                continue;
            }
            return handle;
        }
    }
}
