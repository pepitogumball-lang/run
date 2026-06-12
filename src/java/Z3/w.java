package Z3;

import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.W;
import com.google.protobuf.n;
import v.e;
import java.util.Arrays;
import com.google.protobuf.b;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.s;
import com.google.protobuf.S;
import com.google.protobuf.p;

public final class w extends p
{
    private static final w DEFAULT_INSTANCE;
    private static volatile S PARSER;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final s sessionVerbosity_converter_;
    private int bitField0_;
    private String sessionId_;
    private r sessionVerbosity_;
    
    static {
        sessionVerbosity_converter_ = (s)new Object();
        p.s((Class)w.class, (p)(DEFAULT_INSTANCE = new w()));
    }
    
    public w() {
        this.sessionId_ = "";
        this.sessionVerbosity_ = (r)q.F;
    }
    
    public static void u(final w w, final String sessionId_) {
        w.getClass();
        sessionId_.getClass();
        w.bitField0_ |= 0x1;
        w.sessionId_ = sessionId_;
    }
    
    public static void v(final w w) {
        w.getClass();
        final r sessionVerbosity_ = w.sessionVerbosity_;
        if (!((b)sessionVerbosity_).C) {
            final int size = ((List)sessionVerbosity_).size();
            int n;
            if (size == 0) {
                n = 10;
            }
            else {
                n = size * 2;
            }
            final q q = (q)sessionVerbosity_;
            if (n < q.E) {
                throw new IllegalArgumentException();
            }
            w.sessionVerbosity_ = (r)new q(Arrays.copyOf(q.D, n), q.E, true);
        }
        ((q)w.sessionVerbosity_).h(e.d(2));
    }
    
    public static v y() {
        return (v)w.DEFAULT_INSTANCE.l();
    }
    
    public final Object m(final int n) {
        switch (e.d(n)) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                S s;
                if ((s = w.PARSER) == null) {
                    final Class<w> clazz;
                    monitorenter(clazz = w.class);
                    Label_0101: {
                        try {
                            if ((s = w.PARSER) == null) {
                                s = (w.PARSER = (S)new Object());
                            }
                            break Label_0101;
                        }
                        finally {
                            monitorexit(clazz);
                            monitorexit(clazz);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return w.DEFAULT_INSTANCE;
            }
            case 4: {
                return new n((p)w.DEFAULT_INSTANCE);
            }
            case 3: {
                return new w();
            }
            case 2: {
                return new W((a)w.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u081e", new Object[] { "bitField0_", "sessionId_", "sessionVerbosity_", h.d });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final int w() {
        final q q = (q)this.sessionVerbosity_;
        int n = 0;
        final int p = q.p(0);
        final int n2 = 1;
        if (p != 0) {
            if (p == 1) {
                n = 2;
            }
        }
        else {
            n = 1;
        }
        if (n == 0) {
            n = n2;
        }
        return n;
    }
    
    public final int x() {
        return ((List)this.sessionVerbosity_).size();
    }
}
