package C2;

import S2.e;

public final class a0
{
    public final g a;
    public final c b;
    public final o c;
    public final Object d;
    public final Object e;
    public boolean f;
    public boolean g;
    public e h;
    
    public a0(final g a, final c b, final o c) {
        this.d = new Object();
        this.e = new Object();
        this.f = false;
        this.g = false;
        this.h = new e((e)new Object());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        final g a = this.a;
        if (!a.b.getBoolean("is_pub_misconfigured", false)) {
            int int1;
            if (!this.c()) {
                int1 = 0;
            }
            else {
                int1 = a.b.getInt("consent_status", 0);
            }
            if (int1 != 1) {
                if (int1 != 3) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final int b() {
        if (!this.c()) {
            return 1;
        }
        final String string = this.a.b.getString("privacy_options_requirement_status", "UNKNOWN");
        if (string != null) {
            int n;
            if (string.equals((Object)"UNKNOWN")) {
                n = 1;
            }
            else if (string.equals((Object)"NOT_REQUIRED")) {
                n = 2;
            }
            else {
                if (!string.equals((Object)"REQUIRED")) {
                    throw new IllegalArgumentException("No enum constant com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.".concat(string));
                }
                n = 3;
            }
            return n;
        }
        throw new NullPointerException("Name is null");
    }
    
    public final boolean c() {
        final Object d = this.d;
        synchronized (d) {
            return this.f;
        }
    }
}
