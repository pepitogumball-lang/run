package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import G0.c;
import android.view.View;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Map$Entry;
import android.webkit.WebSettings;
import java.util.Collection;
import M.b;
import java.util.HashMap;
import G0.f;
import android.os.Build$VERSION;
import F0.q;
import C3.i;
import G0.z;
import F0.d;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import java.util.ArrayList;
import java.util.Set;
import android.webkit.WebSettings$LayoutAlgorithm;
import java.util.Map;
import java.util.List;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class InAppWebViewSettings implements ISettings<InAppWebViewInterface>
{
    public static final String LOG_TAG = "InAppWebViewSettings";
    public Boolean algorithmicDarkeningAllowed;
    public Boolean allowBackgroundAudioPlaying;
    public Boolean allowContentAccess;
    public Boolean allowFileAccess;
    public Boolean allowFileAccessFromFileURLs;
    public Boolean allowUniversalAccessFromFileURLs;
    public String appCachePath;
    public String applicationNameForUserAgent;
    public Boolean blockNetworkImage;
    public Boolean blockNetworkLoads;
    public Boolean builtInZoomControls;
    public Boolean cacheEnabled;
    public Integer cacheMode;
    @Deprecated
    public Boolean clearCache;
    @Deprecated
    public Boolean clearSessionCache;
    public List<Map<String, Map<String, Object>>> contentBlockers;
    public String cursiveFontFamily;
    public Boolean databaseEnabled;
    public Integer defaultFixedFontSize;
    public Integer defaultFontSize;
    public String defaultTextEncodingName;
    public byte[] defaultVideoPoster;
    public Boolean disableContextMenu;
    public Boolean disableDefaultErrorPage;
    public Boolean disableHorizontalScroll;
    public Boolean disableVerticalScroll;
    public Integer disabledActionModeMenuItems;
    public Boolean displayZoomControls;
    public Boolean domStorageEnabled;
    public Boolean enterpriseAuthenticationAppLinkPolicyEnabled;
    public String fantasyFontFamily;
    public String fixedFontFamily;
    public Integer forceDark;
    public Integer forceDarkStrategy;
    public Boolean geolocationEnabled;
    public Boolean hardwareAcceleration;
    public Boolean horizontalScrollBarEnabled;
    public String horizontalScrollbarThumbColor;
    public String horizontalScrollbarTrackColor;
    public Boolean incognito;
    public Integer initialScale;
    public Boolean interceptOnlyAsyncAjaxRequests;
    public Boolean javaScriptCanOpenWindowsAutomatically;
    public Boolean javaScriptEnabled;
    public WebSettings$LayoutAlgorithm layoutAlgorithm;
    public Boolean loadWithOverviewMode;
    public Boolean loadsImagesAutomatically;
    public Boolean mediaPlaybackRequiresUserGesture;
    public Integer minimumFontSize;
    public Integer minimumLogicalFontSize;
    public Integer mixedContentMode;
    public Boolean needInitialFocus;
    public Boolean networkAvailable;
    public Boolean offscreenPreRaster;
    public Integer overScrollMode;
    public Integer preferredContentMode;
    public String regexToCancelSubFramesLoading;
    public Map<String, Object> rendererPriorityPolicy;
    public Set<String> requestedWithHeaderOriginAllowList;
    public List<String> resourceCustomSchemes;
    public Boolean safeBrowsingEnabled;
    public String sansSerifFontFamily;
    public Boolean saveFormData;
    public Integer scrollBarDefaultDelayBeforeFade;
    public Integer scrollBarFadeDuration;
    public Integer scrollBarStyle;
    public Boolean scrollbarFadingEnabled;
    public String serifFontFamily;
    public String standardFontFamily;
    public Boolean supportMultipleWindows;
    public Boolean supportZoom;
    public Integer textZoom;
    public Boolean thirdPartyCookiesEnabled;
    public Boolean transparentBackground;
    public Boolean useHybridComposition;
    public Boolean useOnDownloadStart;
    public Boolean useOnLoadResource;
    public Boolean useOnRenderProcessGone;
    public Boolean useShouldInterceptAjaxRequest;
    public Boolean useShouldInterceptFetchRequest;
    public Boolean useShouldInterceptRequest;
    public Boolean useShouldOverrideUrlLoading;
    public Boolean useWideViewPort;
    public String userAgent;
    public Boolean verticalScrollBarEnabled;
    public Integer verticalScrollbarPosition;
    public String verticalScrollbarThumbColor;
    public String verticalScrollbarTrackColor;
    public Map<String, Object> webViewAssetLoader;
    
    public InAppWebViewSettings() {
        final Boolean false = Boolean.FALSE;
        this.useShouldOverrideUrlLoading = false;
        this.useOnLoadResource = false;
        this.useOnDownloadStart = false;
        this.clearCache = false;
        this.userAgent = "";
        this.applicationNameForUserAgent = "";
        final Boolean true = Boolean.TRUE;
        this.javaScriptEnabled = true;
        this.javaScriptCanOpenWindowsAutomatically = false;
        this.mediaPlaybackRequiresUserGesture = true;
        final Integer value = 8;
        this.minimumFontSize = value;
        this.verticalScrollBarEnabled = true;
        this.horizontalScrollBarEnabled = true;
        this.resourceCustomSchemes = (List<String>)new ArrayList();
        this.contentBlockers = (List<Map<String, Map<String, Object>>>)new ArrayList();
        this.preferredContentMode = PreferredContentModeOptionType.RECOMMENDED.toValue();
        this.useShouldInterceptAjaxRequest = false;
        this.interceptOnlyAsyncAjaxRequests = true;
        this.useShouldInterceptFetchRequest = false;
        this.incognito = false;
        this.cacheEnabled = true;
        this.transparentBackground = false;
        this.disableVerticalScroll = false;
        this.disableHorizontalScroll = false;
        this.disableContextMenu = false;
        this.supportZoom = true;
        this.allowFileAccessFromFileURLs = false;
        this.allowUniversalAccessFromFileURLs = false;
        this.allowBackgroundAudioPlaying = false;
        this.textZoom = 100;
        this.clearSessionCache = false;
        this.builtInZoomControls = true;
        this.displayZoomControls = false;
        this.databaseEnabled = false;
        this.domStorageEnabled = true;
        this.useWideViewPort = true;
        this.safeBrowsingEnabled = true;
        this.allowContentAccess = true;
        this.allowFileAccess = true;
        this.blockNetworkImage = false;
        this.blockNetworkLoads = false;
        this.cacheMode = -1;
        this.cursiveFontFamily = "cursive";
        final Integer value2 = 16;
        this.defaultFixedFontSize = value2;
        this.defaultFontSize = value2;
        this.defaultTextEncodingName = "UTF-8";
        this.fantasyFontFamily = "fantasy";
        this.fixedFontFamily = "monospace";
        final Integer value3 = 0;
        this.forceDark = value3;
        this.forceDarkStrategy = 2;
        this.geolocationEnabled = true;
        this.loadWithOverviewMode = true;
        this.loadsImagesAutomatically = true;
        this.minimumLogicalFontSize = value;
        this.initialScale = value3;
        this.needInitialFocus = true;
        this.offscreenPreRaster = false;
        this.sansSerifFontFamily = "sans-serif";
        this.serifFontFamily = "sans-serif";
        this.standardFontFamily = "sans-serif";
        this.saveFormData = true;
        this.thirdPartyCookiesEnabled = true;
        this.hardwareAcceleration = true;
        this.supportMultipleWindows = false;
        this.overScrollMode = 1;
        this.networkAvailable = null;
        this.scrollBarStyle = value3;
        this.verticalScrollbarPosition = value3;
        this.scrollBarDefaultDelayBeforeFade = null;
        this.scrollbarFadingEnabled = true;
        this.scrollBarFadeDuration = null;
        this.rendererPriorityPolicy = null;
        this.useShouldInterceptRequest = false;
        this.useOnRenderProcessGone = false;
        this.disableDefaultErrorPage = false;
        this.useHybridComposition = true;
        this.algorithmicDarkeningAllowed = false;
        this.enterpriseAuthenticationAppLinkPolicyEnabled = true;
    }
    
    private String getLayoutAlgorithm() {
        final WebSettings$LayoutAlgorithm layoutAlgorithm = this.layoutAlgorithm;
        if (layoutAlgorithm != null) {
            final int n = InAppWebViewSettings$1.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[((Enum)layoutAlgorithm).ordinal()];
            if (n == 1) {
                return "NORMAL";
            }
            if (n == 2) {
                return "TEXT_AUTOSIZING";
            }
            if (n == 3) {
                return "NARROW_COLUMNS";
            }
        }
        return null;
    }
    
    private void setLayoutAlgorithm(final String s) {
        if (s != null) {
            int n = -1;
            switch (s.hashCode()) {
                case 1561826623: {
                    if (!s.equals((Object)"TEXT_AUTOSIZING")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 1055046617: {
                    if (!s.equals((Object)"NARROW_COLUMNS")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1986416409: {
                    if (!s.equals((Object)"NORMAL")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                case 1: {
                    this.layoutAlgorithm = WebSettings$LayoutAlgorithm.NARROW_COLUMNS;
                }
                case 0: {
                    this.layoutAlgorithm = WebSettings$LayoutAlgorithm.NORMAL;
                }
                case 2: {
                    this.layoutAlgorithm = WebSettings$LayoutAlgorithm.TEXT_AUTOSIZING;
                    break;
                }
            }
        }
    }
    
    @Override
    public Map<String, Object> getRealSettings(final InAppWebViewInterface inAppWebViewInterface) {
        final Map<String, Object> map = this.toMap();
        if (inAppWebViewInterface instanceof InAppWebView) {
            final InAppWebView inAppWebView = (InAppWebView)inAppWebViewInterface;
            final WebSettings settings = inAppWebView.getSettings();
            map.put((Object)"userAgent", (Object)settings.getUserAgentString());
            map.put((Object)"javaScriptEnabled", (Object)settings.getJavaScriptEnabled());
            map.put((Object)"javaScriptCanOpenWindowsAutomatically", (Object)settings.getJavaScriptCanOpenWindowsAutomatically());
            map.put((Object)"mediaPlaybackRequiresUserGesture", (Object)settings.getMediaPlaybackRequiresUserGesture());
            map.put((Object)"minimumFontSize", (Object)settings.getMinimumFontSize());
            map.put((Object)"verticalScrollBarEnabled", (Object)((View)inAppWebView).isVerticalScrollBarEnabled());
            map.put((Object)"horizontalScrollBarEnabled", (Object)((View)inAppWebView).isHorizontalScrollBarEnabled());
            map.put((Object)"textZoom", (Object)settings.getTextZoom());
            map.put((Object)"builtInZoomControls", (Object)settings.getBuiltInZoomControls());
            map.put((Object)"supportZoom", (Object)settings.supportZoom());
            map.put((Object)"displayZoomControls", (Object)settings.getDisplayZoomControls());
            map.put((Object)"databaseEnabled", (Object)settings.getDatabaseEnabled());
            map.put((Object)"domStorageEnabled", (Object)settings.getDomStorageEnabled());
            map.put((Object)"useWideViewPort", (Object)settings.getUseWideViewPort());
            if (d.a("SAFE_BROWSING_ENABLE")) {
                final G0.b b = z.b;
                boolean b2;
                if (b.a()) {
                    b2 = i.z(settings);
                }
                else {
                    if (!((c)b).b()) {
                        throw z.a();
                    }
                    b2 = q.a(settings).g();
                }
                map.put((Object)"safeBrowsingEnabled", (Object)b2);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                map.put((Object)"safeBrowsingEnabled", (Object)i.z(settings));
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            map.put((Object)"mixedContentMode", (Object)settings.getMixedContentMode());
            map.put((Object)"allowContentAccess", (Object)settings.getAllowContentAccess());
            map.put((Object)"allowFileAccess", (Object)settings.getAllowFileAccess());
            map.put((Object)"allowFileAccessFromFileURLs", (Object)settings.getAllowFileAccessFromFileURLs());
            map.put((Object)"allowUniversalAccessFromFileURLs", (Object)settings.getAllowUniversalAccessFromFileURLs());
            map.put((Object)"blockNetworkImage", (Object)settings.getBlockNetworkImage());
            map.put((Object)"blockNetworkLoads", (Object)settings.getBlockNetworkLoads());
            map.put((Object)"cacheMode", (Object)settings.getCacheMode());
            map.put((Object)"cursiveFontFamily", (Object)settings.getCursiveFontFamily());
            map.put((Object)"defaultFixedFontSize", (Object)settings.getDefaultFixedFontSize());
            map.put((Object)"defaultFontSize", (Object)settings.getDefaultFontSize());
            map.put((Object)"defaultTextEncodingName", (Object)settings.getDefaultTextEncodingName());
            if (d.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                z.c.getClass();
                map.put((Object)"disabledActionModeMenuItems", (Object)settings.getDisabledActionModeMenuItems());
            }
            map.put((Object)"disabledActionModeMenuItems", (Object)settings.getDisabledActionModeMenuItems());
            map.put((Object)"fantasyFontFamily", (Object)settings.getFantasyFontFamily());
            map.put((Object)"fixedFontFamily", (Object)settings.getFixedFontFamily());
            if (d.a("FORCE_DARK")) {
                final G0.b h = z.H;
                int n;
                if (h.a()) {
                    n = f.a(settings);
                }
                else {
                    if (!((c)h).b()) {
                        throw z.a();
                    }
                    n = q.a(settings).d();
                }
                map.put((Object)"forceDark", (Object)n);
            }
            else if (sdk_INT >= 29) {
                map.put((Object)"forceDark", (Object)f.a(settings));
            }
            if (d.a("FORCE_DARK_STRATEGY")) {
                if (!((c)z.I).b()) {
                    throw z.a();
                }
                map.put((Object)"forceDarkStrategy", (Object)q.a(settings).d());
            }
            map.put((Object)"layoutAlgorithm", (Object)((Enum)settings.getLayoutAlgorithm()).name());
            map.put((Object)"loadWithOverviewMode", (Object)settings.getLoadWithOverviewMode());
            map.put((Object)"loadsImagesAutomatically", (Object)settings.getLoadsImagesAutomatically());
            map.put((Object)"minimumLogicalFontSize", (Object)settings.getMinimumLogicalFontSize());
            if (d.a("OFF_SCREEN_PRERASTER")) {
                z.a.getClass();
                map.put((Object)"offscreenPreRaster", (Object)settings.getOffscreenPreRaster());
            }
            else {
                map.put((Object)"offscreenPreRaster", (Object)settings.getOffscreenPreRaster());
            }
            map.put((Object)"sansSerifFontFamily", (Object)settings.getSansSerifFontFamily());
            map.put((Object)"serifFontFamily", (Object)settings.getSerifFontFamily());
            map.put((Object)"standardFontFamily", (Object)settings.getStandardFontFamily());
            map.put((Object)"saveFormData", (Object)settings.getSaveFormData());
            map.put((Object)"supportMultipleWindows", (Object)settings.supportMultipleWindows());
            map.put((Object)"overScrollMode", (Object)((View)inAppWebView).getOverScrollMode());
            map.put((Object)"scrollBarStyle", (Object)((View)inAppWebView).getScrollBarStyle());
            map.put((Object)"verticalScrollbarPosition", (Object)((View)inAppWebView).getVerticalScrollbarPosition());
            map.put((Object)"scrollBarDefaultDelayBeforeFade", (Object)((View)inAppWebView).getScrollBarDefaultDelayBeforeFade());
            map.put((Object)"scrollbarFadingEnabled", (Object)((View)inAppWebView).isScrollbarFadingEnabled());
            map.put((Object)"scrollBarFadeDuration", (Object)((View)inAppWebView).getScrollBarFadeDuration());
            if (sdk_INT >= 26) {
                final HashMap hashMap = new HashMap();
                hashMap.put((Object)"rendererRequestedPriority", (Object)b.b(inAppWebView));
                hashMap.put((Object)"waivedWhenNotVisible", (Object)b.C(inAppWebView));
                map.put((Object)"rendererPriorityPolicy", (Object)hashMap);
            }
            if (d.a("ALGORITHMIC_DARKENING") && sdk_INT >= 29) {
                if (!z.E.b()) {
                    throw z.a();
                }
                map.put((Object)"algorithmicDarkeningAllowed", (Object)q.a(settings).i());
            }
            if (d.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
                if (!((c)z.N).b()) {
                    throw z.a();
                }
                map.put((Object)"enterpriseAuthenticationAppLinkPolicyEnabled", (Object)q.a(settings).c());
            }
            if (d.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
                if (!((c)z.P).b()) {
                    throw z.a();
                }
                map.put((Object)"requestedWithHeaderOriginAllowList", (Object)new ArrayList((Collection)q.a(settings).f()));
            }
        }
        return map;
    }
    
    @Override
    public InAppWebViewSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            int n = -1;
            switch (s.hashCode()) {
                case 2086547246: {
                    if (!s.equals((Object)"algorithmicDarkeningAllowed")) {
                        break;
                    }
                    n = 88;
                    break;
                }
                case 2056553639: {
                    if (!s.equals((Object)"defaultVideoPoster")) {
                        break;
                    }
                    n = 87;
                    break;
                }
                case 2038327673: {
                    if (!s.equals((Object)"clearSessionCache")) {
                        break;
                    }
                    n = 86;
                    break;
                }
                case 2011947505: {
                    if (!s.equals((Object)"verticalScrollBarEnabled")) {
                        break;
                    }
                    n = 85;
                    break;
                }
                case 1956631083: {
                    if (!s.equals((Object)"minimumLogicalFontSize")) {
                        break;
                    }
                    n = 84;
                    break;
                }
                case 1812525393: {
                    if (!s.equals((Object)"thirdPartyCookiesEnabled")) {
                        break;
                    }
                    n = 83;
                    break;
                }
                case 1793491907: {
                    if (!s.equals((Object)"defaultFixedFontSize")) {
                        break;
                    }
                    n = 82;
                    break;
                }
                case 1774215812: {
                    if (!s.equals((Object)"supportMultipleWindows")) {
                        break;
                    }
                    n = 81;
                    break;
                }
                case 1759079762: {
                    if (!s.equals((Object)"contentBlockers")) {
                        break;
                    }
                    n = 80;
                    break;
                }
                case 1583791742: {
                    if (!s.equals((Object)"disableDefaultErrorPage")) {
                        break;
                    }
                    n = 79;
                    break;
                }
                case 1527546113: {
                    if (!s.equals((Object)"forceDark")) {
                        break;
                    }
                    n = 78;
                    break;
                }
                case 1519451805: {
                    if (!s.equals((Object)"verticalScrollbarThumbColor")) {
                        break;
                    }
                    n = 77;
                    break;
                }
                case 1496887792: {
                    if (!s.equals((Object)"serifFontFamily")) {
                        break;
                    }
                    n = 76;
                    break;
                }
                case 1474890029: {
                    if (!s.equals((Object)"safeBrowsingEnabled")) {
                        break;
                    }
                    n = 75;
                    break;
                }
                case 1409728424: {
                    if (!s.equals((Object)"loadWithOverviewMode")) {
                        break;
                    }
                    n = 74;
                    break;
                }
                case 1344414299: {
                    if (!s.equals((Object)"geolocationEnabled")) {
                        break;
                    }
                    n = 73;
                    break;
                }
                case 1320461707: {
                    if (!s.equals((Object)"displayZoomControls")) {
                        break;
                    }
                    n = 72;
                    break;
                }
                case 1301942064: {
                    if (!s.equals((Object)"standardFontFamily")) {
                        break;
                    }
                    n = 71;
                    break;
                }
                case 1193086767: {
                    if (!s.equals((Object)"horizontalScrollbarThumbColor")) {
                        break;
                    }
                    n = 70;
                    break;
                }
                case 1156608422: {
                    if (!s.equals((Object)"appCachePath")) {
                        break;
                    }
                    n = 69;
                    break;
                }
                case 1138246185: {
                    if (!s.equals((Object)"allowFileAccess")) {
                        break;
                    }
                    n = 68;
                    break;
                }
                case 849171798: {
                    if (!s.equals((Object)"scrollBarFadeDuration")) {
                        break;
                    }
                    n = 67;
                    break;
                }
                case 760962753: {
                    if (!s.equals((Object)"mixedContentMode")) {
                        break;
                    }
                    n = 66;
                    break;
                }
                case 590869196: {
                    if (!s.equals((Object)"applicationNameForUserAgent")) {
                        break;
                    }
                    n = 65;
                    break;
                }
                case 487904071: {
                    if (!s.equals((Object)"useHybridComposition")) {
                        break;
                    }
                    n = 64;
                    break;
                }
                case 477312960: {
                    if (!s.equals((Object)"requestedWithHeaderOriginAllowList")) {
                        break;
                    }
                    n = 63;
                    break;
                }
                case 408799019: {
                    if (!s.equals((Object)"saveFormData")) {
                        break;
                    }
                    n = 62;
                    break;
                }
                case 397237599: {
                    if (!s.equals((Object)"cacheEnabled")) {
                        break;
                    }
                    n = 61;
                    break;
                }
                case 393481210: {
                    if (!s.equals((Object)"useOnLoadResource")) {
                        break;
                    }
                    n = 60;
                    break;
                }
                case 387230482: {
                    if (!s.equals((Object)"useOnRenderProcessGone")) {
                        break;
                    }
                    n = 59;
                    break;
                }
                case 311430650: {
                    if (!s.equals((Object)"userAgent")) {
                        break;
                    }
                    n = 58;
                    break;
                }
                case 298870764: {
                    if (!s.equals((Object)"blockNetworkLoads")) {
                        break;
                    }
                    n = 57;
                    break;
                }
                case 296040698: {
                    if (!s.equals((Object)"blockNetworkImage")) {
                        break;
                    }
                    n = 56;
                    break;
                }
                case 273267153: {
                    if (!s.equals((Object)"mediaPlaybackRequiresUserGesture")) {
                        break;
                    }
                    n = 55;
                    break;
                }
                case 257886264: {
                    if (!s.equals((Object)"cursiveFontFamily")) {
                        break;
                    }
                    n = 54;
                    break;
                }
                case 229242772: {
                    if (!s.equals((Object)"forceDarkStrategy")) {
                        break;
                    }
                    n = 53;
                    break;
                }
                case 174479508: {
                    if (!s.equals((Object)"useOnDownloadStart")) {
                        break;
                    }
                    n = 52;
                    break;
                }
                case 100868168: {
                    if (!s.equals((Object)"verticalScrollbarTrackColor")) {
                        break;
                    }
                    n = 51;
                    break;
                }
                case 57717170: {
                    if (!s.equals((Object)"regexToCancelSubFramesLoading")) {
                        break;
                    }
                    n = 50;
                    break;
                }
                case -98561827: {
                    if (!s.equals((Object)"sansSerifFontFamily")) {
                        break;
                    }
                    n = 49;
                    break;
                }
                case -158057575: {
                    if (!s.equals((Object)"rendererPriorityPolicy")) {
                        break;
                    }
                    n = 48;
                    break;
                }
                case -216514471: {
                    if (!s.equals((Object)"fantasyFontFamily")) {
                        break;
                    }
                    n = 47;
                    break;
                }
                case -225165915: {
                    if (!s.equals((Object)"offscreenPreRaster")) {
                        break;
                    }
                    n = 46;
                    break;
                }
                case -225496870: {
                    if (!s.equals((Object)"horizontalScrollbarTrackColor")) {
                        break;
                    }
                    n = 45;
                    break;
                }
                case -227577491: {
                    if (!s.equals((Object)"javaScriptCanOpenWindowsAutomatically")) {
                        break;
                    }
                    n = 44;
                    break;
                }
                case -229178645: {
                    if (!s.equals((Object)"disableVerticalScroll")) {
                        break;
                    }
                    n = 43;
                    break;
                }
                case -321425255: {
                    if (!s.equals((Object)"verticalScrollbarPosition")) {
                        break;
                    }
                    n = 42;
                    break;
                }
                case -421090202: {
                    if (!s.equals((Object)"initialScale")) {
                        break;
                    }
                    n = 41;
                    break;
                }
                case -435719349: {
                    if (!s.equals((Object)"scrollBarStyle")) {
                        break;
                    }
                    n = 40;
                    break;
                }
                case -443422049: {
                    if (!s.equals((Object)"horizontalScrollBarEnabled")) {
                        break;
                    }
                    n = 39;
                    break;
                }
                case -553792443: {
                    if (!s.equals((Object)"cacheMode")) {
                        break;
                    }
                    n = 38;
                    break;
                }
                case -706772569: {
                    if (!s.equals((Object)"useShouldInterceptRequest")) {
                        break;
                    }
                    n = 37;
                    break;
                }
                case -710246074: {
                    if (!s.equals((Object)"databaseEnabled")) {
                        break;
                    }
                    n = 36;
                    break;
                }
                case -728016272: {
                    if (!s.equals((Object)"allowUniversalAccessFromFileURLs")) {
                        break;
                    }
                    n = 35;
                    break;
                }
                case -741649011: {
                    if (!s.equals((Object)"enterpriseAuthenticationAppLinkPolicyEnabled")) {
                        break;
                    }
                    n = 34;
                    break;
                }
                case -742944736: {
                    if (!s.equals((Object)"transparentBackground")) {
                        break;
                    }
                    n = 33;
                    break;
                }
                case -759238347: {
                    if (!s.equals((Object)"clearCache")) {
                        break;
                    }
                    n = 32;
                    break;
                }
                case -767637403: {
                    if (!s.equals((Object)"layoutAlgorithm")) {
                        break;
                    }
                    n = 31;
                    break;
                }
                case -800676066: {
                    if (!s.equals((Object)"minimumFontSize")) {
                        break;
                    }
                    n = 30;
                    break;
                }
                case -868328270: {
                    if (!s.equals((Object)"interceptOnlyAsyncAjaxRequests")) {
                        break;
                    }
                    n = 29;
                    break;
                }
                case -1003454816: {
                    if (!s.equals((Object)"textZoom")) {
                        break;
                    }
                    n = 28;
                    break;
                }
                case -1038715033: {
                    if (!s.equals((Object)"useShouldInterceptAjaxRequest")) {
                        break;
                    }
                    n = 27;
                    break;
                }
                case -1143245914: {
                    if (!s.equals((Object)"disableContextMenu")) {
                        break;
                    }
                    n = 26;
                    break;
                }
                case -1146673624: {
                    if (!s.equals((Object)"domStorageEnabled")) {
                        break;
                    }
                    n = 25;
                    break;
                }
                case -1321236988: {
                    if (!s.equals((Object)"overScrollMode")) {
                        break;
                    }
                    n = 24;
                    break;
                }
                case -1349570230: {
                    if (!s.equals((Object)"webViewAssetLoader")) {
                        break;
                    }
                    n = 23;
                    break;
                }
                case -1410791825: {
                    if (!s.equals((Object)"allowBackgroundAudioPlaying")) {
                        break;
                    }
                    n = 22;
                    break;
                }
                case -1423657812: {
                    if (!s.equals((Object)"incognito")) {
                        break;
                    }
                    n = 21;
                    break;
                }
                case -1443655540: {
                    if (!s.equals((Object)"disabledActionModeMenuItems")) {
                        break;
                    }
                    n = 20;
                    break;
                }
                case -1455624881: {
                    if (!s.equals((Object)"resourceCustomSchemes")) {
                        break;
                    }
                    n = 19;
                    break;
                }
                case -1480607106: {
                    if (!s.equals((Object)"loadsImagesAutomatically")) {
                        break;
                    }
                    n = 18;
                    break;
                }
                case -1574470051: {
                    if (!s.equals((Object)"useShouldInterceptFetchRequest")) {
                        break;
                    }
                    n = 17;
                    break;
                }
                case -1578507205: {
                    if (!s.equals((Object)"networkAvailable")) {
                        break;
                    }
                    n = 16;
                    break;
                }
                case -1578962296: {
                    if (!s.equals((Object)"hardwareAcceleration")) {
                        break;
                    }
                    n = 15;
                    break;
                }
                case -1607633676: {
                    if (!s.equals((Object)"javaScriptEnabled")) {
                        break;
                    }
                    n = 14;
                    break;
                }
                case -1615103092: {
                    if (!s.equals((Object)"builtInZoomControls")) {
                        break;
                    }
                    n = 13;
                    break;
                }
                case -1626497241: {
                    if (!s.equals((Object)"fixedFontFamily")) {
                        break;
                    }
                    n = 12;
                    break;
                }
                case -1657552268: {
                    if (!s.equals((Object)"allowContentAccess")) {
                        break;
                    }
                    n = 11;
                    break;
                }
                case -1673892229: {
                    if (!s.equals((Object)"preferredContentMode")) {
                        break;
                    }
                    n = 10;
                    break;
                }
                case -1712086669: {
                    if (!s.equals((Object)"useShouldOverrideUrlLoading")) {
                        break;
                    }
                    n = 9;
                    break;
                }
                case -1746033750: {
                    if (!s.equals((Object)"needInitialFocus")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case -1834028884: {
                    if (!s.equals((Object)"defaultTextEncodingName")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case -1845480382: {
                    if (!s.equals((Object)"scrollbarFadingEnabled")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case -1851090878: {
                    if (!s.equals((Object)"supportZoom")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case -1931277743: {
                    if (!s.equals((Object)"defaultFontSize")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -2014672109: {
                    if (!s.equals((Object)"allowFileAccessFromFileURLs")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -2020146208: {
                    if (!s.equals((Object)"useWideViewPort")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -2095822429: {
                    if (!s.equals((Object)"scrollBarDefaultDelayBeforeFade")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -2116596967: {
                    if (!s.equals((Object)"disableHorizontalScroll")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    continue;
                }
                case 88: {
                    this.algorithmicDarkeningAllowed = (Boolean)value;
                    continue;
                }
                case 87: {
                    this.defaultVideoPoster = (byte[])value;
                    continue;
                }
                case 86: {
                    this.clearSessionCache = (Boolean)value;
                    continue;
                }
                case 85: {
                    this.verticalScrollBarEnabled = (Boolean)value;
                    continue;
                }
                case 84: {
                    this.minimumLogicalFontSize = (Integer)value;
                    continue;
                }
                case 83: {
                    this.thirdPartyCookiesEnabled = (Boolean)value;
                    continue;
                }
                case 82: {
                    this.defaultFixedFontSize = (Integer)value;
                    continue;
                }
                case 81: {
                    this.supportMultipleWindows = (Boolean)value;
                    continue;
                }
                case 80: {
                    this.contentBlockers = (List<Map<String, Map<String, Object>>>)value;
                    continue;
                }
                case 79: {
                    this.disableDefaultErrorPage = (Boolean)value;
                    continue;
                }
                case 78: {
                    this.forceDark = (Integer)value;
                    continue;
                }
                case 77: {
                    this.verticalScrollbarThumbColor = (String)value;
                    continue;
                }
                case 76: {
                    this.serifFontFamily = (String)value;
                    continue;
                }
                case 75: {
                    this.safeBrowsingEnabled = (Boolean)value;
                    continue;
                }
                case 74: {
                    this.loadWithOverviewMode = (Boolean)value;
                    continue;
                }
                case 73: {
                    this.geolocationEnabled = (Boolean)value;
                    continue;
                }
                case 72: {
                    this.displayZoomControls = (Boolean)value;
                    continue;
                }
                case 71: {
                    this.standardFontFamily = (String)value;
                    continue;
                }
                case 70: {
                    this.horizontalScrollbarThumbColor = (String)value;
                    continue;
                }
                case 69: {
                    this.appCachePath = (String)value;
                    continue;
                }
                case 68: {
                    this.allowFileAccess = (Boolean)value;
                    continue;
                }
                case 67: {
                    this.scrollBarFadeDuration = (Integer)value;
                    continue;
                }
                case 66: {
                    this.mixedContentMode = (Integer)value;
                    continue;
                }
                case 65: {
                    this.applicationNameForUserAgent = (String)value;
                    continue;
                }
                case 64: {
                    this.useHybridComposition = (Boolean)value;
                    continue;
                }
                case 63: {
                    this.requestedWithHeaderOriginAllowList = (Set<String>)new HashSet((Collection)value);
                    continue;
                }
                case 62: {
                    this.saveFormData = (Boolean)value;
                    continue;
                }
                case 61: {
                    this.cacheEnabled = (Boolean)value;
                    continue;
                }
                case 60: {
                    this.useOnLoadResource = (Boolean)value;
                    continue;
                }
                case 59: {
                    this.useOnRenderProcessGone = (Boolean)value;
                    continue;
                }
                case 58: {
                    this.userAgent = (String)value;
                    continue;
                }
                case 57: {
                    this.blockNetworkLoads = (Boolean)value;
                    continue;
                }
                case 56: {
                    this.blockNetworkImage = (Boolean)value;
                    continue;
                }
                case 55: {
                    this.mediaPlaybackRequiresUserGesture = (Boolean)value;
                    continue;
                }
                case 54: {
                    this.cursiveFontFamily = (String)value;
                    continue;
                }
                case 53: {
                    this.forceDarkStrategy = (Integer)value;
                    continue;
                }
                case 52: {
                    this.useOnDownloadStart = (Boolean)value;
                    continue;
                }
                case 51: {
                    this.verticalScrollbarTrackColor = (String)value;
                    continue;
                }
                case 50: {
                    this.regexToCancelSubFramesLoading = (String)value;
                    continue;
                }
                case 49: {
                    this.sansSerifFontFamily = (String)value;
                    continue;
                }
                case 48: {
                    this.rendererPriorityPolicy = (Map<String, Object>)value;
                    continue;
                }
                case 47: {
                    this.fantasyFontFamily = (String)value;
                    continue;
                }
                case 46: {
                    this.offscreenPreRaster = (Boolean)value;
                    continue;
                }
                case 45: {
                    this.horizontalScrollbarTrackColor = (String)value;
                    continue;
                }
                case 44: {
                    this.javaScriptCanOpenWindowsAutomatically = (Boolean)value;
                    continue;
                }
                case 43: {
                    this.disableVerticalScroll = (Boolean)value;
                    continue;
                }
                case 42: {
                    this.verticalScrollbarPosition = (Integer)value;
                    continue;
                }
                case 41: {
                    this.initialScale = (Integer)value;
                    continue;
                }
                case 40: {
                    this.scrollBarStyle = (Integer)value;
                    continue;
                }
                case 39: {
                    this.horizontalScrollBarEnabled = (Boolean)value;
                    continue;
                }
                case 38: {
                    this.cacheMode = (Integer)value;
                    continue;
                }
                case 37: {
                    this.useShouldInterceptRequest = (Boolean)value;
                    continue;
                }
                case 36: {
                    this.databaseEnabled = (Boolean)value;
                    continue;
                }
                case 35: {
                    this.allowUniversalAccessFromFileURLs = (Boolean)value;
                    continue;
                }
                case 34: {
                    this.enterpriseAuthenticationAppLinkPolicyEnabled = (Boolean)value;
                    continue;
                }
                case 33: {
                    this.transparentBackground = (Boolean)value;
                    continue;
                }
                case 32: {
                    this.clearCache = (Boolean)value;
                    continue;
                }
                case 31: {
                    this.setLayoutAlgorithm((String)value);
                    continue;
                }
                case 30: {
                    this.minimumFontSize = (Integer)value;
                    continue;
                }
                case 29: {
                    this.interceptOnlyAsyncAjaxRequests = (Boolean)value;
                    continue;
                }
                case 28: {
                    this.textZoom = (Integer)value;
                    continue;
                }
                case 27: {
                    this.useShouldInterceptAjaxRequest = (Boolean)value;
                    continue;
                }
                case 26: {
                    this.disableContextMenu = (Boolean)value;
                    continue;
                }
                case 25: {
                    this.domStorageEnabled = (Boolean)value;
                    continue;
                }
                case 24: {
                    this.overScrollMode = (Integer)value;
                    continue;
                }
                case 23: {
                    this.webViewAssetLoader = (Map<String, Object>)value;
                    continue;
                }
                case 22: {
                    this.allowBackgroundAudioPlaying = (Boolean)value;
                    continue;
                }
                case 21: {
                    this.incognito = (Boolean)value;
                    continue;
                }
                case 20: {
                    this.disabledActionModeMenuItems = (Integer)value;
                    continue;
                }
                case 19: {
                    this.resourceCustomSchemes = (List<String>)value;
                    continue;
                }
                case 18: {
                    this.loadsImagesAutomatically = (Boolean)value;
                    continue;
                }
                case 17: {
                    this.useShouldInterceptFetchRequest = (Boolean)value;
                    continue;
                }
                case 16: {
                    this.networkAvailable = (Boolean)value;
                    continue;
                }
                case 15: {
                    this.hardwareAcceleration = (Boolean)value;
                    continue;
                }
                case 14: {
                    this.javaScriptEnabled = (Boolean)value;
                    continue;
                }
                case 13: {
                    this.builtInZoomControls = (Boolean)value;
                    continue;
                }
                case 12: {
                    this.fixedFontFamily = (String)value;
                    continue;
                }
                case 11: {
                    this.allowContentAccess = (Boolean)value;
                    continue;
                }
                case 10: {
                    this.preferredContentMode = (Integer)value;
                    continue;
                }
                case 9: {
                    this.useShouldOverrideUrlLoading = (Boolean)value;
                    continue;
                }
                case 8: {
                    this.needInitialFocus = (Boolean)value;
                    continue;
                }
                case 7: {
                    this.defaultTextEncodingName = (String)value;
                    continue;
                }
                case 6: {
                    this.scrollbarFadingEnabled = (Boolean)value;
                    continue;
                }
                case 5: {
                    this.supportZoom = (Boolean)value;
                    continue;
                }
                case 4: {
                    this.defaultFontSize = (Integer)value;
                    continue;
                }
                case 3: {
                    this.allowFileAccessFromFileURLs = (Boolean)value;
                    continue;
                }
                case 2: {
                    this.useWideViewPort = (Boolean)value;
                    continue;
                }
                case 1: {
                    this.scrollBarDefaultDelayBeforeFade = (Integer)value;
                    continue;
                }
                case 0: {
                    this.disableHorizontalScroll = (Boolean)value;
                    continue;
                }
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"useShouldOverrideUrlLoading", (Object)this.useShouldOverrideUrlLoading);
        hashMap.put((Object)"useOnLoadResource", (Object)this.useOnLoadResource);
        hashMap.put((Object)"useOnDownloadStart", (Object)this.useOnDownloadStart);
        hashMap.put((Object)"clearCache", (Object)this.clearCache);
        hashMap.put((Object)"userAgent", (Object)this.userAgent);
        hashMap.put((Object)"applicationNameForUserAgent", (Object)this.applicationNameForUserAgent);
        hashMap.put((Object)"javaScriptEnabled", (Object)this.javaScriptEnabled);
        hashMap.put((Object)"javaScriptCanOpenWindowsAutomatically", (Object)this.javaScriptCanOpenWindowsAutomatically);
        hashMap.put((Object)"mediaPlaybackRequiresUserGesture", (Object)this.mediaPlaybackRequiresUserGesture);
        hashMap.put((Object)"minimumFontSize", (Object)this.minimumFontSize);
        hashMap.put((Object)"verticalScrollBarEnabled", (Object)this.verticalScrollBarEnabled);
        hashMap.put((Object)"horizontalScrollBarEnabled", (Object)this.horizontalScrollBarEnabled);
        hashMap.put((Object)"resourceCustomSchemes", (Object)this.resourceCustomSchemes);
        hashMap.put((Object)"contentBlockers", (Object)this.contentBlockers);
        hashMap.put((Object)"preferredContentMode", (Object)this.preferredContentMode);
        hashMap.put((Object)"useShouldInterceptAjaxRequest", (Object)this.useShouldInterceptAjaxRequest);
        hashMap.put((Object)"interceptOnlyAsyncAjaxRequests", (Object)this.interceptOnlyAsyncAjaxRequests);
        hashMap.put((Object)"useShouldInterceptFetchRequest", (Object)this.useShouldInterceptFetchRequest);
        hashMap.put((Object)"incognito", (Object)this.incognito);
        hashMap.put((Object)"cacheEnabled", (Object)this.cacheEnabled);
        hashMap.put((Object)"transparentBackground", (Object)this.transparentBackground);
        hashMap.put((Object)"disableVerticalScroll", (Object)this.disableVerticalScroll);
        hashMap.put((Object)"disableHorizontalScroll", (Object)this.disableHorizontalScroll);
        hashMap.put((Object)"disableContextMenu", (Object)this.disableContextMenu);
        hashMap.put((Object)"textZoom", (Object)this.textZoom);
        hashMap.put((Object)"clearSessionCache", (Object)this.clearSessionCache);
        hashMap.put((Object)"builtInZoomControls", (Object)this.builtInZoomControls);
        hashMap.put((Object)"displayZoomControls", (Object)this.displayZoomControls);
        hashMap.put((Object)"supportZoom", (Object)this.supportZoom);
        hashMap.put((Object)"databaseEnabled", (Object)this.databaseEnabled);
        hashMap.put((Object)"domStorageEnabled", (Object)this.domStorageEnabled);
        hashMap.put((Object)"useWideViewPort", (Object)this.useWideViewPort);
        hashMap.put((Object)"safeBrowsingEnabled", (Object)this.safeBrowsingEnabled);
        hashMap.put((Object)"mixedContentMode", (Object)this.mixedContentMode);
        hashMap.put((Object)"allowContentAccess", (Object)this.allowContentAccess);
        hashMap.put((Object)"allowFileAccess", (Object)this.allowFileAccess);
        hashMap.put((Object)"allowFileAccessFromFileURLs", (Object)this.allowFileAccessFromFileURLs);
        hashMap.put((Object)"allowUniversalAccessFromFileURLs", (Object)this.allowUniversalAccessFromFileURLs);
        hashMap.put((Object)"appCachePath", (Object)this.appCachePath);
        hashMap.put((Object)"blockNetworkImage", (Object)this.blockNetworkImage);
        hashMap.put((Object)"blockNetworkLoads", (Object)this.blockNetworkLoads);
        hashMap.put((Object)"cacheMode", (Object)this.cacheMode);
        hashMap.put((Object)"cursiveFontFamily", (Object)this.cursiveFontFamily);
        hashMap.put((Object)"defaultFixedFontSize", (Object)this.defaultFixedFontSize);
        hashMap.put((Object)"defaultFontSize", (Object)this.defaultFontSize);
        hashMap.put((Object)"defaultTextEncodingName", (Object)this.defaultTextEncodingName);
        hashMap.put((Object)"disabledActionModeMenuItems", (Object)this.disabledActionModeMenuItems);
        hashMap.put((Object)"fantasyFontFamily", (Object)this.fantasyFontFamily);
        hashMap.put((Object)"fixedFontFamily", (Object)this.fixedFontFamily);
        hashMap.put((Object)"forceDark", (Object)this.forceDark);
        hashMap.put((Object)"forceDarkStrategy", (Object)this.forceDarkStrategy);
        hashMap.put((Object)"geolocationEnabled", (Object)this.geolocationEnabled);
        hashMap.put((Object)"layoutAlgorithm", (Object)this.getLayoutAlgorithm());
        hashMap.put((Object)"loadWithOverviewMode", (Object)this.loadWithOverviewMode);
        hashMap.put((Object)"loadsImagesAutomatically", (Object)this.loadsImagesAutomatically);
        hashMap.put((Object)"minimumLogicalFontSize", (Object)this.minimumLogicalFontSize);
        hashMap.put((Object)"initialScale", (Object)this.initialScale);
        hashMap.put((Object)"needInitialFocus", (Object)this.needInitialFocus);
        hashMap.put((Object)"offscreenPreRaster", (Object)this.offscreenPreRaster);
        hashMap.put((Object)"sansSerifFontFamily", (Object)this.sansSerifFontFamily);
        hashMap.put((Object)"serifFontFamily", (Object)this.serifFontFamily);
        hashMap.put((Object)"standardFontFamily", (Object)this.standardFontFamily);
        hashMap.put((Object)"saveFormData", (Object)this.saveFormData);
        hashMap.put((Object)"thirdPartyCookiesEnabled", (Object)this.thirdPartyCookiesEnabled);
        hashMap.put((Object)"hardwareAcceleration", (Object)this.hardwareAcceleration);
        hashMap.put((Object)"supportMultipleWindows", (Object)this.supportMultipleWindows);
        hashMap.put((Object)"regexToCancelSubFramesLoading", (Object)this.regexToCancelSubFramesLoading);
        hashMap.put((Object)"overScrollMode", (Object)this.overScrollMode);
        hashMap.put((Object)"networkAvailable", (Object)this.networkAvailable);
        hashMap.put((Object)"scrollBarStyle", (Object)this.scrollBarStyle);
        hashMap.put((Object)"verticalScrollbarPosition", (Object)this.verticalScrollbarPosition);
        hashMap.put((Object)"scrollBarDefaultDelayBeforeFade", (Object)this.scrollBarDefaultDelayBeforeFade);
        hashMap.put((Object)"scrollbarFadingEnabled", (Object)this.scrollbarFadingEnabled);
        hashMap.put((Object)"scrollBarFadeDuration", (Object)this.scrollBarFadeDuration);
        hashMap.put((Object)"rendererPriorityPolicy", (Object)this.rendererPriorityPolicy);
        hashMap.put((Object)"useShouldInterceptRequest", (Object)this.useShouldInterceptRequest);
        hashMap.put((Object)"useOnRenderProcessGone", (Object)this.useOnRenderProcessGone);
        hashMap.put((Object)"disableDefaultErrorPage", (Object)this.disableDefaultErrorPage);
        hashMap.put((Object)"useHybridComposition", (Object)this.useHybridComposition);
        hashMap.put((Object)"verticalScrollbarThumbColor", (Object)this.verticalScrollbarThumbColor);
        hashMap.put((Object)"verticalScrollbarTrackColor", (Object)this.verticalScrollbarTrackColor);
        hashMap.put((Object)"horizontalScrollbarThumbColor", (Object)this.horizontalScrollbarThumbColor);
        hashMap.put((Object)"horizontalScrollbarTrackColor", (Object)this.horizontalScrollbarTrackColor);
        hashMap.put((Object)"algorithmicDarkeningAllowed", (Object)this.algorithmicDarkeningAllowed);
        hashMap.put((Object)"enterpriseAuthenticationAppLinkPolicyEnabled", (Object)this.enterpriseAuthenticationAppLinkPolicyEnabled);
        hashMap.put((Object)"allowBackgroundAudioPlaying", (Object)this.allowBackgroundAudioPlaying);
        hashMap.put((Object)"defaultVideoPoster", (Object)this.defaultVideoPoster);
        ArrayList list;
        if (this.requestedWithHeaderOriginAllowList != null) {
            list = new ArrayList((Collection)this.requestedWithHeaderOriginAllowList);
        }
        else {
            list = null;
        }
        hashMap.put((Object)"requestedWithHeaderOriginAllowList", (Object)list);
        return (Map<String, Object>)hashMap;
    }
}
