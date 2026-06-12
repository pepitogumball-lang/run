package u;

import java.lang.ref.Reference;

public final class i extends g
{
    public final j J;
    
    public i(final j j) {
        this.J = j;
    }
    
    public final String i() {
        final h h = (h)((Reference)this.J.C).get();
        if (h == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        final StringBuilder sb = new StringBuilder("tag=[");
        sb.append(h.a);
        sb.append("]");
        return sb.toString();
    }
}
