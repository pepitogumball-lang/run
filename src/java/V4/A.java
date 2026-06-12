package v4;

import java.nio.Buffer;
import android.view.InputEvent;
import java.nio.ByteOrder;
import android.util.TypedValue;
import android.view.InputDevice$MotionRange;
import io.flutter.plugin.editing.i;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import java.util.PriorityQueue;
import android.util.LongSparseArray;
import android.content.Context;
import java.nio.ByteBuffer;
import android.view.MotionEvent;
import java.util.HashMap;
import f2.d;
import io.flutter.embedding.engine.renderer.j;
import android.graphics.Matrix;

public final class a
{
    public static final Matrix f;
    public final j a;
    public final d b;
    public final boolean c;
    public final HashMap d;
    public int e;
    
    static {
        f = new Matrix();
    }
    
    public a(final j a, final boolean c) {
        this.d = new HashMap();
        this.a = a;
        if (f2.d.F == null) {
            f2.d.F = new d();
        }
        this.b = f2.d.F;
        this.c = c;
    }
    
    public static int b(final int n) {
        if (n == 0) {
            return 4;
        }
        if (n == 1) {
            return 6;
        }
        if (n == 5) {
            return 4;
        }
        if (n == 6) {
            return 6;
        }
        if (n == 2) {
            return 5;
        }
        if (n == 7) {
            return 3;
        }
        if (n == 3) {
            return 0;
        }
        if (n == 8) {
            return 3;
        }
        return -1;
    }
    
