package K2;

import android.os.BaseBundle;
import java.util.Iterator;

public final class t implements Iterator
{
    public final Iterator C;
    
    public t(final u u) {
        this.C = ((BaseBundle)u.C).keySet().iterator();
    }
    
    public final boolean hasNext() {
        return this.C.hasNext();
    }
    
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
