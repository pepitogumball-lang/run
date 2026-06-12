package B5;

import e5.i;
import w5.u;

public final class e implements u
{
    public final i C;
    
    public e(final i c) {
        this.C = c;
    }
    
    @Override
    public final i g() {
        return this.C;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append((Object)this.C);
        sb.append(')');
        return sb.toString();
    }
}
