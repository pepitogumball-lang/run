package L0;

import java.io.File;
import Y.b;
import n5.h;
import android.content.Context;
import m5.a;
import n5.i;

public final class j extends i implements a
{
    public final int D;
    public final Object E;
    public final Object F;
    
    public final Object b() {
        switch (this.D) {
            default: {
                final Context context = (Context)this.E;
                h.d("applicationContext", (Object)context);
                final String a = ((b)this.F).a;
                h.e("name", (Object)a);
                final String g = h.g(a, (Object)".preferences_pb");
                h.e("fileName", (Object)g);
                return new File(context.getApplicationContext().getFilesDir(), h.g("datastore/", (Object)g));
            }
            case 0: {
                ((M0.a)((L0.b)this.E).D).b((L0.i)this.F);
                return c5.h.a;
            }
        }
    }
}
