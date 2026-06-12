package q0;

import n5.h;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

public final class d extends f
{
    public final int b;
    
    @Override
    public GetTopicsRequest a(final a a) {
        switch (this.b) {
            default: {
                return super.a(a);
            }
            case 1: {
                h.e("request", a);
                final GetTopicsRequest i = E4.a.i(E4.a.h(E4.a.g(E4.a.f()), a.a));
                h.d("Builder()\n            .s\u2026ion)\n            .build()", i);
                return i;
            }
        }
    }
}
