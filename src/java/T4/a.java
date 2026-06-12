package t4;

import android.content.pm.PackageItemInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import E4.j;
import C2.d0;
import java.util.HashMap;
import com.google.android.gms.internal.ads.po;
import F4.o;
import F4.m;
import B4.b;
import android.content.pm.SigningInfo;
import java.security.NoSuchAlgorithmException;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import O.n0;
import android.os.Build$VERSION;
import android.content.pm.PackageManager;
import n5.h;
import java.security.MessageDigest;
import F4.p;
import android.content.Context;
import B4.c;
import F4.n;

public final class a implements n, c
{
    public Context C;
    public p D;
    
    public static String b(final byte[] array) {
        final MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(array);
        final byte[] digest = instance.digest();
        h.b(digest);
        final char[] array3;
        final char[] array2 = array3 = new char[16];
        array3[0] = '0';
        array3[1] = '1';
        array3[2] = '2';
        array3[3] = '3';
        array3[4] = '4';
        array3[5] = '5';
        array3[6] = '6';
        array3[7] = '7';
        array3[8] = '8';
        array3[9] = '9';
        array3[10] = 'A';
        array3[11] = 'B';
        array3[12] = 'C';
        array3[13] = 'D';
        array3[14] = 'E';
        array3[15] = 'F';
        final char[] array4 = new char[digest.length * 2];
        for (int length = digest.length, i = 0; i < length; ++i) {
            final byte b = digest[i];
            final int n = i * 2;
            array4[n] = array2[(b & 0xFF) >>> 4];
            array4[n + 1] = array2[b & 0xF];
        }
        return new String(array4);
    }
    
    public final String a(final PackageManager packageManager) {
        final String s = null;
        try {
            String s2;
            if (Build$VERSION.SDK_INT >= 28) {
                final Context c = this.C;
                h.b(c);
                final SigningInfo c2 = n0.c(packageManager.getPackageInfo(c.getPackageName(), 134217728));
                if (c2 == null) {
                    return null;
                }
                if (n0.v(c2)) {
                    final Signature[] b = n0.B(c2);
                    h.d("getApkContentsSigners(...)", b);
                    final byte[] byteArray = ((Signature)d5.c.G((Object[])b)).toByteArray();
                    h.d("toByteArray(...)", byteArray);
                    s2 = b(byteArray);
                }
                else {
                    final Signature[] x = n0.x(c2);
                    h.d("getSigningCertificateHistory(...)", x);
                    final byte[] byteArray2 = ((Signature)d5.c.G((Object[])x)).toByteArray();
                    h.d("toByteArray(...)", byteArray2);
                    s2 = b(byteArray2);
                }
            }
            else {
                final Context c3 = this.C;
                h.b(c3);
                final Signature[] signatures = packageManager.getPackageInfo(c3.getPackageName(), 64).signatures;
                s2 = s;
                if (signatures != null) {
                    if (signatures.length == 0) {
                        s2 = s;
                    }
                    else if (d5.c.G((Object[])signatures) == null) {
                        s2 = s;
                    }
                    else {
                        final byte[] byteArray3 = ((Signature)d5.c.G((Object[])signatures)).toByteArray();
                        h.d("toByteArray(...)", byteArray3);
                        s2 = b(byteArray3);
                    }
                }
            }
            return s2;
        }
        catch (final PackageManager$NameNotFoundException | NoSuchAlgorithmException ex) {
            return s;
        }
    }
    
    public final void onAttachedToEngine(final b b) {
        h.e("binding", b);
        this.C = b.a;
        (this.D = new p(b.c, "dev.fluttercommunity.plus/package_info")).b((n)this);
    }
    
    public final void onDetachedFromEngine(final b b) {
        h.e("binding", b);
        this.C = null;
        final p d = this.D;
        h.b(d);
        d.b((n)null);
        this.D = null;
    }
    
    public final void onMethodCall(final m m, final o o) {
        h.e("call", m);
        Label_0341: {
            Label_0331: {
                PackageInfo packageInfo = null;
                String a = null;
                int sdk_INT = 0;
                String s = null;
                HashMap hashMap = null;
                String s2 = null;
                String string = null;
                Label_0191: {
                    try {
                        if (!h.a(m.a, "getAll")) {
                            break Label_0331;
                        }
                        final Context c = this.C;
                        h.b(c);
                        final PackageManager packageManager = c.getPackageManager();
                        final Context c2 = this.C;
                        h.b(c2);
                        packageInfo = packageManager.getPackageInfo(c2.getPackageName(), 0);
                        a = this.a(packageManager);
                        final Context c3 = this.C;
                        h.b(c3);
                        final PackageManager packageManager2 = c3.getPackageManager();
                        final Context c4 = this.C;
                        h.b(c4);
                        final String packageName = c4.getPackageName();
                        sdk_INT = Build$VERSION.SDK_INT;
                        if (sdk_INT >= 30) {
                            s = po.w(po.e(packageManager2, packageName));
                        }
                        else {
                            s = packageManager2.getInstallerPackageName(packageName);
                        }
                        hashMap = new HashMap();
                        final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                        s2 = "";
                        if (applicationInfo != null) {
                            final CharSequence loadLabel = ((PackageItemInfo)applicationInfo).loadLabel(packageManager);
                            if (loadLabel != null) {
                                if ((string = loadLabel.toString()) != null) {
                                    break Label_0191;
                                }
                            }
                        }
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        break Label_0341;
                    }
                    string = "";
                }
                hashMap.put((Object)"appName", (Object)string);
                final Context c5 = this.C;
                h.b(c5);
                hashMap.put((Object)"packageName", (Object)c5.getPackageName());
                String versionName = packageInfo.versionName;
                if (versionName == null) {
                    versionName = s2;
                }
                hashMap.put((Object)"version", (Object)versionName);
                long e;
                if (sdk_INT >= 28) {
                    e = d0.e(packageInfo);
                }
                else {
                    e = packageInfo.versionCode;
                }
                hashMap.put((Object)"buildNumber", (Object)String.valueOf(e));
                if (a != null) {
                    hashMap.put((Object)"buildSignature", (Object)a);
                }
                if (s != null) {
                    hashMap.put((Object)"installerStore", (Object)s);
                }
                ((j)o).success((Object)hashMap);
                return;
            }
            ((j)o).notImplemented();
            return;
        }
        final PackageManager$NameNotFoundException ex;
        ((j)o).error("Name not found", ((Throwable)ex).getMessage(), (Object)null);
    }
}
