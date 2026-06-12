package L3;

import java.net.URLConnection;
import android.graphics.BitmapFactory;
import java.io.IOException;
import com.google.android.gms.internal.auth.m;
import java.io.InputStream;
import android.util.Log;
import android.graphics.Bitmap;
import O2.t;
import java.util.concurrent.Future;
import java.net.URL;
import java.io.Closeable;

public final class u implements Closeable
{
    public final URL C;
    public volatile Future D;
    public t E;
    
    public u(final URL c) {
        this.C = c;
    }
    
    public final Bitmap a() {
        final boolean loggable = Log.isLoggable("FirebaseMessaging", 4);
        final URL c = this.C;
        if (loggable) {
            final StringBuilder sb = new StringBuilder("Starting download of: ");
            sb.append((Object)c);
            Log.i("FirebaseMessaging", sb.toString());
        }
        final URLConnection openConnection = c.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            Object o = openConnection.getInputStream();
            try {
                final byte[] z = m.z(new d((InputStream)o));
                if (o != null) {
                    ((InputStream)o).close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    o = new StringBuilder("Downloaded ");
                    ((StringBuilder)o).append(z.length);
                    ((StringBuilder)o).append(" bytes from ");
                    ((StringBuilder)o).append((Object)c);
                    Log.v("FirebaseMessaging", ((StringBuilder)o).toString());
                }
                if (z.length > 1048576) {
                    throw new IOException("Image exceeds max size of 1048576");
                }
                o = BitmapFactory.decodeByteArray(z, 0, z.length);
                if (o != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        final StringBuilder sb2 = new StringBuilder("Successfully downloaded image: ");
                        sb2.append((Object)c);
                        Log.d("FirebaseMessaging", sb2.toString());
                    }
                    return (Bitmap)o;
                }
                o = new StringBuilder("Failed to decode image: ");
                ((StringBuilder)o).append((Object)c);
                throw new IOException(((StringBuilder)o).toString());
            }
            finally {
                if (o != null) {
                    try {
                        ((InputStream)o).close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }
    
    public final void close() {
        this.D.cancel(true);
    }
}
