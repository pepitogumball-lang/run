package m3;

import q3.c;
import c0.f;

public final class e implements j
{
    public static final f E;
    public final Object C;
    public Object D;
    
    static {
        E = new f(9);
    }
    
    public e(final c c) {
        this.C = c;
        this.D = e.E;
    }
    
    public e(final byte[] c, final int[] d) {
        this.C = c;
        this.D = d;
    }
    
    public void b(final i i, final int n) {
        final int[] array = (int[])this.D;
        try {
            i.read((byte[])this.C, array[0], n);
            array[0] += n;
        }
        finally {
            i.close();
        }
    }
}
