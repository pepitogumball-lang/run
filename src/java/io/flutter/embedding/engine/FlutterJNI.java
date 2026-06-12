package io.flutter.embedding.engine;

import android.view.ViewGroup;
import java.nio.Buffer;
import android.app.Activity;
import android.view.View$OnFocusChangeListener;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import android.util.SparseArray;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import x4.c;
import java.util.LinkedList;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentLinkedQueue;
import E4.l;
import E4.m;
import F4.u;
import io.flutter.view.d;
import android.view.SurfaceControl;
import android.view.SurfaceControl$Builder;
import com.google.android.gms.internal.ads.YD;
import v4.f;
import android.os.LocaleList;
import java.util.Locale;
import java.util.Locale$Builder;
import android.annotation.SuppressLint;
import java.util.ArrayList;
import android.view.SurfaceControl$Transaction;
import com.google.android.gms.internal.ads.sE;
import java.nio.ByteOrder;
import java.util.Iterator;
import android.view.Surface;
import java.util.List;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.TextureRegistry$ImageConsumer;
import java.lang.ref.WeakReference;
import io.flutter.view.FlutterCallbackInformation;
import android.content.Context;
import android.util.Size;
import F4.e;
import java.io.IOException;
import android.util.Log;
import w4.g;
import w4.h;
import O.n0;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import android.graphics.ImageDecoder$Source;
import android.graphics.ImageDecoder$ImageInfo;
import android.graphics.ImageDecoder;
import android.view.Choreographer$FrameCallback;
import io.flutter.view.p;
import K2.U;
import android.view.Choreographer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import android.os.Looper;
import io.flutter.embedding.engine.renderer.k;
import w4.b;
import java.util.Set;
import y4.a;
import w4.i;
import w4.j;
import androidx.annotation.Keep;

@Keep
public class FlutterJNI
{
    private static final String TAG = "FlutterJNI";
    private static j asyncWaitForVsyncDelegate;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private i accessibilityDelegate;
    private a deferredComponentManager;
    private final Set<b> engineLifecycleListeners;
    private final Set<k> flutterUiDisplayListeners;
    private G4.a localizationPlugin;
    private final Looper mainLooper;
    private Long nativeShellHolderId;
    private x4.j platformMessageHandler;
    private r platformViewsController;
    private q platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock;
    
    public FlutterJNI() {
        this.shellHolderLock = new ReentrantReadWriteLock();
        this.engineLifecycleListeners = (Set<b>)new CopyOnWriteArraySet();
        this.flutterUiDisplayListeners = (Set<k>)new CopyOnWriteArraySet();
        this.mainLooper = Looper.getMainLooper();
    }
    
    private static void asyncWaitForVsync(final long c) {
        final j asyncWaitForVsyncDelegate = FlutterJNI.asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate != null) {
            final io.flutter.view.a a = (io.flutter.view.a)asyncWaitForVsyncDelegate;
            a.getClass();
            final Choreographer instance = Choreographer.getInstance();
            final U u = (U)a.a;
            p p = (p)u.d;
            if (p != null) {
                p.C = c;
                u.d = null;
            }
            else {
                p = new p(u, c);
            }
            instance.postFrameCallback((Choreographer$FrameCallback)p);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }
    
