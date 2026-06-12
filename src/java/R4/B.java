package R4;

import z0.e;
import android.text.TextUtils;
import f2.d;
import K2.c0;
import io.flutter.plugin.editing.i;
import android.os.Process;
import android.os.Binder;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import y0.a;

public final class b implements a
{
    public final Context C;
    
    public ApplicationInfo a(final int n, final String s) {
        return this.C.getPackageManager().getApplicationInfo(s, n);
    }
    
    public CharSequence b(final String s) {
        final Context c = this.C;
        return c.getPackageManager().getApplicationLabel(c.getPackageManager().getApplicationInfo(s, 0));
    }
    
    public PackageInfo c(final int n, final String s) {
        return this.C.getPackageManager().getPackageInfo(s, n);
    }
    
    public boolean d() {
        final int callingUid = Binder.getCallingUid();
        final int myUid = Process.myUid();
        final Context c = this.C;
        if (callingUid == myUid) {
            return s2.a.h(c);
        }
        if (q2.b.h()) {
            final String nameForUid = c.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return i.t(c.getPackageManager(), nameForUid);
            }
        }
        return false;
    }
    
    @Override
    public y0.b h(final c0 c0) {
        final d d = (d)c0.F;
        if (d == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        final Context c2 = this.C;
        if (c2 == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        final String s = (String)c0.D;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final c0 c3 = new c0(c2, s, d, true);
            return (y0.b)new e((Context)c3.E, (String)c3.D, (d)c3.F, c3.C);
        }
        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
    }
}
