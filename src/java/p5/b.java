package p5;

import n5.h;
import java.util.Random;
import com.google.android.gms.internal.ads.T3;

public final class b extends a
{
    public final T3 E;
    
    public b() {
        this.E = new T3(10);
    }
    
    @Override
    public final Random a() {
        final Object value = ((ThreadLocal)this.E).get();
        h.d("get(...)", value);
        return (Random)value;
    }
}
