package Z3;

import com.google.protobuf.a;
import com.google.protobuf.W;
import com.google.protobuf.n;
import v.e;
import com.google.protobuf.S;
import com.google.protobuf.p;

public final class m extends p
{
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final m DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile S PARSER;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_;
    
    static {
        p.s((Class)m.class, (p)(DEFAULT_INSTANCE = new m()));
    }
    
    public m() {
        this.processName_ = "";
    }
    
    public static void u(final m m, final int maxAppJavaHeapMemoryKb_) {
        m.bitField0_ |= 0x10;
        m.maxAppJavaHeapMemoryKb_ = maxAppJavaHeapMemoryKb_;
    }
    
    public static void v(final m m, final int maxEncouragedAppJavaHeapMemoryKb_) {
        m.bitField0_ |= 0x20;
        m.maxEncouragedAppJavaHeapMemoryKb_ = maxEncouragedAppJavaHeapMemoryKb_;
    }
    
    public static void w(final m m, final int deviceRamSizeKb_) {
        m.bitField0_ |= 0x8;
        m.deviceRamSizeKb_ = deviceRamSizeKb_;
    }
    
    public static m x() {
        return m.DEFAULT_INSTANCE;
    }
    
    public static l z() {
        return (l)m.DEFAULT_INSTANCE.l();
    }
    
    public final Object m(final int n) {
        switch (e.d(n)) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                S s;
                if ((s = m.PARSER) == null) {
                    final Class<m> clazz;
                    monitorenter(clazz = m.class);
                    Label_0101: {
                        try {
                            if ((s = m.PARSER) == null) {
                                s = (m.PARSER = (S)new Object());
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
                return m.DEFAULT_INSTANCE;
            }
            case 4: {
                return new n((p)m.DEFAULT_INSTANCE);
            }
            case 3: {
                return new m();
            }
            case 2: {
                return new W((a)m.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u1004\u0002", new Object[] { "bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final boolean y() {
        return (this.bitField0_ & 0x10) != 0x0;
    }
}
