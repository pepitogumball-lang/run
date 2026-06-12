package P1;

import java.util.concurrent.Executor;
import org.json.JSONObject;
import F1.E0;
import C2.f;
import com.google.android.gms.internal.ads.M3;
import android.webkit.ValueCallback;
import E1.o;
import java.util.Locale;
import com.google.android.gms.internal.ads.k8;
import org.json.JSONException;
import android.os.Bundle;
import com.google.android.gms.internal.ads.R7;
import J1.j;
import R1.a;

public final class s extends a
{
    public final int a;
    public final String b;
    public final Object c;
    
    @Override
    public final void a(String format) {
        switch (this.a) {
            default: {
                j.i("Failed to generate query info for Custom Tab error: ".concat(String.valueOf((Object)format)));
                try {
                    final R7 r7 = (R7)this.c;
                    r7.g.c(r7.a(this.b, format).toString(), (Bundle)null);
                }
                catch (final JSONException ex) {
                    j.g("Error creating PACT Error Response JSON: ", (Throwable)ex);
                }
                return;
            }
            case 0: {
                j.i("Failed to generate query info for the tagging library, error: ".concat(String.valueOf((Object)format)));
                final boolean booleanValue = (boolean)k8.b.p();
                final P1.a a = (P1.a)this.c;
                String concat;
                if (booleanValue) {
                    concat = ",\"as\":".concat(a.k.a().toString());
                }
                else {
                    concat = "";
                }
                final Locale default1 = Locale.getDefault();
                final M3 d = k8.d;
                long longValue;
                if (d.p()) {
                    longValue = (long)k8.g.p();
                }
                else {
                    longValue = 0L;
                }
                format = String.format(default1, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", new Object[] { this.b, format, longValue, concat });
                if (d.p()) {
                    try {
                        a.h.execute((Runnable)new r(this, format, 0));
                    }
                    catch (final RuntimeException ex2) {
                        o.B.g.g("TaggingLibraryJsInterface.getQueryInfo.onFailure", (Throwable)ex2);
                    }
                }
                else {
                    a.b.evaluateJavascript(format, (ValueCallback)null);
                }
                if ((boolean)k8.b.p() && (boolean)k8.c.p()) {
                    final y l = a.l;
                    l.getClass();
                    ((Executor)l.c).execute((Runnable)new x(l, 0));
                }
            }
        }
    }
    
    @Override
    public final void b(f f) {
        switch (this.a) {
            default: {
                final String a = ((E0)f.D).a;
                try {
                    final R7 r7 = (R7)this.c;
                    r7.g.c(r7.b(this.b, a).toString(), (Bundle)null);
                }
                catch (final JSONException ex) {
                    j.g("Error creating PACT Signal Response JSON: ", (Throwable)ex);
                }
                return;
            }
            case 0: {
                final String b = this.b;
                final P1.a a2 = (P1.a)this.c;
                final String a3 = ((E0)f.D).a;
                final long n = 0L;
                try {
                    final JSONObject jsonObject = new JSONObject();
                    jsonObject.put("paw_id", (Object)b);
                    jsonObject.put("signal", (Object)a3);
                    long longValue;
                    if (k8.d.p()) {
                        longValue = (long)k8.g.p();
                    }
                    else {
                        longValue = 0L;
                    }
                    jsonObject.put("sdk_ttl_ms", longValue);
                    if (k8.b.p()) {
                        jsonObject.put("as", (Object)a2.k.a());
                    }
                    f = (f)String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", new Object[] { jsonObject });
                }
                catch (final JSONException ex2) {
                    String concat;
                    if (k8.b.p()) {
                        concat = ",\"as\":".concat(a2.k.a().toString());
                    }
                    else {
                        concat = "";
                    }
                    final Locale default1 = Locale.getDefault();
                    final E0 e0 = (E0)f.D;
                    long longValue2 = n;
                    if (k8.d.p()) {
                        longValue2 = (long)k8.g.p();
                    }
                    f = (f)String.format(default1, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", new Object[] { b, e0.a, longValue2, concat });
                }
                if (k8.d.p()) {
                    try {
                        a2.h.execute((Runnable)new r(this, (String)f, 1));
                    }
                    catch (final RuntimeException ex3) {
                        o.B.g.g("TaggingLibraryJsInterface.getQueryInfo.onSuccess", (Throwable)ex3);
                    }
                }
                else {
                    a2.b.evaluateJavascript((String)f, (ValueCallback)null);
                }
                if ((boolean)k8.b.p() && (boolean)k8.c.p()) {
                    final y l = a2.l;
                    l.getClass();
                    ((Executor)l.c).execute((Runnable)new x(l, 0));
                }
            }
        }
    }
}
