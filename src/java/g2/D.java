package g2;

import f2.l;
import m0.a;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import android.util.Log;
import android.os.Message;
import A2.b;

public final class d extends b
{
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1) {
            if (what != 2) {
                final StringBuilder sb = new StringBuilder(String.valueOf(what).length() + 34);
                sb.append("Don't know how to handle message: ");
                sb.append(what);
                Log.wtf("BasePendingResult", sb.toString(), (Throwable)new Exception());
                return;
            }
            ((BasePendingResult)message.obj).I(Status.J);
        }
        else {
            final Pair pair = (Pair)message.obj;
            a.m(pair.first);
            final l l = (l)pair.second;
            try {
                throw null;
            }
            catch (final RuntimeException ex) {
                BasePendingResult.M(l);
                throw ex;
            }
        }
    }
}
