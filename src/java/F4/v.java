package F4;

import java.nio.Buffer;
import java.io.OutputStream;
import java.nio.ByteOrder;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class v implements q
{
    public static final v b;
    public final u a;
    
    static {
        b = new v(u.a);
    }
    
    public v(final u a) {
        this.a = a;
    }
    
    @Override
    public final ByteBuffer a(final Object o) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((OutputStream)byteArrayOutputStream).write(0);
        this.a.k((t)byteArrayOutputStream, o);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(((t)byteArrayOutputStream).a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
    
    @Override
    public final ByteBuffer b(final String s, final String s2) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((OutputStream)byteArrayOutputStream).write(1);
        final u a = this.a;
        a.k((t)byteArrayOutputStream, "error");
        a.k((t)byteArrayOutputStream, s);
        a.k((t)byteArrayOutputStream, null);
        a.k((t)byteArrayOutputStream, s2);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(((t)byteArrayOutputStream).a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
    
    @Override
    public final ByteBuffer c(final String s, final String s2, final Object o) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((OutputStream)byteArrayOutputStream).write(1);
        final u a = this.a;
        a.k((t)byteArrayOutputStream, s);
        a.k((t)byteArrayOutputStream, s2);
        if (o instanceof Throwable) {
            a.k((t)byteArrayOutputStream, Log.getStackTraceString((Throwable)o));
        }
        else {
            a.k((t)byteArrayOutputStream, o);
        }
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(((t)byteArrayOutputStream).a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
    
    @Override
    public final m d(final ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        final u a = this.a;
        final Object e = a.e(byteBuffer);
        final Object e2 = a.e(byteBuffer);
        if (e instanceof String && !((Buffer)byteBuffer).hasRemaining()) {
            return new m((String)e, e2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }
    
    @Override
    public final Object e(final ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        final byte value = byteBuffer.get();
        final u a = this.a;
        if (value != 0) {
            if (value != 1) {
                throw new IllegalArgumentException("Envelope corrupted");
            }
        }
        else {
            final Object e = a.e(byteBuffer);
            if (!((Buffer)byteBuffer).hasRemaining()) {
                return e;
            }
        }
        final Object e2 = a.e(byteBuffer);
        final Object e3 = a.e(byteBuffer);
        final Object e4 = a.e(byteBuffer);
        if (e2 instanceof String && (e3 == null || e3 instanceof String) && !((Buffer)byteBuffer).hasRemaining()) {
            throw new i((String)e2, (String)e3, e4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
    
    @Override
    public final ByteBuffer f(final m m) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final u a = this.a;
        a.k((t)byteArrayOutputStream, m.a);
        a.k((t)byteArrayOutputStream, m.b);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(((t)byteArrayOutputStream).a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
}