    public static Bitmap decodeImage(final ByteBuffer byteBuffer, final long n) {
        if (Build$VERSION.SDK_INT >= 28) {
            final ImageDecoder$Source d = n0.d(byteBuffer);
            try {
                return g.a(d, new h(n));
            }
            catch (final IOException ex) {
                Log.e("FlutterJNI", "Failed to decode image", (Throwable)ex);
            }
        }
        return null;
    }
    
    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }
    
    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }
    
    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Methods marked with @UiThread must be executed on the main thread. Current thread: ");
        sb.append(Thread.currentThread().getName());
        throw new RuntimeException(sb.toString());
    }
    
    public static String getVMServiceUri() {
        return FlutterJNI.vmServiceUri;
    }
    
    private void handlePlatformMessageResponse(final int n, final ByteBuffer byteBuffer) {
        final x4.j platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            final e e = (e)((x4.i)platformMessageHandler).H.remove((Object)n);
            if (e != null) {
                try {
                    e.a(byteBuffer);
                    if (byteBuffer != null && byteBuffer.isDirect()) {
                        byteBuffer.limit(0);
                    }
                    return;
                }
                catch (final Error error) {
                    final Thread currentThread = Thread.currentThread();
                    if (currentThread.getUncaughtExceptionHandler() != null) {
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, (Throwable)error);
                        return;
                    }
                    throw error;
                }
                catch (final Exception ex) {}
                final Throwable t;
                Log.e("DartMessenger", "Uncaught exception in binary message reply handler", t);
            }
        }
    }
    
    private native long nativeAttach(final FlutterJNI p0);
    
    private native void nativeCleanupMessageData(final long p0);
    
    private native void nativeDeferredComponentInstallFailure(final int p0, final String p1, final boolean p2);
    
    private native void nativeDestroy(final long p0);
    
    private native void nativeDispatchEmptyPlatformMessage(final long p0, final String p1, final int p2);
    
    private native void nativeDispatchPlatformMessage(final long p0, final String p1, final ByteBuffer p2, final int p3, final int p4);
    
    private native void nativeDispatchPointerDataPacket(final long p0, final ByteBuffer p1, final int p2);
    
    private native void nativeDispatchSemanticsAction(final long p0, final int p1, final int p2, final ByteBuffer p3, final int p4);
    
    private native boolean nativeFlutterTextUtilsIsEmoji(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsEmojiModifier(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsVariationSelector(final int p0);
    
    private native Bitmap nativeGetBitmap(final long p0);
    
    private native boolean nativeGetIsSoftwareRenderingEnabled();
    
    public static native void nativeImageHeaderCallback(final long p0, final int p1, final int p2);
    
    private static native void nativeInit(final Context p0, final String[] p1, final String p2, final String p3, final String p4, final long p5, final int p6);
    
    private native void nativeInvokePlatformMessageEmptyResponseCallback(final long p0, final int p1);
    
    private native void nativeInvokePlatformMessageResponseCallback(final long p0, final int p1, final ByteBuffer p2, final int p3);
    
    private native boolean nativeIsSurfaceControlEnabled(final long p0);
    
    private native void nativeLoadDartDeferredLibrary(final long p0, final int p1, final String[] p2);
    
    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(final long p0);
    
    private native void nativeMarkTextureFrameAvailable(final long p0, final long p1);
    
    private native void nativeNotifyLowMemoryWarning(final long p0);
    
    private native void nativeOnVsync(final long p0, final long p1, final long p2);
    
    private static native void nativePrefetchDefaultFontManager();
    
    private native void nativeRegisterImageTexture(final long p0, final long p1, final WeakReference<TextureRegistry$ImageConsumer> p2, final boolean p3);
    
    private native void nativeRegisterTexture(final long p0, final long p1, final WeakReference<SurfaceTextureWrapper> p2);
    
    private native void nativeRunBundleAndSnapshotFromLibrary(final long p0, final String p1, final String p2, final String p3, final AssetManager p4, final List<String> p5, final long p6);
    
    private native void nativeScheduleFrame(final long p0);
    
    private native void nativeSetAccessibilityFeatures(final long p0, final int p1);
    
    private native void nativeSetSemanticsEnabled(final long p0, final boolean p1);
    
    private native void nativeSetViewportMetrics(final long p0, final float p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int[] p17, final int[] p18, final int[] p19);
    
    private native FlutterJNI nativeSpawn(final long p0, final String p1, final String p2, final String p3, final List<String> p4, final long p5);
    
    private native void nativeSurfaceChanged(final long p0, final int p1, final int p2);
    
    private native void nativeSurfaceCreated(final long p0, final Surface p1);
    
    private native void nativeSurfaceDestroyed(final long p0);
    
    private native void nativeSurfaceWindowChanged(final long p0, final Surface p1);
    
    private native void nativeUnregisterTexture(final long p0, final long p1);
    
    private native void nativeUpdateDisplayMetrics(final long p0);
    
    private native void nativeUpdateJavaAssetManager(final long p0, final AssetManager p1, final String p2);
    
    private native void nativeUpdateRefreshRate(final float p0);
    
    private void onPreEngineRestart() {
        final Iterator iterator = this.engineLifecycleListeners.iterator();
        while (iterator.hasNext()) {
            ((b)iterator.next()).b();
        }
    }
    
    private void setApplicationLocale(final String m) {
        this.ensureRunningOnMainThread();
        final i accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            ((io.flutter.view.g)((io.flutter.view.a)accessibilityDelegate).a).m = m;
        }
    }
    
    private void updateCustomAccessibilityActions(final ByteBuffer byteBuffer, final String[] array) {
        this.ensureRunningOnMainThread();
        final i accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            final io.flutter.view.a a = (io.flutter.view.a)accessibilityDelegate;
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            final io.flutter.view.g g = (io.flutter.view.g)a.a;
            g.getClass();
            while (((Buffer)byteBuffer).hasRemaining()) {
                final io.flutter.view.e b = g.b(byteBuffer.getInt());
                b.c = byteBuffer.getInt();
                b.d = io.flutter.view.g.d(byteBuffer, array);
                b.e = io.flutter.view.g.d(byteBuffer, array);
            }
        }
    }
    
    private void updateSemantics(final ByteBuffer byteBuffer, final String[] array, final ByteBuffer[] array2) {
        this.ensureRunningOnMainThread();
        final i accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            ((io.flutter.view.a)accessibilityDelegate).a(byteBuffer, array, array2);
        }
    }
    
    public boolean IsSurfaceControlEnabled() {
        return this.nativeIsSurfaceControlEnabled(this.nativeShellHolderId);
    }
    
    public void addEngineLifecycleListener(final b b) {
        this.ensureRunningOnMainThread();
        this.engineLifecycleListeners.add((Object)b);
    }
    
    public void addIsDisplayingFlutterUiListener(final k k) {
        this.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add((Object)k);
    }
    
    @SuppressLint({ "NewApi" })
    public void applyTransactions() {
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.getClass();
            SurfaceControl$Transaction surfaceControl$Transaction = sE.h();
            int n = 0;
            ArrayList n2;
            while (true) {
                n2 = platformViewsController2.N;
                if (n >= n2.size()) {
                    break;
                }
                surfaceControl$Transaction = sE.i(surfaceControl$Transaction, io.flutter.plugin.platform.p.e(n2.get(n)));
                ++n;
            }
            sE.n(surfaceControl$Transaction);
            n2.clear();
            return;
        }
        throw new RuntimeException("");
    }
    
    public void attachToNative() {
        this.ensureRunningOnMainThread();
        this.ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = this.performNativeAttach(this);
        }
        finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }
    
    public void cleanupMessageData(final long n) {
        this.nativeCleanupMessageData(n);
    }
    
    public String[] computePlatformResolvedLocale(final String[] array) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; i += 3) {
            final String language = array[i];
            final String region = array[i + 1];
            final String script = array[i + 2];
            final Locale$Builder locale$Builder = new Locale$Builder();
            if (!language.isEmpty()) {
                locale$Builder.setLanguage(language);
            }
            if (!region.isEmpty()) {
                locale$Builder.setRegion(region);
            }
            if (!script.isEmpty()) {
                locale$Builder.setScript(script);
            }
            list.add((Object)locale$Builder.build());
        }
        final G4.a localizationPlugin = this.localizationPlugin;
        localizationPlugin.getClass();
        Object q = null;
        Label_0568: {
            if (list.isEmpty()) {
                q = null;
            }
            else {
                final int sdk_INT = Build$VERSION.SDK_INT;
                final Context b = localizationPlugin.b;
                if (sdk_INT >= 26) {
                    final ArrayList list2 = new ArrayList();
                    final LocaleList locales = b.getResources().getConfiguration().getLocales();
                    for (int size = locales.size(), j = 0; j < size; ++j) {
                        final Locale value = locales.get(j);
                        String s2;
                        final String s = s2 = value.getLanguage();
                        if (!value.getScript().isEmpty()) {
                            final StringBuilder c = v.e.c(s, "-");
                            c.append(value.getScript());
                            s2 = c.toString();
                        }
                        String string = s2;
                        if (!value.getCountry().isEmpty()) {
                            final StringBuilder c2 = v.e.c(s2, "-");
                            c2.append(value.getCountry());
                            string = c2.toString();
                        }
                        list2.add((Object)C3.i.p(string));
                        C3.i.r();
                        list2.add((Object)C3.i.p(value.getLanguage()));
                        C3.i.r();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(value.getLanguage());
                        sb.append("-*");
                        list2.add((Object)C3.i.p(sb.toString()));
                    }
                    q = C3.i.q(list2, list);
                    if (q == null) {
                        q = list.get(0);
                    }
                }
                else {
                    final LocaleList locales2 = b.getResources().getConfiguration().getLocales();
                    for (int k = 0; k < locales2.size(); ++k) {
                        final Locale value2 = locales2.get(k);
                        final Iterator iterator = list.iterator();
                    Label_0457:
                        while (true) {
                            while (iterator.hasNext()) {
                                q = iterator.next();
                                if (value2.equals(q)) {
                                    break Label_0568;
                                }
                            }
                            final Iterator iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                                q = iterator2.next();
                                if (value2.getLanguage().equals((Object)((Locale)q).toLanguageTag())) {
                                    continue Label_0457;
                                }
                            }
                            final Iterator iterator3 = list.iterator();
                            while (iterator3.hasNext()) {
                                q = iterator3.next();
                                if (value2.getLanguage().equals((Object)((Locale)q).getLanguage())) {
                                    continue Label_0457;
                                }
                            }
                            break;
                        }
                    }
                    q = list.get(0);
                }
            }
        }
        if (q == null) {
            return new String[0];
        }
        return new String[] { ((Locale)q).getLanguage(), ((Locale)q).getCountry(), ((Locale)q).getScript() };
    }
    
    public FlutterOverlaySurface createOverlaySurface() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            final f f = new f(((View)platformViewsController.F).getContext(), ((View)platformViewsController.F).getWidth(), ((View)platformViewsController.F).getHeight(), 2);
            ((io.flutter.plugin.platform.c)f).I = platformViewsController.K;
            final int n = platformViewsController.R++;
            platformViewsController.P.put(n, (Object)f);
            return new FlutterOverlaySurface(n, f.getSurface());
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }
    
    @SuppressLint({ "NewApi" })
    public FlutterOverlaySurface createOverlaySurface2() {
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            if (platformViewsController2.P == null) {
                final SurfaceControl$Builder g = sE.g();
                io.flutter.plugin.platform.p.h(g, ((View)platformViewsController2.F).getWidth(), ((View)platformViewsController2.F).getHeight());
                io.flutter.plugin.platform.p.g(g);
                io.flutter.plugin.platform.p.l(g);
                io.flutter.plugin.platform.p.n(g);
                G0.g.v(g);
                final SurfaceControl f = io.flutter.plugin.platform.p.f(g);
                final SurfaceControl$Transaction q = YD.q(YD.p(platformViewsController2.F), f);
                sE.v(q, f);
                sE.n(q);
                platformViewsController2.P = sE.f(f);
                platformViewsController2.Q = f;
            }
            return new FlutterOverlaySurface(0, platformViewsController2.P);
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }
    
    @SuppressLint({ "NewApi" })
    public SurfaceControl$Transaction createTransaction() {
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.getClass();
            final SurfaceControl$Transaction h = sE.h();
            platformViewsController2.N.add((Object)h);
            return h;
        }
        throw new RuntimeException("");
    }
    
    public void deferredComponentInstallFailure(final int n, final String s, final boolean b) {
        this.ensureRunningOnMainThread();
        this.nativeDeferredComponentInstallFailure(n, s, b);
    }
    
    @SuppressLint({ "NewApi" })
    public void destroyOverlaySurface2() {
        this.ensureRunningOnMainThread();
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            final Surface p = platformViewsController2.P;
            if (p != null) {
                p.release();
                platformViewsController2.P = null;
                platformViewsController2.Q = null;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }
    
    public void destroyOverlaySurfaces() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.g();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }
    
    public void detachFromNativeAndReleaseResources() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeDestroy(this.nativeShellHolderId);
            this.nativeShellHolderId = null;
        }
        finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }
    
    public void dispatchEmptyPlatformMessage(final String s, final int n) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId, s, n);
        }
        else {
            final StringBuilder sb = new StringBuilder("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
            sb.append(s);
            sb.append(". Response ID: ");
            sb.append(n);
            Log.w("FlutterJNI", sb.toString());
        }
    }
    
    public void dispatchPlatformMessage(final String s, final ByteBuffer byteBuffer, final int n, final int n2) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.nativeDispatchPlatformMessage(this.nativeShellHolderId, s, byteBuffer, n, n2);
        }
        else {
            final StringBuilder sb = new StringBuilder("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
            sb.append(s);
            sb.append(". Response ID: ");
            sb.append(n2);
            Log.w("FlutterJNI", sb.toString());
        }
    }
    
    public void dispatchPointerDataPacket(final ByteBuffer byteBuffer, final int n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeDispatchPointerDataPacket(this.nativeShellHolderId, byteBuffer, n);
    }
    
    public void dispatchSemanticsAction(final int n, final int n2, final ByteBuffer byteBuffer, final int n3) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeDispatchSemanticsAction(this.nativeShellHolderId, n, n2, byteBuffer, n3);
    }
    
    public void dispatchSemanticsAction(final int n, final d d) {
        this.dispatchSemanticsAction(n, d, null);
    }
    
    public void dispatchSemanticsAction(final int n, final d d, final Object o) {
        this.ensureAttachedToNative();
        ByteBuffer a;
        int position;
        if (o != null) {
            a = u.a.a(o);
            position = ((Buffer)a).position();
        }
        else {
            a = null;
            position = 0;
        }
        this.dispatchSemanticsAction(n, d.C, a, position);
    }
    
    @SuppressLint({ "NewApi" })
    public void endFrame2() {
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            SurfaceControl$Transaction surfaceControl$Transaction = sE.h();
            int n = 0;
            ArrayList o;
            while (true) {
                o = platformViewsController2.O;
                if (n >= o.size()) {
                    break;
                }
                surfaceControl$Transaction = sE.i(surfaceControl$Transaction, io.flutter.plugin.platform.p.e(o.get(n)));
                ++n;
            }
            o.clear();
            ((View)platformViewsController2.F).invalidate();
            YD.w(YD.p(platformViewsController2.F), surfaceControl$Transaction);
            return;
        }
        throw new RuntimeException("");
    }
    
    public Bitmap getBitmap() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        return this.nativeGetBitmap(this.nativeShellHolderId);
    }
    
    public boolean getIsSoftwareRenderingEnabled() {
        return this.nativeGetIsSoftwareRenderingEnabled();
    }
    
    public float getScaledFontSize(final float n, final int n2) {
        final w2.e b = m.b;
        final l l = (l)b.E;
        final ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue)b.D;
        if (l == null) {
            b.E = concurrentLinkedQueue.poll();
        }
        l i;
        while (true) {
            i = (l)b.E;
            if (i == null || i.a >= n2) {
                break;
            }
            b.E = concurrentLinkedQueue.poll();
        }
        final DisplayMetrics displayMetrics = null;
        l j = null;
        Label_0205: {
            if (i == null) {
                final StringBuilder sb = new StringBuilder("Cannot find config with generation: ");
                sb.append(String.valueOf(n2));
                sb.append(", after exhausting the queue.");
                Log.e("SettingsChannel", sb.toString());
            }
            else {
                j = i;
                if (i.a == n2) {
                    break Label_0205;
                }
                final StringBuilder sb2 = new StringBuilder("Cannot find config with generation: ");
                sb2.append(String.valueOf(n2));
                sb2.append(", the oldest config is now: ");
                sb2.append(String.valueOf(((l)b.E).a));
                Log.e("SettingsChannel", sb2.toString());
            }
            j = null;
        }
        DisplayMetrics b2;
        if (j == null) {
            b2 = displayMetrics;
        }
        else {
            b2 = j.b;
        }
        if (b2 == null) {
            final StringBuilder sb3 = new StringBuilder("getScaledFontSize called with configurationId ");
            sb3.append(String.valueOf(n2));
            sb3.append(", which can't be found.");
            Log.e("FlutterJNI", sb3.toString());
            return -1.0f;
        }
        return TypedValue.applyDimension(2, n, b2) / b2.density;
    }
    
    public void handlePlatformMessage(final String s, final ByteBuffer byteBuffer, final int n, final long n2) {
        final x4.j platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            final x4.i i = (x4.i)platformMessageHandler;
            final Object f;
            monitorenter(f = i.F);
            while (true) {
                Label_0120: {
                    try {
                        final x4.e e = (x4.e)i.D.get((Object)s);
                        final boolean b = i.G.get() && e == null;
                        if (!b) {
                            break Label_0158;
                        }
                        if (!i.E.containsKey((Object)s)) {
                            i.E.put((Object)s, (Object)new LinkedList());
                        }
                        break Label_0120;
                    }
                    finally {
                        monitorexit(f);
                        monitorexit(f);
                        final boolean b;
                        iftrue(Label_0192:)(b);
                        final x4.e e;
                        i.a(s, e, byteBuffer, n, n2);
                        return;
                        ((List)i.E.get((Object)s)).add((Object)new c(n2, byteBuffer, n));
                        continue;
                    }
                }
                break;
            }
        }
        this.nativeCleanupMessageData(n2);
        Label_0192:;
    }
    
    @SuppressLint({ "NewApi" })
    public void hideOverlaySurface2() {
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            if (platformViewsController2.Q != null) {
                final SurfaceControl$Transaction h = sE.h();
                sE.o(h, platformViewsController2.Q);
                sE.n(h);
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }
    
    public void init(final Context context, final String[] array, final String s, final String s2, final String s3, final long n, final int n2) {
        if (FlutterJNI.initCalled) {
            Log.w("FlutterJNI", "FlutterJNI.init called more than once");
        }
        nativeInit(context, array, s, s2, s3, n, n2);
        FlutterJNI.initCalled = true;
    }
    
    public void invokePlatformMessageEmptyResponseCallback(final int n) {
        this.shellHolderLock.readLock().lock();
        Label_0074: {
            Label_0063: {
                try {
                    if (this.isAttached()) {
                        this.nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId, n);
                        break Label_0063;
                    }
                }
                finally {
                    break Label_0074;
                }
                final StringBuilder sb = new StringBuilder("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
                sb.append(n);
                Log.w("FlutterJNI", sb.toString());
            }
            this.shellHolderLock.readLock().unlock();
            return;
        }
        this.shellHolderLock.readLock().unlock();
    }
    
    public void invokePlatformMessageResponseCallback(final int n, final ByteBuffer byteBuffer, final int n2) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        Label_0083: {
            Label_0072: {
                try {
                    if (this.isAttached()) {
                        this.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId, n, byteBuffer, n2);
                        break Label_0072;
                    }
                }
                finally {
                    break Label_0083;
                }
                final StringBuilder sb = new StringBuilder("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
                sb.append(n);
                Log.w("FlutterJNI", sb.toString());
            }
            this.shellHolderLock.readLock().unlock();
            return;
        }
        this.shellHolderLock.readLock().unlock();
    }
    
    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }
    
    public boolean isCodePointEmoji(final int n) {
        return this.nativeFlutterTextUtilsIsEmoji(n);
    }
    
    public boolean isCodePointEmojiModifier(final int n) {
        return this.nativeFlutterTextUtilsIsEmojiModifier(n);
    }
    
    public boolean isCodePointEmojiModifierBase(final int n) {
        return this.nativeFlutterTextUtilsIsEmojiModifierBase(n);
    }
    
    public boolean isCodePointRegionalIndicator(final int n) {
        return this.nativeFlutterTextUtilsIsRegionalIndicator(n);
    }
    
    public boolean isCodePointVariantSelector(final int n) {
        return this.nativeFlutterTextUtilsIsVariationSelector(n);
    }
    
    public void loadDartDeferredLibrary(final int n, final String[] array) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeLoadDartDeferredLibrary(this.nativeShellHolderId, n, array);
    }
    
    public void loadLibrary(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            15
        //     6: ldc             "FlutterJNI"
        //     8: ldc_w           "FlutterJNI.loadLibrary called more than once"
        //    11: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    14: pop            
        //    15: new             Ljava/lang/Object;
        //    18: dup            
        //    19: invokespecial   java/lang/Object.<init>:()V
        //    22: astore          9
        //    24: new             LY0/h;
        //    27: dup            
        //    28: bipush          18
        //    30: invokespecial   Y0/h.<init>:(I)V
        //    33: astore          10
        //    35: aload           10
        //    37: aload           9
        //    39: putfield        Y0/h.F:Ljava/lang/Object;
        //    42: aload_1        
        //    43: ifnull          921
        //    46: aload           10
        //    48: ldc_w           "Beginning load of %s..."
        //    51: iconst_1       
        //    52: anewarray       Ljava/lang/Object;
        //    55: dup            
        //    56: iconst_0       
        //    57: ldc_w           "flutter"
        //    60: aastore        
        //    61: invokevirtual   Y0/h.p:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    64: aload           10
        //    66: getfield        Y0/h.D:Ljava/lang/Object;
        //    69: checkcast       Lc0/b;
        //    72: astore          11
        //    74: aload           10
        //    76: getfield        Y0/h.C:Ljava/lang/Object;
        //    79: checkcast       Ljava/util/HashSet;
        //    82: astore          13
        //    84: aload           13
        //    86: ldc_w           "flutter"
        //    89: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //    92: ifeq            116
        //    95: aload           10
        //    97: ldc_w           "%s already loaded previously!"
        //   100: iconst_1       
        //   101: anewarray       Ljava/lang/Object;
        //   104: dup            
        //   105: iconst_0       
        //   106: ldc_w           "flutter"
        //   109: aastore        
        //   110: invokevirtual   Y0/h.p:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   113: goto            804
        //   116: aload           11
        //   118: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   121: pop            
        //   122: ldc_w           "flutter"
        //   125: invokestatic    java/lang/System.loadLibrary:(Ljava/lang/String;)V
        //   128: aload           13
        //   130: ldc_w           "flutter"
        //   133: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   136: pop            
        //   137: aload           10
        //   139: ldc_w           "%s (%s) was loaded normally!"
        //   142: iconst_2       
        //   143: anewarray       Ljava/lang/Object;
        //   146: dup            
        //   147: iconst_0       
        //   148: ldc_w           "flutter"
        //   151: aastore        
        //   152: dup            
        //   153: iconst_1       
        //   154: aconst_null    
        //   155: aastore        
        //   156: invokevirtual   Y0/h.p:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   159: goto            113
        //   162: astore          9
        //   164: aload           10
        //   166: ldc_w           "Loading the library normally failed: %s"
        //   169: iconst_1       
        //   170: anewarray       Ljava/lang/Object;
        //   173: dup            
        //   174: iconst_0       
        //   175: aload           9
        //   177: invokestatic    android/util/Log.getStackTraceString:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   180: aastore        
        //   181: invokevirtual   Y0/h.p:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   184: aload           10
        //   186: ldc_w           "%s (%s) was not loaded normally, re-linking..."
        //   189: iconst_2       
        //   190: anewarray       Ljava/lang/Object;
        //   193: dup            
        //   194: iconst_0       
        //   195: ldc_w           "flutter"
        //   198: aastore        
        //   199: dup            
        //   200: iconst_1       
        //   201: aconst_null    
        //   202: aastore        
        //   203: invokevirtual   Y0/h.p:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   206: aload           10
        //   208: aload_1        
        //   209: invokevirtual   Y0/h.o:(Landroid/content/Context;)Ljava/io/File;
        //   212: astore          14
        //   214: aload           14
        //   216: invokevirtual   java/io/File.exists:()Z
        //   219: ifeq            225
        //   222: goto            754
        //   225: aload_1        
        //   226: ldc_w           "lib"
        //   229: iconst_0       
        //   230: invokevirtual   android/content/Context.getDir:(Ljava/lang/String;I)Ljava/io/File;
        //   233: astore          12
        //   235: aload           10
        //   237: aload_1        
        //   238: invokevirtual   Y0/h.o:(Landroid/content/Context;)Ljava/io/File;
        //   241: astore          9
        //   243: aload           11
        //   245: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   248: pop            
        //   249: aload           12
        //   251: new             Li1/a;
        //   254: dup            
        //   255: ldc_w           "flutter"
        //   258: invokestatic    java/lang/System.mapLibraryName:(Ljava/lang/String;)Ljava/lang/String;
        //   261: invokespecial   i1/a.<init>:(Ljava/lang/String;)V
        //   264: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //   267: astore          12
        //   269: aload           12
        //   271: ifnonnull       277
        //   274: goto            322
        //   277: aload           12
        //   279: arraylength    
        //   280: istore_3       
        //   281: iconst_0       
        //   282: istore_2       
        //   283: iload_2        
        //   284: iload_3        
        //   285: if_icmpge       322
        //   288: aload           12
        //   290: iload_2        
        //   291: aaload         
        //   292: astore          15
        //   294: aload           15
        //   296: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   299: aload           9
        //   301: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   304: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   307: ifne            316
        //   310: aload           15
        //   312: invokevirtual   java/io/File.delete:()Z
        //   315: pop            
        //   316: iinc            2, 1
        //   319: goto            283
        //   322: getstatic       android/os/Build.SUPPORTED_ABIS:[Ljava/lang/String;
        //   325: astore          9
        //   327: aload           9
        //   329: arraylength    
        //   330: ifle            336
        //   333: goto            389
        //   336: getstatic       android/os/Build.CPU_ABI2:Ljava/lang/String;
        //   339: astore          9
        //   341: aload           9
        //   343: ifnull          377
        //   346: aload           9
        //   348: invokevirtual   java/lang/String.length:()I
        //   351: ifne            357
        //   354: goto            377
        //   357: iconst_2       
        //   358: anewarray       Ljava/lang/String;
        //   361: dup            
        //   362: iconst_0       
        //   363: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //   366: aastore        
        //   367: dup            
        //   368: iconst_1       
        //   369: aload           9
        //   371: aastore        
        //   372: astore          9
        //   374: goto            389
        //   377: iconst_1       
        //   378: anewarray       Ljava/lang/String;
        //   381: dup            
        //   382: iconst_0       
        //   383: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //   386: aastore        
        //   387: astore          9
        //   389: ldc_w           "flutter"
        //   392: invokestatic    java/lang/System.mapLibraryName:(Ljava/lang/String;)Ljava/lang/String;
        //   395: astore          15
        //   397: aload           10
        //   399: getfield        Y0/h.E:Ljava/lang/Object;
        //   402: checkcast       Lc0/f;
        //   405: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   408: pop            
        //   409: aload_1        
        //   410: aload           9
        //   412: aload           15
        //   414: aload           10
        //   416: invokestatic    c0/f.o:(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;LY0/h;)Lf2/d;
        //   419: astore          12
        //   421: aload           12
        //   423: ifnull          809
        //   426: iconst_0       
        //   427: istore_2       
        //   428: aload           12
        //   430: getfield        f2/d.D:Ljava/lang/Object;
        //   433: checkcast       Ljava/util/zip/ZipFile;
        //   436: astore          17
        //   438: iload_2        
        //   439: iconst_5       
        //   440: if_icmpge       729
        //   443: aload           10
        //   445: ldc_w           "Found %s! Extracting..."
        //   448: iconst_1       
        //   449: anewarray       Ljava/lang/Object;
        //   452: dup            
        //   453: iconst_0       
        //   454: aload           15
        //   456: aastore        
        //   457: invokevirtual   Y0/h.p:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   460: aload           14
        //   462: invokevirtual   java/io/File.exists:()Z
        //   465: ifne            491
        //   468: aload           14
        //   470: invokevirtual   java/io/File.createNewFile:()Z
        //   473: istore          8
        //   475: iload           8
        //   477: ifne            491
        //   480: goto            723
        //   483: astore_1       
        //   484: aload           12
        //   486: astore          9
        //   488: goto            894
        //   491: aload           17
        //   493: aload           12
        //   495: getfield        f2/d.E:Ljava/lang/Object;
        //   498: checkcast       Ljava/util/zip/ZipEntry;
        //   501: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //   504: astore_1       
        //   505: new             Ljava/io/FileOutputStream;
        //   508: astore          9
        //   510: aload           9
        //   512: aload           14
        //   514: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   517: sipush          4096
        //   520: newarray        B
        //   522: astore          16
        //   524: lconst_0       
        //   525: lstore          4
        //   527: aload_1        
        //   528: aload           16
        //   530: invokevirtual   java/io/InputStream.read:([B)I
        //   533: istore_3       
        //   534: iload_3        
        //   535: iconst_m1      
        //   536: if_icmpne       632
        //   539: aload           9
        //   541: invokevirtual   java/io/OutputStream.flush:()V
        //   544: aload           9
        //   546: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //   549: invokevirtual   java/io/FileDescriptor.sync:()V
        //   552: aload           14
        //   554: invokevirtual   java/io/File.length:()J
        //   557: lstore          6
        //   559: lload           4
        //   561: lload           6
        //   563: lcmp           
        //   564: ifeq            579
        //   567: aload_1        
        //   568: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   571: aload           9
        //   573: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   576: goto            723
        //   579: aload_1        
        //   580: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   583: aload           9
        //   585: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   588: aload           14
        //   590: iconst_1       
        //   591: iconst_0       
        //   592: invokevirtual   java/io/File.setReadable:(ZZ)Z
        //   595: pop            
        //   596: aload           14
        //   598: iconst_1       
        //   599: iconst_0       
        //   600: invokevirtual   java/io/File.setExecutable:(ZZ)Z
        //   603: pop            
        //   604: aload           14
        //   606: iconst_1       
        //   607: invokevirtual   java/io/File.setWritable:(Z)Z
        //   610: pop            
        //   611: aload           17
        //   613: invokevirtual   java/util/zip/ZipFile.close:()V
        //   616: goto            754
        //   619: astore          10
        //   621: aload           9
        //   623: astore          11
        //   625: aload           10
        //   627: astore          9
        //   629: goto            690
        //   632: aload           9
        //   634: aload           16
        //   636: iconst_0       
        //   637: iload_3        
        //   638: invokevirtual   java/io/OutputStream.write:([BII)V
        //   641: lload           4
        //   643: iload_3        
        //   644: i2l            
        //   645: ladd           
        //   646: lstore          4
        //   648: goto            527
        //   651: astore          9
        //   653: aconst_null    
        //   654: astore          11
        //   656: goto            690
        //   659: aconst_null    
        //   660: astore          9
        //   662: goto            702
        //   665: aconst_null    
        //   666: astore          9
        //   668: goto            714
        //   671: astore          9
        //   673: aconst_null    
        //   674: astore_1       
        //   675: goto            653
        //   678: astore_1       
        //   679: aconst_null    
        //   680: astore_1       
        //   681: goto            659
        //   684: astore_1       
        //   685: aconst_null    
        //   686: astore_1       
        //   687: goto            665
        //   690: aload_1        
        //   691: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   694: aload           11
        //   696: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   699: aload           9
        //   701: athrow         
        //   702: aload_1        
        //   703: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   706: aload           9
        //   708: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   711: goto            723
        //   714: aload_1        
        //   715: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   718: aload           9
        //   720: invokestatic    c0/f.n:(Ljava/io/Closeable;)V
        //   723: iinc            2, 1
        //   726: goto            428
        //   729: aload           10
        //   731: getfield        Y0/h.F:Ljava/lang/Object;
        //   734: checkcast       LO/h;
        //   737: ifnull          746
        //   740: ldc_w           "FATAL! Couldn't extract the library from the APK!"
        //   743: invokestatic    io/flutter/embedding/engine/FlutterJNI.a:(Ljava/lang/String;)V
        //   746: aload           17
        //   748: ifnull          754
        //   751: goto            611
        //   754: aload           14
        //   756: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   759: astore_1       
        //   760: aload           11
        //   762: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   765: pop            
        //   766: aload_1        
        //   767: invokestatic    java/lang/System.load:(Ljava/lang/String;)V
        //   770: aload           13
        //   772: ldc_w           "flutter"
        //   775: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   778: pop            
        //   779: aload           10
        //   781: ldc_w           "%s (%s) was re-linked!"
        //   784: iconst_2       
        //   785: anewarray       Ljava/lang/Object;
        //   788: dup            
        //   789: iconst_0       
        //   790: ldc_w           "flutter"
        //   793: aastore        
        //   794: dup            
        //   795: iconst_1       
        //   796: aconst_null    
        //   797: aastore        
        //   798: invokevirtual   Y0/h.p:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   801: goto            113
        //   804: iconst_1       
        //   805: putstatic       io/flutter/embedding/engine/FlutterJNI.loadLibraryCalled:Z
        //   808: return         
        //   809: aload_1        
        //   810: aload           15
        //   812: invokestatic    c0/f.p:(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
        //   815: astore_1       
        //   816: goto            832
        //   819: astore_1       
        //   820: iconst_1       
        //   821: anewarray       Ljava/lang/String;
        //   824: dup            
        //   825: iconst_0       
        //   826: aload_1        
        //   827: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   830: aastore        
        //   831: astore_1       
        //   832: new             LA0/c;
        //   835: astore          10
        //   837: ldc_w           "Could not find '"
        //   840: aload           15
        //   842: ldc_w           "'. Looked for: "
        //   845: invokestatic    com/google/android/gms/internal/measurement/L.l:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   848: astore          11
        //   850: aload           11
        //   852: aload           9
        //   854: invokestatic    java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
        //   857: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   860: pop            
        //   861: aload           11
        //   863: ldc_w           ", but only found: "
        //   866: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   869: pop            
        //   870: aload           10
        //   872: aload           11
        //   874: aload_1        
        //   875: invokestatic    java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
        //   878: ldc_w           "."
        //   881: invokestatic    x/a.b:(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   884: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   887: aload           10
        //   889: athrow         
        //   890: astore_1       
        //   891: aconst_null    
        //   892: astore          9
        //   894: aload           9
        //   896: ifnull          919
        //   899: aload           9
        //   901: getfield        f2/d.D:Ljava/lang/Object;
        //   904: checkcast       Ljava/util/zip/ZipFile;
        //   907: astore          9
        //   909: aload           9
        //   911: ifnull          919
        //   914: aload           9
        //   916: invokevirtual   java/util/zip/ZipFile.close:()V
        //   919: aload_1        
        //   920: athrow         
        //   921: new             Ljava/lang/IllegalArgumentException;
        //   924: dup            
        //   925: ldc_w           "Given context is null"
        //   928: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   931: athrow         
        //   932: astore_1       
        //   933: goto            723
        //   936: astore          9
        //   938: goto            665
        //   941: astore          9
        //   943: goto            659
        //   946: astore          16
        //   948: goto            714
        //   951: astore          16
        //   953: goto            702
        //   956: astore_1       
        //   957: goto            754
        //   960: astore          9
        //   962: goto            919
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  116    159    162    965    Ljava/lang/UnsatisfiedLinkError;
        //  409    421    890    894    Any
        //  443    460    483    491    Any
        //  460    475    932    936    Ljava/io/IOException;
        //  460    475    483    491    Any
        //  491    505    684    690    Ljava/io/FileNotFoundException;
        //  491    505    678    684    Ljava/io/IOException;
        //  491    505    671    678    Any
        //  505    517    936    941    Ljava/io/FileNotFoundException;
        //  505    517    941    946    Ljava/io/IOException;
        //  505    517    651    653    Any
        //  517    524    946    951    Ljava/io/FileNotFoundException;
        //  517    524    951    956    Ljava/io/IOException;
        //  517    524    619    632    Any
        //  527    534    946    951    Ljava/io/FileNotFoundException;
        //  527    534    951    956    Ljava/io/IOException;
        //  527    534    619    632    Any
        //  539    559    946    951    Ljava/io/FileNotFoundException;
        //  539    559    951    956    Ljava/io/IOException;
        //  539    559    619    632    Any
        //  567    576    483    491    Any
        //  579    611    483    491    Any
        //  611    616    956    960    Ljava/io/IOException;
        //  632    641    946    951    Ljava/io/FileNotFoundException;
        //  632    641    951    956    Ljava/io/IOException;
        //  632    641    619    632    Any
        //  690    702    483    491    Any
        //  702    711    483    491    Any
        //  714    723    483    491    Any
        //  729    746    483    491    Any
        //  809    816    819    832    Ljava/lang/Exception;
        //  809    816    483    491    Any
        //  820    832    483    491    Any
        //  832    890    483    491    Any
        //  899    909    960    965    Ljava/io/IOException;
        //  914    919    960    965    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 460 out of bounds for length 460
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void markTextureFrameAvailable(final long n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeMarkTextureFrameAvailable(this.nativeShellHolderId, n);
    }
    
    public void notifyLowMemoryWarning() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeNotifyLowMemoryWarning(this.nativeShellHolderId);
    }
    
    public void onBeginFrame() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.U.clear();
            platformViewsController.V.clear();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }
    
    public void onDisplayOverlaySurface(final int n, final int leftMargin, final int topMargin, final int n2, final int n3) {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        final SparseArray p5 = platformViewsController.P;
        if (p5.get(n) != null) {
            platformViewsController.k();
            final io.flutter.plugin.platform.c c = (io.flutter.plugin.platform.c)p5.get(n);
            if (c.getParent() == null) {
                ((ViewGroup)platformViewsController.F).addView((View)c);
            }
            final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n2, n3);
            layoutParams.leftMargin = leftMargin;
            layoutParams.topMargin = topMargin;
            c.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            c.setVisibility(0);
            c.bringToFront();
            platformViewsController.U.add((Object)n);
            return;
        }
        throw new IllegalStateException(Y3.a.j(n, "The overlay surface (id:", ") doesn't exist"));
    }
    
    public void onDisplayPlatformView(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final FlutterMutatorsStack c) {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.k();
            final SparseArray n8 = platformViewsController.N;
            final io.flutter.plugin.platform.f f = (io.flutter.plugin.platform.f)n8.get(n);
            if (f != null) {
                final SparseArray o = platformViewsController.O;
                if (o.get(n) == null) {
                    final View view = f.getView();
                    if (view == null) {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                    if (view.getParent() != null) {
                        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                    }
                    final Activity e = platformViewsController.E;
                    final A4.b b = new A4.b(e, ((Context)e).getResources().getDisplayMetrics().density, platformViewsController.D);
                    b.setOnDescendantFocusChangeListener((View$OnFocusChangeListener)new io.flutter.plugin.platform.l((io.flutter.plugin.platform.k)platformViewsController, n, 0));
                    o.put(n, (Object)b);
                    view.setImportantForAccessibility(4);
                    ((ViewGroup)b).addView(view);
                    ((ViewGroup)platformViewsController.F).addView((View)b);
                }
                final A4.b b2 = (A4.b)o.get(n);
                b2.C = c;
                b2.E = n2;
                b2.F = n3;
                final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n4, n5);
                layoutParams.leftMargin = n2;
                layoutParams.topMargin = n3;
                ((View)b2).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                ((View)b2).setWillNotDraw(false);
                ((View)b2).setVisibility(0);
                ((View)b2).bringToFront();
                final FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(n6, n7);
                final View view2 = ((io.flutter.plugin.platform.f)n8.get(n)).getView();
                if (view2 != null) {
                    view2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                    view2.bringToFront();
                }
                platformViewsController.V.add((Object)n);
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }
    
    @SuppressLint({ "NewApi" })
    public void onDisplayPlatformView2(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final FlutterMutatorsStack c) {
        this.ensureRunningOnMainThread();
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            final SparseArray k = platformViewsController2.K;
            final io.flutter.plugin.platform.f f = (io.flutter.plugin.platform.f)k.get(n);
            if (f != null) {
                final SparseArray l = platformViewsController2.L;
                if (l.get(n) == null) {
                    final View view = f.getView();
                    if (view == null) {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                    if (view.getParent() != null) {
                        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                    }
                    final Activity e = platformViewsController2.E;
                    final A4.b b = new A4.b(e, ((Context)e).getResources().getDisplayMetrics().density, platformViewsController2.D);
                    b.setOnDescendantFocusChangeListener((View$OnFocusChangeListener)new io.flutter.plugin.platform.l((io.flutter.plugin.platform.k)platformViewsController2, n, 1));
                    l.put(n, (Object)b);
                    view.setImportantForAccessibility(4);
                    ((ViewGroup)b).addView(view);
                    ((ViewGroup)platformViewsController2.F).addView((View)b);
                }
                final A4.b b2 = (A4.b)l.get(n);
                b2.C = c;
                b2.E = n2;
                b2.F = n3;
                final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n4, n5);
                layoutParams.leftMargin = n2;
                layoutParams.topMargin = n3;
                ((View)b2).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                ((View)b2).setWillNotDraw(false);
                ((View)b2).setVisibility(0);
                ((View)b2).bringToFront();
                final FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(n6, n7);
                final View view2 = ((io.flutter.plugin.platform.f)k.get(n)).getView();
                if (view2 != null) {
                    view2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                    view2.bringToFront();
                }
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }
    
    public void onEndFrame() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            final boolean s = platformViewsController.S;
            final boolean b = false;
            if (s && platformViewsController.V.isEmpty()) {
                platformViewsController.S = false;
                final v4.l f = platformViewsController.F;
                final C.a a = new C.a((Object)platformViewsController, 10);
                final f e = f.E;
                if (e != null) {
                    final View g = f.G;
                    if (g != null) {
                        f.F = g;
                        f.G = null;
                        final io.flutter.embedding.engine.renderer.j b2 = f.J.b;
                        if (b2 == null) {
                            e.a();
                            final f e2 = f.E;
                            if (e2 != null) {
                                e2.C.close();
                                ((ViewGroup)f).removeView((View)f.E);
                                f.E = null;
                            }
                            a.run();
                        }
                        else {
                            ((io.flutter.embedding.engine.renderer.l)g).b();
                            b2.a((k)new v4.k(f, b2, a));
                        }
                    }
                }
            }
            else {
                boolean b3 = b;
                if (platformViewsController.S) {
                    final f e3 = platformViewsController.F.E;
                    final boolean b4 = e3 != null && e3.e();
                    b3 = b;
                    if (b4) {
                        b3 = true;
                    }
                }
                platformViewsController.i(b3);
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }
    
    public void onFirstFrame() {
        this.ensureRunningOnMainThread();
        final Iterator iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            ((k)iterator.next()).b();
        }
    }
    
    public void onRenderingStopped() {
        this.ensureRunningOnMainThread();
        final Iterator iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            ((k)iterator.next()).a();
        }
    }
    
    public void onSurfaceChanged(final int n, final int n2) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceChanged(this.nativeShellHolderId, n, n2);
    }
    
    public void onSurfaceCreated(final Surface surface) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceCreated(this.nativeShellHolderId, surface);
    }
    
    public void onSurfaceDestroyed() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.onRenderingStopped();
        this.nativeSurfaceDestroyed(this.nativeShellHolderId);
    }
    
    public void onSurfaceWindowChanged(final Surface surface) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceWindowChanged(this.nativeShellHolderId, surface);
    }
    
    public void onVsync(final long n, final long n2, final long n3) {
        this.nativeOnVsync(n, n2, n3);
    }
    
    public long performNativeAttach(final FlutterJNI flutterJNI) {
        return this.nativeAttach(flutterJNI);
    }
    
    public void prefetchDefaultFontManager() {
        if (FlutterJNI.prefetchDefaultFontManagerCalled) {
            Log.w("FlutterJNI", "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        FlutterJNI.prefetchDefaultFontManagerCalled = true;
    }
    
    public void registerImageTexture(final long n, final TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, final boolean b) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRegisterImageTexture(this.nativeShellHolderId, n, (WeakReference<TextureRegistry$ImageConsumer>)new WeakReference((Object)textureRegistry$ImageConsumer), b);
    }
    
    public void registerTexture(final long n, final SurfaceTextureWrapper surfaceTextureWrapper) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRegisterTexture(this.nativeShellHolderId, n, (WeakReference<SurfaceTextureWrapper>)new WeakReference((Object)surfaceTextureWrapper));
    }
    
    public void removeEngineLifecycleListener(final b b) {
        this.ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove((Object)b);
    }
    
    public void removeIsDisplayingFlutterUiListener(final k k) {
        this.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove((Object)k);
    }
    
    public void requestDartDeferredLibrary(final int n) {
        Log.e("FlutterJNI", "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }
    
    public void runBundleAndSnapshotFromLibrary(final String s, final String s2, final String s3, final AssetManager assetManager, final List<String> list, final long n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId, s, s2, s3, assetManager, list, n);
    }
    
    public void scheduleFrame() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeScheduleFrame(this.nativeShellHolderId);
    }
    
    public void setAccessibilityDelegate(final i accessibilityDelegate) {
        this.ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }
    
    public void setAccessibilityFeatures(final int accessibilityFeaturesInNative) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.setAccessibilityFeaturesInNative(accessibilityFeaturesInNative);
        }
    }
    
    public void setAccessibilityFeaturesInNative(final int n) {
        this.nativeSetAccessibilityFeatures(this.nativeShellHolderId, n);
    }
    
    public void setAsyncWaitForVsyncDelegate(final j asyncWaitForVsyncDelegate) {
        FlutterJNI.asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate;
    }
    
    public void setDeferredComponentManager(final a a) {
        this.ensureRunningOnMainThread();
        if (a != null) {
            a.a();
        }
    }
    
    public void setLocalizationPlugin(final G4.a localizationPlugin) {
        this.ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }
    
    public void setPlatformMessageHandler(final x4.j platformMessageHandler) {
        this.ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }
    
    public void setPlatformViewsController(final r platformViewsController) {
        this.ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }
    
    public void setPlatformViewsController2(final q platformViewsController2) {
        this.ensureRunningOnMainThread();
        this.platformViewsController2 = platformViewsController2;
    }
    
    public void setRefreshRateFPS(final float refreshRateFPS) {
        FlutterJNI.refreshRateFPS = refreshRateFPS;
        this.updateRefreshRate();
    }
    
    public void setSemanticsEnabled(final boolean semanticsEnabledInNative) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.setSemanticsEnabledInNative(semanticsEnabledInNative);
        }
    }
    
    public void setSemanticsEnabledInNative(final boolean b) {
        this.nativeSetSemanticsEnabled(this.nativeShellHolderId, b);
    }
    
    public void setViewportMetrics(final float n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int[] array, final int[] array2, final int[] array3) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSetViewportMetrics(this.nativeShellHolderId, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, array, array2, array3);
    }
    
    @SuppressLint({ "NewApi" })
    public void showOverlaySurface2() {
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            if (platformViewsController2.Q != null) {
                final SurfaceControl$Transaction h = sE.h();
                sE.z(h, platformViewsController2.Q);
                sE.n(h);
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }
    
    public FlutterJNI spawn(final String s, final String s2, final String s3, final List<String> list, final long n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        final FlutterJNI nativeSpawn = this.nativeSpawn(this.nativeShellHolderId, s, s2, s3, list, n);
        final Long nativeShellHolderId = nativeSpawn.nativeShellHolderId;
        if (nativeShellHolderId != null && nativeShellHolderId != 0L) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }
    
    @SuppressLint({ "NewApi" })
    public void swapTransactions() {
        final q platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            final q q;
            monitorenter(q = platformViewsController2);
            Label_0063: {
                try {
                    platformViewsController2.O.clear();
                    for (int i = 0; i < platformViewsController2.N.size(); ++i) {
                        platformViewsController2.O.add((Object)io.flutter.plugin.platform.p.e(platformViewsController2.N.get(i)));
                    }
                    break Label_0063;
                }
                finally {
                    monitorexit(q);
                    platformViewsController2.N.clear();
                    monitorexit(q);
                    return;
                }
            }
        }
        throw new RuntimeException("");
    }
    
    public void unregisterTexture(final long n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeUnregisterTexture(this.nativeShellHolderId, n);
    }
    
    public void updateDisplayMetrics(final int n, final float displayWidth, final float displayHeight, final float displayDensity) {
        FlutterJNI.displayWidth = displayWidth;
        FlutterJNI.displayHeight = displayHeight;
        FlutterJNI.displayDensity = displayDensity;
        if (!FlutterJNI.loadLibraryCalled) {
            return;
        }
        this.nativeUpdateDisplayMetrics(this.nativeShellHolderId);
    }
    
    public void updateJavaAssetManager(final AssetManager assetManager, final String s) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeUpdateJavaAssetManager(this.nativeShellHolderId, assetManager, s);
    }
    
    public void updateRefreshRate() {
        if (!FlutterJNI.loadLibraryCalled) {
            return;
        }
        this.nativeUpdateRefreshRate(FlutterJNI.refreshRateFPS);
    }
}
