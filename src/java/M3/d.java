package m3;

import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import android.util.Log;
import java.util.HashMap;

public final class d
{
    public final HashMap a;
    public final int b;
    public final int c;
    
    public d(final int c) {
        this.a = new HashMap();
        this.b = 64;
        this.c = c;
    }
    
    public static String a(final int n, String s) {
        String s2 = s;
        if (s != null) {
            s = (s2 = s.trim());
            if (s.length() > n) {
                s2 = s.substring(0, n);
            }
        }
        return s2;
    }
    
    public final boolean b(String a, final String s) {
        monitorenter(this);
        Label_0185: {
            if (a == null) {
                break Label_0185;
            }
            Label_0100: {
                try {
                    final String a2 = a(this.c, a);
                    if (this.a.size() >= this.b && !this.a.containsKey((Object)a2)) {
                        final StringBuilder sb = new StringBuilder("Ignored entry \"");
                        sb.append(a);
                        sb.append("\" when adding custom keys. Maximum allowable: ");
                        sb.append(this.b);
                        Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)null);
                        monitorexit(this);
                        return false;
                    }
                    break Label_0100;
                }
                finally {
                    monitorexit(this);
                    Label_0158: {
                        final HashMap a3 = this.a;
                    }
                    iftrue(Label_0171:)(s != null);
                    while (true) {
                        Block_9: {
                            break Block_9;
                            while (true) {
                                boolean equals = false;
                                iftrue(Label_0158:)(!equals);
                                Block_6: {
                                    Block_8: {
                                        break Block_8;
                                        throw new IllegalArgumentException("Custom attribute key must not be null.");
                                        final String a2;
                                        final HashMap a3;
                                        a3.put((Object)a2, (Object)a);
                                        monitorexit(this);
                                        return true;
                                        a = a(this.c, s);
                                        final String s2 = (String)this.a.get((Object)a2);
                                        iftrue(Label_0142:)(s2 != null);
                                        break Block_6;
                                    }
                                    monitorexit(this);
                                    return false;
                                    final String s2;
                                    Label_0142:
                                    equals = s2.equals((Object)a);
                                    continue;
                                }
                                equals = (a == null);
                                continue;
                            }
                        }
                        a = "";
                        continue;
                    }
                }
            }
        }
    }
    
    public final void c(final Map map) {
        monitorenter(this);
    Label_0215_Outer:
        while (true) {
            Label_0163: {
                try {
                    final Iterator iterator = map.entrySet().iterator();
                    int n = 0;
                    while (iterator.hasNext()) {
                        final Map$Entry map$Entry = (Map$Entry)iterator.next();
                        final String s = (String)map$Entry.getKey();
                        if (s == null) {
                            throw new IllegalArgumentException("Custom attribute key must not be null.");
                        }
                        final String a = a(this.c, s);
                        if (this.a.size() < this.b || this.a.containsKey((Object)a)) {
                            break Label_0163;
                        }
                        ++n;
                    }
                    break Label_0163;
                }
                finally {
                    monitorexit(this);
                    final Map$Entry map$Entry;
                    final String s2 = (String)map$Entry.getValue();
                    final HashMap a2 = this.a;
                    iftrue(Label_0130:)(s2 != null);
                    String a3 = "";
                    while (true) {
                        Label_0139: {
                            break Label_0139;
                            Label_0130: {
                                a3 = a(this.c, s2);
                            }
                            break Label_0139;
                            monitorexit(this);
                            return;
                        }
                        final String a;
                        a2.put((Object)a, (Object)a3);
                        continue Label_0215_Outer;
                        final int n;
                        iftrue(Label_0215:)(n <= 0);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Ignored ");
                        sb.append(n);
                        sb.append(" entries when adding custom keys. Maximum allowable: ");
                        sb.append(this.b);
                        Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)null);
                        continue;
                    }
                }
            }
            break;
        }
    }
}
