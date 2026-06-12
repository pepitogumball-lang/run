package C;

import android.os.Build$VERSION;
import androidx.lifecycle.P;
import androidx.lifecycle.L;
import android.os.Bundle;
import android.view.View;
import android.view.Window$Callback;
import a.a;
import n5.h;
import android.view.KeyEvent;
import androidx.lifecycle.v;
import t.j;
import O.l;
import androidx.lifecycle.t;
import android.app.Activity;

public abstract class k extends Activity implements t, l
{
    private final j extraDataMap;
    private final v lifecycleRegistry;
    
    public k() {
        this.extraDataMap = new j();
        this.lifecycleRegistry = new v((t)this);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        h.e("event", (Object)keyEvent);
        final View decorView = this.getWindow().getDecorView();
        h.d("window.decorView", (Object)decorView);
        return a.e(decorView, keyEvent) || a.f((l)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        h.e("event", (Object)keyEvent);
        final View decorView = this.getWindow().getDecorView();
        h.d("window.decorView", (Object)decorView);
        return a.e(decorView, keyEvent) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public <T extends C.j> T getExtraData(final Class<T> clazz) {
        h.e("extraDataClass", (Object)clazz);
        m0.a.m(this.extraDataMap.getOrDefault((Object)clazz, (Object)null));
        return null;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final int d = L.D;
        P.g((Activity)this);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        h.e("outState", (Object)bundle);
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(bundle);
    }
    
    public void putExtraData(final C.j j) {
        h.e("extraData", (Object)j);
        throw null;
    }
    
    public final boolean shouldDumpInternalState(final String[] array) {
        int n2;
        final int n = n2 = 0;
        if (array != null) {
            if (array.length == 0) {
                n2 = n;
            }
            else {
                final String s = array[0];
                while (true) {
                    Label_0165: {
                        switch (s.hashCode()) {
                            default: {
                                n2 = n;
                                return (n2 ^ 0x1) != 0x0;
                            }
                            case 1455016274: {
                                if (!s.equals((Object)"--autofill")) {
                                    n2 = n;
                                    return (n2 ^ 0x1) != 0x0;
                                }
                                n2 = n;
                                if (Build$VERSION.SDK_INT >= 26) {
                                    break;
                                }
                                return (n2 ^ 0x1) != 0x0;
                            }
                            case 1159329357: {
                                if (!s.equals((Object)"--contentcapture")) {
                                    n2 = n;
                                    return (n2 ^ 0x1) != 0x0;
                                }
                                n2 = n;
                                if (Build$VERSION.SDK_INT >= 29) {
                                    break;
                                }
                                return (n2 ^ 0x1) != 0x0;
                            }
                            case 472614934: {
                                if (!s.equals((Object)"--list-dumpables")) {
                                    n2 = n;
                                    return (n2 ^ 0x1) != 0x0;
                                }
                                break Label_0165;
                            }
                            case 100470631: {
                                if (!s.equals((Object)"--dump-dumpable")) {
                                    n2 = n;
                                    return (n2 ^ 0x1) != 0x0;
                                }
                                break Label_0165;
                            }
                            case -645125871: {
                                if (!s.equals((Object)"--translation")) {
                                    n2 = n;
                                    return (n2 ^ 0x1) != 0x0;
                                }
                                n2 = n;
                                if (Build$VERSION.SDK_INT >= 31) {
                                    break;
                                }
                                return (n2 ^ 0x1) != 0x0;
                            }
                        }
                        n2 = 1;
                        return (n2 ^ 0x1) != 0x0;
                    }
                    n2 = n;
                    if (Build$VERSION.SDK_INT >= 33) {
                        continue;
                    }
                    break;
                }
            }
        }
        return (n2 ^ 0x1) != 0x0;
    }
    
    public boolean superDispatchKeyEvent(final KeyEvent keyEvent) {
        h.e("event", (Object)keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }
}
