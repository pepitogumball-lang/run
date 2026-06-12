package n4;

import android.content.Context;
import java.io.OutputStream;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import android.app.Activity;
import com.google.android.gms.internal.auth.h;
import java.io.File;
import android.os.Environment;
import android.content.Intent;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.Serializable;
import android.os.Looper;
import F4.g;
import E4.j;
import io.flutter.embedding.android.FlutterActivity;
import F4.r;

public final class c implements r
{
    public static final int L;
    public static final int M;
    public final FlutterActivity C;
    public j D;
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public String[] I;
    public g J;
    public byte[] K;
    
    static {
        L = (e.class.hashCode() + 43 & 0xFFFF);
        M = (e.class.hashCode() + 83 & 0xFFFF);
    }
    
    public c(final FlutterActivity c) {
        this.E = false;
        this.F = false;
        this.H = 20;
        this.C = c;
        this.D = null;
    }
    
    public final void a(final boolean b) {
        if (this.J != null) {
            if (!this.G.equals((Object)"dir")) {
                new b(this, Looper.getMainLooper(), b).obtainMessage().sendToTarget();
            }
        }
    }
    
    public final void b(final String s, final String s2) {
        if (this.D == null) {
            return;
        }
        this.a(false);
        this.D.error(s, s2, (Object)null);
        this.D = null;
    }
    
    public final void c(final Serializable s) {
        this.a(false);
        if (this.D != null) {
            Object o;
            if ((o = s) != null) {
                o = s;
                if (!(s instanceof String)) {
                    o = new ArrayList();
                    for (final a a : (ArrayList)s) {
                        a.getClass();
                        final HashMap hashMap = new HashMap();
                        hashMap.put((Object)"path", (Object)a.a);
                        hashMap.put((Object)"name", (Object)a.b);
                        hashMap.put((Object)"size", (Object)a.d);
                        hashMap.put((Object)"bytes", (Object)a.e);
                        hashMap.put((Object)"identifier", (Object)a.c.toString());
                        ((ArrayList)o).add((Object)hashMap);
                    }
                }
            }
            this.D.success(o);
            this.D = null;
        }
    }
    
    public final boolean onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == c.M) {
            if (n2 == -1) {
                if (intent == null) {
                    return false;
                }
                this.a(true);
                final Uri data = intent.getData();
                if (data != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                    sb.append(File.separator);
                    final FlutterActivity c = this.C;
                    sb.append(h.n(data, (Activity)c));
                    final String string = sb.toString();
                    Label_0135: {
                        try {
                            final OutputStream openOutputStream = ((Context)c).getContentResolver().openOutputStream(data);
                            if (openOutputStream != null) {
                                openOutputStream.write(this.K);
                                openOutputStream.flush();
                                openOutputStream.close();
                            }
                        }
                        catch (final IOException ex) {
                            break Label_0135;
                        }
                        this.c((Serializable)string);
                        return true;
                    }
                    final IOException ex;
                    Log.i("FilePickerDelegate", "Error while saving file", (Throwable)ex);
                    this.b("Error while saving file", ((Throwable)ex).getMessage());
                }
            }
            if (n2 == 0) {
                Log.i("FilePickerDelegate", "User cancelled the save request");
                this.c(null);
            }
            return false;
        }
        if (this.G == null) {
            return false;
        }
        final int l = c.L;
        if (n == l && n2 == -1) {
            this.a(true);
            new Thread((Runnable)new j0.c((Object)this, 1, (Object)intent)).start();
            return true;
        }
        if (n == l && n2 == 0) {
            Log.i("FilePickerDelegate", "User cancelled the picker request");
            this.c(null);
            return true;
        }
        if (n == l) {
            this.b("unknown_activity", "Unknown activity error, please fill an issue.");
        }
        return false;
    }
}
