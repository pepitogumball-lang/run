package io.flutter.view;

import android.view.View;

public final class l
{
    public final View a;
    public final int b;
    
    public l(final View a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        if (this.b != l.b || !this.a.equals(l.a)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() + 31) * 31 + this.b;
    }
}
