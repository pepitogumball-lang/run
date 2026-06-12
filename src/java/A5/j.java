package A5;

import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import d5.l;
import u5.b;
import w5.a0;
import w5.t;
import w5.Q;
import c5.e;
import c5.h;
import f5.a;
import m5.p;
import e5.i;
import z5.d;
import g5.c;

public final class j extends c implements d
{
    public final d F;
    public final i G;
    public final int H;
    public i I;
    public e5.d J;
    
    public j(final d f, final i g) {
        super(g.C, (i)e5.j.C);
        this.F = f;
        this.G = g;
        this.H = ((Number)g.f(0, A5.i.D)).intValue();
    }
    
    @Override
    public final Object a(Object o, final e5.d d) {
        try {
            o = this.o(d, o);
            if (o == f5.a.C) {
                return o;
            }
            return h.a;
        }
        finally {
            final Throwable t;
            this.I = new f(d.getContext(), t);
        }
    }
    
    @Override
    public final g5.d e() {
        final e5.d j = this.J;
        g5.d d;
        if (j instanceof g5.d) {
            d = (g5.d)j;
        }
        else {
            d = null;
        }
        return d;
    }
    
    @Override
    public final i getContext() {
        Object o;
        if ((o = this.I) == null) {
            o = e5.j.C;
        }
        return (i)o;
    }
    
    @Override
    public final StackTraceElement k() {
        return null;
    }
    
    @Override
    public final Object l(final Object o) {
        final Throwable a = e.a(o);
        if (a != null) {
            this.I = new f(this.getContext(), a);
        }
        final e5.d j = this.J;
        if (j != null) {
            j.h(o);
        }
        return f5.a.C;
    }
    
    public final Object o(final e5.d j, Object o) {
        final i context = j.getContext();
        final Q q = (Q)context.i((e5.h)t.D);
        if (q != null && !q.a()) {
            throw ((a0)q).y();
        }
        final i i = this.I;
        if (i != context) {
            final boolean b = i instanceof f;
            final int n = 0;
            if (b) {
                final f f = (f)i;
                final StringBuilder sb = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                sb.append((Object)f.C);
                sb.append(", but then emission attempt of value '");
                sb.append(o);
                sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                final String string = sb.toString();
                n5.h.e("<this>", (Object)string);
                final b b2 = new b(string);
                Object o2;
                if (!((Iterator)b2).hasNext()) {
                    o2 = l.C;
                }
                else {
                    final Object next = ((Iterator)b2).next();
                    if (!((Iterator)b2).hasNext()) {
                        o2 = com.google.android.gms.internal.auth.h.t(next);
                    }
                    else {
                        o2 = new ArrayList();
                        ((ArrayList)o2).add(next);
                        while (((Iterator)b2).hasNext()) {
                            ((ArrayList)o2).add(((Iterator)b2).next());
                        }
                    }
                }
                final Iterable iterable = (Iterable)o2;
                o = new ArrayList();
                for (final Object next2 : iterable) {
                    if (!u5.i.U((CharSequence)next2)) {
                        ((ArrayList)o).add(next2);
                    }
                }
                final ArrayList list = new ArrayList(d5.f.E((Iterable)o));
            Label_0310:
                for (final String s : o) {
                    while (true) {
                        for (int length = s.length(), k = 0; k < length; ++k) {
                            final char char1 = s.charAt(k);
                            if (!Character.isWhitespace(char1)) {
                                final int n2 = k;
                                if (!Character.isSpaceChar(char1)) {
                                    int length2;
                                    if ((length2 = n2) == -1) {
                                        length2 = s.length();
                                    }
                                    list.add((Object)length2);
                                    continue Label_0310;
                                }
                            }
                        }
                        final int n2 = -1;
                        continue;
                    }
                }
                final Iterator iterator3 = list.iterator();
                Object o3;
                if (!iterator3.hasNext()) {
                    o3 = null;
                }
                else {
                    Comparable comparable = (Comparable)iterator3.next();
                    while (true) {
                        o3 = comparable;
                        if (!iterator3.hasNext()) {
                            break;
                        }
                        final Comparable comparable2 = (Comparable)iterator3.next();
                        if (comparable.compareTo((Object)comparable2) <= 0) {
                            continue;
                        }
                        comparable = comparable2;
                    }
                }
                final Integer n3 = (Integer)o3;
                int intValue;
                if (n3 != null) {
                    intValue = n3;
                }
                else {
                    intValue = 0;
                }
                final int length3 = string.length();
                ((List)o2).size();
                final int size = ((List)o2).size();
                o = new ArrayList();
                final Iterator iterator4 = iterable.iterator();
                int n4 = n;
                while (iterator4.hasNext()) {
                    final Object next3 = iterator4.next();
                    if (n4 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    final String s2 = (String)next3;
                    Object substring;
                    if ((n4 == 0 || n4 == size - 1) && u5.i.U((CharSequence)s2)) {
                        substring = null;
                    }
                    else {
                        n5.h.e("<this>", (Object)s2);
                        if (intValue < 0) {
                            throw new IllegalArgumentException(Y3.a.j(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = s2.length();
                        if (intValue <= length4) {
                            length4 = intValue;
                        }
                        substring = s2.substring(length4);
                        n5.h.d("substring(...)", substring);
                    }
                    if (substring != null) {
                        ((ArrayList)o).add(substring);
                    }
                    ++n4;
                }
                final StringBuilder sb2 = new StringBuilder(length3);
                d5.d.H((Collection)o, sb2, (CharSequence)"\n", (CharSequence)"", (CharSequence)"", -1, (CharSequence)"...", (m5.l)null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number)context.f(0, new m(this))).intValue() != this.H) {
                final StringBuilder sb3 = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
                sb3.append((Object)this.G);
                sb3.append(",\n\t\tbut emission happened in ");
                sb3.append((Object)context);
                sb3.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(sb3.toString().toString());
            }
            this.I = context;
        }
        this.J = j;
        final k a = A5.l.a;
        final d f2 = this.F;
        n5.h.c("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>", (Object)f2);
        a.getClass();
        final Object a2 = f2.a(o, this);
        if (!n5.h.a(a2, (Object)f5.a.C)) {
            this.J = null;
        }
        return a2;
    }
}
