package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.List;

public class WebMessage
{
    public String data;
    public List<WebMessagePort> ports;
    
    public WebMessage(final String data, final List<WebMessagePort> ports) {
        this.data = data;
        this.ports = ports;
    }
    
    public void dispose() {
        final List<WebMessagePort> ports = this.ports;
        if (ports != null) {
            ports.clear();
        }
    }
}
