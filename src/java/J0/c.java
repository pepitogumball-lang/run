package j0;

import android.os.BaseBundle;
import androidx.lifecycle.B;
import android.view.View;
import java.util.Iterator;
import android.os.Bundle;
import java.lang.reflect.Method;
import io.flutter.embedding.android.FlutterActivity;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.lang.reflect.Array;
import android.os.storage.StorageManager;
import com.google.android.gms.internal.measurement.L;
import android.os.Environment;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.os.Build$VERSION;
import java.io.Serializable;
import android.app.Activity;
import com.google.android.gms.internal.auth.h;
import java.util.Objects;
import java.util.ArrayList;
import android.content.Intent;
import android.util.Log;
import java.util.UUID;
import w2.d;
import android.content.Context;
import android.os.RemoteException;
import J1.j;
import F1.O0;
import F1.v0;
import y1.e;
import y1.g;
import y1.k;
import com.google.android.gms.internal.ads.Vb;
import z1.b;

public final class c implements Runnable
{
    public final int C;
    public final Object D;
    public final Object E;
    
    public final void run() {
        int i = 0;
        final String s = null;
        final Serializable s2 = null;
        Label_1104: {
            switch (this.C) {
                default: {
                    final z1.c c = (z1.c)this.D;
                    final b b = (b)this.E;
                    try {
                        ((k)c).C.b(((g)b).a);
                    }
                    catch (final IllegalStateException ex) {
                        Vb.a(((View)c).getContext()).b("AdManagerAdView.loadAd", (Throwable)ex);
                    }
                    return;
                }
                case 5: {
                    final k k = (k)this.D;
                    final g g = (g)this.E;
                    try {
                        k.C.b(g.a);
                    }
                    catch (final IllegalStateException ex2) {
                        Vb.a(((View)k).getContext()).b("BaseAdView.loadAd", (Throwable)ex2);
                    }
                    return;
                }
                case 4: {
                    final e e = (e)this.D;
                    final v0 v0 = (v0)this.E;
                    try {
                        e.b.C2(O0.a(e.a, v0));
                    }
                    catch (final RemoteException ex3) {
                        j.g("Failed to load ad.", (Throwable)ex3);
                    }
                    return;
                }
                case 3: {
                    final w2.e e2 = (w2.e)this.D;
                    final Context context = (Context)e2.D;
                    String s3 = w2.e.R(context).getString("app_set_id", (String)null);
                    final SharedPreferences r = w2.e.R((Context)e2.D);
                    long n = -1L;
                    final long long1 = r.getLong("app_set_id_last_used_time", -1L);
                    if (long1 != -1L) {
                        n = 33696000000L + long1;
                    }
                    final O2.j j = (O2.j)this.E;
                    Label_0559: {
                        if (s3 != null) {
                            if (System.currentTimeMillis() <= n) {
                                try {
                                    w2.e.S(context);
                                    break Label_0559;
                                }
                                catch (final d d) {
                                    j.a((Exception)d);
                                    return;
                                }
                            }
                        }
                        s3 = UUID.randomUUID().toString();
                        Label_0577: {
                            Label_0451: {
                                String concat = null;
                                Label_0428: {
                                    try {
                                        if (context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", s3).commit()) {
                                            break Label_0451;
                                        }
                                        final String value = String.valueOf((Object)context.getPackageName());
                                        if (value.length() != 0) {
                                            concat = "Failed to store app set ID generated for App ".concat(value);
                                            break Label_0428;
                                        }
                                    }
                                    catch (final d d2) {
                                        break Label_0577;
                                    }
                                    concat = new String("Failed to store app set ID generated for App ");
                                }
                                Log.e("AppSet", concat);
                                throw new Exception("Failed to store the app set ID.");
                            }
                            w2.e.S(context);
                            if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                                final String value2 = String.valueOf((Object)context.getPackageName());
                                String concat2;
                                if (value2.length() != 0) {
                                    concat2 = "Failed to store app set ID creation time for App ".concat(value2);
                                }
                                else {
                                    concat2 = new String("Failed to store app set ID creation time for App ");
                                }
                                Log.e("AppSet", concat2);
                                throw new Exception("Failed to store the app set ID creation time.");
                            }
                            break Label_0559;
                        }
                        final d d2;
                        j.a((Exception)d2);
                        return;
                    }
                    j.b((Object)new U1.b(s3, 1));
                    return;
                }
                case 2: {
                    ((E4.j)((E4.j)this.E).b).success(this.D);
                    return;
                }
                case 1: {
                    final n4.c c2 = (n4.c)this.E;
                    final Intent intent = (Intent)this.D;
                    if (intent == null) {
                        break Label_1104;
                    }
                    Object buildDocumentUriUsingTree = new ArrayList();
                    if (intent.getClipData() != null) {
                        while (i < intent.getClipData().getItemCount()) {
                            final Uri uri = intent.getClipData().getItemAt(i).getUri();
                            final boolean equals = Objects.equals((Object)c2.G, (Object)"image/*");
                            final FlutterActivity c3 = c2.C;
                            Uri l = uri;
                            if (equals) {
                                final int h = c2.H;
                                l = uri;
                                if (h > 0) {
                                    l = com.google.android.gms.internal.auth.h.i(uri, h, ((Context)c3).getApplicationContext());
                                }
                            }
                            final n4.a u = h.u((Activity)c3, l, c2.F);
                            if (u != null) {
                                ((ArrayList)buildDocumentUriUsingTree).add((Object)u);
                                final StringBuilder sb = new StringBuilder("[MultiFilePick] File #");
                                sb.append(i);
                                sb.append(" - URI: ");
                                sb.append(l.getPath());
                                Log.d("FilePickerDelegate", sb.toString());
                            }
                            ++i;
                        }
                        c2.c((Serializable)buildDocumentUriUsingTree);
                        return;
                    }
                    if (intent.getData() == null) {
                        break Label_1104;
                    }
                    final Uri data = intent.getData();
                    final boolean equals2 = Objects.equals((Object)c2.G, (Object)"image/*");
                    final FlutterActivity c4 = c2.C;
                    Uri m = data;
                    if (equals2) {
                        final int h2 = c2.H;
                        m = data;
                        if (h2 > 0) {
                            m = h.i(data, h2, ((Context)c4).getApplicationContext());
                        }
                    }
                    if (!c2.G.equals((Object)"dir")) {
                        break Label_1104;
                    }
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(m, DocumentsContract.getTreeDocumentId(m));
                    final StringBuilder sb2 = new StringBuilder("[SingleFilePick] File URI:");
                    sb2.append(((Uri)buildDocumentUriUsingTree).toString());
                    Log.d("FilePickerDelegate", sb2.toString());
                    if (sdk_INT < 30 && "com.android.providers.downloads.documents".equals((Object)((Uri)buildDocumentUriUsingTree).getAuthority())) {
                        final String documentId = DocumentsContract.getDocumentId((Uri)buildDocumentUriUsingTree);
                        Object o = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                        if (documentId.equals((Object)"downloads")) {
                            break Label_1104;
                        }
                        if (documentId.matches("^ms[df]\\:.*")) {
                            o = L.j((String)o, "/", h.n((Uri)buildDocumentUriUsingTree, (Activity)c4));
                            break Label_1104;
                        }
                        o = s;
                        if (documentId.startsWith("raw:")) {
                            o = documentId.split(":")[1];
                            break Label_1104;
                        }
                        break Label_1104;
                    }
                    else {
                        final String[] split = DocumentsContract.getTreeDocumentId((Uri)buildDocumentUriUsingTree).split(":");
                        if (split.length > 0) {
                            final String s4 = split[0];
                            break Label_1104;
                        }
                        final String s4 = null;
                    }
                    break;
                }
                case 0: {
                    Label_1829: {
                        break Label_1829;
                        final n4.c c2;
                        final Intent intent;
                        final Object buildDocumentUriUsingTree;
                        final FlutterActivity c4;
                        final Uri m;
                        Object o;
                        final String s4;
                        StorageManager storageManager;
                        Class<?> forName;
                        Method method;
                        Method method2;
                        Method method3;
                        Object invoke;
                        Object o2 = null;
                        Object value3;
                        String s5;
                        String separator;
                        Object substring;
                        String[] split2;
                        String s6 = null;
                        String substring2;
                        n4.a u2;
                        StringBuilder sb3;
                        int n3;
                        Uri uri2;
                        c2.d g2;
                        Bundle extras;
                        ArrayList list;
                        i0.b a;
                        Object d3;
                        Iterator iterator;
                        a a2;
                        c2.d g3;
                        StringBuilder sb4;
                        Parcelable parcelable;
                        n4.a u3;
                        Block_65_Outer:Block_66_Outer:
                        while (true) {
                            try {
                                storageManager = (StorageManager)((Context)c4).getSystemService("storage");
                                forName = Class.forName("android.os.storage.StorageVolume");
                                method = storageManager.getClass().getMethod("getVolumeList", (Class<?>[])null);
                                method2 = forName.getMethod("getUuid", (Class[])null);
                                method3 = forName.getMethod("isPrimary", (Class[])null);
                                invoke = method.invoke((Object)storageManager, (Object[])null);
                                Label_1290: {
                                    if (invoke == null) {
                                        o2 = s2;
                                    }
                                    else {
                                        for (int length = Array.getLength(invoke), n2 = 0; n2 < length; ++n2) {
                                            value3 = Array.get(invoke, n2);
                                            s5 = (String)method2.invoke(value3, (Object[])null);
                                            if (method3.invoke(value3, (Object[])null) != null && "primary".equals((Object)s4)) {
                                                o2 = h.m((Class)forName, value3);
                                                break Label_1290;
                                            }
                                            if (s5 != null && s5.equals((Object)s4)) {
                                                o2 = h.m((Class)forName, value3);
                                                break Label_1290;
                                            }
                                        }
                                        o2 = null;
                                    }
                                }
                                if (o2 == null) {
                                    o = File.separator;
                                }
                                else {
                                    separator = File.separator;
                                    substring = o2;
                                    if (((String)o2).endsWith(separator)) {
                                        substring = ((String)o2).substring(0, ((String)o2).length() - 1);
                                    }
                                    split2 = DocumentsContract.getTreeDocumentId((Uri)buildDocumentUriUsingTree).split(":");
                                    Label_1375: {
                                        if (split2.length >= 2) {
                                            s6 = split2[1];
                                            if (s6 != null) {
                                                break Label_1375;
                                            }
                                        }
                                        s6 = separator;
                                    }
                                    substring2 = s6;
                                    if (s6.endsWith(separator)) {
                                        substring2 = s6.substring(0, s6.length() - 1);
                                    }
                                    o = substring;
                                    if (substring2.length() > 0) {
                                        if (substring2.startsWith(separator)) {
                                            o = L.i((String)substring, substring2);
                                        }
                                        else {
                                            o = L.j((String)substring, separator, substring2);
                                        }
                                    }
                                }
                                if (o != null) {
                                    c2.c((Serializable)o);
                                }
                                else {
                                    c2.b("unknown_path", "Failed to retrieve directory path.");
                                }
                                return;
                                Block_66:Block_67_Outer:Block_58_Outer:
                                while (true) {
                                    Block_63: {
                                        while (true) {
                                            Label_1639: {
                                                while (true) {
                                                Block_62_Outer:
                                                    while (true) {
                                                        Block_64: {
                                                            while (true) {
                                                                while (true) {
                                                                    Label_1651_Outer:Label_1505_Outer:
                                                                    while (true) {
                                                                        ((ArrayList)buildDocumentUriUsingTree).add((Object)u2);
                                                                        sb3 = new StringBuilder("[MultiFilePick] File #");
                                                                        sb3.append(n3);
                                                                        sb3.append(" - URI: ");
                                                                        sb3.append(uri2.getPath());
                                                                        Log.d("FilePickerDelegate", sb3.toString());
                                                                        Label_1773: {
                                                                            break Label_1773;
                                                                            Label_1803: {
                                                                                c2.b("unknown_activity", "Unknown activity error, please fill an issue.");
                                                                            }
                                                                            return;
                                                                        }
                                                                        ++n3;
                                                                        Block_60: {
                                                                            while (true) {
                                                                                while (true) {
                                                                                    break Label_1651;
                                                                                    SystemClock.uptimeMillis();
                                                                                    g2.h = null;
                                                                                    g2.b();
                                                                                    break Block_66;
                                                                                    Label_1629: {
                                                                                        list = extras.getParcelableArrayList("selectedItems");
                                                                                    }
                                                                                    break Label_1639;
                                                                                    n3 = 0;
                                                                                    iftrue(Label_1803:)(intent.getExtras() == null);
                                                                                    Block_56: {
                                                                                    Block_59:
                                                                                        while (true) {
                                                                                            Block_54: {
                                                                                                Block_55: {
                                                                                                    break Block_55;
                                                                                                    ((B)a).j(d3);
                                                                                                    break Block_66;
                                                                                                    iftrue(Label_1779:)(!iterator.hasNext());
                                                                                                    break Block_59;
                                                                                                    iftrue(Label_1558:)(((ArrayList)buildDocumentUriUsingTree).isEmpty());
                                                                                                    break Block_54;
                                                                                                }
                                                                                                extras = intent.getExtras();
                                                                                                iftrue(Label_1789:)(!((BaseBundle)extras).keySet().contains((Object)"selectedItems"));
                                                                                                break Block_56;
                                                                                                Label_1558:
                                                                                                c2.b("unknown_path", "Failed to retrieve path.");
                                                                                                return;
                                                                                                g3 = a2.G;
                                                                                                iftrue(Block_66:)(g3.h != a2);
                                                                                                break Block_63;
                                                                                            }
                                                                                            sb4 = new StringBuilder("File path:");
                                                                                            sb4.append(buildDocumentUriUsingTree.toString());
                                                                                            Log.d("FilePickerDelegate", sb4.toString());
                                                                                            c2.c((Serializable)buildDocumentUriUsingTree);
                                                                                            return;
                                                                                            c2.b("unknown_activity", "Unknown activity error, please fill an issue.");
                                                                                            return;
                                                                                            iftrue(Label_1987:)(Looper.myLooper() != Looper.getMainLooper());
                                                                                            continue Label_1505_Outer;
                                                                                        }
                                                                                        parcelable = (Parcelable)iterator.next();
                                                                                        iftrue(Label_1773:)(!(parcelable instanceof Uri));
                                                                                        break Block_60;
                                                                                        Label_1987:
                                                                                        ((B)a).h(d3);
                                                                                        break Block_66;
                                                                                    }
                                                                                    c2.getClass();
                                                                                    iftrue(Label_1629:)(Build$VERSION.SDK_INT < 33);
                                                                                    list = G0.g.p(extras);
                                                                                    break Label_1639;
                                                                                    iterator = list.iterator();
                                                                                    continue Block_65_Outer;
                                                                                }
                                                                                ((ArrayList)buildDocumentUriUsingTree).add((Object)u3);
                                                                                continue Block_62_Outer;
                                                                            }
                                                                            Label_1779: {
                                                                                c2.c((Serializable)buildDocumentUriUsingTree);
                                                                            }
                                                                            return;
                                                                        }
                                                                        uri2 = (Uri)parcelable;
                                                                        u2 = h.u((Activity)c2.C, uri2, c2.F);
                                                                        iftrue(Label_1773:)(u2 == null);
                                                                        continue Label_1651_Outer;
                                                                    }
                                                                    Label_1890: {
                                                                        g2 = a2.G;
                                                                    }
                                                                    iftrue(Label_1935:)(g2.g == a2);
                                                                    break Block_64;
                                                                    a2.D = 3;
                                                                    return;
                                                                    Label_1935:
                                                                    iftrue(Label_1946:)(!g2.c);
                                                                    continue Block_66;
                                                                    a2 = (a)this.E;
                                                                    d3 = this.D;
                                                                    iftrue(Label_1890:)(!a2.E.get());
                                                                    continue Block_67_Outer;
                                                                }
                                                                u3 = h.u((Activity)c4, m, c2.F);
                                                                iftrue(Label_1505:)(u3 == null);
                                                                continue;
                                                            }
                                                            Label_1789: {
                                                                c2.b("unknown_path", "Failed to retrieve path from bundle.");
                                                            }
                                                            return;
                                                        }
                                                        iftrue(Block_66:)(g2.h != a2);
                                                        continue Block_66_Outer;
                                                    }
                                                    Label_1946: {
                                                        SystemClock.uptimeMillis();
                                                    }
                                                    g2.g = null;
                                                    a = g2.a;
                                                    iftrue(Block_66:)(a == null);
                                                    continue Block_58_Outer;
                                                }
                                            }
                                            iftrue(Label_1779:)(list == null);
                                            continue;
                                        }
                                    }
                                    SystemClock.uptimeMillis();
                                    g3.h = null;
                                    g3.b();
                                    continue Block_66;
                                }
                            }
                            catch (final Exception ex4) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
