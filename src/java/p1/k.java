package P1;

import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.ads.y7;
import java.util.Locale;
import java.util.HashSet;
import com.google.android.gms.internal.ads.GC;

public final class k implements GC
{
    public final int a;
    public final c2.k b;
    
    public final Object d() {
        switch (this.a) {
            default: {
                return this.b.F;
            }
            case 3: {
                return this.b.E;
            }
            case 2: {
                final c2.k b = this.b;
                b.getClass();
                final HashSet set = new HashSet();
                set.add((Object)((String)b.D).toLowerCase(Locale.ROOT));
                return set;
            }
            case 1: {
                final String lowerCase = ((String)this.b.D).toLowerCase(Locale.ROOT);
                y7.H((Object)lowerCase);
                return lowerCase;
            }
            case 0: {
                final String s = (String)this.b.D;
                int n = 0;
                Label_0237: {
                    switch (s.hashCode()) {
                        case 1951953708: {
                            if (s.equals((Object)"BANNER")) {
                                n = 0;
                                break Label_0237;
                            }
                            break;
                        }
                        case 543046670: {
                            if (s.equals((Object)"REWARDED")) {
                                n = 3;
                                break Label_0237;
                            }
                            break;
                        }
                        case -1372958932: {
                            if (s.equals((Object)"INTERSTITIAL")) {
                                n = 1;
                                break Label_0237;
                            }
                            break;
                        }
                        case -1999289321: {
                            if (s.equals((Object)"NATIVE")) {
                                n = 2;
                                break Label_0237;
                            }
                            break;
                        }
                    }
                    n = -1;
                }
                w6 w6;
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                w6 = com.google.android.gms.internal.ads.w6.D;
                            }
                            else {
                                w6 = com.google.android.gms.internal.ads.w6.K;
                            }
                        }
                        else {
                            w6 = com.google.android.gms.internal.ads.w6.J;
                        }
                    }
                    else {
                        w6 = com.google.android.gms.internal.ads.w6.G;
                    }
                }
                else {
                    w6 = com.google.android.gms.internal.ads.w6.E;
                }
                return w6;
            }
        }
    }
}
