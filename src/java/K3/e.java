package k3;

import java.util.Locale;
import android.os.Process;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public final class e
{
    public static final String b;
    public static final AtomicLong c;
    public final String a;
    
    static {
        final StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append(System.currentTimeMillis());
        b = g.h(sb.toString());
        c = new AtomicLong(0L);
    }
    
    public e() {
        final long time = new Date().getTime();
        final long n = time / 1000L;
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        final byte[] array = allocate.array();
        final byte b = array[0];
        final byte b2 = array[1];
        final byte b3 = array[2];
        final byte b4 = array[3];
        final byte[] a = a(time % 1000L);
        final byte b5 = a[0];
        final byte b6 = a[1];
        final byte[] a2 = a(e.c.incrementAndGet());
        final byte b7 = a2[0];
        final byte b8 = a2[1];
        final byte[] a3 = a(Process.myPid().shortValue());
        final String e = g.e(new byte[] { b, b2, b3, b4, b5, b6, b7, b8, a3[0], a3[1] });
        final Locale us = Locale.US;
        this.a = String.format(us, "%s%s%s%s", new Object[] { e.substring(0, 12), e.substring(12, 16), e.subSequence(16, 20), k3.e.b.substring(0, 12) }).toUpperCase(us);
    }
    
    public static byte[] a(final long n) {
        final ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
