package u2;

import android.os.BaseBundle;
import java.io.Serializable;
import F1.n;
import Z4.E;
import Z4.i;
import java.util.concurrent.Executor;
import L3.x;
import n3.u0;
import C2.m;
import L3.y;
import java.util.Arrays;
import t.b;
import java.util.HashMap;
import io.flutter.plugins.GeneratedPluginRegistrant;
import android.os.Build$VERSION;
import t.g;
import android.text.TextUtils;
import java.util.Objects;
import L3.z;
import android.content.SharedPreferences;
import g4.t;
import android.app.ActivityManager$RunningAppProcessInfo;
import d5.l;
import android.app.ActivityManager;
import android.content.Context;
import n5.h;
import a.a;
import java.io.Closeable;
import com.google.android.gms.internal.measurement.L;
import R0.d;
import android.net.Uri;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import android.os.Parcel;
import java.util.Map$Entry;
import java.util.Map;
import java.io.Writer;
import java.io.StringWriter;
import com.google.android.gms.internal.ads.Fp;
import java.io.IOException;
import android.util.JsonWriter;
import org.json.JSONException;
import android.util.JsonToken;
import android.util.JsonReader;
import java.util.List;
import com.google.android.gms.internal.auth.F;
import android.os.Looper;
import java.util.Iterator;
import android.os.Parcelable;
import J1.j;
import org.json.JSONArray;
import android.os.Bundle;
import org.json.JSONObject;
import android.util.Log;
import java.util.ArrayList;
import p4.c;

public abstract class f implements c
{
    public static ClassLoader D;
    public static Thread E;
    public final int C;
    
    public static ArrayList A(final Throwable t) {
        final ArrayList list = new ArrayList(3);
        list.add((Object)t.toString());
        list.add((Object)t.getClass().getSimpleName());
        final StringBuilder sb = new StringBuilder("Cause: ");
        sb.append((Object)t.getCause());
        sb.append(", Stacktrace: ");
        sb.append(Log.getStackTraceString(t));
        list.add((Object)sb.toString());
        return list;
    }
    
    public static int B(final int n) {
        for (int i = 0; i < 6; ++i) {
            final int n2 = (new int[] { 1, 2, 3, 4, 5, 6 })[i];
            if (n2 == 0) {
                throw null;
            }
            if (n2 - 1 == n) {
                return n2;
            }
        }
        return 1;
    }
    
