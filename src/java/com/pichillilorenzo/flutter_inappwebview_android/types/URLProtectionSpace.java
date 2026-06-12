package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.internal.measurement.L;
import android.net.http.SslError;
import android.net.http.SslCertificate;

public class URLProtectionSpace
{
    private String host;
    private Long id;
    private int port;
    private String protocol;
    private String realm;
    private SslCertificate sslCertificate;
    private SslError sslError;
    
    public URLProtectionSpace(final Long id, final String host, final String protocol, final String realm, final int port) {
        this.id = id;
        this.host = host;
        this.protocol = protocol;
        this.realm = realm;
        this.port = port;
    }
    
    public URLProtectionSpace(final String host, final String protocol, final String realm, final int port, final SslCertificate sslCertificate, final SslError sslError) {
        this.host = host;
        this.protocol = protocol;
        this.realm = realm;
        this.port = port;
        this.sslCertificate = sslCertificate;
        this.sslError = sslError;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final URLProtectionSpace urlProtectionSpace = (URLProtectionSpace)o;
        if (this.port != urlProtectionSpace.port) {
            return false;
        }
        if (!this.host.equals((Object)urlProtectionSpace.host)) {
            return false;
        }
        if (!this.protocol.equals((Object)urlProtectionSpace.protocol)) {
            return false;
        }
        final String realm = this.realm;
        Label_0109: {
            if (realm != null) {
                if (realm.equals((Object)urlProtectionSpace.realm)) {
                    break Label_0109;
                }
            }
            else if (urlProtectionSpace.realm == null) {
                break Label_0109;
            }
            return false;
        }
        final SslCertificate sslCertificate = this.sslCertificate;
        Label_0141: {
            if (sslCertificate != null) {
                if (sslCertificate.equals(urlProtectionSpace.sslCertificate)) {
                    break Label_0141;
                }
            }
            else if (urlProtectionSpace.sslCertificate == null) {
                break Label_0141;
            }
            return false;
        }
        final SslError sslError = this.sslError;
        final SslError sslError2 = urlProtectionSpace.sslError;
        if (sslError != null) {
            equals = sslError.equals(sslError2);
        }
        else if (sslError2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public String getHost() {
        return this.host;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public int getPort() {
        return this.port;
    }
    
    public String getProtocol() {
        return this.protocol;
    }
    
    public String getRealm() {
        return this.realm;
    }
    
    public SslCertificate getSslCertificate() {
        return this.sslCertificate;
    }
    
    public SslError getSslError() {
        return this.sslError;
    }
    
    @Override
    public int hashCode() {
        final int g = L.g(this.host.hashCode() * 31, this.protocol, 31);
        final String realm = this.realm;
        int hashCode = 0;
        int hashCode2;
        if (realm != null) {
            hashCode2 = realm.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int port = this.port;
        final SslCertificate sslCertificate = this.sslCertificate;
        int hashCode3;
        if (sslCertificate != null) {
            hashCode3 = sslCertificate.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final SslError sslError = this.sslError;
        if (sslError != null) {
            hashCode = sslError.hashCode();
        }
        return (((g + hashCode2) * 31 + port) * 31 + hashCode3) * 31 + hashCode;
    }
    
    public void setHost(final String host) {
        this.host = host;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setPort(final int port) {
        this.port = port;
    }
    
    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }
    
    public void setRealm(final String realm) {
        this.realm = realm;
    }
    
    public void setSslCertificate(final SslCertificate sslCertificate) {
        this.sslCertificate = sslCertificate;
    }
    
    public void setSslError(final SslError sslError) {
        this.sslError = sslError;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"host", (Object)this.host);
        hashMap.put((Object)"protocol", (Object)this.protocol);
        hashMap.put((Object)"realm", (Object)this.realm);
        hashMap.put((Object)"port", (Object)this.port);
        hashMap.put((Object)"sslCertificate", (Object)SslCertificateExt.toMap(this.sslCertificate));
        hashMap.put((Object)"sslError", (Object)SslErrorExt.toMap(this.sslError));
        hashMap.put((Object)"authenticationMethod", (Object)null);
        hashMap.put((Object)"distinguishedNames", (Object)null);
        hashMap.put((Object)"receivesCredentialSecurely", (Object)null);
        hashMap.put((Object)"isProxy", (Object)null);
        hashMap.put((Object)"proxyType", (Object)null);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("URLProtectionSpace{host='");
        sb.append(this.host);
        sb.append("', protocol='");
        sb.append(this.protocol);
        sb.append("', realm='");
        sb.append(this.realm);
        sb.append("', port=");
        sb.append(this.port);
        sb.append(", sslCertificate=");
        sb.append((Object)this.sslCertificate);
        sb.append(", sslError=");
        sb.append((Object)this.sslError);
        sb.append('}');
        return sb.toString();
    }
}
