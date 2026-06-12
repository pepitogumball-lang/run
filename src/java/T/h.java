package t;

import java.util.NoSuchElementException;
import java.util.Map$Entry;
import java.util.Iterator;

public final class h implements Iterator, Map$Entry
{
    public int C;
    public int D;
    public boolean E;
    public final a F;
    
    public h(final a f) {
        this.F = f;
        this.E = false;
        this.C = f.d() - 1;
        this.D = -1;
    }
    
    @Override
    public final boolean equals(Object b) {
        if (!this.E) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        final boolean b2 = b instanceof Map$Entry;
        final boolean b3 = false;
        if (!b2) {
            return false;
        }
        final Map$Entry map$Entry = (Map$Entry)b;
        final Object key = map$Entry.getKey();
        final int d = this.D;
        final a f = this.F;
        final Object b4 = f.b(d, 0);
        if (key != b4) {
            boolean b5 = b3;
            if (key == null) {
                return b5;
            }
            b5 = b3;
            if (!key.equals(b4)) {
                return b5;
            }
        }
        final Object value = map$Entry.getValue();
        b = f.b(this.D, 1);
        if (value != b) {
            boolean b5 = b3;
            if (value == null) {
                return b5;
            }
            b5 = b3;
            if (!value.equals(b)) {
                return b5;
            }
        }
        return true;
    }
    
    public final Object getKey() {
        if (this.E) {
            return this.F.b(this.D, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public final Object getValue() {
        if (this.E) {
            return this.F.b(this.D, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public final boolean hasNext() {
        return this.D < this.C;
    }
    
    @Override
    public final int hashCode() {
        if (this.E) {
            final int d = this.D;
            final a f = this.F;
            int hashCode = 0;
            final Object b = f.b(d, 0);
            final Object b2 = f.b(this.D, 1);
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            if (b2 != null) {
                hashCode = b2.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public final Object next() {
        if (this.hasNext()) {
            ++this.D;
            this.E = true;
            return this;
        }
        throw new NoSuchElementException();
    }
    
    public final void remove() {
        if (this.E) {
            this.F.g(this.D);
            --this.D;
            --this.C;
            this.E = false;
            return;
        }
        throw new IllegalStateException();
    }
    
    public final Object setValue(final Object o) {
        if (!this.E) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        final a f = this.F;
        final int d = this.D;
        switch (f.d) {
            default: {
                throw new UnsupportedOperationException("not a map");
            }
            case 0: {
                final int n = (d << 1) + 1;
                final Object[] d2 = ((b)f.e).D;
                final Object o2 = d2[n];
                d2[n] = o;
                return o2;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getKey());
        sb.append("=");
        sb.append(this.getValue());
        return sb.toString();
    }
}
