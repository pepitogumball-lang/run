package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;
import android.net.http.SslCertificate;
import android.net.http.SslError;

public class SslErrorExt extends SslError
{
    private SslErrorExt(final int n, final SslCertificate sslCertificate, final String s) {
        super(n, sslCertificate, s);
    }
    
    public static Map<String, Object> toMap(final SslError sslError) {
        Object value = null;
        if (sslError == null) {
            return null;
        }
        final int primaryError = sslError.getPrimaryError();
        Object o;
        if (primaryError != 0) {
            if (primaryError != 1) {
                if (primaryError != 2) {
                    if (primaryError != 3) {
                        if (primaryError != 4) {
                            if (primaryError != 5) {
                                o = null;
                            }
                            else {
                                o = "A generic error occurred";
                            }
                        }
                        else {
                            o = "The date of the certificate is invalid";
                        }
                    }
                    else {
                        o = "The certificate authority is not trusted";
                    }
                }
                else {
                    o = "Hostname mismatch";
                }
            }
            else {
                o = "The certificate has expired";
            }
        }
        else {
            o = "The certificate is not yet valid";
        }
        final HashMap hashMap = new HashMap();
        if (primaryError >= 0) {
            value = primaryError;
        }
        hashMap.put((Object)"code", value);
        hashMap.put((Object)"message", o);
        return (Map<String, Object>)hashMap;
    }
}
