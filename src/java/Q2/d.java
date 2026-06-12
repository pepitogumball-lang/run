package q2;

import java.util.regex.Pattern;

public abstract class d
{
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
    
    public static boolean a(final String s) {
        return s == null || s.trim().isEmpty();
    }
}
