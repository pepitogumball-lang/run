package Y0;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import R0.m;

public final class a extends c
{
    public static final String i;
    
    static {
        i = m.h("BatteryChrgTracker");
    }
    
    @Override
    public final Object a() {
        final IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        final Context b = super.b;
        Object value = null;
        final Intent registerReceiver = b.registerReceiver((BroadcastReceiver)null, intentFilter);
        boolean b2 = false;
        if (registerReceiver == null) {
            m.e().d(a.i, "getInitialState - null intent received", new Throwable[0]);
        }
        else {
            final int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                b2 = true;
            }
            value = b2;
        }
        return value;
    }
    
    @Override
    public final IntentFilter f() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
    
    @Override
    public final void g(final Intent intent) {
        int n = 0;
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        m.e().c(a.i, "Received ".concat(action), new Throwable[0]);
        Label_0152: {
            switch (action.hashCode()) {
                case 1019184907: {
                    if (!action.equals((Object)"android.intent.action.ACTION_POWER_CONNECTED")) {
                        break;
                    }
                    n = 3;
                    break Label_0152;
                }
                case 948344062: {
                    if (!action.equals((Object)"android.os.action.CHARGING")) {
                        break;
                    }
                    n = 2;
                    break Label_0152;
                }
                case -54942926: {
                    if (!action.equals((Object)"android.os.action.DISCHARGING")) {
                        break;
                    }
                    n = 1;
                    break Label_0152;
                }
                case -1886648615: {
                    if (!action.equals((Object)"android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        break;
                    }
                    break Label_0152;
                }
            }
            n = -1;
        }
        switch (n) {
            case 3: {
                this.c(Boolean.TRUE);
                break;
            }
            case 2: {
                this.c(Boolean.TRUE);
                break;
            }
            case 1: {
                this.c(Boolean.FALSE);
                break;
            }
            case 0: {
                this.c(Boolean.FALSE);
                break;
            }
        }
    }
}
