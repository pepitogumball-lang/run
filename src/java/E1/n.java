package E1;

import java.util.concurrent.Future;
import android.webkit.WebView;
import android.net.Uri;
import java.util.Iterator;
import C2.m;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.ads.W4;
import java.util.TreeMap;
import com.google.android.gms.internal.ads.U7;
import android.net.Uri$Builder;
import J1.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.internal.ads.V4;
import com.google.android.gms.ads.internal.zzu;
import android.os.AsyncTask;

public final class n extends AsyncTask
{
    public final zzu a;
    
    public final Object doInBackground(final Object[] array) {
        final Void[] array2 = (Void[])array;
        final zzu a = this.a;
        Label_0062: {
            Label_0056: {
                try {
                    a.J = (V4)((Future)a.E).get(1000L, TimeUnit.MILLISECONDS);
                    break Label_0062;
                }
                catch (final TimeoutException ex) {}
                catch (final ExecutionException ex2) {
                    break Label_0056;
                }
                catch (final InterruptedException ex2) {
                    break Label_0056;
                }
                final TimeoutException ex;
                j.j("", (Throwable)ex);
                break Label_0062;
            }
            final ExecutionException ex2;
            j.j("", (Throwable)ex2);
        }
        a.getClass();
        final Uri$Builder uri$Builder = new Uri$Builder();
        uri$Builder.scheme("https://").appendEncodedPath((String)U7.d.p());
        final m g = a.G;
        uri$Builder.appendQueryParameter("query", (String)g.F);
        uri$Builder.appendQueryParameter("pubId", (String)g.H);
        uri$Builder.appendQueryParameter("mappver", (String)g.I);
        final TreeMap treeMap = (TreeMap)g.E;
        for (final String s : treeMap.keySet()) {
            uri$Builder.appendQueryParameter(s, (String)treeMap.get((Object)s));
        }
        final Uri build = uri$Builder.build();
        final V4 j = a.J;
        Uri d = build;
        if (j != null) {
            try {
                d = V4.d(build, j.b.c(a.F));
            }
            catch (final W4 w4) {
                J1.j.j("Unable to process ad data", (Throwable)w4);
                d = build;
            }
        }
        return L.j(a.q(), "#", d.getEncodedQuery());
    }
}
