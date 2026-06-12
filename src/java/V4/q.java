package v4;

import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Iterator;
import h1.w;
import v.e;
import b4.i;
import java.util.ArrayList;
import com.google.android.gms.internal.ads.Tl;
import android.view.KeyEvent;
import H4.a;
import R0.m;
import java.util.HashMap;
import F4.f;

public final class q implements r
{
    public final f C;
    public final HashMap D;
    public final HashMap E;
    public final m F;
    
    public q(final f c) {
        this.D = new HashMap();
        final HashMap e = new HashMap();
        this.E = e;
        this.F = new m(12);
        this.C = c;
        final a a = t.a;
        final Object o = new Object();
        ((s)o).a = false;
        final s s = (new s[] { (s)o })[0];
        s.getClass();
        e.put((Object)4294967556L, (Object)s);
    }
    
    public final void a(final KeyEvent keyEvent, final Tl tl) {
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            final long n = keyEvent.getScanCode();
            Long n2;
            if (n == 0L) {
                n2 = (((long)keyEvent.getKeyCode() & 0xFFFFFFFFL) | 0x1100000000L);
            }
            else {
                n2 = (Long)((HashMap)t.a).get((Object)n);
                if (n2 == null) {
                    n2 = (((long)keyEvent.getScanCode() & 0xFFFFFFFFL) | 0x1100000000L);
                }
            }
            Long value = (Long)((HashMap)t.b).get((Object)(long)keyEvent.getKeyCode());
            if (value == null) {
                value = (((long)keyEvent.getKeyCode() & 0xFFFFFFFFL) | 0x1100000000L);
            }
            final ArrayList list = new ArrayList();
            final w[] c = t.c;
            final int length = c.length;
            int n3 = 0;
            while (true) {
                final HashMap d = this.D;
                final int n4 = 2;
                if (n3 >= length) {
                    final HashMap hashMap = d;
                    final HashMap e = this.E;
                    for (final s s : e.values()) {
                        final int metaState = keyEvent.getMetaState();
                        s.getClass();
                        final boolean b = (metaState & 0x100000) != 0x0;
                        final long longValue = value;
                        final Long value2 = 4294967556L;
                        if (4294967556L != longValue && s.a != b) {
                            final boolean containsKey = hashMap.containsKey((Object)458809L);
                            if (!containsKey) {
                                s.a ^= true;
                            }
                            this.c(containsKey ^ true, value2, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                s.a ^= true;
                            }
                            this.c(containsKey, value2, 458809L, keyEvent.getEventTime());
                        }
                    }
                    final int action = keyEvent.getAction();
                    boolean b2 = false;
                    Long n6 = null;
                    int b3 = 0;
                    String string = null;
                    while (true) {
                        Label_0957: {
                            if (action == 0) {
                                b2 = true;
                                break Label_0957;
                            }
                            if (action == 1) {
                                b2 = false;
                                break Label_0957;
                            }
                            break;
                        }
                        final Long n5 = (Long)hashMap.get((Object)n2);
                        n6 = null;
                        if (b2) {
                            Label_1017: {
                                if (n5 != null) {
                                    if (keyEvent.getRepeatCount() > 0) {
                                        b3 = 3;
                                        break Label_1017;
                                    }
                                    this.c(false, n5, n2, keyEvent.getEventTime());
                                }
                                b3 = 1;
                            }
                            final char charValue = this.F.b(keyEvent.getUnicodeChar());
                            if (charValue != '\0') {
                                final StringBuilder sb = new StringBuilder("");
                                sb.append(charValue);
                                string = sb.toString();
                            }
                            else {
                                string = null;
                            }
                        }
                        else {
                            if (n5 == null) {
                                continue;
                            }
                            b3 = 2;
                            string = null;
                        }
                        break;
                    }
                    if (b3 != 3) {
                        if (b2) {
                            n6 = value;
                        }
                        this.d(n2, n6);
                    }
                    if (b3 == 1) {
                        final s s2 = (s)e.get((Object)value);
                        if (s2 != null) {
                            s2.a ^= true;
                        }
                    }
                    final Object o = new Object();
                    final int source = keyEvent.getSource();
                    if (source != 513) {
                        if (source != 1025) {
                            if (source != 16777232) {
                                if (source != 33554433) {
                                    ((n)o).f = 1;
                                }
                                else {
                                    ((n)o).f = 5;
                                }
                            }
                            else {
                                ((n)o).f = 4;
                            }
                        }
                        else {
                            ((n)o).f = 3;
                        }
                    }
                    else {
                        ((n)o).f = 2;
                    }
                    ((n)o).a = keyEvent.getEventTime();
                    ((n)o).b = b3;
                    ((n)o).d = value;
                    ((n)o).c = n2;
                    ((n)o).g = string;
                    ((n)o).e = false;
                    this.b((n)o, tl);
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        ((Runnable)iterator2.next()).run();
                    }
                    return;
                }
                final w w = c[n3];
                final boolean b4 = (keyEvent.getMetaState() & w.C) != 0x0;
                final long longValue2 = value;
                final long longValue3 = n2;
                final i[] array = (i[])w.D;
                final boolean[] array2 = new boolean[2];
                final Boolean[] array3 = new Boolean[2];
                int i = 0;
                int n7 = 0;
                final int n8 = n3;
                int n9;
                for (n9 = n4; i < n9; ++i, n9 = 2) {
                    final i j = array[i];
                    final boolean containsKey2 = d.containsKey((Object)j.a);
                    array2[i] = containsKey2;
                    if (j.b == longValue2) {
                        final boolean b5 = keyEvent.getRepeatCount() > 0;
                        final int action2 = keyEvent.getAction();
                        int n10;
                        if (action2 != 0) {
                            if (action2 != 1) {
                                throw new AssertionError((Object)"Unexpected event type");
                            }
                            n10 = 2;
                        }
                        else if (b5) {
                            n10 = 3;
                        }
                        else {
                            n10 = 1;
                        }
                        final int d2 = e.d(n10);
                        if (d2 != 0) {
                            if (d2 == 1) {
                                array3[i] = array2[i];
                                continue;
                            }
                            if (d2 != 2) {
                                continue;
                            }
                            if (!b4) {
                                list.add((Object)new p(this, j, longValue3, keyEvent, 1));
                            }
                            array3[i] = array2[i];
                        }
                        else {
                            array3[i] = Boolean.FALSE;
                            if (!b4) {
                                list.add((Object)new p(this, j, longValue3, keyEvent, 0));
                            }
                        }
                        n7 = 1;
                    }
                    else if (n7 == 0 && !containsKey2) {
                        n7 = 0;
                    }
                    else {
                        n7 = 1;
                    }
                }
                if (b4) {
                    final int n11 = 0;
                    int n12 = n7;
                    for (int k = n11; k < n9; ++k) {
                        if (array3[k] == null) {
                            if (n12 != 0) {
                                array3[k] = array2[k];
                            }
                            else {
                                array3[k] = Boolean.TRUE;
                                n12 = 1;
                            }
                        }
                    }
                    if (n12 == 0) {
                        array3[0] = Boolean.TRUE;
                    }
                }
                else {
                    for (int l = 0; l < n9; ++l) {
                        if (array3[l] == null) {
                            array3[l] = Boolean.FALSE;
                        }
                    }
                }
                for (int n13 = 0; n13 < n9; ++n13) {
                    if (array2[n13] != array3[n13]) {
                        final i m = array[n13];
                        this.c(array3[n13], m.b, m.a, keyEvent.getEventTime());
                    }
                }
                n3 = n8 + 1;
            }
        }
        this.c(true, 0L, 0L, 0L);
        tl.c(true);
    }
    
    public final void b(final n n, final Tl tl) {
        byte[] bytes = null;
        Object o;
        if (tl == null) {
            o = null;
        }
        else {
            o = new o(tl);
        }
        try {
            final String g = n.g;
            if (g != null) {
                bytes = g.getBytes("UTF-8");
            }
            int length;
            if (bytes == null) {
                length = 0;
            }
            else {
                length = bytes.length;
            }
            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long)length);
            allocateDirect.putLong(n.a);
            final int b = n.b;
            long n2;
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        throw null;
                    }
                    n2 = 2L;
                }
                else {
                    n2 = 1L;
                }
            }
            else {
                n2 = 0L;
            }
            allocateDirect.putLong(n2);
            allocateDirect.putLong(n.c);
            allocateDirect.putLong(n.d);
            long n3;
            if (n.e) {
                n3 = 1L;
            }
            else {
                n3 = 0L;
            }
            allocateDirect.putLong(n3);
            final int f = n.f;
            long n4;
            if (f != 1) {
                if (f != 2) {
                    if (f != 3) {
                        if (f != 4) {
                            if (f != 5) {
                                throw null;
                            }
                            n4 = 4L;
                        }
                        else {
                            n4 = 3L;
                        }
                    }
                    else {
                        n4 = 2L;
                    }
                }
                else {
                    n4 = 1L;
                }
            }
            else {
                n4 = 0L;
            }
            allocateDirect.putLong(n4);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            this.C.j("flutter/keydata", allocateDirect, (F4.e)o);
        }
        catch (final UnsupportedEncodingException ex) {
            throw new AssertionError((Object)"UTF-8 not supported");
        }
    }
    
    public final void c(final boolean b, Long n, final Long n2, final long a) {
        final Object o = new Object();
        ((n)o).a = a;
        int b2;
        if (b) {
            b2 = 1;
        }
        else {
            b2 = 2;
        }
        ((n)o).b = b2;
        ((n)o).d = n;
        ((n)o).c = n2;
        ((n)o).g = null;
        ((n)o).e = true;
        ((n)o).f = 1;
        if (n2 != 0L && n != 0L) {
            if (!b) {
                n = null;
            }
            this.d(n2, n);
        }
        this.b((n)o, null);
    }
    
    public final void d(final Long n, final Long n2) {
        final HashMap d = this.D;
        if (n2 != null) {
            if (d.put((Object)n, (Object)n2) != null) {
                throw new AssertionError((Object)"The key was not empty");
            }
        }
        else if (d.remove((Object)n) == null) {
            throw new AssertionError((Object)"The key was empty");
        }
    }
}
