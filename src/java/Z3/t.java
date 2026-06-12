package Z3;

import com.google.protobuf.a;
import com.google.protobuf.W;
import com.google.protobuf.n;
import v.e;
import com.google.protobuf.S;
import com.google.protobuf.p;

public final class t extends p implements u
{
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final t DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile S PARSER;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private g applicationInfo_;
    private int bitField0_;
    private o gaugeMetric_;
    private r networkRequestMetric_;
    private A traceMetric_;
    private C transportInfo_;
    
    static {
        p.s((Class)t.class, (p)(DEFAULT_INSTANCE = (t)new p()));
    }
    
    public static s A() {
        return (s)t.DEFAULT_INSTANCE.l();
    }
    
    public static void u(final t t, final g applicationInfo_) {
        t.getClass();
        t.applicationInfo_ = applicationInfo_;
        t.bitField0_ |= 0x1;
    }
    
    public static void v(final t t, final o gaugeMetric_) {
        t.getClass();
        t.gaugeMetric_ = gaugeMetric_;
        t.bitField0_ |= 0x8;
    }
    
    public static void w(final t t, final A traceMetric_) {
        t.getClass();
        t.traceMetric_ = traceMetric_;
        t.bitField0_ |= 0x2;
    }
    
    public static void x(final t t, final r networkRequestMetric_) {
        t.getClass();
        t.networkRequestMetric_ = networkRequestMetric_;
        t.bitField0_ |= 0x4;
    }
    
    public final boolean a() {
        return (this.bitField0_ & 0x8) != 0x0;
    }
    
    public final o b() {
        o o;
        if ((o = this.gaugeMetric_) == null) {
            o = Z3.o.A();
        }
        return o;
    }
    
    public final boolean d() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public final A e() {
        A a;
        if ((a = this.traceMetric_) == null) {
            a = A.H();
        }
        return a;
    }
    
    public final boolean f() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public final r g() {
        r r;
        if ((r = this.networkRequestMetric_) == null) {
            r = Z3.r.J();
        }
        return r;
    }
    
    public final Object m(final int n) {
        switch (e.d(n)) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                S s;
                if ((s = t.PARSER) == null) {
                    final Class<t> clazz;
                    monitorenter(clazz = t.class);
                    Label_0101: {
                        try {
                            if ((s = t.PARSER) == null) {
                                s = (t.PARSER = (S)new Object());
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
                return t.DEFAULT_INSTANCE;
            }
            case 4: {
                return new n((p)t.DEFAULT_INSTANCE);
            }
            case 3: {
                return new p();
            }
            case 2: {
                return new W((a)t.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final g y() {
        g g;
        if ((g = this.applicationInfo_) == null) {
            g = Z3.g.A();
        }
        return g;
    }
    
    public final boolean z() {
        final int bitField0_ = this.bitField0_;
        boolean b = true;
        if ((bitField0_ & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
}
