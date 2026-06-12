package io.flutter.embedding.engine.renderer;

import android.view.Surface;
import K2.y;
import java.io.IOException;
import android.os.Build$VERSION;
import android.media.Image;
import android.media.ImageReader$Builder;
import G0.g;
import com.google.android.gms.internal.ads.sE;
import java.util.Iterator;
import android.media.ImageReader;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.ArrayDeque;
import io.flutter.view.o;
import androidx.annotation.Keep;
import io.flutter.view.n;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;

@Keep
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, n
{
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    o callback;
    private boolean createNewReader;
    private final long id;
    private boolean ignoringFence;
    private final ArrayDeque<f> imageReaderQueue;
    private long lastDequeueTime;
    private ArrayList<d> lastDequeuedImage;
    private long lastQueueTime;
    private f lastReaderDequeuedFrom;
    private long lastScheduleTime;
    private final Object lock;
    boolean notifiedDestroy;
    private int numTrims;
    private final HashMap<ImageReader, f> perImageReaders;
    private boolean released;
    private int requestedHeight;
    private int requestedWidth;
    final j this$0;
    
    public FlutterRenderer$ImageReaderSurfaceProducer(final j this$0, final long id) {
        this.this$0 = this$0;
        this.ignoringFence = false;
        this.requestedWidth = 1;
        this.requestedHeight = 1;
        this.createNewReader = true;
        this.notifiedDestroy = false;
        this.lastDequeueTime = 0L;
        this.lastQueueTime = 0L;
        this.lastScheduleTime = 0L;
        this.numTrims = 0;
        this.lock = new Object();
        this.imageReaderQueue = (ArrayDeque<f>)new ArrayDeque();
        this.perImageReaders = (HashMap<ImageReader, f>)new HashMap();
        this.lastDequeuedImage = (ArrayList<d>)new ArrayList();
        this.lastReaderDequeuedFrom = null;
        this.id = id;
    }
    
    public static /* synthetic */ f access$400(final FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer) {
        return flutterRenderer$ImageReaderSurfaceProducer.lastReaderDequeuedFrom;
    }
    
    private void cleanup() {
        final Object lock;
        monitorenter(lock = this.lock);
        Iterator iterator;
        f f;
        f lastReaderDequeuedFrom = null;
        Iterator iterator2 = null;
        Label_0143_Outer:Block_7_Outer:
        while (true) {
            Label_0062: {
                try {
                    iterator = this.perImageReaders.values().iterator();
                    if (!iterator.hasNext()) {
                        break Label_0062;
                    }
                    f = (f)iterator.next();
                    if (this.lastReaderDequeuedFrom == f) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    break Label_0062;
                }
                finally {
                    monitorexit(lock);
                    while (true) {
                        Label_0109: {
                            Block_6: {
                            Block_8:
                                while (true) {
                                    lastReaderDequeuedFrom = this.lastReaderDequeuedFrom;
                                    iftrue(Label_0176:)(lastReaderDequeuedFrom == null);
                                    break Block_8;
                                    f.c = true;
                                    f.a.close();
                                    f.b.clear();
                                    continue Label_0143_Outer;
                                    ((d)iterator2.next()).a.close();
                                    break Label_0109;
                                    this.perImageReaders.clear();
                                    iftrue(Label_0143:)(this.lastDequeuedImage.size() <= 0);
                                    break Block_6;
                                    Label_0136: {
                                        this.lastDequeuedImage.clear();
                                    }
                                    continue Block_7_Outer;
                                }
                                lastReaderDequeuedFrom.c = true;
                                lastReaderDequeuedFrom.a.close();
                                lastReaderDequeuedFrom.b.clear();
                                this.lastReaderDequeuedFrom = null;
                                Label_0176: {
                                    this.imageReaderQueue.clear();
                                }
                                monitorexit(lock);
                                return;
                            }
                            iterator2 = this.lastDequeuedImage.iterator();
                        }
                        iftrue(Label_0136:)(!iterator2.hasNext());
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    private ImageReader createImageReader29() {
        return sE.b(this.requestedWidth, this.requestedHeight);
    }
    
    private ImageReader createImageReader33() {
        g.s();
        final ImageReader$Builder g = G0.g.g(this.requestedWidth, this.requestedHeight);
        G0.g.u(g);
        G0.g.B(g);
        G0.g.C(g);
        return G0.g.h(g);
    }
    
    private f getActiveReader() {
        final Object lock;
        monitorenter(lock = this.lock);
        Label_0048: {
            try {
                if (this.createNewReader) {
                    break Label_0048;
                }
                final f f = (f)this.imageReaderQueue.peekLast();
                if (f.a.getSurface().isValid()) {
                    monitorexit(lock);
                    return f;
                }
                break Label_0048;
            }
            finally {
                monitorexit(lock);
                this.createNewReader = false;
                final f orCreatePerImageReader = this.getOrCreatePerImageReader(this.createImageReader());
                monitorexit(lock);
                return orCreatePerImageReader;
            }
        }
    }
    
    private f getOrCreatePerImageReader(final ImageReader imageReader) {
        f perImageReader;
        if ((perImageReader = (f)this.perImageReaders.get((Object)imageReader)) == null) {
            perImageReader = this.createPerImageReader(imageReader);
            this.perImageReaders.put((Object)imageReader, (Object)perImageReader);
            this.imageReaderQueue.add((Object)perImageReader);
        }
        return perImageReader;
    }
    
    private void lambda$dequeueImage$0() {
        if (!this.released) {
            this.this$0.a.scheduleFrame();
        }
    }
    
    private void maybeWaitOnFence(final Image image) {
        if (image == null) {
            return;
        }
        if (this.ignoringFence) {
            return;
        }
        if (Build$VERSION.SDK_INT >= 33) {
            this.waitOnFence(image);
            return;
        }
        this.ignoringFence = true;
    }
    
    private void releaseInternal() {
        this.cleanup();
        this.released = true;
        this.this$0.h(this);
        this.this$0.g.remove((Object)this);
    }
    
    private void waitOnFence(final Image image) {
        try {
            g.t(g.f(image));
        }
        catch (final IOException ex) {}
    }
    
    @Override
    public Image acquireLatestImage() {
        final d dequeueImage = this.dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        final Image a = dequeueImage.a;
        this.maybeWaitOnFence(a);
        return a;
    }
    
    public ImageReader createImageReader() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 33) {
            return this.createImageReader33();
        }
        if (sdk_INT >= 29) {
            return this.createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }
    
    public f createPerImageReader(final ImageReader imageReader) {
        return new f(this, imageReader);
    }
    
    public double deltaMillis(final long n) {
        return n / 1000000.0;
    }
    
    public d dequeueImage() {
        final Object lock;
        monitorenter(lock = this.lock);
        Label_0125: {
            try {
                final Iterator iterator = this.imageReaderQueue.iterator();
                d d = null;
                do {
                    final boolean hasNext = iterator.hasNext();
                    final int n = 0;
                    if (!hasNext) {
                        break Label_0125;
                    }
                    final f lastReaderDequeuedFrom = (f)iterator.next();
                    final ArrayDeque b = lastReaderDequeuedFrom.b;
                    if (b.isEmpty()) {
                        d = null;
                    }
                    else {
                        d = (d)b.removeFirst();
                    }
                } while (d == null);
                while (this.lastDequeuedImage.size() > 2) {
                    ((d)this.lastDequeuedImage.remove(0)).a.close();
                }
                break Label_0125;
            }
            finally {
                monitorexit(lock);
            Label_0154_Outer:
                while (true) {
                    int n2 = 1;
                    final d d;
                    final int n;
                    final f lastReaderDequeuedFrom;
                    Iterator iterator2 = null;
                    Block_8:Block_10_Outer:
                    while (true) {
                        while (true) {
                            Label_0187: {
                                break Label_0187;
                                Label_0214: {
                                    return d;
                                }
                                n2 = n;
                                iftrue(Label_0187:)(!iterator2.hasNext());
                                break Block_8;
                                this.this$0.e.post((Runnable)new c(this, 0));
                                return d;
                                this.lastDequeuedImage.add((Object)d);
                                this.lastReaderDequeuedFrom = lastReaderDequeuedFrom;
                                break Label_0125;
                            }
                            monitorexit(lock);
                            iftrue(Label_0214:)(n2 == 0);
                            continue;
                        }
                        this.pruneImageReaderQueue();
                        iterator2 = this.imageReaderQueue.iterator();
                        continue Block_10_Outer;
                    }
                    iftrue(Label_0154:)(((f)iterator2.next()).b.isEmpty());
                    continue Label_0154_Outer;
                }
            }
        }
    }
    
    public void disableFenceForTest() {
        this.ignoringFence = true;
    }
    
    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            this.releaseInternal();
            final j this$0 = this.this$0;
            this$0.e.post((Runnable)new y(this.id, this$0.a));
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return this.getSurface();
    }
    
    @Override
    public int getHeight() {
        return this.requestedHeight;
    }
    
    @Override
    public Surface getSurface() {
        return this.getActiveReader().a.getSurface();
    }
    
    @Override
    public int getWidth() {
        return this.requestedWidth;
    }
    
    @Override
    public boolean handlesCropAndRotation() {
        return false;
    }
    
    @Override
    public long id() {
        return this.id;
    }
    
    public int numImageReaders() {
        final Object lock = this.lock;
        synchronized (lock) {
            return this.imageReaderQueue.size();
        }
    }
    
    public int numImages() {
        final Object lock;
        monitorenter(lock = this.lock);
        Label_0054: {
            try {
                final Iterator iterator = this.imageReaderQueue.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    n += ((f)iterator.next()).b.size();
                }
                break Label_0054;
            }
            finally {
                monitorexit(lock);
                monitorexit(lock);
                return;
            }
        }
    }
    
    public int numTrims() {
        final Object lock = this.lock;
        synchronized (lock) {
            return this.numTrims;
        }
    }
    
    public void onImage(final ImageReader imageReader, final Image image) {
        final Object lock = this.lock;
        synchronized (lock) {
            final f orCreatePerImageReader = this.getOrCreatePerImageReader(imageReader);
            Object o;
            if (orCreatePerImageReader.c) {
                o = null;
            }
            else {
                o = new(io.flutter.embedding.engine.renderer.d.class)();
                final FlutterRenderer$ImageReaderSurfaceProducer d = orCreatePerImageReader.d;
                System.nanoTime();
                new d(d, image);
                final ArrayDeque b = orCreatePerImageReader.b;
                b.add(o);
                while (b.size() > 2) {
                    ((d)b.removeFirst()).a.close();
                }
            }
            monitorexit(lock);
            if (o == null) {
                return;
            }
            this.this$0.a.scheduleFrame();
        }
    }
    
    @Override
    public void onTrimMemory(final int n) {
        if (n < 40) {
            return;
        }
        final Object lock = this.lock;
        synchronized (lock) {
            ++this.numTrims;
            monitorexit(lock);
            this.cleanup();
            this.createNewReader = true;
        }
    }
    
    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }
    
    public void pruneImageReaderQueue() {
        while (this.imageReaderQueue.size() > 1) {
            final f f = (f)this.imageReaderQueue.peekFirst();
            if (f == null) {
                break;
            }
            final ArrayDeque b = f.b;
            if (!b.isEmpty() || access$400(f.d) == f) {
                break;
            }
            this.imageReaderQueue.removeFirst();
            final HashMap<ImageReader, f> perImageReaders = this.perImageReaders;
            final ImageReader a = f.a;
            perImageReaders.remove((Object)a);
            f.c = true;
            a.close();
            b.clear();
        }
    }
    
    @Override
    public void release() {
        if (this.released) {
            return;
        }
        this.releaseInternal();
        this.this$0.a.unregisterTexture(this.id);
    }
    
    @Override
    public void scheduleFrame() {
        this.this$0.a.scheduleFrame();
    }
    
    @Override
    public void setCallback(final o o) {
    }
    
    @Override
    public void setSize(int max, int max2) {
        max = Math.max(1, max);
        max2 = Math.max(1, max2);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
