package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;
import android.print.PrintAttributes$MediaSize;
import android.print.PrintAttributes;

public class PrintAttributesExt
{
    private int colorMode;
    private Integer duplex;
    private MarginsExt margins;
    private MediaSizeExt mediaSize;
    private Integer orientation;
    private ResolutionExt resolution;
    
    public static PrintAttributesExt fromPrintAttributes(final PrintAttributes printAttributes) {
        if (printAttributes == null) {
            return null;
        }
        final PrintAttributesExt printAttributesExt = new PrintAttributesExt();
        printAttributesExt.colorMode = printAttributes.getColorMode();
        printAttributesExt.duplex = printAttributes.getDuplexMode();
        final PrintAttributes$MediaSize mediaSize = printAttributes.getMediaSize();
        if (mediaSize != null) {
            printAttributesExt.mediaSize = MediaSizeExt.fromMediaSize(mediaSize);
            printAttributesExt.orientation = ((mediaSize.isPortrait() ^ true) ? 1 : 0);
        }
        printAttributesExt.resolution = ResolutionExt.fromResolution(printAttributes.getResolution());
        printAttributesExt.margins = MarginsExt.fromMargins(printAttributes.getMinMargins());
        return printAttributesExt;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"colorMode", (Object)this.colorMode);
        hashMap.put((Object)"duplex", (Object)this.duplex);
        hashMap.put((Object)"orientation", (Object)this.orientation);
        final MediaSizeExt mediaSize = this.mediaSize;
        final Object o = null;
        Map map;
        if (mediaSize != null) {
            map = mediaSize.toMap();
        }
        else {
            map = null;
        }
        hashMap.put((Object)"mediaSize", (Object)map);
        final ResolutionExt resolution = this.resolution;
        Map map2;
        if (resolution != null) {
            map2 = resolution.toMap();
        }
        else {
            map2 = null;
        }
        hashMap.put((Object)"resolution", (Object)map2);
        final MarginsExt margins = this.margins;
        Object map3 = o;
        if (margins != null) {
            map3 = margins.toMap();
        }
        hashMap.put((Object)"margins", map3);
        return (Map<String, Object>)hashMap;
    }
}
