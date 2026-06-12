package U3;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.security.Permission;
import java.io.OutputStream;
import java.util.Map;
import java.io.InputStream;
import S3.f;
import Y3.j;
import java.net.HttpURLConnection;

public final class c extends HttpURLConnection
{
    public final e a;
    
    public c(final HttpURLConnection httpURLConnection, final j j, final f f) {
        super(((URLConnection)httpURLConnection).getURL());
        this.a = new e(httpURLConnection, j, f);
    }
    
    public final void addRequestProperty(final String s, final String s2) {
        ((URLConnection)this.a.a).addRequestProperty(s, s2);
    }
    
    public final void connect() {
        this.a.a();
    }
    
    public final void disconnect() {
        final e a = this.a;
        final long a2 = a.e.a();
        final f b = a.b;
        b.j(a2);
        b.b();
        a.a.disconnect();
    }
    
    public final boolean equals(final Object obj) {
        return this.a.a.equals(obj);
    }
    
    public final boolean getAllowUserInteraction() {
        return ((URLConnection)this.a.a).getAllowUserInteraction();
    }
    
    public final int getConnectTimeout() {
        return ((URLConnection)this.a.a).getConnectTimeout();
    }
    
    public final Object getContent() {
        return this.a.b();
    }
    
    public final Object getContent(final Class[] array) {
        return this.a.c(array);
    }
    
    public final String getContentEncoding() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getContentEncoding();
    }
    
    public final int getContentLength() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getContentLength();
    }
    
    public final long getContentLengthLong() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getContentLengthLong();
    }
    
    public final String getContentType() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getContentType();
    }
    
    public final long getDate() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getDate();
    }
    
    public final boolean getDefaultUseCaches() {
        return ((URLConnection)this.a.a).getDefaultUseCaches();
    }
    
    public final boolean getDoInput() {
        return ((URLConnection)this.a.a).getDoInput();
    }
    
    public final boolean getDoOutput() {
        return ((URLConnection)this.a.a).getDoOutput();
    }
    
    public final InputStream getErrorStream() {
        return this.a.d();
    }
    
    public final long getExpiration() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getExpiration();
    }
    
    public final String getHeaderField(final int n) {
        final e a = this.a;
        a.i();
        return a.a.getHeaderField(n);
    }
    
    public final String getHeaderField(final String s) {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getHeaderField(s);
    }
    
    public final long getHeaderFieldDate(final String s, final long n) {
        final e a = this.a;
        a.i();
        return a.a.getHeaderFieldDate(s, n);
    }
    
    public final int getHeaderFieldInt(final String s, final int n) {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getHeaderFieldInt(s, n);
    }
    
    public final String getHeaderFieldKey(final int n) {
        final e a = this.a;
        a.i();
        return a.a.getHeaderFieldKey(n);
    }
    
    public final long getHeaderFieldLong(final String s, final long n) {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getHeaderFieldLong(s, n);
    }
    
    public final Map getHeaderFields() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getHeaderFields();
    }
    
    public final long getIfModifiedSince() {
        return ((URLConnection)this.a.a).getIfModifiedSince();
    }
    
    public final InputStream getInputStream() {
        return this.a.e();
    }
    
    public final boolean getInstanceFollowRedirects() {
        return this.a.a.getInstanceFollowRedirects();
    }
    
    public final long getLastModified() {
        final e a = this.a;
        a.i();
        return ((URLConnection)a.a).getLastModified();
    }
    
    public final OutputStream getOutputStream() {
        return this.a.f();
    }
    
    public final Permission getPermission() {
        final e a = this.a;
        a.getClass();
        try {
            return a.a.getPermission();
        }
        catch (final IOException ex) {
            final long a2 = a.e.a();
            final f b = a.b;
            b.j(a2);
            g.c(b);
            throw ex;
        }
    }
    
    public final int getReadTimeout() {
        return ((URLConnection)this.a.a).getReadTimeout();
    }
    
    public final String getRequestMethod() {
        return this.a.a.getRequestMethod();
    }
    
    public final Map getRequestProperties() {
        return ((URLConnection)this.a.a).getRequestProperties();
    }
    
    public final String getRequestProperty(final String s) {
        return ((URLConnection)this.a.a).getRequestProperty(s);
    }
    
    public final int getResponseCode() {
        return this.a.g();
    }
    
    public final String getResponseMessage() {
        return this.a.h();
    }
    
    public final URL getURL() {
        return ((URLConnection)this.a.a).getURL();
    }
    
    public final boolean getUseCaches() {
        return ((URLConnection)this.a.a).getUseCaches();
    }
    
    public final int hashCode() {
        return this.a.a.hashCode();
    }
    
    public final void setAllowUserInteraction(final boolean allowUserInteraction) {
        ((URLConnection)this.a.a).setAllowUserInteraction(allowUserInteraction);
    }
    
    public final void setChunkedStreamingMode(final int chunkedStreamingMode) {
        this.a.a.setChunkedStreamingMode(chunkedStreamingMode);
    }
    
    public final void setConnectTimeout(final int connectTimeout) {
        ((URLConnection)this.a.a).setConnectTimeout(connectTimeout);
    }
    
    public final void setDefaultUseCaches(final boolean defaultUseCaches) {
        ((URLConnection)this.a.a).setDefaultUseCaches(defaultUseCaches);
    }
    
    public final void setDoInput(final boolean doInput) {
        ((URLConnection)this.a.a).setDoInput(doInput);
    }
    
    public final void setDoOutput(final boolean doOutput) {
        ((URLConnection)this.a.a).setDoOutput(doOutput);
    }
    
    public final void setFixedLengthStreamingMode(final int fixedLengthStreamingMode) {
        this.a.a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
    }
    
    public final void setFixedLengthStreamingMode(final long fixedLengthStreamingMode) {
        this.a.a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
    }
    
    public final void setIfModifiedSince(final long ifModifiedSince) {
        ((URLConnection)this.a.a).setIfModifiedSince(ifModifiedSince);
    }
    
    public final void setInstanceFollowRedirects(final boolean instanceFollowRedirects) {
        this.a.a.setInstanceFollowRedirects(instanceFollowRedirects);
    }
    
    public final void setReadTimeout(final int readTimeout) {
        ((URLConnection)this.a.a).setReadTimeout(readTimeout);
    }
    
    public final void setRequestMethod(final String requestMethod) {
        this.a.a.setRequestMethod(requestMethod);
    }
    
    public final void setRequestProperty(final String s, final String h) {
        final e a = this.a;
        a.getClass();
        if ("User-Agent".equalsIgnoreCase(s)) {
            a.b.H = h;
        }
        ((URLConnection)a.a).setRequestProperty(s, h);
    }
    
    public final void setUseCaches(final boolean useCaches) {
        ((URLConnection)this.a.a).setUseCaches(useCaches);
    }
    
    public final String toString() {
        return this.a.a.toString();
    }
    
    public final boolean usingProxy() {
        return this.a.a.usingProxy();
    }
}
