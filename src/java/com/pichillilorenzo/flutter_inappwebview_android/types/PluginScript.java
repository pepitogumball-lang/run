package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Set;

public class PluginScript extends UserScript
{
    private boolean requiredInAllContentWorlds;
    
    public PluginScript(final String s, final String s2, final UserScriptInjectionTime userScriptInjectionTime, final ContentWorld contentWorld, final boolean requiredInAllContentWorlds, final Set<String> set) {
        super(s, s2, userScriptInjectionTime, contentWorld, set);
        this.requiredInAllContentWorlds = requiredInAllContentWorlds;
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
        if (this.requiredInAllContentWorlds != ((PluginScript)o).requiredInAllContentWorlds) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() * 31 + (this.requiredInAllContentWorlds ? 1 : 0);
    }
    
    public boolean isRequiredInAllContentWorlds() {
        return this.requiredInAllContentWorlds;
    }
    
    public void setRequiredInAllContentWorlds(final boolean requiredInAllContentWorlds) {
        this.requiredInAllContentWorlds = requiredInAllContentWorlds;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PluginScript{requiredInContentWorld=");
        sb.append(this.requiredInAllContentWorlds);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
