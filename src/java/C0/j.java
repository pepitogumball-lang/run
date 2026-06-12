package c0;

import java.lang.ref.Reference;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import a0.g;

public final class j extends g
{
    public final int a;
    public final WeakReference b;
    
    public j(final EditText editText) {
        this.a = 0;
        this.b = new WeakReference((Object)editText);
    }
    
    public j(final SwitchCompat switchCompat) {
        this.a = 1;
        this.b = new WeakReference((Object)switchCompat);
    }
    
    @Override
    public void a() {
        switch (this.a) {
            default: {
                return;
            }
            case 1: {
                final SwitchCompat switchCompat = (SwitchCompat)((Reference)this.b).get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
            }
        }
    }
    
    @Override
    public final void b() {
        switch (this.a) {
            default: {
                final SwitchCompat switchCompat = (SwitchCompat)((Reference)this.b).get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                return;
            }
            case 0: {
                k.a((EditText)((Reference)this.b).get(), 1);
            }
        }
    }
}
