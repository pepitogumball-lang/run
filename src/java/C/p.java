package C;

import android.graphics.drawable.Icon;
import android.app.Notification$BigPictureStyle;

public abstract class p
{
    public static void a(final Notification$BigPictureStyle notification$BigPictureStyle, final Icon icon) {
        notification$BigPictureStyle.bigPicture(icon);
    }
    
    public static void b(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence contentDescription) {
        notification$BigPictureStyle.setContentDescription(contentDescription);
    }
    
    public static void c(final Notification$BigPictureStyle notification$BigPictureStyle, final boolean b) {
        notification$BigPictureStyle.showBigPictureWhenCollapsed(b);
    }
}
