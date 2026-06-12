package C;

import android.os.Build$VERSION;
import x.a;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.HashSet;
import android.app.Activity;
import E.h;

public abstract class e extends h
{
    public static void d(final Activity activity, final String[] array, final int n) {
        final HashSet set = new HashSet();
        final int n2 = 0;
        for (int i = 0; i < array.length; ++i) {
            if (TextUtils.isEmpty((CharSequence)array[i])) {
                throw new IllegalArgumentException(x.a.b(new StringBuilder("Permission request for permissions "), Arrays.toString((Object[])array), " must not contain null or empty values"));
            }
            if (Build$VERSION.SDK_INT < 33 && TextUtils.equals((CharSequence)array[i], (CharSequence)"android.permission.POST_NOTIFICATIONS")) {
                set.add((Object)i);
            }
        }
        final int size = set.size();
        String[] array2;
        if (size > 0) {
            array2 = new String[array.length - size];
        }
        else {
            array2 = array;
        }
        if (size > 0) {
            if (size == array.length) {
                return;
            }
            int n3 = 0;
            int n4;
            for (int j = n2; j < array.length; ++j, n3 = n4) {
                n4 = n3;
                if (!set.contains((Object)j)) {
                    array2[n3] = array[j];
                    n4 = n3 + 1;
                }
            }
        }
        if (activity instanceof d) {
            ((d)activity).validateRequestPermissionsRequestCode(n);
        }
        c.b(activity, array, n);
    }
}
