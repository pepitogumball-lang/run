package Z3;

import com.google.protobuf.a;
import com.google.protobuf.W;
import com.google.protobuf.n;
import v.e;
import com.google.protobuf.S;
import com.google.protobuf.p;

public final class k extends p
{
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    private static volatile S PARSER;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;
    
    static {
        p.s((Class)k.class, (p)(DEFAULT_INSTANCE = (k)new p()));
    }
    
    public static void u(final k k, final long clientTimeUs_) {
        k.bitField0_ |= 0x1;
        k.clientTimeUs_ = clientTimeUs_;
    }
    
    public static void v(final k k, final long userTimeUs_) {
        k.bitField0_ |= 0x2;
        k.userTimeUs_ = userTimeUs_;
    }
    
    public static void w(final k k, final long systemTimeUs_) {
        k.bitField0_ |= 0x4;
        k.systemTimeUs_ = systemTimeUs_;
    }
    
    public static j x() {
        return (j)k.DEFAULT_INSTANCE.l();
    }
    
    public final Object m(final int n) {
        switch (e.d(n)) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                S s;
                if ((s = k.PARSER) == null) {
                    final Class<k> clazz;
                    monitorenter(clazz = k.class);
                    Label_0101: {
                        try {
                            if ((s = k.PARSER) == null) {
                                s = (k.PARSER = (S)new Object());
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
                return k.DEFAULT_INSTANCE;
            }
            case 4: {
                return new n((p)k.DEFAULT_INSTANCE);
            }
            case 3: {
                return new p();
            }
            case 2: {
                return new W((a)k.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
