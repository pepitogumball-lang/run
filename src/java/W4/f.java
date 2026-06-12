package w4;

import java.util.Iterator;
import java.util.Map$Entry;
import java.util.HashMap;

public final class f
{
    public static volatile f b;
    public final HashMap a;
    
    public f(final int n) {
        switch (n) {
            default: {
                this.a = new HashMap();
                return;
            }
            case 1: {
                this.a = new HashMap();
            }
        }
    }
    
    public void a(final HashMap hashMap) {
        for (final Map$Entry map$Entry : hashMap.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            final HashMap a = this.a;
            if (value == null) {
                a.put((Object)s, (Object)null);
            }
            else {
                final Class<? extends boolean[]> class1 = ((boolean[])value).getClass();
                if (class1 != Boolean.class && class1 != Byte.class && class1 != Integer.class && class1 != Long.class && class1 != Float.class && class1 != Double.class && class1 != String.class && class1 != Boolean[].class && class1 != Byte[].class && class1 != Integer[].class && class1 != Long[].class && class1 != Float[].class && class1 != Double[].class && class1 != String[].class) {
                    final int n = 0;
                    int i = 0;
                    final int n2 = 0;
                    final int n3 = 0;
                    final int n4 = 0;
                    final int n5 = 0;
                    if (class1 == boolean[].class) {
                        final boolean[] array = (boolean[])value;
                        final String b = R0.f.b;
                        final Boolean[] array2 = new Boolean[array.length];
                        for (int j = n5; j < array.length; ++j) {
                            array2[j] = array[j];
                        }
                        a.put((Object)s, (Object)array2);
                    }
                    else if (class1 == byte[].class) {
                        final byte[] array3 = (byte[])value;
                        final String b2 = R0.f.b;
                        final Byte[] array4 = new Byte[array3.length];
                        for (int k = n; k < array3.length; ++k) {
                            array4[k] = array3[k];
                        }
                        a.put((Object)s, (Object)array4);
                    }
                    else if (class1 == int[].class) {
                        final int[] array5 = (int[])value;
                        final String b3 = R0.f.b;
                        final Integer[] array6 = new Integer[array5.length];
                        while (i < array5.length) {
                            array6[i] = array5[i];
                            ++i;
                        }
                        a.put((Object)s, (Object)array6);
                    }
                    else if (class1 == long[].class) {
                        final long[] array7 = (long[])value;
                        final String b4 = R0.f.b;
                        final Long[] array8 = new Long[array7.length];
                        for (int l = n2; l < array7.length; ++l) {
                            array8[l] = array7[l];
                        }
                        a.put((Object)s, (Object)array8);
                    }
                    else if (class1 == float[].class) {
                        final float[] array9 = (float[])value;
                        final String b5 = R0.f.b;
                        final Float[] array10 = new Float[array9.length];
                        for (int n6 = n3; n6 < array9.length; ++n6) {
                            array10[n6] = array9[n6];
                        }
                        a.put((Object)s, (Object)array10);
                    }
                    else {
                        if (class1 != double[].class) {
                            final StringBuilder sb = new StringBuilder("Key ");
                            sb.append(s);
                            sb.append(" has invalid type ");
                            sb.append((Object)class1);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        final double[] array11 = (double[])value;
                        final String b6 = R0.f.b;
                        final Double[] array12 = new Double[array11.length];
                        for (int n7 = n4; n7 < array11.length; ++n7) {
                            array12[n7] = array11[n7];
                        }
                        a.put((Object)s, (Object)array12);
                    }
                }
                else {
                    a.put((Object)s, value);
                }
            }
        }
    }
}
