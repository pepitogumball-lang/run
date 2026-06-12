package v4;

import java.nio.ByteBuffer;
import android.media.Image$Plane;
import android.hardware.HardwareBuffer;
import android.graphics.Paint;
import java.nio.Buffer;
import android.graphics.Bitmap$Config;
import io.flutter.plugin.editing.i;
import O.n0;
import android.graphics.Canvas;
import android.view.Surface;
import v.e;
import io.flutter.plugin.platform.p;
import android.os.Build$VERSION;
import android.util.Log;
import java.util.Locale;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.engine.renderer.j;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import io.flutter.embedding.engine.renderer.l;
import android.view.View;

public class f extends View implements l
{
    public ImageReader C;
    public Image D;
    public Bitmap E;
    public j F;
    public final int G;
    public boolean H;
    
    public f(final Context context, final int n, final int n2, final int g) {
        final ImageReader f = f(n, n2);
        super(context, (AttributeSet)null);
        this.H = false;
        this.C = f;
        this.G = g;
        this.setAlpha(0.0f);
    }
    
    public static ImageReader f(int n, final int n2) {
        int n3 = n;
        if (n <= 0) {
            final Locale us = Locale.US;
            final StringBuilder sb = new StringBuilder("ImageReader width must be greater than 0, but given width=");
            sb.append(n);
            sb.append(", set width=1");
            Log.w("FlutterImageView", sb.toString());
            n3 = 1;
        }
        if ((n = n2) <= 0) {
            final Locale us2 = Locale.US;
            final StringBuilder sb2 = new StringBuilder("ImageReader height must be greater than 0, but given height=");
            sb2.append(n2);
            sb2.append(", set height=1");
            Log.w("FlutterImageView", sb2.toString());
            n = 1;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            return p.c(n3, n);
        }
        return ImageReader.newInstance(n3, n, 1, 3);
    }
    
    public final void a() {
        if (!this.H) {
            return;
        }
        this.setAlpha(0.0f);
        this.e();
        this.E = null;
        final Image d = this.D;
        if (d != null) {
            d.close();
            this.D = null;
        }
        this.invalidate();
        this.H = false;
    }
    
    public final void b() {
    }
    
    public final void c(final j f) {
        if (e.d(this.G) == 0) {
            final Surface surface = this.C.getSurface();
            f.c = surface;
            f.a.onSurfaceWindowChanged(surface);
        }
        this.setAlpha(1.0f);
        this.F = f;
        this.H = true;
    }
    
    public final void d() {
    }
    
    public final boolean e() {
        final boolean h = this.H;
        boolean b = false;
        if (!h) {
            return false;
        }
        final Image acquireLatestImage = this.C.acquireLatestImage();
        if (acquireLatestImage != null) {
            final Image d = this.D;
            if (d != null) {
                d.close();
                this.D = null;
            }
            this.D = acquireLatestImage;
            this.invalidate();
        }
        if (acquireLatestImage != null) {
            b = true;
        }
        return b;
    }
    
    public final void g(final int n, final int n2) {
        if (this.F == null) {
            return;
        }
        if (n == this.C.getWidth() && n2 == this.C.getHeight()) {
            return;
        }
        final Image d = this.D;
        if (d != null) {
            d.close();
            this.D = null;
        }
        this.C.close();
        this.C = f(n, n2);
    }
    
    public j getAttachedRenderer() {
        return this.F;
    }
    
    public ImageReader getImageReader() {
        return this.C;
    }
    
    public Surface getSurface() {
        return this.C.getSurface();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Image d = this.D;
        if (d != null) {
            if (Build$VERSION.SDK_INT >= 29) {
                final HardwareBuffer e = n0.e(d);
                this.E = p.b(e, i.d(i.c()));
                i.k(e);
            }
            else {
                final Image$Plane[] planes = d.getPlanes();
                if (planes.length == 1) {
                    final Image$Plane image$Plane = planes[0];
                    final int n = image$Plane.getRowStride() / image$Plane.getPixelStride();
                    final int height = this.D.getHeight();
                    final Bitmap e2 = this.E;
                    if (e2 == null || e2.getWidth() != n || this.E.getHeight() != height) {
                        this.E = Bitmap.createBitmap(n, height, Bitmap$Config.ARGB_8888);
                    }
                    final ByteBuffer buffer = image$Plane.getBuffer();
                    buffer.rewind();
                    this.E.copyPixelsFromBuffer((Buffer)buffer);
                }
            }
        }
        final Bitmap e3 = this.E;
        if (e3 != null) {
            canvas.drawBitmap(e3, 0.0f, 0.0f, (Paint)null);
        }
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        if (n == this.C.getWidth() && n2 == this.C.getHeight()) {
            return;
        }
        if (this.G == 1 && this.H) {
            this.g(n, n2);
            final j f = this.F;
            final Surface surface = this.C.getSurface();
            f.c = surface;
            f.a.onSurfaceWindowChanged(surface);
        }
    }
}
