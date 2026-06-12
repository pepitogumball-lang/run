package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.concurrent.CountDownLatch;

public class SyncBaseCallbackResultImpl<T> extends BaseCallbackResultImpl<T>
{
    public final CountDownLatch latch;
    public T result;
    
    public SyncBaseCallbackResultImpl() {
        this.latch = new CountDownLatch(1);
        this.result = null;
    }
    
    @Override
    public void defaultBehaviour(final T t) {
        this.latch.countDown();
    }
    
    @Override
    public void error(final String s, final String s2, final Object o) {
        this.latch.countDown();
    }
    
    @Override
    public void notImplemented() {
        this.defaultBehaviour(null);
    }
    
    @Override
    public void success(Object decodeResult) {
        decodeResult = this.decodeResult(decodeResult);
        this.result = (T)decodeResult;
        boolean b;
        if (decodeResult == null) {
            b = this.nullSuccess();
        }
        else {
            b = this.nonNullSuccess((T)decodeResult);
        }
        if (b) {
            this.defaultBehaviour(decodeResult);
        }
        else {
            this.latch.countDown();
        }
    }
}
