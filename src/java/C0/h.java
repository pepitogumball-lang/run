package c0;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.text.InputFilter;
import android.widget.TextView;
import I5.d;

public final class h extends d
{
    public final TextView c;
    public final e d;
    public boolean e;
    
    public h(final TextView c) {
        this.c = c;
        this.e = true;
        this.d = new e(c);
    }
    
    public final InputFilter[] h(InputFilter[] array) {
        final boolean e = this.e;
        int i = 0;
        if (!e) {
            final SparseArray sparseArray = new SparseArray(1);
            for (int j = 0; j < array.length; ++j) {
                final InputFilter inputFilter = array[j];
                if (inputFilter instanceof e) {
                    sparseArray.put(j, (Object)inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                final int length = array.length;
                final InputFilter[] array2 = new InputFilter[array.length - sparseArray.size()];
                int n = 0;
                while (i < length) {
                    int n2 = n;
                    if (sparseArray.indexOfKey(i) < 0) {
                        array2[n] = array[i];
                        n2 = n + 1;
                    }
                    ++i;
                    n = n2;
                }
                array = array2;
            }
            return array;
        }
        final int length2 = array.length;
        int n3 = 0;
        while (true) {
            final e d = this.d;
            if (n3 >= length2) {
                final InputFilter[] array3 = new InputFilter[array.length + 1];
                System.arraycopy((Object)array, 0, (Object)array3, 0, length2);
                array3[length2] = (InputFilter)d;
                array = array3;
                break;
            }
            if (array[n3] == d) {
                break;
            }
            ++n3;
        }
        return array;
    }
    
    public final boolean i() {
        return this.e;
    }
    
    public final void m(final boolean b) {
        if (b) {
            final TextView c = this.c;
            c.setTransformationMethod(this.u(c.getTransformationMethod()));
        }
    }
    
    public final void n(final boolean e) {
        this.e = e;
        final TextView c = this.c;
        c.setTransformationMethod(this.u(c.getTransformationMethod()));
        c.setFilters(this.h(c.getFilters()));
    }
    
    public final TransformationMethod u(TransformationMethod transformationMethod) {
        if (this.e) {
            if (!(transformationMethod instanceof l)) {
                if (!(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = (TransformationMethod)new l(transformationMethod);
                }
            }
            return transformationMethod;
        }
        TransformationMethod a = transformationMethod;
        if (transformationMethod instanceof l) {
            a = ((l)transformationMethod).a;
        }
        return a;
    }
}