    public static Bundle C(final JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }
        final Iterator keys = jsonObject.keys();
        final Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            final String s = (String)keys.next();
            final Object opt = jsonObject.opt(s);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    ((BaseBundle)bundle).putBoolean(s, (boolean)opt);
                }
                else if (opt instanceof Double) {
                    ((BaseBundle)bundle).putDouble(s, (double)opt);
                }
                else if (opt instanceof Integer) {
                    ((BaseBundle)bundle).putInt(s, (int)opt);
                }
                else if (opt instanceof Long) {
                    ((BaseBundle)bundle).putLong(s, (long)opt);
                }
                else if (opt instanceof String) {
                    ((BaseBundle)bundle).putString(s, (String)opt);
                }
                else if (opt instanceof JSONArray) {
                    final JSONArray jsonArray = (JSONArray)opt;
                    if (jsonArray.length() == 0) {
                        continue;
                    }
                    final int length = jsonArray.length();
                    final int n = 0;
                    final int n2 = 0;
                    final int n3 = 0;
                    final int n4 = 0;
                    Object opt2 = null;
                    for (int n5 = 0; opt2 == null && n5 < length; ++n5) {
                        if (!jsonArray.isNull(n5)) {
                            opt2 = jsonArray.opt(n5);
                        }
                        else {
                            opt2 = null;
                        }
                    }
                    if (opt2 == null) {
                        j.i("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf((Object)s)));
                    }
                    else if (opt2 instanceof JSONObject) {
                        final Bundle[] array = new Bundle[length];
                        for (int i = n4; i < length; ++i) {
                            Bundle c;
                            if (!jsonArray.isNull(i)) {
                                c = C(jsonArray.optJSONObject(i));
                            }
                            else {
                                c = null;
                            }
                            array[i] = c;
                        }
                        bundle.putParcelableArray(s, (Parcelable[])array);
                    }
                    else if (opt2 instanceof Number) {
                        final double[] array2 = new double[jsonArray.length()];
                        for (int j = n; j < length; ++j) {
                            array2[j] = jsonArray.optDouble(j);
                        }
                        ((BaseBundle)bundle).putDoubleArray(s, array2);
                    }
                    else if (opt2 instanceof CharSequence) {
                        final String[] array3 = new String[length];
                        for (int k = n2; k < length; ++k) {
                            String optString;
                            if (!jsonArray.isNull(k)) {
                                optString = jsonArray.optString(k);
                            }
                            else {
                                optString = null;
                            }
                            array3[k] = optString;
                        }
                        ((BaseBundle)bundle).putStringArray(s, array3);
                    }
                    else if (opt2 instanceof Boolean) {
                        final boolean[] array4 = new boolean[length];
                        for (int l = n3; l < length; ++l) {
                            array4[l] = jsonArray.optBoolean(l);
                        }
                        ((BaseBundle)bundle).putBooleanArray(s, array4);
                    }
                    else {
                        final String canonicalName = opt2.getClass().getCanonicalName();
                        final StringBuilder sb = new StringBuilder("JSONArray with unsupported type ");
                        sb.append(canonicalName);
                        sb.append(" for key:");
                        sb.append(s);
                        j.i(sb.toString());
                    }
                }
                else if (opt instanceof JSONObject) {
                    bundle.putBundle(s, C((JSONObject)opt));
                }
                else {
                    j.i("Unsupported type for key:".concat(String.valueOf((Object)s)));
                }
            }
        }
        return bundle;
    }
    
    public static ClassLoader D() {
        final Class<f> clazz;
        monitorenter(clazz = f.class);
        Label_0470: {
            try {
                if (f.D != null) {
                    break Label_0470;
                }
                final Thread e;
                if ((e = f.E) == null) {
                    final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                    Thread e2;
                    Class<Void> clazz2;
                    int activeGroupCount;
                    ThreadGroup[] array;
                    int n = 0;
                    ThreadGroup threadGroup2 = null;
                    Thread[] array2 = null;
                    int n2 = 0;
                    Thread thread;
                    ThreadGroup threadGroup3 = null;
                    int activeCount;
                    e e3;
                    e e4;
                    Thread thread2;
                    ThreadGroup threadGroup4;
                    String s;
                    Thread thread3;
                    ClassLoader classLoader;
                    Thread thread4;
                    Block_15_Outer:Block_14_Outer:
                    while (true) {
                        if (threadGroup == null) {
                            e2 = null;
                            break Label_0348;
                        }
                        monitorenter(clazz2 = Void.class);
                        try {
                            Label_0128: {
                                try {
                                    activeGroupCount = threadGroup.activeGroupCount();
                                    array = new ThreadGroup[activeGroupCount];
                                    threadGroup.enumerate(array);
                                    n = 0;
                                    Block_11: {
                                        for (final ThreadGroup threadGroup2 : array) {
                                            if ("dynamiteLoader".equals((Object)threadGroup2.getName())) {
                                                break Block_11;
                                            }
                                        }
                                        break Label_0128;
                                    }
                                }
                                finally {
                                    monitorexit(clazz2);
                                Label_0177_Outer:
                                    while (true) {
                                        Label_0131:Label_0216_Outer:
                                        while (true) {
                                            Label_0155: {
                                                while (true) {
                                                    Block_16: {
                                                        while (true) {
                                                            thread = array2[n2];
                                                            iftrue(Label_0207:)(!"GmsDynamite".equals((Object)thread.getName()));
                                                            break Block_16;
                                                            threadGroup3 = new ThreadGroup(threadGroup, "dynamiteLoader");
                                                            break Label_0155;
                                                            iftrue(Label_0213:)(n2 >= activeCount);
                                                            continue Block_14_Outer;
                                                        }
                                                        Label_0341: {
                                                            while (true) {
                                                                e3 = new(u2.e.class)();
                                                                thread2 = (e4 = e3);
                                                                threadGroup4 = threadGroup3;
                                                                s = "GmsDynamite";
                                                                new Thread(threadGroup4, s);
                                                                thread3 = thread2;
                                                                classLoader = null;
                                                                thread3.setContextClassLoader(classLoader);
                                                                thread4 = thread2;
                                                                thread4.start();
                                                                break Label_0341;
                                                                threadGroup2 = null;
                                                                break Label_0131;
                                                                thread2 = thread;
                                                                iftrue(Label_0341:)(thread != null);
                                                                continue Label_0216_Outer;
                                                            }
                                                            while (true) {
                                                                break Label_0470;
                                                                f.E = e2;
                                                                iftrue(Label_0380:)(e2 != null);
                                                                continue;
                                                            }
                                                        }
                                                        monitorexit(clazz2);
                                                        e2 = thread2;
                                                        continue Block_15_Outer;
                                                    }
                                                    continue;
                                                }
                                            }
                                            activeCount = threadGroup3.activeCount();
                                            array2 = new Thread[activeCount];
                                            threadGroup3.enumerate(array2);
                                            n2 = n;
                                            continue;
                                            Label_0207: {
                                                ++n2;
                                            }
                                            continue;
                                        }
                                        threadGroup3 = threadGroup2;
                                        iftrue(Label_0155:)(threadGroup2 != null);
                                        continue Label_0177_Outer;
                                    }
                                    Label_0213: {
                                        thread = null;
                                    }
                                }
                            }
                        }
                        catch (final SecurityException ex) {}
                        break;
                    }
                    try {
                        e3 = new(u2.e.class)();
                        thread2 = (e4 = e3);
                        threadGroup4 = threadGroup3;
                        s = "GmsDynamite";
                        new Thread(threadGroup4, s);
                        try {
                            thread3 = thread2;
                            classLoader = null;
                            thread3.setContextClassLoader(classLoader);
                            thread4 = thread2;
                            thread4.start();
                        }
                        catch (final SecurityException ex2) {}
                    }
                    catch (final SecurityException ex3) {}
                }
            }
            finally {
                final Thread thread5;
                Label_0380: {
                    final Thread e;
                    monitorenter(thread5 = e);
                }
                try {
                    try {
                        final ClassLoader contextClassLoader = f.E.getContextClassLoader();
                    }
                    finally {
                        monitorexit(thread5);
                        final ClassLoader contextClassLoader;
                        f.D = contextClassLoader;
                        break Label_0470;
                        monitorexit(thread5);
                    }
                }
                catch (final SecurityException ex4) {}
                final ClassLoader d = f.D;
                monitorexit(clazz);
                return d;
            }
        }
    }
    
    public static String E(final F f) {
        final StringBuilder sb = new StringBuilder(f.i());
        for (int i = 0; i < f.i(); ++i) {
            final byte c = f.c(i);
            if (c != 34) {
                if (c != 39) {
                    if (c != 92) {
                        switch (c) {
                            default: {
                                if (c >= 32 && c <= 126) {
                                    sb.append((char)c);
                                    break;
                                }
                                sb.append('\\');
                                sb.append((char)((c >>> 6 & 0x3) + 48));
                                sb.append((char)((c >>> 3 & 0x7) + 48));
                                sb.append((char)((c & 0x7) + 48));
                                break;
                            }
                            case 13: {
                                sb.append("\\r");
                                break;
                            }
                            case 12: {
                                sb.append("\\f");
                                break;
                            }
                            case 11: {
                                sb.append("\\v");
                                break;
                            }
                            case 10: {
                                sb.append("\\n");
                                break;
                            }
                            case 9: {
                                sb.append("\\t");
                                break;
                            }
                            case 8: {
                                sb.append("\\b");
                                break;
                            }
                            case 7: {
                                sb.append("\\a");
                                break;
                            }
                        }
                    }
                    else {
                        sb.append("\\\\");
                    }
                }
                else {
                    sb.append("\\'");
                }
            }
            else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
    
    public static List F(final JSONArray jsonArray, final ArrayList list) {
        ArrayList list2 = list;
        if (list == null) {
            list2 = new ArrayList();
        }
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.length(); ++i) {
                ((List)list2).add((Object)jsonArray.getString(i));
            }
        }
        return (List)list2;
    }
    
    public static ArrayList G(final JsonReader jsonReader) {
        final ArrayList list = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            list.add((Object)jsonReader.nextString());
        }
        jsonReader.endArray();
        return list;
    }
    
    public static JSONArray H(final JsonReader jsonReader) {
        final JSONArray jsonArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            final JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jsonArray.put((Object)H(jsonReader));
            }
            else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jsonArray.put((Object)J(jsonReader));
            }
            else if (JsonToken.BOOLEAN.equals(peek)) {
                jsonArray.put(jsonReader.nextBoolean());
            }
            else if (JsonToken.NUMBER.equals(peek)) {
                jsonArray.put(jsonReader.nextDouble());
            }
            else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf((Object)peek)));
                }
                jsonArray.put((Object)jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jsonArray;
    }
    
    public static JSONObject I(String jsonObject, final JSONObject jsonObject2) {
        try {
            jsonObject = (String)jsonObject2.getJSONObject(jsonObject);
        }
        catch (final JSONException ex) {
            final Object o = new JSONObject();
            jsonObject2.put(jsonObject, o);
            jsonObject = (String)o;
        }
        return (JSONObject)jsonObject;
    }
    
    public static JSONObject J(final JsonReader jsonReader) {
        final JSONObject jsonObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            final JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jsonObject.put(nextName, (Object)H(jsonReader));
            }
            else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jsonObject.put(nextName, (Object)J(jsonReader));
            }
            else if (JsonToken.BOOLEAN.equals(peek)) {
                jsonObject.put(nextName, jsonReader.nextBoolean());
            }
            else if (JsonToken.NUMBER.equals(peek)) {
                jsonObject.put(nextName, jsonReader.nextDouble());
            }
            else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf((Object)peek)));
                }
                jsonObject.put(nextName, (Object)jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jsonObject;
    }
    
    public static void K(final JsonWriter jsonWriter, final JSONArray jsonArray) {
        while (true) {
        Label_0165:
            while (true) {
                int n = 0;
                Label_0118: {
                    Object value;
                    try {
                        jsonWriter.beginArray();
                        n = 0;
                        if (n >= jsonArray.length()) {
                            break Label_0165;
                        }
                        value = jsonArray.get(n);
                        if (value instanceof String) {
                            jsonWriter.value((String)value);
                            break Label_0118;
                        }
                    }
                    catch (final JSONException ex) {
                        throw new IOException((Throwable)ex);
                    }
                    if (value instanceof Number) {
                        jsonWriter.value((Number)value);
                    }
                    else if (value instanceof Boolean) {
                        jsonWriter.value((boolean)value);
                    }
                    else if (value instanceof JSONObject) {
                        L(jsonWriter, (JSONObject)value);
                    }
                    else {
                        if (!(value instanceof JSONArray)) {
                            final String value2 = String.valueOf(value);
                            final StringBuilder sb = new StringBuilder();
                            sb.append("unable to write field: ");
                            sb.append(value2);
                            throw new JSONException(sb.toString());
                        }
                        K(jsonWriter, (JSONArray)value);
                    }
                }
                ++n;
                continue;
            }
            jsonWriter.endArray();
        }
    }
    
    public static void L(final JsonWriter jsonWriter, final JSONObject jsonObject) {
        while (true) {
            Label_0203: {
                Object value = null;
                while (true) {
                    String s = null;
                    Label_0065: {
                        try {
                            jsonWriter.beginObject();
                            final Iterator keys = jsonObject.keys();
                            while (keys.hasNext()) {
                                s = (String)keys.next();
                                value = jsonObject.get(s);
                                if (!(value instanceof String)) {
                                    break Label_0065;
                                }
                                jsonWriter.name(s).value((String)value);
                            }
                            break Label_0203;
                        }
                        catch (final JSONException ex) {
                            throw new IOException((Throwable)ex);
                        }
                    }
                    if (value instanceof Number) {
                        jsonWriter.name(s).value((Number)value);
                        continue;
                    }
                    if (value instanceof Boolean) {
                        jsonWriter.name(s).value((boolean)value);
                        continue;
                    }
                    if (value instanceof JSONObject) {
                        L(jsonWriter.name(s), (JSONObject)value);
                        continue;
                    }
                    if (value instanceof JSONArray) {
                        K(jsonWriter.name(s), (JSONArray)value);
                        continue;
                    }
                    break;
                }
                final String value2 = String.valueOf(value);
                final StringBuilder sb = new StringBuilder();
                sb.append("unable to write field: ");
                sb.append(value2);
                throw new JSONException(sb.toString());
            }
            jsonWriter.endObject();
        }
    }
    
    public static String M(final Fp fp) {
        final String s = null;
        String string;
        if (fp == null) {
            string = s;
        }
        else {
            final StringWriter stringWriter = new StringWriter();
            try {
                final JsonWriter jsonWriter = new JsonWriter((Writer)stringWriter);
                O(jsonWriter, fp);
                jsonWriter.close();
                string = stringWriter.toString();
            }
            catch (final IOException ex) {
                j.g("Error when writing JSON.", (Throwable)ex);
                string = s;
            }
        }
        return string;
    }
    
    public static JSONObject N(JSONObject optJSONObject, final String[] array) {
        for (int i = 0; i < array.length - 1; i = 1) {
            if (optJSONObject == null) {
                return null;
            }
            optJSONObject = optJSONObject.optJSONObject(array[0]);
        }
        return optJSONObject;
    }
    
    public static void O(final JsonWriter jsonWriter, final Object o) {
        if (o == null) {
            jsonWriter.nullValue();
            return;
        }
        if (o instanceof Number) {
            jsonWriter.value((Number)o);
            return;
        }
        if (o instanceof Boolean) {
            jsonWriter.value((boolean)o);
            return;
        }
        if (o instanceof String) {
            jsonWriter.value((String)o);
            return;
        }
        if (o instanceof Fp) {
            L(jsonWriter, ((Fp)o).d);
            return;
        }
        if (o instanceof Map) {
            jsonWriter.beginObject();
            for (final Map$Entry map$Entry : ((Map)o).entrySet()) {
                final Object key = map$Entry.getKey();
                if (key instanceof String) {
                    O(jsonWriter.name((String)key), map$Entry.getValue());
                }
            }
            jsonWriter.endObject();
            return;
        }
        if (o instanceof List) {
            jsonWriter.beginArray();
            final Iterator iterator2 = ((List)o).iterator();
            while (iterator2.hasNext()) {
                O(jsonWriter, iterator2.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.nullValue();
    }
    
    public static void a(final Parcel parcel, final Bundle bundle) {
        if (bundle != null) {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 1);
        }
        else {
            parcel.writeInt(0);
        }
    }
    
    public static R0.e b(final byte[] array) {
        final R0.e e = new R0.e();
        if (array == null) {
            return e;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        ObjectInputStream objectInputStream4 = null;
        Label_0179: {
            d d = null;
            ObjectInputStream objectInputStream3 = null;
            Label_0148: {
                try {
                    final ObjectInputStream objectInputStream = new ObjectInputStream((InputStream)byteArrayInputStream);
                    try {
                        try {
                            for (int i = objectInputStream.readInt(); i > 0; --i) {
                                d = new d(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF()));
                                e.a.add((Object)d);
                            }
                        }
                        finally {}
                    }
                    catch (final IOException d) {
                        break Label_0148;
                    }
                    try {
                        final ObjectInputStream objectInputStream2;
                        objectInputStream2.close();
                    }
                    catch (final IOException ex) {
                        ((Throwable)ex).printStackTrace();
                    }
                    try {
                        byteArrayInputStream.close();
                    }
                    catch (final IOException ex2) {
                        ((Throwable)ex2).printStackTrace();
                    }
                    return e;
                }
                catch (final IOException d) {
                    objectInputStream3 = null;
                }
                finally {
                    objectInputStream4 = null;
                    break Label_0179;
                }
            }
            ((Throwable)d).printStackTrace();
            if (objectInputStream3 != null) {
                try {
                    objectInputStream3.close();
                }
                catch (final IOException ex3) {
                    ((Throwable)ex3).printStackTrace();
                }
            }
            byteArrayInputStream.close();
            return e;
        }
        if (objectInputStream4 != null) {
            try {
                objectInputStream4.close();
            }
            catch (final IOException ex4) {
                ((Throwable)ex4).printStackTrace();
            }
        }
        try {
            byteArrayInputStream.close();
        }
        catch (final IOException ex5) {
            ((Throwable)ex5).printStackTrace();
        }
    }
    
    public static void c(final int n, final Object[] array) {
        for (int i = 0; i < n; ++i) {
            if (array[i] == null) {
                throw new NullPointerException(L.h(i, "at index "));
            }
        }
    }
    
    public static final void d(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
            }
            else {
                try {
                    closeable.close();
                }
                finally {
                    final Throwable t2;
                    a.a(t, t2);
                }
            }
        }
    }
    
    public static final long e(final long n, final v5.c c, final v5.c c2) {
        h.e("sourceUnit", c);
        h.e("targetUnit", c2);
        return c2.C.convert(n, c.C);
    }
    
    public static ArrayList f(final Context context) {
        h.e("context", context);
        final int uid = context.getApplicationInfo().uid;
        final String processName = context.getApplicationInfo().processName;
        final Object systemService = context.getSystemService("activity");
        final boolean b = systemService instanceof ActivityManager;
        Object runningAppProcesses = null;
        ActivityManager activityManager;
        if (b) {
            activityManager = (ActivityManager)systemService;
        }
        else {
            activityManager = null;
        }
        if (activityManager != null) {
            runningAppProcesses = activityManager.getRunningAppProcesses();
        }
        Object c;
        if ((c = runningAppProcesses) == null) {
            c = l.C;
        }
        final ArrayList g = d5.d.G((Iterable)c);
        final ArrayList list = new ArrayList();
        for (final Object next : g) {
            if (((ActivityManager$RunningAppProcessInfo)next).uid == uid) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList(d5.f.E((Iterable)list));
        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : list) {
            final String processName2 = activityManager$RunningAppProcessInfo.processName;
            h.d("runningAppProcessInfo.processName", processName2);
            list2.add((Object)new t(processName2, activityManager$RunningAppProcessInfo.pid, activityManager$RunningAppProcessInfo.importance, h.a(activityManager$RunningAppProcessInfo.processName, processName)));
        }
        return list2;
    }
    
    public static SharedPreferences m(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
    
    public static z n(final Map map) {
        final Object value = map.get((Object)"message");
        Objects.requireNonNull(value);
        final Map map2 = (Map)value;
        final Object value2 = map2.get((Object)"to");
        Objects.requireNonNull(value2);
        final String s = (String)value2;
        final Bundle bundle = new Bundle();
        final t.j j = new t.j();
        if (!TextUtils.isEmpty((CharSequence)s)) {
            ((BaseBundle)bundle).putString("google.to", s);
            final String s2 = (String)map2.get((Object)"collapseKey");
            final String s3 = (String)map2.get((Object)"messageId");
            final String s4 = (String)map2.get((Object)"messageType");
            final Integer n = (Integer)map2.get((Object)"ttl");
            final Map map3 = (Map)map2.get((Object)"data");
            if (s2 != null) {
                ((BaseBundle)bundle).putString("collapse_key", s2);
            }
            if (s4 != null) {
                ((BaseBundle)bundle).putString("message_type", s4);
            }
            if (s3 != null) {
                ((BaseBundle)bundle).putString("google.message_id", s3);
            }
            if (n != null) {
                ((BaseBundle)bundle).putString("google.ttl", String.valueOf((int)n));
            }
            if (map3 != null) {
                j.clear();
                ((b)j).putAll(map3);
            }
            final Bundle bundle2 = new Bundle();
            for (final Map$Entry map$Entry : (g)((b)j).entrySet()) {
                ((BaseBundle)bundle2).putString((String)map$Entry.getKey(), (String)map$Entry.getValue());
            }
            bundle2.putAll(bundle);
            bundle.remove("from");
            return new z(bundle2);
        }
        throw new IllegalArgumentException(m0.a.f("Invalid to: ", s));
    }
    
    public static String o(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder("https://console.firebase.google.com/project/");
        sb.append(s);
        sb.append("/performance/app/android:");
        sb.append(s2);
        return sb.toString();
    }
    
    public static int q(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Y3.a.j(n, "Could not convert ", " to BackoffPolicy"));
    }
    
    public static int r(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (Build$VERSION.SDK_INT >= 30 && n == 5) {
            return 6;
        }
        throw new IllegalArgumentException(Y3.a.j(n, "Could not convert ", " to NetworkType"));
    }
    
    public static int s(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Y3.a.j(n, "Could not convert ", " to OutOfQuotaPolicy"));
    }
    
    public static int t(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n == 5) {
            return 6;
        }
        throw new IllegalArgumentException(Y3.a.j(n, "Could not convert ", " to State"));
    }
    
    public static void u(final w4.c c) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", w4.c.class).invoke((Object)null, new Object[] { c });
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder("Tried to automatically register plugins with FlutterEngine (");
            sb.append((Object)c);
            sb.append(") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", sb.toString());
            Log.e("GeneratedPluginsRegister", "Received exception while registering", (Throwable)ex);
        }
    }
    
    public static HashMap v(final z z) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        if (((BaseBundle)z.C).getString("collapse_key") != null) {
            hashMap.put((Object)"collapseKey", (Object)((BaseBundle)z.C).getString("collapse_key"));
        }
        if (((BaseBundle)z.C).getString("from") != null) {
            hashMap.put((Object)"from", (Object)((BaseBundle)z.C).getString("from"));
        }
        if (((BaseBundle)z.C).getString("google.to") != null) {
            hashMap.put((Object)"to", (Object)((BaseBundle)z.C).getString("google.to"));
        }
        if (z.i() != null) {
            hashMap.put((Object)"messageId", (Object)z.i());
        }
        if (((BaseBundle)z.C).getString("message_type") != null) {
            hashMap.put((Object)"messageType", (Object)((BaseBundle)z.C).getString("message_type"));
        }
        if (((t.j)z.h()).E > 0) {
            for (final Map$Entry map$Entry : ((b)z.h()).entrySet()) {
                hashMap2.put((Object)map$Entry.getKey(), map$Entry.getValue());
            }
        }
        hashMap.put((Object)"data", (Object)hashMap2);
        final Bundle c = z.C;
        final Object value = ((BaseBundle)c).get("google.ttl");
        int n = 0;
        Label_0347: {
            if (value instanceof Integer) {
                n = (int)value;
            }
            else {
                if (value instanceof String) {
                    try {
                        n = Integer.parseInt((String)value);
                        break Label_0347;
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder sb = new StringBuilder("Invalid TTL: ");
                        sb.append(value);
                        Log.w("FirebaseMessaging", sb.toString());
                    }
                }
                n = 0;
            }
        }
        hashMap.put((Object)"ttl", (Object)n);
        final Object value2 = ((BaseBundle)c).get("google.sent_time");
        long n2 = 0L;
        Label_0446: {
            if (value2 instanceof Long) {
                n2 = (long)value2;
            }
            else {
                if (value2 instanceof String) {
                    try {
                        n2 = Long.parseLong((String)value2);
                        break Label_0446;
                    }
                    catch (final NumberFormatException ex2) {
                        final StringBuilder sb2 = new StringBuilder("Invalid sent time: ");
                        sb2.append(value2);
                        Log.w("FirebaseMessaging", sb2.toString());
                    }
                }
                n2 = 0L;
            }
        }
        hashMap.put((Object)"sentTime", (Object)n2);
        if (z.p() != null) {
            final y p = z.p();
            final HashMap hashMap3 = new HashMap();
            final HashMap hashMap4 = new HashMap();
            final String a = p.a;
            if (a != null) {
                hashMap3.put((Object)"title", (Object)a);
            }
            final String b = p.b;
            if (b != null) {
                hashMap3.put((Object)"titleLocKey", (Object)b);
            }
            final String[] c2 = p.c;
            if (c2 != null) {
                hashMap3.put((Object)"titleLocArgs", (Object)Arrays.asList((Object[])c2));
            }
            final String d = p.d;
            if (d != null) {
                hashMap3.put((Object)"body", (Object)d);
            }
            final String e = p.e;
            if (e != null) {
                hashMap3.put((Object)"bodyLocKey", (Object)e);
            }
            final String[] f = p.f;
            if (f != null) {
                hashMap3.put((Object)"bodyLocArgs", (Object)Arrays.asList((Object[])f));
            }
            final String m = p.m;
            if (m != null) {
                hashMap4.put((Object)"channelId", (Object)m);
            }
            final String l = p.l;
            if (l != null) {
                hashMap4.put((Object)"clickAction", (Object)l);
            }
            final String k = p.k;
            if (k != null) {
                hashMap4.put((Object)"color", (Object)k);
            }
            final String g = p.g;
            if (g != null) {
                hashMap4.put((Object)"smallIcon", (Object)g);
            }
            final Uri uri = null;
            final String h = p.h;
            Uri parse;
            if (h != null) {
                parse = Uri.parse(h);
            }
            else {
                parse = null;
            }
            if (parse != null) {
                Uri parse2 = uri;
                if (h != null) {
                    parse2 = Uri.parse(h);
                }
                hashMap4.put((Object)"imageUrl", (Object)parse2.toString());
            }
            final Uri n3 = p.n;
            if (n3 != null) {
                hashMap4.put((Object)"link", (Object)n3.toString());
            }
            final Integer r = p.r;
            if (r != null) {
                hashMap4.put((Object)"count", (Object)r);
            }
            final Integer p2 = p.p;
            if (p2 != null) {
                hashMap4.put((Object)"priority", (Object)p2);
            }
            final String i = p.i;
            if (i != null) {
                hashMap4.put((Object)"sound", (Object)i);
            }
            final String o = p.o;
            if (o != null) {
                hashMap4.put((Object)"ticker", (Object)o);
            }
            final Integer q = p.q;
            if (q != null) {
                hashMap4.put((Object)"visibility", (Object)q);
            }
            final String j = p.j;
            if (j != null) {
                hashMap4.put((Object)"tag", (Object)j);
            }
            hashMap3.put((Object)"android", (Object)hashMap4);
            hashMap.put((Object)"notification", (Object)hashMap3);
        }
        return hashMap;
    }
    
    public static void w(final Context context, m m, final boolean b) {
        if (Build$VERSION.SDK_INT >= 29) {
            final SharedPreferences i = m(context);
            if (!i.contains("proxy_retention") || i.getBoolean("proxy_retention", false) != b) {
                final d2.b b2 = (d2.b)m.E;
                Label_0157: {
                    if (b2.c.a() >= 241100000) {
                        m = (m)new Bundle();
                        ((BaseBundle)m).putBoolean("proxy_retention", b);
                        final d2.m e = d2.m.e(b2.b);
                        synchronized (e) {
                            final int n = e.b++;
                            monitorexit(e);
                            m = (m)e.g(new d2.l(n, 4, (Bundle)m, 0));
                            break Label_0157;
                        }
                    }
                    m = (m)u0.l((Exception)new IOException("SERVICE_NOT_AVAILABLE"));
                }
                ((O2.t)m).d((Executor)new p.a(1), (O2.f)new x(context, b));
            }
        }
    }
    
    public static void x(final F4.f f, final Z4.c c) {
        h.e("binaryMessenger", f);
        final c5.f b = Z4.e.b;
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (Object)b.a(), (Object)null);
        if (c != null) {
            h.u((F4.b)new Z4.d(c, 0));
        }
        else {
            h.u((F4.b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (Object)b.a(), (Object)null);
        if (c != null) {
            h2.u((F4.b)new Z4.d(c, 1));
        }
        else {
            h2.u((F4.b)null);
        }
    }
    
    public static void y(final F4.f f, final i i) {
        h.e("binaryMessenger", f);
        Object c = null;
        Label_0037: {
            if (i != null) {
                final n a = i.a;
                if (a != null) {
                    c = a.c();
                    break Label_0037;
                }
            }
            c = new X4.c(1);
        }
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", c, (Object)null);
        if (i != null) {
            h.u((F4.b)new E(i, 0));
        }
        else {
            h.u((F4.b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", c, (Object)null);
        if (i != null) {
            h2.u((F4.b)new E(i, 1));
        }
        else {
            h2.u((F4.b)null);
        }
        final Y0.h h3 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", c, (Object)null);
        if (i != null) {
            h3.u((F4.b)new E(i, 2));
        }
        else {
            h3.u((F4.b)null);
        }
        final Y0.h h4 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", c, (Object)null);
        if (i != null) {
            h4.u((F4.b)new E(i, 3));
        }
        else {
            h4.u((F4.b)null);
        }
    }
    
    public static int z(final int n) {
        final int d = v.e.d(n);
        if (d != 0) {
            int n2 = 1;
            if (d != 1) {
                n2 = 2;
                if (d != 2) {
                    n2 = 3;
                    if (d != 3) {
                        n2 = 4;
                        if (d != 4) {
                            if (d == 5) {
                                return 5;
                            }
                            final StringBuilder sb = new StringBuilder("Could not convert ");
                            sb.append(m0.a.p(n));
                            sb.append(" to int");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
            }
            return n2;
        }
        return 0;
    }
    
    public abstract Object g(final String p0);
    
    public void h(final Serializable s) {
        this.l().h(s);
    }
    
    public abstract String i();
    
    public void j(final String s, final HashMap hashMap) {
        this.l().j(s, hashMap);
    }
    
    public boolean k() {
        return Boolean.TRUE.equals(this.g("noResult"));
    }
    
    public abstract c l();
    
    public abstract boolean p();
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 16: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.i());
                sb.append(" ");
                sb.append((String)this.g("sql"));
                sb.append(" ");
                sb.append((Object)this.g("arguments"));
                return sb.toString();
            }
        }
    }
}
