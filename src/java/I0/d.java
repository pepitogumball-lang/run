package i0;

import com.google.android.gms.internal.ads.Tl;
import androidx.lifecycle.B;
import java.io.PrintWriter;
import androidx.lifecycle.Z;
import c2.k;
import androidx.lifecycle.b0;
import androidx.lifecycle.t;

public final class d extends a
{
    public final t a;
    public final c b;
    
    public d(final t a, final b0 b0) {
        this.a = a;
        this.b = (c)new k(b0, (Z)c.f).o((Class)c.class);
    }
    
    public final void b(final String s, final PrintWriter printWriter) {
        final c b = this.b;
        if (b.d.E > 0) {
            printWriter.print(s);
            printWriter.println("Loaders:");
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("    ");
            final String string = sb.toString();
            int n = 0;
            while (true) {
                final t.k d = b.d;
                if (n >= d.E) {
                    break;
                }
                final b b2 = (b)d.D[n];
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(b.d.C[n]);
                printWriter.print(": ");
                printWriter.println(b2.toString());
                printWriter.print(string);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                Object o = null;
                printWriter.println((Object)null);
                printWriter.print(string);
                printWriter.print("mLoader=");
                printWriter.println((Object)b2.l);
                final c2.d l = b2.l;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("  ");
                final String string2 = sb2.toString();
                l.getClass();
                printWriter.print(string2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println((Object)l.a);
                if (l.b || l.e) {
                    printWriter.print(string2);
                    printWriter.print("mStarted=");
                    printWriter.print(l.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(l.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (l.c || l.d) {
                    printWriter.print(string2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(l.c);
                    printWriter.print(" mReset=");
                    printWriter.println(l.d);
                }
                if (l.g != null) {
                    printWriter.print(string2);
                    printWriter.print("mTask=");
                    printWriter.print((Object)l.g);
                    printWriter.print(" waiting=");
                    l.g.getClass();
                    printWriter.println(false);
                }
                if (l.h != null) {
                    printWriter.print(string2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print((Object)l.h);
                    printWriter.print(" waiting=");
                    l.h.getClass();
                    printWriter.println(false);
                }
                if (b2.n != null) {
                    printWriter.print(string);
                    printWriter.print("mCallbacks=");
                    printWriter.println((Object)b2.n);
                    final Tl n2 = b2.n;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append("  ");
                    final String string3 = sb3.toString();
                    n2.getClass();
                    printWriter.print(string3);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(n2.D);
                }
                printWriter.print(string);
                printWriter.print("mData=");
                final c2.d i = b2.l;
                final Object e = ((B)b2).e;
                if (e != B.k) {
                    o = e;
                }
                i.getClass();
                final StringBuilder sb4 = new StringBuilder(64);
                if (o == null) {
                    sb4.append("null");
                }
                else {
                    final Class<?> class1 = o.getClass();
                    sb4.append(class1.getSimpleName());
                    sb4.append("{");
                    sb4.append(Integer.toHexString(System.identityHashCode((Object)class1)));
                    sb4.append("}");
                }
                printWriter.println(sb4.toString());
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.println(((B)b2).c > 0);
                ++n;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append(" in ");
        final Class<? extends t> class1 = this.a.getClass();
        sb.append(class1.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)class1)));
        sb.append("}}");
        return sb.toString();
    }
}
