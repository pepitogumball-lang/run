package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

public interface ProfileStoreBoundaryInterface
{
    boolean deleteProfile(final String p0);
    
    List<String> getAllProfileNames();
    
    InvocationHandler getOrCreateProfile(final String p0);
    
    InvocationHandler getProfile(final String p0);
}
