package R4;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.platform.f;

public final class K implements f
{
    public final int C;
    public Object D;
    
    private final void a() {
    }
    
    private final void b() {
    }
    
    @Override
    public final void dispose() {
        switch (this.C) {
            default: {
                return;
            }
            case 0: {
                this.D = null;
            }
        }
    }
    
    @Override
    public final View getView() {
        switch (this.C) {
            default: {
                return new View((Context)this.D);
            }
            case 1: {
                return (View)this.D;
            }
            case 0: {
                return (View)this.D;
            }
        }
    }
}
