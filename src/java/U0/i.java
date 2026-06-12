package u0;

import android.os.Binder;
import android.os.IInterface;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.IMultiInstanceInvalidationService$Stub;

public final class i extends IMultiInstanceInvalidationService$Stub
{
    public final MultiInstanceInvalidationService C;
    
    public i(final MultiInstanceInvalidationService c) {
        this.C = c;
        ((Binder)this).attachInterface((IInterface)this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
