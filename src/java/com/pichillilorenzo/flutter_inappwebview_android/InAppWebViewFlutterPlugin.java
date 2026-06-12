package com.pichillilorenzo.flutter_inappwebview_android;

import o.q1;
import io.flutter.embedding.android.FlutterActivity;
import android.os.Build$VERSION;
import io.flutter.plugin.platform.g;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.h;
import com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingControllerManager;
import com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager;
import com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager;
import com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigManager;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks;
import F4.f;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserManager;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.FlutterWebViewFactory;
import v4.l;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager;
import android.content.Context;
import C4.b;
import android.app.Activity;
import C4.a;
import B4.c;

public class InAppWebViewFlutterPlugin implements c, a
{
    protected static final String LOG_TAG = "InAppWebViewFlutterPL";
    public Activity activity;
    public b activityPluginBinding;
    public Context applicationContext;
    public ChromeSafariBrowserManager chromeSafariBrowserManager;
    public CredentialDatabaseHandler credentialDatabaseHandler;
    public B4.a flutterAssets;
    public l flutterView;
    public FlutterWebViewFactory flutterWebViewFactory;
    public HeadlessInAppWebViewManager headlessInAppWebViewManager;
    public InAppBrowserManager inAppBrowserManager;
    public InAppWebViewManager inAppWebViewManager;
    public f messenger;
    public MyCookieManager myCookieManager;
    public MyWebStorage myWebStorage;
    public NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
    public PlatformUtil platformUtil;
    public PrintJobManager printJobManager;
    public ProcessGlobalConfigManager processGlobalConfigManager;
    public ProxyManager proxyManager;
    public ServiceWorkerManager serviceWorkerManager;
    public TracingControllerManager tracingControllerManager;
    public WebViewFeatureManager webViewFeatureManager;
    
    private void onAttachedToEngine(final Context applicationContext, final f messenger, final Activity activity, final h h, final l flutterView) {
        this.applicationContext = applicationContext;
        this.activity = activity;
        this.messenger = messenger;
        this.flutterView = flutterView;
        this.inAppBrowserManager = new InAppBrowserManager(this);
        this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
        this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
        this.noHistoryCustomTabsActivityCallbacks = new NoHistoryCustomTabsActivityCallbacks(this);
        final FlutterWebViewFactory flutterWebViewFactory = new FlutterWebViewFactory(this);
        this.flutterWebViewFactory = flutterWebViewFactory;
        ((o)h).k("com.pichillilorenzo/flutter_inappwebview", (g)flutterWebViewFactory);
        this.platformUtil = new PlatformUtil(this);
        this.inAppWebViewManager = new InAppWebViewManager(this);
        this.myCookieManager = new MyCookieManager(this);
        this.myWebStorage = new MyWebStorage(this);
        final int sdk_INT = Build$VERSION.SDK_INT;
        this.serviceWorkerManager = new ServiceWorkerManager(this);
        if (sdk_INT >= 26) {
            this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
        }
        this.webViewFeatureManager = new WebViewFeatureManager(this);
        this.proxyManager = new ProxyManager(this);
        this.printJobManager = new PrintJobManager(this);
        this.tracingControllerManager = new TracingControllerManager(this);
        this.processGlobalConfigManager = new ProcessGlobalConfigManager(this);
    }
    
