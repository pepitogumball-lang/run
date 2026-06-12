package org.chromium.support_lib_boundary;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public interface PrefetchOperationCallbackBoundaryInterface
{
    void onFailure(final int p0, final String p1, final int p2);
    
    void onSuccess();
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int DUPLICATE = 2;
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }
}
