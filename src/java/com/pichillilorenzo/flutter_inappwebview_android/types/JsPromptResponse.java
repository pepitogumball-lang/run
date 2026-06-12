package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class JsPromptResponse
{
    private Integer action;
    private String cancelButtonTitle;
    private String confirmButtonTitle;
    private String defaultValue;
    private boolean handledByClient;
    private String message;
    private String value;
    
    public JsPromptResponse(final String message, final String defaultValue, final String confirmButtonTitle, final String cancelButtonTitle, final boolean handledByClient, final String value, final Integer action) {
        this.message = message;
        this.defaultValue = defaultValue;
        this.confirmButtonTitle = confirmButtonTitle;
        this.cancelButtonTitle = cancelButtonTitle;
        this.handledByClient = handledByClient;
        this.value = value;
        this.action = action;
    }
    
    public static JsPromptResponse fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsPromptResponse((String)map.get((Object)"message"), (String)map.get((Object)"defaultValue"), (String)map.get((Object)"confirmButtonTitle"), (String)map.get((Object)"cancelButtonTitle"), (boolean)map.get((Object)"handledByClient"), (String)map.get((Object)"value"), (Integer)map.get((Object)"action"));
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
        final JsPromptResponse jsPromptResponse = (JsPromptResponse)o;
        if (this.handledByClient != jsPromptResponse.handledByClient) {
            return false;
        }
        final String message = this.message;
        Label_0077: {
            if (message != null) {
                if (message.equals((Object)jsPromptResponse.message)) {
                    break Label_0077;
                }
            }
            else if (jsPromptResponse.message == null) {
                break Label_0077;
            }
            return false;
        }
        final String defaultValue = this.defaultValue;
        Label_0109: {
            if (defaultValue != null) {
                if (defaultValue.equals((Object)jsPromptResponse.defaultValue)) {
                    break Label_0109;
                }
            }
            else if (jsPromptResponse.defaultValue == null) {
                break Label_0109;
            }
            return false;
        }
        final String confirmButtonTitle = this.confirmButtonTitle;
        Label_0141: {
            if (confirmButtonTitle != null) {
                if (confirmButtonTitle.equals((Object)jsPromptResponse.confirmButtonTitle)) {
                    break Label_0141;
                }
            }
            else if (jsPromptResponse.confirmButtonTitle == null) {
                break Label_0141;
            }
            return false;
        }
        final String cancelButtonTitle = this.cancelButtonTitle;
        Label_0173: {
            if (cancelButtonTitle != null) {
                if (cancelButtonTitle.equals((Object)jsPromptResponse.cancelButtonTitle)) {
                    break Label_0173;
                }
            }
            else if (jsPromptResponse.cancelButtonTitle == null) {
                break Label_0173;
            }
            return false;
        }
        final String value = this.value;
        Label_0205: {
            if (value != null) {
                if (value.equals((Object)jsPromptResponse.value)) {
                    break Label_0205;
                }
            }
            else if (jsPromptResponse.value == null) {
                break Label_0205;
            }
            return false;
        }
        final Integer action = this.action;
        final Integer action2 = jsPromptResponse.action;
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
    
    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public String getValue() {
        return this.value;
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
        final String defaultValue = this.defaultValue;
        int hashCode3;
        if (defaultValue != null) {
            hashCode3 = defaultValue.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String confirmButtonTitle = this.confirmButtonTitle;
        int hashCode4;
        if (confirmButtonTitle != null) {
            hashCode4 = confirmButtonTitle.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final String cancelButtonTitle = this.cancelButtonTitle;
        int hashCode5;
        if (cancelButtonTitle != null) {
            hashCode5 = cancelButtonTitle.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int handledByClient = this.handledByClient ? 1 : 0;
        final String value = this.value;
        int hashCode6;
        if (value != null) {
            hashCode6 = value.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final Integer action = this.action;
        if (action != null) {
            hashCode = action.hashCode();
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + handledByClient) * 31 + hashCode6) * 31 + hashCode;
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
    
    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    public void setHandledByClient(final boolean handledByClient) {
        this.handledByClient = handledByClient;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JsPromptResponse{message='");
        sb.append(this.message);
        sb.append("', defaultValue='");
        sb.append(this.defaultValue);
        sb.append("', confirmButtonTitle='");
        sb.append(this.confirmButtonTitle);
        sb.append("', cancelButtonTitle='");
        sb.append(this.cancelButtonTitle);
        sb.append("', handledByClient=");
        sb.append(this.handledByClient);
        sb.append(", value='");
        sb.append(this.value);
        sb.append("', action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
