package F1;

import B2.a;
import com.google.android.gms.internal.ads.Wb;
import android.os.Parcel;
import u2.d;
import t2.b;
import com.google.android.gms.internal.ads.F8;
import t2.c;
import com.google.android.gms.internal.ads.G8;
import com.google.android.gms.internal.ads.I8;
import com.google.android.gms.internal.ads.Vb;
import J1.k;
import android.os.RemoteException;
import android.os.IInterface;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.zzbfp;
import android.os.IBinder;
import J1.j;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfm;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;

public final class m extends o
{
    public final NativeAdView b;
    public final FrameLayout c;
    public final Context d;
    public final n e;
    
    public m(final n e, final NativeAdView b, final FrameLayout c, final Context d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object a() {
        n.u(this.d, "native_ad_view_delegate");
        return new zzbfm();
    }
    
    @Override
    public final Object c() {
        final Context d = this.d;
        D7.a(d);
        final boolean booleanValue = (boolean)q.d.c.a(D7.sa);
        final FrameLayout c = this.c;
        final NativeAdView b = this.b;
        final G8 g8 = null;
        final n e = this.e;
        Object o4;
        if (booleanValue) {
            Label_0189: {
                b wrap;
                b wrap2;
                b wrap3;
                try {
                    wrap = ObjectWrapper.wrap((Object)d);
                    wrap2 = ObjectWrapper.wrap((Object)b);
                    wrap3 = ObjectWrapper.wrap((Object)c);
                    final Context context = d;
                    final d d2 = j.b(context);
                    final String s = "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl";
                    final IBinder binder = d2.b(s);
                    final IBinder binder2 = binder;
                    final I8 zzb = zzbfp.zzb(binder2);
                    final I8 zzb2 = zzb;
                    final H8 h8 = (H8)zzb2;
                    final H8 h10;
                    final H8 h9 = h10 = h8;
                    final Parcel parcel = ((a)h10).P1();
                    final Parcel parcel3;
                    final Parcel parcel2 = parcel3 = parcel;
                    final Object o = wrap;
                    F5.e(parcel3, (IInterface)o);
                    final Parcel parcel4 = parcel2;
                    final Object o2 = wrap2;
                    F5.e(parcel4, (IInterface)o2);
                    final Parcel parcel5 = parcel2;
                    final Object o3 = wrap3;
                    F5.e(parcel5, (IInterface)o3);
                    final Parcel parcel6 = parcel2;
                    final int n = 250930000;
                    parcel6.writeInt(n);
                    final H8 h11 = h9;
                    final Parcel parcel7 = parcel2;
                    final int n2 = 1;
                    final Parcel parcel8 = ((a)h11).K4(parcel7, n2);
                    final Parcel parcel10;
                    final Parcel parcel9 = parcel10 = parcel8;
                    final IBinder binder3 = parcel10.readStrongBinder();
                    final Parcel parcel11 = parcel9;
                    parcel11.recycle();
                    final IBinder binder4 = binder3;
                    o4 = zzbfm.zzdy(binder4);
                    return o4;
                }
                catch (final NullPointerException ex) {
                    break Label_0189;
                }
                catch (final RemoteException ex) {
                    break Label_0189;
                }
                catch (final k ex) {
                    break Label_0189;
                }
                try {
                    final Context context = d;
                    final d d2 = j.b(context);
                    final String s = "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl";
                    final IBinder binder = d2.b(s);
                    final IBinder binder2 = binder;
                    final I8 zzb2;
                    final I8 zzb = zzb2 = zzbfp.zzb(binder2);
                    final H8 h8 = (H8)zzb2;
                    final H8 h10;
                    final H8 h9 = h10 = h8;
                    final Parcel parcel = ((a)h10).P1();
                    final Parcel parcel3;
                    final Parcel parcel2 = parcel3 = parcel;
                    final Object o = wrap;
                    F5.e(parcel3, (IInterface)o);
                    final Parcel parcel4 = parcel2;
                    final Object o2 = wrap2;
                    F5.e(parcel4, (IInterface)o2);
                    final Parcel parcel5 = parcel2;
                    final Object o3 = wrap3;
                    F5.e(parcel5, (IInterface)o3);
                    final Parcel parcel6 = parcel2;
                    final int n = 250930000;
                    parcel6.writeInt(n);
                    final H8 h11 = h9;
                    final Parcel parcel7 = parcel2;
                    final int n2 = 1;
                    final Parcel parcel8 = ((a)h11).K4(parcel7, n2);
                    final Parcel parcel10;
                    final Parcel parcel9 = parcel10 = parcel8;
                    final IBinder binder3 = parcel10.readStrongBinder();
                    final Parcel parcel11 = parcel9;
                    parcel11.recycle();
                    final IBinder binder4 = binder3;
                    o4 = zzbfm.zzdy(binder4);
                    return o4;
                }
                catch (final Exception ex2) {
                    throw new Exception((Throwable)ex2);
                }
            }
            final Wb a = Vb.a(d);
            e.getClass();
            final NullPointerException ex;
            a.b("ClientApiBroker.createNativeAdViewDelegate", (Throwable)ex);
            o4 = g8;
        }
        else {
            while (true) {
                final G0 g9 = (G0)e.G;
            Label_0373:
                while (true) {
                    IBinder strongBinder;
                    try {
                        final b wrap4 = ObjectWrapper.wrap((Object)d);
                        final b wrap5 = ObjectWrapper.wrap((Object)b);
                        final b wrap6 = ObjectWrapper.wrap((Object)c);
                        final H8 h12 = (H8)g9.h(d);
                        final Parcel p1 = ((a)h12).P1();
                        F5.e(p1, (IInterface)wrap4);
                        F5.e(p1, (IInterface)wrap5);
                        F5.e(p1, (IInterface)wrap6);
                        p1.writeInt(250930000);
                        final Parcel k4 = ((a)h12).K4(p1, 1);
                        strongBinder = k4.readStrongBinder();
                        k4.recycle();
                        if (strongBinder == null) {
                            o4 = g8;
                            break;
                        }
                        final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                        if (queryLocalInterface instanceof G8) {
                            o4 = queryLocalInterface;
                            break;
                        }
                    }
                    catch (final c c2) {
                        break Label_0373;
                    }
                    catch (final RemoteException c2) {
                        break Label_0373;
                    }
                    o4 = new F8(strongBinder);
                    continue;
                }
                final c c2;
                j.j("Could not create remote NativeAdViewDelegate.", (Throwable)c2);
                o4 = g8;
                break;
            }
        }
        return o4;
    }
}
