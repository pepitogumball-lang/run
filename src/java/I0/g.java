package I0;

import m5.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.h;

public abstract class g
{
    public static String b(final String s, final Object o) {
        h.e("value", o);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" value: ");
        sb.append(o);
        return sb.toString();
    }
    
    public static i c(String group) {
        if (group != null) {
            if (!u5.i.U((CharSequence)group)) {
                final Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher((CharSequence)group);
                if (!matcher.matches()) {
                    return null;
                }
                final String group2 = matcher.group(1);
                if (group2 != null) {
                    final int int1 = Integer.parseInt(group2);
                    final String group3 = matcher.group(2);
                    if (group3 != null) {
                        final int int2 = Integer.parseInt(group3);
                        final String group4 = matcher.group(3);
                        if (group4 != null) {
                            final int int3 = Integer.parseInt(group4);
                            if (matcher.group(4) != null) {
                                group = matcher.group(4);
                            }
                            else {
                                group = "";
                            }
                            h.d("description", (Object)group);
                            return new i(int1, int2, int3, group);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public abstract Object a();
    
    public abstract g d(final String p0, final l p1);
}
