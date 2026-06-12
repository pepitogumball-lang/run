package com.pichillilorenzo.flutter_inappwebview_android.types;

public class BaseCallbackResultImpl<T> implements ICallbackResult<T>
{
    @Override
    public T decodeResult(final Object o) {
        return null;
    }
    
    @Override
    public void defaultBehaviour(final T t) {
    }
    
    @Override
    public void error(final String s, final String s2, final Object o) {
    }
    
    @Override
    public boolean nonNullSuccess(final T t) {
        return true;
    }
    
    @Override
    public void notImplemented() {
        this.defaultBehaviour(null);
    }
    
    @Override
    public boolean nullSuccess() {
        return true;
    }
    
    @Override
    public void success(Object decodeResult) {
        decodeResult = this.decodeResult(decodeResult);
        boolean b;
        if (decodeResult == null) {
            b = this.nullSuccess();
        }
        else {
            b = this.nonNullSuccess(decodeResult);
        }
        if (b) {
            this.defaultBehaviour(decodeResult);
        }
    }
}
