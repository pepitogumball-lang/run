package L3;

import android.text.TextUtils;
import C2.b;
import android.net.Uri;

public final class y
{
    public final String a;
    public final String b;
    public final String[] c;
    public final String d;
    public final String e;
    public final String[] f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Uri n;
    public final String o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    
    public y(final b b) {
        this.a = b.v("gcm.n.title");
        this.b = b.s("gcm.n.title");
        final Object[] r = b.r("gcm.n.title");
        final int n = 0;
        Uri parse = null;
        String[] c;
        if (r == null) {
            c = null;
        }
        else {
            final String[] array = new String[r.length];
            int n2 = 0;
            while (true) {
                c = array;
                if (n2 >= r.length) {
                    break;
                }
                array[n2] = String.valueOf(r[n2]);
                ++n2;
            }
        }
        this.c = c;
        this.d = b.v("gcm.n.body");
        this.e = b.s("gcm.n.body");
        final Object[] r2 = b.r("gcm.n.body");
        String[] f;
        if (r2 == null) {
            f = null;
        }
        else {
            final String[] array2 = new String[r2.length];
            int n3 = n;
            while (true) {
                f = array2;
                if (n3 >= r2.length) {
                    break;
                }
                array2[n3] = String.valueOf(r2[n3]);
                ++n3;
            }
        }
        this.f = f;
        this.g = b.v("gcm.n.icon");
        String i;
        if (TextUtils.isEmpty((CharSequence)(i = b.v("gcm.n.sound2")))) {
            i = b.v("gcm.n.sound");
        }
        this.i = i;
        this.j = b.v("gcm.n.tag");
        this.k = b.v("gcm.n.color");
        this.l = b.v("gcm.n.click_action");
        this.m = b.v("gcm.n.android_channel_id");
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = b.v("gcm.n.link_android")))) {
            s = b.v("gcm.n.link");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            parse = Uri.parse(s);
        }
        this.n = parse;
        this.h = b.v("gcm.n.image");
        this.o = b.v("gcm.n.ticker");
        this.p = b.o("gcm.n.notification_priority");
        this.q = b.o("gcm.n.visibility");
        this.r = b.o("gcm.n.notification_count");
        b.n("gcm.n.sticky");
        b.n("gcm.n.local_only");
        b.n("gcm.n.default_sound");
        b.n("gcm.n.default_vibrate_timings");
        b.n("gcm.n.default_light_settings");
        b.t();
        b.q();
        b.w();
    }
}
