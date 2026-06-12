package com.pichillilorenzo.flutter_inappwebview_android.types;

public class ServerTrustChallenge extends URLAuthenticationChallenge
{
    public ServerTrustChallenge(final URLProtectionSpace urlProtectionSpace) {
        super(urlProtectionSpace);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServerTrustChallenge{} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
