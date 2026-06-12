package O2;

import K2.N0;
import java.util.concurrent.CancellationException;
import h2.A;
import java.util.concurrent.Executor;

public final class t extends i
{
    public final Object a;
    public final r b;
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;
    
    public t() {
        this.a = new Object();
        this.b = new r(0);
    }
    
    @Override
    public final t a(final Executor executor, final c c) {
        this.b.c(new o(executor, c));
        this.t();
        return this;
    }
    
    @Override
    public final t b(final Executor executor, final d d) {
        this.b.c(new o(executor, d));
        this.t();
        return this;
    }
    
    @Override
    public final t c(final Executor executor, final e e) {
        this.b.c(new o(executor, e));
        this.t();
        return this;
    }
    
    @Override
    public final t d(final Executor executor, final f f) {
        this.b.c(new o(executor, f));
        this.t();
        return this;
    }
    
    @Override
    public final t e(final Executor executor, final a a) {
        final t t = new t();
        this.b.c(new n(executor, a, t, 1));
        this.t();
        return t;
    }
    
    @Override
    public final Exception f() {
        final Object a = this.a;
        synchronized (a) {
            return this.f;
        }
    }
    
    @Override
    public final Object g() {
        final Object a;
        monitorenter(a = this.a);
        try {
            A.j("Task is not yet complete", this.c);
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            final Exception f = this.f;
            if (f == null) {
                final Object e = this.e;
                monitorexit(a);
                return e;
            }
            throw new RuntimeException((Throwable)f);
        }
        finally {
            monitorexit(a);
            throw new CancellationException("Task is already canceled.");
        }
    }
    
    @Override
    public final Object h(final Class clazz) {
        final Object a;
        monitorenter(a = this.a);
        try {
            A.j("Task is not yet complete", this.c);
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (clazz.isInstance(this.f)) {
                throw (Throwable)clazz.cast(this.f);
            }
            final Exception f = this.f;
            if (f == null) {
                final Object e = this.e;
                monitorexit(a);
                return e;
            }
            throw new RuntimeException((Throwable)f);
        }
        finally {
            monitorexit(a);
            throw new CancellationException("Task is already canceled.");
        }
    }
    
    @Override
    public final boolean i() {
        final Object a = this.a;
        synchronized (a) {
            return this.c;
        }
    }
    
    @Override
    public final boolean j() {
        final Object a;
        monitorenter(a = this.a);
        Label_0053: {
            try {
                final boolean c = this.c;
                boolean b2;
                final boolean b = b2 = false;
                if (!c) {
                    break Label_0053;
                }
                b2 = b;
                if (this.d) {
                    break Label_0053;
                }
                b2 = b;
                if (this.f == null) {
                    b2 = true;
                }
                break Label_0053;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
                return;
            }
        }
    }
    
    public final t k(final d d) {
        this.b.c(new o((Executor)k.a, d));
        this.t();
        return this;
    }
    
    public final t l(final Executor executor, final a a) {
        final t t = new t();
        this.b.c(new n(executor, a, t, 0));
        this.t();
        return t;
    }
    
    public final t m(final h h) {
        final N0 a = k.a;
        final t t = new t();
        this.b.c(new o((Executor)a, h, t));
        this.t();
        return t;
    }
    
    public final t n(final Executor executor, final h h) {
        final t t = new t();
        this.b.c(new o(executor, h, t));
        this.t();
        return t;
    }
    
    public final void o(final Object e) {
        final Object a = this.a;
        synchronized (a) {
            this.s();
            this.c = true;
            this.e = e;
            monitorexit(a);
            this.b.d(this);
        }
    }
    
    public final boolean p(final Object e) {
        final Object a;
        monitorenter(a = this.a);
        Label_0024: {
            try {
                if (this.c) {
                    monitorexit(a);
                    return false;
                }
                break Label_0024;
            }
            finally {
                monitorexit(a);
                this.c = true;
                this.e = e;
                monitorexit(a);
                this.b.d(this);
                return true;
            }
        }
    }
    
    public final void q(final Exception f) {
        A.i("Exception must not be null", (Object)f);
        final Object a = this.a;
        synchronized (a) {
            this.s();
            this.c = true;
            this.f = f;
            monitorexit(a);
            this.b.d(this);
        }
    }
    
    public final void r() {
        final Object a;
        monitorenter(a = this.a);
        Label_0023: {
            try {
                if (this.c) {
                    monitorexit(a);
                    return;
                }
                break Label_0023;
            }
            finally {
                monitorexit(a);
                this.c = true;
                this.d = true;
                monitorexit(a);
                this.b.d(this);
            }
        }
    }
    
    public final void s() {
        if (this.c) {
            final int c = O2.b.C;
            IllegalStateException ex;
            if (this.i()) {
                final Exception f = this.f();
                String concat;
                if (f == null) {
                    if (!this.j()) {
                        if (this.d) {
                            concat = "cancellation";
                        }
                        else {
                            concat = "unknown issue";
                        }
                    }
                    else {
                        concat = "result ".concat(String.valueOf(this.g()));
                    }
                }
                else {
                    concat = "failure";
                }
                ex = new IllegalStateException("Complete with: ".concat(concat), (Throwable)f);
            }
            else {
                ex = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw ex;
        }
    }
    
    public final void t() {
        final Object a;
        monitorenter(a = this.a);
        Label_0023: {
            try {
                if (!this.c) {
                    monitorexit(a);
                    return;
                }
                break Label_0023;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
                this.b.d(this);
            }
        }
    }
}
