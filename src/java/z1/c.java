package z1;

import F1.L0;
import F1.D;
import F1.x0;
import android.os.RemoteException;
import J1.j;
import y1.t;
import y1.s;
import y1.h;
import h2.A;
import android.content.Context;
import y1.k;

public final class c extends k
{
    public c(final Context context) {
        super(context);
        A.i("Context cannot be null", (Object)context);
    }
    
    public h[] getAdSizes() {
        return super.C.g;
    }
    
    public d getAppEventListener() {
        return super.C.h;
    }
    
    public s getVideoController() {
        return super.C.c;
    }
    
    public t getVideoOptions() {
        return super.C.j;
    }
    
    public void setAdSizes(final h... array) {
        if (array != null && array.length > 0) {
            super.C.d(array);
            return;
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }
    
    public void setAppEventListener(final d d) {
        super.C.e(d);
    }
    
    public void setManualImpressionsEnabled(final boolean m) {
        final x0 c = super.C;
        c.m = m;
        try {
            final D i = c.i;
            if (i != null) {
                i.b5(m);
            }
        }
        catch (final RemoteException ex) {
            j.k("#007 Could not call remote method.", (Exception)ex);
        }
    }
    
    public void setVideoOptions(final t j) {
        final x0 c = super.C;
        c.j = j;
        try {
            final D i = c.i;
            if (i != null) {
                L0 l0;
                if (j == null) {
                    l0 = null;
                }
                else {
                    l0 = new L0(j);
                }
                i.Q4(l0);
            }
        }
        catch (final RemoteException ex) {
            j.k("#007 Could not call remote method.", (Exception)ex);
        }
    }
}
