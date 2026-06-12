package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface
{
    void postMessage(final String p0);
    
    void postMessageWithPayload(final InvocationHandler p0);
}
