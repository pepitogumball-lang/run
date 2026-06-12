package A;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public final class m
{
    public int a;
    public int b;
    public float c;
    public float d;
    
    public final void a(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, s.g);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            }
            else if (index == 0) {
                final int int1 = obtainStyledAttributes.getInt(index, this.a);
                this.a = int1;
                this.a = o.d[int1];
            }
            else if (index == 4) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            }
            else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
