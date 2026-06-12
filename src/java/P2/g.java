package P2;

import java.util.Iterator;
import android.content.pm.Signature;
import android.content.pm.PackageManager$NameNotFoundException;
import m0.a;
import android.content.Intent;
import android.os.Build;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.ArrayList;
import Q2.j;
import android.content.Context;
import Q2.i;
import B5.w;

public final class g
{
    public static final w c;
    public final i a;
    public final String b;
    
    static {
        c = new w("ReviewService", 2);
    }
    
    public g(final Context context) {
        this.b = context.getPackageName();
        final w a = j.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                a.f("Play Store package is disabled.", new Object[0]);
            }
            else {
                try {
                    final Signature[] signatures = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatures != null) {
                        final int length = signatures.length;
                        if (length != 0) {
                            final ArrayList list = new ArrayList();
                            int i = 0;
                            while (i < length) {
                                final byte[] byteArray = signatures[i].toByteArray();
                                String encodeToString;
                                try {
                                    final MessageDigest instance = MessageDigest.getInstance("SHA-256");
                                    instance.update(byteArray);
                                    encodeToString = Base64.encodeToString(instance.digest(), 11);
                                }
                                catch (final NoSuchAlgorithmException ex) {
                                    encodeToString = "";
                                }
                                list.add((Object)encodeToString);
                                if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals((Object)encodeToString)) {
                                    final String tags = Build.TAGS;
                                    if ((!tags.contains((CharSequence)"dev-keys") && !tags.contains((CharSequence)"test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals((Object)encodeToString)) {
                                        ++i;
                                        continue;
                                    }
                                }
                                this.a = new i(context, g.c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                                return;
                            }
                            final StringBuilder sb = new StringBuilder();
                            final Iterator iterator = list.iterator();
                            if (iterator.hasNext()) {
                                while (true) {
                                    sb.append((CharSequence)iterator.next());
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    sb.append((CharSequence)", ");
                                }
                            }
                            a.f(m0.a.g("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
                            return;
                        }
                    }
                    a.f("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                }
                catch (final PackageManager$NameNotFoundException ex2) {
                    a.f("Play Store package is not found.", new Object[0]);
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex3) {
            a.f("Play Store package is not found.", new Object[0]);
        }
    }
}
