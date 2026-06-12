package q0;

public final class a
{
    public final boolean a;
    
    public a(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        a.getClass();
        if (this.a != a.a) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.a) + 1169068184;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=");
        sb.append(this.a);
        return sb.toString();
    }
}
