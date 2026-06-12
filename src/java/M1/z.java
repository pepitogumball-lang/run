package m1;

import android.util.SparseArray;

public enum z
{
    C("EVENT_OVERRIDE", 1);
    
    public static final z[] D;
    
    static {
        final Enum enum1 = new Enum("NOT_SET", 0);
        final z z;
        D = new z[] { (z)enum1, z };
        final SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, (Object)enum1);
        sparseArray.put(5, (Object)z);
    }
}
