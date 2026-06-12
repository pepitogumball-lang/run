package C2;

import C.u;
import android.database.sqlite.SQLiteProgram;
import I1.M;
import android.net.Uri$Builder;
import java.io.IOException;
import java.io.FileOutputStream;
import J1.j;
import java.io.File;
import I1.y;
import android.content.Context;
import E1.o;
import android.text.TextUtils;
import android.net.Uri;
import com.google.android.gms.internal.ads.I7;
import com.google.android.gms.internal.ads.km;
import java.util.concurrent.Executor;
import com.google.android.gms.internal.ads.Iv;
import com.google.android.gms.internal.ads.Dv;
import com.google.android.gms.internal.ads.Sb;
import V2.q;
import com.google.android.gms.internal.ads.Yq;
import com.google.android.gms.internal.ads.Xm;
import com.google.android.gms.internal.ads.kl;
import com.google.android.gms.internal.ads.F7;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.internal.ads.xg;
import java.util.Iterator;
import com.google.android.gms.internal.ads.G7;
import java.util.Map$Entry;
import java.util.Map;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicReference;
import V4.G;
import s3.a;
import android.database.Cursor;
import a1.i;
import u2.f;
import I5.d;
import y0.c;
import u0.m;
import java.util.ArrayList;
import android.util.Log;
import org.json.JSONObject;
import com.google.android.gms.internal.ads.ii;
import com.google.android.gms.internal.ads.xh;
import com.google.android.gms.internal.ads.Kh;
import com.google.android.gms.internal.ads.zzcuj;
import com.google.android.gms.internal.ads.Wo;
import com.google.android.gms.internal.ads.vh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.Bp;
import com.google.android.gms.internal.ads.Ip;
import java.util.concurrent.atomic.AtomicBoolean;
import a1.e;
import u0.l;
import a1.b;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;

