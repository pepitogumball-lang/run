package k3;

import java.io.InputStream;
import java.util.Scanner;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.File;
import android.os.Build;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.os.Debug;
import java.io.IOException;
import android.util.Log;
import java.io.Closeable;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.content.Context;

public abstract class g
{
    public static final char[] a;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    public static long a(final Context context) {
        synchronized (g.class) {
            final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
            return activityManager$MemoryInfo.totalMem;
        }
    }
    
    public static void b(final Closeable closeable, final String s) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final IOException ex) {
                Log.e("FirebaseCrashlytics", s, (Throwable)ex);
            }
        }
    }
    
    public static int c() {
        int f;
        final boolean b = (f = (f() ? 1 : 0)) != 0;
        if (g()) {
            f = ((b ? 1 : 0) | 0x2);
        }
        if (!Debug.isDebuggerConnected()) {
            final int n = f;
            if (!Debug.waitingForDebugger()) {
                return n;
            }
        }
        return f | 0x4;
    }
    
    public static int d(final Context context, final String s, final String s2) {
        final Resources resources = context.getResources();
        final int icon = context.getApplicationContext().getApplicationInfo().icon;
        String s3;
        if (icon > 0) {
            try {
                if ("android".equals((Object)(s3 = context.getResources().getResourcePackageName(icon)))) {
                    s3 = context.getPackageName();
                }
            }
            catch (final Resources$NotFoundException ex) {
                s3 = context.getPackageName();
            }
        }
        else {
            s3 = context.getPackageName();
        }
        return resources.getIdentifier(s, s2, s3);
    }
    
    public static String e(final byte[] array) {
        final char[] array2 = new char[array.length * 2];
        for (int i = 0; i < array.length; ++i) {
            final byte b = array[i];
            final int n = i * 2;
            final char[] a = g.a;
            array2[n] = a[(b & 0xFF) >>> 4];
            array2[n + 1] = a[b & 0xF];
        }
        return new String(array2);
    }
    
    public static boolean f() {
        if (!Build.PRODUCT.contains((CharSequence)"sdk")) {
            final String hardware = Build.HARDWARE;
            if (!hardware.contains((CharSequence)"goldfish")) {
                if (!hardware.contains((CharSequence)"ranchu")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean g() {
        final boolean f = f();
        final String tags = Build.TAGS;
        if (!f && tags != null && tags.contains((CharSequence)"test-keys")) {
            return true;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        final File file = new File("/system/xbin/su");
        return !f && file.exists();
    }
    
    public static String h(String e) {
        final byte[] bytes = e.getBytes();
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            e = e(instance.digest());
        }
        catch (final NoSuchAlgorithmException ex) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", (Throwable)ex);
            e = "";
        }
        return e;
    }
    
    public static String i(final FileInputStream fileInputStream) {
        final Scanner useDelimiter = new Scanner((InputStream)fileInputStream).useDelimiter("\\A");
        String next;
        if (useDelimiter.hasNext()) {
            next = useDelimiter.next();
        }
        else {
            next = "";
        }
        return next;
    }
}