    public void onAttachedToActivity(final b activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        final FlutterActivity activity = (FlutterActivity)((q1)activityPluginBinding).C;
        this.activity = (Activity)activity;
        if (this.noHistoryCustomTabsActivityCallbacks != null) {
            ((Activity)activity).getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
    }
    
    public void onAttachedToEngine(final B4.b b) {
        this.flutterAssets = (B4.a)b.e;
        this.onAttachedToEngine(b.a, b.c, this.activity, (h)b.d, null);
    }
    
    public void onDetachedFromActivity() {
        final Activity activity = this.activity;
        if (activity != null && this.noHistoryCustomTabsActivityCallbacks != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
        this.activityPluginBinding = null;
        this.activity = null;
    }
    
    public void onDetachedFromActivityForConfigChanges() {
        final Activity activity = this.activity;
        if (activity != null && this.noHistoryCustomTabsActivityCallbacks != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
        this.activityPluginBinding = null;
        this.activity = null;
    }
    
    public void onDetachedFromEngine(final B4.b b) {
        final PlatformUtil platformUtil = this.platformUtil;
        if (platformUtil != null) {
            platformUtil.dispose();
            this.platformUtil = null;
        }
        final InAppBrowserManager inAppBrowserManager = this.inAppBrowserManager;
        if (inAppBrowserManager != null) {
            inAppBrowserManager.dispose();
            this.inAppBrowserManager = null;
        }
        final HeadlessInAppWebViewManager headlessInAppWebViewManager = this.headlessInAppWebViewManager;
        if (headlessInAppWebViewManager != null) {
            headlessInAppWebViewManager.dispose();
            this.headlessInAppWebViewManager = null;
        }
        final ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeSafariBrowserManager;
        if (chromeSafariBrowserManager != null) {
            chromeSafariBrowserManager.dispose();
            this.chromeSafariBrowserManager = null;
        }
        final NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks = this.noHistoryCustomTabsActivityCallbacks;
        if (noHistoryCustomTabsActivityCallbacks != null) {
            noHistoryCustomTabsActivityCallbacks.dispose();
            this.noHistoryCustomTabsActivityCallbacks = null;
        }
        final MyCookieManager myCookieManager = this.myCookieManager;
        if (myCookieManager != null) {
            myCookieManager.dispose();
            this.myCookieManager = null;
        }
        final MyWebStorage myWebStorage = this.myWebStorage;
        if (myWebStorage != null) {
            myWebStorage.dispose();
            this.myWebStorage = null;
        }
        final CredentialDatabaseHandler credentialDatabaseHandler = this.credentialDatabaseHandler;
        if (credentialDatabaseHandler != null && Build$VERSION.SDK_INT >= 26) {
            credentialDatabaseHandler.dispose();
            this.credentialDatabaseHandler = null;
        }
        final InAppWebViewManager inAppWebViewManager = this.inAppWebViewManager;
        if (inAppWebViewManager != null) {
            inAppWebViewManager.dispose();
            this.inAppWebViewManager = null;
        }
        final ServiceWorkerManager serviceWorkerManager = this.serviceWorkerManager;
        if (serviceWorkerManager != null) {
            serviceWorkerManager.dispose();
            this.serviceWorkerManager = null;
        }
        final WebViewFeatureManager webViewFeatureManager = this.webViewFeatureManager;
        if (webViewFeatureManager != null) {
            webViewFeatureManager.dispose();
            this.webViewFeatureManager = null;
        }
        final ProxyManager proxyManager = this.proxyManager;
        if (proxyManager != null) {
            proxyManager.dispose();
            this.proxyManager = null;
        }
        final PrintJobManager printJobManager = this.printJobManager;
        if (printJobManager != null) {
            printJobManager.dispose();
            this.printJobManager = null;
        }
        final TracingControllerManager tracingControllerManager = this.tracingControllerManager;
        if (tracingControllerManager != null) {
            tracingControllerManager.dispose();
            this.tracingControllerManager = null;
        }
        final ProcessGlobalConfigManager processGlobalConfigManager = this.processGlobalConfigManager;
        if (processGlobalConfigManager != null) {
            processGlobalConfigManager.dispose();
            this.processGlobalConfigManager = null;
        }
    }
    
    public void onReattachedToActivityForConfigChanges(final b activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        final FlutterActivity activity = (FlutterActivity)((q1)activityPluginBinding).C;
        this.activity = (Activity)activity;
        if (this.noHistoryCustomTabsActivityCallbacks != null) {
            ((Activity)activity).getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
    }
}
