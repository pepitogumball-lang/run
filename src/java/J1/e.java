package J1;

import android.os.BaseBundle;
import org.json.JSONException;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.z7;
import java.util.Arrays;
import org.json.JSONObject;
import java.util.Map;
import org.json.JSONArray;
import java.util.Collection;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import java.util.Iterator;
import android.net.Uri$Builder;
import e2.f;
import android.os.Bundle;
import android.os.Build;
import android.os.Build$VERSION;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import android.util.TypedValue;
import com.google.android.gms.internal.ads.o8;
import android.text.TextUtils;
import y1.h;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.content.Context;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.util.Locale;
import java.security.MessageDigest;
import com.google.android.gms.internal.ads.Qr;
import com.google.android.gms.internal.ads.fa;
import z1.c;
import K1.a;
import y1.i;
import android.os.Looper;
import A2.b;

public final class e
{
    public static final b b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public float a;
    
    static {
        b = new b(Looper.getMainLooper(), 3);
        c = i.class.getName();
        d = a.class.getName();
        e = c.class.getName();
        f = fa.class.getName();
        g = Qr.class.getName();
        h = y1.e.class.getName();
    }
    
    public static String a(final String s, final String s2) {
        int i = 0;
        while (i < 2) {
            try {
                final MessageDigest instance = MessageDigest.getInstance(s2);
                instance.update(s.getBytes());
                return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, instance.digest()) });
            }
            catch (final ArithmeticException ex) {
                return null;
            }
            catch (final NoSuchAlgorithmException ex2) {
                ++i;
                continue;
            }
            break;
        }
        return null;
    }
    
    public static int e(final Context context, final int n) {
        if (context != null) {
            Context applicationContext = context;
            if (context.getApplicationContext() != null) {
                applicationContext = context.getApplicationContext();
            }
            final Resources resources = applicationContext.getResources();
            if (resources != null) {
                final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    final Configuration configuration = resources.getConfiguration();
                    if (configuration != null) {
                        final int orientation = configuration.orientation;
                        int n2;
                        if ((n2 = n) == 0) {
                            n2 = orientation;
                        }
                        if (n2 == orientation) {
                            return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                        }
                        return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                    }
                }
            }
        }
        return -1;
    }
    
    public static h g(final Context context, final int n, int n2) {
        n2 = e(context, n2);
        if (n2 == -1) {
            return y1.h.l;
        }
        final int min = Math.min(90, Math.round(n2 * 0.15f));
        if (n > 655) {
            n2 = Math.round(n / 728.0f * 90.0f);
        }
        else if (n > 632) {
            n2 = 81;
        }
        else if (n > 526) {
            n2 = Math.round(n / 468.0f * 60.0f);
        }
        else if (n > 432) {
            n2 = 68;
        }
        else {
            n2 = Math.round(n / 320.0f * 50.0f);
        }
        return new h(n, Math.max(Math.min(n2, min), 50));
    }
    
    public static boolean k(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.startsWith((String)o8.d.p());
    }
    
    public static final int l(final DisplayMetrics displayMetrics, final int n) {
        return (int)TypedValue.applyDimension(1, (float)n, displayMetrics);
    }
    
    public static final boolean m() {
        final boolean booleanValue = (boolean)q.d.c.a(D7.eb);
        boolean startsWith;
        if (Build$VERSION.SDK_INT >= 31) {
            final String fingerprint = Build.FINGERPRINT;
            final boolean contains = fingerprint.contains((CharSequence)"generic");
            startsWith = true;
            if (!contains) {
                startsWith = startsWith;
                if (!fingerprint.contains((CharSequence)"emulator")) {
                    if (booleanValue && Build.HARDWARE.contains((CharSequence)"ranchu")) {
                        return true;
                    }
                    startsWith = false;
                }
            }
        }
        else {
            startsWith = Build.DEVICE.startsWith("generic");
        }
        return startsWith;
    }
    
    public static final void n(final Context context, String s, final Bundle bundle, final d d) {
        Context applicationContext;
        if ((applicationContext = context.getApplicationContext()) == null) {
            applicationContext = context;
        }
        ((BaseBundle)bundle).putString("os", Build$VERSION.RELEASE);
        ((BaseBundle)bundle).putString("api", String.valueOf(Build$VERSION.SDK_INT));
        ((BaseBundle)bundle).putString("appid", applicationContext.getPackageName());
        String string;
        if ((string = s) == null) {
            e2.f.b.getClass();
            final int a = e2.f.a(context);
            final StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(".250930000");
            string = sb.toString();
        }
        ((BaseBundle)bundle).putString("js", string);
        final Uri$Builder appendQueryParameter = new Uri$Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        final Iterator iterator = ((BaseBundle)bundle).keySet().iterator();
        while (iterator.hasNext()) {
            s = (String)iterator.next();
            appendQueryParameter.appendQueryParameter(s, ((BaseBundle)bundle).getString(s));
        }
        d.p(appendQueryParameter.toString());
    }
    
    public static final int o(final Context context, final int n) {
        return l(context.getResources().getDisplayMetrics(), n);
    }
    
    public static final String p(final Context context) {
        final ContentResolver contentResolver = context.getContentResolver();
        String string;
        if (contentResolver == null) {
            string = null;
        }
        else {
            string = Settings$Secure.getString(contentResolver, "android_id");
        }
        if (string == null || m()) {
            string = "emulator";
        }
        return a(string, "MD5");
    }
    
    public final JSONArray b(final Collection collection) {
        final JSONArray jsonArray = new JSONArray();
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.c(jsonArray, iterator.next());
        }
        return jsonArray;
    }
    
    public final void c(final JSONArray jsonArray, final Object o) {
        if (o instanceof Bundle) {
            jsonArray.put((Object)this.i((Bundle)o));
            return;
        }
        if (o instanceof Map) {
            jsonArray.put((Object)this.j((Map)o));
            return;
        }
        if (o instanceof Collection) {
            jsonArray.put((Object)this.b((Collection)o));
            return;
        }
        if (o instanceof Object[]) {
            jsonArray.put((Object)this.h((Object[])o));
            return;
        }
        jsonArray.put(o);
    }
    
    public final void d(final JSONObject jsonObject, final String s, final Object o) {
        final z7 o2 = D7.o;
        String value = s;
        if (q.d.c.a(o2)) {
            value = String.valueOf((Object)s);
        }
        if (o instanceof Bundle) {
            jsonObject.put(value, (Object)this.i((Bundle)o));
            return;
        }
        if (o instanceof Map) {
            jsonObject.put(value, (Object)this.j((Map)o));
            return;
        }
        if (o instanceof Collection) {
            jsonObject.put(String.valueOf((Object)value), (Object)this.b((Collection)o));
            return;
        }
        if (o instanceof Object[]) {
            jsonObject.put(value, (Object)this.b((Collection)Arrays.asList((Object[])o)));
            return;
        }
        final boolean b = o instanceof int[];
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        if (b) {
            final int[] array = (int[])o;
            Integer[] array2;
            if (array == null) {
                array2 = new Integer[0];
            }
            else {
                final int length = array.length;
                array2 = new Integer[length];
                while (i < length) {
                    array2[i] = array[i];
                    ++i;
                }
            }
            jsonObject.put(value, (Object)this.h(array2));
            return;
        }
        if (o instanceof double[]) {
            final double[] array3 = (double[])o;
            Double[] array4;
            if (array3 == null) {
                array4 = new Double[0];
            }
            else {
                final int length2 = array3.length;
                array4 = new Double[length2];
                for (int j = n; j < length2; ++j) {
                    array4[j] = array3[j];
                }
            }
            jsonObject.put(value, (Object)this.h(array4));
            return;
        }
        if (o instanceof long[]) {
            final long[] array5 = (long[])o;
            Long[] array6;
            if (array5 == null) {
                array6 = new Long[0];
            }
            else {
                final int length3 = array5.length;
                array6 = new Long[length3];
                for (int k = n2; k < length3; ++k) {
                    array6[k] = array5[k];
                }
            }
            jsonObject.put(value, (Object)this.h(array6));
            return;
        }
        if (o instanceof boolean[]) {
            final boolean[] array7 = (boolean[])o;
            Boolean[] array8;
            if (array7 == null) {
                array8 = new Boolean[0];
            }
            else {
                final int length4 = array7.length;
                array8 = new Boolean[length4];
                for (int l = n3; l < length4; ++l) {
                    array8[l] = array7[l];
                }
            }
            jsonObject.put(value, (Object)this.h(array8));
            return;
        }
        jsonObject.put(value, o);
    }
    
    public final int f(final Context context, final int n) {
        if (this.a < 0.0f) {
            monitorenter(this);
            while (true) {
                Label_0047: {
                    try {
                        if (this.a >= 0.0f) {
                            break Label_0075;
                        }
                        final WindowManager windowManager = (WindowManager)context.getSystemService("window");
                        if (windowManager == null) {
                            monitorexit(this);
                            return 0;
                        }
                        break Label_0047;
                    }
                    finally {
                        monitorexit(this);
                        monitorexit(this);
                        return Math.round(n / this.a);
                        final WindowManager windowManager;
                        final Display defaultDisplay = windowManager.getDefaultDisplay();
                        final DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.a = displayMetrics.density;
                        continue;
                    }
                }
                break;
            }
        }
        return Math.round(n / this.a);
    }
    
    public final JSONArray h(final Object[] array) {
        final JSONArray jsonArray = new JSONArray();
        for (int length = array.length, i = 0; i < length; ++i) {
            this.c(jsonArray, array[i]);
        }
        return jsonArray;
    }
    
    public final JSONObject i(final Bundle bundle) {
        final JSONObject jsonObject = new JSONObject();
        for (final String s : ((BaseBundle)bundle).keySet()) {
            this.d(jsonObject, s, ((BaseBundle)bundle).get(s));
        }
        return jsonObject;
    }
    
    public final JSONObject j(final Map map) {
        JSONObject jsonObject;
        try {
            jsonObject = new JSONObject();
            for (final String s : map.keySet()) {
                this.d(jsonObject, s, map.get((Object)s));
            }
        }
        catch (final ClassCastException ex) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf((Object)((Throwable)ex).getMessage())));
        }
        return jsonObject;
    }
}
