package E;

import java.io.IOException;
import java.io.File;
import android.net.Uri;
import java.util.HashMap;

public final class k implements j
{
    public final String a;
    public final HashMap b;
    
    public k(final String a) {
        this.b = new HashMap();
        this.a = a;
    }
    
    public static boolean a(String access$000, final String s) {
        access$000 = l.access$000(access$000);
        final String access$2 = l.access$000(s);
        if (!access$000.equals((Object)access$2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(access$2);
            sb.append('/');
            if (!access$000.startsWith(sb.toString())) {
                return false;
            }
        }
        return true;
    }
    
    public final File b(Uri uri) {
        final String encodedPath = uri.getEncodedPath();
        final int index = encodedPath.indexOf(47, 1);
        final String decode = Uri.decode(encodedPath.substring(1, index));
        final String decode2 = Uri.decode(encodedPath.substring(index + 1));
        final File file = (File)this.b.get((Object)decode);
        if (file != null) {
            uri = (Uri)new File(file, decode2);
            try {
                final File canonicalFile = ((File)uri).getCanonicalFile();
                if (a(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                sb.append((Object)uri);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final StringBuilder sb2 = new StringBuilder("Unable to find configured root for ");
        sb2.append((Object)uri);
        throw new IllegalArgumentException(sb2.toString());
    }
}
