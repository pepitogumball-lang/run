package K;

import com.google.android.gms.internal.auth.h;
import w5.f;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e extends AtomicBoolean implements OutcomeReceiver
{
    public final f C;
    
    public e(final f c) {
        super(false);
        this.C = c;
    }
    
    public final void onError(final Throwable t) {
        if (this.compareAndSet(false, true)) {
            this.C.h((Object)h.k(t));
        }
    }
    
    public final void onResult(final Object o) {
        if (this.compareAndSet(false, true)) {
            this.C.h(o);
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ContinuationOutcomeReceiver(outcomeReceived = ");
        sb.append(this.get());
        sb.append(')');
        return sb.toString();
    }
}
