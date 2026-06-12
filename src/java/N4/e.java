package n4;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import android.provider.MediaStore$Images$Media;
import android.os.Parcelable;
import android.net.Uri;
import android.os.Build$VERSION;
import android.content.Intent;
import java.util.ArrayList;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import E4.j;
import F4.m;
import android.app.Application$ActivityLifecycleCallbacks;
import F4.f;
import androidx.lifecycle.s;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import F4.r;
import F4.h;
import V4.G;
import o.q1;
import F4.p;
import io.flutter.embedding.android.FlutterActivity;
import androidx.lifecycle.o;
import android.app.Application;
import C4.b;
import C4.a;
import B4.c;
import F4.n;

public class e implements n, c, a
{
    public static String K;
    public static boolean L;
    public static boolean M;
    public static int N;
    public b C;
    public n4.c D;
    public Application E;
    public B4.b F;
    public o G;
    public d H;
    public FlutterActivity I;
    public p J;
    
    public final void onAttachedToActivity(final b c) {
        this.C = c;
        final B4.b f = this.F;
        final f c2 = f.c;
        final Application e = (Application)f.a;
        final q1 q1 = (q1)c;
        final FlutterActivity i = (FlutterActivity)q1.C;
        this.I = i;
        this.E = e;
        this.D = new n4.c(i);
        (this.J = new p(c2, "miguelruivo.flutter.plugins.filepicker")).b((n)this);
        new w2.e(c2, "miguelruivo.flutter.plugins.filepickerevent").L((h)new G((Object)this, 16));
        this.H = new d(i);
        q1.b((r)this.D);
        (this.G = ((HiddenLifecycleReference)q1.D).getLifecycle()).a((s)this.H);
    }
    
    public final void onAttachedToEngine(final B4.b f) {
        this.F = f;
    }
    
