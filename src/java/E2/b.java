package e2;

import android.os.Parcelable;
import android.os.Parcel;
import h1.m;
import java.util.Arrays;
import h2.A;
import U1.d;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import i2.a;

public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    public static final b G;
    public final int C;
    public final int D;
    public final PendingIntent E;
    public final String F;
    
    static {
        G = new b(0);
        CREATOR = (Parcelable$Creator)new d(27);
    }
    
    public b(final int n) {
        this(1, n, null, null);
    }
    
    public b(final int c, final int d, final PendingIntent e, final String f) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public b(final int n, final PendingIntent pendingIntent) {
        this(1, n, pendingIntent, null);
    }
    
    public static String i(final int n) {
        String string = null;
        Label_0359: {
            if (n != 99) {
                if (n != 1500) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    final StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 20);
                                    sb.append("UNKNOWN_ERROR_CODE(");
                                    sb.append(n);
                                    sb.append(")");
                                    string = sb.toString();
                                    break Label_0359;
                                }
                                case 25: {
                                    string = "API_INSTALL_REQUIRED";
                                    break Label_0359;
                                }
                                case 24: {
                                    string = "API_DISABLED_FOR_CONNECTION";
                                    break Label_0359;
                                }
                                case 23: {
                                    string = "API_DISABLED";
                                    break Label_0359;
                                }
                                case 22: {
                                    string = "RESOLUTION_ACTIVITY_NOT_FOUND";
                                    break Label_0359;
                                }
                                case 21: {
                                    string = "API_VERSION_UPDATE_REQUIRED";
                                    break Label_0359;
                                }
                                case 20: {
                                    string = "RESTRICTED_PROFILE";
                                    break Label_0359;
                                }
                                case 19: {
                                    string = "SERVICE_MISSING_PERMISSION";
                                    break Label_0359;
                                }
                                case 18: {
                                    string = "SERVICE_UPDATING";
                                    break Label_0359;
                                }
                                case 17: {
                                    string = "SIGN_IN_FAILED";
                                    break Label_0359;
                                }
                                case 16: {
                                    string = "API_UNAVAILABLE";
                                    break Label_0359;
                                }
                                case 15: {
                                    string = "INTERRUPTED";
                                    break Label_0359;
                                }
                                case 14: {
                                    string = "TIMEOUT";
                                    break Label_0359;
                                }
                                case 13: {
                                    string = "CANCELED";
                                    break Label_0359;
                                }
                            }
                            break;
                        }
                        case 11: {
                            string = "LICENSE_CHECK_FAILED";
                            break;
                        }
                        case 10: {
                            string = "DEVELOPER_ERROR";
                            break;
                        }
                        case 9: {
                            string = "SERVICE_INVALID";
                            break;
                        }
                        case 8: {
                            string = "INTERNAL_ERROR";
                            break;
                        }
                        case 7: {
                            string = "NETWORK_ERROR";
                            break;
                        }
                        case 6: {
                            string = "RESOLUTION_REQUIRED";
                            break;
                        }
                        case 5: {
                            string = "INVALID_ACCOUNT";
                            break;
                        }
                        case 4: {
                            string = "SIGN_IN_REQUIRED";
                            break;
                        }
                        case 3: {
                            string = "SERVICE_DISABLED";
                            break;
                        }
                        case 2: {
                            string = "SERVICE_VERSION_UPDATE_REQUIRED";
                            break;
                        }
                        case 1: {
                            string = "SERVICE_MISSING";
                            break;
                        }
                        case 0: {
                            string = "SUCCESS";
                            break;
                        }
                        case -1: {
                            string = "UNKNOWN";
                            break;
                        }
                    }
                }
                else {
                    string = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
                }
            }
            else {
                string = "UNFINISHED";
            }
        }
        return string;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return this.D == b.D && A.l((Object)this.E, (Object)b.E) && A.l((Object)this.F, (Object)b.F);
    }
    
    public final boolean h() {
        return this.D == 0;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D, this.E, this.F });
    }
    
    public final String toString() {
        final m m = new m((Object)this);
        m.h("statusCode", (Object)i(this.D));
        m.h("resolution", (Object)this.E);
        m.h("message", (Object)this.F);
        return m.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.u(parcel, 3, (Parcelable)this.E, n, false);
        a.a.v(parcel, 4, this.F, false);
        a.a.E(parcel, d);
    }
}
