package n5;

import java.io.Serializable;

public abstract class i implements f, Serializable
{
    public final int C;
    
    public i(final int c) {
        this.C = c;
    }
    
    @Override
    public final int c() {
        return this.C;
    }
    
    @Override
    public final String toString() {
        p.a.getClass();
        String s2;
        final String s = s2 = this.getClass().getGenericInterfaces()[0].toString();
        if (s.startsWith("kotlin.jvm.functions.")) {
            s2 = s.substring(21);
        }
        h.d("renderLambdaToString(...)", (Object)s2);
        return s2;
    }
}
