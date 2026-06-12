package com.pichillilorenzo.flutter_inappwebview_android;

import java.util.Map;

public interface ISettings<T>
{
    Map<String, Object> getRealSettings(final T p0);
    
    ISettings<T> parse(final Map<String, Object> p0);
    
    Map<String, Object> toMap();
}
