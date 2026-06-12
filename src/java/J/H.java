package j;

import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.LinkedHashSet;
import x0.e;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import x0.d;

public final class h implements d
{
    public final int a;
    public final Object b;
    
    public h(final InAppBrowserActivity b) {
        this.a = 0;
        this.b = b;
    }
    
    public h(final e e) {
        this.a = 1;
        n5.h.e("registry", (Object)e);
        this.b = new LinkedHashSet();
        e.c("androidx.savedstate.Restarter", (d)this);
    }
    
    public final Bundle a() {
        switch (this.a) {
            default: {
                final Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList((Collection)this.b));
                return bundle;
            }
            case 0: {
                final Bundle bundle2 = new Bundle();
                ((j)this.b).getDelegate().getClass();
                return bundle2;
            }
        }
    }
}
