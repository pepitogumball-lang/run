package Y0;

import m0.a;
import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import R0.m;

public final class g extends c
{
    public static final String i;
    
    static {
        i = m.h("StorageNotLowTracker");
    }
    
    @Override
    public final Object a() {
        final IntentFilter f = this.f();
        final Context b = super.b;
        Object o = null;
        final Intent registerReceiver = b.registerReceiver((BroadcastReceiver)null, f);
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            final String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals((Object)"android.intent.action.DEVICE_STORAGE_LOW")) {
                if (action.equals((Object)"android.intent.action.DEVICE_STORAGE_OK")) {
                    o = Boolean.TRUE;
                }
            }
            else {
                o = Boolean.FALSE;
            }
        }
        else {
            o = Boolean.TRUE;
        }
        return o;
    }
    
    @Override
    public final IntentFilter f() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
    
    @Override
    public final void g(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m.e().c(g.i, m0.a.f("Received ", intent.getAction()), new Throwable[0]);
        final String action = intent.getAction();
        action.getClass();
        if (!action.equals((Object)"android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals((Object)"android.intent.action.DEVICE_STORAGE_OK")) {
                this.c(Boolean.TRUE);
            }
        }
        else {
            this.c(Boolean.FALSE);
        }
    }
}
