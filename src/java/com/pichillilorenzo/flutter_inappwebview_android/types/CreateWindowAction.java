package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class CreateWindowAction extends NavigationAction
{
    boolean isDialog;
    int windowId;
    
    public CreateWindowAction(final URLRequest urlRequest, final boolean b, final boolean b2, final boolean b3, final int windowId, final boolean isDialog) {
        super(urlRequest, b, b2, b3);
        this.windowId = windowId;
        this.isDialog = isDialog;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final CreateWindowAction createWindowAction = (CreateWindowAction)o;
        if (this.windowId != createWindowAction.windowId) {
            return false;
        }
        if (this.isDialog != createWindowAction.isDialog) {
            b = false;
        }
        return b;
    }
    
    public int getWindowId() {
        return this.windowId;
    }
    
    @Override
    public int hashCode() {
        return (super.hashCode() * 31 + this.windowId) * 31 + (this.isDialog ? 1 : 0);
    }
    
    public boolean isDialog() {
        return this.isDialog;
    }
    
    public void setDialog(final boolean isDialog) {
        this.isDialog = isDialog;
    }
    
    public void setWindowId(final int windowId) {
        this.windowId = windowId;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final Map<String, Object> map = super.toMap();
        map.put((Object)"windowId", (Object)this.windowId);
        map.put((Object)"isDialog", (Object)this.isDialog);
        map.put((Object)"windowFeatures", (Object)null);
        return map;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateWindowAction{windowId=");
        sb.append(this.windowId);
        sb.append(", isDialog=");
        sb.append(this.isDialog);
        sb.append(", request=");
        sb.append((Object)super.request);
        sb.append(", isForMainFrame=");
        sb.append(super.isForMainFrame);
        sb.append(", hasGesture=");
        sb.append(super.hasGesture);
        sb.append(", isRedirect=");
        sb.append(super.isRedirect);
        sb.append('}');
        return sb.toString();
    }
}
