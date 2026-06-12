package u2;

import dalvik.system.PathClassLoader;

public final class g extends PathClassLoader
{
    public final Class loadClass(final String s, final boolean b) {
        Label_0026: {
            if (s.startsWith("java.") || s.startsWith("android.")) {
                break Label_0026;
            }
            try {
                return ((ClassLoader)this).findClass(s);
                return super.loadClass(s, b);
            }
            catch (final ClassNotFoundException ex) {
                return super.loadClass(s, b);
            }
        }
    }
}
