package m1;

public final class l extends a
{
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    
    public l(final Integer a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final String l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            final Integer a2 = this.a;
            if (a2 == null) {
                if (((l)a).a != null) {
                    return false;
                }
            }
            else if (!a2.equals((Object)((l)a).a)) {
                return false;
            }
            final String b2 = this.b;
            if (b2 == null) {
                if (((l)a).b != null) {
                    return false;
                }
            }
            else if (!b2.equals((Object)((l)a).b)) {
                return false;
            }
            final String c = this.c;
            if (c == null) {
                if (((l)a).c != null) {
                    return false;
                }
            }
            else if (!c.equals((Object)((l)a).c)) {
                return false;
            }
            final String d = this.d;
            if (d == null) {
                if (((l)a).d != null) {
                    return false;
                }
            }
            else if (!d.equals((Object)((l)a).d)) {
                return false;
            }
            final String e = this.e;
            if (e == null) {
                if (((l)a).e != null) {
                    return false;
                }
            }
            else if (!e.equals((Object)((l)a).e)) {
                return false;
            }
            final String f = this.f;
            if (f == null) {
                if (((l)a).f != null) {
                    return false;
                }
            }
            else if (!f.equals((Object)((l)a).f)) {
                return false;
            }
            final String g = this.g;
            if (g == null) {
                if (((l)a).g != null) {
                    return false;
                }
            }
            else if (!g.equals((Object)((l)a).g)) {
                return false;
            }
            final String h = this.h;
            if (h == null) {
                if (((l)a).h != null) {
                    return false;
                }
            }
            else if (!h.equals((Object)((l)a).h)) {
                return false;
            }
            final String i = this.i;
            if (i == null) {
                if (((l)a).i != null) {
                    return false;
                }
            }
            else if (!i.equals((Object)((l)a).i)) {
                return false;
            }
            final String j = this.j;
            if (j == null) {
                if (((l)a).j != null) {
                    return false;
                }
            }
            else if (!j.equals((Object)((l)a).j)) {
                return false;
            }
            final String k = this.k;
            if (k == null) {
                if (((l)a).k != null) {
                    return false;
                }
            }
            else if (!k.equals((Object)((l)a).k)) {
                return false;
            }
            final String l = this.l;
            if (l == null) {
                if (((l)a).l == null) {
                    return b;
                }
            }
            else if (l.equals((Object)((l)a).l)) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Integer a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final String j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final String k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final String l = this.l;
        if (l != null) {
            hashCode = l.hashCode();
        }
        return hashCode ^ (((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append((Object)this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return x.a.b(sb, this.l, "}");
    }
}
