package U3;

import com.google.protobuf.n;
import Z3.p;
import Z3.r;
import S3.f;
import org.apache.http.HttpResponse;
import org.apache.http.Header;
import R3.a;
import org.apache.http.HttpMessage;
import java.util.regex.Pattern;

public abstract class g
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");
    }
    
    public static Long a(final HttpMessage httpMessage) {
        try {
            final Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.parseLong(firstHeader.getValue());
            }
        }
        catch (final NumberFormatException ex) {
            R3.a.d().a("The content-length value is not a valid number");
        }
        return null;
    }
    
    public static String b(final HttpResponse httpResponse) {
        final Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null) {
            final String value = firstHeader.getValue();
            if (value != null) {
                return value;
            }
        }
        return null;
    }
    
    public static void c(final f f) {
        if (!((r)((n)f.F).D).V()) {
            final p f2 = f.F;
            ((n)f2).l();
            r.v((r)((n)f2).D);
        }
        f.b();
    }
}
