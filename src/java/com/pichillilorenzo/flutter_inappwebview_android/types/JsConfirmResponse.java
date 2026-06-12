package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class JsConfirmResponse
{
    private Integer action;
    private String cancelButtonTitle;
    private String confirmButtonTitle;
    private boolean handledByClient;
    private String message;
    
    public JsConfirmResponse(final String message, final String confirmButtonTitle, final String cancelButtonTitle, final boolean handledByClient, final Integer action) {
        this.message = message;
        this.confirmButtonTitle = confirmButtonTitle;
        this.cancelButtonTitle = cancelButtonTitle;
        this.handledByClient = handledByClient;
        this.action = action;
    }
    
    public static JsConfirmResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsConfirmResponse((String)map.get((Object)"message"), (String)map.get((Object)"confirmButtonTitle"), (String)map.get((Object)"cancelButtonTitle"), (boolean)map.get((Object)"handledByClient"), (Integer)map.get((Object)"action"));
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
        final JsConfirmResponse jsConfirmResponse = (JsConfirmResponse)o;
        if (this.handledByClient != jsConfirmResponse.handledByClient) {
            return false;
        }
        final String message = this.message;
        Label_0077: {
            if (message != null) {
                if (message.equals((Object)jsConfirmResponse.message)) {
                    break Label_0077;
                }
            }
            else if (jsConfirmResponse.message == null) {
                break Label_0077;
            }
            return false;
        }
        final String confirmButtonTitle = this.confirmButtonTitle;
        Label_0109: {
            if (confirmButtonTitle != null) {
                if (confirmButtonTitle.equals((Object)jsConfirmResponse.confirmButtonTitle)) {
                    break Label_0109;
                }
            }
            else if (jsConfirmResponse.confirmButtonTitle == null) {
                break Label_0109;
            }
            return false;
        }
        final String cancelButtonTitle = this.cancelButtonTitle;
        Label_0141: {
            if (cancelButtonTitle != null) {
                if (cancelButtonTitle.equals((Object)jsConfirmResponse.cancelButtonTitle)) {
                    break Label_0141;
                }
            }
            else if (jsConfirmResponse.cancelButtonTitle == null) {
                break Label_0141;
            }
            return false;
        }
        final Integer action = this.action;
        final Integer action2 = jsConfirmResponse.action;
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
    
    public String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }
    
    public String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    @Override
    public int hashCode() {
        final String message = this.message;
        int hashCode = 0;
        int hashCode2;
        if (message != null) {
            hashCode2 = message.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String confirmButtonTitle = this.confirmButtonTitle;
        int hashCode3;
        if (confirmButtonTitle != null) {
            hashCode3 = confirmButtonTitle.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String cancelButtonTitle = this.cancelButtonTitle;
        int hashCode4;
        if (cancelButtonTitle != null) {
            hashCode4 = cancelButtonTitle.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int handledByClient = this.handledByClient ? 1 : 0;
        final Integer action = this.action;
        if (action != null) {
            hashCode = action.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + handledByClient) * 31 + hashCode;
    }
    
    public boolean isHandledByClient() {
        return this.handledByClient;
    }
    
    public void setAction(final Integer action) {
        this.action = action;
    }
    
    public void setCancelButtonTitle(final String cancelButtonTitle) {
        this.cancelButtonTitle = cancelButtonTitle;
    }
    
    public void setConfirmButtonTitle(final String confirmButtonTitle) {
        this.confirmButtonTitle = confirmButtonTitle;
    }
    
    public void setHandledByClient(final boolean handledByClient) {
        this.handledByClient = handledByClient;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JsConfirmResponse{message='");
        sb.append(this.message);
        sb.append("', confirmButtonTitle='");
        sb.append(this.confirmButtonTitle);
        sb.append("', cancelButtonTitle='");
        sb.append(this.cancelButtonTitle);
        sb.append("', handledByClient=");
        sb.append(this.handledByClient);
        sb.append(", action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
