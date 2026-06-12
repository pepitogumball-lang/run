package u;

import V2.b;

public final class h
{
    public Object a;
    public j b;
    public k c;
    public boolean d;
    
    public final void finalize() {
        final j b = this.b;
        if (b != null) {
            final i d = b.D;
            if (!d.isDone()) {
                final StringBuilder sb = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                sb.append(this.a);
                d.l((Throwable)new b(sb.toString(), 7));
            }
        }
        if (!this.d) {
            final k c = this.c;
            if (c != null) {
                c.k((Object)null);
            }
        }
    }
}
