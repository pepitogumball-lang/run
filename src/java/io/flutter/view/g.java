package io.flutter.view;

import android.os.BaseBundle;
import Y0.h;
import java.util.regex.Matcher;
import java.io.Serializable;
import java.util.regex.Pattern;
import android.os.Bundle;
import android.view.MotionEvent;
import java.util.Iterator;
import O.n0;
import io.flutter.plugin.editing.i;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.x;
import android.os.Build$VERSION;
import android.database.ContentObserver;
import android.provider.Settings$Global;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;
import android.os.Handler;
import android.view.View;
import V4.G;
import java.util.ArrayList;
import java.util.HashMap;
import android.content.ContentResolver;
import android.view.accessibility.AccessibilityManager;
import c2.k;
import v4.l;
import android.view.accessibility.AccessibilityNodeProvider;

public final class g extends AccessibilityNodeProvider
{
    public static final int z = 0;
    public final l a;
    public final k b;
    public final AccessibilityManager c;
    public final AccessibilityViewEmbedder d;
    public final io.flutter.plugin.platform.k e;
    public final ContentResolver f;
    public final HashMap g;
    public final HashMap h;
    public f i;
    public Integer j;
    public Integer k;
    public int l;
    public String m;
    public f n;
    public f o;
    public f p;
    public final ArrayList q;
    public int r;
    public G s;
    public boolean t;
    public boolean u;
    public final a v;
    public final b w;
    public final c x;
    public final U.a y;
    
