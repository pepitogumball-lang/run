package c2;

import android.os.Handler;
import A2.b;
import java.util.Iterator;
import java.util.Set;
import g2.e;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.content.Context;
import C2.x;

public abstract class j
{
    public static final x a;
    
    static {
        a = new x("GoogleSignInCommon", new String[0]);
    }
    
    public static Intent a(final Context context, final GoogleSignInOptions googleSignInOptions) {
        j.a.g("getSignInIntent()", new Object[0]);
        final SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        final Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, (Class)SignInHubActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("config", (Parcelable)signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }
    
    public static void b(final Context context) {
        k.F(context).G();
        final Set a = f2.j.a;
        synchronized (a) {
            monitorexit(a);
            final Iterator iterator = a.iterator();
            if (!iterator.hasNext()) {
                final Object t;
                monitorenter(t = e.T);
                try {
                    final e u = e.U;
                    if (u != null) {
                        u.K.incrementAndGet();
                        final b p = u.P;
                        ((Handler)p).sendMessageAtFrontOfQueue(((Handler)p).obtainMessage(10));
                    }
                    return;
                }
                finally {
                    monitorexit(t);
                    return;
                }
            }
            iterator.next().getClass();
            throw new UnsupportedOperationException();
        }
    }
}
