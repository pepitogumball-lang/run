package h2;

import android.app.Activity;
import g2.g;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Build;
import android.content.DialogInterface;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.content.Intent;
import android.content.DialogInterface$OnClickListener;

public final class s implements DialogInterface$OnClickListener
{
    public final int C;
    public final Intent D;
    public final Object E;
    
    public final void a() {
        switch (this.C) {
            default: {
                final Intent d = this.D;
                if (d != null) {
                    ((g)this.E).startActivityForResult(d, 2);
                }
                return;
            }
            case 0: {
                final Intent d2 = this.D;
                if (d2 != null) {
                    ((Activity)this.E).startActivityForResult(d2, 2);
                }
            }
        }
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        try {
            try {
                this.a();
            }
            finally {}
        }
        catch (final ActivityNotFoundException ex) {
            String s = "Failed to start resolution intent.";
            if (Build.FINGERPRINT.contains((CharSequence)"generic")) {
                s = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", s, (Throwable)ex);
        }
        dialogInterface.dismiss();
        return;
        dialogInterface.dismiss();
    }
}
