package f2;

import e2.d;

public final class m extends UnsupportedOperationException
{
    public final d C;
    
    public m(final d c) {
        this.C = c;
    }
    
    public final String getMessage() {
        return "Missing ".concat(String.valueOf((Object)this.C));
    }
}
