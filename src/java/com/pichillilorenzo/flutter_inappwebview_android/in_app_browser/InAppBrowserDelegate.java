package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import java.util.List;
import android.app.Activity;

public interface InAppBrowserDelegate
{
    void didChangeProgress(final int p0);
    
    void didChangeTitle(final String p0);
    
    void didFailNavigation(final String p0, final int p1, final String p2);
    
    void didFinishNavigation(final String p0);
    
    void didStartNavigation(final String p0);
    
    void didUpdateVisitedHistory(final String p0);
    
    Activity getActivity();
    
    List<ActivityResultListener> getActivityResultListeners();
}
