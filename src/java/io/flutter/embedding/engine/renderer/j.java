package io.flutter.embedding.engine.renderer;

import java.lang.ref.Reference;
import android.graphics.SurfaceTexture;
import android.os.Build$VERSION;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import io.flutter.view.n;
import java.util.ArrayList;
import java.util.HashSet;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;
import io.flutter.embedding.engine.FlutterJNI;

public final class j
{
    public final FlutterJNI a;
    public final AtomicLong b;
    public Surface c;
    public boolean d;
    public final Handler e;
    public final HashSet f;
    public final ArrayList g;
    public final a h;
    
    public j(final FlutterJNI a) {
        this.b = new AtomicLong(0L);
        this.d = false;
        this.e = new Handler();
        this.f = new HashSet();
        this.g = new ArrayList();
        final a h = new a(this, 0);
        this.h = h;
        (this.a = a).addIsDisplayingFlutterUiListener(h);
    }
    
    public final void a(final k k) {
        this.a.addIsDisplayingFlutterUiListener(k);
        if (this.d) {
            k.b();
        }
    }
    
    public final void b(final n n) {
        final HashSet f = this.f;
        final Iterator iterator = f.iterator();
        while (iterator.hasNext()) {
            if (((Reference)iterator.next()).get() == null) {
                iterator.remove();
            }
        }
        f.add((Object)new WeakReference((Object)n));
    }
    
    public final TextureRegistry$ImageTextureEntry c() {
        final FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }
    
    public final TextureRegistry$SurfaceProducer d(final int n) {
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
        if (Build$VERSION.SDK_INT >= 29) {
            final long andIncrement = this.b.getAndIncrement();
            textureRegistry$SurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
            final boolean b = n == 2;
            this.a.registerImageTexture(andIncrement, (TextureRegistry$ImageConsumer)textureRegistry$SurfaceProducer, b);
            if (b) {
                this.b((n)textureRegistry$SurfaceProducer);
            }
            this.g.add((Object)textureRegistry$SurfaceProducer);
        }
        else {
            final h e = this.e();
            textureRegistry$SurfaceProducer = new m(e.a, this.e, this.a, e);
        }
        return textureRegistry$SurfaceProducer;
    }
    
    public final h e() {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        final long andIncrement = this.b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        final h h = new h(this, andIncrement, surfaceTexture);
        this.a.registerTexture(h.a, h.b);
        this.b(h);
        return h;
    }
    
    public final void f(final int n) {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            final n n2 = (n)((Reference)iterator.next()).get();
            if (n2 != null) {
                n2.onTrimMemory(n);
            }
            else {
                iterator.remove();
            }
        }
    }
    
    public final void g(final k k) {
        this.a.removeIsDisplayingFlutterUiListener(k);
    }
    
    public final void h(final n n) {
        final HashSet f = this.f;
        for (final WeakReference weakReference : f) {
            if (((Reference)weakReference).get() == n) {
                f.remove((Object)weakReference);
                break;
            }
        }
    }
    
    public final void i() {
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
    }
    
    public final void j() {
        if (this.c != null) {
            this.a.onSurfaceDestroyed();
            if (this.d) {
                this.h.a();
            }
            this.d = false;
            this.c = null;
        }
    }
}
