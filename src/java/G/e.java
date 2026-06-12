package g;

import java.util.HashMap;
import android.os.Parcelable;
import h.a;

public final class e extends c
{
    public final int a;
    public final String b;
    public final a c;
    public final h d;
    
    @Override
    public final void a(final Object o) {
        switch (this.a) {
            default: {
                final h d = this.d;
                final HashMap b = d.b;
                final String b2 = this.b;
                final Integer n = (Integer)b.get((Object)b2);
                final a c = this.c;
                if (n != null) {
                    d.d.add((Object)b2);
                    try {
                        d.b((int)n, c, (Parcelable)o);
                        return;
                    }
                    catch (final Exception ex) {
                        d.d.remove((Object)b2);
                        throw ex;
                    }
                }
                final StringBuilder sb = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sb.append((Object)c);
                sb.append(" and input ");
                sb.append(o);
                sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(sb.toString());
            }
            case 0: {
                final h d2 = this.d;
                final HashMap b3 = d2.b;
                final String b4 = this.b;
                final Integer n2 = (Integer)b3.get((Object)b4);
                final a c2 = this.c;
                if (n2 != null) {
                    d2.d.add((Object)b4);
                    try {
                        d2.b((int)n2, c2, (Parcelable)o);
                        return;
                    }
                    catch (final Exception ex2) {
                        d2.d.remove((Object)b4);
                        throw ex2;
                    }
                }
                final StringBuilder sb2 = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sb2.append((Object)c2);
                sb2.append(" and input ");
                sb2.append(o);
                sb2.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
