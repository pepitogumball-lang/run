package G0;

import android.net.Uri;
import F0.w;
import F0.d;

public final class y extends b
{
    public final int e;
    
    @Override
    public final boolean b() {
        boolean multiProcessEnabled = false;
        final boolean b = false;
        switch (this.e) {
            default: {
                boolean b2;
                if (!F0.d.a("MULTI_PROFILE")) {
                    b2 = b;
                }
                else {
                    b2 = super.b();
                }
                return b2;
            }
            case 0: {
                if (super.b()) {
                    if (F0.d.a("MULTI_PROCESS")) {
                        final Uri a = w.a;
                        if (!z.G.b()) {
                            throw z.a();
                        }
                        multiProcessEnabled = B.a.getStatics().isMultiProcessEnabled();
                    }
                }
                return multiProcessEnabled;
            }
        }
    }
}
