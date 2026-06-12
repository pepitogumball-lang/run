package K2;

import com.google.android.gms.internal.measurement.b4;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import C.u;
import com.google.android.gms.internal.ads.vs;

public final class l extends vs
{
    public final int C;
    public final u D;
    
    public l(final J d, final Context context) {
        this.C = 1;
        this.D = d;
        super(context, "google_app_measurement_local.db");
    }
    
    public l(final h d, final Context context) {
        this.C = 0;
        this.D = d;
        super(context, "google_app_measurement.db");
    }
    
    private final void a(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    private final void b(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    private final void c(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    private final void d(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    public final SQLiteDatabase getWritableDatabase() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        K2/l.C:I
        //     4: tableswitch {
        //                0: 117
        //          default: 24
        //        }
        //    24: aload_0        
        //    25: invokespecial   android/database/sqlite/SQLiteOpenHelper.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    28: astore_1       
        //    29: goto            112
        //    32: astore_1       
        //    33: aload_0        
        //    34: getfield        K2/l.D:LC/u;
        //    37: checkcast       LK2/J;
        //    40: astore_2       
        //    41: aload_2        
        //    42: invokevirtual   C/u.j:()LK2/P;
        //    45: getfield        K2/P.H:LK2/S;
        //    48: ldc             "Opening the local database failed, dropping and recreating it"
        //    50: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //    53: aload_2        
        //    54: getfield        C/u.C:Ljava/lang/Object;
        //    57: checkcast       LK2/n0;
        //    60: getfield        K2/n0.C:Landroid/content/Context;
        //    63: ldc             "google_app_measurement_local.db"
        //    65: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //    68: invokevirtual   java/io/File.delete:()Z
        //    71: ifne            88
        //    74: aload_2        
        //    75: invokevirtual   C/u.j:()LK2/P;
        //    78: getfield        K2/P.H:LK2/S;
        //    81: ldc             "Failed to delete corrupted local db file"
        //    83: ldc             "google_app_measurement_local.db"
        //    85: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //    88: aload_0        
        //    89: invokespecial   android/database/sqlite/SQLiteOpenHelper.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    92: astore_1       
        //    93: goto            112
        //    96: astore_1       
        //    97: aload_2        
        //    98: invokevirtual   C/u.j:()LK2/P;
        //   101: getfield        K2/P.H:LK2/S;
        //   104: ldc             "Failed to open local database. Events will bypass local storage"
        //   106: aload_1        
        //   107: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   110: aconst_null    
        //   111: astore_1       
        //   112: aload_1        
        //   113: areturn        
        //   114: astore_1       
        //   115: aload_1        
        //   116: athrow         
        //   117: aload_0        
        //   118: getfield        K2/l.D:LC/u;
        //   121: checkcast       LK2/h;
        //   124: astore_2       
        //   125: aload_2        
        //   126: getfield        K2/h.G:LE1/d;
        //   129: astore_1       
        //   130: aload_1        
        //   131: getfield        E1/d.D:J
        //   134: lconst_0       
        //   135: lcmp           
        //   136: ifne            142
        //   139: goto            168
        //   142: aload_1        
        //   143: getfield        E1/d.E:Ljava/lang/Object;
        //   146: checkcast       Lq2/a;
        //   149: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   152: pop            
        //   153: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   156: aload_1        
        //   157: getfield        E1/d.D:J
        //   160: lsub           
        //   161: ldc2_w          3600000
        //   164: lcmp           
        //   165: iflt            275
        //   168: aload_0        
        //   169: invokespecial   android/database/sqlite/SQLiteOpenHelper.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   172: astore_1       
        //   173: goto            257
        //   176: astore_1       
        //   177: aload_2        
        //   178: getfield        K2/h.G:LE1/d;
        //   181: astore_3       
        //   182: aload_3        
        //   183: getfield        E1/d.E:Ljava/lang/Object;
        //   186: checkcast       Lq2/a;
        //   189: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   192: pop            
        //   193: aload_3        
        //   194: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   197: putfield        E1/d.D:J
        //   200: aload_2        
        //   201: invokevirtual   C/u.j:()LK2/P;
        //   204: getfield        K2/P.H:LK2/S;
        //   207: ldc             "Opening the database failed, dropping and recreating it"
        //   209: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   212: aload_2        
        //   213: getfield        C/u.C:Ljava/lang/Object;
        //   216: checkcast       LK2/n0;
        //   219: getfield        K2/n0.C:Landroid/content/Context;
        //   222: ldc             "google_app_measurement.db"
        //   224: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //   227: invokevirtual   java/io/File.delete:()Z
        //   230: ifne            247
        //   233: aload_2        
        //   234: invokevirtual   C/u.j:()LK2/P;
        //   237: getfield        K2/P.H:LK2/S;
        //   240: ldc             "Failed to delete corrupted db file"
        //   242: ldc             "google_app_measurement.db"
        //   244: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   247: aload_0        
        //   248: invokespecial   android/database/sqlite/SQLiteOpenHelper.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   251: astore_1       
        //   252: aload_3        
        //   253: lconst_0       
        //   254: putfield        E1/d.D:J
        //   257: aload_1        
        //   258: areturn        
        //   259: astore_1       
        //   260: aload_2        
        //   261: invokevirtual   C/u.j:()LK2/P;
        //   264: getfield        K2/P.H:LK2/S;
        //   267: ldc             "Failed to open freshly created database"
        //   269: aload_1        
        //   270: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   273: aload_1        
        //   274: athrow         
        //   275: new             Landroid/database/sqlite/SQLiteException;
        //   278: dup            
        //   279: ldc             "Database open failed"
        //   281: invokespecial   android/database/sqlite/SQLiteException.<init>:(Ljava/lang/String;)V
        //   284: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                   
        //  -----  -----  -----  -----  -------------------------------------------------------
        //  24     29     114    117    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  24     29     32     112    Landroid/database/sqlite/SQLiteException;
        //  88     93     96     112    Landroid/database/sqlite/SQLiteException;
        //  168    173    176    257    Landroid/database/sqlite/SQLiteException;
        //  247    257    259    275    Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0247:
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
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        switch (this.C) {
            default: {
                C0.e(this.D.j(), sqLiteDatabase);
                return;
            }
            case 0: {
                C0.e(this.D.j(), sqLiteDatabase);
            }
        }
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, int c, final int n) {
        c = this.C;
    }
    
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        switch (this.C) {
            default: {
                C0.f(this.D.j(), sqLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                return;
            }
            case 0: {
                final h h = (h)this.D;
                C0.f(h.j(), sqLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", K2.h.H);
                C0.f(h.j(), sqLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C0.f(h.j(), sqLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                C0.f(h.j(), sqLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", K2.h.I);
                C0.f(h.j(), sqLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", K2.h.J);
                C0.f(h.j(), sqLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", K2.h.L);
                C0.f(h.j(), sqLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                C0.f(h.j(), sqLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", K2.h.K);
                C0.f(h.j(), sqLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", K2.h.M);
                C0.f(h.j(), sqLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", K2.h.N);
                C0.f(h.j(), sqLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                C0.f(h.j(), sqLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", K2.h.O);
                C0.f(h.j(), sqLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C0.f(h.j(), sqLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                C0.f(h.j(), sqLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", K2.h.P);
                b4.a();
                C0.f(h.j(), sqLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", K2.h.Q);
                C0.f(h.j(), sqLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", null);
            }
        }
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, int c, final int n) {
        c = this.C;
    }
}
