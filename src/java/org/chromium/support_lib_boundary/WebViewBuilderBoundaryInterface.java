package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ArrayList;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import android.webkit.WebView;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import android.content.Context;

public interface WebViewBuilderBoundaryInterface
{
    WebView build(final Context p0, final Consumer<BiConsumer<Integer, Object>> p1);
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }
    
    public static class Config implements Consumer<BiConsumer<Integer, Object>>
    {
        public final ArrayList a;
        public final ArrayList b;
        public int baseline;
        public final ArrayList c;
        
        public Config() {
            this.baseline = 0;
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
        }
        
        public void accept(final BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept((Object)0, (Object)this.baseline);
            biConsumer.accept((Object)1, (Object)new Object[] { this.a, this.b, this.c });
        }
        
        public void addJavascriptInterface(final Object o, final String s, final List<String> list) {
            this.a.add(o);
            this.b.add((Object)s);
            this.c.add((Object)list);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.TYPE_USE })
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }
}