    public final void onDetachedFromActivity() {
        ((q1)this.C).h((r)this.D);
        this.C = null;
        final d h = this.H;
        if (h != null) {
            this.G.b((s)h);
            this.E.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.H);
        }
        this.G = null;
        this.D.J = null;
        this.D = null;
        this.J.b((n)null);
        this.J = null;
        this.E = null;
    }
    
    public final void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        this.F = null;
    }
    
    public final void onMethodCall(final m m, F4.o o) {
        if (this.I == null) {
            ((j)o).error("no_activity", "file picker plugin requires a foreground activity", (Object)null);
            return;
        }
        o = (F4.o)new j((j)o);
        final HashMap hashMap = (HashMap)m.b;
        final String a = m.a;
        if (a != null && a.equals((Object)"clear")) {
            final Context applicationContext = ((Context)this.I).getApplicationContext();
            boolean b;
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)applicationContext.getCacheDir());
                sb.append("/file_picker/");
                com.google.android.gms.internal.auth.h.v(new File(sb.toString()));
                b = true;
            }
            catch (final Exception ex) {
                final StringBuilder sb2 = new StringBuilder("There was an error while clearing cached files: ");
                sb2.append(ex.toString());
                Log.e("FilePickerUtils", sb2.toString());
                b = false;
            }
            ((j)o).success((Object)b);
            return;
        }
        if (a != null) {
            if (a.equals((Object)"save")) {
                final String s = (String)hashMap.get((Object)"fileName");
                final String s2 = (String)hashMap.get((Object)"fileType");
                s2.getClass();
                int n = 0;
                Label_0411: {
                    switch (s2.hashCode()) {
                        case 112202875: {
                            if (!s2.equals((Object)"video")) {
                                break;
                            }
                            n = 6;
                            break Label_0411;
                        }
                        case 103772132: {
                            if (!s2.equals((Object)"media")) {
                                break;
                            }
                            n = 5;
                            break Label_0411;
                        }
                        case 100313435: {
                            if (!s2.equals((Object)"image")) {
                                break;
                            }
                            n = 4;
                            break Label_0411;
                        }
                        case 93166550: {
                            if (!s2.equals((Object)"audio")) {
                                break;
                            }
                            n = 3;
                            break Label_0411;
                        }
                        case 99469: {
                            if (!s2.equals((Object)"dir")) {
                                break;
                            }
                            n = 2;
                            break Label_0411;
                        }
                        case 96748: {
                            if (!s2.equals((Object)"any")) {
                                break;
                            }
                            n = 1;
                            break Label_0411;
                        }
                        case -1349088399: {
                            if (!s2.equals((Object)"custom")) {
                                break;
                            }
                            n = 0;
                            break Label_0411;
                        }
                    }
                    n = -1;
                }
                String type = null;
                switch (n) {
                    default: {
                        type = null;
                        break;
                    }
                    case 6: {
                        type = "video/*";
                        break;
                    }
                    case 5: {
                        type = "image/*,video/*";
                        break;
                    }
                    case 4: {
                        type = "image/*";
                        break;
                    }
                    case 3: {
                        type = "audio/*";
                        break;
                    }
                    case 2: {
                        type = "dir";
                        break;
                    }
                    case 0:
                    case 1: {
                        type = "*/*";
                        break;
                    }
                }
                final String s3 = (String)hashMap.get((Object)"initialDirectory");
                final String[] o2 = com.google.android.gms.internal.auth.h.o((ArrayList)hashMap.get((Object)"allowedExtensions"));
                final byte[] k = (byte[])hashMap.get((Object)"bytes");
                final n4.c d = this.D;
                if (d.D != null) {
                    ((j)o).error("already_active", "File picker is already active", (Object)null);
                }
                else {
                    d.D = (j)o;
                    final Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    if (s != null && !s.isEmpty()) {
                        intent.putExtra("android.intent.extra.TITLE", s);
                    }
                    d.K = k;
                    if (type != null && !"dir".equals((Object)type) && type.split(",").length == 1) {
                        intent.setType(type);
                    }
                    else {
                        intent.setType("*/*");
                    }
                    if (s3 != null && !s3.isEmpty() && Build$VERSION.SDK_INT >= 26) {
                        intent.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)Uri.parse(s3));
                    }
                    if (o2 != null && o2.length > 0) {
                        intent.putExtra("android.intent.extra.MIME_TYPES", o2);
                    }
                    final FlutterActivity c = d.C;
                    if (intent.resolveActivity(((Context)c).getPackageManager()) != null) {
                        ((Activity)c).startActivityForResult(intent, n4.c.M);
                    }
                    else {
                        Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                        d.b("invalid_format_type", "Can't handle the provided file type.");
                    }
                }
                return;
            }
        }
        a.getClass();
        int n2 = 0;
        Label_0990: {
            switch (a.hashCode()) {
                case 112202875: {
                    if (!a.equals((Object)"video")) {
                        break;
                    }
                    n2 = 6;
                    break Label_0990;
                }
                case 103772132: {
                    if (!a.equals((Object)"media")) {
                        break;
                    }
                    n2 = 5;
                    break Label_0990;
                }
                case 100313435: {
                    if (!a.equals((Object)"image")) {
                        break;
                    }
                    n2 = 4;
                    break Label_0990;
                }
                case 93166550: {
                    if (!a.equals((Object)"audio")) {
                        break;
                    }
                    n2 = 3;
                    break Label_0990;
                }
                case 99469: {
                    if (!a.equals((Object)"dir")) {
                        break;
                    }
                    n2 = 2;
                    break Label_0990;
                }
                case 96748: {
                    if (!a.equals((Object)"any")) {
                        break;
                    }
                    n2 = 1;
                    break Label_0990;
                }
                case -1349088399: {
                    if (!a.equals((Object)"custom")) {
                        break;
                    }
                    n2 = 0;
                    break Label_0990;
                }
            }
            n2 = -1;
        }
        String i = null;
        switch (n2) {
            default: {
                i = null;
                break;
            }
            case 6: {
                i = "video/*";
                break;
            }
            case 5: {
                i = "image/*,video/*";
                break;
            }
            case 4: {
                i = "image/*";
                break;
            }
            case 3: {
                i = "audio/*";
                break;
            }
            case 2: {
                i = "dir";
                break;
            }
            case 0:
            case 1: {
                i = "*/*";
                break;
            }
        }
        e.K = i;
        String[] o3 = null;
        Label_1169: {
            if (i == null) {
                ((j)o).notImplemented();
            }
            else if (i != "dir") {
                e.L = (boolean)hashMap.get((Object)"allowMultipleSelection");
                e.M = (boolean)hashMap.get((Object)"withData");
                e.N = (int)hashMap.get((Object)"compressionQuality");
                o3 = com.google.android.gms.internal.auth.h.o((ArrayList)hashMap.get((Object)"allowedExtensions"));
                break Label_1169;
            }
            o3 = null;
        }
        if (a.equals((Object)"custom") && (o3 == null || o3.length == 0)) {
            ((j)o).error("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.any instead.", (Object)null);
        }
        else {
            final n4.c d2 = this.D;
            final String j = e.K;
            final boolean l = e.L;
            final boolean m2 = e.M;
            final int n3 = e.N;
            if (d2.D != null) {
                ((j)o).error("already_active", "File picker is already active", (Object)null);
            }
            else {
                d2.D = (j)o;
                d2.G = j;
                d2.E = l;
                d2.F = m2;
                d2.I = o3;
                d2.H = n3;
                if (j != null) {
                    Intent intent2;
                    if (j.equals((Object)"dir")) {
                        intent2 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    }
                    else {
                        Intent intent3;
                        if (d2.G.equals((Object)"image/*")) {
                            intent3 = new Intent("android.intent.action.PICK", MediaStore$Images$Media.EXTERNAL_CONTENT_URI);
                        }
                        else {
                            intent3 = new Intent("android.intent.action.GET_CONTENT");
                            intent3.addCategory("android.intent.category.OPENABLE");
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(Environment.getExternalStorageDirectory().getPath());
                        sb3.append(File.separator);
                        final Uri parse = Uri.parse(sb3.toString());
                        final StringBuilder sb4 = new StringBuilder("Selected type ");
                        sb4.append(d2.G);
                        Log.d("FilePickerDelegate", sb4.toString());
                        intent3.setDataAndType(parse, d2.G);
                        intent3.setType(d2.G);
                        intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", d2.E);
                        intent3.putExtra("multi-pick", d2.E);
                        if (d2.G.contains((CharSequence)",")) {
                            d2.I = d2.G.split(",");
                        }
                        final String[] i2 = d2.I;
                        intent2 = intent3;
                        if (i2 != null) {
                            intent3.putExtra("android.intent.extra.MIME_TYPES", i2);
                            intent2 = intent3;
                        }
                    }
                    final FlutterActivity c2 = d2.C;
                    if (intent2.resolveActivity(((Context)c2).getPackageManager()) != null) {
                        ((Activity)c2).startActivityForResult(intent2, n4.c.L);
                    }
                    else {
                        Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                        d2.b("invalid_format_type", "Can't handle the provided file type.");
                    }
                }
            }
        }
    }
    
    public final void onReattachedToActivityForConfigChanges(final b b) {
        this.onAttachedToActivity(b);
    }
}
