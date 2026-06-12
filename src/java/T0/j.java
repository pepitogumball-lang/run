package t0;

public final class j
{
    public final int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.b);
                sb.append(", mCoordinate=");
                sb.append(this.c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.d);
                sb.append(", mValid=");
                sb.append(this.e);
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
