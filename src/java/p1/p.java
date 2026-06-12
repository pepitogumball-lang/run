package P1;

import java.util.Map;
import android.os.BaseBundle;
import java.util.Iterator;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import java.util.Map$Entry;
import java.util.HashMap;
import android.util.JsonReader;
import android.os.Bundle;
import com.google.android.gms.internal.ads.ic;

public final class p
{
    public final String a;
    public String b;
    public String c;
    public final ic d;
    public Bundle e;
    public final Bundle f;
    public final long g;
    public final long h;
    
    public p(final JsonReader jsonReader, final ic d) {
        this.c = null;
        this.f = new Bundle();
        this.g = -1L;
        this.h = -1L;
        this.d = d;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String nextString = "";
        while (jsonReader.hasNext()) {
            String nextName;
            if ((nextName = jsonReader.nextName()) == null) {
                nextName = "";
            }
            int n = 0;
            Label_0193: {
                switch (nextName.hashCode()) {
                    case 1725551537: {
                        if (nextName.equals((Object)"end_time")) {
                            n = 3;
                            break Label_0193;
                        }
                        break;
                    }
                    case -271442291: {
                        if (nextName.equals((Object)"signal_dictionary")) {
                            n = 1;
                            break Label_0193;
                        }
                        break;
                    }
                    case -995427962: {
                        if (nextName.equals((Object)"params")) {
                            n = 0;
                            break Label_0193;
                        }
                        break;
                    }
                    case -1573145462: {
                        if (nextName.equals((Object)"start_time")) {
                            n = 2;
                            break Label_0193;
                        }
                        break;
                    }
                }
                n = -1;
            }
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            jsonReader.skipValue();
                        }
                        else {
                            this.h = jsonReader.nextLong();
                        }
                    }
                    else {
                        this.g = jsonReader.nextLong();
                    }
                }
                else {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put((Object)jsonReader.nextName(), (Object)jsonReader.nextString());
                    }
                    jsonReader.endObject();
                }
            }
            else {
                nextString = jsonReader.nextString();
            }
        }
        this.a = nextString;
        jsonReader.endObject();
        for (final Map$Entry map$Entry : ((Map)hashMap).entrySet()) {
            if (map$Entry.getKey() != null && map$Entry.getValue() != null) {
                ((BaseBundle)this.f).putString((String)map$Entry.getKey(), (String)map$Entry.getValue());
            }
        }
        if ((boolean)q.d.c.a(D7.f2) && d != null) {
            final Bundle o = d.O;
            if (o != null) {
                ((BaseBundle)o).putLong("get-signals-sdkcore-start", this.g);
                ((BaseBundle)o).putLong("get-signals-sdkcore-end", this.h);
            }
        }
    }
}
