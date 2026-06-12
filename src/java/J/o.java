package j;

import java.lang.ref.Reference;
import android.os.BaseBundle;
import m.b;
import m.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import t.f;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.content.Context;
import O2.s;
import t.c;
import K.i;

public abstract class o
{
    public static final E C;
    public static final int D;
    public static i E;
    public static i F;
    public static Boolean G;
    public static boolean H;
    public static final c I;
    public static final Object J;
    public static final Object K;
    
    static {
        C = new E(new s(2));
        D = -100;
        o.E = null;
        o.F = null;
        o.G = null;
        o.H = false;
        I = new c(0);
        J = new Object();
        K = new Object();
    }
    
    public static boolean d(final Context context) {
        if (o.G == null) {
            try {
                final int c = j.D.C;
                final Bundle metaData = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class)D.class), j.C.a() | 0x80).metaData;
                if (metaData != null) {
                    o.G = ((BaseBundle)metaData).getBoolean("autoStoreLocales");
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                o.G = Boolean.FALSE;
            }
        }
        return o.G;
    }
    
    public static void h(final y y) {
        final Object j;
        monitorenter(j = o.J);
        Label_0065: {
            try {
                final Iterator iterator = o.I.iterator();
                while (true) {
                    final f f = (f)iterator;
                    if (!f.hasNext()) {
                        break Label_0065;
                    }
                    final o o = (o)((Reference)f.next()).get();
                    if (o != y && o != null) {
                        continue;
                    }
                    f.remove();
                }
            }
            finally {
                monitorexit(j);
                monitorexit(j);
            }
        }
    }
    
    public abstract void a();
    
    public abstract void b();
    
    public abstract void e();
    
    public abstract void g();
    
    public abstract boolean i(final int p0);
    
    public abstract void j(final int p0);
    
    public abstract void k(final View p0);
    
    public abstract void l(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void m(final CharSequence p0);
    
    public abstract b n(final a p0);
}