public final class z
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    
    public z() {
        this.c = new ArrayBlockingQueue(100);
        this.d = new LinkedHashMap();
        this.e = new HashMap();
        this.g = new HashSet((Collection)Arrays.asList((Object[])new String[] { "noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged" }));
    }
    
    public z(final WorkDatabase_Impl a) {
        this.a = a;
        this.b = new b((l)a, 5);
        this.c = new e((l)a, 3);
        this.d = new e((l)a, 4);
        this.e = new e((l)a, 5);
        this.f = new e((l)a, 6);
        this.g = new e((l)a, 7);
        this.h = new e((l)a, 8);
        this.i = new e((l)a, 9);
        new AtomicBoolean(false);
    }
    
    public z(final Ip a, final Bp b, final qh c, final vh d, final Wo e, final zzcuj f, final Kh g, final xh h, final ii i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static void l(String string, final JSONObject jsonObject) {
        final StringBuilder b = v.e.b(string);
        b.append(jsonObject.toString());
        string = b.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, (Throwable)null);
        }
    }
    
    public ArrayList a() {
        final m c = m.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        c.d((long)200, 1);
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        try {
            final int f = I5.d.f(g, "required_network_type");
            final int f2 = I5.d.f(g, "requires_charging");
            final int f3 = I5.d.f(g, "requires_device_idle");
            final int f4 = I5.d.f(g, "requires_battery_not_low");
            final int f5 = I5.d.f(g, "requires_storage_not_low");
            final int f6 = I5.d.f(g, "trigger_content_update_delay");
            final int f7 = I5.d.f(g, "trigger_max_content_delay");
            final int f8 = I5.d.f(g, "content_uri_triggers");
            final int f9 = I5.d.f(g, "id");
            final int f10 = I5.d.f(g, "state");
            final int f11 = I5.d.f(g, "worker_class_name");
            final int f12 = I5.d.f(g, "input_merger_class_name");
            final int f13 = I5.d.f(g, "input");
            final int f14 = I5.d.f(g, "output");
            ArrayList list;
            try {
                final int f15 = I5.d.f(g, "initial_delay");
                final int f16 = I5.d.f(g, "interval_duration");
                final int f17 = I5.d.f(g, "flex_duration");
                final int f18 = I5.d.f(g, "run_attempt_count");
                final int f19 = I5.d.f(g, "backoff_policy");
                final int f20 = I5.d.f(g, "backoff_delay_duration");
                final int f21 = I5.d.f(g, "period_start_time");
                final int f22 = I5.d.f(g, "minimum_retention_duration");
                final int f23 = I5.d.f(g, "schedule_requested_at");
                final int f24 = I5.d.f(g, "run_in_foreground");
                final int f25 = I5.d.f(g, "out_of_quota_policy");
                list = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    final String string = g.getString(f9);
                    final String string2 = g.getString(f11);
                    final R0.c j = new R0.c();
                    j.a = u2.f.r(g.getInt(f));
                    j.b = (g.getInt(f2) != 0);
                    j.c = (g.getInt(f3) != 0);
                    j.d = (g.getInt(f4) != 0);
                    j.e = (g.getInt(f5) != 0);
                    j.f = g.getLong(f6);
                    j.g = g.getLong(f7);
                    j.h = u2.f.b(g.getBlob(f8));
                    final i i = new i(string, string2);
                    i.b = u2.f.t(g.getInt(f10));
                    i.d = g.getString(f12);
                    i.e = R0.f.a(g.getBlob(f13));
                    i.f = R0.f.a(g.getBlob(f14));
                    i.g = g.getLong(f15);
                    i.h = g.getLong(f16);
                    i.i = g.getLong(f17);
                    i.k = g.getInt(f18);
                    i.l = u2.f.q(g.getInt(f19));
                    i.m = g.getLong(f20);
                    i.n = g.getLong(f21);
                    i.o = g.getLong(f22);
                    i.p = g.getLong(f23);
                    i.q = (g.getInt(f24) != 0);
                    i.r = u2.f.s(g.getInt(f25));
                    i.j = j;
                    list.add((Object)i);
                }
            }
            finally {}
            g.close();
            c.h();
            return list;
        }
        finally {}
        g.close();
        c.h();
    }
    
    public a b(final int n) {
        final a a = null;
        final a a2 = null;
        a v = a;
        Label_0189: {
            Label_0159: {
                try {
                    if (v.e.a(2, n)) {
                        return v;
                    }
                    final JSONObject w = ((X.a)this.e).w();
                    if (w == null) {
                        break Label_0159;
                    }
                    v = ((G)this.c).v(w);
                    l("Loaded cached settings: ", w);
                    this.d.getClass();
                    final long currentTimeMillis = System.currentTimeMillis();
                    if (!v.e.a(3, n) && v.c < currentTimeMillis) {
                        v = a;
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", (Throwable)null);
                            v = a;
                            return v;
                        }
                        return v;
                    }
                }
                catch (final Exception ex) {
                    v = a2;
                    break Label_0189;
                }
                while (true) {
                    try {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Returning cached settings.", (Throwable)null);
                        }
                        return v;
                        break Label_0189;
                    }
                    catch (final Exception ex) {
                        continue;
                    }
                    break;
                }
            }
            v = a;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "No cached settings data found.", (Throwable)null);
                v = a;
                return v;
            }
            return v;
        }
        final Exception ex;
        Log.e("FirebaseCrashlytics", "Failed to get cached settings", (Throwable)ex);
        return v;
    }
    
    public ArrayList c(int f) {
        final m c = m.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c.d((long)f, 1);
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        try {
            final int f2 = I5.d.f(g, "required_network_type");
            final int f3 = I5.d.f(g, "requires_charging");
            final int f4 = I5.d.f(g, "requires_device_idle");
            final int f5 = I5.d.f(g, "requires_battery_not_low");
            final int f6 = I5.d.f(g, "requires_storage_not_low");
            final int f7 = I5.d.f(g, "trigger_content_update_delay");
            final int f8 = I5.d.f(g, "trigger_max_content_delay");
            final int f9 = I5.d.f(g, "content_uri_triggers");
            final int f10 = I5.d.f(g, "id");
            final int f11 = I5.d.f(g, "state");
            final int f12 = I5.d.f(g, "worker_class_name");
            final int f13 = I5.d.f(g, "input_merger_class_name");
            final int f14 = I5.d.f(g, "input");
            final int f15 = I5.d.f(g, "output");
            ArrayList list;
            try {
                final int f16 = I5.d.f(g, "initial_delay");
                final int f17 = I5.d.f(g, "interval_duration");
                final int f18 = I5.d.f(g, "flex_duration");
                final int f19 = I5.d.f(g, "run_attempt_count");
                f = I5.d.f(g, "backoff_policy");
                final int f20 = I5.d.f(g, "backoff_delay_duration");
                final int f21 = I5.d.f(g, "period_start_time");
                final int f22 = I5.d.f(g, "minimum_retention_duration");
                final int f23 = I5.d.f(g, "schedule_requested_at");
                final int f24 = I5.d.f(g, "run_in_foreground");
                final int f25 = I5.d.f(g, "out_of_quota_policy");
                list = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    final String string = g.getString(f10);
                    final String string2 = g.getString(f12);
                    final R0.c j = new R0.c();
                    j.a = f.r(g.getInt(f2));
                    j.b = (g.getInt(f3) != 0);
                    j.c = (g.getInt(f4) != 0);
                    j.d = (g.getInt(f5) != 0);
                    j.e = (g.getInt(f6) != 0);
                    j.f = g.getLong(f7);
                    j.g = g.getLong(f8);
                    j.h = f.b(g.getBlob(f9));
                    final i i = new i(string, string2);
                    i.b = f.t(g.getInt(f11));
                    i.d = g.getString(f13);
                    i.e = R0.f.a(g.getBlob(f14));
                    i.f = R0.f.a(g.getBlob(f15));
                    i.g = g.getLong(f16);
                    i.h = g.getLong(f17);
                    i.i = g.getLong(f18);
                    i.k = g.getInt(f19);
                    i.l = f.q(g.getInt(f));
                    i.m = g.getLong(f20);
                    i.n = g.getLong(f21);
                    i.o = g.getLong(f22);
                    i.p = g.getLong(f23);
                    i.q = (g.getInt(f24) != 0);
                    i.r = f.s(g.getInt(f25));
                    i.j = j;
                    list.add((Object)i);
                }
            }
            finally {}
            g.close();
            c.h();
            return list;
        }
        finally {}
        g.close();
        c.h();
    }
    
    public ArrayList d() {
        final m c = m.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        try {
            final int f = I5.d.f(g, "required_network_type");
            final int f2 = I5.d.f(g, "requires_charging");
            final int f3 = I5.d.f(g, "requires_device_idle");
            final int f4 = I5.d.f(g, "requires_battery_not_low");
            final int f5 = I5.d.f(g, "requires_storage_not_low");
            final int f6 = I5.d.f(g, "trigger_content_update_delay");
            final int f7 = I5.d.f(g, "trigger_max_content_delay");
            final int f8 = I5.d.f(g, "content_uri_triggers");
            final int f9 = I5.d.f(g, "id");
            final int f10 = I5.d.f(g, "state");
            final int f11 = I5.d.f(g, "worker_class_name");
            final int f12 = I5.d.f(g, "input_merger_class_name");
            final int f13 = I5.d.f(g, "input");
            final int f14 = I5.d.f(g, "output");
            ArrayList list;
            try {
                final int f15 = I5.d.f(g, "initial_delay");
                final int f16 = I5.d.f(g, "interval_duration");
                final int f17 = I5.d.f(g, "flex_duration");
                final int f18 = I5.d.f(g, "run_attempt_count");
                final int f19 = I5.d.f(g, "backoff_policy");
                final int f20 = I5.d.f(g, "backoff_delay_duration");
                final int f21 = I5.d.f(g, "period_start_time");
                final int f22 = I5.d.f(g, "minimum_retention_duration");
                final int f23 = I5.d.f(g, "schedule_requested_at");
                final int f24 = I5.d.f(g, "run_in_foreground");
                final int f25 = I5.d.f(g, "out_of_quota_policy");
                list = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    final String string = g.getString(f9);
                    final String string2 = g.getString(f11);
                    final R0.c j = new R0.c();
                    j.a = u2.f.r(g.getInt(f));
                    j.b = (g.getInt(f2) != 0);
                    j.c = (g.getInt(f3) != 0);
                    j.d = (g.getInt(f4) != 0);
                    j.e = (g.getInt(f5) != 0);
                    j.f = g.getLong(f6);
                    j.g = g.getLong(f7);
                    j.h = u2.f.b(g.getBlob(f8));
                    final i i = new i(string, string2);
                    i.b = u2.f.t(g.getInt(f10));
                    i.d = g.getString(f12);
                    i.e = R0.f.a(g.getBlob(f13));
                    i.f = R0.f.a(g.getBlob(f14));
                    i.g = g.getLong(f15);
                    i.h = g.getLong(f16);
                    i.i = g.getLong(f17);
                    i.k = g.getInt(f18);
                    i.l = u2.f.q(g.getInt(f19));
                    i.m = g.getLong(f20);
                    i.n = g.getLong(f21);
                    i.o = g.getLong(f22);
                    i.p = g.getLong(f23);
                    i.q = (g.getInt(f24) != 0);
                    i.r = u2.f.s(g.getInt(f25));
                    i.j = j;
                    list.add((Object)i);
                }
            }
            finally {}
            g.close();
            c.h();
            return list;
        }
        finally {}
        g.close();
        c.h();
    }
    
    public ArrayList e() {
        final m c = m.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        try {
            final int f = I5.d.f(g, "required_network_type");
            final int f2 = I5.d.f(g, "requires_charging");
            final int f3 = I5.d.f(g, "requires_device_idle");
            final int f4 = I5.d.f(g, "requires_battery_not_low");
            final int f5 = I5.d.f(g, "requires_storage_not_low");
            final int f6 = I5.d.f(g, "trigger_content_update_delay");
            final int f7 = I5.d.f(g, "trigger_max_content_delay");
            final int f8 = I5.d.f(g, "content_uri_triggers");
            final int f9 = I5.d.f(g, "id");
            final int f10 = I5.d.f(g, "state");
            final int f11 = I5.d.f(g, "worker_class_name");
            final int f12 = I5.d.f(g, "input_merger_class_name");
            final int f13 = I5.d.f(g, "input");
            final int f14 = I5.d.f(g, "output");
            ArrayList list;
            try {
                final int f15 = I5.d.f(g, "initial_delay");
                final int f16 = I5.d.f(g, "interval_duration");
                final int f17 = I5.d.f(g, "flex_duration");
                final int f18 = I5.d.f(g, "run_attempt_count");
                final int f19 = I5.d.f(g, "backoff_policy");
                final int f20 = I5.d.f(g, "backoff_delay_duration");
                final int f21 = I5.d.f(g, "period_start_time");
                final int f22 = I5.d.f(g, "minimum_retention_duration");
                final int f23 = I5.d.f(g, "schedule_requested_at");
                final int f24 = I5.d.f(g, "run_in_foreground");
                final int f25 = I5.d.f(g, "out_of_quota_policy");
                list = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    final String string = g.getString(f9);
                    final String string2 = g.getString(f11);
                    final R0.c j = new R0.c();
                    j.a = u2.f.r(g.getInt(f));
                    j.b = (g.getInt(f2) != 0);
                    j.c = (g.getInt(f3) != 0);
                    j.d = (g.getInt(f4) != 0);
                    j.e = (g.getInt(f5) != 0);
                    j.f = g.getLong(f6);
                    j.g = g.getLong(f7);
                    j.h = u2.f.b(g.getBlob(f8));
                    final i i = new i(string, string2);
                    i.b = u2.f.t(g.getInt(f10));
                    i.d = g.getString(f12);
                    i.e = R0.f.a(g.getBlob(f13));
                    i.f = R0.f.a(g.getBlob(f14));
                    i.g = g.getLong(f15);
                    i.h = g.getLong(f16);
                    i.i = g.getLong(f17);
                    i.k = g.getInt(f18);
                    i.l = u2.f.q(g.getInt(f19));
                    i.m = g.getLong(f20);
                    i.n = g.getLong(f21);
                    i.o = g.getLong(f22);
                    i.p = g.getLong(f23);
                    i.q = (g.getInt(f24) != 0);
                    i.r = u2.f.s(g.getInt(f25));
                    i.j = j;
                    list.add((Object)i);
                }
            }
            finally {}
            g.close();
            c.h();
            return list;
        }
        finally {}
        g.close();
        c.h();
    }
    
    public a f() {
        return (a)((AtomicReference)this.h).get();
    }
    
    public int g(final String s) {
        final m c = m.c(1, "SELECT state FROM workspec WHERE id=?");
        if (s == null) {
            c.f(1);
        }
        else {
            c.g(1, s);
        }
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        Label_0096: {
            int t;
            try {
                final boolean moveToFirst = g.moveToFirst();
                t = 0;
                if (moveToFirst) {
                    t = u2.f.t(g.getInt(0));
                }
            }
            finally {
                break Label_0096;
            }
            g.close();
            c.h();
            return t;
        }
        g.close();
        c.h();
    }
    
    public ArrayList h() {
        final m c = m.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c.f(1);
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        Label_0085: {
            try {
                final ArrayList list = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    list.add((Object)g.getString(0));
                }
            }
            finally {
                break Label_0085;
            }
            g.close();
            c.h();
            return;
        }
        g.close();
        c.h();
    }
    
    public ArrayList i() {
        final m c = m.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        c.g(1, "offline_ping_sender_work");
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        Label_0088: {
            try {
                final ArrayList list = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    list.add((Object)g.getString(0));
                }
            }
            finally {
                break Label_0088;
            }
            g.close();
            c.h();
            return;
        }
        g.close();
        c.h();
    }
    
    public i j(final String s) {
        final m c = m.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (s == null) {
            c.f(1);
        }
        else {
            c.g(1, s);
        }
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((c)c);
        try {
            final int f = I5.d.f(g, "required_network_type");
            final int f2 = I5.d.f(g, "requires_charging");
            final int f3 = I5.d.f(g, "requires_device_idle");
            final int f4 = I5.d.f(g, "requires_battery_not_low");
            final int f5 = I5.d.f(g, "requires_storage_not_low");
            final int f6 = I5.d.f(g, "trigger_content_update_delay");
            final int f7 = I5.d.f(g, "trigger_max_content_delay");
            final int f8 = I5.d.f(g, "content_uri_triggers");
            final int f9 = I5.d.f(g, "id");
            final int f10 = I5.d.f(g, "state");
            final int f11 = I5.d.f(g, "worker_class_name");
            final int f12 = I5.d.f(g, "input_merger_class_name");
            final int f13 = I5.d.f(g, "input");
            final int f14 = I5.d.f(g, "output");
            final i k;
            Label_0740: {
                try {
                    final int f15 = I5.d.f(g, "initial_delay");
                    final int f16 = I5.d.f(g, "interval_duration");
                    final int f17 = I5.d.f(g, "flex_duration");
                    final int f18 = I5.d.f(g, "run_attempt_count");
                    final int f19 = I5.d.f(g, "backoff_policy");
                    final int f20 = I5.d.f(g, "backoff_delay_duration");
                    final int f21 = I5.d.f(g, "period_start_time");
                    final int f22 = I5.d.f(g, "minimum_retention_duration");
                    final int f23 = I5.d.f(g, "schedule_requested_at");
                    final int f24 = I5.d.f(g, "run_in_foreground");
                    final int f25 = I5.d.f(g, "out_of_quota_policy");
                    if (g.moveToFirst()) {
                        final String string = g.getString(f9);
                        final String string2 = g.getString(f11);
                        final R0.c j = new R0.c();
                        j.a = u2.f.r(g.getInt(f));
                        j.b = (g.getInt(f2) != 0);
                        j.c = (g.getInt(f3) != 0);
                        j.d = (g.getInt(f4) != 0);
                        j.e = (g.getInt(f5) != 0);
                        j.f = g.getLong(f6);
                        j.g = g.getLong(f7);
                        j.h = u2.f.b(g.getBlob(f8));
                        final i i = new i(string, string2);
                        i.b = u2.f.t(g.getInt(f10));
                        i.d = g.getString(f12);
                        i.e = R0.f.a(g.getBlob(f13));
                        i.f = R0.f.a(g.getBlob(f14));
                        i.g = g.getLong(f15);
                        i.h = g.getLong(f16);
                        i.i = g.getLong(f17);
                        i.k = g.getInt(f18);
                        i.l = u2.f.q(g.getInt(f19));
                        i.m = g.getLong(f20);
                        i.n = g.getLong(f21);
                        i.o = g.getLong(f22);
                        i.p = g.getLong(f23);
                        i.q = (g.getInt(f24) != 0);
                        i.r = u2.f.s(g.getInt(f25));
                        i.j = j;
                        break Label_0740;
                    }
                }
                finally {}
                k = null;
            }
            g.close();
            c.h();
            return k;
        }
        finally {}
        g.close();
        c.h();
    }
    
    public void k(final String s) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final e e = (e)this.f;
        final z0.f a = ((u0.o)e).a();
        if (s == null) {
            ((z0.b)a).d(1);
        }
        else {
            ((z0.b)a).f(1, s);
        }
        ((l)workDatabase_Impl).c();
        try {
            a.F.executeUpdateDelete();
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
            ((u0.o)e).c(a);
        }
    }
    
    public void m(final String s, final long n) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final e e = (e)this.h;
        final z0.f a = ((u0.o)e).a();
        ((z0.b)a).c(n, 1);
        if (s == null) {
            ((z0.b)a).d(2);
        }
        else {
            ((z0.b)a).f(2, s);
        }
        ((l)workDatabase_Impl).c();
        try {
            a.F.executeUpdateDelete();
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
            ((u0.o)e).c(a);
        }
    }
    
    public void n(final String s) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final e e = (e)this.g;
        final z0.f a = ((u0.o)e).a();
        if (s == null) {
            ((z0.b)a).d(1);
        }
        else {
            ((z0.b)a).f(1, s);
        }
        ((l)workDatabase_Impl).c();
        try {
            a.F.executeUpdateDelete();
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
            ((u0.o)e).c(a);
        }
    }
    
    public void o(final String s, final R0.f f) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final e e = (e)this.d;
        final z0.f a = ((u0.o)e).a();
        final byte[] c = R0.f.c(f);
        if (c == null) {
            ((z0.b)a).d(1);
        }
        else {
            ((z0.b)a).b(1, c);
        }
        if (s == null) {
            ((z0.b)a).d(2);
        }
        else {
            ((z0.b)a).f(2, s);
        }
        ((l)workDatabase_Impl).c();
        try {
            a.l();
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
            ((u0.o)e).c(a);
        }
    }
    
    public void p(final String s, final long n) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final e e = (e)this.e;
        final z0.f a = ((u0.o)e).a();
        ((z0.b)a).c(n, 1);
        if (s == null) {
            ((z0.b)a).d(2);
        }
        else {
            ((z0.b)a).f(2, s);
        }
        ((l)workDatabase_Impl).c();
        try {
            a.l();
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
            ((u0.o)e).c(a);
        }
    }
    
    public void q(int i, final String... array) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.a;
        ((l)workDatabase_Impl).b();
        final StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        final int length = array.length;
        final int n = 0;
        for (int j = 0; j < length; ++j) {
            sb.append("?");
            if (j < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        final String string = sb.toString();
        ((l)workDatabase_Impl).a();
        ((l)workDatabase_Impl).b();
        final SQLiteStatement compileStatement = ((SQLiteDatabase)((l)workDatabase_Impl).c.e().D).compileStatement(string);
        ((SQLiteProgram)compileStatement).bindLong(1, (long)u2.f.z(i));
        final int length2 = array.length;
        int n2 = 2;
        String s;
        for (i = n; i < length2; ++i) {
            s = array[i];
            if (s == null) {
                ((SQLiteProgram)compileStatement).bindNull(n2);
            }
            else {
                ((SQLiteProgram)compileStatement).bindString(n2, s);
            }
            ++n2;
        }
        ((l)workDatabase_Impl).c();
        try {
            compileStatement.executeUpdateDelete();
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
        }
    }
    
    public LinkedHashMap r(final LinkedHashMap linkedHashMap, final LinkedHashMap linkedHashMap2) {
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap((Map)linkedHashMap);
        for (final Map$Entry map$Entry : linkedHashMap2.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final String s2 = (String)map$Entry.getValue();
            final String s3 = (String)linkedHashMap3.get((Object)s);
            G7 b = (G7)((HashMap)this.e).get((Object)s);
            if (b == null) {
                b = G7.b;
            }
            ((Map)linkedHashMap3).put((Object)s, (Object)b.a(s3, s2));
        }
        return linkedHashMap3;
    }
    
    public void s(final Bp bp) {
        monitorenter(this);
        Label_0147: {
            try {
                final Iterator iterator = bp.a.iterator();
                km a = null;
                Block_5: {
                    while (iterator.hasNext()) {
                        a = ((xg)this.c).a(bp.b, (String)iterator.next());
                        if (a != null && a.b((Ip)this.i, bp)) {
                            break Block_5;
                        }
                    }
                    break Label_0147;
                }
                final Object o = F7.G0(a.a((Ip)this.i, bp), (long)bp.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService)this.b);
                monitorexit(this);
                break Label_0147;
            }
            finally {
                monitorexit(this);
                final Object o = F7.r0((Throwable)new kl(3));
                monitorexit(this);
                ((Xm)this.d).a((Ip)this.i, bp, (q)o, (Yq)this.e);
                ((q)o).a((Runnable)new Dv(o, 0, (Object)new Sb(26, (Object)this, (Object)bp, false)), (Executor)this.a);
            }
        }
    }
    
    public void t(LinkedHashMap ex, I7 d) {
        final Uri$Builder buildUpon = Uri.parse((String)this.a).buildUpon();
        for (final Map$Entry map$Entry : ((LinkedHashMap)ex).entrySet()) {
            buildUpon.appendQueryParameter((String)map$Entry.getKey(), (String)map$Entry.getValue());
        }
        String s2;
        final String s = s2 = buildUpon.build().toString();
        if (d != null) {
            final StringBuilder sb = new StringBuilder(s);
            final String c = d.C;
            if (!TextUtils.isEmpty((CharSequence)c)) {
                sb.append("&it=");
                sb.append(c);
            }
            d = (I7)d.D;
            if (!TextUtils.isEmpty((CharSequence)d)) {
                sb.append("&blat=");
                sb.append((String)d);
            }
            s2 = sb.toString();
        }
        final boolean value = ((AtomicBoolean)this.h).get();
        final I7 i7 = null;
        final IOException ex2 = null;
        if (!value) {
            final M c2 = o.B.c;
            ((u)new y((Context)this.f, (String)this.b, s2, (C2.b)null)).r();
            return;
        }
        final File file = (File)this.i;
        if (file == null) {
            j.i("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        ex = ex2;
        Label_0297: {
            try {
                try {
                    ex = ex2;
                    d = (I7)new FileOutputStream(file, true);
                    try {
                        ((FileOutputStream)d).write(s2.getBytes());
                        ((FileOutputStream)d).write(10);
                        try {
                            ((FileOutputStream)d).close();
                            return;
                        }
                        catch (final IOException ex) {
                            j.j("CsiReporter: Cannot close file: sdk_csi_data.txt.", (Throwable)ex);
                            return;
                        }
                    }
                    catch (final IOException ex3) {}
                    ex = (IOException)d;
                    break Label_0297;
                }
                finally {}
            }
            catch (final IOException ex4) {
                d = i7;
            }
            final IOException ex4;
            j.j("CsiReporter: Cannot write to file: sdk_csi_data.txt.", (Throwable)ex4);
            if (d != null) {
                try {
                    ((FileOutputStream)d).close();
                    return;
                }
                catch (final IOException ex5) {
                    j.j("CsiReporter: Cannot close file: sdk_csi_data.txt.", (Throwable)ex5);
                }
            }
            return;
        }
        if (ex != null) {
            try {
                ((FileOutputStream)ex).close();
            }
            catch (final IOException ex6) {
                j.j("CsiReporter: Cannot close file: sdk_csi_data.txt.", (Throwable)ex6);
            }
        }
    }
}
