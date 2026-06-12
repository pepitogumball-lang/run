package B2;

import java.util.Iterator;

public abstract class h implements Iterator
{
    public final int C;
    
    public final void remove() {
        switch (this.C) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
}
