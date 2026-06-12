package g5;

import n5.p;
import e5.d;
import n5.f;

public abstract class h extends c implements f
{
    public final int F;
    
    public h(final int f, final d d) {
        super(d);
        this.F = f;
    }
    
    @Override
    public final int c() {
        return this.F;
    }
    
    @Override
    public final String toString() {
        String s2;
        if (super.C == null) {
            p.a.getClass();
            final String s = s2 = this.getClass().getGenericInterfaces()[0].toString();
            if (s.startsWith("kotlin.jvm.functions.")) {
                s2 = s.substring(21);
            }
            n5.h.d("renderLambdaToString(...)", (Object)s2);
        }
        else {
            s2 = super.toString();
        }
        return s2;
    }
}
