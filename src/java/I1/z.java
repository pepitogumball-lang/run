package I1;

import java.nio.MappedByteBuffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel$MapMode;
import java.security.MessageDigest;
import com.google.android.gms.internal.ads.tE;
import android.os.SystemClock;
import java.nio.channels.FileChannel;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.internal.ads.p3;

public final class z implements p3
{
    public long C;
    public long D;
    public Object E;
    
    public z() {
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
    }
    
    public z(final long c, final long d, final TimeUnit e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public z(final FileChannel e, final long c, final long d) {
        this.E = e;
        this.C = c;
        this.D = d;
    }
    
    public long a() {
        return this.D;
    }
    
    public void b(Exception e) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.E == null) {
            this.E = e;
        }
        if (this.C == -9223372036854775807L) {
            final Object z = tE.Z;
            synchronized (z) {
                final boolean b = tE.b0 > 0;
                monitorexit(z);
                if (!b) {
                    this.C = 200L + elapsedRealtime;
                }
            }
        }
        final long c = this.C;
        if (c != -9223372036854775807L && elapsedRealtime >= c) {
            final Exception ex = (Exception)this.E;
            if (ex != e) {
                ((Throwable)ex).addSuppressed((Throwable)e);
            }
            e = (Exception)this.E;
            this.E = null;
            this.C = -9223372036854775807L;
            this.D = -9223372036854775807L;
            throw e;
        }
        this.D = elapsedRealtime + 50L;
    }
    
    public void d(final MessageDigest[] array, final long n, int i) {
        final MappedByteBuffer map = ((FileChannel)this.E).map(FileChannel$MapMode.READ_ONLY, this.C + n, (long)i);
        map.load();
        MessageDigest messageDigest;
        for (i = 0; i < array.length; ++i) {
            messageDigest = array[i];
            map.position(0);
            messageDigest.update((ByteBuffer)map);
        }
    }
}
