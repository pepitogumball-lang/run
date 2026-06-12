package Z3;

import com.google.protobuf.W;
import com.google.protobuf.n;
import v.e;
import com.google.protobuf.a;
import com.google.protobuf.b;
import java.util.List;
import com.google.protobuf.V;
import com.google.protobuf.t;
import com.google.protobuf.I;
import com.google.protobuf.S;
import com.google.protobuf.p;

public final class r extends p
{
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final r DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile S PARSER;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private I customAttributes_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private t perfSessions_;
    private long requestPayloadBytes_;
    private String responseContentType_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_;
    
    static {
        p.s((Class)r.class, (p)(DEFAULT_INSTANCE = new r()));
    }
    
    public r() {
        this.customAttributes_ = I.D;
        this.url_ = "";
        this.responseContentType_ = "";
        this.perfSessions_ = (t)V.F;
    }
    
    public static void A(final r r, final long timeToRequestCompletedUs_) {
        r.bitField0_ |= 0x100;
        r.timeToRequestCompletedUs_ = timeToRequestCompletedUs_;
    }
    
    public static void B(final r r, final long timeToResponseInitiatedUs_) {
        r.bitField0_ |= 0x200;
        r.timeToResponseInitiatedUs_ = timeToResponseInitiatedUs_;
    }
    
    public static void C(final r r, final long timeToResponseCompletedUs_) {
        r.bitField0_ |= 0x400;
        r.timeToResponseCompletedUs_ = timeToResponseCompletedUs_;
    }
    
    public static I D(final r r) {
        final I customAttributes_ = r.customAttributes_;
        if (!customAttributes_.C) {
            r.customAttributes_ = customAttributes_.d();
        }
        return r.customAttributes_;
    }
    
    public static void E(final r r, final List list) {
        final t perfSessions_ = r.perfSessions_;
        if (!((b)perfSessions_).C) {
            r.perfSessions_ = p.r(perfSessions_);
        }
        a.c((List)list, (List)r.perfSessions_);
    }
    
    public static void F(final r r, final int n) {
        r.getClass();
        r.httpMethod_ = e.d(n);
        r.bitField0_ |= 0x2;
    }
    
    public static void G(final r r, final long requestPayloadBytes_) {
        r.bitField0_ |= 0x4;
        r.requestPayloadBytes_ = requestPayloadBytes_;
    }
    
    public static void H(final r r, final long responsePayloadBytes_) {
        r.bitField0_ |= 0x8;
        r.responsePayloadBytes_ = responsePayloadBytes_;
    }
    
    public static r J() {
        return r.DEFAULT_INSTANCE;
    }
    
    public static Z3.p b0() {
        return (Z3.p)r.DEFAULT_INSTANCE.l();
    }
    
    public static void u(final r r, final String url_) {
        r.getClass();
        url_.getClass();
        r.bitField0_ |= 0x1;
        r.url_ = url_;
    }
    
    public static void v(final r r) {
        r.getClass();
        r.networkClientErrorReason_ = e.d(2);
        r.bitField0_ |= 0x10;
    }
    
    public static void w(final r r, final int httpResponseCode_) {
        r.bitField0_ |= 0x20;
        r.httpResponseCode_ = httpResponseCode_;
    }
    
    public static void x(final r r, final String responseContentType_) {
        r.getClass();
        responseContentType_.getClass();
        r.bitField0_ |= 0x40;
        r.responseContentType_ = responseContentType_;
    }
    
    public static void y(final r r) {
        r.bitField0_ &= 0xFFFFFFBF;
        r.responseContentType_ = r.DEFAULT_INSTANCE.responseContentType_;
    }
    
    public static void z(final r r, final long clientStartTimeUs_) {
        r.bitField0_ |= 0x80;
        r.clientStartTimeUs_ = clientStartTimeUs_;
    }
    
    public final long I() {
        return this.clientStartTimeUs_;
    }
    
    public final int K() {
        final int httpMethod_ = this.httpMethod_;
        final int n = 1;
        int n2 = 0;
        switch (httpMethod_) {
            default: {
                n2 = 0;
                break;
            }
            case 9: {
                n2 = 10;
                break;
            }
            case 8: {
                n2 = 9;
                break;
            }
            case 7: {
                n2 = 8;
                break;
            }
            case 6: {
                n2 = 7;
                break;
            }
            case 5: {
                n2 = 6;
                break;
            }
            case 4: {
                n2 = 5;
                break;
            }
            case 3: {
                n2 = 4;
                break;
            }
            case 2: {
                n2 = 3;
                break;
            }
            case 1: {
                n2 = 2;
                break;
            }
            case 0: {
                n2 = 1;
                break;
            }
        }
        if (n2 == 0) {
            n2 = n;
        }
        return n2;
    }
    
    public final int L() {
        return this.httpResponseCode_;
    }
    
    public final t M() {
        return this.perfSessions_;
    }
    
    public final long N() {
        return this.requestPayloadBytes_;
    }
    
    public final long O() {
        return this.responsePayloadBytes_;
    }
    
    public final long P() {
        return this.timeToRequestCompletedUs_;
    }
    
    public final long Q() {
        return this.timeToResponseCompletedUs_;
    }
    
    public final long R() {
        return this.timeToResponseInitiatedUs_;
    }
    
    public final String S() {
        return this.url_;
    }
    
    public final boolean T() {
        return (this.bitField0_ & 0x80) != 0x0;
    }
    
    public final boolean U() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public final boolean V() {
        return (this.bitField0_ & 0x20) != 0x0;
    }
    
    public final boolean W() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public final boolean X() {
        return (this.bitField0_ & 0x8) != 0x0;
    }
    
    public final boolean Y() {
        return (this.bitField0_ & 0x100) != 0x0;
    }
    
    public final boolean Z() {
        return (this.bitField0_ & 0x400) != 0x0;
    }
    
    public final boolean a0() {
        return (this.bitField0_ & 0x200) != 0x0;
    }
    
    public final Object m(final int n) {
        switch (e.d(n)) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                S s;
                if ((s = r.PARSER) == null) {
                    final Class<r> clazz;
                    monitorenter(clazz = r.class);
                    Label_0101: {
                        try {
                            if ((s = r.PARSER) == null) {
                                s = (r.PARSER = (S)new Object());
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
                return r.DEFAULT_INSTANCE;
            }
            case 4: {
                return new n((p)r.DEFAULT_INSTANCE);
            }
            case 3: {
                return new r();
            }
            case 2: {
                return new W((a)r.DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1004\u0005\u0006\u1008\u0006\u0007\u1002\u0007\b\u1002\b\t\u1002\t\n\u1002\n\u000b\u180c\u0004\f2\r\u001b", new Object[] { "bitField0_", "url_", "httpMethod_", h.b, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", h.c, "customAttributes_", q.a, "perfSessions_", w.class });
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
