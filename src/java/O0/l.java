package O0;

import java.util.Collection;
import java.util.ArrayList;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import java.util.Iterator;
import android.os.IBinder;
import c5.h;
import android.view.View$OnAttachStateChangeListener;
import java.util.List;
import android.app.Activity;
import L0.i;
import android.content.Context;
import C2.f;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import M0.a;

public final class l implements a
{
    public static volatile l c;
    public static final ReentrantLock d;
    public final j a;
    public final CopyOnWriteArrayList b;
    
    static {
        d = new ReentrantLock();
    }
    
    public l(final j a) {
        this.a = a;
        this.b = new CopyOnWriteArrayList();
        if (a != null) {
            a.h(new f((Object)this, 19));
        }
    }
    
    @Override
    public final void a(final Context context, final p.a a, final i i) {
        final boolean b = context instanceof Activity;
        final L0.l l = null;
        h a2 = null;
        final IBinder binder = null;
        Activity activity;
        if (b) {
            activity = (Activity)context;
        }
        else {
            activity = null;
        }
        final d5.l c = d5.l.C;
        Label_0360: {
            if (activity != null) {
                final ReentrantLock d = O0.l.d;
                d.lock();
                Label_0353: {
                    j a3;
                    try {
                        a3 = this.a;
                        if (a3 == null) {
                            i.accept((Object)new L0.l((List)c));
                            d.unlock();
                            return;
                        }
                    }
                    finally {
                        break Label_0353;
                    }
                    final CopyOnWriteArrayList b2 = this.b;
                    final boolean b3 = false;
                    int n = 0;
                    final Activity obj;
                    Label_0158: {
                        if (b2 != null && b2.isEmpty()) {
                            n = (b3 ? 1 : 0);
                        }
                        else {
                            final Iterator iterator = b2.iterator();
                            do {
                                n = (b3 ? 1 : 0);
                                if (iterator.hasNext()) {
                                    continue;
                                }
                                break Label_0158;
                            } while (!((k)iterator.next()).a.equals(obj));
                            n = 1;
                        }
                    }
                    final k k = new k(obj, a, i);
                    b2.add((Object)k);
                    Label_0340: {
                        if (n != 0) {
                            while (true) {
                                for (final Object next : b2) {
                                    if (obj.equals(((k)next).a)) {
                                        final k j = (k)next;
                                        final k m = j;
                                        L0.l c2 = l;
                                        if (m != null) {
                                            c2 = m.c;
                                        }
                                        if (c2 != null) {
                                            k.c = c2;
                                            k.b.accept((Object)c2);
                                        }
                                        break Label_0340;
                                    }
                                }
                                final k j = null;
                                continue;
                            }
                        }
                        final Window window = obj.getWindow();
                        IBinder token = binder;
                        if (window != null) {
                            final WindowManager$LayoutParams attributes = window.getAttributes();
                            token = binder;
                            if (attributes != null) {
                                token = attributes.token;
                            }
                        }
                        if (token != null) {
                            a3.g(token, obj);
                        }
                        else {
                            obj.getWindow().getDecorView().addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new O0.i(a3, obj));
                        }
                    }
                    d.unlock();
                    a2 = h.a;
                    break Label_0360;
                }
                d.unlock();
            }
        }
        if (a2 == null) {
            i.accept((Object)new L0.l((List)c));
        }
    }
    
    @Override
    public final void b(final i i) {
        final ReentrantLock d;
        monitorenter(d = l.d);
        Label_0208: {
            ArrayList list;
            try {
                if (this.a == null) {
                    monitorexit(d);
                    return;
                }
                list = new ArrayList();
                for (final k k : this.b) {
                    if (k.b == i) {
                        list.add((Object)k);
                    }
                }
            }
            finally {
                break Label_0208;
            }
            this.b.removeAll((Collection)list);
            final Iterator iterator2 = list.iterator();
        Label_0100:
            while (iterator2.hasNext()) {
                final Activity a = ((k)iterator2.next()).a;
                final CopyOnWriteArrayList b = this.b;
                if (b == null || !b.isEmpty()) {
                    final Iterator iterator3 = b.iterator();
                    while (iterator3.hasNext()) {
                        if (((k)iterator3.next()).a.equals(a)) {
                            continue Label_0100;
                        }
                    }
                }
                final j a2 = this.a;
                if (a2 != null) {
                    a2.f(a);
                }
            }
            monitorexit(d);
            return;
        }
        monitorexit(d);
    }
}
