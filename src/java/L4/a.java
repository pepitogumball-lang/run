package l4;

import java.util.Iterator;
import E4.j;
import java.util.Map$Entry;
import java.util.Comparator;
import d5.d;
import K2.J0;
import android.content.pm.ResolveInfo;
import d5.l;
import android.os.Parcelable;
import android.content.Intent;
import r.k;
import java.util.Map;
import android.net.Uri;
import F4.o;
import F4.m;
import F4.f;
import F4.p;
import B4.b;
import java.util.List;
import r.g;
import java.util.Collection;
import java.util.ArrayList;
import n5.h;
import android.content.Context;
import java.util.LinkedHashMap;
import B4.c;
import F4.n;

public final class a implements n, c
{
    public static final LinkedHashMap D;
    public Context C;
    
    static {
        D = new LinkedHashMap();
    }
    
    public a() {
        this.C = null;
    }
    
    public final boolean a(final String s) {
        final Context c = this.C;
        h.b((Object)c);
        return h.a((Object)g.b(c, (List)new ArrayList((Collection)new d5.a((Object[])new String[] { s }, true)), true), (Object)s);
    }
    
    public final void onAttachedToEngine(final b b) {
        h.e("binding", (Object)b);
        final f c = b.c;
        h.d("getBinaryMessenger(...)", (Object)c);
        final Context a = b.a;
        h.d("getApplicationContext(...)", (Object)a);
        this.C = a;
        new p(c, "flutter_web_auth_2").b((n)this);
    }
    
    public final void onDetachedFromEngine(final b b) {
        h.e("binding", (Object)b);
        this.C = null;
    }
    
    public final void onMethodCall(final m m, final o o) {
        h.e("call", (Object)m);
        final String a = m.a;
        final boolean a2 = h.a((Object)a, (Object)"authenticate");
        final LinkedHashMap d = l4.a.D;
        final String s = null;
        final String s2 = null;
        if (a2) {
            final Uri parse = Uri.parse((String)m.a("url"));
            final Object a3 = m.a("callbackUrlScheme");
            h.b(a3);
            final String s3 = (String)a3;
            final Object a4 = m.a("options");
            h.b(a4);
            final Map map = (Map)a4;
            ((Map)d).put((Object)s3, (Object)o);
            final r.l a5 = new k().a();
            final Intent intent = new Intent(this.C, (Class)l4.b.class);
            final Object value = map.get((Object)"intentFlags");
            h.c("null cannot be cast to non-null type kotlin.Int", value);
            final int intValue = (int)value;
            final Intent a6 = a5.a;
            a6.addFlags(intValue);
            a6.putExtra("android.support.customtabs.extra.KEEP_ALIVE", (Parcelable)intent);
            final Iterable iterable = (Iterable)map.get((Object)"customTabsPackageOrder");
            final l c = l.C;
            Object o2;
            if ((o2 = iterable) == null) {
                o2 = c;
            }
            while (true) {
                for (final Object next : o2) {
                    if (this.a((String)next)) {
                        String package1 = (String)next;
                        if (package1 == null) {
                            final Context c2 = this.C;
                            h.b((Object)c2);
                            if (g.b(c2, (List)c, false) != null) {
                                package1 = s;
                            }
                            else {
                                final Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
                                final Context c3 = this.C;
                                h.b((Object)c3);
                                final List queryIntentActivities = c3.getPackageManager().queryIntentActivities(intent2, 131072);
                                h.b((Object)queryIntentActivities);
                                final Iterable iterable2 = (Iterable)queryIntentActivities;
                                final ArrayList list = new ArrayList(d5.f.E(iterable2));
                                final Iterator iterator2 = iterable2.iterator();
                                while (iterator2.hasNext()) {
                                    list.add((Object)((ResolveInfo)iterator2.next()).activityInfo.packageName);
                                }
                                final Iterator iterator3 = ((Iterable)d5.d.J(list, (Comparator)new J0(3))).iterator();
                                Object next2;
                                do {
                                    next2 = s2;
                                    if (!iterator3.hasNext()) {
                                        break;
                                    }
                                    next2 = iterator3.next();
                                } while (!this.a((String)next2));
                                final String s4 = (String)next2;
                                if ((package1 = s4) == null) {
                                    package1 = s4;
                                    if (this.a("com.android.chrome")) {
                                        package1 = "com.android.chrome";
                                    }
                                }
                            }
                        }
                        if (package1 != null) {
                            a6.setPackage(package1);
                        }
                        final Context c4 = this.C;
                        h.b((Object)c4);
                        a6.setData(parse);
                        c4.startActivity(a6, a5.b);
                        return;
                    }
                }
                Object next = null;
                continue;
            }
        }
        if (h.a((Object)a, (Object)"cleanUpDanglingCalls")) {
            final Iterator iterator4 = d.entrySet().iterator();
            while (iterator4.hasNext()) {
                ((o)((Map$Entry)iterator4.next()).getValue()).error("CANCELED", "User canceled login", (Object)null);
            }
            d.clear();
            ((j)o).success((Object)null);
        }
        else {
            ((j)o).notImplemented();
        }
    }
}
