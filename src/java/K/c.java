package K;

import android.util.SizeF;
import android.util.Size;
import android.os.Bundle;

public abstract class c
{
    public static final void a(final Bundle bundle, final String s, final Size size) {
        bundle.putSize(s, size);
    }
    
    public static final void b(final Bundle bundle, final String s, final SizeF sizeF) {
        bundle.putSizeF(s, sizeF);
    }
}
