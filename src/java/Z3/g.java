package Z3;

import com.google.protobuf.a;
import com.google.protobuf.W;
import com.google.protobuf.n;
import com.google.protobuf.I;
import com.google.protobuf.S;
import com.google.protobuf.p;

public final class g extends p
{
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final g DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile S PARSER;
    private b androidAppInfo_;
    private String appInstanceId_;
    private int applicationProcessState_;
    private int bitField0_;
    private I customAttributes_;
    private String googleAppId_;
    
    static {
        p.s((Class)g.class, (p)(DEFAULT_INSTANCE = new g()));
    }
    
    public g() {
        this.customAttributes_ = I.D;
        this.googleAppId_ = "";
        this.appInstanceId_ = "";
    }
    
    public static g A() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static e F() {
        return (e)g.DEFAULT_INSTANCE.l();
    }
    
    public static void u(final g g, final String googleAppId_) {
        g.getClass();
        googleAppId_.getClass();
        g.bitField0_ |= 0x1;
        g.googleAppId_ = googleAppId_;
    }
    
    public static void v(final g g, final i i) {
        g.getClass();
        g.applicationProcessState_ = i.C;
        g.bitField0_ |= 0x8;
    }
    
    public static I w(final g g) {
        final I customAttributes_ = g.customAttributes_;
        if (!customAttributes_.C) {
            g.customAttributes_ = customAttributes_.d();
        }
        return g.customAttributes_;
    }
    
    public static void x(final g g, final String appInstanceId_) {
        g.getClass();
        appInstanceId_.getClass();
        g.bitField0_ |= 0x2;
        g.appInstanceId_ = appInstanceId_;
    }
    
    public static void y(final g g, final b androidAppInfo_) {
        g.getClass();
        g.androidAppInfo_ = androidAppInfo_;
        g.bitField0_ |= 0x4;
    }
    
    public final boolean B() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public final boolean C() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public final boolean D() {
        return (this.bitField0_ & 0x8) != 0x0;
    }
    
    public final boolean E() {
        final int bitField0_ = this.bitField0_;
        boolean b = true;
        if ((bitField0_ & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final Object m(final int n) {
        switch (v.e.d(n)) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                S s;
                if ((s = g.PARSER) == null) {
                    final Class<g> clazz;
                    monitorenter(clazz = g.class);
                    Label_0101: {
                        try {
                            if ((s = g.PARSER) == null) {
                                s = (g.PARSER = (S)new Object());
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
                return g.DEFAULT_INSTANCE;
            }
            case 4: {
                return new n((p)g.DEFAULT_INSTANCE);
            }
            case 3: {
                return new g();
            }
            case 2: {
                return new W((a)g.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0005\u180c\u0003\u00062", new Object[] { "bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", h.a, "customAttributes_", f.a });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final b z() {
        b b;
        if ((b = this.androidAppInfo_) == null) {
            b = Z3.b.x();
        }
        return b;
    }
}
