package K;

import android.os.LocaleList;

public final class j
{
    public final LocaleList a;
    
    public j(final LocaleList a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals((Object)((j)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
