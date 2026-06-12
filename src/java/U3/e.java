package U3;

import com.google.protobuf.n;
import java.net.URLConnection;
import Z3.p;
import Z3.r;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import Y3.j;
import S3.f;
import java.net.HttpURLConnection;
import R3.a;

public final class e
{
    public static final a f;
    public final HttpURLConnection a;
    public final f b;
    public long c;
    public long d;
    public final j e;
    
    static {
        f = a.d();
    }
    
    public e(final HttpURLConnection a, final j e, final f b) {
        this.c = -1L;
        this.d = -1L;
        this.a = a;
        this.b = b;
        this.e = e;
        b.k(((URLConnection)a).getURL().toString());
    }
    
    public final void a() {
        final long c = this.c;
        final f b = this.b;
        final j e = this.e;
        if (c == -1L) {
            e.d();
            b.g(this.c = e.C);
        }
        try {
            ((URLConnection)this.a).connect();
        }
        catch (final IOException ex) {
            m0.a.l(e, b, b);
            throw ex;
        }
    }
    
    public final Object b() {
        final j e = this.e;
        this.i();
        final HttpURLConnection a = this.a;
        final int responseCode = a.getResponseCode();
        final f b = this.b;
        b.e(responseCode);
        try {
            Object content = ((URLConnection)a).getContent();
            if (content instanceof InputStream) {
                b.h(((URLConnection)a).getContentType());
                content = new U3.a((InputStream)content, b, e);
            }
            else {
                b.h(((URLConnection)a).getContentType());
                b.i(((URLConnection)a).getContentLength());
                b.j(e.a());
                b.b();
            }
            return content;
        }
        catch (final IOException ex) {
            m0.a.l(e, b, b);
            throw ex;
        }
    }
    
    public final Object c(final Class[] array) {
        final j e = this.e;
        this.i();
        final HttpURLConnection a = this.a;
        final int responseCode = a.getResponseCode();
        final f b = this.b;
        b.e(responseCode);
        try {
            Object content = ((URLConnection)a).getContent(array);
            if (content instanceof InputStream) {
                b.h(((URLConnection)a).getContentType());
                content = new U3.a((InputStream)content, b, e);
            }
            else {
                b.h(((URLConnection)a).getContentType());
                b.i(((URLConnection)a).getContentLength());
                b.j(e.a());
                b.b();
            }
            return content;
        }
        catch (final IOException ex) {
            m0.a.l(e, b, b);
            throw ex;
        }
    }
    
    public final InputStream d() {
        final HttpURLConnection a = this.a;
        final f b = this.b;
        this.i();
        try {
            b.e(a.getResponseCode());
        }
        catch (final IOException ex) {
            U3.e.f.a("IOException thrown trying to obtain the response code");
        }
        final InputStream errorStream = a.getErrorStream();
        if (errorStream != null) {
            return new U3.a(errorStream, b, this.e);
        }
        return errorStream;
    }
    
    public final InputStream e() {
        final j e = this.e;
        this.i();
        final HttpURLConnection a = this.a;
        final int responseCode = a.getResponseCode();
        final f b = this.b;
        b.e(responseCode);
        b.h(((URLConnection)a).getContentType());
        Label_0076: {
            InputStream inputStream;
            try {
                inputStream = ((URLConnection)a).getInputStream();
                if (inputStream != null) {
                    return new U3.a(inputStream, b, e);
                }
            }
            catch (final IOException ex) {
                break Label_0076;
            }
            return inputStream;
        }
        m0.a.l(e, b, b);
        throw;
    }
    
    @Override
    public final boolean equals(final Object obj) {
        return this.a.equals(obj);
    }
    
    public final OutputStream f() {
        final j e = this.e;
        final f b = this.b;
        Label_0041: {
            OutputStream outputStream;
            try {
                outputStream = ((URLConnection)this.a).getOutputStream();
                if (outputStream != null) {
                    return new b(outputStream, b, e);
                }
            }
            catch (final IOException ex) {
                break Label_0041;
            }
            return outputStream;
        }
        m0.a.l(e, b, b);
        throw;
    }
    
    public final int g() {
        this.i();
        final long d = this.d;
        final j e = this.e;
        final f b = this.b;
        if (d == -1L) {
            final long a = e.a();
            this.d = a;
            final p f = b.F;
            ((n)f).l();
            r.B((r)((n)f).D, a);
        }
        try {
            final int responseCode = this.a.getResponseCode();
            b.e(responseCode);
            return responseCode;
        }
        catch (final IOException ex) {
            m0.a.l(e, b, b);
            throw ex;
        }
    }
    
    public final String h() {
        final HttpURLConnection a = this.a;
        this.i();
        final long d = this.d;
        final j e = this.e;
        final f b = this.b;
        if (d == -1L) {
            final long a2 = e.a();
            this.d = a2;
            final p f = b.F;
            ((n)f).l();
            r.B((r)((n)f).D, a2);
        }
        try {
            final String responseMessage = a.getResponseMessage();
            b.e(a.getResponseCode());
            return responseMessage;
        }
        catch (final IOException ex) {
            m0.a.l(e, b, b);
            throw ex;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void i() {
        final long c = this.c;
        final f b = this.b;
        if (c == -1L) {
            final j e = this.e;
            e.d();
            b.g(this.c = e.C);
        }
        final HttpURLConnection a = this.a;
        final String requestMethod = a.getRequestMethod();
        if (requestMethod != null) {
            b.d(requestMethod);
        }
        else if (((URLConnection)a).getDoOutput()) {
            b.d("POST");
        }
        else {
            b.d("GET");
        }
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
