package B5;

import D5.a;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class s
{
    private volatile AtomicReferenceArray<Object> array;
    
    public s(final int n) {
        this.array = (AtomicReferenceArray<Object>)new AtomicReferenceArray(n);
    }
    
    public final int a() {
        return this.array.length();
    }
    
    public final Object b(final int n) {
        final AtomicReferenceArray<Object> array = this.array;
        Object value;
        if (n < array.length()) {
            value = array.get(n);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final void c(final int n, final a a) {
        final AtomicReferenceArray<Object> array = this.array;
        final int length = array.length();
        if (n < length) {
            array.set(n, (Object)a);
            return;
        }
        final int n2 = n + 1;
        final int n3 = length * 2;
        int n4;
        if ((n4 = n2) < n3) {
            n4 = n3;
        }
        final AtomicReferenceArray array2 = new AtomicReferenceArray(n4);
        for (int i = 0; i < length; ++i) {
            array2.set(i, array.get(i));
        }
        array2.set(n, (Object)a);
        this.array = (AtomicReferenceArray<Object>)array2;
    }
}
