package O4;

import android.content.Intent;
import android.os.PowerManager;
import android.content.ComponentName;
import android.os.PowerManager$WakeLock;
import android.content.Context;

public final class h extends n
{
    public final Context d;
    public final PowerManager$WakeLock e;
    public final PowerManager$WakeLock f;
    public boolean g;
    public boolean h;
    
    public h(final Context context, final ComponentName componentName) {
        super(componentName);
        this.d = context.getApplicationContext();
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        final StringBuilder sb = new StringBuilder();
        sb.append(componentName.getClassName());
        sb.append(":launch");
        (this.e = powerManager.newWakeLock(1, sb.toString())).setReferenceCounted(false);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(componentName.getClassName());
        sb2.append(":run");
        (this.f = powerManager.newWakeLock(1, sb2.toString())).setReferenceCounted(false);
    }
    
    @Override
    public final void a(Intent intent) {
        intent = new Intent(intent);
        intent.setComponent(super.a);
        if (this.d.startService(intent) != null) {
            monitorenter(this);
            Label_0069: {
                try {
                    if (this.g) {
                        break Label_0069;
                    }
                    this.g = true;
                    if (!this.h) {
                        this.e.acquire(60000L);
                    }
                    break Label_0069;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                }
            }
        }
    }
    
    @Override
    public final void c() {
        monitorenter(this);
        while (true) {
            Label_0035: {
                try {
                    if (!this.h) {
                        break Label_0047;
                    }
                    if (this.g) {
                        this.e.acquire(60000L);
                    }
                    break Label_0035;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                    return;
                    this.h = false;
                    this.f.release();
                    continue;
                }
            }
            break;
        }
    }
    
    @Override
    public final void d() {
        monitorenter(this);
        Label_0040: {
            try {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000L);
                    this.e.release();
                }
                break Label_0040;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            this.g = false;
        }
    }
}
