package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.annotation.SuppressLint;
import java.util.HashMap;
import android.view.View;
import io.flutter.plugin.platform.f;

public interface PlatformWebView extends f
{
    void makeInitialLoad(final HashMap<String, Object> p0);
}
