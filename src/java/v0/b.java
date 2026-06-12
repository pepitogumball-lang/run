package V0;

import android.os.BaseBundle;
import android.app.job.JobInfo$TriggerContentUri;
import R0.d;
import v.e;
import O.n0;
import android.net.NetworkRequest$Builder;
import android.os.Build$VERSION;
import android.app.job.JobInfo$Builder;
import a1.i;
import android.os.PersistableBundle;
import java.util.Iterator;
import java.util.List;
import android.app.job.JobInfo;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Locale;
import R0.m;
import S0.k;
import android.app.job.JobScheduler;
import android.content.Context;
import S0.c;

public final class b implements c
{
    public static final String G;
    public final Context C;
    public final JobScheduler D;
    public final k E;
    public final a F;
    
    static {
        G = m.h("SystemJobScheduler");
    }
    
    public b(final Context c, final k e) {
        final JobScheduler d = (JobScheduler)c.getSystemService("jobscheduler");
        final a f = new a(c);
        this.C = c;
        this.E = e;
        this.D = d;
        this.F = f;
    }
    
    public static void a(final JobScheduler jobScheduler, final int n) {
        try {
            jobScheduler.cancel(n);
        }
        finally {
            final Throwable t;
            m.e().d(b.G, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[] { n }), t);
        }
    }
    
    public static ArrayList c(final Context context, final JobScheduler jobScheduler) {
        List list = null;
        try {
            jobScheduler.getAllPendingJobs();
        }
        finally {
            final Throwable t;
            m.e().d(b.G, "getAllPendingJobs() is not reliable on this device.", t);
            list = null;
        }
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList(list.size());
        final ComponentName componentName = new ComponentName(context, (Class)SystemJobService.class);
        for (final JobInfo jobInfo : list) {
            if (componentName.equals((Object)jobInfo.getService())) {
                list2.add((Object)jobInfo);
            }
        }
        return list2;
    }
    
    @Override
    public final void b(final String s) {
        final Context c = this.C;
        final JobScheduler d = this.D;
        Object c2 = c(c, d);
        ArrayList list = null;
    Label_0045_Outer:
        while (true) {
            if (c2 == null) {
                break Label_0124;
            }
            final ArrayList list2 = new ArrayList(2);
            final Iterator iterator = ((ArrayList)c2).iterator();
        Label_0096_Outer:
            while (true) {
                Label_0122: {
                    if (!iterator.hasNext()) {
                        break Label_0122;
                    }
                    c2 = iterator.next();
                    final PersistableBundle extras = ((JobInfo)c2).getExtras();
                    while (true) {
                        if (extras == null) {
                            break Label_0096;
                        }
                        try {
                            String string;
                            if (((BaseBundle)extras).containsKey("EXTRA_WORK_SPEC_ID")) {
                                string = ((BaseBundle)extras).getString("EXTRA_WORK_SPEC_ID");
                            }
                            else {
                                string = null;
                            }
                            if (s.equals((Object)string)) {
                                list2.add((Object)((JobInfo)c2).getId());
                            }
                            continue Label_0096_Outer;
                            iftrue(Label_0183:)(list == null || list.isEmpty());
                            while (true) {
                                Block_8: {
                                    break Block_8;
                                    Label_0169: {
                                        this.E.f.k().C(s);
                                    }
                                    return;
                                    final Iterator iterator2;
                                    iftrue(Label_0169:)(!iterator2.hasNext());
                                    Block_9: {
                                        break Block_9;
                                        Label_0183:
                                        return;
                                    }
                                    a(d, (int)iterator2.next());
                                    continue;
                                    list = list2;
                                    continue Label_0045_Outer;
                                }
                                final Iterator iterator2 = list.iterator();
                                continue;
                            }
                        }
                        catch (final NullPointerException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
            break;
        }
    }
    
    @Override
    public final void d(final i... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        V0/b.E:LS0/k;
        //     4: astore          7
        //     6: aload           7
        //     8: getfield        S0/k.f:Landroidx/work/impl/WorkDatabase;
        //    11: astore          5
        //    13: new             Lb1/f;
        //    16: dup            
        //    17: aload           5
        //    19: iconst_0       
        //    20: invokespecial   b1/f.<init>:(Ljava/lang/Object;I)V
        //    23: astore          8
        //    25: aload_1        
        //    26: arraylength    
        //    27: istore          4
        //    29: iconst_0       
        //    30: istore_2       
        //    31: iload_2        
        //    32: iload           4
        //    34: if_icmpge       336
        //    37: aload_1        
        //    38: iload_2        
        //    39: aaload         
        //    40: astore          6
        //    42: aload           5
        //    44: invokevirtual   u0/l.c:()V
        //    47: aload           5
        //    49: invokevirtual   androidx/work/impl/WorkDatabase.n:()LC2/z;
        //    52: aload           6
        //    54: getfield        a1/i.a:Ljava/lang/String;
        //    57: invokevirtual   C2/z.j:(Ljava/lang/String;)La1/i;
        //    60: astore          10
        //    62: getstatic       V0/b.G:Ljava/lang/String;
        //    65: astore          9
        //    67: aload           10
        //    69: ifnonnull       147
        //    72: invokestatic    R0/m.e:()LR0/m;
        //    75: astore          10
        //    77: new             Ljava/lang/StringBuilder;
        //    80: astore          11
        //    82: aload           11
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: aload           11
        //    89: ldc             "Skipping scheduling "
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: pop            
        //    95: aload           11
        //    97: aload           6
        //    99: getfield        a1/i.a:Ljava/lang/String;
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload           11
        //   108: ldc             " because it's no longer in the DB"
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: pop            
        //   114: aload           10
        //   116: aload           9
        //   118: aload           11
        //   120: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   123: iconst_0       
        //   124: anewarray       Ljava/lang/Throwable;
        //   127: invokevirtual   R0/m.i:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   130: aload           5
        //   132: invokevirtual   u0/l.h:()V
        //   135: aload           5
        //   137: invokevirtual   u0/l.f:()V
        //   140: goto            323
        //   143: astore_1       
        //   144: goto            329
        //   147: aload           10
        //   149: getfield        a1/i.b:I
        //   152: iconst_1       
        //   153: if_icmpeq       222
        //   156: invokestatic    R0/m.e:()LR0/m;
        //   159: astore          11
        //   161: new             Ljava/lang/StringBuilder;
        //   164: astore          10
        //   166: aload           10
        //   168: invokespecial   java/lang/StringBuilder.<init>:()V
        //   171: aload           10
        //   173: ldc             "Skipping scheduling "
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: pop            
        //   179: aload           10
        //   181: aload           6
        //   183: getfield        a1/i.a:Ljava/lang/String;
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: pop            
        //   190: aload           10
        //   192: ldc             " because it is no longer enqueued"
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: pop            
        //   198: aload           11
        //   200: aload           9
        //   202: aload           10
        //   204: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   207: iconst_0       
        //   208: anewarray       Ljava/lang/Throwable;
        //   211: invokevirtual   R0/m.i:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   214: aload           5
        //   216: invokevirtual   u0/l.h:()V
        //   219: goto            135
        //   222: aload           5
        //   224: invokevirtual   androidx/work/impl/WorkDatabase.k:()Lc2/k;
        //   227: aload           6
        //   229: getfield        a1/i.a:Ljava/lang/String;
        //   232: invokevirtual   c2/k.q:(Ljava/lang/String;)La1/d;
        //   235: astore          9
        //   237: aload           9
        //   239: ifnull          251
        //   242: aload           9
        //   244: getfield        a1/d.b:I
        //   247: istore_3       
        //   248: goto            274
        //   251: aload           7
        //   253: getfield        S0/k.e:LR0/b;
        //   256: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   259: pop            
        //   260: aload           8
        //   262: aload           7
        //   264: getfield        S0/k.e:LR0/b;
        //   267: getfield        R0/b.g:I
        //   270: invokevirtual   b1/f.l:(I)I
        //   273: istore_3       
        //   274: aload           9
        //   276: ifnonnull       308
        //   279: new             La1/d;
        //   282: astore          9
        //   284: aload           9
        //   286: aload           6
        //   288: getfield        a1/i.a:Ljava/lang/String;
        //   291: iload_3        
        //   292: invokespecial   a1/d.<init>:(Ljava/lang/String;I)V
        //   295: aload           7
        //   297: getfield        S0/k.f:Landroidx/work/impl/WorkDatabase;
        //   300: invokevirtual   androidx/work/impl/WorkDatabase.k:()Lc2/k;
        //   303: aload           9
        //   305: invokevirtual   c2/k.s:(La1/d;)V
        //   308: aload_0        
        //   309: aload           6
        //   311: iload_3        
        //   312: invokevirtual   V0/b.e:(La1/i;I)V
        //   315: aload           5
        //   317: invokevirtual   u0/l.h:()V
        //   320: goto            135
        //   323: iinc            2, 1
        //   326: goto            31
        //   329: aload           5
        //   331: invokevirtual   u0/l.f:()V
        //   334: aload_1        
        //   335: athrow         
        //   336: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  47     62     143    147    Any
        //  72     135    143    147    Any
        //  147    219    143    147    Any
        //  222    237    143    147    Any
        //  242    248    143    147    Any
        //  251    274    143    147    Any
        //  279    308    143    147    Any
        //  308    320    143    147    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public final void e(final i ex, int size) {
        final JobScheduler d = this.D;
        final a f = this.F;
        f.getClass();
        final R0.c j = ((i)ex).j;
        final PersistableBundle extras = new PersistableBundle();
        ((BaseBundle)extras).putString("EXTRA_WORK_SPEC_ID", ((i)ex).a);
        ((BaseBundle)extras).putBoolean("EXTRA_IS_PERIODIC", ((i)ex).c());
        final JobInfo$Builder setExtras = new JobInfo$Builder(size, f.a).setRequiresCharging(j.b).setRequiresDeviceIdle(j.c).setExtras(extras);
        final int a = j.a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30 && a == 6) {
            n0.o(setExtras, new NetworkRequest$Builder().addCapability(25).build());
        }
        else {
            final int d2 = e.d(a);
            int requiredNetworkType = 0;
            Label_0238: {
                if (d2 != 0) {
                    if (d2 != 1) {
                        if (d2 == 2) {
                            requiredNetworkType = 2;
                            break Label_0238;
                        }
                        requiredNetworkType = 3;
                        if (d2 == 3) {
                            break Label_0238;
                        }
                        requiredNetworkType = 4;
                        if (d2 == 4) {
                            if (sdk_INT >= 26) {
                                break Label_0238;
                            }
                        }
                        m.e().c(V0.a.b, "API version too low. Cannot convert network type value ".concat(m0.a.o(a)), new Throwable[0]);
                    }
                    requiredNetworkType = 1;
                }
                else {
                    requiredNetworkType = 0;
                }
            }
            setExtras.setRequiredNetworkType(requiredNetworkType);
        }
        if (!j.c) {
            int n;
            if (((i)ex).l == 2) {
                n = 0;
            }
            else {
                n = 1;
            }
            setExtras.setBackoffCriteria(((i)ex).m, n);
        }
        final long max = Math.max(((i)ex).a() - System.currentTimeMillis(), 0L);
        if (sdk_INT <= 28) {
            setExtras.setMinimumLatency(max);
        }
        else if (max > 0L) {
            setExtras.setMinimumLatency(max);
        }
        else if (!((i)ex).q) {
            n0.n(setExtras);
        }
        if (j.h.a.size() > 0) {
            for (final d d3 : j.h.a) {
                setExtras.addTriggerContentUri(new JobInfo$TriggerContentUri(d3.a, (int)(d3.b ? 1 : 0)));
            }
            setExtras.setTriggerContentUpdateDelay(j.f);
            setExtras.setTriggerContentMaxDelay(j.g);
        }
        setExtras.setPersisted(false);
        if (Build$VERSION.SDK_INT >= 26) {
            M.b.r(setExtras, j.d);
            M.b.D(setExtras, j.e);
        }
        final boolean b = ((i)ex).k > 0;
        if (K.b.b() && ((i)ex).q && !b) {
            O.c.q(setExtras);
        }
        final JobInfo build = setExtras.build();
        final m e = m.e();
        final String a2 = ((i)ex).a;
        final StringBuilder sb = new StringBuilder("Scheduling work ID ");
        sb.append(a2);
        sb.append(" Job ID ");
        sb.append(size);
        final String string = sb.toString();
        final String g = V0.b.G;
        e.c(g, string, new Throwable[0]);
        while (true) {
            try {
                if (d.schedule(build) != 0) {
                    return;
                }
                final m e2 = m.e();
                final String a3 = ((i)ex).a;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to schedule work ID ");
                sb2.append(a3);
                e2.i(g, sb2.toString(), new Throwable[0]);
                if (((i)ex).q && ((i)ex).r == 1) {
                    ((i)ex).q = false;
                    final String a4 = ((i)ex).a;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Scheduling a non-expedited job (work ID ");
                    sb3.append(a4);
                    sb3.append(")");
                    m.e().c(g, sb3.toString(), new Throwable[0]);
                    this.e((i)ex, size);
                }
            }
            catch (final IllegalStateException ex) {
                final ArrayList c = c(this.C, d);
                if (c != null) {
                    size = c.size();
                }
                else {
                    size = 0;
                }
                final Locale default1 = Locale.getDefault();
                final k e3 = this.E;
                final String format = String.format(default1, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[] { size, e3.f.n().e().size(), e3.e.h });
                m.e().d(g, format, new Throwable[0]);
                throw new IllegalStateException(format, (Throwable)ex);
                final m e4 = m.e();
                final StringBuilder sb4 = new StringBuilder("Unable to schedule ");
                sb4.append((Object)ex);
                final Throwable t;
                e4.d(g, sb4.toString(), t);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final boolean f() {
        return true;
    }
}
