package F4;

import java.nio.Buffer;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class u implements l
{
    public static final u a;
    public static final boolean b;
    public static final Charset c;
    
    static {
        a = (u)new Object();
        b = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);
        c = Charset.forName("UTF8");
    }
    
    public static final void c(final int n, final ByteBuffer byteBuffer) {
        final int n2 = ((Buffer)byteBuffer).position() % n;
        if (n2 != 0) {
            byteBuffer.position(((Buffer)byteBuffer).position() + n - n2);
        }
    }
    
    public static final int d(final ByteBuffer byteBuffer) {
        if (!((Buffer)byteBuffer).hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        final int n = byteBuffer.get() & 0xFF;
        if (n < 254) {
            return n;
        }
        if (n == 254) {
            return byteBuffer.getChar();
        }
        return byteBuffer.getInt();
    }
    
    public static final void g(final t t, final int n) {
        final int n2 = t.size() % n;
        if (n2 != 0) {
            for (int i = 0; i < n - n2; ++i) {
                t.write(0);
            }
        }
    }
    
    public static final void h(final t t, final int n) {
        if (u.b) {
            t.write(n);
            t.write(n >>> 8);
            t.write(n >>> 16);
            t.write(n >>> 24);
        }
        else {
            t.write(n >>> 24);
            t.write(n >>> 16);
            t.write(n >>> 8);
            t.write(n);
        }
    }
    
    public static final void i(final t t, final long n) {
        if (u.b) {
            t.write((int)(byte)n);
            t.write((int)(byte)(n >>> 8));
            t.write((int)(byte)(n >>> 16));
            t.write((int)(byte)(n >>> 24));
            t.write((int)(byte)(n >>> 32));
            t.write((int)(byte)(n >>> 40));
            t.write((int)(byte)(n >>> 48));
            t.write((int)(byte)(n >>> 56));
        }
        else {
            t.write((int)(byte)(n >>> 56));
            t.write((int)(byte)(n >>> 48));
            t.write((int)(byte)(n >>> 40));
            t.write((int)(byte)(n >>> 32));
            t.write((int)(byte)(n >>> 24));
            t.write((int)(byte)(n >>> 16));
            t.write((int)(byte)(n >>> 8));
            t.write((int)(byte)n);
        }
    }
    
    public static final void j(final t t, final int n) {
        if (n < 254) {
            t.write(n);
        }
        else if (n <= 65535) {
            t.write(254);
            if (u.b) {
                t.write(n);
                t.write(n >>> 8);
            }
            else {
                t.write(n >>> 8);
                t.write(n);
            }
        }
        else {
            t.write(255);
            h(t, n);
        }
    }
    
    @Override
    public final ByteBuffer a(final Object o) {
        if (o == null) {
            return null;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.k((t)byteArrayOutputStream, o);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(((t)byteArrayOutputStream).a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
    
    @Override
    public final Object b(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        final Object e = this.e(byteBuffer);
        if (!((Buffer)byteBuffer).hasRemaining()) {
            return e;
        }
        throw new IllegalArgumentException("Message corrupted");
    }
    
    public final Object e(final ByteBuffer byteBuffer) {
        if (((Buffer)byteBuffer).hasRemaining()) {
            return this.f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }
    
    public Object f(final byte b, final ByteBuffer byteBuffer) {
        final Charset c = u.c;
        final int n = 0;
        final int n2 = 0;
        Object o2 = null;
        switch (b) {
            default: {
                throw new IllegalArgumentException("Message corrupted");
            }
            case 14: {
                final int d = d(byteBuffer);
                final Object o = new float[d];
                c(4, byteBuffer);
                byteBuffer.asFloatBuffer().get((float[])o);
                byteBuffer.position(d * 4 + ((Buffer)byteBuffer).position());
                return o;
            }
            case 13: {
                final int d2 = d(byteBuffer);
                final double[] array = (Object)new HashMap();
                int n3 = n2;
                while (true) {
                    final Object o = array;
                    if (n3 >= d2) {
                        return o;
                    }
                    ((HashMap)(Object)array).put(this.e(byteBuffer), this.e(byteBuffer));
                    ++n3;
                }
                break;
            }
            case 12: {
                final int d3 = d(byteBuffer);
                final ArrayList list = new ArrayList(d3);
                int n4 = n;
                while (true) {
                    final Object o = list;
                    if (n4 >= d3) {
                        return o;
                    }
                    list.add(this.e(byteBuffer));
                    ++n4;
                }
                break;
            }
            case 11: {
                final int d4 = d(byteBuffer);
                final Object o = new double[d4];
                c(8, byteBuffer);
                byteBuffer.asDoubleBuffer().get((double[])o);
                byteBuffer.position(d4 * 8 + ((Buffer)byteBuffer).position());
                return o;
            }
            case 10: {
                final int d5 = d(byteBuffer);
                final Object o = new long[d5];
                c(8, byteBuffer);
                byteBuffer.asLongBuffer().get((long[])o);
                byteBuffer.position(d5 * 8 + ((Buffer)byteBuffer).position());
                return o;
            }
            case 9: {
                final int d6 = d(byteBuffer);
                final Object o = new int[d6];
                c(4, byteBuffer);
                byteBuffer.asIntBuffer().get((int[])o);
                byteBuffer.position(d6 * 4 + ((Buffer)byteBuffer).position());
                return o;
            }
            case 8: {
                final Object o = new byte[d(byteBuffer)];
                byteBuffer.get((byte[])o);
                return o;
            }
            case 7: {
                final byte[] array2 = new byte[d(byteBuffer)];
                byteBuffer.get(array2);
                o2 = new String(array2, c);
                break;
            }
            case 6: {
                c(8, byteBuffer);
                return byteBuffer.getDouble();
            }
            case 5: {
                final byte[] array3 = new byte[d(byteBuffer)];
                byteBuffer.get(array3);
                o2 = new BigInteger(new String(array3, c), 16);
                break;
            }
            case 4: {
                return byteBuffer.getLong();
            }
            case 3: {
                return byteBuffer.getInt();
            }
            case 2: {
                return Boolean.FALSE;
            }
            case 1: {
                return Boolean.TRUE;
            }
            case 0: {
                return null;
            }
        }
        return o2;
    }
    
    public void k(final t t, final Object o) {
        final int n = 0;
        int i = 0;
        final int n2 = 0;
        final int n3 = 0;
        if (o != null && !o.equals(null)) {
            if (o instanceof Boolean) {
                int n4;
                if (o) {
                    n4 = 1;
                }
                else {
                    n4 = 2;
                }
                t.write(n4);
            }
            else {
                final boolean b = o instanceof Number;
                final Charset c = u.c;
                if (b) {
                    if (!(o instanceof Integer) && !(o instanceof Short) && !(o instanceof Byte)) {
                        if (o instanceof Long) {
                            t.write(4);
                            i(t, (long)o);
                        }
                        else if (!(o instanceof Float) && !(o instanceof Double)) {
                            if (!(o instanceof BigInteger)) {
                                final StringBuilder sb = new StringBuilder("Unsupported Number type: ");
                                sb.append((Object)o.getClass());
                                throw new IllegalArgumentException(sb.toString());
                            }
                            t.write(5);
                            final byte[] bytes = ((BigInteger)o).toString(16).getBytes(c);
                            j(t, bytes.length);
                            t.write(bytes, 0, bytes.length);
                        }
                        else {
                            t.write(6);
                            g(t, 8);
                            i(t, Double.doubleToLongBits(((Number)o).doubleValue()));
                        }
                    }
                    else {
                        t.write(3);
                        h(t, ((Number)o).intValue());
                    }
                }
                else if (o instanceof CharSequence) {
                    t.write(7);
                    final byte[] bytes2 = o.toString().getBytes(c);
                    j(t, bytes2.length);
                    t.write(bytes2, 0, bytes2.length);
                }
                else if (o instanceof byte[]) {
                    t.write(8);
                    final byte[] array = (byte[])o;
                    j(t, array.length);
                    t.write(array, 0, array.length);
                }
                else if (o instanceof int[]) {
                    t.write(9);
                    final int[] array2 = (int[])o;
                    j(t, array2.length);
                    g(t, 4);
                    for (int length = array2.length, j = n3; j < length; ++j) {
                        h(t, array2[j]);
                    }
                }
                else if (o instanceof long[]) {
                    t.write(10);
                    final long[] array3 = (long[])o;
                    j(t, array3.length);
                    g(t, 8);
                    for (int length2 = array3.length, k = n; k < length2; ++k) {
                        i(t, array3[k]);
                    }
                }
                else if (o instanceof double[]) {
                    t.write(11);
                    final double[] array4 = (double[])o;
                    j(t, array4.length);
                    g(t, 8);
                    while (i < array4.length) {
                        i(t, Double.doubleToLongBits(array4[i]));
                        ++i;
                    }
                }
                else if (o instanceof List) {
                    t.write(12);
                    final List list = (List)o;
                    j(t, list.size());
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        this.k(t, iterator.next());
                    }
                }
                else if (o instanceof Map) {
                    t.write(13);
                    final Map map = (Map)o;
                    j(t, map.size());
                    for (final Map$Entry map$Entry : map.entrySet()) {
                        this.k(t, map$Entry.getKey());
                        this.k(t, map$Entry.getValue());
                    }
                }
                else {
                    if (!(o instanceof float[])) {
                        final StringBuilder sb2 = new StringBuilder("Unsupported value: '");
                        sb2.append(o);
                        sb2.append("' of type '");
                        sb2.append((Object)o.getClass());
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    t.write(14);
                    final float[] array5 = (float[])o;
                    j(t, array5.length);
                    g(t, 4);
                    for (int length3 = array5.length, l = n2; l < length3; ++l) {
                        h(t, Float.floatToIntBits(array5[l]));
                    }
                }
            }
        }
        else {
            t.write(0);
        }
    }
}
