package x0;

import android.os.BaseBundle;
import androidx.lifecycle.t;
import java.util.Map$Entry;
import q.d;
import n5.h;
import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.n;
import androidx.lifecycle.v;

public final class f
{
    public final g a;
    public final e b;
    public boolean c;
    
    public f(final g a) {
        this.a = a;
        this.b = new e();
    }
    
    public final void a() {
        final g a = this.a;
        final o lifecycle = ((t)a).getLifecycle();
        if (((v)lifecycle).c != n.D) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a((s)new a(a, 0));
        final e b = this.b;
        b.getClass();
        if (!b.b) {
            lifecycle.a((s)new b(b));
            b.b = true;
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }
    
    public final void b(Bundle bundle) {
        if (!this.c) {
            this.a();
        }
        final v v = (v)((t)this.a).getLifecycle();
        if (((Enum)v.c).compareTo((Enum)n.F) >= 0) {
            final StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            sb.append((Object)v.c);
            throw new IllegalStateException(sb.toString().toString());
        }
        final e b = this.b;
        if (!b.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (!b.d) {
            if (bundle != null) {
                bundle = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            else {
                bundle = null;
            }
            b.c = bundle;
            b.d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
    
    public final void c(final Bundle bundle) {
        h.e("outBundle", (Object)bundle);
        final e b = this.b;
        b.getClass();
        final Bundle bundle2 = new Bundle();
        final Bundle c = b.c;
        if (c != null) {
            bundle2.putAll(c);
        }
        final q.f a = b.a;
        a.getClass();
        final d d = new d(a);
        a.E.put((Object)d, (Object)Boolean.FALSE);
        while (d.hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)d.next();
            bundle2.putBundle((String)map$Entry.getKey(), ((x0.d)map$Entry.getValue()).a());
        }
        if (!((BaseBundle)bundle2).isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
