package A;

import android.content.res.TypedArray;
import w.a;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseIntArray;

public final class l
{
    public static final SparseIntArray j;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;
    
    static {
        final SparseIntArray i = new SparseIntArray();
        (j = i).append(3, 1);
        i.append(5, 2);
        i.append(9, 3);
        i.append(2, 4);
        i.append(1, 5);
        i.append(0, 6);
        i.append(4, 7);
        i.append(8, 8);
        i.append(7, 9);
        i.append(6, 10);
    }
    
    public final void a(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, s.f);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            switch (l.j.get(index)) {
                case 10: {
                    final int type = obtainStyledAttributes.peekValue(index).type;
                    if (type == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    }
                    if (type != 3) {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
                    final String string = obtainStyledAttributes.getString(index);
                    this.h = string;
                    if (string.indexOf("/") > 0) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    }
                    break;
                }
                case 9: {
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                }
                case 8: {
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                }
                case 7: {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                }
                case 6: {
                    this.b = obtainStyledAttributes.getInteger(index, this.b);
                    break;
                }
                case 5: {
                    this.a = o.e(obtainStyledAttributes, index, this.a);
                    break;
                }
                case 4: {
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                }
                case 3: {
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    }
                    final String s = w.a.a[obtainStyledAttributes.getInteger(index, 0)];
                    break;
                }
                case 2: {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                    break;
                }
                case 1: {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
