package C3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Map$Entry;
import android.content.Context;
import android.content.SharedPreferences;

public final class j
{
    public final SharedPreferences a;
    
    public j(final Context context, final String s) {
        final StringBuilder sb = new StringBuilder("FirebaseHeartBeat");
        sb.append(s);
        this.a = context.getSharedPreferences(sb.toString(), 0);
    }
    
    public final void a() {
        monitorenter(this);
        while (true) {
            Label_0171: {
                try {
                    final long long1 = this.a.getLong("fire-count", 0L);
                    String s = "";
                    final Iterator iterator = this.a.getAll().entrySet().iterator();
                    String s2 = null;
                Label_0045:
                    while (iterator.hasNext()) {
                        final Map$Entry map$Entry = (Map$Entry)iterator.next();
                        if (map$Entry.getValue() instanceof Set) {
                            final Iterator iterator2 = ((Set)map$Entry.getValue()).iterator();
                            final String s3 = s2;
                            final String s4 = s;
                            String s5;
                            do {
                                s = s4;
                                s2 = s3;
                                if (!iterator2.hasNext()) {
                                    continue Label_0045;
                                }
                                s5 = (String)iterator2.next();
                            } while (s3 != null && s3.compareTo(s5) <= 0);
                            break Label_0171;
                        }
                    }
                    break Label_0171;
                }
                finally {
                    monitorexit(this);
                    final Map$Entry map$Entry;
                    final String s4 = (String)map$Entry.getKey();
                    final String s5;
                    final String s3 = s5;
                    continue;
                    final String s;
                    final HashSet set = new HashSet((Collection)this.a.getStringSet(s, (Set)new HashSet()));
                    final String s2;
                    set.remove((Object)s2);
                    final long long1;
                    this.a.edit().putStringSet(s, (Set)set).putLong("fire-count", long1 - 1L).commit();
                    monitorexit(this);
                }
            }
            break;
        }
    }
    
