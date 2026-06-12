package G0;

import android.os.Build$VERSION;

public class b extends c
{
    public final int d;
    
    @Override
    public final boolean a() {
        switch (this.d) {
            default: {
                return Build$VERSION.SDK_INT >= 29;
            }
            case 5: {
                return Build$VERSION.SDK_INT >= 28;
            }
            case 4: {
                return Build$VERSION.SDK_INT >= 27;
            }
            case 3: {
                return Build$VERSION.SDK_INT >= 26;
            }
            case 2: {
                return false;
            }
            case 1: {
                return true;
            }
            case 0: {
                return true;
            }
        }
    }
}
