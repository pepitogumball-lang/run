package A;

import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import java.util.Iterator;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Arrays;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import android.util.SparseIntArray;

public final class o
{
    public static final int[] d;
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a;
    public final boolean b;
    public final HashMap c;
    
    static {
        d = new int[] { 0, 4, 8 };
        final SparseIntArray sparseIntArray = e = new SparseIntArray();
        final SparseIntArray sparseIntArray2 = f = new SparseIntArray();
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }
    
    public o() {
        this.a = new HashMap();
        this.b = true;
        this.c = new HashMap();
    }
    
    public static int[] b(final a a, final String s) {
        final String[] split = s.split(",");
        final Context context = a.getContext();
        final int[] array = new int[split.length];
        int i;
        int n;
        for (i = 0, n = 0; i < split.length; ++i, ++n) {
            final String trim = split[i].trim();
            final Integer n2 = null;
            int int1;
            try {
                int1 = r.class.getField(trim).getInt((Object)null);
            }
            catch (final Exception ex) {
                int1 = 0;
            }
            int identifier = int1;
            if (int1 == 0) {
                identifier = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            int intValue;
            if ((intValue = identifier) == 0) {
                intValue = identifier;
                if (a.isInEditMode()) {
                    intValue = identifier;
                    if (a.getParent() instanceof ConstraintLayout) {
                        final ConstraintLayout constraintLayout = (ConstraintLayout)a.getParent();
                        Object value;
                        if (trim != null) {
                            final HashMap o = constraintLayout.O;
                            value = n2;
                            if (o != null) {
                                value = n2;
                                if (o.containsKey((Object)trim)) {
                                    value = constraintLayout.O.get((Object)trim);
                                }
                            }
                        }
                        else {
                            constraintLayout.getClass();
                            value = n2;
                        }
                        intValue = identifier;
                        if (value != null) {
                            intValue = identifier;
                            if (value instanceof Integer) {
                                intValue = (int)value;
                            }
                        }
                    }
                }
            }
            array[n] = intValue;
        }
        int[] copy = array;
        if (n != split.length) {
            copy = Arrays.copyOf(array, n);
        }
        return copy;
    }
    
    public static j c(final Context context, final AttributeSet set, final boolean b) {
        final j j = new j();
        int[] array;
        if (b) {
            array = s.c;
        }
        else {
            array = s.a;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, array);
        final int[] d = o.d;
        final SparseIntArray e = o.e;
        final m b2 = j.b;
        final String[] a = w.a.a;
        final n e2 = j.e;
        final l c = j.c;
        final k d2 = j.d;
        final String s = "Unknown attribute 0x";
        final String s2 = "ConstraintSet";
        if (b) {
            final int indexCount = obtainStyledAttributes.getIndexCount();
            final Object o = new Object();
            ((i)o).a = new int[10];
            ((i)o).b = new int[10];
            ((i)o).c = 0;
            ((i)o).d = new int[10];
            ((i)o).e = new float[10];
            ((i)o).f = 0;
            ((i)o).g = new int[5];
            ((i)o).h = new String[5];
            ((i)o).i = 0;
            ((i)o).j = new int[4];
            ((i)o).k = new boolean[4];
            ((i)o).l = 0;
            c.getClass();
            d2.getClass();
            e2.getClass();
            for (int i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                switch (A.o.f.get(index)) {
                    default: {
                        final StringBuilder sb = new StringBuilder(s);
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(e.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    }
                    case 99: {
                        ((i)o).d(99, obtainStyledAttributes.getBoolean(index, d2.g));
                        break;
                    }
                    case 98: {
                        final int u = z.a.U;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                        j.a = obtainStyledAttributes.getResourceId(index, j.a);
                        break;
                    }
                    case 97: {
                        ((i)o).b(97, obtainStyledAttributes.getInt(index, d2.o0));
                        break;
                    }
                    case 96: {
                        f(o, obtainStyledAttributes, index, 1);
                        break;
                    }
                    case 95: {
                        f(o, obtainStyledAttributes, index, 0);
                        break;
                    }
                    case 94: {
                        ((i)o).b(94, obtainStyledAttributes.getDimensionPixelSize(index, d2.S));
                        break;
                    }
                    case 93: {
                        ((i)o).b(93, obtainStyledAttributes.getDimensionPixelSize(index, d2.L));
                        break;
                    }
                    case 87: {
                        final StringBuilder sb2 = new StringBuilder("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(e.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    }
                    case 86: {
                        final int type = obtainStyledAttributes.peekValue(index).type;
                        if (type == 1) {
                            ((i)o).b(89, c.i = obtainStyledAttributes.getResourceId(index, -1));
                            if (c.i != -1) {
                                ((i)o).b(88, -2);
                                break;
                            }
                            break;
                        }
                        else {
                            if (type != 3) {
                                ((i)o).b(88, obtainStyledAttributes.getInteger(index, c.i));
                                break;
                            }
                            ((i)o).c(90, c.h = obtainStyledAttributes.getString(index));
                            if (c.h.indexOf("/") > 0) {
                                ((i)o).b(89, c.i = obtainStyledAttributes.getResourceId(index, -1));
                                ((i)o).b(88, -2);
                                break;
                            }
                            ((i)o).b(88, -1);
                            break;
                        }
                        break;
                    }
                    case 85: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, c.f), 85);
                        break;
                    }
                    case 84: {
                        ((i)o).b(84, obtainStyledAttributes.getInteger(index, c.g));
                        break;
                    }
                    case 83: {
                        ((i)o).b(83, e(obtainStyledAttributes, index, e2.h));
                        break;
                    }
                    case 82: {
                        ((i)o).b(82, obtainStyledAttributes.getInteger(index, c.b));
                        break;
                    }
                    case 81: {
                        ((i)o).d(81, obtainStyledAttributes.getBoolean(index, d2.m0));
                        break;
                    }
                    case 80: {
                        ((i)o).d(80, obtainStyledAttributes.getBoolean(index, d2.l0));
                        break;
                    }
                    case 79: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, c.d), 79);
                        break;
                    }
                    case 78: {
                        ((i)o).b(78, obtainStyledAttributes.getInt(index, b2.b));
                        break;
                    }
                    case 77: {
                        ((i)o).c(77, obtainStyledAttributes.getString(index));
                        break;
                    }
                    case 76: {
                        ((i)o).b(76, obtainStyledAttributes.getInt(index, c.c));
                        break;
                    }
                    case 75: {
                        ((i)o).d(75, obtainStyledAttributes.getBoolean(index, d2.n0));
                        break;
                    }
                    case 74: {
                        ((i)o).c(74, obtainStyledAttributes.getString(index));
                        break;
                    }
                    case 73: {
                        ((i)o).b(73, obtainStyledAttributes.getDimensionPixelSize(index, d2.g0));
                        break;
                    }
                    case 72: {
                        ((i)o).b(72, obtainStyledAttributes.getInt(index, d2.f0));
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 70: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    }
                    case 69: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    }
                    case 68: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, b2.d), 68);
                        break;
                    }
                    case 67: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, c.e), 67);
                        break;
                    }
                    case 66: {
                        ((i)o).b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    }
                    case 65: {
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            ((i)o).c(65, obtainStyledAttributes.getString(index));
                            break;
                        }
                        ((i)o).c(65, a[obtainStyledAttributes.getInteger(index, 0)]);
                        break;
                    }
                    case 64: {
                        ((i)o).b(64, e(obtainStyledAttributes, index, c.a));
                        break;
                    }
                    case 63: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, d2.B), 63);
                        break;
                    }
                    case 62: {
                        ((i)o).b(62, obtainStyledAttributes.getDimensionPixelSize(index, d2.A));
                        break;
                    }
                    case 60: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, e2.a), 60);
                        break;
                    }
                    case 59: {
                        ((i)o).b(59, obtainStyledAttributes.getDimensionPixelSize(index, d2.c0));
                        break;
                    }
                    case 58: {
                        ((i)o).b(58, obtainStyledAttributes.getDimensionPixelSize(index, d2.b0));
                        break;
                    }
                    case 57: {
                        ((i)o).b(57, obtainStyledAttributes.getDimensionPixelSize(index, d2.a0));
                        break;
                    }
                    case 56: {
                        ((i)o).b(56, obtainStyledAttributes.getDimensionPixelSize(index, d2.Z));
                        break;
                    }
                    case 55: {
                        ((i)o).b(55, obtainStyledAttributes.getInt(index, d2.Y));
                        break;
                    }
                    case 54: {
                        ((i)o).b(54, obtainStyledAttributes.getInt(index, d2.X));
                        break;
                    }
                    case 53: {
                        ((i)o).a(obtainStyledAttributes.getDimension(index, e2.k), 53);
                        break;
                    }
                    case 52: {
                        ((i)o).a(obtainStyledAttributes.getDimension(index, e2.j), 52);
                        break;
                    }
                    case 51: {
                        ((i)o).a(obtainStyledAttributes.getDimension(index, e2.i), 51);
                        break;
                    }
                    case 50: {
                        ((i)o).a(obtainStyledAttributes.getDimension(index, e2.g), 50);
                        break;
                    }
                    case 49: {
                        ((i)o).a(obtainStyledAttributes.getDimension(index, e2.f), 49);
                        break;
                    }
                    case 48: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, e2.e), 48);
                        break;
                    }
                    case 47: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, e2.d), 47);
                        break;
                    }
                    case 46: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, e2.c), 46);
                        break;
                    }
                    case 45: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, e2.b), 45);
                        break;
                    }
                    case 44: {
                        ((i)o).d(44, true);
                        ((i)o).a(obtainStyledAttributes.getDimension(index, e2.m), 44);
                        break;
                    }
                    case 43: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, b2.c), 43);
                        break;
                    }
                    case 42: {
                        ((i)o).b(42, obtainStyledAttributes.getInt(index, d2.W));
                        break;
                    }
                    case 41: {
                        ((i)o).b(41, obtainStyledAttributes.getInt(index, d2.V));
                        break;
                    }
                    case 40: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, d2.T), 40);
                        break;
                    }
                    case 39: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, d2.U), 39);
                        break;
                    }
                    case 38: {
                        ((i)o).b(38, j.a = obtainStyledAttributes.getResourceId(index, j.a));
                        break;
                    }
                    case 37: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, d2.x), 37);
                        break;
                    }
                    case 34: {
                        ((i)o).b(34, obtainStyledAttributes.getDimensionPixelSize(index, d2.H));
                        break;
                    }
                    case 31: {
                        ((i)o).b(31, obtainStyledAttributes.getDimensionPixelSize(index, d2.K));
                        break;
                    }
                    case 28: {
                        ((i)o).b(28, obtainStyledAttributes.getDimensionPixelSize(index, d2.G));
                        break;
                    }
                    case 27: {
                        ((i)o).b(27, obtainStyledAttributes.getInt(index, d2.E));
                        break;
                    }
                    case 24: {
                        ((i)o).b(24, obtainStyledAttributes.getDimensionPixelSize(index, d2.F));
                        break;
                    }
                    case 23: {
                        ((i)o).b(23, obtainStyledAttributes.getLayoutDimension(index, d2.b));
                        break;
                    }
                    case 22: {
                        ((i)o).b(22, d[obtainStyledAttributes.getInt(index, b2.a)]);
                        break;
                    }
                    case 21: {
                        ((i)o).b(21, obtainStyledAttributes.getLayoutDimension(index, d2.c));
                        break;
                    }
                    case 20: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, d2.w), 20);
                        break;
                    }
                    case 19: {
                        ((i)o).a(obtainStyledAttributes.getFloat(index, d2.f), 19);
                        break;
                    }
                    case 18: {
                        ((i)o).b(18, obtainStyledAttributes.getDimensionPixelOffset(index, d2.e));
                        break;
                    }
                    case 17: {
                        ((i)o).b(17, obtainStyledAttributes.getDimensionPixelOffset(index, d2.d));
                        break;
                    }
                    case 16: {
                        ((i)o).b(16, obtainStyledAttributes.getDimensionPixelSize(index, d2.N));
                        break;
                    }
                    case 15: {
                        ((i)o).b(15, obtainStyledAttributes.getDimensionPixelSize(index, d2.R));
                        break;
                    }
                    case 14: {
                        ((i)o).b(14, obtainStyledAttributes.getDimensionPixelSize(index, d2.O));
                        break;
                    }
                    case 13: {
                        ((i)o).b(13, obtainStyledAttributes.getDimensionPixelSize(index, d2.M));
                        break;
                    }
                    case 12: {
                        ((i)o).b(12, obtainStyledAttributes.getDimensionPixelSize(index, d2.Q));
                        break;
                    }
                    case 11: {
                        ((i)o).b(11, obtainStyledAttributes.getDimensionPixelSize(index, d2.P));
                        break;
                    }
                    case 8: {
                        ((i)o).b(8, obtainStyledAttributes.getDimensionPixelSize(index, d2.J));
                        break;
                    }
                    case 7: {
                        ((i)o).b(7, obtainStyledAttributes.getDimensionPixelOffset(index, d2.D));
                        break;
                    }
                    case 6: {
                        ((i)o).b(6, obtainStyledAttributes.getDimensionPixelOffset(index, d2.C));
                        break;
                    }
                    case 5: {
                        ((i)o).c(5, obtainStyledAttributes.getString(index));
                        break;
                    }
                    case 2: {
                        ((i)o).b(2, obtainStyledAttributes.getDimensionPixelSize(index, d2.I));
                        break;
                    }
                }
            }
        }
        else {
            final String s3 = "CURRENTLY UNSUPPORTED";
            final String s4 = "Unknown attribute 0x";
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(), k = 0; k < indexCount2; ++k) {
                final int index2 = obtainStyledAttributes.getIndex(k);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    c.getClass();
                    d2.getClass();
                    e2.getClass();
                }
                switch (e.get(index2)) {
                    default: {
                        final StringBuilder sb3 = new StringBuilder(s4);
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(e.get(index2));
                        Log.w(s2, sb3.toString());
                        break;
                    }
                    case 97: {
                        d2.o0 = obtainStyledAttributes.getInt(index2, d2.o0);
                        break;
                    }
                    case 96: {
                        f(d2, obtainStyledAttributes, index2, 1);
                        break;
                    }
                    case 95: {
                        f(d2, obtainStyledAttributes, index2, 0);
                        break;
                    }
                    case 94: {
                        d2.S = obtainStyledAttributes.getDimensionPixelSize(index2, d2.S);
                        break;
                    }
                    case 93: {
                        d2.L = obtainStyledAttributes.getDimensionPixelSize(index2, d2.L);
                        break;
                    }
                    case 92: {
                        d2.r = e(obtainStyledAttributes, index2, d2.r);
                        break;
                    }
                    case 91: {
                        d2.q = e(obtainStyledAttributes, index2, d2.q);
                        break;
                    }
                    case 87: {
                        final StringBuilder sb4 = new StringBuilder("unused attribute 0x");
                        sb4.append(Integer.toHexString(index2));
                        sb4.append("   ");
                        sb4.append(e.get(index2));
                        Log.w(s2, sb4.toString());
                        break;
                    }
                    case 86: {
                        final int type2 = obtainStyledAttributes.peekValue(index2).type;
                        if (type2 == 1) {
                            c.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                        if (type2 != 3) {
                            obtainStyledAttributes.getInteger(index2, c.i);
                            break;
                        }
                        final String string = obtainStyledAttributes.getString(index2);
                        c.h = string;
                        if (string.indexOf("/") > 0) {
                            c.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                        break;
                    }
                    case 85: {
                        c.f = obtainStyledAttributes.getFloat(index2, c.f);
                        break;
                    }
                    case 84: {
                        c.g = obtainStyledAttributes.getInteger(index2, c.g);
                        break;
                    }
                    case 83: {
                        e2.h = e(obtainStyledAttributes, index2, e2.h);
                        break;
                    }
                    case 82: {
                        c.b = obtainStyledAttributes.getInteger(index2, c.b);
                        break;
                    }
                    case 81: {
                        d2.m0 = obtainStyledAttributes.getBoolean(index2, d2.m0);
                        break;
                    }
                    case 80: {
                        d2.l0 = obtainStyledAttributes.getBoolean(index2, d2.l0);
                        break;
                    }
                    case 79: {
                        c.d = obtainStyledAttributes.getFloat(index2, c.d);
                        break;
                    }
                    case 78: {
                        b2.b = obtainStyledAttributes.getInt(index2, b2.b);
                        break;
                    }
                    case 77: {
                        d2.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    }
                    case 76: {
                        c.c = obtainStyledAttributes.getInt(index2, c.c);
                        break;
                    }
                    case 75: {
                        d2.n0 = obtainStyledAttributes.getBoolean(index2, d2.n0);
                        break;
                    }
                    case 74: {
                        d2.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    }
                    case 73: {
                        d2.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, d2.g0);
                        break;
                    }
                    case 72: {
                        d2.f0 = obtainStyledAttributes.getInt(index2, d2.f0);
                        break;
                    }
                    case 71: {
                        Log.e(s2, s3);
                        break;
                    }
                    case 70: {
                        d2.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    }
                    case 69: {
                        d2.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    }
                    case 68: {
                        b2.d = obtainStyledAttributes.getFloat(index2, b2.d);
                        break;
                    }
                    case 67: {
                        c.e = obtainStyledAttributes.getFloat(index2, c.e);
                        break;
                    }
                    case 66: {
                        obtainStyledAttributes.getInt(index2, 0);
                        c.getClass();
                        break;
                    }
                    case 65: {
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            c.getClass();
                            break;
                        }
                        final String s5 = a[obtainStyledAttributes.getInteger(index2, 0)];
                        c.getClass();
                        break;
                    }
                    case 64: {
                        c.a = e(obtainStyledAttributes, index2, c.a);
                        break;
                    }
                    case 63: {
                        d2.B = obtainStyledAttributes.getFloat(index2, d2.B);
                        break;
                    }
                    case 62: {
                        d2.A = obtainStyledAttributes.getDimensionPixelSize(index2, d2.A);
                        break;
                    }
                    case 61: {
                        d2.z = e(obtainStyledAttributes, index2, d2.z);
                        break;
                    }
                    case 60: {
                        e2.a = obtainStyledAttributes.getFloat(index2, e2.a);
                        break;
                    }
                    case 59: {
                        d2.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, d2.c0);
                        break;
                    }
                    case 58: {
                        d2.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, d2.b0);
                        break;
                    }
                    case 57: {
                        d2.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, d2.a0);
                        break;
                    }
                    case 56: {
                        d2.Z = obtainStyledAttributes.getDimensionPixelSize(index2, d2.Z);
                        break;
                    }
                    case 55: {
                        d2.Y = obtainStyledAttributes.getInt(index2, d2.Y);
                        break;
                    }
                    case 54: {
                        d2.X = obtainStyledAttributes.getInt(index2, d2.X);
                        break;
                    }
                    case 53: {
                        e2.k = obtainStyledAttributes.getDimension(index2, e2.k);
                        break;
                    }
                    case 52: {
                        e2.j = obtainStyledAttributes.getDimension(index2, e2.j);
                        break;
                    }
                    case 51: {
                        e2.i = obtainStyledAttributes.getDimension(index2, e2.i);
                        break;
                    }
                    case 50: {
                        e2.g = obtainStyledAttributes.getDimension(index2, e2.g);
                        break;
                    }
                    case 49: {
                        e2.f = obtainStyledAttributes.getDimension(index2, e2.f);
                        break;
                    }
                    case 48: {
                        e2.e = obtainStyledAttributes.getFloat(index2, e2.e);
                        break;
                    }
                    case 47: {
                        e2.d = obtainStyledAttributes.getFloat(index2, e2.d);
                        break;
                    }
                    case 46: {
                        e2.c = obtainStyledAttributes.getFloat(index2, e2.c);
                        break;
                    }
                    case 45: {
                        e2.b = obtainStyledAttributes.getFloat(index2, e2.b);
                        break;
                    }
                    case 44: {
                        e2.l = true;
                        e2.m = obtainStyledAttributes.getDimension(index2, e2.m);
                        break;
                    }
                    case 43: {
                        b2.c = obtainStyledAttributes.getFloat(index2, b2.c);
                        break;
                    }
                    case 42: {
                        d2.W = obtainStyledAttributes.getInt(index2, d2.W);
                        break;
                    }
                    case 41: {
                        d2.V = obtainStyledAttributes.getInt(index2, d2.V);
                        break;
                    }
                    case 40: {
                        d2.T = obtainStyledAttributes.getFloat(index2, d2.T);
                        break;
                    }
                    case 39: {
                        d2.U = obtainStyledAttributes.getFloat(index2, d2.U);
                        break;
                    }
                    case 38: {
                        j.a = obtainStyledAttributes.getResourceId(index2, j.a);
                        break;
                    }
                    case 37: {
                        d2.x = obtainStyledAttributes.getFloat(index2, d2.x);
                        break;
                    }
                    case 36: {
                        d2.l = e(obtainStyledAttributes, index2, d2.l);
                        break;
                    }
                    case 35: {
                        d2.m = e(obtainStyledAttributes, index2, d2.m);
                        break;
                    }
                    case 34: {
                        d2.H = obtainStyledAttributes.getDimensionPixelSize(index2, d2.H);
                        break;
                    }
                    case 33: {
                        d2.t = e(obtainStyledAttributes, index2, d2.t);
                        break;
                    }
                    case 32: {
                        d2.s = e(obtainStyledAttributes, index2, d2.s);
                        break;
                    }
                    case 31: {
                        d2.K = obtainStyledAttributes.getDimensionPixelSize(index2, d2.K);
                        break;
                    }
                    case 30: {
                        d2.k = e(obtainStyledAttributes, index2, d2.k);
                        break;
                    }
                    case 29: {
                        d2.j = e(obtainStyledAttributes, index2, d2.j);
                        break;
                    }
                    case 28: {
                        d2.G = obtainStyledAttributes.getDimensionPixelSize(index2, d2.G);
                        break;
                    }
                    case 27: {
                        d2.E = obtainStyledAttributes.getInt(index2, d2.E);
                        break;
                    }
                    case 26: {
                        d2.i = e(obtainStyledAttributes, index2, d2.i);
                        break;
                    }
                    case 25: {
                        d2.h = e(obtainStyledAttributes, index2, d2.h);
                        break;
                    }
                    case 24: {
                        d2.F = obtainStyledAttributes.getDimensionPixelSize(index2, d2.F);
                        break;
                    }
                    case 23: {
                        d2.b = obtainStyledAttributes.getLayoutDimension(index2, d2.b);
                        break;
                    }
                    case 22: {
                        final int int1 = obtainStyledAttributes.getInt(index2, b2.a);
                        b2.a = int1;
                        b2.a = d[int1];
                        break;
                    }
                    case 21: {
                        d2.c = obtainStyledAttributes.getLayoutDimension(index2, d2.c);
                        break;
                    }
                    case 20: {
                        d2.w = obtainStyledAttributes.getFloat(index2, d2.w);
                        break;
                    }
                    case 19: {
                        d2.f = obtainStyledAttributes.getFloat(index2, d2.f);
                        break;
                    }
                    case 18: {
                        d2.e = obtainStyledAttributes.getDimensionPixelOffset(index2, d2.e);
                        break;
                    }
                    case 17: {
                        d2.d = obtainStyledAttributes.getDimensionPixelOffset(index2, d2.d);
                        break;
                    }
                    case 16: {
                        d2.N = obtainStyledAttributes.getDimensionPixelSize(index2, d2.N);
                        break;
                    }
                    case 15: {
                        d2.R = obtainStyledAttributes.getDimensionPixelSize(index2, d2.R);
                        break;
                    }
                    case 14: {
                        d2.O = obtainStyledAttributes.getDimensionPixelSize(index2, d2.O);
                        break;
                    }
                    case 13: {
                        d2.M = obtainStyledAttributes.getDimensionPixelSize(index2, d2.M);
                        break;
                    }
                    case 12: {
                        d2.Q = obtainStyledAttributes.getDimensionPixelSize(index2, d2.Q);
                        break;
                    }
                    case 11: {
                        d2.P = obtainStyledAttributes.getDimensionPixelSize(index2, d2.P);
                        break;
                    }
                    case 10: {
                        d2.u = e(obtainStyledAttributes, index2, d2.u);
                        break;
                    }
                    case 9: {
                        d2.v = e(obtainStyledAttributes, index2, d2.v);
                        break;
                    }
                    case 8: {
                        d2.J = obtainStyledAttributes.getDimensionPixelSize(index2, d2.J);
                        break;
                    }
                    case 7: {
                        d2.D = obtainStyledAttributes.getDimensionPixelOffset(index2, d2.D);
                        break;
                    }
                    case 6: {
                        d2.C = obtainStyledAttributes.getDimensionPixelOffset(index2, d2.C);
                        break;
                    }
                    case 5: {
                        d2.y = obtainStyledAttributes.getString(index2);
                        break;
                    }
                    case 4: {
                        d2.n = e(obtainStyledAttributes, index2, d2.n);
                        break;
                    }
                    case 3: {
                        d2.o = e(obtainStyledAttributes, index2, d2.o);
                        break;
                    }
                    case 2: {
                        d2.I = obtainStyledAttributes.getDimensionPixelSize(index2, d2.I);
                        break;
                    }
                    case 1: {
                        d2.p = e(obtainStyledAttributes, index2, d2.p);
                        break;
                    }
                }
            }
            if (d2.j0 != null) {
                d2.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return j;
    }
    
    public static int e(final TypedArray typedArray, final int n, int n2) {
        if ((n2 = typedArray.getResourceId(n, n2)) == -1) {
            n2 = typedArray.getInt(n, -1);
        }
        return n2;
    }
    
    public static void f(final Object o, final TypedArray typedArray, int n, final int n2) {
        if (o == null) {
            return;
        }
        final int type = typedArray.peekValue(n).type;
        boolean b = true;
        final int n3 = 0;
        if (type != 3) {
            Label_0105: {
                Label_0083: {
                    if (type != 5) {
                        final int int1 = typedArray.getInt(n, 0);
                        if (int1 != -4) {
                            if (int1 != -3) {
                                n = int1;
                                if (int1 == -2 || (n = int1) == -1) {
                                    break Label_0083;
                                }
                            }
                            b = false;
                            n = n3;
                            break Label_0105;
                        }
                        n = -2;
                        break Label_0105;
                    }
                    else {
                        n = typedArray.getDimensionPixelSize(n, 0);
                    }
                }
                b = false;
            }
            if (o instanceof e) {
                final e e = (e)o;
                if (n2 == 0) {
                    e.width = n;
                    e.W = b;
                }
                else {
                    e.height = n;
                    e.X = b;
                }
            }
            else if (o instanceof k) {
                final k k = (k)o;
                if (n2 == 0) {
                    k.b = n;
                    k.l0 = b;
                }
                else {
                    k.c = n;
                    k.m0 = b;
                }
            }
            else if (o instanceof i) {
                final i i = (i)o;
                if (n2 == 0) {
                    i.b(23, n);
                    i.d(80, b);
                }
                else {
                    i.b(21, n);
                    i.d(81, b);
                }
            }
            return;
        }
        final String string = typedArray.getString(n);
        if (string == null) {
            return;
        }
        final int index = string.indexOf(61);
        n = string.length();
        if (index <= 0 || index >= n - 1) {
            return;
        }
        final String substring = string.substring(0, index);
        final String substring2 = string.substring(index + 1);
        if (substring2.length() <= 0) {
            return;
        }
        final String trim = substring.trim();
        final String trim2 = substring2.trim();
        Label_0568: {
            if ("ratio".equalsIgnoreCase(trim)) {
                if (o instanceof e) {
                    final e e2 = (e)o;
                    if (n2 == 0) {
                        e2.width = 0;
                    }
                    else {
                        e2.height = 0;
                    }
                    g(e2, trim2);
                    return;
                }
                if (o instanceof k) {
                    ((k)o).y = trim2;
                    return;
                }
                if (o instanceof i) {
                    ((i)o).c(5, trim2);
                }
                return;
            }
            else if (!"weight".equalsIgnoreCase(trim)) {
                break Label_0568;
            }
            try {
                final float float1 = Float.parseFloat(trim2);
                if (o instanceof e) {
                    final e e3 = (e)o;
                    if (n2 == 0) {
                        e3.width = 0;
                        e3.H = float1;
                    }
                    else {
                        e3.height = 0;
                        e3.I = float1;
                    }
                }
                else if (o instanceof k) {
                    final k j = (k)o;
                    if (n2 == 0) {
                        j.b = 0;
                        j.U = float1;
                    }
                    else {
                        j.c = 0;
                        j.T = float1;
                    }
                }
                else if (o instanceof i) {
                    final i l = (i)o;
                    if (n2 == 0) {
                        l.b(23, 0);
                        l.a(float1, 39);
                    }
                    else {
                        l.b(21, 0);
                        l.a(float1, 40);
                    }
                }
                Label_0748: {
                    return;
                }
                k m = null;
                Label_0682:
                m.c = 0;
                float max = 0.0f;
                m.e0 = max;
                m.Y = 2;
                return;
                i i2 = null;
                e e4;
                Block_32_Outer:Block_34_Outer:
                while (true) {
                    while (true) {
                        Block_31: {
                            Block_36: {
                                while (true) {
                                    i2 = (i)o;
                                    iftrue(Label_0734:)(n2 != 0);
                                    break Block_36;
                                    Label_0734:
                                    i2.b(21, 0);
                                    i2.b(55, 2);
                                    return;
                                    Label_0701:
                                    iftrue(Label_0748:)(!(o instanceof i));
                                    continue Block_32_Outer;
                                }
                                max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                                iftrue(Label_0647:)(!(o instanceof e));
                                break Block_31;
                                e4.width = 0;
                                e4.R = max;
                                e4.L = 2;
                                return;
                                Label_0628:
                                e4.height = 0;
                                e4.S = max;
                                e4.M = 2;
                                return;
                            }
                            i2.b(23, 0);
                            i2.b(54, 2);
                            return;
                        }
                        e4 = (e)o;
                        iftrue(Label_0628:)(n2 != 0);
                        continue Block_34_Outer;
                    }
                    Label_0647:
                    iftrue(Label_0701:)(!(o instanceof k));
                    while (true) {
                        Block_33: {
                            break Block_33;
                            m.b = 0;
                            m.d0 = max;
                            m.X = 2;
                            return;
                        }
                        m = (k)o;
                        iftrue(Label_0682:)(n2 != 0);
                        continue;
                    }
                    iftrue(Label_0748:)(!"parent".equalsIgnoreCase(trim));
                    continue Block_32_Outer;
                }
            }
            catch (final NumberFormatException ex) {}
        }
    }
    
    public static void g(final e e, final String g) {
    Block_14_Outer:
        while (true) {
            if (g == null) {
                break Label_0240;
            }
            final int length = g.length();
            final int index = g.indexOf(44);
            final int n = 0;
            final int n2 = 0;
            final int n3 = -1;
            int n4 = n;
            int n5 = n3;
            if (index > 0) {
                n4 = n;
                n5 = n3;
                if (index < length - 1) {
                    final String substring = g.substring(0, index);
                    if (substring.equalsIgnoreCase("W")) {
                        n5 = n2;
                    }
                    else if (substring.equalsIgnoreCase("H")) {
                        n5 = 1;
                    }
                    else {
                        n5 = -1;
                    }
                    n4 = index + 1;
                }
            }
            final int index2 = g.indexOf(58);
            Label_0218: {
                if (index2 < 0 || index2 >= length - 1) {
                    break Label_0218;
                }
                final String substring2 = g.substring(n4, index2);
                final String substring3 = g.substring(index2 + 1);
                if (substring2.length() <= 0 || substring3.length() <= 0) {
                    break Label_0240;
                }
                try {
                    final float float1 = Float.parseFloat(substring2);
                    final float float2 = Float.parseFloat(substring3);
                    if (float1 > 0.0f && float2 > 0.0f) {
                        if (n5 == 1) {
                            Math.abs(float2 / float1);
                        }
                        else {
                            Math.abs(float1 / float2);
                        }
                    }
                    e.G = g;
                    return;
                    while (true) {
                        final String substring4;
                        Float.parseFloat(substring4);
                        continue Block_14_Outer;
                        substring4 = g.substring(n4);
                        iftrue(Label_0240:)(substring4.length() <= 0);
                        continue;
                    }
                }
                catch (final NumberFormatException ex) {
                    continue;
                }
            }
            break;
        }
    }
    
    public final void a(Context context, int i) {
        context = (Context)LayoutInflater.from(context).inflate(i, (ViewGroup)null);
        final int childCount = ((ViewGroup)context).getChildCount();
        final HashMap c = this.c;
        c.clear();
        View child;
        e e;
        int id;
        j j;
        HashMap a;
        HashMap f;
        Class<? extends a> class1;
        Iterator iterator;
        String s;
        b b;
        StringBuilder sb;
        final InvocationTargetException ex;
        final IllegalAccessException ex2;
        final NoSuchMethodException ex3;
        int e2;
        k d;
        int visibility;
        m b2;
        float rotation;
        n e3;
        float pivotX;
        float pivotY;
        a a2;
        for (i = 0; i < childCount; ++i) {
            child = ((ViewGroup)context).getChildAt(i);
            e = (e)child.getLayoutParams();
            id = child.getId();
            if (this.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c.containsKey((Object)id)) {
                c.put((Object)id, (Object)new j());
            }
            j = (j)c.get((Object)id);
            if (j != null) {
                a = this.a;
                f = new HashMap();
                class1 = ((a)child).getClass();
                iterator = a.keySet().iterator();
                while (iterator.hasNext()) {
                    s = (String)iterator.next();
                    b = (b)a.get((Object)s);
                    Label_0369: {
                        Label_0361: {
                            Label_0353: {
                                try {
                                    if (s.equals((Object)"BackgroundColor")) {
                                        f.put((Object)s, (Object)new b(b, ((ColorDrawable)child.getBackground()).getColor()));
                                        continue;
                                    }
                                }
                                catch (final InvocationTargetException ex) {
                                    break Label_0353;
                                }
                                catch (final IllegalAccessException ex2) {
                                    break Label_0361;
                                }
                                catch (final NoSuchMethodException ex3) {
                                    break Label_0369;
                                }
                                sb = new StringBuilder();
                                sb.append("getMap");
                                sb.append(s);
                                f.put((Object)s, (Object)new b(b, class1.getMethod(sb.toString(), (Class<?>[])null).invoke((Object)child, (Object[])null)));
                                continue;
                            }
                            ((Throwable)ex).printStackTrace();
                            continue;
                        }
                        ((Throwable)ex2).printStackTrace();
                        continue;
                    }
                    ((Throwable)ex3).printStackTrace();
                }
                j.f = f;
                j.a = id;
                e2 = e.e;
                d = j.d;
                d.h = e2;
                d.i = e.f;
                d.j = e.g;
                d.k = e.h;
                d.l = e.i;
                d.m = e.j;
                d.n = e.k;
                d.o = e.l;
                d.p = e.m;
                d.q = e.n;
                d.r = e.o;
                d.s = e.s;
                d.t = e.t;
                d.u = e.u;
                d.v = e.v;
                d.w = e.E;
                d.x = e.F;
                d.y = e.G;
                d.z = e.p;
                d.A = e.q;
                d.B = e.r;
                d.C = e.T;
                d.D = e.U;
                d.E = e.V;
                d.f = e.c;
                d.d = e.a;
                d.e = e.b;
                d.b = e.width;
                d.c = e.height;
                d.F = e.leftMargin;
                d.G = e.rightMargin;
                d.H = e.topMargin;
                d.I = e.bottomMargin;
                d.L = e.D;
                d.T = e.I;
                d.U = e.H;
                d.W = e.K;
                d.V = e.J;
                d.l0 = e.W;
                d.m0 = e.X;
                d.X = e.L;
                d.Y = e.M;
                d.Z = e.P;
                d.a0 = e.Q;
                d.b0 = e.N;
                d.c0 = e.O;
                d.d0 = e.R;
                d.e0 = e.S;
                d.k0 = e.Y;
                d.N = e.x;
                d.P = e.z;
                d.M = e.w;
                d.O = e.y;
                d.R = e.A;
                d.Q = e.B;
                d.S = e.C;
                d.o0 = e.Z;
                d.J = e.getMarginEnd();
                d.K = e.getMarginStart();
                visibility = child.getVisibility();
                b2 = j.b;
                b2.a = visibility;
                b2.c = child.getAlpha();
                rotation = child.getRotation();
                e3 = j.e;
                e3.a = rotation;
                e3.b = child.getRotationX();
                e3.c = child.getRotationY();
                e3.d = child.getScaleX();
                e3.e = child.getScaleY();
                pivotX = child.getPivotX();
                pivotY = child.getPivotY();
                if (pivotX != 0.0 || pivotY != 0.0) {
                    e3.f = pivotX;
                    e3.g = pivotY;
                }
                e3.i = child.getTranslationX();
                e3.j = child.getTranslationY();
                e3.k = child.getTranslationZ();
                if (e3.l) {
                    e3.m = child.getElevation();
                }
                if (child instanceof a) {
                    a2 = (a)child;
                    d.n0 = a2.getAllowsGoneWidget();
                    d.i0 = a2.getReferencedIds();
                    d.f0 = a2.getType();
                    d.g0 = a2.getMargin();
                }
            }
        }
    }
    
    public final void d(final Context context, int n) {
        while (true) {
            final XmlResourceParser xml = context.getResources().getXml(n);
            Label_0132: {
            Label_0125:
                while (true) {
                    Label_0114: {
                        Label_0106: {
                            j c;
                            try {
                                n = ((XmlPullParser)xml).getEventType();
                                if (n == 1) {
                                    break;
                                }
                                if (n == 0) {
                                    break Label_0106;
                                }
                                if (n != 2) {
                                    break Label_0114;
                                }
                                final String name = ((XmlPullParser)xml).getName();
                                c = c(context, Xml.asAttributeSet((XmlPullParser)xml), false);
                                if (name.equalsIgnoreCase("Guideline")) {
                                    c.d.a = true;
                                }
                            }
                            catch (final IOException ex) {
                                break Label_0125;
                            }
                            catch (final XmlPullParserException ex2) {
                                break Label_0132;
                            }
                            this.c.put((Object)c.a, (Object)c);
                            break Label_0114;
                        }
                        ((XmlPullParser)xml).getName();
                    }
                    n = ((XmlPullParser)xml).next();
                    continue;
                }
                final IOException ex;
                ((Throwable)ex).printStackTrace();
                break;
            }
            final XmlPullParserException ex2;
            ex2.printStackTrace();
            break;
        }
    }
}
