package x4;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import io.flutter.embedding.engine.FlutterJNI;
import F4.e;

public final class f implements e
{
    public final FlutterJNI a;
    public final int b;
    public final AtomicBoolean c;
    
    public f(final FlutterJNI a, final int b) {
        this.c = new AtomicBoolean(false);
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        if (!this.c.getAndSet(true)) {
            final int b = this.b;
            final FlutterJNI a = this.a;
            if (byteBuffer == null) {
                a.invokePlatformMessageEmptyResponseCallback(b);
            }
            else {
                a.invokePlatformMessageResponseCallback(b, byteBuffer, ((Buffer)byteBuffer).position());
            }
            return;
        }
        throw new IllegalStateException("Reply already submitted");
    }
}
