package h2;

import java.util.concurrent.atomic.AtomicBoolean;
import android.os.LocaleList;
import K.i;
import K.d;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import q2.b;
import android.content.res.Resources;
import android.util.Log;
import android.content.Context;
import java.util.Locale;
import t.j;

public abstract class r
{
    public static final j a;
    public static Locale b;
    
    static {
        a = new j();
    }
    
    public static String a(final Context context, final int n) {
        final Resources resources = context.getResources();
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(n);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 11: {
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            }
            case 10: {
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 8: {
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            }
            case 4:
            case 6:
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(2131689515);
            }
            case 2: {
                return resources.getString(2131689525);
            }
            case 1: {
                return resources.getString(2131689518);
            }
        }
    }
    
    public static String b(final Context context, final int n) {
        final Resources resources = context.getResources();
        final String c = c(context);
        if (n == 1) {
            return resources.getString(2131689517, new Object[] { c });
        }
        if (n != 2) {
            if (n == 3) {
                return resources.getString(2131689514, new Object[] { c });
            }
            if (n == 5) {
                return d(context, "common_google_play_services_invalid_account_text", c);
            }
            if (n == 7) {
                return d(context, "common_google_play_services_network_error_text", c);
            }
            if (n == 9) {
                return resources.getString(2131689522, new Object[] { c });
            }
            if (n == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", c);
            }
            switch (n) {
                default: {
                    return resources.getString(2131689521, new Object[] { c });
                }
                case 18: {
                    return resources.getString(2131689526, new Object[] { c });
                }
                case 17: {
                    return d(context, "common_google_play_services_sign_in_failed_text", c);
                }
                case 16: {
                    return d(context, "common_google_play_services_api_unavailable_text", c);
                }
            }
        }
        else {
            if (q2.b.l(context)) {
                return resources.getString(2131689527);
            }
            return resources.getString(2131689524, new Object[] { c });
        }
    }
    
    public static String c(final Context context) {
        final String packageName = context.getPackageName();
        try {
            return s2.b.a(context).b(packageName).toString();
        }
        catch (final PackageManager$NameNotFoundException | NullPointerException ex) {
            final String name = context.getApplicationInfo().name;
            if (TextUtils.isEmpty((CharSequence)name)) {
                return packageName;
            }
            return name;
        }
    }
    
    public static String d(final Context context, String s, final String s2) {
        final Resources resources = context.getResources();
        String s3;
        s = (s3 = e(context, s));
        if (s == null) {
            s3 = resources.getString(2131689521);
        }
        return String.format(resources.getConfiguration().locale, s3, new Object[] { s2 });
    }
    
    public static String e(final Context context, final String s) {
        final j a = r.a;
        final j j;
        monitorenter(j = a);
        Label_0061: {
            try {
                final LocaleList a2 = d.a(context.getResources().getConfiguration());
                new(K.i.class)();
                final Locale value = a2.get(0);
                if (!value.equals((Object)r.b)) {
                    a.clear();
                    r.b = value;
                }
                break Label_0061;
            }
            finally {
                monitorexit(j);
                Resources resourcesForApplication;
                final String string;
                int identifier;
                String s2;
                AtomicBoolean a3;
                Block_8:Block_5_Outer:
                while (true) {
                    while (true) {
                        monitorexit(j);
                        return null;
                        iftrue(Label_0113:)(resourcesForApplication != null);
                        continue Block_5_Outer;
                    }
                    Label_0230: {
                        a.put((Object)s, (Object)string);
                    }
                    monitorexit(j);
                    return string;
                    Label_0113:
                    identifier = resourcesForApplication.getIdentifier(s, "string", "com.google.android.gms");
                    iftrue(Label_0172:)(identifier != 0);
                    break Block_8;
                    while (true) {
                        monitorexit(j);
                        return s2;
                        s2 = (String)a.getOrDefault((Object)s, (Object)null);
                        iftrue(Label_0083:)(s2 == null);
                        continue;
                    }
                    Label_0083:
                    a3 = e2.i.a;
                    try {
                        resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        resourcesForApplication = null;
                    }
                    continue Block_5_Outer;
                }
                final StringBuilder sb = new StringBuilder(s.length() + 18);
                sb.append("Missing resource: ");
                sb.append(s);
                Log.w("GoogleApiAvailability", sb.toString());
                monitorexit(j);
                return null;
                Label_0172: {
                    string = resourcesForApplication.getString(identifier);
                }
                iftrue(Label_0230:)(!TextUtils.isEmpty((CharSequence)string));
                final StringBuilder sb2 = new StringBuilder(s.length() + 20);
                sb2.append("Got empty resource: ");
                sb2.append(s);
                Log.w("GoogleApiAvailability", sb2.toString());
                monitorexit(j);
                return null;
            }
        }
    }
}
