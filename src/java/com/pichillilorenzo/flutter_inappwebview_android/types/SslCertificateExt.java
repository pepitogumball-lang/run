package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.security.cert.Certificate;
import android.net.http.SslCertificate$DName;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.security.cert.CertificateEncodingException;
import com.google.android.gms.internal.ads.sE;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.Map;
import java.security.cert.X509Certificate;
import android.net.http.SslCertificate;

public class SslCertificateExt extends SslCertificate
{
    private SslCertificateExt(final X509Certificate x509Certificate) {
        super(x509Certificate);
    }
    
    public static Map<String, Object> toMap(final SslCertificate sslCertificate) {
        final Object o = null;
        if (sslCertificate == null) {
            return null;
        }
        final SslCertificate$DName issuedBy = sslCertificate.getIssuedBy();
        HashMap hashMap;
        if (issuedBy != null) {
            hashMap = new HashMap();
            hashMap.put((Object)"CName", (Object)issuedBy.getCName());
            hashMap.put((Object)"DName", (Object)issuedBy.getDName());
            hashMap.put((Object)"OName", (Object)issuedBy.getOName());
            hashMap.put((Object)"UName", (Object)issuedBy.getUName());
        }
        else {
            hashMap = null;
        }
        final SslCertificate$DName issuedTo = sslCertificate.getIssuedTo();
        HashMap hashMap2;
        if (issuedTo != null) {
            hashMap2 = new HashMap();
            hashMap2.put((Object)"CName", (Object)issuedTo.getCName());
            hashMap2.put((Object)"DName", (Object)issuedTo.getDName());
            hashMap2.put((Object)"OName", (Object)issuedTo.getOName());
            hashMap2.put((Object)"UName", (Object)issuedTo.getUName());
        }
        else {
            hashMap2 = null;
        }
        Object o2;
        if (Build$VERSION.SDK_INT >= 29) {
            try {
                final X509Certificate j = sE.j(sslCertificate);
                o2 = o;
                if (j != null) {
                    o2 = ((Certificate)j).getEncoded();
                }
            }
            catch (final CertificateEncodingException ex) {
                ((Throwable)ex).printStackTrace();
                o2 = o;
            }
        }
        else {
            try {
                o2 = ((Certificate)Util.getX509CertFromSslCertHack(sslCertificate)).getEncoded();
            }
            catch (final CertificateEncodingException ex2) {
                ((Throwable)ex2).printStackTrace();
                o2 = o;
            }
        }
        final long time = sslCertificate.getValidNotAfterDate().getTime();
        final long time2 = sslCertificate.getValidNotBeforeDate().getTime();
        final HashMap hashMap3 = new HashMap();
        hashMap3.put((Object)"issuedBy", (Object)hashMap);
        hashMap3.put((Object)"issuedTo", (Object)hashMap2);
        hashMap3.put((Object)"validNotAfterDate", (Object)time);
        hashMap3.put((Object)"validNotBeforeDate", (Object)time2);
        hashMap3.put((Object)"x509Certificate", o2);
        return (Map<String, Object>)hashMap3;
    }
}
