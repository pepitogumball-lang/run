package e2;

import android.os.Handler;
import androidx.fragment.app.p;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.pm.PackageManager;
import C3.i;
import C.n;
import q2.b;
import C.u;
import android.app.NotificationManager;
import android.app.PendingIntent;
import g2.g;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.app.FragmentManager;
import androidx.fragment.app.Q;
import android.app.DialogFragment;
import androidx.fragment.app.t;
import androidx.fragment.app.a;
import android.content.DialogInterface$OnDismissListener;
import h2.A;
import androidx.fragment.app.y;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.internal.measurement.L;
import android.content.DialogInterface$OnClickListener;
import h2.r;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.util.TypedValue;
import android.app.AlertDialog;
import android.content.DialogInterface$OnCancelListener;
import h2.s;
import android.app.Activity;

public final class e extends f
{
    public static final Object c;
    public static final e d;
    
    static {
        c = new Object();
        d = (e)new Object();
    }
    
    public static AlertDialog e(final Activity activity, final int n, final s s, final DialogInterface$OnCancelListener onCancelListener) {
        AlertDialog$Builder alertDialog$Builder = null;
        if (n == 0) {
            return null;
        }
        final TypedValue typedValue = new TypedValue();
        ((Context)activity).getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals((Object)((Context)activity).getResources().getResourceEntryName(typedValue.resourceId))) {
            alertDialog$Builder = new AlertDialog$Builder((Context)activity, 5);
        }
        AlertDialog$Builder alertDialog$Builder2;
        if ((alertDialog$Builder2 = alertDialog$Builder) == null) {
            alertDialog$Builder2 = new AlertDialog$Builder((Context)activity);
        }
        alertDialog$Builder2.setMessage((CharSequence)r.b((Context)activity, n));
        if (onCancelListener != null) {
            alertDialog$Builder2.setOnCancelListener(onCancelListener);
        }
        final Resources resources = ((Context)activity).getResources();
        String s2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    s2 = resources.getString(17039370);
                }
                else {
                    s2 = resources.getString(2131689513);
                }
            }
            else {
                s2 = resources.getString(2131689523);
            }
        }
        else {
            s2 = resources.getString(2131689516);
        }
        if (s2 != null) {
            alertDialog$Builder2.setPositiveButton((CharSequence)s2, (DialogInterface$OnClickListener)s);
        }
        final String a = r.a((Context)activity, n);
        if (a != null) {
            alertDialog$Builder2.setTitle((CharSequence)a);
        }
        Log.w("GoogleApiAvailability", L.h(n, "Creating dialog for Google Play services availability issue. ConnectionResult="), (Throwable)new IllegalArgumentException());
        return alertDialog$Builder2.create();
    }
    
    public static void h(Activity activity, AlertDialog alertDialog, final String s, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        while (true) {
            try {
                if (activity instanceof y) {
                    final Q supportFragmentManager = ((y)activity).getSupportFragmentManager();
                    activity = (Activity)new k();
                    A.i("Cannot display null dialog", (Object)alertDialog);
                    ((Dialog)alertDialog).setOnCancelListener((DialogInterface$OnCancelListener)null);
                    ((Dialog)alertDialog).setOnDismissListener((DialogInterface$OnDismissListener)null);
                    ((k)activity).L0 = alertDialog;
                    if (dialogInterface$OnCancelListener != null) {
                        ((k)activity).M0 = dialogInterface$OnCancelListener;
                    }
                    ((p)activity).I0 = false;
                    ((p)activity).J0 = true;
                    supportFragmentManager.getClass();
                    alertDialog = (AlertDialog)new a(supportFragmentManager);
                    ((a)alertDialog).o = true;
                    ((a)alertDialog).e(0, (t)activity, s);
                    ((a)alertDialog).d(false);
                    return;
                }
                final FragmentManager fragmentManager = activity.getFragmentManager();
                activity = (Activity)new DialogFragment();
                A.i("Cannot display null dialog", (Object)alertDialog);
                ((Dialog)alertDialog).setOnCancelListener((DialogInterface$OnCancelListener)null);
                ((Dialog)alertDialog).setOnDismissListener((DialogInterface$OnDismissListener)null);
                ((c)activity).C = alertDialog;
                if (dialogInterface$OnCancelListener != null) {
                    ((c)activity).D = dialogInterface$OnCancelListener;
                }
                ((DialogFragment)activity).show(fragmentManager, s);
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {
                continue;
            }
            break;
        }
    }
    
    public final void d(final GoogleApiActivity googleApiActivity, final int n, final GoogleApiActivity googleApiActivity2) {
        final AlertDialog e = e((Activity)googleApiActivity, n, new s(super.b(n, (Context)googleApiActivity, "d"), (Object)googleApiActivity, 0), (DialogInterface$OnCancelListener)googleApiActivity2);
        if (e == null) {
            return;
        }
        h((Activity)googleApiActivity, e, "GooglePlayServicesErrorDialog", (DialogInterface$OnCancelListener)googleApiActivity2);
    }
    
    public final void f(final Activity activity, final g g, final int n, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final AlertDialog e = e(activity, n, new s(super.b(n, (Context)activity, "d"), (Object)g, 1), dialogInterface$OnCancelListener);
        if (e == null) {
            return;
        }
        h(activity, e, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
    }
    
    public final void g(final Context context, int n, final PendingIntent pendingIntent) {
        Log.w("GoogleApiAvailability", Y3.a.j(n, "GMS core API Availability. ConnectionResult=", ", tag=null"), (Throwable)new IllegalArgumentException());
        if (n == 18) {
            ((Handler)new l(this, context)).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (n == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        String s;
        if (n == 6) {
            s = r.e(context, "common_google_play_services_resolution_required_title");
        }
        else {
            s = r.a(context, n);
        }
        String string = s;
        if (s == null) {
            string = context.getResources().getString(2131689520);
        }
        String s2;
        if (n != 6 && n != 19) {
            s2 = r.b(context, n);
        }
        else {
            s2 = r.d(context, "common_google_play_services_resolution_required_text", r.c(context));
        }
        final Resources resources = context.getResources();
        final Object systemService = context.getSystemService("notification");
        A.h(systemService);
        final NotificationManager notificationManager = (NotificationManager)systemService;
        final C.t t = new C.t(context, (String)null);
        t.c(t.m = true);
        t.e = C.t.b(string);
        final Object o = new Object();
        ((C.r)o).D = C.t.b(s2);
        t.e((u)o);
        final PackageManager packageManager = context.getPackageManager();
        if (q2.b.c == null) {
            q2.b.c = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        final boolean booleanValue = q2.b.c;
        final int n2 = 17301642;
        if (booleanValue) {
            int icon = context.getApplicationInfo().icon;
            if (icon == 0) {
                icon = n2;
            }
            t.s.icon = icon;
            t.j = 2;
            if (q2.b.l(context)) {
                t.b.add((Object)new n(resources.getString(2131689528), pendingIntent));
            }
            else {
                t.g = pendingIntent;
            }
        }
        else {
            t.s.icon = 17301642;
            t.s.tickerText = C.t.b(resources.getString(2131689520));
            t.s.when = System.currentTimeMillis();
            t.g = pendingIntent;
            t.f = C.t.b(s2);
        }
        Label_0518: {
            if (!q2.b.h()) {
                break Label_0518;
            }
            A.k(q2.b.h());
            final Object c = e.c;
            synchronized (c) {
                monitorexit(c);
                final NotificationChannel c2 = M.b.c(notificationManager);
                final String string2 = context.getResources().getString(2131689519);
                if (c2 == null) {
                    i.t(notificationManager, M.b.d(string2));
                }
                else if (!string2.contentEquals(M.b.n(c2))) {
                    M.b.q(c2, string2);
                    i.t(notificationManager, c2);
                }
                t.q = "com.google.android.gms.availability";
                final Notification a = t.a();
                if (n != 1 && n != 2 && n != 3) {
                    n = 39789;
                }
                else {
                    e2.i.a.set(false);
                    n = 10436;
                }
                notificationManager.notify(n, a);
            }
        }
    }
}
