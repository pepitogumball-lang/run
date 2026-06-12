package com.pichillilorenzo.flutter_inappwebview_android.types;

import F4.o;

public interface ICallbackResult<T> extends o
{
    T decodeResult(final Object p0);
    
    void defaultBehaviour(final T p0);
    
    boolean nonNullSuccess(final T p0);
    
    boolean nullSuccess();
}
