package i1;

import java.io.File;
import java.io.FilenameFilter;

public final class a implements FilenameFilter
{
    public final String a;
    
    public a(final String a) {
        this.a = a;
    }
    
    public final boolean accept(final File file, final String s) {
        return s.startsWith(this.a);
    }
}
