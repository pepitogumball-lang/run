package i4;

import java.util.Map;
import g4.Y;
import m5.p;
import w5.v;
import java.util.LinkedHashMap;
import d5.o;
import android.os.Build$VERSION;
import java.util.Arrays;
import android.os.Build;
import g4.r;
import android.util.Log;
import g5.c;
import java.util.regex.Pattern;
import H0.a;
import W.h;
import g4.b;
import e5.i;
import c5.f;
import c2.k;
import F3.e;

public final class d
{
    public final e a;
    public final k b;
    public final f c;
    public final E5.d d;
    
    public d(final i i, final e a, final b b, final k b2, final h h) {
        this.a = a;
        this.b = b2;
        this.c = new f((m5.a)new a((Object)h, 5));
        this.d = new E5.d(false);
    }
    
    public static String c(String replaceAll) {
        final Pattern compile = Pattern.compile("/");
        n5.h.d("compile(...)", (Object)compile);
        replaceAll = compile.matcher((CharSequence)replaceAll).replaceAll("");
        n5.h.d("replaceAll(...)", (Object)replaceAll);
        return replaceAll;
    }
    
    public final Boolean a() {
        final i4.f b = this.b().b;
        if (b != null) {
            return b.a;
        }
        n5.h.h("sessionConfigs");
        throw null;
    }
    
    public final n b() {
        return (n)this.c.a();
    }
    
    public final Object d(e5.d f) {
        Object o = null;
        Label_0052: {
            if (f instanceof i4.a) {
                o = f;
                final int j = ((i4.a)o).J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    ((i4.a)o).J = j + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            o = new i4.a(this, (c)f);
        }
        Object o2 = ((i4.a)o).H;
        final f5.a c = f5.a.C;
        final int i = ((i4.a)o).J;
        final c5.h a = c5.h.a;
        Label_0807: {
            Object f2 = null;
            String a4;
            while (true) {
                Label_0354: {
                    if (i != 0) {
                        Label_0163: {
                            if (i != 1) {
                                Label_0818: {
                                    if (i != 2) {
                                        if (i == 3) {
                                            f = (e5.d)((i4.a)o).F;
                                            try {
                                                com.google.android.gms.internal.auth.h.z(o2);
                                                break Label_0807;
                                            }
                                            finally {
                                                break Label_0818;
                                            }
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    final E5.a g = ((i4.a)o).G;
                                    final d d = (d)((i4.a)o).F;
                                    final E5.a a2 = g;
                                    try {
                                        com.google.android.gms.internal.auth.h.z(o2);
                                        break Label_0354;
                                    }
                                    finally {
                                        f2 = (f = (e5.d)a2);
                                        break Label_0818;
                                    }
                                    break Label_0163;
                                }
                                ((E5.d)f).e((Object)null);
                            }
                        }
                        f = (e5.d)((i4.a)o).G;
                        f2 = ((i4.a)o).F;
                        com.google.android.gms.internal.auth.h.z(o2);
                    }
                    else {
                        com.google.android.gms.internal.auth.h.z(o2);
                        f = (e5.d)this.d;
                        if (!((E5.d)f).c() && !this.b().b()) {
                            return a;
                        }
                        ((i4.a)o).F = this;
                        ((i4.a)o).G = (E5.a)f;
                        ((i4.a)o).J = 1;
                        if (((E5.d)f).d((c)o) == c) {
                            return c;
                        }
                        f2 = this;
                    }
                    if (!((d)f2).b().b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                    }
                    else {
                        final Y c2 = r.c;
                        final e a3 = ((d)f2).a;
                        ((i4.a)o).F = f2;
                        ((i4.a)o).G = (E5.a)f;
                        ((i4.a)o).J = 2;
                        if ((o2 = c2.a(a3, (c)o)) == c) {
                            return c;
                        }
                        break Label_0354;
                    }
                    ((E5.d)f).e((Object)null);
                    return a;
                }
                a4 = ((r)o2).a;
                if (a4.equals("")) {
                    Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    continue;
                }
                break;
            }
            final c5.c c3 = new c5.c((Object)"X-Crashlytics-Installation-ID", (Object)a4);
            final String format = String.format("%s/%s", Arrays.copyOf(new Object[] { Build.MANUFACTURER, Build.MODEL }, 2));
            f2.getClass();
            final c5.c c4 = new c5.c((Object)"X-Crashlytics-Device-Model", (Object)c(format));
            final String incremental = Build$VERSION.INCREMENTAL;
            n5.h.d("INCREMENTAL", (Object)incremental);
            final c5.c c5 = new c5.c((Object)"X-Crashlytics-OS-Build-Version", (Object)c(incremental));
            final String release = Build$VERSION.RELEASE;
            n5.h.d("RELEASE", (Object)release);
            final c5.c c6 = new c5.c((Object)"X-Crashlytics-OS-Display-Version", (Object)c(release));
            final c5.c c7 = new c5.c((Object)"X-Crashlytics-API-Client-Version", (Object)"2.0.7");
            final LinkedHashMap linkedHashMap = new LinkedHashMap(d5.o.G(5));
            for (int k = 0; k < 5; ++k) {
                final c5.c c8 = (new c5.c[] { c3, c4, c5, c6, c7 })[k];
                ((Map)linkedHashMap).put(c8.C, c8.D);
            }
            Log.d("SessionConfigFetcher", "Fetching settings from server.");
            final k b = ((d)f2).b;
            final i4.b b2 = new i4.b((d)f2, null);
            final g5.h h = new g5.h(2, (e5.d)null);
            ((i4.a)o).F = f;
            ((i4.a)o).G = null;
            ((i4.a)o).J = 3;
            final Object q = v.q((i)b.E, (c)o, (p)new i4.e(b, linkedHashMap, b2, (i4.c)h, null));
            r r;
            if (q == c) {
                r = (r)q;
            }
            else {
                r = (r)a;
            }
            if (r == c) {
                return c;
            }
        }
        ((E5.d)f).e((Object)null);
        return a;
    }
}
