package E;

import android.content.Intent;
import android.os.Handler;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

public abstract class g
{
    public static Intent a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler, final int n) {
        return context.registerReceiver(broadcastReceiver, intentFilter, s, handler, n);
    }
}
