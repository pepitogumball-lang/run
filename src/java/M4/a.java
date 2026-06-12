package m4;

import E4.j;
import F4.o;
import F4.m;
import io.flutter.embedding.android.FlutterActivity;
import java.util.HashSet;
import o.q1;
import android.os.Parcel;
import android.util.Log;
import android.content.Intent;
import C4.b;
import F4.g;
import w2.e;
import F4.p;
import F4.s;
import F4.h;
import F4.n;
import B4.c;

public class a implements c, n, h, C4.a, s
{
    public p C;
    public e D;
    public g E;
    public b F;
    public String G;
    public boolean H;
    public String I;
    
    public a() {
        this.H = false;
    }
    
    public final boolean a(final Intent intent) {
        return this.b(intent);
    }
    
    public final boolean b(final Intent intent) {
        if (intent == null) {
            return false;
        }
        Log.d("com.llfbandit.app_links", intent.toString());
        if ((intent.getFlags() & 0x100000) == 0x100000) {
            return false;
        }
        final byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
        final String s = null;
        String string = null;
        Label_0143: {
            if (byteArrayExtra != null) {
                if (byteArrayExtra.length != 0) {
                    final Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                    obtain.setDataPosition(0);
                    final int int1 = obtain.readInt();
                    int int2;
                    if ((int1 & 0xFFFF0000) != 0xFFFF0000) {
                        int2 = (int1 >> 16 & 0xFFFF);
                    }
                    else {
                        int2 = obtain.readInt();
                    }
                    if (int2 != 0) {
                        final int dataPosition = obtain.dataPosition();
                        string = obtain.readString();
                        obtain.setDataPosition(dataPosition + int2);
                        break Label_0143;
                    }
                }
            }
            string = null;
        }
        if (string != null) {
            Log.d("com.llfbandit.app_links", "handleIntent: (Data) (short deep link)".concat(string));
        }
        else {
            final String action = intent.getAction();
            string = s;
            if (!"android.intent.action.SEND".equals((Object)action)) {
                string = s;
                if (!"android.intent.action.SEND_MULTIPLE".equals((Object)action)) {
                    if ("android.intent.action.SENDTO".equals((Object)action)) {
                        string = s;
                    }
                    else {
                        final String dataString = intent.getDataString();
                        if ((string = dataString) != null) {
                            final StringBuilder sb = new StringBuilder("Handled intent: action: ");
                            sb.append(action);
                            sb.append(" / data: ");
                            sb.append(dataString);
                            Log.d("com.llfbandit.app_links", sb.toString());
                            string = dataString;
                        }
                    }
                }
            }
        }
        if (string == null) {
            return false;
        }
        if (this.G == null) {
            this.G = string;
        }
        this.I = string;
        final g e = this.E;
        if (e != null) {
            this.H = true;
            e.a((Object)string);
        }
        return true;
    }
    
    public final void i(final Object o) {
        this.E = null;
    }
    
    public final void m(final Object o, final g e) {
        this.E = e;
        if (!this.H) {
            final String g = this.G;
            if (g != null) {
                this.H = true;
                e.a((Object)g);
            }
        }
    }
    
    public final void onAttachedToActivity(final b f) {
        this.F = f;
        final q1 q1 = (q1)f;
        ((HashSet)q1.G).add((Object)this);
        this.b(((FlutterActivity)q1.C).getIntent());
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        (this.C = new p(b.c, "com.llfbandit.app_links/messages")).b((n)this);
        (this.D = new e(b.c, "com.llfbandit.app_links/events")).L((h)this);
    }
    
    public final void onDetachedFromActivity() {
        final b f = this.F;
        if (f != null) {
            ((HashSet)((q1)f).G).remove((Object)this);
        }
        this.F = null;
    }
    
    public final void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        this.C.b((n)null);
        this.D.L((h)null);
    }
    
    public final void onMethodCall(final m m, final o o) {
        if (m.a.equals((Object)"getLatestLink")) {
            ((j)o).success((Object)this.I);
        }
        else if (m.a.equals((Object)"getInitialLink")) {
            ((j)o).success((Object)this.G);
        }
        else {
            ((j)o).notImplemented();
        }
    }
    
    public final void onReattachedToActivityForConfigChanges(final b f) {
        this.F = f;
        ((HashSet)((q1)f).G).add((Object)this);
    }
}
