package g2;

import android.app.Dialog;
import android.os.Handler;
import A2.b;
import android.net.Uri;
import android.app.AlertDialog;
import O2.p;
import android.content.Intent;
import f2.d;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class r extends BroadcastReceiver
{
    public Context a;
    public final d b;
    
    public r(final d b) {
        this.b = b;
    }
    
    public final void onReceive(Context a, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals((Object)schemeSpecificPart)) {
            final d b = this.b;
            final l l = (l)((p)b.E).E;
            l.E.set((Object)null);
            final b p2 = l.I.P;
            ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(3));
            final AlertDialog alertDialog = (AlertDialog)b.D;
            if (((Dialog)alertDialog).isShowing()) {
                ((Dialog)alertDialog).dismiss();
            }
            monitorenter(this);
            Label_0117: {
                try {
                    a = this.a;
                    if (a != null) {
                        a.unregisterReceiver((BroadcastReceiver)this);
                    }
                    break Label_0117;
                }
                finally {
                    monitorexit(this);
                    this.a = null;
                    monitorexit(this);
                }
            }
        }
    }
}
