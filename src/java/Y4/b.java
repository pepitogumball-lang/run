package Y4;

public final class b extends RuntimeException
{
    public final String C;
    
    public b() {
        super("Launching a URL requires a foreground activity.");
        this.C = "NO_ACTIVITY";
    }
}
