package U3;

import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import Y3.j;
import org.apache.http.client.ResponseHandler;

public final class f implements ResponseHandler
{
    public final ResponseHandler a;
    public final j b;
    public final S3.f c;
    
    public f(final ResponseHandler a, final j b, final S3.f c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object handleResponse(final HttpResponse httpResponse) {
        this.c.j(this.b.a());
        this.c.e(httpResponse.getStatusLine().getStatusCode());
        final Long a = g.a((HttpMessage)httpResponse);
        if (a != null) {
            this.c.i(a);
        }
        final String b = g.b(httpResponse);
        if (b != null) {
            this.c.h(b);
        }
        this.c.b();
        return this.a.handleResponse(httpResponse);
    }
}
