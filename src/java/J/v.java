package j;

import android.location.Location;
import android.os.PowerManager;
import java.util.Calendar;
import android.util.Log;
import android.location.LocationManager;
import E.h;
import android.content.IntentFilter;
import w2.e;
import android.content.Context;
import com.google.android.gms.internal.ads.vd;

public final class v extends vd
{
    public final int c;
    public final y d;
    public final Object e;
    
    public v(final y d, final Context context) {
        this.c = 0;
        super(this.d = d);
        this.e = context.getApplicationContext().getSystemService("power");
    }
    
    public v(final y d, final e e) {
        this.c = 1;
        super(this.d = d);
        this.e = e;
    }
    
    public final IntentFilter d() {
        switch (this.c) {
            default: {
                final IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIME_SET");
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter.addAction("android.intent.action.TIME_TICK");
                return intentFilter;
            }
            case 0: {
                final IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter2;
            }
        }
    }
    
    public final int e() {
        switch (this.c) {
            default: {
                final e e = (e)this.e;
                final I i = (I)e.F;
                final long b = i.b;
                final long currentTimeMillis = System.currentTimeMillis();
                int n = 1;
                boolean a;
                if (b > currentTimeMillis) {
                    a = i.a;
                }
                else {
                    final Context context = (Context)e.D;
                    final int b2 = h.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    final Location location = null;
                    final LocationManager locationManager = (LocationManager)e.E;
                    Location lastKnownLocation = null;
                    if (b2 == 0) {
                        Label_0145: {
                            try {
                                if (locationManager.isProviderEnabled("network")) {
                                    lastKnownLocation = locationManager.getLastKnownLocation("network");
                                    break Label_0145;
                                }
                            }
                            catch (final Exception ex) {
                                Log.d("TwilightManager", "Failed to get last known location", (Throwable)ex);
                            }
                            lastKnownLocation = null;
                        }
                    }
                    else {
                        lastKnownLocation = null;
                    }
                    Location lastKnownLocation2 = location;
                    if (h.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        lastKnownLocation2 = location;
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        }
                        catch (final Exception ex2) {
                            Log.d("TwilightManager", "Failed to get last known location", (Throwable)ex2);
                            lastKnownLocation2 = location;
                        }
                    }
                    Location location2 = null;
                    Label_0254: {
                        if (lastKnownLocation2 != null && lastKnownLocation != null) {
                            location2 = lastKnownLocation;
                            if (lastKnownLocation2.getTime() <= lastKnownLocation.getTime()) {
                                break Label_0254;
                            }
                        }
                        else {
                            location2 = lastKnownLocation;
                            if (lastKnownLocation2 == null) {
                                break Label_0254;
                            }
                        }
                        location2 = lastKnownLocation2;
                    }
                    a = false;
                    final boolean b3 = false;
                    if (location2 != null) {
                        final long currentTimeMillis2 = System.currentTimeMillis();
                        if (H.d == null) {
                            H.d = (H)new Object();
                        }
                        final H d = H.d;
                        d.a(currentTimeMillis2 - 86400000L, location2.getLatitude(), location2.getLongitude());
                        d.a(currentTimeMillis2, location2.getLatitude(), location2.getLongitude());
                        a = b3;
                        if (d.c == 1) {
                            a = true;
                        }
                        final long b4 = d.b;
                        long a2 = d.a;
                        d.a(currentTimeMillis2 + 86400000L, location2.getLatitude(), location2.getLongitude());
                        final long b5 = d.b;
                        long b6;
                        if (b4 != -1L && a2 != -1L) {
                            if (currentTimeMillis2 > a2) {
                                a2 = b5;
                            }
                            else if (currentTimeMillis2 <= b4) {
                                a2 = b4;
                            }
                            b6 = a2 + 60000L;
                        }
                        else {
                            b6 = currentTimeMillis2 + 43200000L;
                        }
                        i.a = a;
                        i.b = b6;
                    }
                    else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        final int value = Calendar.getInstance().get(11);
                        if (value < 6 || value >= 22) {
                            a = true;
                        }
                    }
                }
                if (a) {
                    n = 2;
                }
                return n;
            }
            case 0: {
                int n2;
                if (((PowerManager)this.e).isPowerSaveMode()) {
                    n2 = 2;
                }
                else {
                    n2 = 1;
                }
                return n2;
            }
        }
    }
    
    public final void i() {
        switch (this.c) {
            default: {
                this.d.o(true, true);
                return;
            }
            case 0: {
                this.d.o(true, true);
            }
        }
    }
}
