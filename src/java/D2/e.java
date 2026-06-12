package d2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.regex.Matcher;
import t.j;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import android.os.Messenger;
import android.content.Intent;
import android.os.Message;
import android.os.Looper;
import A2.b;

public final class e extends b
{
    public final d2.b b;
    
    public e(final d2.b b, final Looper looper) {
        this.b = b;
        super(looper, 0, false);
        Looper.getMainLooper();
    }
    
    public final void handleMessage(final Message message) {
        final d2.b b = this.b;
        if (message != null) {
            final Object obj = message.obj;
            if (obj instanceof Intent) {
                final Intent intent = (Intent)obj;
                intent.setExtrasClassLoader((ClassLoader)new f());
                if (intent.hasExtra("google.messenger")) {
                    final Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof g) {
                        b.g = (g)parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        b.f = (Messenger)parcelableExtra;
                    }
                }
                final Intent intent2 = (Intent)message.obj;
                final String action = intent2.getAction();
                if (!Objects.equals((Object)action, (Object)"com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf((Object)action)));
                    }
                    return;
                }
                else {
                    String s;
                    if ((s = intent2.getStringExtra("registration_id")) == null) {
                        s = intent2.getStringExtra("unregistered");
                    }
                    if (s == null) {
                        final String stringExtra = intent2.getStringExtra("error");
                        if (stringExtra == null) {
                            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf((Object)intent2.getExtras())));
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra));
                        }
                        if (stringExtra.startsWith("|")) {
                            final String[] split = stringExtra.split("\\|");
                            if (split.length > 2 && Objects.equals((Object)split[1], (Object)"ID")) {
                                final String s2 = split[2];
                                String substring;
                                final String s3 = substring = split[3];
                                if (s3.startsWith(":")) {
                                    substring = s3.substring(1);
                                }
                                b.b(s2, intent2.putExtra("error", substring).getExtras());
                                return;
                            }
                            Log.w("Rpc", "Unexpected structured response ".concat(stringExtra));
                            return;
                        }
                        else {
                            final j a;
                            monitorenter(a = b.a);
                            int n = 0;
                            Label_0371: {
                                try {
                                    while (true) {
                                        final j a2 = b.a;
                                        if (n >= a2.E) {
                                            break Label_0371;
                                        }
                                        b.b((String)a2.h(n), intent2.getExtras());
                                        ++n;
                                    }
                                }
                                finally {
                                    monitorexit(a);
                                    monitorexit(a);
                                    return;
                                }
                            }
                        }
                    }
                    final Matcher matcher = d2.b.j.matcher((CharSequence)s);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(s));
                        }
                        return;
                    }
                    else {
                        final String group = matcher.group(1);
                        final String group2 = matcher.group(2);
                        if (group != null) {
                            final Bundle extras = intent2.getExtras();
                            ((BaseBundle)extras).putString("registration_id", group2);
                            b.b(group, extras);
                        }
                        return;
                    }
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
