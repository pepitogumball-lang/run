package n5;

import s5.a;
import m5.p;
import s5.c;

public final class l extends m implements c, p
{
    public l(final Class clazz) {
        super((Object)b.C, clazz, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }
    
    public final a a() {
        n5.p.a.getClass();
        return (a)this;
    }
    
    public final Object f(final Object o, final Object o2) {
        this.h();
        throw null;
    }
    
    public final void h() {
        if (super.I) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        final a e = this.e();
        if (e != this) {
            ((l)e).h();
            return;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
