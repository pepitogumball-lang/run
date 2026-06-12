package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

public interface WebStorageBoundaryInterface
{
    void deleteBrowsingData(final Executor p0, final Runnable p1);
    
    String deleteBrowsingDataForSite(final String p0, final Executor p1, final Runnable p2);
}
