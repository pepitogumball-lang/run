package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import java.util.Iterator;
import io.flutter.embedding.android.FlutterActivity;
import android.os.Bundle;
import android.app.Activity;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import java.util.Map;
import android.app.Application$ActivityLifecycleCallbacks;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class NoHistoryCustomTabsActivityCallbacks implements Disposable
{
    public Application$ActivityLifecycleCallbacks activityLifecycleCallbacks;
    public final Map<String, String> noHistoryBrowserIDs;
    public InAppWebViewFlutterPlugin plugin;
    
    public NoHistoryCustomTabsActivityCallbacks(final InAppWebViewFlutterPlugin plugin) {
        this.noHistoryBrowserIDs = (Map<String, String>)new HashMap();
        this.activityLifecycleCallbacks = (Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks(this) {
            final NoHistoryCustomTabsActivityCallbacks this$0;
            
            public void onActivityCreated(final Activity activity, final Bundle bundle) {
            }
            
            public void onActivityDestroyed(final Activity activity) {
            }
            
            public void onActivityPaused(final Activity activity) {
            }
            
            public void onActivityResumed(final Activity activity) {
                if (activity instanceof FlutterActivity) {
                    final NoHistoryCustomTabsActivityCallbacks this$0 = this.this$0;
                    final InAppWebViewFlutterPlugin plugin = this$0.plugin;
                    if (plugin != null && plugin.chromeSafariBrowserManager != null) {
                        for (final String s : this$0.noHistoryBrowserIDs.values()) {
                            if (s != null) {
                                this.this$0.noHistoryBrowserIDs.put((Object)s, (Object)null);
                                final ChromeCustomTabsActivity chromeCustomTabsActivity = (ChromeCustomTabsActivity)this.this$0.plugin.chromeSafariBrowserManager.browsers.get((Object)s);
                                if (chromeCustomTabsActivity == null) {
                                    continue;
                                }
                                chromeCustomTabsActivity.close();
                                chromeCustomTabsActivity.dispose();
                            }
                        }
                    }
                }
            }
            
            public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
            }
            
            public void onActivityStarted(final Activity activity) {
            }
            
            public void onActivityStopped(final Activity activity) {
            }
        };
        this.plugin = plugin;
    }
    
    @Override
    public void dispose() {
        this.noHistoryBrowserIDs.clear();
        this.plugin = null;
    }
}
