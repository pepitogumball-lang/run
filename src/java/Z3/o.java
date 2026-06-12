package Z3;

import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.W;
import v.e;
import com.google.protobuf.b;
import com.google.protobuf.V;
import com.google.protobuf.t;
import com.google.protobuf.S;
import com.google.protobuf.p;

public final class o extends p
{
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile S PARSER;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private t androidMemoryReadings_;
    private int bitField0_;
    private t cpuMetricReadings_;
    private m gaugeMetadata_;
    private String sessionId_;
    
    static {
        p.s((Class)o.class, (p)(DEFAULT_INSTANCE = new o()));
    }
    
    public o() {
        this.sessionId_ = "";
        final V f = V.F;
        this.cpuMetricReadings_ = (t)f;
        this.androidMemoryReadings_ = (t)f;
    }
    
    public static o A() {
        return o.DEFAULT_INSTANCE;
    }
    
    public static n E() {
        return (n)o.DEFAULT_INSTANCE.l();
    }
    
    public static void u(final o o, final String sessionId_) {
        o.getClass();
        sessionId_.getClass();
        o.bitField0_ |= 0x1;
        o.sessionId_ = sessionId_;
    }
    
    public static void v(final o o, final d d) {
        o.getClass();
        d.getClass();
        final t androidMemoryReadings_ = o.androidMemoryReadings_;
        if (!((b)androidMemoryReadings_).C) {
            o.androidMemoryReadings_ = p.r(androidMemoryReadings_);
        }
        ((List)o.androidMemoryReadings_).add((Object)d);
    }
    
    public static void w(final o o, final m gaugeMetadata_) {
        o.getClass();
        gaugeMetadata_.getClass();
        o.gaugeMetadata_ = gaugeMetadata_;
        o.bitField0_ |= 0x2;
    }
    
    public static void x(final o o, final k k) {
        o.getClass();
        k.getClass();
        final t cpuMetricReadings_ = o.cpuMetricReadings_;
        if (!((b)cpuMetricReadings_).C) {
            o.cpuMetricReadings_ = p.r(cpuMetricReadings_);
        }
        ((List)o.cpuMetricReadings_).add((Object)k);
    }
    
    public final m B() {
        m m;
        if ((m = this.gaugeMetadata_) == null) {
            m = Z3.m.x();
        }
        return m;
    }
    
    public final boolean C() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public final boolean D() {
        final int bitField0_ = this.bitField0_;
        boolean b = true;
        if ((bitField0_ & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final Object m(final int n) {
        switch (e.d(n)) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                S s;
                if ((s = o.PARSER) == null) {
                    final Class<o> clazz;
                    monitorenter(clazz = o.class);
                    Label_0101: {
                        try {
                            if ((s = o.PARSER) == null) {
                                s = (o.PARSER = (S)new Object());
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
                return o.DEFAULT_INSTANCE;
            }
            case 4: {
                return new com.google.protobuf.n((p)o.DEFAULT_INSTANCE);
            }
            case 3: {
                return new o();
            }
            case 2: {
                return new W((a)o.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u001b", new Object[] { "bitField0_", "sessionId_", "cpuMetricReadings_", k.class, "gaugeMetadata_", "androidMemoryReadings_", d.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final int y() {
        return ((List)this.androidMemoryReadings_).size();
    }
    
    public final int z() {
        return ((List)this.cpuMetricReadings_).size();
    }
}
