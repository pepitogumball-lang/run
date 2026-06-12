package z3;

import x3.a;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Collection;
import android.util.Base64;
import x3.c;
import java.io.Writer;
import A3.f;
import java.util.HashMap;
import android.util.JsonWriter;
import x3.g;
import x3.e;

public final class d implements e, g
{
    public final boolean a;
    public final JsonWriter b;
    public final HashMap c;
    public final HashMap d;
    public final f e;
    public final boolean f;
    
    public d(final Writer writer, final HashMap c, final HashMap d, final f e, final boolean f) {
        this.a = true;
        this.b = new JsonWriter(writer);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final e a(final c c, final double n) {
        final String a = c.a;
        this.j();
        final JsonWriter b = this.b;
        b.name(a);
        this.j();
        b.value(n);
        return (e)this;
    }
    
    public final e b(final c c, final int n) {
        final String a = c.a;
        this.j();
        final JsonWriter b = this.b;
        b.name(a);
        this.j();
        b.value((long)n);
        return (e)this;
    }
    
    public final e c(final c c, final long n) {
        final String a = c.a;
        this.j();
        final JsonWriter b = this.b;
        b.name(a);
        this.j();
        b.value(n);
        return (e)this;
    }
    
    public final g d(final String s) {
        this.j();
        this.b.value(s);
        return (g)this;
    }
    
    public final g e(final boolean b) {
        this.j();
        this.b.value(b);
        return (g)this;
    }
    
    public final e f(final c c, final boolean b) {
        final String a = c.a;
        this.j();
        final JsonWriter b2 = this.b;
        b2.name(a);
        this.j();
        b2.value(b);
        return (e)this;
    }
    
    public final e g(final c c, final Object o) {
        this.i(c.a, o);
        return (e)this;
    }
    
    public final d h(Object key) {
        final JsonWriter b = this.b;
        if (key == null) {
            b.nullValue();
            return this;
        }
        if (key instanceof Number) {
            b.value((Number)key);
            return this;
        }
        if (key.getClass().isArray()) {
            if (key instanceof byte[]) {
                final byte[] array = (byte[])key;
                this.j();
                b.value(Base64.encodeToString(array, 2));
                return this;
            }
            b.beginArray();
            final boolean b2 = key instanceof int[];
            int i = 0;
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            final int n4 = 0;
            final int n5 = 0;
            if (b2) {
                final int[] array2 = (int[])key;
                for (int length = array2.length, j = n5; j < length; ++j) {
                    b.value((long)array2[j]);
                }
            }
            else if (key instanceof long[]) {
                for (long[] array3 = (long[])key; i < array3.length; ++i) {
                    final long n6 = array3[i];
                    this.j();
                    b.value(n6);
                }
            }
            else if (key instanceof double[]) {
                final double[] array4 = (double[])key;
                for (int length2 = array4.length, k = n; k < length2; ++k) {
                    b.value(array4[k]);
                }
            }
            else if (key instanceof boolean[]) {
                final boolean[] array5 = (boolean[])key;
                for (int length3 = array5.length, l = n2; l < length3; ++l) {
                    b.value(array5[l]);
                }
            }
            else if (key instanceof Number[]) {
                final Number[] array6 = (Number[])key;
                for (int length4 = array6.length, n7 = n3; n7 < length4; ++n7) {
                    this.h(array6[n7]);
                }
            }
            else {
                final Object[] array7 = (Object[])key;
                for (int length5 = array7.length, n8 = n4; n8 < length5; ++n8) {
                    this.h(array7[n8]);
                }
            }
            b.endArray();
            return this;
        }
        else {
            if (key instanceof Collection) {
                final Collection collection = (Collection)key;
                b.beginArray();
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    this.h(iterator.next());
                }
                b.endArray();
                return this;
            }
            if (key instanceof Map) {
                final Map map = (Map)key;
                b.beginObject();
                for (final Map$Entry map$Entry : map.entrySet()) {
                    key = map$Entry.getKey();
                    try {
                        this.i((String)key, map$Entry.getValue());
                        continue;
                    }
                    catch (final ClassCastException ex) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[] { key, key.getClass() }), (Throwable)ex);
                    }
                    break;
                }
                b.endObject();
                return this;
            }
            final x3.d d = (x3.d)this.c.get((Object)key.getClass());
            if (d != null) {
                b.beginObject();
                ((a)d).a(key, (Object)this);
                b.endObject();
                return this;
            }
            final x3.f f = (x3.f)this.d.get((Object)key.getClass());
            if (f != null) {
                ((a)f).a(key, (Object)this);
                return this;
            }
            if (key instanceof Enum) {
                if (key instanceof z3.e) {
                    final int a = ((z3.e)key).a();
                    this.j();
                    b.value((long)a);
                }
                else {
                    final String name = ((Enum)key).name();
                    this.j();
                    b.value(name);
                }
                return this;
            }
            b.beginObject();
            this.e.a(key, (Object)this);
            throw null;
        }
    }
    
    public final d i(final String s, final Object o) {
        final boolean f = this.f;
        final JsonWriter b = this.b;
        if (f) {
            if (o != null) {
                this.j();
                b.name(s);
                this.h(o);
            }
            return this;
        }
        this.j();
        b.name(s);
        if (o == null) {
            b.nullValue();
        }
        else {
            this.h(o);
        }
        return this;
    }
    
    public final void j() {
        if (this.a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