    public final void b() {
        monitorenter(this);
    Label_0193_Outer:
        while (true) {
            Label_0166: {
                try {
                    final SharedPreferences$Editor edit = this.a.edit();
                    final Iterator iterator = this.a.getAll().entrySet().iterator();
                    int n = 0;
                    while (iterator.hasNext()) {
                        final Map$Entry map$Entry = (Map$Entry)iterator.next();
                        if (map$Entry.getValue() instanceof Set) {
                            final Set set = (Set)map$Entry.getValue();
                            final String d = this.d(System.currentTimeMillis());
                            final String s = (String)map$Entry.getKey();
                            if (!set.contains((Object)d)) {
                                break Label_0166;
                            }
                            final HashSet set2 = new HashSet();
                            set2.add((Object)d);
                            ++n;
                            edit.putStringSet(s, (Set)set2);
                        }
                    }
                    break Label_0166;
                }
                finally {
                    monitorexit(this);
                    while (true) {
                        final SharedPreferences$Editor edit;
                        edit.commit();
                        monitorexit(this);
                        return;
                        final String s;
                        edit.remove(s);
                        continue Label_0193_Outer;
                        final int n;
                        iftrue(Label_0182:)(n != 0);
                        edit.remove("fire-count");
                        continue;
                        Label_0182: {
                            edit.putLong("fire-count", (long)n);
                        }
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public final ArrayList c() {
        monitorenter(this);
        Label_0162: {
            try {
                final ArrayList list = new ArrayList();
                for (final Map$Entry map$Entry : this.a.getAll().entrySet()) {
                    if (map$Entry.getValue() instanceof Set) {
                        final HashSet set = new HashSet((Collection)map$Entry.getValue());
                        set.remove((Object)this.d(System.currentTimeMillis()));
                        if (set.isEmpty()) {
                            continue;
                        }
                        list.add((Object)new a((String)map$Entry.getKey(), new ArrayList((Collection)set)));
                    }
                }
                break Label_0162;
            }
            finally {
                monitorexit(this);
                final long currentTimeMillis = System.currentTimeMillis();
                synchronized (this) {
                    this.a.edit().putLong("fire-global", currentTimeMillis).commit();
                    return;
                }
            }
        }
    }
    
    public final String d(final long n) {
        monitorenter(this);
        Label_0051: {
            try {
                if (Build$VERSION.SDK_INT >= 26) {
                    final String i = C3.i.i(C3.i.l(C3.i.m(C3.i.k(new Date(n)), C3.i.n())), C3.i.o());
                    monitorexit(this);
                    return i;
                }
                break Label_0051;
            }
            finally {
                monitorexit(this);
                final String format = ((DateFormat)new SimpleDateFormat("yyyy-MM-dd", Locale.UK)).format(new Date(n));
                monitorexit(this);
                return format;
            }
        }
    }
    
    public final String e(String s) {
        monitorenter(this);
        Label_0118: {
            try {
                Block_6: {
                    for (final Map$Entry map$Entry : this.a.getAll().entrySet()) {
                        if (map$Entry.getValue() instanceof Set) {
                            final Iterator iterator2 = ((Set)map$Entry.getValue()).iterator();
                            while (iterator2.hasNext()) {
                                if (s.equals((Object)iterator2.next())) {
                                    break Block_6;
                                }
                            }
                        }
                    }
                    break Label_0118;
                }
                final Map$Entry map$Entry;
                s = (String)map$Entry.getKey();
                monitorexit(this);
                return s;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                return null;
            }
        }
    }
    
    public final void f(final String s) {
        monitorenter(this);
        Label_0094: {
            try {
                final String e = this.e(s);
                if (e == null) {
                    monitorexit(this);
                    return;
                }
                final HashSet set = new HashSet((Collection)this.a.getStringSet(e, (Set)new HashSet()));
                set.remove((Object)s);
                if (set.isEmpty()) {
                    this.a.edit().remove(e).commit();
                    break Label_0094;
                }
                break Label_0094;
            }
            finally {
                monitorexit(this);
                final String e;
                final HashSet set;
                this.a.edit().putStringSet(e, (Set)set).commit();
                monitorexit(this);
            }
        }
    }
    
    public final boolean g(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: astore          7
        //     4: monitorenter   
        //     5: aload_0        
        //     6: getfield        C3/j.a:Landroid/content/SharedPreferences;
        //     9: ldc             "fire-global"
        //    11: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //    16: ifeq            108
        //    19: aload_0        
        //    20: getfield        C3/j.a:Landroid/content/SharedPreferences;
        //    23: ldc             "fire-global"
        //    25: ldc2_w          -1
        //    28: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //    33: lstore_3       
        //    34: aload_0        
        //    35: dup            
        //    36: astore          7
        //    38: monitorenter   
        //    39: aload_0        
        //    40: lload_3        
        //    41: invokevirtual   C3/j.d:(J)Ljava/lang/String;
        //    44: aload_0        
        //    45: lload_1        
        //    46: invokevirtual   C3/j.d:(J)Ljava/lang/String;
        //    49: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    52: istore          5
        //    54: aload           7
        //    56: monitorexit    
        //    57: iload           5
        //    59: ifne            95
        //    62: aload_0        
        //    63: getfield        C3/j.a:Landroid/content/SharedPreferences;
        //    66: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    71: ldc             "fire-global"
        //    73: lload_1        
        //    74: invokeinterface android/content/SharedPreferences$Editor.putLong:(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
        //    79: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //    84: pop            
        //    85: aload           7
        //    87: monitorexit    
        //    88: iconst_1       
        //    89: ireturn        
        //    90: astore          6
        //    92: goto            136
        //    95: aload           7
        //    97: monitorexit    
        //    98: iconst_0       
        //    99: ireturn        
        //   100: astore          6
        //   102: aload           7
        //   104: monitorexit    
        //   105: aload           6
        //   107: athrow         
        //   108: aload_0        
        //   109: getfield        C3/j.a:Landroid/content/SharedPreferences;
        //   112: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   117: ldc             "fire-global"
        //   119: lload_1        
        //   120: invokeinterface android/content/SharedPreferences$Editor.putLong:(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
        //   125: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   130: pop            
        //   131: aload           7
        //   133: monitorexit    
        //   134: iconst_1       
        //   135: ireturn        
        //   136: aload           7
        //   138: monitorexit    
        //   139: aload           6
        //   141: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  5      39     90     142    Any
        //  39     54     100    108    Any
        //  54     57     90     142    Any
        //  62     85     90     142    Any
        //  102    105    100    108    Any
        //  105    108    90     142    Any
        //  108    131    90     142    Any
        //  136    139    90     142    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void h(final String s, long n) {
        monitorenter(this);
        Label_0082: {
            try {
                final String d = this.d(n);
                if (!this.a.getString("last-used-date", "").equals((Object)d)) {
                    break Label_0082;
                }
                final String e = this.e(d);
                if (e == null) {
                    monitorexit(this);
                    return;
                }
                if (e.equals((Object)s)) {
                    monitorexit(this);
                    return;
                }
                this.i(s, d);
                monitorexit(this);
            }
            finally {
                monitorexit(this);
                iftrue(Label_0127:)((n = this.a.getLong("fire-count", 0L)) + 1L != 30L);
                while (true) {
                    Block_7: {
                        break Block_7;
                        final HashSet set = new HashSet((Collection)this.a.getStringSet(s, (Set)new HashSet()));
                        final String d;
                        set.add((Object)d);
                        this.a.edit().putStringSet(s, (Set)set).putLong("fire-count", n + 1L).putString("last-used-date", d).commit();
                        monitorexit(this);
                        return;
                    }
                    this.a();
                    n = this.a.getLong("fire-count", 0L);
                    continue;
                }
            }
        }
    }
    
    public final void i(final String s, final String s2) {
        synchronized (this) {
            this.f(s2);
            final HashSet set = new HashSet((Collection)this.a.getStringSet(s, (Set)new HashSet()));
            set.add((Object)s2);
            this.a.edit().putStringSet(s, (Set)set).commit();
        }
    }
}
