package F1;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import com.google.android.gms.internal.ads.F5;
import android.os.Bundle;
import android.os.IBinder;
import B2.a;

public final class m0 extends a implements n0
{
    public m0(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.internal.client.IResponseInfo", 1);
    }
    
    @Override
    public final Bundle b() {
        final Parcel k4 = this.K4(this.P1(), 5);
        final Bundle bundle = (Bundle)F5.a(k4, Bundle.CREATOR);
        k4.recycle();
        return bundle;
    }
    
    @Override
    public final R0 c() {
        final Parcel k4 = this.K4(this.P1(), 4);
        final R0 r0 = (R0)F5.a(k4, (Parcelable$Creator)R0.CREATOR);
        k4.recycle();
        return r0;
    }
    
    @Override
    public final String e() {
        final Parcel k4 = this.K4(this.P1(), 2);
        final String string = k4.readString();
        k4.recycle();
        return string;
    }
    
    @Override
    public final String f() {
        final Parcel k4 = this.K4(this.P1(), 1);
        final String string = k4.readString();
        k4.recycle();
        return string;
    }
    
    @Override
    public final String i() {
        final Parcel k4 = this.K4(this.P1(), 6);
        final String string = k4.readString();
        k4.recycle();
        return string;
    }
    
    @Override
    public final List j() {
        final Parcel k4 = this.K4(this.P1(), 3);
        final ArrayList typedArrayList = k4.createTypedArrayList((Parcelable$Creator)R0.CREATOR);
        k4.recycle();
        return (List)typedArrayList;
    }
}
