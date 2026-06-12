package Y3;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import U1.d;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class j implements Parcelable
{
    public static final Parcelable$Creator<j> CREATOR;
    public long C;
    public long D;
    
    static {
        CREATOR = (Parcelable$Creator)new d(10);
    }
    
    public j() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }
    
    public j(final long c, final long d) {
        this.C = c;
        this.D = d;
    }
    
    public final long a() {
        return new j().D - this.D;
    }
    
    public final long b(final j j) {
        return j.D - this.D;
    }
    
    public final long c() {
        return this.C;
    }
    
    public final void d() {
        this.C = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.D = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
    }
}
