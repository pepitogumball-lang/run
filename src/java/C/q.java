package C;

import android.graphics.Bitmap;
import I.c;
import android.os.Build$VERSION;
import android.content.Context;
import android.app.Notification$BigPictureStyle;
import android.app.Notification$Builder;
import L3.A;
import androidx.core.graphics.drawable.IconCompat;

public final class q extends u
{
    public IconCompat D;
    public IconCompat E;
    public boolean F;
    
    @Override
    public final void e(final A a) {
        final Notification$BigPictureStyle setBigContentTitle = new Notification$BigPictureStyle((Notification$Builder)a.E).setBigContentTitle((CharSequence)null);
        final IconCompat d = this.D;
        final Context context = (Context)a.D;
        Notification$BigPictureStyle bigPicture = setBigContentTitle;
        if (d != null) {
            if (Build$VERSION.SDK_INT >= 31) {
                p.a(setBigContentTitle, c.c(d, context));
                bigPicture = setBigContentTitle;
            }
            else {
                bigPicture = setBigContentTitle;
                if (d.d() == 1) {
                    final IconCompat d2 = this.D;
                    final int a2 = d2.a;
                    Bitmap a3;
                    if (a2 == -1) {
                        final Object b = d2.b;
                        if (b instanceof Bitmap) {
                            a3 = (Bitmap)b;
                        }
                        else {
                            a3 = null;
                        }
                    }
                    else if (a2 == 1) {
                        a3 = (Bitmap)d2.b;
                    }
                    else {
                        if (a2 != 5) {
                            final StringBuilder sb = new StringBuilder("called getBitmap() on ");
                            sb.append((Object)d2);
                            throw new IllegalStateException(sb.toString());
                        }
                        a3 = IconCompat.a((Bitmap)d2.b, true);
                    }
                    bigPicture = setBigContentTitle.bigPicture(a3);
                }
            }
        }
        if (this.F) {
            final IconCompat e = this.E;
            if (e == null) {
                bigPicture.bigLargeIcon((Bitmap)null);
            }
            else {
                o.a(bigPicture, c.c(e, context));
            }
        }
        if (Build$VERSION.SDK_INT >= 31) {
            p.c(bigPicture, false);
            p.b(bigPicture, null);
        }
    }
    
    @Override
    public final String g() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
