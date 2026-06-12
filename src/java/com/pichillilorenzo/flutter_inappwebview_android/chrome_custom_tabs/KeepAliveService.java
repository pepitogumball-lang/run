package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.os.IBinder;
import android.content.Intent;
import android.os.Binder;
import android.app.Service;

public class KeepAliveService extends Service
{
    private static final Binder sBinder;
    
    static {
        sBinder = new Binder();
    }
    
    public IBinder onBind(final Intent intent) {
        return (IBinder)KeepAliveService.sBinder;
    }
}
