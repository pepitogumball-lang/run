package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class PrintJobSettings implements ISettings<PrintJobController>
{
    public static final String LOG_TAG = "PrintJobSettings";
    public Integer colorMode;
    public Integer duplexMode;
    public Boolean handledByClient;
    public String jobName;
    public MediaSizeExt mediaSize;
    public Integer orientation;
    public ResolutionExt resolution;
    
    public PrintJobSettings() {
        this.handledByClient = Boolean.FALSE;
    }
    
    @Override
    public Map<String, Object> getRealSettings(final PrintJobController printJobController) {
        return this.toMap();
    }
    
    @Override
    public PrintJobSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            int n = -1;
            switch (s.hashCode()) {
                case 2140418565: {
                    if (!s.equals((Object)"mediaSize")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case 1980724134: {
                    if (!s.equals((Object)"colorMode")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case -244986274: {
                    if (!s.equals((Object)"handledByClient")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -1438096408: {
                    if (!s.equals((Object)"jobName")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1439500848: {
                    if (!s.equals((Object)"orientation")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1498106493: {
                    if (!s.equals((Object)"duplexMode")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1600030548: {
                    if (!s.equals((Object)"resolution")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    continue;
                }
                case 6: {
                    this.mediaSize = MediaSizeExt.fromMap((Map<String, Object>)value);
                    continue;
                }
                case 5: {
                    this.colorMode = (Integer)value;
                    continue;
                }
                case 4: {
                    this.handledByClient = (Boolean)value;
                    continue;
                }
                case 3: {
                    this.jobName = (String)value;
                    continue;
                }
                case 2: {
                    this.orientation = (Integer)value;
                    continue;
                }
                case 1: {
                    this.duplexMode = (Integer)value;
                    continue;
                }
                case 0: {
                    this.resolution = ResolutionExt.fromMap((Map<String, Object>)value);
                    continue;
                }
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"handledByClient", (Object)this.handledByClient);
        hashMap.put((Object)"jobName", (Object)this.jobName);
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
        hashMap.put((Object)"colorMode", (Object)this.colorMode);
        hashMap.put((Object)"duplexMode", (Object)this.duplexMode);
        final ResolutionExt resolution = this.resolution;
        Object map2 = o;
        if (resolution != null) {
            map2 = resolution.toMap();
        }
        hashMap.put((Object)"resolution", map2);
        return (Map<String, Object>)hashMap;
    }
}