    public final void a(final MotionEvent motionEvent, final int n, int sdk_INT, final int n2, final Matrix matrix, final ByteBuffer byteBuffer, final Context context) {
        if (sdk_INT == -1) {
            return;
        }
        final int pointerId = motionEvent.getPointerId(n);
        int n3 = 3;
        final int n4 = pointerId << 3 | (motionEvent.getToolType(n) & 0x7);
        final int toolType = motionEvent.getToolType(n);
        if (toolType != 1) {
            if (toolType != 2) {
                if (toolType != 3) {
                    if (toolType != 4) {
                        n3 = 5;
                    }
                }
                else {
                    n3 = 1;
                }
            }
            else {
                n3 = 2;
            }
        }
        else {
            n3 = 0;
        }
        final float[] array = { motionEvent.getX(n), motionEvent.getY(n) };
        matrix.mapPoints(array);
        final HashMap d = this.d;
        long n6;
        if (n3 == 1) {
            final long n5 = motionEvent.getButtonState() & 0x1F;
            if (n5 == 0L && motionEvent.getSource() == 8194) {
                n6 = n5;
                if (sdk_INT == 4) {
                    d.put((Object)n4, (Object)array);
                    n6 = n5;
                }
            }
            else {
                n6 = n5;
            }
        }
        else if (n3 == 2) {
            n6 = (motionEvent.getButtonState() >> 4 & 0xF);
        }
        else {
            n6 = 0L;
        }
        final boolean containsKey = d.containsKey((Object)n4);
        int n8;
        if (containsKey) {
            int n7;
            if (sdk_INT == 4) {
                n7 = 7;
            }
            else if (sdk_INT == 5) {
                n7 = 8;
            }
            else if (sdk_INT != 6 && sdk_INT != 0) {
                n7 = -1;
            }
            else {
                n7 = 9;
            }
            n8 = n7;
            if (n7 == -1) {
                return;
            }
        }
        else {
            n8 = -1;
        }
        long incrementAndGet;
        if (this.c) {
            final d b = this.b;
            b.getClass();
            incrementAndGet = u.b.incrementAndGet();
            new(v4.u.class)();
            ((LongSparseArray)b.D).put(incrementAndGet, (Object)MotionEvent.obtain(motionEvent));
            ((PriorityQueue)b.E).add((Object)incrementAndGet);
        }
        else {
            incrementAndGet = 0L;
        }
        final boolean b2 = motionEvent.getActionMasked() == 8;
        final long eventTime = motionEvent.getEventTime();
        byteBuffer.putLong(incrementAndGet);
        byteBuffer.putLong(eventTime * 1000L);
        if (containsKey) {
            byteBuffer.putLong((long)n8);
            byteBuffer.putLong(4L);
        }
        else {
            byteBuffer.putLong((long)sdk_INT);
            byteBuffer.putLong((long)n3);
        }
        byteBuffer.putLong((long)(b2 ? 1 : 0));
        byteBuffer.putLong((long)n4);
        byteBuffer.putLong(0L);
        if (containsKey) {
            final float[] array2 = (float[])d.get((Object)n4);
            byteBuffer.putDouble((double)array2[0]);
            byteBuffer.putDouble((double)array2[1]);
        }
        else {
            byteBuffer.putDouble((double)array[0]);
            byteBuffer.putDouble((double)array[1]);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(n6);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble((double)motionEvent.getPressure(n));
        double n9 = 0.0;
        double n10 = 0.0;
        Label_0651: {
            if (((InputEvent)motionEvent).getDevice() != null) {
                final InputDevice$MotionRange motionRange = ((InputEvent)motionEvent).getDevice().getMotionRange(2);
                if (motionRange != null) {
                    n9 = motionRange.getMin();
                    n10 = motionRange.getMax();
                    break Label_0651;
                }
            }
            n9 = 0.0;
            n10 = 1.0;
        }
        byteBuffer.putDouble(n9);
        byteBuffer.putDouble(n10);
        if (n3 == 2) {
            byteBuffer.putDouble((double)motionEvent.getAxisValue(24, n));
            byteBuffer.putDouble(0.0);
        }
        else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble((double)motionEvent.getSize(n));
        byteBuffer.putDouble((double)motionEvent.getToolMajor(n));
        byteBuffer.putDouble((double)motionEvent.getToolMinor(n));
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble((double)motionEvent.getAxisValue(8, n));
        if (n3 == 2) {
            byteBuffer.putDouble((double)motionEvent.getAxisValue(25, n));
        }
        else {
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putLong((long)n2);
        if ((b2 ? 1 : 0) == 1) {
            double n11;
            double n12;
            if (context != null) {
                sdk_INT = Build$VERSION.SDK_INT;
                float w;
                if (sdk_INT >= 26) {
                    w = i.w(ViewConfiguration.get(context));
                }
                else {
                    w = (float)this.c(context);
                }
                n11 = w;
                float a;
                if (sdk_INT >= 26) {
                    a = i.a(ViewConfiguration.get(context));
                }
                else {
                    a = (float)this.c(context);
                }
                n12 = a;
            }
            else {
                n11 = 48.0;
                n12 = 48.0;
            }
            final double n13 = -motionEvent.getAxisValue(10, n);
            final double n14 = -motionEvent.getAxisValue(9, n);
            byteBuffer.putDouble(n11 * n13);
            byteBuffer.putDouble(n12 * n14);
        }
        else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        if (containsKey) {
            final float[] array3 = (float[])d.get((Object)n4);
            byteBuffer.putDouble((double)(array[0] - array3[0]));
            byteBuffer.putDouble((double)(array[1] - array3[1]));
        }
        else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(1.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(0L);
        if (containsKey && n8 == 9) {
            d.remove((Object)n4);
        }
    }
    
    public final int c(final Context context) {
        if (this.e == 0) {
            final TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.e = (int)typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.e;
    }
    
    public final void d(final MotionEvent motionEvent, final Matrix matrix) {
        final int actionMasked = motionEvent.getActionMasked();
        final int b = b(motionEvent.getActionMasked());
        final int n = 5;
        final boolean b2 = actionMasked == 0 || actionMasked == 5;
        final boolean b3 = !b2 && (actionMasked == 1 || actionMasked == 6);
        final int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int n2;
        if (toolType != 1) {
            n2 = 2;
            if (toolType != 2) {
                n2 = 3;
                if (toolType != 3) {
                    if (toolType != 4) {
                        n2 = n;
                    }
                }
                else {
                    n2 = 1;
                }
            }
        }
        else {
            n2 = 0;
        }
        int n3;
        if (b3 && n2 == 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int pointerCount = motionEvent.getPointerCount();
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + n3) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (b2) {
            this.a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect, null);
        }
        else if (b3) {
            for (int i = 0; i < pointerCount; ++i) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    this.a(motionEvent, i, 5, 1, matrix, allocateDirect, null);
                }
            }
            this.a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect, null);
            if (n3 != 0) {
                this.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect, null);
            }
        }
        else {
            for (int j = 0; j < pointerCount; ++j) {
                this.a(motionEvent, j, b, 0, matrix, allocateDirect, null);
            }
        }
        if (((Buffer)allocateDirect).position() % 288 == 0) {
            this.a.a.dispatchPointerDataPacket(allocateDirect, ((Buffer)allocateDirect).position());
            return;
        }
        throw new AssertionError((Object)"Packet position is not on field boundary");
    }
}
