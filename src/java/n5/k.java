package n5;

import s5.a;
import m5.l;
import s5.c;

public final class k extends m implements c, l
{
    public final a a() {
        p.a.getClass();
        return (a)this;
    }
    
    public final Object g(final Object o) {
        this.h();
        throw null;
    }
    
    public final void h() {
        if (super.I) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        final a e = this.e();
        if (e != this) {
            ((k)e).h();
            return;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
