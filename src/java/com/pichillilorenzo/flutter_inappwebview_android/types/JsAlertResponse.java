package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class JsAlertResponse
{
    private Integer action;
    private String confirmButtonTitle;
    private boolean handledByClient;
    private String message;
    
    public JsAlertResponse(final String message, final String confirmButtonTitle, final boolean handledByClient, final Integer action) {
        this.message = message;
        this.confirmButtonTitle = confirmButtonTitle;
        this.handledByClient = handledByClient;
        this.action = action;
    }
    
    public static JsAlertResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsAlertResponse((String)map.get((Object)"message"), (String)map.get((Object)"confirmButtonTitle"), (boolean)map.get((Object)"handledByClient"), (Integer)map.get((Object)"action"));
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
        final JsAlertResponse jsAlertResponse = (JsAlertResponse)o;
        if (this.handledByClient != jsAlertResponse.handledByClient) {
            return false;
        }
        final String message = this.message;
        Label_0077: {
            if (message != null) {
                if (message.equals((Object)jsAlertResponse.message)) {
                    break Label_0077;
                }
            }
            else if (jsAlertResponse.message == null) {
                break Label_0077;
            }
            return false;
        }
        final String confirmButtonTitle = this.confirmButtonTitle;
        Label_0109: {
            if (confirmButtonTitle != null) {
                if (confirmButtonTitle.equals((Object)jsAlertResponse.confirmButtonTitle)) {
                    break Label_0109;
                }
            }
            else if (jsAlertResponse.confirmButtonTitle == null) {
                break Label_0109;
            }
            return false;
        }
        final Integer action = this.action;
        final Integer action2 = jsAlertResponse.action;
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
        final int handledByClient = this.handledByClient ? 1 : 0;
        final Integer action = this.action;
        if (action != null) {
            hashCode = action.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + handledByClient) * 31 + hashCode;
    }
    
    public boolean isHandledByClient() {
        return this.handledByClient;
    }
    
    public void setAction(final Integer action) {
        this.action = action;
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
        final StringBuilder sb = new StringBuilder("JsAlertResponse{message='");
        sb.append(this.message);
        sb.append("', confirmButtonTitle='");
        sb.append(this.confirmButtonTitle);
        sb.append("', handledByClient=");
        sb.append(this.handledByClient);
        sb.append(", action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
