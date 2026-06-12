package com.pichillilorenzo.flutter_inappwebview_android.webview;

public enum WebViewChannelDelegateMethods
{
    private static final WebViewChannelDelegateMethods[] $VALUES;
    
    addUserScript, 
    addWebMessageListener, 
    callAsyncJavaScript, 
    canGoBack, 
    canGoBackOrForward, 
    canGoForward, 
    canScrollHorizontally, 
    canScrollVertically, 
    @Deprecated
    clearCache, 
    clearFocus, 
    clearFormData, 
    clearHistory, 
    clearMatches, 
    clearSslPreferences, 
    close, 
    createWebMessageChannel, 
    evaluateJavascript, 
    @Deprecated
    findAll, 
    findNext, 
    getCertificate, 
    getContentHeight, 
    getContentWidth, 
    getCopyBackForwardList, 
    getHitTestResult, 
    getOriginalUrl, 
    getProgress, 
    getScrollX, 
    getScrollY, 
    getSelectedText, 
    getSettings, 
    getTitle, 
    getUrl, 
    getZoomScale, 
    goBack, 
    goBackOrForward, 
    goForward, 
    hide, 
    injectCSSCode, 
    injectCSSFileFromUrl, 
    injectJavascriptFileFromUrl, 
    isHidden, 
    isInFullscreen, 
    isLoading, 
    isSecureContext, 
    loadData, 
    loadFile, 
    loadUrl, 
    pageDown, 
    pageUp, 
    pause, 
    pauseTimers, 
    postUrl, 
    postWebMessage, 
    printCurrentPage, 
    reload, 
    removeAllUserScripts, 
    removeUserScript, 
    removeUserScriptsByGroupName, 
    requestFocusNodeHref, 
    requestImageRef, 
    resume, 
    resumeTimers, 
    saveWebArchive, 
    scrollBy, 
    scrollTo, 
    setContextMenu, 
    setSettings, 
    show, 
    startSafeBrowsing, 
    stopLoading, 
    takeScreenshot, 
    zoomBy, 
    zoomIn, 
    zoomOut;
    
    private static /* synthetic */ WebViewChannelDelegateMethods[] $values() {
        return new WebViewChannelDelegateMethods[] { WebViewChannelDelegateMethods.getUrl, WebViewChannelDelegateMethods.getTitle, WebViewChannelDelegateMethods.getProgress, WebViewChannelDelegateMethods.loadUrl, WebViewChannelDelegateMethods.postUrl, WebViewChannelDelegateMethods.loadData, WebViewChannelDelegateMethods.loadFile, WebViewChannelDelegateMethods.evaluateJavascript, WebViewChannelDelegateMethods.injectJavascriptFileFromUrl, WebViewChannelDelegateMethods.injectCSSCode, WebViewChannelDelegateMethods.injectCSSFileFromUrl, WebViewChannelDelegateMethods.reload, WebViewChannelDelegateMethods.goBack, WebViewChannelDelegateMethods.canGoBack, WebViewChannelDelegateMethods.goForward, WebViewChannelDelegateMethods.canGoForward, WebViewChannelDelegateMethods.goBackOrForward, WebViewChannelDelegateMethods.canGoBackOrForward, WebViewChannelDelegateMethods.stopLoading, WebViewChannelDelegateMethods.isLoading, WebViewChannelDelegateMethods.takeScreenshot, WebViewChannelDelegateMethods.setSettings, WebViewChannelDelegateMethods.getSettings, WebViewChannelDelegateMethods.close, WebViewChannelDelegateMethods.show, WebViewChannelDelegateMethods.hide, WebViewChannelDelegateMethods.isHidden, WebViewChannelDelegateMethods.getCopyBackForwardList, WebViewChannelDelegateMethods.startSafeBrowsing, WebViewChannelDelegateMethods.clearCache, WebViewChannelDelegateMethods.clearSslPreferences, WebViewChannelDelegateMethods.findAll, WebViewChannelDelegateMethods.findNext, WebViewChannelDelegateMethods.clearMatches, WebViewChannelDelegateMethods.scrollTo, WebViewChannelDelegateMethods.scrollBy, WebViewChannelDelegateMethods.pause, WebViewChannelDelegateMethods.resume, WebViewChannelDelegateMethods.pauseTimers, WebViewChannelDelegateMethods.resumeTimers, WebViewChannelDelegateMethods.printCurrentPage, WebViewChannelDelegateMethods.getContentHeight, WebViewChannelDelegateMethods.getContentWidth, WebViewChannelDelegateMethods.zoomBy, WebViewChannelDelegateMethods.getOriginalUrl, WebViewChannelDelegateMethods.getZoomScale, WebViewChannelDelegateMethods.getSelectedText, WebViewChannelDelegateMethods.getHitTestResult, WebViewChannelDelegateMethods.pageDown, WebViewChannelDelegateMethods.pageUp, WebViewChannelDelegateMethods.saveWebArchive, WebViewChannelDelegateMethods.zoomIn, WebViewChannelDelegateMethods.zoomOut, WebViewChannelDelegateMethods.clearFocus, WebViewChannelDelegateMethods.setContextMenu, WebViewChannelDelegateMethods.requestFocusNodeHref, WebViewChannelDelegateMethods.requestImageRef, WebViewChannelDelegateMethods.getScrollX, WebViewChannelDelegateMethods.getScrollY, WebViewChannelDelegateMethods.getCertificate, WebViewChannelDelegateMethods.clearHistory, WebViewChannelDelegateMethods.addUserScript, WebViewChannelDelegateMethods.removeUserScript, WebViewChannelDelegateMethods.removeUserScriptsByGroupName, WebViewChannelDelegateMethods.removeAllUserScripts, WebViewChannelDelegateMethods.callAsyncJavaScript, WebViewChannelDelegateMethods.isSecureContext, WebViewChannelDelegateMethods.createWebMessageChannel, WebViewChannelDelegateMethods.postWebMessage, WebViewChannelDelegateMethods.addWebMessageListener, WebViewChannelDelegateMethods.canScrollVertically, WebViewChannelDelegateMethods.canScrollHorizontally, WebViewChannelDelegateMethods.isInFullscreen, WebViewChannelDelegateMethods.clearFormData };
    }
    
    static {
        $VALUES = $values();
    }
}
