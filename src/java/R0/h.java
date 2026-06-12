package r0;

import java.util.Objects;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.File;

public final class h
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    
    public h(final int a, final int b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static h a(final File file) {
        final DataInputStream dataInputStream = new DataInputStream((InputStream)new FileInputStream(file));
        try {
            final h h = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            ((InputStream)dataInputStream).close();
            return h;
        }
        finally {
            try {
                ((InputStream)dataInputStream).close();
            }
            finally {
                final Throwable t;
                ((Throwable)file).addSuppressed(t);
            }
        }
    }
    
    public final void b(final File file) {
        file.delete();
        final DataOutputStream dataOutputStream = new DataOutputStream((OutputStream)new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.d);
            ((OutputStream)dataOutputStream).close();
        }
        finally {
            try {
                ((OutputStream)dataOutputStream).close();
            }
            finally {
                final Throwable t;
                ((Throwable)file).addSuppressed(t);
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof h) {
            final h h = (h)o;
            if (this.b != h.b || this.c != h.c || this.a != h.a || this.d != h.d) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.b, this.c, this.a, this.d });
    }
}
