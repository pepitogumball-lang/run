package k3;

import java.util.Objects;
import q3.c;

public final class j
{
    public final v a;
    public final i b;
    
    public j(final v a, final c c) {
        this.a = a;
        this.b = new i(c);
    }
    
    public final void a(final String b) {
        final i b2 = this.b;
        final i i;
        monitorenter(i = b2);
        Label_0044: {
            try {
                if (!Objects.equals((Object)b2.b, (Object)b)) {
                    k3.i.a(b2.a, b, b2.c);
                    b2.b = b;
                }
                break Label_0044;
            }
            finally {
                monitorexit(i);
                monitorexit(i);
            }
        }
    }
}
