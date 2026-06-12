package K2;

import android.text.TextUtils;
import java.util.Map;
import java.util.HashMap;

public final class r1
{
    public static final String[] b;
    public final HashMap a;
    
    static {
        b = new String[] { "GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID" };
    }
    
    public r1(final HashMap hashMap) {
        (this.a = new HashMap()).putAll((Map)hashMap);
    }
    
    public final String a() {
        final StringBuilder sb = new StringBuilder();
        final String[] b = r1.b;
        for (int i = 0; i < 6; ++i) {
            final String s = b[i];
            final HashMap a = this.a;
            if (a.containsKey((Object)s)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(s);
                sb.append("=");
                sb.append((String)a.get((Object)s));
            }
        }
        return sb.toString();
    }
    
    public final int b() {
        final int n = -1;
        try {
            final String s = (String)this.a.get((Object)"PolicyVersion");
            int int1 = n;
            if (!TextUtils.isEmpty((CharSequence)s)) {
                int1 = Integer.parseInt(s);
            }
            return int1;
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof r1 && this.a().equalsIgnoreCase(((r1)o).a());
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a();
    }
}
