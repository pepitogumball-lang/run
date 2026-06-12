package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.android.gms.internal.measurement.L;
import java.util.Map;

public class ClientCertResponse
{
    private Integer action;
    private String certificatePassword;
    private String certificatePath;
    private String keyStoreType;
    
    public ClientCertResponse(final String certificatePath, final String certificatePassword, final String keyStoreType, final Integer action) {
        this.certificatePath = certificatePath;
        this.certificatePassword = certificatePassword;
        this.keyStoreType = keyStoreType;
        this.action = action;
    }
    
    public static ClientCertResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ClientCertResponse((String)map.get((Object)"certificatePath"), (String)map.get((Object)"certificatePassword"), (String)map.get((Object)"keyStoreType"), (Integer)map.get((Object)"action"));
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
        final ClientCertResponse clientCertResponse = (ClientCertResponse)o;
        if (!this.certificatePath.equals((Object)clientCertResponse.certificatePath)) {
            return false;
        }
        final String certificatePassword = this.certificatePassword;
        Label_0080: {
            if (certificatePassword != null) {
                if (certificatePassword.equals((Object)clientCertResponse.certificatePassword)) {
                    break Label_0080;
                }
            }
            else if (clientCertResponse.certificatePassword == null) {
                break Label_0080;
            }
            return false;
        }
        if (!this.keyStoreType.equals((Object)clientCertResponse.keyStoreType)) {
            return false;
        }
        final Integer action = this.action;
        final Integer action2 = clientCertResponse.action;
        if (action != null) {
            equals = action.equals((Object)action2);
        }
        else if (action2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public Integer getAction() {
        return this.action;
    }
    
    public String getCertificatePassword() {
        return this.certificatePassword;
    }
    
    public String getCertificatePath() {
        return this.certificatePath;
    }
    
    public String getKeyStoreType() {
        return this.keyStoreType;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.certificatePath.hashCode();
        final String certificatePassword = this.certificatePassword;
        final int n = 0;
        int hashCode2;
        if (certificatePassword != null) {
            hashCode2 = certificatePassword.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int g = L.g((hashCode * 31 + hashCode2) * 31, this.keyStoreType, 31);
        final Integer action = this.action;
        int hashCode3 = n;
        if (action != null) {
            hashCode3 = action.hashCode();
        }
        return g + hashCode3;
    }
    
    public void setAction(final Integer action) {
        this.action = action;
    }
    
    public void setCertificatePassword(final String certificatePassword) {
        this.certificatePassword = certificatePassword;
    }
    
    public void setCertificatePath(final String certificatePath) {
        this.certificatePath = certificatePath;
    }
    
    public void setKeyStoreType(final String keyStoreType) {
        this.keyStoreType = keyStoreType;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientCertResponse{certificatePath='");
        sb.append(this.certificatePath);
        sb.append("', certificatePassword='");
        sb.append(this.certificatePassword);
        sb.append("', keyStoreType='");
        sb.append(this.keyStoreType);
        sb.append("', action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
