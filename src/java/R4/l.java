package R4;

public final class L
{
    public String a;
    public String b;
    
    public String a() {
        final StringBuilder sb = new StringBuilder("Flutter-GMA-5.3.1");
        if (this.a != null) {
            sb.append("_News-");
            sb.append(this.a);
        }
        if (this.b != null) {
            sb.append("_Game-");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
