package F4;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class w implements l
{
    public static final Charset a;
    public static final w b;
    
    static {
        a = Charset.forName("UTF8");
        b = (w)new Object();
    }
    
    public static String c(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        final int remaining = ((Buffer)byteBuffer).remaining();
        int arrayOffset;
        byte[] array2;
        if (byteBuffer.hasArray()) {
            final byte[] array = byteBuffer.array();
            arrayOffset = byteBuffer.arrayOffset();
            array2 = array;
        }
        else {
            final byte[] array3 = new byte[remaining];
            byteBuffer.get(array3);
            arrayOffset = 0;
            array2 = array3;
        }
        return new String(array2, arrayOffset, remaining, w.a);
    }
    
    public static ByteBuffer d(final String s) {
        if (s == null) {
            return null;
        }
        final byte[] bytes = s.getBytes(w.a);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
