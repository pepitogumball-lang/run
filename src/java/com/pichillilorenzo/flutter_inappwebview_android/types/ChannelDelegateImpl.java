package com.pichillilorenzo.flutter_inappwebview_android.types;

import F4.o;
import F4.m;
import F4.n;
import F4.p;

public class ChannelDelegateImpl implements IChannelDelegate
{
    private p channel;
    
    public ChannelDelegateImpl(final p channel) {
        (this.channel = channel).b((n)this);
    }
    
    public void dispose() {
        final p channel = this.channel;
        if (channel != null) {
            channel.b((n)null);
            this.channel = null;
        }
    }
    
    @Override
    public p getChannel() {
        return this.channel;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
    }
}
