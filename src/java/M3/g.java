package m3;

import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.util.Collections;
import java.io.File;
import java.util.Map;
import org.json.JSONException;
import java.util.List;
import X.a;
import org.json.JSONArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import java.util.HashMap;
import q3.c;
import java.nio.charset.Charset;

public final class g
{
    public static final Charset b;
    public final c a;
    
    static {
        b = Charset.forName("UTF-8");
    }
    
    public g(final c a) {
        this.a = a;
    }
    
    public static HashMap a(String optString) {
        final JSONObject jsonObject = new JSONObject(optString);
        final HashMap hashMap = new HashMap();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = (String)keys.next();
            final boolean null = jsonObject.isNull(s);
            optString = null;
            if (!null) {
                optString = jsonObject.optString(s, (String)null);
            }
            hashMap.put((Object)s, (Object)optString);
        }
        return hashMap;
    }
    
    public static ArrayList b(String s) {
        final JSONArray jsonArray = new JSONObject(s).getJSONArray("rolloutsState");
        final ArrayList list = new ArrayList();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final String string = jsonArray.getString(i);
            try {
                final a a = m.a;
                final JSONObject jsonObject = new JSONObject(string);
                final String string2 = jsonObject.getString("rolloutId");
                final String string3 = jsonObject.getString("parameterKey");
                s = jsonObject.getString("parameterValue");
                final String string4 = jsonObject.getString("variantId");
                final long long1 = jsonObject.getLong("templateVersion");
                if (s.length() > 256) {
                    s = s.substring(0, 256);
                }
                list.add((Object)new b(string2, string3, s, string4, long1));
            }
            catch (final Exception ex) {
                final StringBuilder sb = new StringBuilder("Failed de-serializing rollouts state. ");
                sb.append(string);
                Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)ex);
            }
        }
        return list;
    }
    
    public static String e(final List list) {
        final HashMap hashMap = new HashMap();
        final JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < list.size(); ++i) {
            final String t = m.a.t(list.get(i));
            try {
                jsonArray.put((Object)new JSONObject(t));
            }
            catch (final JSONException ex) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", (Throwable)ex);
            }
        }
        hashMap.put((Object)"rolloutsState", (Object)jsonArray);
        return new JSONObject((Map)hashMap).toString();
    }
    
    public static void f(final File file) {
        if (file.exists() && file.delete()) {
            final StringBuilder sb = new StringBuilder("Deleted corrupt file: ");
            sb.append(file.getAbsolutePath());
            Log.i("FirebaseCrashlytics", sb.toString(), (Throwable)null);
        }
    }
    
    public static void g(final File file, final String s) {
        if (file.exists() && file.delete()) {
            final String absolutePath = file.getAbsolutePath();
            final StringBuilder sb = new StringBuilder("Deleted corrupt file: ");
            sb.append(absolutePath);
            sb.append("\nReason: ");
            sb.append(s);
            Log.i("FirebaseCrashlytics", sb.toString(), (Throwable)null);
        }
    }
    
    public final Map c(final String s, final boolean b) {
        final c a = this.a;
        File file;
        if (b) {
            file = a.e(s, "internal-keys");
        }
        else {
            file = a.e(s, "keys");
        }
        if (!file.exists() || file.length() == 0L) {
            final StringBuilder sb = new StringBuilder("The file has a length of zero for session: ");
            sb.append(s);
            g(file, sb.toString());
            return Collections.emptyMap();
        }
        Closeable closeable2 = null;
        Label_0129: {
            Closeable closeable;
            try {
                final FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        final HashMap a2 = a(k3.g.i(fileInputStream));
                        k3.g.b((Closeable)fileInputStream, "Failed to close user metadata file.");
                        return (Map)a2;
                    }
                    finally {}
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex) {
                closeable = null;
            }
            finally {
                closeable2 = null;
                break Label_0129;
            }
            final Exception ex;
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", (Throwable)ex);
            f(file);
            k3.g.b(closeable, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
        k3.g.b(closeable2, "Failed to close user metadata file.");
    }
    
    public final String d(String s) {
        final File e = this.a.e(s, "user-data");
        final boolean exists = e.exists();
        Object o = null;
        if (!exists || e.length() == 0L) {
            s = m0.a.f("No userId set for session ", s);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", s, (Throwable)null);
            }
            f(e);
            return null;
        }
        Label_0253: {
            Object o2 = null;
            Closeable closeable;
            try {
                o2 = (o = new FileInputStream(e));
                try {
                    try {
                        final JSONObject jsonObject = new JSONObject(k3.g.i((FileInputStream)o2));
                        String optString;
                        if (!jsonObject.isNull("userId")) {
                            optString = jsonObject.optString("userId", (String)null);
                        }
                        else {
                            optString = null;
                        }
                        final StringBuilder sb = new StringBuilder("Loaded userId ");
                        sb.append(optString);
                        sb.append(" for session ");
                        sb.append(s);
                        s = sb.toString();
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", s, (Throwable)null);
                        }
                        k3.g.b((Closeable)o2, "Failed to close user metadata file.");
                        return optString;
                    }
                    finally {}
                }
                catch (final Exception o) {
                    o2 = o;
                }
            }
            catch (final Exception o2) {
                closeable = null;
            }
            finally {
                break Label_0253;
            }
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", (Throwable)o2);
            f(e);
            k3.g.b(closeable, "Failed to close user metadata file.");
            return null;
        }
        k3.g.b((Closeable)o, "Failed to close user metadata file.");
    }
    
    public final void h(String s, Map map, final boolean b) {
        final c a = this.a;
        File file;
        if (b) {
            file = a.e(s, "internal-keys");
        }
        else {
            file = a.e(s, "keys");
        }
        final Closeable closeable = null;
        final Object o = s = null;
        Closeable closeable2;
        try {
            try {
                s = (String)o;
                final JSONObject jsonObject = new JSONObject(map);
                s = (String)o;
                final String string = jsonObject.toString();
                s = (String)o;
                s = (String)o;
                s = (String)o;
                s = (String)o;
                final FileOutputStream fileOutputStream = new FileOutputStream(file);
                s = (String)o;
                final OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, g.b);
                s = (String)o;
                map = (Map)new BufferedWriter((Writer)outputStreamWriter);
                try {
                    ((Writer)map).write(string);
                    ((Writer)map).flush();
                    k3.g.b((Closeable)map, "Failed to close key/value metadata file.");
                }
                catch (final Exception o) {}
                finally {
                    s = (String)map;
                }
            }
            finally {}
        }
        catch (final Exception o) {
            closeable2 = closeable;
        }
        Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", (Throwable)o);
        f(file);
        k3.g.b(closeable2, "Failed to close key/value metadata file.");
        return;
        k3.g.b((Closeable)s, "Failed to close key/value metadata file.");
    }
    
    public final void i(final String s, final List list) {
        final File e = this.a.e(s, "rollouts-state");
        if (list.isEmpty()) {
            final StringBuilder sb = new StringBuilder("Rollout state is empty for session: ");
            sb.append(s);
            g(e, sb.toString());
            return;
        }
        while (true) {
            Closeable closeable = null;
        Label_0151:
            while (true) {
                String e2 = null;
                try {
                    e2 = e(list);
                    final Object o = new BufferedWriter((Writer)new OutputStreamWriter((OutputStream)new FileOutputStream(e), g.b));
                    try {
                        try {
                            ((Writer)o).write(e2);
                            ((Writer)o).flush();
                            k3.g.b((Closeable)o, "Failed to close rollouts state file.");
                        }
                        finally {}
                    }
                    catch (final Exception e2) {}
                }
                catch (final Exception e2) {
                    final Object o = null;
                }
                finally {
                    closeable = null;
                    break Label_0151;
                }
                Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", (Throwable)e2);
                f(e);
                continue;
            }
            k3.g.b(closeable, "Failed to close rollouts state file.");
        }
    }
    
    public final void j(String s, String s2) {
        final File e = this.a.e(s, "user-data");
        final Closeable closeable = null;
        final Object o = s = null;
        Closeable closeable2;
        try {
            try {
                s = (String)o;
                final JSONObject jsonObject = new JSONObject();
                s = (String)o;
                jsonObject.put("userId", (Object)s2);
                s = (String)o;
                final String string = jsonObject.toString();
                s = (String)o;
                s = (String)o;
                s = (String)o;
                s = (String)o;
                final FileOutputStream fileOutputStream = new FileOutputStream(e);
                s = (String)o;
                final OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, g.b);
                s = (String)o;
                s2 = (String)new BufferedWriter((Writer)outputStreamWriter);
                try {
                    ((Writer)s2).write(string);
                    ((Writer)s2).flush();
                    k3.g.b((Closeable)s2, "Failed to close user metadata file.");
                }
                catch (final Exception o) {}
                finally {
                    s = s2;
                }
            }
            finally {}
        }
        catch (final Exception o) {
            closeable2 = closeable;
        }
        Log.w("FirebaseCrashlytics", "Error serializing user metadata.", (Throwable)o);
        k3.g.b(closeable2, "Failed to close user metadata file.");
        return;
        k3.g.b((Closeable)s, "Failed to close user metadata file.");
    }
}
