package F1;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.UUID;
import java.util.Random;
import J1.a;
import J1.e;

public final class p
{
    public static final p f;
    public final e a;
    public final n b;
    public final String c;
    public final a d;
    public final Random e;
    
    static {
        f = new p();
    }
    
    public p() {
        final Object a = new Object();
        ((e)a).a = -1.0f;
        final n b = new n(new G0("com.google.android.gms.ads.AdManagerCreatorImpl", 2), new G0("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 1), new G0("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 0), new G0("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 3), new G0("com.google.android.gms.ads.AdOverlayCreatorImpl", 4), 0);
        final UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        final byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String c = new BigInteger(1, byteArray).toString();
        int n = 0;
    Label_0184_Outer:
        while (true) {
            Label_0190: {
                if (n >= 2) {
                    break Label_0190;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance("MD5");
                        instance.update(byteArray);
                        instance.update(byteArray2);
                        final byte[] array = new byte[8];
                        System.arraycopy((Object)instance.digest(), 0, (Object)array, 0, 8);
                        c = new BigInteger(1, array).toString();
                        ++n;
                        continue Label_0184_Outer;
                        byteArray = (byte[])(Object)new a(0, 250930000, true, false);
                        final Random e = new Random();
                        this.a = (e)a;
                        this.b = b;
                        this.c = c;
                        this.d = (a)(Object)byteArray;
                        this.e = e;
                    }
                    catch (final NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
