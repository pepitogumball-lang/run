package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.AbstractCollection;
import com.google.android.gms.internal.measurement.L;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class UserScript
{
    static final boolean $assertionsDisabled = false;
    private Set<String> allowedOriginRules;
    private ContentWorld contentWorld;
    private String groupName;
    private UserScriptInjectionTime injectionTime;
    private String source;
    
    public UserScript(final String groupName, final String source, final UserScriptInjectionTime injectionTime, final ContentWorld contentWorld, final Set<String> set) {
        this.allowedOriginRules = (Set<String>)new HashSet();
        this.groupName = groupName;
        this.source = source;
        this.injectionTime = injectionTime;
        ContentWorld page = contentWorld;
        if (contentWorld == null) {
            page = ContentWorld.PAGE;
        }
        this.contentWorld = page;
        Object allowedOriginRules;
        if ((allowedOriginRules = set) == null) {
            allowedOriginRules = new HashSet<String>(this) {
                final UserScript this$0;
                
                {
                    ((AbstractCollection)this).add((Object)"*");
                }
            };
        }
        this.allowedOriginRules = (Set<String>)allowedOriginRules;
    }
    
    public static UserScript fromMap(final Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new UserScript((String)map.get((Object)"groupName"), (String)map.get((Object)"source"), UserScriptInjectionTime.fromValue((int)map.get((Object)"injectionTime")), ContentWorld.fromMap((Map<String, Object>)map.get((Object)"contentWorld")), (Set<String>)new HashSet((Collection)map.get((Object)"allowedOriginRules")));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final UserScript userScript = (UserScript)o;
            final String groupName = this.groupName;
            if (groupName != null) {
                if (groupName.equals((Object)userScript.groupName)) {
                    return this.source.equals((Object)userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld) && this.allowedOriginRules.equals((Object)userScript.allowedOriginRules);
                }
            }
            else if (userScript.groupName == null) {
                return this.source.equals((Object)userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld) && this.allowedOriginRules.equals((Object)userScript.allowedOriginRules);
            }
            return false;
        }
        return false;
    }
    
    public Set<String> getAllowedOriginRules() {
        return this.allowedOriginRules;
    }
    
    public ContentWorld getContentWorld() {
        return this.contentWorld;
    }
    
    public String getGroupName() {
        return this.groupName;
    }
    
    public UserScriptInjectionTime getInjectionTime() {
        return this.injectionTime;
    }
    
    public String getSource() {
        return this.source;
    }
    
    @Override
    public int hashCode() {
        final String groupName = this.groupName;
        int hashCode;
        if (groupName != null) {
            hashCode = groupName.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.allowedOriginRules.hashCode() + (this.contentWorld.hashCode() + (this.injectionTime.hashCode() + L.g(hashCode * 31, this.source, 31)) * 31) * 31;
    }
    
    public void setAllowedOriginRules(final Set<String> allowedOriginRules) {
        this.allowedOriginRules = allowedOriginRules;
    }
    
    public void setContentWorld(final ContentWorld contentWorld) {
        ContentWorld page = contentWorld;
        if (contentWorld == null) {
            page = ContentWorld.PAGE;
        }
        this.contentWorld = page;
    }
    
    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }
    
    public void setInjectionTime(final UserScriptInjectionTime injectionTime) {
        this.injectionTime = injectionTime;
    }
    
    public void setSource(final String source) {
        this.source = source;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserScript{groupName='");
        sb.append(this.groupName);
        sb.append("', source='");
        sb.append(this.source);
        sb.append("', injectionTime=");
        sb.append((Object)this.injectionTime);
        sb.append(", contentWorld=");
        sb.append((Object)this.contentWorld);
        sb.append(", allowedOriginRules=");
        sb.append((Object)this.allowedOriginRules);
        sb.append('}');
        return sb.toString();
    }
}
