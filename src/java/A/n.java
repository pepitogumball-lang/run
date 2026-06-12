package A;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseIntArray;

public final class n
{
    public static final SparseIntArray n;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;
    
    static {
        final SparseIntArray n2 = new SparseIntArray();
        (n = n2).append(6, 1);
        n2.append(7, 2);
        n2.append(8, 3);
        n2.append(4, 4);
        n2.append(5, 5);
        n2.append(0, 6);
        n2.append(1, 7);
        n2.append(2, 8);
        n2.append(3, 9);
        n2.append(9, 10);
        n2.append(10, 11);
        n2.append(11, 12);
    }
    
    public final void a(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, s.i);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            switch (A.n.n.get(index)) {
                case 12: {
                    this.h = o.e(obtainStyledAttributes, index, this.h);
                    break;
                }
                case 11: {
                    this.l = true;
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                }
                case 10: {
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                }
                case 9: {
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                }
                case 8: {
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                }
                case 7: {
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                }
                case 6: {
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                }
                case 5: {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                }
                case 4: {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                }
                case 3: {
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                }
                case 2: {
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                }
                case 1: {
                    this.a = obtainStyledAttributes.getFloat(index, this.a);
                    break;
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
