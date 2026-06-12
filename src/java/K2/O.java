package K2;

import com.google.android.gms.internal.measurement.L;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;

public final class o extends x0
{
    public long E;
    public String F;
    
    public final String A() {
        this.w();
        return this.F;
    }
    
    @Override
    public final boolean y() {
        final Calendar instance = Calendar.getInstance();
        this.E = TimeUnit.MINUTES.convert((long)(instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        final Locale default1 = Locale.getDefault();
        final String language = default1.getLanguage();
        final Locale english = Locale.ENGLISH;
        this.F = L.j(language.toLowerCase(english), "-", default1.getCountry().toLowerCase(english));
        return false;
    }
    
    public final long z() {
        this.w();
        return this.E;
    }
}
