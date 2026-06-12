package m1;

import java.util.Arrays;

public final class p extends B
{
    public final byte[] a;
    public final byte[] b;
    
    public p(final byte[] a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof B) {
            final B b2 = (B)o;
            final boolean b3 = b2 instanceof p;
            byte[] array;
            if (b3) {
                array = ((p)b2).a;
            }
            else {
                array = ((p)b2).a;
            }
            if (Arrays.equals(this.a, array)) {
                byte[] array2;
                if (b3) {
                    array2 = ((p)b2).b;
                }
                else {
                    array2 = ((p)b2).b;
                }
                if (Arrays.equals(this.b, array2)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Arrays.hashCode(this.a) ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExperimentIds{clearBlob=");
        sb.append(Arrays.toString(this.a));
        sb.append(", encryptedBlob=");
        sb.append(Arrays.toString(this.b));
        sb.append("}");
        return sb.toString();
    }
}