    public g(final l a, final k b, final AccessibilityManager c, final ContentResolver f, final io.flutter.plugin.platform.k e) {
        final AccessibilityViewEmbedder d = new AccessibilityViewEmbedder((View)a, 65536);
        this.g = new HashMap();
        this.h = new HashMap();
        this.l = 0;
        this.q = new ArrayList();
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = new a(this);
        final b w = new b(this);
        this.w = w;
        final U.a y = new U.a((Object)this, new Handler(), 4);
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
        w.onAccessibilityStateChanged(c.isEnabled());
        c.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)w);
        final c x = new c(this, c);
        (this.x = x).onTouchExplorationStateChanged(c.isTouchExplorationEnabled());
        c.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)x);
        this.l |= 0x80;
        y.onChange(false, (Uri)null);
        f.registerContentObserver(Settings$Global.getUriFor("transition_animation_scale"), false, (ContentObserver)y);
        if (Build$VERSION.SDK_INT >= 31 && a != null) {
            if (((View)a).getResources() != null) {
                final int a2 = io.flutter.plugin.platform.x.a(((View)a).getResources().getConfiguration());
                if (a2 != Integer.MAX_VALUE && a2 >= 300) {
                    this.l |= 0x8;
                }
                else {
                    this.l &= 0xFFFFFFF7;
                }
                ((FlutterJNI)b.E).setAccessibilityFeatures(this.l);
            }
        }
        e.a(this);
    }
    
    public static String d(final ByteBuffer byteBuffer, final String[] array) {
        final int int1 = byteBuffer.getInt();
        String s;
        if (int1 == -1) {
            s = null;
        }
        else {
            s = array[int1];
        }
        return s;
    }
    
    public final boolean a(final View view, final View view2, final AccessibilityEvent accessibilityEvent) {
        final AccessibilityViewEmbedder d = this.d;
        if (!d.requestSendAccessibilityEvent(view, view2, accessibilityEvent)) {
            return false;
        }
        final Integer recordFlutterId = d.getRecordFlutterId(view, (AccessibilityRecord)accessibilityEvent);
        if (recordFlutterId == null) {
            return false;
        }
        final int eventType = accessibilityEvent.getEventType();
        if (eventType != 8) {
            if (eventType != 128) {
                if (eventType != 32768) {
                    if (eventType == 65536) {
                        this.k = null;
                        this.j = null;
                    }
                }
                else {
                    this.j = recordFlutterId;
                    this.i = null;
                }
            }
            else {
                this.p = null;
            }
        }
        else {
            this.k = recordFlutterId;
            this.n = null;
        }
        return true;
    }
    
    public final e b(final int b) {
        final HashMap h = this.h;
        Object o;
        if ((o = h.get((Object)b)) == null) {
            o = new Object();
            ((e)o).c = -1;
            ((e)o).b = b;
            ((e)o).a = 267386881 + b;
            h.put((Object)b, o);
        }
        return (e)o;
    }
    
    public final f c(final int b) {
        final HashMap g = this.g;
        f f;
        if ((f = (f)g.get((Object)b)) == null) {
            f = new f(this);
            f.b = b;
            g.put((Object)b, (Object)f);
        }
        return f;
    }
    
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
        final boolean b = true;
        this.j(true);
        final AccessibilityViewEmbedder d = this.d;
        if (n >= 65536) {
            return d.createAccessibilityNodeInfo(n);
        }
        final HashMap g = this.g;
        final l a = this.a;
        if (n == -1) {
            final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain((View)a);
            ((View)a).onInitializeAccessibilityNodeInfo(obtain);
            if (g.containsKey((Object)0)) {
                obtain.addChild((View)a, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        final f f = (f)g.get((Object)n);
        if (f == null) {
            return null;
        }
        final int c = io.flutter.view.f.c(f);
        final io.flutter.plugin.platform.k e = this.e;
        if (c == -1 || !e.b(io.flutter.view.f.c(f))) {
            final AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain((View)a, n);
            final int sdk_INT = Build$VERSION.SDK_INT;
            obtain2.setImportantForAccessibility(!f.D(12) && (io.flutter.view.f.t(f) != null || f.d != 0));
            final String s = "";
            obtain2.setViewIdResourceName("");
            if (io.flutter.view.f.e(f) != null) {
                obtain2.setViewIdResourceName(io.flutter.view.f.e(f));
            }
            obtain2.setPackageName((CharSequence)((View)a).getContext().getPackageName());
            obtain2.setClassName((CharSequence)"android.view.View");
            obtain2.setSource((View)a, n);
            obtain2.setFocusable(io.flutter.view.f.f(f));
            final f n2 = this.n;
            if (n2 != null) {
                obtain2.setFocused(io.flutter.view.f.a(n2) == n);
            }
            final f i = this.i;
            if (i != null) {
                obtain2.setAccessibilityFocused(io.flutter.view.f.a(i) == n);
            }
            if (io.flutter.view.f.g(f, 5)) {
                obtain2.setPassword(io.flutter.view.f.g(f, 11));
                if (!io.flutter.view.f.g(f, 21)) {
                    obtain2.setClassName((CharSequence)"android.widget.EditText");
                }
                obtain2.setEditable(io.flutter.view.f.g(f, 21) ^ true);
                if (io.flutter.view.f.h(f) != -1 && io.flutter.view.f.i(f) != -1) {
                    obtain2.setTextSelection(io.flutter.view.f.h(f), io.flutter.view.f.i(f));
                }
                final f j = this.i;
                if (j != null && io.flutter.view.f.a(j) == n) {
                    obtain2.setLiveRegion(1);
                }
                boolean b2;
                if (io.flutter.view.f.j(f, io.flutter.view.d.M)) {
                    obtain2.addAction(256);
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (io.flutter.view.f.j(f, io.flutter.view.d.N)) {
                    obtain2.addAction(512);
                    b2 = true;
                }
                int n3 = b2 ? 1 : 0;
                if (io.flutter.view.f.j(f, io.flutter.view.d.W)) {
                    obtain2.addAction(256);
                    n3 = ((b2 ? 1 : 0) | 0x2);
                }
                int movementGranularities = n3;
                if (io.flutter.view.f.j(f, io.flutter.view.d.X)) {
                    obtain2.addAction(512);
                    movementGranularities = (n3 | 0x2);
                }
                obtain2.setMovementGranularities(movementGranularities);
                if (io.flutter.view.f.k(f) >= 0) {
                    int length;
                    if (io.flutter.view.f.l(f) == null) {
                        length = 0;
                    }
                    else {
                        length = io.flutter.view.f.l(f).length();
                    }
                    obtain2.setMaxTextLength(io.flutter.view.f.k(f) + (length - io.flutter.view.f.m(f)));
                }
            }
            if (io.flutter.view.f.j(f, io.flutter.view.d.O)) {
                obtain2.addAction(131072);
            }
            if (io.flutter.view.f.j(f, io.flutter.view.d.P)) {
                obtain2.addAction(16384);
            }
            if (io.flutter.view.f.j(f, io.flutter.view.d.Q)) {
                obtain2.addAction(65536);
            }
            if (io.flutter.view.f.j(f, io.flutter.view.d.R)) {
                obtain2.addAction(32768);
            }
            if (io.flutter.view.f.j(f, io.flutter.view.d.Y)) {
                obtain2.addAction(2097152);
            }
            if (io.flutter.view.f.g(f, 4)) {
                obtain2.setClassName((CharSequence)"android.widget.Button");
            }
            if (io.flutter.view.f.g(f, 15)) {
                obtain2.setClassName((CharSequence)"android.widget.ImageView");
            }
            if (io.flutter.view.f.j(f, io.flutter.view.d.V)) {
                obtain2.setDismissable(true);
                obtain2.addAction(1048576);
            }
            if (io.flutter.view.f.n(f) != null) {
                obtain2.setParent((View)a, io.flutter.view.f.a(io.flutter.view.f.n(f)));
            }
            else {
                obtain2.setParent((View)a);
            }
            if (io.flutter.view.f.o(f) != -1) {
                obtain2.setTraversalAfter((View)a, io.flutter.view.f.o(f));
            }
            final Rect d2 = io.flutter.view.f.d(f);
            if (io.flutter.view.f.n(f) != null) {
                final Rect d3 = io.flutter.view.f.d(io.flutter.view.f.n(f));
                final Rect boundsInParent = new Rect(d2);
                boundsInParent.offset(-d3.left, -d3.top);
                obtain2.setBoundsInParent(boundsInParent);
            }
            else {
                obtain2.setBoundsInParent(d2);
            }
            final Rect boundsInScreen = new Rect(d2);
            final int[] array = new int[2];
            ((View)a).getLocationOnScreen(array);
            boundsInScreen.offset(array[0], array[1]);
            obtain2.setBoundsInScreen(boundsInScreen);
            obtain2.setVisibleToUser(true);
            obtain2.setEnabled(!io.flutter.view.f.g(f, 7) || io.flutter.view.f.g(f, 8));
            if (io.flutter.view.f.j(f, io.flutter.view.d.D)) {
                if (io.flutter.view.f.p(f) != null) {
                    obtain2.addAction(new AccessibilityNodeInfo$AccessibilityAction(16, (CharSequence)io.flutter.view.e.a(io.flutter.view.f.p(f))));
                    obtain2.setClickable(true);
                }
                else {
                    obtain2.addAction(16);
                    obtain2.setClickable(true);
                }
            }
            else if (io.flutter.view.f.g(f, 24)) {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
            if (io.flutter.view.f.j(f, io.flutter.view.d.E)) {
                if (io.flutter.view.f.q(f) != null) {
                    obtain2.addAction(new AccessibilityNodeInfo$AccessibilityAction(32, (CharSequence)io.flutter.view.e.a(io.flutter.view.f.q(f))));
                    obtain2.setLongClickable(true);
                }
                else {
                    obtain2.addAction(32);
                    obtain2.setLongClickable(true);
                }
            }
            final d f2 = io.flutter.view.d.F;
            final boolean k = io.flutter.view.f.j(f, f2);
            final d l = io.flutter.view.d.I;
            final d h = io.flutter.view.d.H;
            final d g2 = io.flutter.view.d.G;
            if (k || io.flutter.view.f.j(f, h) || io.flutter.view.f.j(f, g2) || io.flutter.view.f.j(f, l)) {
                obtain2.setScrollable(true);
                if (io.flutter.view.f.g(f, 19)) {
                    if (!io.flutter.view.f.j(f, f2) && !io.flutter.view.f.j(f, g2)) {
                        if (this.k(f)) {
                            obtain2.setCollectionInfo(AccessibilityNodeInfo$CollectionInfo.obtain(io.flutter.view.f.b(f), 0, false));
                        }
                        else {
                            obtain2.setClassName((CharSequence)"android.widget.ScrollView");
                        }
                    }
                    else if (this.k(f)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo$CollectionInfo.obtain(0, io.flutter.view.f.b(f), false));
                    }
                    else {
                        obtain2.setClassName((CharSequence)"android.widget.HorizontalScrollView");
                    }
                }
                if (io.flutter.view.f.j(f, f2) || io.flutter.view.f.j(f, h)) {
                    obtain2.addAction(4096);
                }
                if (io.flutter.view.f.j(f, g2) || io.flutter.view.f.j(f, l)) {
                    obtain2.addAction(8192);
                }
            }
            final d m = io.flutter.view.d.J;
            final boolean j2 = io.flutter.view.f.j(f, m);
            final d k2 = io.flutter.view.d.K;
            if (j2 || io.flutter.view.f.j(f, k2)) {
                obtain2.setClassName((CharSequence)"android.widget.SeekBar");
                if (io.flutter.view.f.j(f, m)) {
                    obtain2.addAction(4096);
                }
                if (io.flutter.view.f.j(f, k2)) {
                    obtain2.addAction(8192);
                }
            }
            if (io.flutter.view.f.g(f, 16)) {
                obtain2.setLiveRegion(1);
            }
            if (io.flutter.view.f.g(f, 5)) {
                obtain2.setText((CharSequence)io.flutter.view.f.r(f));
                if (sdk_INT >= 28) {
                    io.flutter.plugin.editing.i.l(obtain2, io.flutter.view.f.s(f));
                }
            }
            else if (!io.flutter.view.f.g(f, 12)) {
                Object contentDescription;
                final CharSequence charSequence = (CharSequence)(contentDescription = io.flutter.view.f.t(f));
                if (sdk_INT < 28) {
                    contentDescription = charSequence;
                    if (io.flutter.view.f.u(f) != null) {
                        Object o = s;
                        if (charSequence != null) {
                            o = charSequence;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(o);
                        sb.append("\n");
                        sb.append(io.flutter.view.f.u(f));
                        contentDescription = sb.toString();
                    }
                }
                if (contentDescription != null) {
                    obtain2.setContentDescription((CharSequence)contentDescription);
                }
            }
            if (sdk_INT >= 28 && io.flutter.view.f.u(f) != null) {
                n0.r(obtain2, io.flutter.view.f.u(f));
                if (io.flutter.view.f.t(f) == null) {
                    obtain2.setContentDescription((CharSequence)io.flutter.view.f.u(f));
                }
            }
            final boolean g3 = io.flutter.view.f.g(f, 1);
            final boolean g4 = io.flutter.view.f.g(f, 17);
            obtain2.setCheckable(g3 || g4);
            if (g3) {
                obtain2.setChecked(io.flutter.view.f.g(f, 2));
                if (io.flutter.view.f.g(f, 9)) {
                    obtain2.setClassName((CharSequence)"android.widget.RadioButton");
                }
                else {
                    obtain2.setClassName((CharSequence)"android.widget.CheckBox");
                }
            }
            else if (g4) {
                obtain2.setChecked(io.flutter.view.f.g(f, 18));
                obtain2.setClassName((CharSequence)"android.widget.Switch");
            }
            int expandedState = 3;
            obtain2.setSelected(io.flutter.view.f.g(f, 3));
            if (sdk_INT >= 36 && io.flutter.view.f.g(f, 27)) {
                if (!io.flutter.view.f.g(f, 28)) {
                    expandedState = 1;
                }
                obtain2.setExpandedState(expandedState);
                if (io.flutter.view.f.j(f, io.flutter.view.d.Z)) {
                    obtain2.addAction(262144);
                }
                if (io.flutter.view.f.j(f, io.flutter.view.d.a0)) {
                    obtain2.addAction(524288);
                }
            }
            if (sdk_INT >= 28) {
                n0.A(obtain2, io.flutter.view.f.v(f) > 0 && b);
            }
            final f i2 = this.i;
            if (i2 != null && io.flutter.view.f.a(i2) == n) {
                obtain2.addAction(128);
            }
            else {
                obtain2.addAction(64);
            }
            if (io.flutter.view.f.w(f) != null) {
                for (final e e2 : io.flutter.view.f.w(f)) {
                    obtain2.addAction(new AccessibilityNodeInfo$AccessibilityAction(io.flutter.view.e.b(e2), (CharSequence)io.flutter.view.e.c(e2)));
                }
            }
            for (final f f3 : io.flutter.view.f.x(f)) {
                if (io.flutter.view.f.g(f3, 14)) {
                    continue;
                }
                if (io.flutter.view.f.c(f3) != -1) {
                    final View c2 = e.c(io.flutter.view.f.c(f3));
                    if (!e.b(io.flutter.view.f.c(f3)) && c2 != null) {
                        c2.setImportantForAccessibility(0);
                        obtain2.addChild(c2);
                        continue;
                    }
                }
                obtain2.addChild((View)a, io.flutter.view.f.a(f3));
            }
            return obtain2;
        }
        final View c3 = e.c(io.flutter.view.f.c(f));
        if (c3 == null) {
            return null;
        }
        return d.getRootNode(c3, io.flutter.view.f.a(f), io.flutter.view.f.d(f));
    }
    
    public final AccessibilityEvent e(final int n, final int n2) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(n2);
        final l a = this.a;
        obtain.setPackageName((CharSequence)((View)a).getContext().getPackageName());
        ((AccessibilityRecord)obtain).setSource((View)a, n);
        return obtain;
    }
    
    public final boolean f(final MotionEvent motionEvent, final boolean b) {
        final boolean touchExplorationEnabled = this.c.isTouchExplorationEnabled();
        final Integer value = 0;
        if (!touchExplorationEnabled) {
            return false;
        }
        final HashMap g = this.g;
        if (g.isEmpty()) {
            return false;
        }
        final f e = ((f)g.get((Object)value)).E(new float[] { motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f }, b);
        if (e != null && e.i != -1) {
            return !b && this.d.onAccessibilityHoverEvent(e.b, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            final f p2 = this.p;
            if (p2 != null) {
                this.h(p2.b, 256);
                this.p = null;
            }
        }
        else {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            if (!g.isEmpty()) {
                final f e2 = ((f)g.get((Object)value)).E(new float[] { x, y, 0.0f, 1.0f }, b);
                if (e2 != this.p) {
                    if (e2 != null) {
                        this.h(e2.b, 128);
                    }
                    final f p3 = this.p;
                    if (p3 != null) {
                        this.h(p3.b, 256);
                    }
                    this.p = e2;
                }
            }
        }
        return true;
    }
    
    public final AccessibilityNodeInfo findFocus(final int n) {
        if (n != 1) {
            if (n != 2) {
                return null;
            }
        }
        else {
            final f n2 = this.n;
            if (n2 != null) {
                return this.createAccessibilityNodeInfo(n2.b);
            }
            final Integer k = this.k;
            if (k != null) {
                return this.createAccessibilityNodeInfo(k);
            }
        }
        final f i = this.i;
        if (i != null) {
            return this.createAccessibilityNodeInfo(i.b);
        }
        final Integer j = this.j;
        if (j != null) {
            return this.createAccessibilityNodeInfo(j);
        }
        return null;
    }
    
    public final boolean g(final f f, final int n, final Bundle bundle, final boolean b) {
        final int int1 = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        final boolean boolean1 = ((BaseBundle)bundle).getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        final int g = f.g;
        final int h = f.h;
        if (h >= 0) {
            if (g >= 0) {
                if (int1 != 1) {
                    if (int1 != 2) {
                        if (int1 != 4) {
                            if (int1 == 8 || int1 == 16) {
                                if (b) {
                                    f.h = f.r.length();
                                }
                                else {
                                    f.h = 0;
                                }
                            }
                        }
                        else if (b && h < f.r.length()) {
                            final Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher((CharSequence)f.r.substring(f.h));
                            if (matcher.find()) {
                                f.h += matcher.start(1);
                            }
                            else {
                                f.h = f.r.length();
                            }
                        }
                        else if (!b && f.h > 0) {
                            final Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher((CharSequence)f.r.substring(0, f.h));
                            if (matcher2.find()) {
                                f.h = matcher2.start(1);
                            }
                            else {
                                f.h = 0;
                            }
                        }
                    }
                    else if (b && h < f.r.length()) {
                        final Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher((CharSequence)f.r.substring(f.h));
                        matcher3.find();
                        if (matcher3.find()) {
                            f.h += matcher3.start(1);
                        }
                        else {
                            f.h = f.r.length();
                        }
                    }
                    else if (!b && f.h > 0) {
                        final Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher((CharSequence)f.r.substring(0, f.h));
                        if (matcher4.find()) {
                            f.h = matcher4.start(1);
                        }
                    }
                }
                else if (b && h < f.r.length()) {
                    ++f.h;
                }
                else if (!b) {
                    final int h2 = f.h;
                    if (h2 > 0) {
                        f.h = h2 - 1;
                    }
                }
                if (!boolean1) {
                    f.g = f.h;
                }
            }
        }
        if (g != f.g || h != f.h) {
            String r = f.r;
            if (r == null) {
                r = "";
            }
            final AccessibilityEvent e = this.e(f.b, 8192);
            ((AccessibilityRecord)e).getText().add((Object)r);
            ((AccessibilityRecord)e).setFromIndex(f.g);
            ((AccessibilityRecord)e).setToIndex(f.h);
            ((AccessibilityRecord)e).setItemCount(r.length());
            this.i(e);
        }
        final k b2 = this.b;
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 == 4 || int1 == 8 || int1 == 16) {
                    return true;
                }
            }
            else {
                if (b) {
                    final d w = io.flutter.view.d.W;
                    if (f.j(f, w)) {
                        b2.i(n, w, (Serializable)boolean1);
                        return true;
                    }
                }
                if (!b) {
                    final d x = io.flutter.view.d.X;
                    if (f.j(f, x)) {
                        b2.i(n, x, (Serializable)boolean1);
                        return true;
                    }
                }
            }
        }
        else {
            if (b) {
                final d m = io.flutter.view.d.M;
                if (f.j(f, m)) {
                    b2.i(n, m, (Serializable)boolean1);
                    return true;
                }
            }
            if (!b) {
                final d n2 = io.flutter.view.d.N;
                if (f.j(f, n2)) {
                    b2.i(n, n2, (Serializable)boolean1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void h(final int n, final int n2) {
        if (!this.c.isEnabled()) {
            return;
        }
        this.i(this.e(n, n2));
    }
    
    public final void i(final AccessibilityEvent accessibilityEvent) {
        if (!this.c.isEnabled()) {
            return;
        }
        final l a = this.a;
        ((View)a).getParent().requestSendAccessibilityEvent((View)a, accessibilityEvent);
    }
    
    public final void j(final boolean t) {
        if (this.t == t) {
            return;
        }
        this.t = t;
        if (t) {
            this.l |= 0x1;
        }
        else {
            this.l &= 0xFFFFFFFE;
        }
        ((FlutterJNI)this.b.E).setAccessibilityFeatures(this.l);
    }
    
    public final boolean k(f f) {
        if (f.j > 0) {
            final f i = this.i;
            final f f2 = null;
            Label_0053: {
                if (i != null) {
                    f f3 = i.R;
                    while (true) {
                        while (f3 != null) {
                            if (f3 == f) {
                                if (f3 != null) {
                                    return true;
                                }
                                break Label_0053;
                            }
                            else {
                                f3 = f3.R;
                            }
                        }
                        f3 = null;
                        continue;
                    }
                }
            }
            f = this.i;
            if (f != null) {
                f = f.R;
                f f4;
                while (true) {
                    f4 = f2;
                    if (f == null) {
                        break;
                    }
                    if (f.D(19)) {
                        f4 = f;
                        break;
                    }
                    f = f.R;
                }
                if (f4 != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final boolean performAction(final int n, final int n2, final Bundle bundle) {
        if (n >= 65536) {
            final boolean performAction = this.d.performAction(n, n2, bundle);
            if (performAction && n2 == 128) {
                this.j = null;
            }
            return performAction;
        }
        final HashMap g = this.g;
        final f i = (f)g.get((Object)n);
        if (i == null) {
            return false;
        }
        final d j = io.flutter.view.d.J;
        final d k = io.flutter.view.d.K;
        final k b = this.b;
        switch (n2) {
            default: {
                final e e = (e)this.h.get((Object)(n2 - 267386881));
                if (e != null) {
                    b.i(n, io.flutter.view.d.U, (Serializable)e.b);
                    return true;
                }
                return false;
            }
            case 16908342: {
                b.h(n, io.flutter.view.d.L);
                return true;
            }
            case 2097152: {
                String string;
                if (bundle != null && ((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
                    string = ((BaseBundle)bundle).getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                }
                else {
                    string = "";
                }
                b.i(n, io.flutter.view.d.Y, (Serializable)string);
                i.r = string;
                i.s = null;
                return true;
            }
            case 1048576: {
                b.h(n, io.flutter.view.d.V);
                return true;
            }
            case 524288: {
                b.h(n, io.flutter.view.d.a0);
                return true;
            }
            case 262144: {
                b.h(n, io.flutter.view.d.Z);
                return true;
            }
            case 131072: {
                final HashMap hashMap = new HashMap();
                if (bundle != null && ((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && ((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap.put((Object)"base", (Object)((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_START_INT"));
                    hashMap.put((Object)"extent", (Object)((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_END_INT"));
                }
                else {
                    hashMap.put((Object)"base", (Object)i.h);
                    hashMap.put((Object)"extent", (Object)i.h);
                }
                b.i(n, io.flutter.view.d.O, (Serializable)hashMap);
                final f f = (f)g.get((Object)n);
                f.g = (int)hashMap.get((Object)"base");
                f.h = (int)hashMap.get((Object)"extent");
                return true;
            }
            case 65536: {
                b.h(n, io.flutter.view.d.Q);
                return true;
            }
            case 32768: {
                b.h(n, io.flutter.view.d.R);
                return true;
            }
            case 16384: {
                b.h(n, io.flutter.view.d.P);
                return true;
            }
            case 8192: {
                final d l = io.flutter.view.d.I;
                if (io.flutter.view.f.j(i, l)) {
                    b.h(n, l);
                }
                else {
                    final d g2 = io.flutter.view.d.G;
                    if (io.flutter.view.f.j(i, g2)) {
                        b.h(n, g2);
                    }
                    else {
                        if (!io.flutter.view.f.j(i, k)) {
                            return false;
                        }
                        i.r = i.v;
                        i.s = i.w;
                        this.h(n, 4);
                        b.h(n, k);
                    }
                }
                return true;
            }
            case 4096: {
                final d h = io.flutter.view.d.H;
                if (io.flutter.view.f.j(i, h)) {
                    b.h(n, h);
                }
                else {
                    final d f2 = io.flutter.view.d.F;
                    if (io.flutter.view.f.j(i, f2)) {
                        b.h(n, f2);
                    }
                    else {
                        if (!io.flutter.view.f.j(i, j)) {
                            return false;
                        }
                        i.r = i.t;
                        i.s = i.u;
                        this.h(n, 4);
                        b.h(n, j);
                    }
                }
                return true;
            }
            case 512: {
                return this.g(i, n, bundle, false);
            }
            case 256: {
                return this.g(i, n, bundle, true);
            }
            case 128: {
                final f m = this.i;
                if (m != null && m.b == n) {
                    this.i = null;
                }
                final Integer j2 = this.j;
                if (j2 != null && j2 == n) {
                    this.j = null;
                }
                b.h(n, io.flutter.view.d.T);
                this.h(n, 65536);
                return true;
            }
            case 64: {
                if (this.i == null) {
                    ((View)this.a).invalidate();
                }
                this.i = i;
                b.h(n, io.flutter.view.d.S);
                final HashMap hashMap2 = new HashMap();
                hashMap2.put((Object)"type", (Object)"didGainFocus");
                hashMap2.put((Object)"nodeId", (Object)i.b);
                ((h)b.D).t((Object)hashMap2, (F4.c)null);
                this.h(n, 32768);
                if (io.flutter.view.f.j(i, j) || io.flutter.view.f.j(i, k)) {
                    this.h(n, 4);
                }
                return true;
            }
            case 32: {
                b.h(n, io.flutter.view.d.E);
                return true;
            }
            case 16: {
                b.h(n, io.flutter.view.d.D);
                return true;
            }
        }
    }
}
