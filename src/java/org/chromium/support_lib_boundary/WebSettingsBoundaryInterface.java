package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.util.Map;
import java.util.Set;

public interface WebSettingsBoundaryInterface
{
    int getAttributionBehavior();
    
    boolean getBackForwardCacheEnabled();
    
    int getDisabledActionModeMenuItems();
    
    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();
    
    int getForceDark();
    
    int getForceDarkBehavior();
    
    boolean getHasEnrolledInstrumentEnabled();
    
    boolean getIncludeCookiesOnIntercept();
    
    boolean getOffscreenPreRaster();
    
    boolean getPaymentRequestEnabled();
    
    Set<String> getRequestedWithHeaderOriginAllowList();
    
    boolean getSafeBrowsingEnabled();
    
    int getSpeculativeLoadingStatus();
    
    Map<String, Object> getUserAgentMetadataMap();
    
    int getWebViewMediaIntegrityApiDefaultStatus();
    
    Map<String, Integer> getWebViewMediaIntegrityApiOverrideRules();
    
    int getWebauthnSupport();
    
    boolean getWillSuppressErrorPage();
    
    boolean isAlgorithmicDarkeningAllowed();
    
    void setAlgorithmicDarkeningAllowed(final boolean p0);
    
    void setAttributionBehavior(final int p0);
    
    void setBackForwardCacheEnabled(final boolean p0);
    
    void setDisabledActionModeMenuItems(final int p0);
    
    void setEnterpriseAuthenticationAppLinkPolicyEnabled(final boolean p0);
    
    void setForceDark(final int p0);
    
    void setForceDarkBehavior(final int p0);
    
    void setHasEnrolledInstrumentEnabled(final boolean p0);
    
    void setIncludeCookiesOnIntercept(final boolean p0);
    
    void setOffscreenPreRaster(final boolean p0);
    
    void setPaymentRequestEnabled(final boolean p0);
    
    void setRequestedWithHeaderOriginAllowList(final Set<String> p0);
    
    void setSafeBrowsingEnabled(final boolean p0);
    
    void setSpeculativeLoadingStatus(final int p0);
    
    void setUserAgentMetadataFromMap(final Map<String, Object> p0);
    
    void setWebViewMediaIntegrityApiStatus(final int p0, final Map<String, Integer> p1);
    
    void setWebauthnSupport(final int p0);
    
    void setWillSuppressErrorPage(final boolean p0);
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface SpeculativeLoadingStatus {
        public static final int DISABLED = 0;
        public static final int PRERENDER_ENABLED = 1;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.TYPE_USE })
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebauthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }
}
