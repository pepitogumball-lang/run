package L3;

import java.io.IOException;
import com.google.android.gms.internal.ads.y7;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;

public final class d extends FilterInputStream
{
    public final int C;
    public long D;
    public long E;
    
    public d(final BufferedInputStream bufferedInputStream, final long d) {
        this.C = 1;
        super((InputStream)bufferedInputStream);
        this.D = d;
    }
    
    public d(final InputStream inputStream) {
        this.C = 0;
        super(inputStream);
        this.E = -1L;
        this.D = 1048577L;
    }
    
    public d(final InputStream inputStream, final long d) {
        this.C = 2;
        super(inputStream);
        this.E = -1L;
        inputStream.getClass();
        y7.X("limit must be non-negative", d >= 0L);
        this.D = d;
    }
    
    public int available() {
        switch (this.C) {
            default: {
                return super.available();
            }
            case 2: {
                return (int)Math.min((long)super.in.available(), this.D);
            }
            case 0: {
                return (int)Math.min((long)super.in.available(), this.D);
            }
        }
    }
    
    public void mark(final int n) {
        switch (this.C) {
            default: {
                super.mark(n);
                return;
            }
            case 2: {
                synchronized (this) {
                    super.in.mark(n);
                    this.E = this.D;
                }
            }
            case 0: {
                synchronized (this) {
                    super.in.mark(n);
                    this.E = this.D;
                    return;
                }
                break;
            }
        }
    }
    
    public final int read() {
        switch (this.C) {
            default: {
                final long d = this.D;
                int read = -1;
                if (d != 0L) {
                    read = super.in.read();
                    if (read != -1) {
                        --this.D;
                    }
                }
                return read;
            }
            case 1: {
                final int read2 = super.read();
                if (read2 != -1) {
                    ++this.E;
                }
                return read2;
            }
            case 0: {
                final long d2 = this.D;
                int read3 = -1;
                if (d2 != 0L) {
                    read3 = super.in.read();
                    if (read3 != -1) {
                        --this.D;
                    }
                }
                return read3;
            }
        }
    }
    
    public final int read(final byte[] array, int n, int n2) {
        switch (this.C) {
            default: {
                final long d = this.D;
                final int n3 = -1;
                if (d == 0L) {
                    n = n3;
                }
                else {
                    n2 = (int)Math.min((long)n2, d);
                    n = super.in.read(array, n, n2);
                    if (n != -1) {
                        this.D -= n;
                    }
                }
                return n;
            }
            case 1: {
                n = super.read(array, n, n2);
                if (n != -1) {
                    this.E += n;
                }
                return n;
            }
            case 0: {
                final long d2 = this.D;
                final int n4 = -1;
                if (d2 == 0L) {
                    n = n4;
                }
                else {
                    n2 = (int)Math.min((long)n2, d2);
                    n = super.in.read(array, n, n2);
                    if (n != -1) {
                        this.D -= n;
                    }
                }
                return n;
            }
        }
    }
    
    public void reset() {
        switch (this.C) {
            default: {
                super.reset();
                return;
            }
            case 2: {
                monitorenter(this);
                try {
                    if (!super.in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.E != -1L) {
                        super.in.reset();
                        this.D = this.E;
                        monitorexit(this);
                        return;
                    }
                    throw new IOException("Mark not set");
                }
                finally {
                    monitorexit(this);
                    throw new IOException("Mark not supported");
                }
            }
            case 0: {
                monitorenter(this);
                try {
                    if (!super.in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.E != -1L) {
                        super.in.reset();
                        this.D = this.E;
                        monitorexit(this);
                        return;
                    }
                    throw new IOException("Mark not set");
                }
                finally {
                    monitorexit(this);
                    throw new IOException("Mark not set");
                }
                break;
            }
        }
    }
    
    public long skip(long n) {
        switch (this.C) {
            default: {
                return super.skip(n);
            }
            case 2: {
                n = Math.min(n, this.D);
                n = super.in.skip(n);
                this.D -= n;
                return n;
            }
            case 0: {
                n = Math.min(n, this.D);
                n = super.in.skip(n);
                this.D -= n;
                return n;
            }
        }
    }
}
