package T4;

import S2.f;
import E4.j;
import S2.b;

public final class e implements b
{
    public final j a;
    
    public e(final j a) {
        this.a = a;
    }
    
    @Override
    public final void a(final f f) {
        final j a = this.a;
        if (f != null) {
            a.error(Integer.toString(f.a), f.b, (Object)null);
        }
        else {
            a.success((Object)null);
        }
    }
}
