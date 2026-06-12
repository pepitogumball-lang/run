package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

public class ContentBlocker
{
    private ContentBlockerAction action;
    private ContentBlockerTrigger trigger;
    
    public ContentBlocker(final ContentBlockerTrigger trigger, final ContentBlockerAction action) {
        this.trigger = trigger;
        this.action = action;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ContentBlocker contentBlocker = (ContentBlocker)o;
            return this.trigger.equals(contentBlocker.trigger) && this.action.equals(contentBlocker.action);
        }
        return false;
    }
    
    public ContentBlockerAction getAction() {
        return this.action;
    }
    
    public ContentBlockerTrigger getTrigger() {
        return this.trigger;
    }
    
    @Override
    public int hashCode() {
        return this.action.hashCode() + this.trigger.hashCode() * 31;
    }
    
    public void setAction(final ContentBlockerAction action) {
        this.action = action;
    }
    
    public void setTrigger(final ContentBlockerTrigger trigger) {
        this.trigger = trigger;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContentBlocker{trigger=");
        sb.append((Object)this.trigger);
        sb.append(", action=");
        sb.append((Object)this.action);
        sb.append('}');
        return sb.toString();
    }
}
