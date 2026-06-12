package C2;

import android.os.BaseBundle;
import android.app.Activity;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;
import android.app.PendingIntent;
import g2.B;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map$Entry;
import android.os.Bundle;
import android.os.Looper;
import g2.l;
import android.graphics.PorterDuff$Mode;
import O.V;
import android.content.res.TypedArray;
import w2.e;
import android.util.AttributeSet;
import android.view.View;
import io.flutter.embedding.android.FlutterActivity;
import android.os.Build$VERSION;
import java.util.Locale;
import S2.a;
import H3.b;
import android.graphics.drawable.Drawable;
import o.p;
import o.d1;
import o.l0;
import android.os.Handler;
import o4.f;
import android.os.HandlerThread;
import android.util.Log;
import android.widget.ImageView;
import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import t.j;
import o4.h;

public final class x implements h
{
    public Object a;
    public int b;
    public Object c;
    
    public x() {
        this.a = Collections.synchronizedMap((Map)new j());
        this.b = 0;
    }
    
    public x(final int b, final String a, final ArrayList c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public x(final Context context) {
        this.a = new ArrayList();
        this.b = 0;
        this.c = context.getApplicationContext();
    }
    
    public x(final ImageView a) {
        this.b = 0;
        this.a = a;
    }
    
    public x(final String a, final String... array) {
        final int length = array.length;
        final int n = 0;
        String string;
        if (length == 0) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (final String s : array) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(s);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.c = string;
        this.a = a;
        int n2 = n;
        if (a.length() <= 23) {
            n2 = 1;
        }
        if (n2 != 0) {
            int b;
            for (b = 2; b <= 7 && !Log.isLoggable((String)this.a, b); ++b) {}
            this.b = b;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", new Object[] { a, 23 }));
    }
    
    @Override
    public void a() {
        final HandlerThread handlerThread = (HandlerThread)this.a;
        if (handlerThread != null) {
            handlerThread.quit();
            this.a = null;
            this.c = null;
        }
    }
    
    @Override
    public void b(final f f) {
        ((Handler)this.c).post(f.b);
    }
    
    public void d() {
        final ImageView imageView = (ImageView)this.a;
        final Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l0.a(drawable);
        }
        if (drawable != null) {
            final d1 d1 = (d1)this.c;
            if (d1 != null) {
                p.d(drawable, d1, ((View)imageView).getDrawableState());
            }
        }
    }
    
    public b e() {
        String s;
        if (this.c == null) {
            s = " tokenExpirationTimestamp";
        }
        else {
            s = "";
        }
        if (s.isEmpty()) {
            return new b((long)this.c, (String)this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(s));
    }
    
    public a f() {
        final boolean c = C.c();
        boolean b = true;
        if (!c) {
            b = (((ArrayList)this.a).contains((Object)C.a((Context)this.c)) && b);
        }
        return new a(b, this);
    }
    
    public void g(final String s, final Object... array) {
        if (this.b <= 3) {
            Log.d((String)this.a, this.h(s, array));
        }
    }
    
    public String h(final String s, final Object... array) {
        String format = s;
        if (array.length > 0) {
            format = String.format(Locale.US, s, array);
        }
        return ((String)this.c).concat(format);
    }
    
    public int i() {
        if (Build$VERSION.SDK_INT < 35) {
            return 2;
        }
        final FlutterActivity flutterActivity = (FlutterActivity)this.a;
        final int b = this.b;
        final View viewById = ((Activity)flutterActivity).findViewById(b);
        if (viewById != null) {
            return J4.a.a(viewById);
        }
        throw new IllegalArgumentException(Y3.a.j(b, "FlutterView with ID ", "not found"));
    }
    
    public void j(final AttributeSet set, int resourceId) {
        final ImageView imageView = (ImageView)this.a;
        final Context context = ((View)imageView).getContext();
        final int[] f = i.a.f;
        final e h = e.H(context, set, f, resourceId);
        V.g((View)imageView, ((View)imageView).getContext(), f, set, (TypedArray)h.E, resourceId);
        Label_0178: {
            TypedArray typedArray;
            try {
                final Drawable drawable = imageView.getDrawable();
                typedArray = (TypedArray)h.E;
                if (drawable == null) {
                    resourceId = typedArray.getResourceId(1, -1);
                    if (resourceId != -1) {
                        final Drawable f2 = s2.a.f(((View)imageView).getContext(), resourceId);
                        final Drawable drawable2;
                        if ((drawable2 = f2) != null) {
                            imageView.setImageDrawable(f2);
                        }
                    }
                }
            }
            finally {
                break Label_0178;
            }
            final Drawable drawable3;
            if (drawable3 != null) {
                l0.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                T.f.c(imageView, h.z(2));
            }
            if (typedArray.hasValue(3)) {
                T.f.d(imageView, l0.c(typedArray.getInt(3, -1), (PorterDuff$Mode)null));
            }
            h.K();
            return;
        }
        h.K();
    }
    
    public void k(final int n) {
        if (Build$VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        final FlutterActivity flutterActivity = (FlutterActivity)this.a;
        final int b = this.b;
        final View viewById = ((Activity)flutterActivity).findViewById(b);
        if (viewById == null) {
            throw new IllegalArgumentException(Y3.a.j(b, "FlutterView with ID ", "not found"));
        }
        if (J4.a.a(viewById) == n) {
            return;
        }
        J4.a.g(viewById, n);
        viewById.invalidate();
    }
    
    public void l(final String s, final Object... array) {
        Log.w((String)this.a, this.h(s, array));
    }
    
    public void m(final l l) {
        final Map map = (Map)this.a;
        if (!map.containsKey((Object)"ConnectionlessLifecycleHelper")) {
            map.put((Object)"ConnectionlessLifecycleHelper", (Object)l);
            if (this.b > 0) {
                new A2.b(Looper.getMainLooper(), 1).post((Runnable)new O2.p(this, l));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
        sb.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void n(final Bundle c) {
        this.b = 1;
        this.c = c;
        for (final Map$Entry map$Entry : ((Map)this.a).entrySet()) {
            final l l = (l)map$Entry.getValue();
            Bundle bundle;
            if (c != null) {
                bundle = c.getBundle((String)map$Entry.getKey());
            }
            else {
                bundle = null;
            }
            l.b(bundle);
        }
    }
    
    public void o(final int n, final int n2, final Intent intent) {
        for (final l l : ((Map)this.a).values()) {
            final B b = (B)l.E.get();
            final g2.e i = l.I;
            final AtomicReference e = l.E;
            if (n != 1) {
                if (n == 2) {
                    final int c = ((e2.f)l.G).c((Context)l.a(), e2.f.a);
                    if (c == 0) {
                        e.set((Object)null);
                        final A2.b p3 = i.P;
                        p3.sendMessage(p3.obtainMessage(3));
                        continue;
                    }
                    if (b == null) {
                        continue;
                    }
                    if (b.b.D == 18 && c == 18) {
                        continue;
                    }
                }
            }
            else {
                if (n2 == -1) {
                    e.set((Object)null);
                    final A2.b p4 = i.P;
                    p4.sendMessage(p4.obtainMessage(3));
                    continue;
                }
                if (n2 == 0) {
                    if (b != null) {
                        int intExtra = 13;
                        if (intent != null) {
                            intExtra = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                        }
                        final e2.b b2 = new e2.b(1, intExtra, (PendingIntent)null, b.b.toString());
                        e.set((Object)null);
                        i.g(b2, b.a);
                        continue;
                    }
                    continue;
                }
            }
            if (b != null) {
                e.set((Object)null);
                i.g(b.b, b.a);
            }
        }
    }
    
    public void p(final Bundle bundle) {
        if (bundle != null) {
            for (final Map$Entry map$Entry : ((Map)this.a).entrySet()) {
                final Bundle bundle2 = new Bundle();
                final B b = (B)((l)map$Entry.getValue()).E.get();
                if (b != null) {
                    ((BaseBundle)bundle2).putBoolean("resolving_error", true);
                    ((BaseBundle)bundle2).putInt("failed_client_id", b.a);
                    final e2.b b2 = b.b;
                    ((BaseBundle)bundle2).putInt("failed_status", b2.D);
                    bundle2.putParcelable("failed_resolution", (Parcelable)b2.E);
                }
                bundle.putBundle((String)map$Entry.getKey(), bundle2);
            }
        }
    }
    
    @Override
    public void start() {
        ((Thread)(this.a = new HandlerThread("Sqflite", this.b))).start();
        this.c = new Handler(((HandlerThread)this.a).getLooper());
    }
}
