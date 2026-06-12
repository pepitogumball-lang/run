package k3;

import n3.b0;
import n3.X;
import android.content.Intent;
import android.os.StatFs;
import android.os.Environment;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.hardware.SensorManager;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import n3.c0;
import n3.T;
import n3.V;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.internal.measurement.L;
import n3.y0;
import n3.U;
import com.google.android.gms.internal.ads.Rc;
import java.util.Locale;
import Y3.a;
import h1.m;
import C2.c;
import android.content.Context;
import java.util.HashMap;

public final class t
{
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final z b;
    public final c c;
    public final m d;
    public final C2.z e;
    
    static {
        final HashMap f2 = new HashMap();
        a.m(5, f = f2, "armeabi", 6, "armeabi-v7a");
        a.m(9, f2, "arm64-v8a", 0, "x86");
        f2.put((Object)"x86_64", (Object)1);
        final Locale us = Locale.US;
        g = "Crashlytics Android SDK/19.3.0";
    }
    
    public t(final Context a, final z b, final c c, final m d, final C2.z e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static U c(final Rc rc, final int n) {
        final String s = (String)rc.E;
        int n2 = 0;
        int n3 = 0;
        StackTraceElement[] array = (StackTraceElement[])rc.F;
        if (array == null) {
            array = new StackTraceElement[0];
        }
        final Rc rc2 = (Rc)rc.G;
        if (n >= 8) {
            Rc rc3 = rc2;
            while (true) {
                n2 = n3;
                if (rc3 == null) {
                    break;
                }
                ++n3;
                rc3 = (Rc)rc3.G;
            }
        }
        final List d = d(array, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        final byte b = (byte)((false | true) ? 1 : 0);
        Object c;
        final Object o = c = null;
        if (rc2 != null) {
            c = o;
            if (n2 == 0) {
                c = c(rc2, n + 1);
            }
        }
        if (b == 1) {
            return new U(s, (String)rc.D, d, (y0)c, n2);
        }
        final StringBuilder sb = new StringBuilder();
        if ((b & 0x1) == 0x0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(L.k("Missing required properties:", sb));
    }
    
    public static List d(final StackTraceElement[] array, final int e) {
        final ArrayList list = new ArrayList();
        for (final StackTraceElement stackTraceElement : array) {
            final Object o = new Object();
            ((X)o).e = e;
            ((X)o).f |= 0x4;
            final boolean nativeMethod = stackTraceElement.isNativeMethod();
            final long n = 0L;
            long max;
            if (nativeMethod) {
                max = Math.max((long)stackTraceElement.getLineNumber(), 0L);
            }
            else {
                max = 0L;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            final String string = sb.toString();
            final String fileName = stackTraceElement.getFileName();
            long d = n;
            if (!stackTraceElement.isNativeMethod()) {
                d = n;
                if (stackTraceElement.getLineNumber() > 0) {
                    d = stackTraceElement.getLineNumber();
                }
            }
            ((X)o).a = max;
            final byte f = (byte)(((X)o).f | 0x1);
            ((X)o).f = f;
            if (string == null) {
                throw new NullPointerException("Null symbol");
            }
            ((X)o).b = string;
            ((X)o).c = fileName;
            ((X)o).d = d;
            ((X)o).f = (byte)(f | 0x2);
            list.add((Object)((X)o).a());
        }
        return Collections.unmodifiableList((List)list);
    }
    
    public static V e() {
        final byte b = 1;
        if (b == 1) {
            return new V("0", "0", 0L);
        }
        final StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(L.k("Missing required properties:", sb));
    }
    
    public final List a() {
        final byte b = (byte)((byte)((false | true) ? 1 : 0) | 0x2);
        final c c = this.c;
        final String s = (String)c.G;
        if (s == null) {
            throw new NullPointerException("Null name");
        }
        if (b == 3) {
            return Collections.singletonList((Object)new T(0L, 0L, s, (String)c.D));
        }
        final StringBuilder sb = new StringBuilder();
        if ((b & 0x1) == 0x0) {
            sb.append(" baseAddress");
        }
        if ((b & 0x2) == 0x0) {
            sb.append(" size");
        }
        throw new IllegalStateException(L.k("Missing required properties:", sb));
    }
    
    public final c0 b(int d) {
        final Context a = this.a;
        Double value = null;
        boolean c = false;
        int n = 0;
        Float value2 = null;
        Label_0166: {
            int n2 = 0;
            Label_0161: {
                Throwable t = null;
                Label_0147: {
                    while (true) {
                        try {
                            final Intent registerReceiver = a.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                            if (registerReceiver != null) {
                                final int intExtra = registerReceiver.getIntExtra("status", -1);
                                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                try {
                                    final int intExtra2 = registerReceiver.getIntExtra("level", -1);
                                    final int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                                    n2 = n;
                                    if (intExtra2 == -1) {
                                        break Label_0161;
                                    }
                                    if (intExtra3 == -1) {
                                        n2 = n;
                                        break Label_0161;
                                    }
                                    value2 = intExtra2 / (float)intExtra3;
                                    break Label_0166;
                                }
                                catch (final IllegalStateException t) {
                                    break Label_0147;
                                }
                                n = 0;
                                break Label_0147;
                            }
                            value2 = null;
                            n = 0;
                            break Label_0166;
                        }
                        catch (final IllegalStateException ex) {}
                        final IllegalStateException ex;
                        t = (Throwable)ex;
                        continue;
                    }
                }
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", t);
                n2 = n;
            }
            value2 = null;
            n = n2;
        }
        if (value2 != null) {
            value = (double)value2;
        }
        int b;
        if (n != 0 && value2 != null) {
            if (value2 < 0.99) {
                b = 2;
            }
            else {
                b = 3;
            }
        }
        else {
            b = 1;
        }
        if (!k3.g.f()) {
            if (((SensorManager)a.getSystemService("sensor")).getDefaultSensor(8) != null) {
                c = true;
            }
        }
        final long a2 = k3.g.a(a);
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)a.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        long e = a2 - activityManager$MemoryInfo.availMem;
        if (e <= 0L) {
            e = 0L;
        }
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        final long n3 = statFs.getBlockSize();
        final long n4 = statFs.getBlockCount();
        final long n5 = statFs.getAvailableBlocks();
        final Object o = new Object();
        ((b0)o).a = value;
        ((b0)o).b = b;
        final byte b2 = (byte)(((b0)o).g | 0x1);
        ((b0)o).c = c;
        final byte b3 = (byte)(b2 | 0x2);
        ((b0)o).d = d;
        d = (byte)(b3 | 0x4);
        ((b0)o).e = e;
        d = (byte)(d | 0x8);
        ((b0)o).f = n4 * n3 - n3 * n5;
        ((b0)o).g = (byte)(d | 0x10);
        return ((b0)o).a();
    }
}
