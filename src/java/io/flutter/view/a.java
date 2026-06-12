package io.flutter.view;

import android.view.accessibility.AccessibilityRecord;
import java.nio.Buffer;
import android.view.accessibility.AccessibilityEvent;
import java.util.Iterator;
import java.util.HashMap;
import android.view.View;
import io.flutter.plugin.platform.k;
import com.google.android.gms.internal.measurement.L;
import java.util.Map$Entry;
import O.n0;
import android.os.Build$VERSION;
import android.opengl.Matrix;
import java.util.HashSet;
import java.util.ArrayList;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import w4.j;
import w4.i;

public final class a implements i, j
{
    public final Object a;
    
    public void a(final ByteBuffer byteBuffer, final String[] array, final ByteBuffer[] array2) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (int length = array2.length, i = 0; i < length; ++i) {
            array2[i].order(ByteOrder.LITTLE_ENDIAN);
        }
        final g g = (g)this.a;
        g.getClass();
        final ArrayList list = new ArrayList();
        k e;
        while (true) {
            final boolean hasRemaining = ((Buffer)byteBuffer).hasRemaining();
            e = g.e;
            if (!hasRemaining) {
                break;
            }
            final f c = g.c(byteBuffer.getInt());
            c.E = true;
            c.K = c.r;
            c.L = c.p;
            c.F = c.c;
            c.G = c.d;
            c.H = c.g;
            c.I = c.h;
            c.J = c.l;
            c.c = byteBuffer.getLong();
            c.d = byteBuffer.getInt();
            c.e = byteBuffer.getInt();
            c.f = byteBuffer.getInt();
            c.g = byteBuffer.getInt();
            c.h = byteBuffer.getInt();
            c.i = byteBuffer.getInt();
            c.j = byteBuffer.getInt();
            c.k = byteBuffer.getInt();
            c.l = byteBuffer.getFloat();
            c.m = byteBuffer.getFloat();
            c.n = byteBuffer.getFloat();
            c.o = io.flutter.view.g.d(byteBuffer, array);
            c.p = io.flutter.view.g.d(byteBuffer, array);
            c.q = f.C(byteBuffer, array2);
            c.r = io.flutter.view.g.d(byteBuffer, array);
            c.s = f.C(byteBuffer, array2);
            c.t = io.flutter.view.g.d(byteBuffer, array);
            c.u = f.C(byteBuffer, array2);
            c.v = io.flutter.view.g.d(byteBuffer, array);
            c.w = f.C(byteBuffer, array2);
            c.x = io.flutter.view.g.d(byteBuffer, array);
            c.y = f.C(byteBuffer, array2);
            c.z = io.flutter.view.g.d(byteBuffer, array);
            c.A = io.flutter.view.g.d(byteBuffer, array);
            c.B = io.flutter.view.g.d(byteBuffer, array);
            c.C = byteBuffer.getInt();
            byteBuffer.getInt();
            c.M = byteBuffer.getFloat();
            c.N = byteBuffer.getFloat();
            c.O = byteBuffer.getFloat();
            c.P = byteBuffer.getFloat();
            if (c.Q == null) {
                c.Q = new float[16];
            }
            for (int j = 0; j < 16; ++j) {
                c.Q[j] = byteBuffer.getFloat();
            }
            c.X = true;
            c.Z = true;
            final int int1 = byteBuffer.getInt();
            final ArrayList s = c.S;
            s.clear();
            final ArrayList t = c.T;
            t.clear();
            int n = 0;
            g a;
            while (true) {
                a = c.a;
                if (n >= int1) {
                    break;
                }
                final f c2 = a.c(byteBuffer.getInt());
                c2.R = c;
                s.add((Object)c2);
                ++n;
            }
            for (int k = 0; k < int1; ++k) {
                final f c3 = a.c(byteBuffer.getInt());
                c3.R = c;
                t.add((Object)c3);
            }
            final int int2 = byteBuffer.getInt();
            if (int2 == 0) {
                c.U = null;
            }
            else {
                final ArrayList u = c.U;
                if (u == null) {
                    c.U = new ArrayList(int2);
                }
                else {
                    u.clear();
                }
                for (int l = 0; l < int2; ++l) {
                    final e b = a.b(byteBuffer.getInt());
                    final int c4 = b.c;
                    if (c4 == 1) {
                        c.V = b;
                    }
                    else if (c4 == 2) {
                        c.W = b;
                    }
                    else {
                        c.U.add((Object)b);
                    }
                    c.U.add((Object)b);
                }
            }
            if (c.D(14)) {
                continue;
            }
            if (c.D(6)) {
                g.n = c;
            }
            if (c.E) {
                list.add((Object)c);
            }
            final int m = c.i;
            if (m == -1 || e.b(m)) {
                continue;
            }
            final View c5 = e.c(c.i);
            if (c5 == null) {
                continue;
            }
            c5.setImportantForAccessibility(0);
        }
        final HashSet set = new HashSet();
        final HashMap g2 = g.g;
        final f f = (f)g2.get((Object)0);
        final ArrayList list2 = new ArrayList();
        if (f != null) {
            final float[] array3 = new float[16];
            Matrix.setIdentityM(array3, 0);
            f.H(array3, set, false);
            f.z(list2);
        }
        final Iterator iterator = list2.iterator();
        f f2 = null;
        ArrayList q;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            q = g.q;
            if (!hasNext) {
                break;
            }
            final f f3 = (f)iterator.next();
            if (q.contains((Object)f3.b)) {
                continue;
            }
            f2 = f3;
        }
        f f4;
        if ((f4 = f2) == null) {
            f4 = f2;
            if (!list2.isEmpty()) {
                f4 = (f)list2.get(list2.size() - 1);
            }
        }
        if (f4 != null && (f4.b != g.r || list2.size() != q.size())) {
            g.r = f4.b;
            String b2;
            if ((b2 = f4.B()) == null) {
                b2 = " ";
            }
            if (Build$VERSION.SDK_INT >= 28) {
                n0.t(g.a, b2);
            }
            else {
                final AccessibilityEvent e2 = g.e(f4.b, 32);
                ((AccessibilityRecord)e2).getText().add((Object)b2);
                g.i(e2);
            }
        }
        q.clear();
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            q.add((Object)((f)iterator2.next()).b);
        }
        final Iterator iterator3 = g2.entrySet().iterator();
        while (iterator3.hasNext()) {
            final f f5 = (f)((Map$Entry)iterator3.next()).getValue();
            if (!set.contains((Object)f5)) {
                f5.R = null;
                if (f5.i != -1) {
                    final Integer j2 = g.j;
                    if (j2 != null && g.d.platformViewOfNode(j2) == e.c(f5.i)) {
                        g.h(g.j, 65536);
                        g.j = null;
                    }
                }
                final int i2 = f5.i;
                if (i2 != -1) {
                    final View c6 = e.c(i2);
                    if (c6 != null) {
                        c6.setImportantForAccessibility(4);
                    }
                }
                final f i3 = g.i;
                if (i3 == f5) {
                    g.h(i3.b, 65536);
                    g.i = null;
                }
                if (g.n == f5) {
                    g.n = null;
                }
                if (g.p == f5) {
                    g.p = null;
                }
                iterator3.remove();
            }
        }
        final AccessibilityEvent e3 = g.e(0, 2048);
        e3.setContentChangeTypes(1);
        g.i(e3);
        for (final f f6 : list) {
            if (!Float.isNaN(f6.l) && !Float.isNaN(f6.J) && f6.J != f6.l) {
                final AccessibilityEvent e4 = g.e(f6.b, 4096);
                final float l2 = f6.l;
                final float m2 = f6.m;
                float n2 = l2;
                float n3 = m2;
                if (Float.isInfinite(m2)) {
                    n2 = l2;
                    if (l2 > 70000.0f) {
                        n2 = 70000.0f;
                    }
                    n3 = 100000.0f;
                }
                float n6;
                float n7;
                if (Float.isInfinite(f6.n)) {
                    final float n4 = n3 + 100000.0f;
                    float n5 = n2;
                    if (n2 < -70000.0f) {
                        n5 = -70000.0f;
                    }
                    n6 = n5 + 100000.0f;
                    n7 = n4;
                }
                else {
                    final float n8 = f6.n;
                    n7 = n3 - n8;
                    n6 = n2 - n8;
                }
                if (!io.flutter.view.f.y(f6, d.H) && !io.flutter.view.f.y(f6, d.I)) {
                    if (io.flutter.view.f.y(f6, d.F) || io.flutter.view.f.y(f6, d.G)) {
                        ((AccessibilityRecord)e4).setScrollX((int)n6);
                        ((AccessibilityRecord)e4).setMaxScrollX((int)n7);
                    }
                }
                else {
                    ((AccessibilityRecord)e4).setScrollY((int)n6);
                    ((AccessibilityRecord)e4).setMaxScrollY((int)n7);
                }
                final int j3 = f6.j;
                if (j3 > 0) {
                    ((AccessibilityRecord)e4).setItemCount(j3);
                    ((AccessibilityRecord)e4).setFromIndex(f6.k);
                    final Iterator iterator5 = f6.T.iterator();
                    int n9 = 0;
                    while (iterator5.hasNext()) {
                        if (!((f)iterator5.next()).D(14)) {
                            ++n9;
                        }
                    }
                    ((AccessibilityRecord)e4).setToIndex(f6.k + n9 - 1);
                }
                g.i(e4);
            }
            if (f6.D(16)) {
                final String p3 = f6.p;
                if (p3 != null || f6.L != null) {
                    if (p3 == null || !p3.equals((Object)f6.L)) {
                        final AccessibilityEvent e5 = g.e(f6.b, 2048);
                        e5.setContentChangeTypes(1);
                        g.i(e5);
                    }
                }
            }
            final f i4 = g.i;
            if (i4 != null && i4.b == f6.b) {
                if ((f6.F & (long)L.e(3)) == 0x0L) {
                    if (f6.D(3)) {
                        final AccessibilityEvent e6 = g.e(f6.b, 4);
                        ((AccessibilityRecord)e6).getText().add((Object)f6.p);
                        g.i(e6);
                    }
                }
            }
            final f n10 = g.n;
            Label_2042: {
                if (n10 != null) {
                    final int b3 = n10.b;
                    final int b4 = f6.b;
                    if (b3 == b4) {
                        final f o = g.o;
                        if (o == null || o.b != b3) {
                            g.o = n10;
                            g.i(g.e(b4, 8));
                            break Label_2042;
                        }
                    }
                }
                if (n10 == null) {
                    g.o = null;
                }
            }
            final f n11 = g.n;
            if (n11 != null && n11.b == f6.b && (f6.F & (long)L.e(5)) != 0x0L && f6.D(5)) {
                final f i5 = g.i;
                if (i5 != null && i5.b != g.n.b) {
                    continue;
                }
                String k2 = f6.K;
                String s2 = "";
                if (k2 == null) {
                    k2 = "";
                }
                final String r = f6.r;
                if (r != null) {
                    s2 = r;
                }
                final AccessibilityEvent e7 = g.e(f6.b, 16);
                ((AccessibilityRecord)e7).setBeforeText((CharSequence)k2);
                ((AccessibilityRecord)e7).getText().add((Object)s2);
                int fromIndex;
                for (fromIndex = 0; fromIndex < k2.length() && fromIndex < s2.length() && k2.charAt(fromIndex) == s2.charAt(fromIndex); ++fromIndex) {}
                AccessibilityEvent accessibilityEvent;
                if (fromIndex >= k2.length() && fromIndex >= s2.length()) {
                    accessibilityEvent = null;
                }
                else {
                    ((AccessibilityRecord)e7).setFromIndex(fromIndex);
                    int n12;
                    int n13;
                    for (n12 = k2.length() - 1, n13 = s2.length() - 1; n12 >= fromIndex && n13 >= fromIndex && k2.charAt(n12) == s2.charAt(n13); --n12, --n13) {}
                    ((AccessibilityRecord)e7).setRemovedCount(n12 - fromIndex + 1);
                    ((AccessibilityRecord)e7).setAddedCount(n13 - fromIndex + 1);
                    accessibilityEvent = e7;
                }
                if (accessibilityEvent != null) {
                    g.i(accessibilityEvent);
                }
                if (f6.H == f6.g && f6.I == f6.h) {
                    continue;
                }
                final AccessibilityEvent e8 = g.e(f6.b, 8192);
                ((AccessibilityRecord)e8).getText().add((Object)s2);
                ((AccessibilityRecord)e8).setFromIndex(f6.g);
                ((AccessibilityRecord)e8).setToIndex(f6.h);
                ((AccessibilityRecord)e8).setItemCount(s2.length());
                g.i(e8);
            }
        }
    }
}
