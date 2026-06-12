package T3;

import java.util.Locale;

public abstract class e
{
    public static void b(final String s, final String s2) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (s2 == null || s2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (s.length() > 40) {
            final Locale us = Locale.US;
            throw new IllegalArgumentException("Attribute key length must not exceed 40 characters");
        }
        if (s2.length() > 100) {
            final Locale us2 = Locale.US;
            throw new IllegalArgumentException("Attribute value length must not exceed 100 characters");
        }
        if (s.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return;
        }
        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
    }
    
    public static String c(final String s) {
        if (s == null) {
            return "Metric name must not be null";
        }
        if (s.length() > 100) {
            final Locale us = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (s.startsWith("_")) {
            final int[] e = v.e.e(6);
            for (int length = e.length, i = 0; i < length; ++i) {
                String s2 = null;
                switch (e[i]) {
                    default: {
                        throw null;
                    }
                    case 6: {
                        s2 = "_fr_fzn";
                        break;
                    }
                    case 5: {
                        s2 = "_fr_slo";
                        break;
                    }
                    case 4: {
                        s2 = "_fr_tot";
                        break;
                    }
                    case 3: {
                        s2 = "_tsns";
                        break;
                    }
                    case 2: {
                        s2 = "_fsntc";
                        break;
                    }
                    case 1: {
                        s2 = "_fstec";
                        break;
                    }
                }
                if (s2.equals((Object)s)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }
    
    public abstract boolean a();
}
