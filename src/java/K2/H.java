package K2;

import android.os.BaseBundle;
import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.C0;
import com.google.android.gms.internal.measurement.w0;
import java.util.Map$Entry;
import java.util.Map;
import com.google.android.gms.internal.measurement.f1;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.i1;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.a3;
import android.os.Parcelable$Creator;
import android.os.SystemClock;
import m0.a;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import android.database.Cursor;
import java.util.Iterator;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.HashMap;
import com.google.android.gms.internal.measurement.n1;
import com.google.android.gms.internal.measurement.m1;
import java.util.Collections;
import java.util.ArrayList;
import v.e;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.k1;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.i4;
import h2.A;
import android.content.ContentValues;
import E1.d;

public final class h extends u1
{
    public static final String[] H;
    public static final String[] I;
    public static final String[] J;
    public static final String[] K;
    public static final String[] L;
    public static final String[] M;
    public static final String[] N;
    public static final String[] O;
    public static final String[] P;
    public static final String[] Q;
    public final l F;
    public final d G;
    
    static {
        H = new String[] { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;" };
        I = new String[] { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
        J = new String[] { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;" };
        K = new String[] { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
        L = new String[] { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
        M = new String[] { "session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;" };
        N = new String[] { "session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;" };
        O = new String[] { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
        P = new String[] { "consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;" };
        Q = new String[] { "idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);" };
    }
    
    public h(final y1 y1) {
        super(y1);
        this.G = new d(((n0)super.C).P);
        this.F = new l(this, ((n0)super.C).C);
    }
    
    public static void S(final ContentValues contentValues, final Object o) {
        A.e("value");
        A.h(o);
        if (o instanceof String) {
            contentValues.put("value", (String)o);
            return;
        }
        if (o instanceof Long) {
            contentValues.put("value", (Long)o);
            return;
        }
        if (o instanceof Double) {
            contentValues.put("value", (Double)o);
            return;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
    
    public final E1 A0(final String s) {
        A.e(s);
        this.v();
        this.z();
        i4.a();
        if (!((n0)super.C).I.G(null, w.A0)) {
            return null;
        }
        Cursor cursor = null;
        Label_0844: {
            Object o = null;
            Object string = null;
            Label_0810: {
                try {
                    final SQLiteDatabase d = this.D();
                    o = this.j0();
                    string = new StringBuilder("app_id=? AND NOT ");
                    ((StringBuilder)string).append((String)o);
                    o = ((StringBuilder)string).toString();
                    o = d.query("upload_queue", new String[] { "rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count" }, (String)o, new String[] { s }, (String)null, (String)null, "creation_timestamp ASC", "1");
                    try {
                        try {
                            if (!((Cursor)o).moveToFirst()) {
                                ((Cursor)o).close();
                                return null;
                            }
                            string = ((Cursor)o).getString(3);
                            if (TextUtils.isEmpty((CharSequence)string)) {
                                this.j().O.f("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                                ((Cursor)o).close();
                                return null;
                            }
                        }
                        finally {}
                    }
                    catch (final SQLiteException string) {
                        break Label_0810;
                    }
                    Label_0501: {
                        try {
                            final k1 k1 = (k1)T.L((f2)l1.w(), ((Cursor)o).getBlob(2));
                            final int e = v.e.e(3)[((Cursor)o).getInt(5)];
                            if ((e == 3 || e == 1) && ((Cursor)o).getInt(6) > 0) {
                                final ArrayList list = new ArrayList();
                                final Iterator iterator = Collections.unmodifiableList(((l1)((f2)k1).D).z()).iterator();
                                while (iterator.hasNext()) {
                                    final m1 m1 = (m1)((g2)iterator.next()).l();
                                    final int int1 = ((Cursor)o).getInt(6);
                                    ((f2)m1).f();
                                    n1.p1((n1)((f2)m1).D, int1);
                                    list.add((Object)((f2)m1).d());
                                }
                                break Label_0501;
                            }
                            break Label_0501;
                        }
                        catch (final IOException string) {
                            this.j().H.e(s, string, "Failed to queued MeasurementBatch from upload_queue. appId");
                            ((Cursor)o).close();
                            return null;
                            final k1 k1;
                            HashMap d2 = null;
                        Label_0659:
                            while (true) {
                                int n = 0;
                                String[] split2 = null;
                            Block_18:
                                while (true) {
                                    final int length;
                                    iftrue(Label_0659:)(n >= length);
                                    break Block_18;
                                    Label_0635: {
                                        final String[] split;
                                        d2.put((Object)split[0], (Object)split[1]);
                                    }
                                    ++n;
                                    continue;
                                    ((f2)k1).f();
                                    l1.u((l1)((f2)k1).D);
                                    ((f2)k1).f();
                                    final ArrayList list;
                                    l1.t((l1)((f2)k1).D, list);
                                    break Label_0501;
                                    final String string2;
                                    split2 = string2.split("\r\n");
                                    length = split2.length;
                                    n = 0;
                                    continue;
                                }
                                final String s2 = split2[n];
                                iftrue(Label_0659:)(s2.isEmpty());
                                final String[] split = s2.split("=", 2);
                                iftrue(Label_0635:)(split.length == 2);
                                this.j().H.g("Invalid upload header: ", s2);
                                break Label_0659;
                                d2 = new HashMap();
                                final String string2 = ((Cursor)o).getString(4);
                                iftrue(Label_0659:)(string2 == null);
                                continue;
                            }
                            final long long1 = ((Cursor)o).getLong(0);
                            final l1 b = (l1)((f2)k1).d();
                            final Object o2 = new Object();
                            ((E1)o2).a = long1;
                            ((E1)o2).b = b;
                            ((E1)o2).c = (String)string;
                            ((E1)o2).d = d2;
                            final int e;
                            ((E1)o2).e = e;
                            ((Cursor)o).close();
                            return (E1)o2;
                        }
                    }
                }
                catch (final SQLiteException string) {
                    o = null;
                }
                finally {
                    cursor = null;
                    break Label_0844;
                }
            }
            this.j().H.e(s, string, "Error to querying MeasurementBatch from upload_queue. appId");
            if (o != null) {
                ((Cursor)o).close();
            }
            return null;
        }
        if (cursor != null) {
            cursor.close();
        }
    }
    
    @Override
    public final boolean B() {
        return false;
    }
    
    public final List B0(final String s) {
        A.e(s);
        this.v();
        this.z();
        final ArrayList list = new ArrayList();
        Cursor cursor = null;
        Cursor query = null;
        try {
            Label_0179: {
                try {
                    final Cursor cursor2 = cursor = (query = this.D().query("user_attributes", new String[] { "name", "origin", "set_timestamp", "value" }, "app_id=?", new String[] { s }, (String)null, (String)null, "rowid", "1000"));
                    if (!cursor2.moveToFirst()) {
                        cursor2.close();
                        return (List)list;
                    }
                    Label_0117: {
                        query = cursor2;
                    }
                    cursor = cursor2;
                    final String string = cursor2.getString(0);
                    query = cursor2;
                    cursor = cursor2;
                    String string2;
                    if ((string2 = cursor2.getString(1)) == null) {
                        string2 = "";
                    }
                    break Label_0179;
                }
                finally {
                    if (query != null) {
                        query.close();
                    }
                    final Cursor cursor2;
                    final String string;
                    final String string2;
                    List emptyList;
                    final SQLiteException ex;
                    final long long1;
                    final Object k;
                    Block_9:Block_10_Outer:
                    while (true) {
                        query = cursor2;
                        cursor = cursor2;
                        iftrue(Label_0117:)(cursor2.moveToNext());
                        break Block_9;
                        while (true) {
                            cursor.close();
                            return emptyList;
                            this.j().H.e(K2.P.z(s), ex, "Error querying user properties. appId");
                            emptyList = Collections.emptyList();
                            iftrue(Label_0371:)(cursor == null);
                            continue;
                        }
                        Label_0246: {
                            list.add((Object)new H1(s, string2, string, long1, k));
                        }
                        continue Block_10_Outer;
                    }
                    cursor2.close();
                    return (List)list;
                    long1 = cursor2.getLong(2);
                    k = this.K(cursor2, 3);
                    iftrue(Label_0246:)(k != null);
                    Block_8: {
                        break Block_8;
                        Label_0371: {
                            return emptyList;
                        }
                    }
                    this.j().H.g("Read invalid user property value, ignoring it. appId", K2.P.z(s));
                }
            }
        }
        catch (final SQLiteException ex2) {}
    }
    
    public final long C() {
        Cursor rawQuery = null;
        try {
            try {
                final Cursor cursor = rawQuery = this.D().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[])null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                rawQuery = cursor;
                final long long1 = cursor.getLong(0);
                cursor.close();
                return long1;
            }
            finally {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                final Cursor cursor2;
                cursor2.close();
                return -1L;
            }
        }
        catch (final SQLiteException ex) {}
    }
    
    public final void C0() {
        this.z();
        this.D().beginTransaction();
    }
    
    public final SQLiteDatabase D() {
        this.v();
        try {
            return this.F.getWritableDatabase();
        }
        catch (final SQLiteException ex) {
            this.j().K.g("Error opening database", ex);
            throw ex;
        }
    }
    
    public final void D0(final String s) {
        this.v();
        this.z();
        try {
            this.D().execSQL("delete from default_event_params where app_id=?", (Object[])new String[] { s });
        }
        catch (final SQLiteException ex) {
            this.j().H.g("Error clearing default event params", ex);
        }
    }
    
    public final String E() {
        final SQLiteDatabase d = this.D();
        Cursor cursor3 = null;
        Label_0096: {
            String string = null;
            Cursor cursor2 = null;
            Label_0068: {
                try {
                    final Cursor rawQuery = d.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", (String[])null);
                    try {
                        try {
                            if (rawQuery.moveToFirst()) {
                                string = rawQuery.getString(0);
                                rawQuery.close();
                                return string;
                            }
                        }
                        finally {}
                    }
                    catch (final SQLiteException string) {
                        break Label_0068;
                    }
                    final Cursor cursor;
                    cursor.close();
                    return null;
                }
                catch (final SQLiteException string) {
                    cursor2 = null;
                }
                finally {
                    cursor3 = null;
                    break Label_0096;
                }
            }
            this.j().H.g("Database error getting next bundle app id", string);
            if (cursor2 != null) {
                cursor2.close();
            }
            return null;
        }
        if (cursor3 != null) {
            cursor3.close();
        }
    }
    
    public final void E0(final String s) {
        this.z0("events_snapshot", s);
        Object singletonList = Collections.singletonList((Object)"name");
        Cursor cursor = null;
        Cursor query = null;
        try {
            Label_0162: {
                try {
                    singletonList = (cursor = (query = this.D().query("events", (String[])((List)singletonList).toArray((Object[])new String[0]), "app_id=?", new String[] { s }, (String)null, (String)null, (String)null)));
                    if (!((Cursor)singletonList).moveToFirst()) {
                        ((Cursor)singletonList).close();
                        return;
                    }
                    Label_0088: {
                        query = (Cursor)singletonList;
                    }
                    cursor = (Cursor)singletonList;
                    final String string = ((Cursor)singletonList).getString(0);
                    if (string == null) {
                        break Label_0162;
                    }
                    query = (Cursor)singletonList;
                    cursor = (Cursor)singletonList;
                    final r t0 = this.t0("events", s, string);
                    if (t0 != null) {
                        query = (Cursor)singletonList;
                        cursor = (Cursor)singletonList;
                        this.V("events_snapshot", t0);
                    }
                    break Label_0162;
                }
                finally {
                    if (query != null) {
                        query.close();
                    }
                    Block_9: {
                        while (true) {
                            cursor.close();
                            return;
                            query = (Cursor)singletonList;
                            cursor = (Cursor)singletonList;
                            iftrue(Label_0088:)(((Cursor)singletonList).moveToNext());
                            break Block_9;
                            final SQLiteException ex;
                            this.j().H.e(K2.P.z(s), ex, "Error creating snapshot. appId");
                            iftrue(Label_0223:)(cursor == null);
                            continue;
                        }
                        Label_0223: {
                            return;
                        }
                    }
                    ((Cursor)singletonList).close();
                }
            }
        }
        catch (final SQLiteException ex2) {}
    }
    
    public final long F(final n1 n1) {
        this.v();
        this.z();
        A.e(n1.d2());
        final byte[] c = ((S1)n1).c();
        final long d = this.w().D(c);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", n1.d2());
        contentValues.put("metadata_fingerprint", Long.valueOf(d));
        contentValues.put("metadata", c);
        try {
            this.D().insertWithOnConflict("raw_events_metadata", (String)null, contentValues, 4);
            return d;
        }
        catch (final SQLiteException ex) {
            this.j().H.e(K2.P.z(n1.d2()), ex, "Error storing raw event metadata. appId");
            throw ex;
        }
    }
    
    public final void F0(final String s) {
        final ArrayList list = new ArrayList((Collection)Arrays.asList((Object[])new String[] { "name", "lifetime_count" }));
        final r t0 = this.t0("events", s, "_f");
        final r t2 = this.t0("events", s, "_v");
        this.z0("events", s);
        Object o = null;
        final r r = null;
        int n = 0;
        int n2 = 0;
        r r2 = null;
        Label_0620: {
            try {
                Object query = this.D().query("events_snapshot", (String[])list.toArray((Object[])new String[0]), "app_id=?", new String[] { s }, (String)null, (String)null, (String)null);
                try {
                    if (!((Cursor)query).moveToFirst()) {
                        ((Cursor)query).close();
                        if (t0 != null) {
                            this.V("events", t0);
                        }
                        else if (t2 != null) {
                            this.V("events", t2);
                        }
                        this.z0("events_snapshot", s);
                        return;
                    }
                    n2 = 0;
                    n = 0;
                    boolean moveToNext;
                    int n7 = 0;
                    int n8 = 0;
                    do {
                        int n3 = n2;
                        int n4 = n;
                        int n5 = n2;
                        int n6 = n;
                        Label_0415: {
                            Label_0409: {
                                while (true) {
                                    try {
                                        o = ((Cursor)query).getString(0);
                                        n3 = n2;
                                        n4 = n;
                                        n5 = n2;
                                        n6 = n;
                                        if (((n0)super.C).I.G(null, w.Z0)) {
                                            n3 = n2;
                                            n4 = n;
                                            n5 = n2;
                                            n6 = n;
                                            n7 = n2;
                                            n8 = n;
                                            if (((Cursor)query).getLong(1) < 1L) {
                                                break Label_0415;
                                            }
                                            n3 = n2;
                                            n4 = n;
                                            n5 = n2;
                                            n6 = n;
                                            if ("_f".equals(o)) {
                                                n7 = 1;
                                                n8 = n;
                                                break Label_0415;
                                            }
                                            n3 = n2;
                                            n4 = n;
                                            n5 = n2;
                                            n6 = n;
                                            n7 = n2;
                                            n8 = n;
                                            if ("_v".equals(o)) {
                                                break Label_0409;
                                            }
                                            break Label_0415;
                                        }
                                    }
                                    catch (final SQLiteException o) {
                                        n2 = n5;
                                        n = n6;
                                        break Label_0620;
                                    }
                                    finally {
                                        o = query;
                                        n2 = n3;
                                        query = r;
                                        n = n4;
                                        break Label_0620;
                                    }
                                    n3 = n2;
                                    n4 = n;
                                    n5 = n2;
                                    n6 = n;
                                    if ("_f".equals(o)) {
                                        continue;
                                    }
                                    break;
                                }
                                n7 = n2;
                                n8 = n;
                                if (!"_v".equals(o)) {
                                    break Label_0415;
                                }
                            }
                            n8 = 1;
                            n7 = n2;
                        }
                        if (o != null) {
                            o = this.t0("events_snapshot", s, (String)o);
                            if (o != null) {
                                this.V("events", (r)o);
                            }
                        }
                        moveToNext = ((Cursor)query).moveToNext();
                        n2 = n7;
                        n = n8;
                    } while (moveToNext);
                    ((Cursor)query).close();
                    if (n7 == 0 && t0 != null) {
                        this.V("events", t0);
                    }
                    else if (n8 == 0 && t2 != null) {
                        this.V("events", t2);
                    }
                    this.z0("events_snapshot", s);
                    return;
                }
                catch (final SQLiteException o) {
                    n = 0;
                }
                finally {
                    final int n9 = 0;
                    o = query;
                    n2 = n;
                    n = n9;
                }
            }
            catch (final SQLiteException o) {
                n = 0;
                r2 = r;
            }
            finally {
                final int n10 = 0;
                n2 = n;
                n = n10;
                break Label_0620;
            }
            try {
                this.j().H.e(K2.P.z(s), o, "Error querying snapshot. appId");
                if (r2 != null) {
                    ((Cursor)r2).close();
                }
                if (n2 == 0 && t0 != null) {
                    this.V("events", t0);
                }
                else if (n == 0 && t2 != null) {
                    this.V("events", t2);
                }
                this.z0("events_snapshot", s);
                return;
            }
            finally {
                o = r2;
                final r r3;
                r2 = r3;
            }
        }
        if (o != null) {
            ((Cursor)o).close();
        }
        if (n2 == 0 && t0 != null) {
            this.V("events", t0);
        }
        else if (n == 0 && t2 != null) {
            this.V("events", t2);
        }
        this.z0("events_snapshot", s);
        throw r2;
    }
    
    public final long G(final String s) {
        A.e(s);
        this.v();
        this.z();
        try {
            return this.D().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { s, String.valueOf(Math.max(0, Math.min(1000000, ((n0)super.C).I.A(s, w.q)))) });
        }
        catch (final SQLiteException ex) {
            this.j().H.e(K2.P.z(s), ex, "Error deleting over the limit events. appId");
            return 0L;
        }
    }
    
    public final boolean G0(final String s) {
        i4.a();
        return ((n0)super.C).I.G(null, w.A0) && this.l0(a.f("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", this.j0()), new String[] { s }) != 0L;
    }
    
    public final long H(final String s, String[] array, long long1) {
        final SQLiteDatabase d = this.D();
        Object rawQuery = null;
        try {
            Label_0065: {
                try {
                    final Cursor cursor;
                    array = (String[])(Object)(cursor = (Cursor)(rawQuery = d.rawQuery(s, array)));
                    if (((Cursor)(Object)array).moveToFirst()) {
                        rawQuery = array;
                        long1 = ((Cursor)(Object)array).getLong(0);
                        ((Cursor)(Object)array).close();
                        return long1;
                    }
                    break Label_0065;
                }
                finally {
                    if (rawQuery != null) {
                        ((Cursor)rawQuery).close();
                    }
                    final SQLiteException ex;
                    this.j().H.e(s, ex, "Database error");
                    throw ex;
                    ((Cursor)(Object)array).close();
                    return long1;
                }
            }
        }
        catch (final SQLiteException ex2) {}
    }
    
    public final void H0() {
        this.z();
        this.D().endTransaction();
    }
    
    public final j I(final long n, final String s, final long n2, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final boolean b7) {
        A.e(s);
        this.v();
        this.z();
        final Object o = new Object();
        Cursor cursor = null;
        Cursor query;
        final Cursor cursor2 = query = null;
        Cursor cursor3 = cursor;
        try {
            Label_0182: {
                try {
                    final SQLiteDatabase d = this.D();
                    query = cursor2;
                    cursor3 = cursor;
                    cursor = (cursor3 = (query = d.query("apps", new String[] { "day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count" }, "app_id=?", new String[] { s }, (String)null, (String)null, (String)null)));
                    if (!cursor.moveToFirst()) {
                        query = cursor;
                        cursor3 = cursor;
                        this.j().K.g("Not updating daily counts, app is not known. appId", K2.P.z(s));
                        cursor.close();
                        return (j)o;
                    }
                    break Label_0182;
                }
                finally {
                    if (query != null) {
                        query.close();
                    }
                    final SQLiteException ex;
                    this.j().H.e(K2.P.z(s), ex, "Error updating daily counts. appId");
                    iftrue(Label_0815:)(cursor3 == null);
                Block_7:
                    while (true) {
                    Block_14_Outer:
                        while (true) {
                            while (true) {
                                final SQLiteDatabase d;
                                ContentValues contentValues;
                                Label_0508:Block_11_Outer:
                                while (true) {
                                    Block_15: {
                                        break Block_15;
                                        iftrue(Label_0508:)(!b6);
                                        while (true) {
                                        Label_0430:
                                            while (true) {
                                                Block_9: {
                                                    Block_10: {
                                                        Label_0534: {
                                                            Block_13: {
                                                                break Block_13;
                                                                iftrue(Label_0404:)(!b2);
                                                                break Block_9;
                                                                ((j)o).g += n2;
                                                                break Label_0534;
                                                                iftrue(Label_0430:)(!b3);
                                                                break Block_10;
                                                            }
                                                            ((j)o).f += n2;
                                                            break Label_0508;
                                                            ((j)o).d += n2;
                                                            break Block_14_Outer;
                                                        }
                                                        contentValues = new ContentValues();
                                                        contentValues.put("day", Long.valueOf(n));
                                                        contentValues.put("daily_public_events_count", Long.valueOf(((j)o).a));
                                                        contentValues.put("daily_events_count", Long.valueOf(((j)o).b));
                                                        contentValues.put("daily_conversions_count", Long.valueOf(((j)o).c));
                                                        contentValues.put("daily_error_events_count", Long.valueOf(((j)o).d));
                                                        contentValues.put("daily_realtime_events_count", Long.valueOf(((j)o).e));
                                                        contentValues.put("daily_realtime_dcu_count", Long.valueOf(((j)o).f));
                                                        contentValues.put("daily_registered_triggers_count", Long.valueOf(((j)o).g));
                                                        d.update("apps", contentValues, "app_id=?", new String[] { s });
                                                        cursor.close();
                                                        return (j)o;
                                                    }
                                                    ((j)o).c += n2;
                                                    break Label_0430;
                                                    Label_0815: {
                                                        return (j)o;
                                                    }
                                                }
                                                ((j)o).a += n2;
                                                continue Block_11_Outer;
                                            }
                                            iftrue(Label_0456:)(!b4);
                                            continue;
                                        }
                                    }
                                    cursor3.close();
                                    return (j)o;
                                    ((j)o).e += n2;
                                    continue Block_14_Outer;
                                }
                                iftrue(Label_0534:)(!b7);
                                continue;
                            }
                            iftrue(Label_0352:)(cursor.getLong(0) != n);
                            break Block_7;
                            Label_0352: {
                                iftrue(Label_0378:)(!b);
                            }
                            ((j)o).b += n2;
                            continue Block_14_Outer;
                        }
                        iftrue(Label_0482:)(!b5);
                        continue;
                    }
                    ((j)o).b = cursor.getLong(1);
                    ((j)o).a = cursor.getLong(2);
                    ((j)o).c = cursor.getLong(3);
                    ((j)o).d = cursor.getLong(4);
                    ((j)o).e = cursor.getLong(5);
                    ((j)o).f = cursor.getLong(6);
                    ((j)o).g = cursor.getLong(7);
                }
            }
        }
        catch (final SQLiteException ex2) {}
    }
    
    public final void I0() {
        this.v();
        this.z();
        if (!this.i0()) {
            return;
        }
        final y1 d = super.D;
        final long a = d.K.G.a();
        final n0 n0 = (n0)super.C;
        n0.P.getClass();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - a) > (long)w.z.a(null)) {
            d.K.G.b(elapsedRealtime);
            this.v();
            this.z();
            if (this.i0()) {
                final SQLiteDatabase d2 = this.D();
                n0.P.getClass();
                final int delete = d2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(System.currentTimeMillis()), String.valueOf((long)w.E.a(null)) });
                if (delete > 0) {
                    this.j().P.g("Deleted stale rows. rowsDeleted", delete);
                }
            }
        }
    }
    
    public final j J(final long n, final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return this.I(n, s, 1L, false, false, b, false, b2, b3, b4);
    }
    
    public final void J0() {
        this.z();
        this.D().setTransactionSuccessful();
    }
    
    public final Object K(final Cursor cursor, final int n) {
        final int type = cursor.getType(n);
        if (type == 0) {
            this.j().H.f("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return cursor.getLong(n);
        }
        if (type == 2) {
            return cursor.getDouble(n);
        }
        if (type == 3) {
            return cursor.getString(n);
        }
        if (type != 4) {
            this.j().H.g("Loaded invalid unknown value type, ignoring it", type);
            return null;
        }
        this.j().H.f("Loaded invalid blob type value, ignoring it");
        return null;
    }
    
    public final String L(final long n) {
        this.v();
        this.z();
        Cursor rawQuery = null;
        Label_0146: {
            String string = null;
            Cursor cursor3 = null;
            Label_0114: {
                try {
                    final Cursor cursor = rawQuery = this.D().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[] { String.valueOf(n) });
                    try {
                        try {
                            if (!cursor.moveToFirst()) {
                                rawQuery = cursor;
                                this.j().P.f("No expired configs for apps with pending events");
                                cursor.close();
                                return null;
                            }
                        }
                        finally {}
                    }
                    catch (final SQLiteException string) {
                        break Label_0114;
                    }
                    final Cursor cursor2;
                    rawQuery = cursor2;
                    string = cursor2.getString(0);
                    cursor2.close();
                    return string;
                }
                catch (final SQLiteException string) {
                    cursor3 = null;
                }
                finally {
                    break Label_0146;
                }
            }
            this.j().H.g("Error selecting expired configs", string);
            if (cursor3 != null) {
                cursor3.close();
            }
            return null;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
    }
    
    public final String M(final String s, String[] array) {
        final SQLiteDatabase d = this.D();
        Object rawQuery = null;
        try {
            Label_0064: {
                try {
                    final Cursor cursor;
                    array = (String[])(Object)(cursor = (Cursor)(rawQuery = d.rawQuery(s, array)));
                    if (((Cursor)(Object)array).moveToFirst()) {
                        rawQuery = array;
                        final String string = ((Cursor)(Object)array).getString(0);
                        ((Cursor)(Object)array).close();
                        return string;
                    }
                    break Label_0064;
                }
                finally {
                    if (rawQuery != null) {
                        ((Cursor)rawQuery).close();
                    }
                    ((Cursor)(Object)array).close();
                    return "";
                    final SQLiteException ex;
                    this.j().H.e(s, ex, "Database error");
                    throw ex;
                }
            }
        }
        catch (final SQLiteException ex2) {}
    }
    
    public final List N(final int p0, final String p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   C/u.v:()V
        //     4: aload_0        
        //     5: invokevirtual   K2/u1.z:()V
        //     8: iload_1        
        //     9: ifle            18
        //    12: iconst_1       
        //    13: istore          13
        //    15: goto            21
        //    18: iconst_0       
        //    19: istore          13
        //    21: iload           13
        //    23: invokestatic    h2/A.b:(Z)V
        //    26: iload_3        
        //    27: ifle            36
        //    30: iconst_1       
        //    31: istore          13
        //    33: goto            39
        //    36: iconst_0       
        //    37: istore          13
        //    39: iload           13
        //    41: invokestatic    h2/A.b:(Z)V
        //    44: aload_2        
        //    45: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //    48: aconst_null    
        //    49: astore          15
        //    51: aconst_null    
        //    52: astore          14
        //    54: aload_0        
        //    55: invokevirtual   K2/h.D:()Landroid/database/sqlite/SQLiteDatabase;
        //    58: ldc_w           "queue"
        //    61: iconst_3       
        //    62: anewarray       Ljava/lang/String;
        //    65: dup            
        //    66: iconst_0       
        //    67: ldc_w           "rowid"
        //    70: aastore        
        //    71: dup            
        //    72: iconst_1       
        //    73: ldc_w           "data"
        //    76: aastore        
        //    77: dup            
        //    78: iconst_2       
        //    79: ldc             "retry_count"
        //    81: aastore        
        //    82: ldc_w           "app_id=?"
        //    85: iconst_1       
        //    86: anewarray       Ljava/lang/String;
        //    89: dup            
        //    90: iconst_0       
        //    91: aload_2        
        //    92: aastore        
        //    93: aconst_null    
        //    94: aconst_null    
        //    95: ldc_w           "rowid"
        //    98: iload_1        
        //    99: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   102: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   105: astore          16
        //   107: aload           16
        //   109: astore          14
        //   111: aload           16
        //   113: astore          15
        //   115: aload           16
        //   117: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   122: ifne            157
        //   125: aload           16
        //   127: astore          14
        //   129: aload           16
        //   131: astore          15
        //   133: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   136: astore          17
        //   138: aload           16
        //   140: invokeinterface android/database/Cursor.close:()V
        //   145: aload           17
        //   147: areturn        
        //   148: astore_2       
        //   149: goto            939
        //   152: astore          16
        //   154: goto            894
        //   157: aload           16
        //   159: astore          14
        //   161: aload           16
        //   163: astore          15
        //   165: new             Ljava/util/ArrayList;
        //   168: astore          17
        //   170: aload           16
        //   172: astore          14
        //   174: aload           16
        //   176: astore          15
        //   178: aload           17
        //   180: invokespecial   java/util/ArrayList.<init>:()V
        //   183: iconst_0       
        //   184: istore_1       
        //   185: aload           16
        //   187: astore          14
        //   189: aload           16
        //   191: astore          15
        //   193: aload           16
        //   195: iconst_0       
        //   196: invokeinterface android/database/Cursor.getLong:(I)J
        //   201: lstore          11
        //   203: aload           16
        //   205: astore          14
        //   207: aload           16
        //   209: astore          15
        //   211: aload           16
        //   213: iconst_1       
        //   214: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   219: astore          18
        //   221: aload           16
        //   223: astore          14
        //   225: aload           16
        //   227: astore          15
        //   229: aload_0        
        //   230: invokevirtual   K2/v1.w:()LK2/T;
        //   233: aload           18
        //   235: invokevirtual   K2/T.k0:([B)[B
        //   238: astore          19
        //   240: aload           16
        //   242: astore          14
        //   244: aload           16
        //   246: astore          15
        //   248: aload           17
        //   250: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   253: ifne            277
        //   256: aload           16
        //   258: astore          14
        //   260: aload           16
        //   262: astore          15
        //   264: aload           19
        //   266: arraylength    
        //   267: istore          4
        //   269: iload           4
        //   271: iload_1        
        //   272: iadd           
        //   273: iload_3        
        //   274: if_icmpgt       884
        //   277: aload           16
        //   279: astore          14
        //   281: aload           16
        //   283: astore          15
        //   285: invokestatic    com/google/android/gms/internal/measurement/n1.b2:()Lcom/google/android/gms/internal/measurement/m1;
        //   288: aload           19
        //   290: invokestatic    K2/T.L:(Lcom/google/android/gms/internal/measurement/f2;[B)Lcom/google/android/gms/internal/measurement/f2;
        //   293: checkcast       Lcom/google/android/gms/internal/measurement/m1;
        //   296: astore          18
        //   298: aload           16
        //   300: astore          14
        //   302: aload           16
        //   304: astore          15
        //   306: aload           17
        //   308: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   311: ifne            672
        //   314: aload           16
        //   316: astore          14
        //   318: aload           16
        //   320: astore          15
        //   322: aload           17
        //   324: iconst_0       
        //   325: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   328: checkcast       Landroid/util/Pair;
        //   331: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   334: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //   337: astore          21
        //   339: aload           16
        //   341: astore          14
        //   343: aload           16
        //   345: astore          15
        //   347: aload           18
        //   349: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //   352: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //   355: astore          20
        //   357: aload           16
        //   359: astore          14
        //   361: aload           16
        //   363: astore          15
        //   365: aload           21
        //   367: invokevirtual   com/google/android/gms/internal/measurement/n1.G:()Ljava/lang/String;
        //   370: aload           20
        //   372: invokevirtual   com/google/android/gms/internal/measurement/n1.G:()Ljava/lang/String;
        //   375: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   378: ifeq            884
        //   381: aload           16
        //   383: astore          14
        //   385: aload           16
        //   387: astore          15
        //   389: aload           21
        //   391: invokevirtual   com/google/android/gms/internal/measurement/n1.F:()Ljava/lang/String;
        //   394: aload           20
        //   396: invokevirtual   com/google/android/gms/internal/measurement/n1.F:()Ljava/lang/String;
        //   399: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   402: ifeq            884
        //   405: aload           16
        //   407: astore          14
        //   409: aload           16
        //   411: astore          15
        //   413: aload           21
        //   415: invokevirtual   com/google/android/gms/internal/measurement/n1.W:()Z
        //   418: aload           20
        //   420: invokevirtual   com/google/android/gms/internal/measurement/n1.W:()Z
        //   423: if_icmpne       884
        //   426: aload           16
        //   428: astore          14
        //   430: aload           16
        //   432: astore          15
        //   434: aload           21
        //   436: invokevirtual   com/google/android/gms/internal/measurement/n1.H:()Ljava/lang/String;
        //   439: aload           20
        //   441: invokevirtual   com/google/android/gms/internal/measurement/n1.H:()Ljava/lang/String;
        //   444: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   447: ifeq            884
        //   450: aload           16
        //   452: astore          14
        //   454: aload           16
        //   456: astore          15
        //   458: aload           21
        //   460: invokevirtual   com/google/android/gms/internal/measurement/n1.U:()Lcom/google/android/gms/internal/measurement/p2;
        //   463: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   468: astore          21
        //   470: aload           16
        //   472: astore          14
        //   474: aload           16
        //   476: astore          15
        //   478: aload           21
        //   480: invokeinterface java/util/Iterator.hasNext:()Z
        //   485: istore          13
        //   487: ldc2_w          -1
        //   490: lstore          9
        //   492: iload           13
        //   494: ifeq            560
        //   497: aload           16
        //   499: astore          14
        //   501: aload           16
        //   503: astore          15
        //   505: aload           21
        //   507: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   512: checkcast       Lcom/google/android/gms/internal/measurement/u1;
        //   515: astore          22
        //   517: aload           16
        //   519: astore          14
        //   521: aload           16
        //   523: astore          15
        //   525: ldc_w           "_npa"
        //   528: aload           22
        //   530: invokevirtual   com/google/android/gms/internal/measurement/u1.B:()Ljava/lang/String;
        //   533: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   536: ifeq            557
        //   539: aload           16
        //   541: astore          14
        //   543: aload           16
        //   545: astore          15
        //   547: aload           22
        //   549: invokevirtual   com/google/android/gms/internal/measurement/u1.x:()J
        //   552: lstore          5
        //   554: goto            565
        //   557: goto            470
        //   560: ldc2_w          -1
        //   563: lstore          5
        //   565: aload           16
        //   567: astore          14
        //   569: aload           16
        //   571: astore          15
        //   573: aload           20
        //   575: invokevirtual   com/google/android/gms/internal/measurement/n1.U:()Lcom/google/android/gms/internal/measurement/p2;
        //   578: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   583: astore          20
        //   585: aload           16
        //   587: astore          14
        //   589: aload           16
        //   591: astore          15
        //   593: lload           9
        //   595: lstore          7
        //   597: aload           20
        //   599: invokeinterface java/util/Iterator.hasNext:()Z
        //   604: ifeq            664
        //   607: aload           16
        //   609: astore          14
        //   611: aload           16
        //   613: astore          15
        //   615: aload           20
        //   617: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   622: checkcast       Lcom/google/android/gms/internal/measurement/u1;
        //   625: astore          21
        //   627: aload           16
        //   629: astore          14
        //   631: aload           16
        //   633: astore          15
        //   635: ldc_w           "_npa"
        //   638: aload           21
        //   640: invokevirtual   com/google/android/gms/internal/measurement/u1.B:()Ljava/lang/String;
        //   643: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   646: ifeq            585
        //   649: aload           16
        //   651: astore          14
        //   653: aload           16
        //   655: astore          15
        //   657: aload           21
        //   659: invokevirtual   com/google/android/gms/internal/measurement/u1.x:()J
        //   662: lstore          7
        //   664: lload           5
        //   666: lload           7
        //   668: lcmp           
        //   669: ifne            884
        //   672: aload           16
        //   674: astore          14
        //   676: aload           16
        //   678: astore          15
        //   680: aload           16
        //   682: iconst_2       
        //   683: invokeinterface android/database/Cursor.isNull:(I)Z
        //   688: ifne            743
        //   691: aload           16
        //   693: astore          14
        //   695: aload           16
        //   697: astore          15
        //   699: aload           16
        //   701: iconst_2       
        //   702: invokeinterface android/database/Cursor.getInt:(I)I
        //   707: istore          4
        //   709: aload           16
        //   711: astore          14
        //   713: aload           16
        //   715: astore          15
        //   717: aload           18
        //   719: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //   722: aload           16
        //   724: astore          14
        //   726: aload           16
        //   728: astore          15
        //   730: aload           18
        //   732: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //   735: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //   738: iload           4
        //   740: invokestatic    com/google/android/gms/internal/measurement/n1.p1:(Lcom/google/android/gms/internal/measurement/n1;I)V
        //   743: aload           16
        //   745: astore          14
        //   747: aload           16
        //   749: astore          15
        //   751: iload_1        
        //   752: aload           19
        //   754: arraylength    
        //   755: iadd           
        //   756: istore_1       
        //   757: aload           16
        //   759: astore          14
        //   761: aload           16
        //   763: astore          15
        //   765: aload           17
        //   767: aload           18
        //   769: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //   772: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //   775: lload           11
        //   777: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   780: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   783: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   786: pop            
        //   787: goto            851
        //   790: astore          18
        //   792: aload           16
        //   794: astore          14
        //   796: aload           16
        //   798: astore          15
        //   800: aload_0        
        //   801: invokevirtual   C/u.j:()LK2/P;
        //   804: getfield        K2/P.H:LK2/S;
        //   807: aload_2        
        //   808: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   811: aload           18
        //   813: ldc_w           "Failed to merge queued bundle. appId"
        //   816: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   819: goto            851
        //   822: astore          18
        //   824: aload           16
        //   826: astore          14
        //   828: aload           16
        //   830: astore          15
        //   832: aload_0        
        //   833: invokevirtual   C/u.j:()LK2/P;
        //   836: getfield        K2/P.H:LK2/S;
        //   839: aload_2        
        //   840: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   843: aload           18
        //   845: ldc_w           "Failed to unzip queued bundle. appId"
        //   848: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   851: aload           16
        //   853: astore          14
        //   855: aload           16
        //   857: astore          15
        //   859: aload           16
        //   861: invokeinterface android/database/Cursor.moveToNext:()Z
        //   866: istore          13
        //   868: iload           13
        //   870: ifeq            884
        //   873: iload_1        
        //   874: iload_3        
        //   875: if_icmple       881
        //   878: goto            884
        //   881: goto            185
        //   884: aload           16
        //   886: invokeinterface android/database/Cursor.close:()V
        //   891: aload           17
        //   893: areturn        
        //   894: aload           15
        //   896: astore          14
        //   898: aload_0        
        //   899: invokevirtual   C/u.j:()LK2/P;
        //   902: getfield        K2/P.H:LK2/S;
        //   905: aload_2        
        //   906: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   909: aload           16
        //   911: ldc_w           "Error querying bundles. appId"
        //   914: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   917: aload           15
        //   919: astore          14
        //   921: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   924: astore_2       
        //   925: aload           15
        //   927: ifnull          937
        //   930: aload           15
        //   932: invokeinterface android/database/Cursor.close:()V
        //   937: aload_2        
        //   938: areturn        
        //   939: aload           14
        //   941: ifnull          951
        //   944: aload           14
        //   946: invokeinterface android/database/Cursor.close:()V
        //   951: aload_2        
        //   952: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  54     107    152    939    Landroid/database/sqlite/SQLiteException;
        //  54     107    148    953    Any
        //  115    125    152    939    Landroid/database/sqlite/SQLiteException;
        //  115    125    148    953    Any
        //  133    138    152    939    Landroid/database/sqlite/SQLiteException;
        //  133    138    148    953    Any
        //  165    170    152    939    Landroid/database/sqlite/SQLiteException;
        //  165    170    148    953    Any
        //  178    183    152    939    Landroid/database/sqlite/SQLiteException;
        //  178    183    148    953    Any
        //  193    203    152    939    Landroid/database/sqlite/SQLiteException;
        //  193    203    148    953    Any
        //  211    221    822    851    Ljava/io/IOException;
        //  211    221    152    939    Landroid/database/sqlite/SQLiteException;
        //  211    221    148    953    Any
        //  229    240    822    851    Ljava/io/IOException;
        //  229    240    152    939    Landroid/database/sqlite/SQLiteException;
        //  229    240    148    953    Any
        //  248    256    152    939    Landroid/database/sqlite/SQLiteException;
        //  248    256    148    953    Any
        //  264    269    152    939    Landroid/database/sqlite/SQLiteException;
        //  264    269    148    953    Any
        //  285    298    790    822    Ljava/io/IOException;
        //  285    298    152    939    Landroid/database/sqlite/SQLiteException;
        //  285    298    148    953    Any
        //  306    314    152    939    Landroid/database/sqlite/SQLiteException;
        //  306    314    148    953    Any
        //  322    339    152    939    Landroid/database/sqlite/SQLiteException;
        //  322    339    148    953    Any
        //  347    357    152    939    Landroid/database/sqlite/SQLiteException;
        //  347    357    148    953    Any
        //  365    381    152    939    Landroid/database/sqlite/SQLiteException;
        //  365    381    148    953    Any
        //  389    405    152    939    Landroid/database/sqlite/SQLiteException;
        //  389    405    148    953    Any
        //  413    426    152    939    Landroid/database/sqlite/SQLiteException;
        //  413    426    148    953    Any
        //  434    450    152    939    Landroid/database/sqlite/SQLiteException;
        //  434    450    148    953    Any
        //  458    470    152    939    Landroid/database/sqlite/SQLiteException;
        //  458    470    148    953    Any
        //  478    487    152    939    Landroid/database/sqlite/SQLiteException;
        //  478    487    148    953    Any
        //  505    517    152    939    Landroid/database/sqlite/SQLiteException;
        //  505    517    148    953    Any
        //  525    539    152    939    Landroid/database/sqlite/SQLiteException;
        //  525    539    148    953    Any
        //  547    554    152    939    Landroid/database/sqlite/SQLiteException;
        //  547    554    148    953    Any
        //  573    585    152    939    Landroid/database/sqlite/SQLiteException;
        //  573    585    148    953    Any
        //  597    607    152    939    Landroid/database/sqlite/SQLiteException;
        //  597    607    148    953    Any
        //  615    627    152    939    Landroid/database/sqlite/SQLiteException;
        //  615    627    148    953    Any
        //  635    649    152    939    Landroid/database/sqlite/SQLiteException;
        //  635    649    148    953    Any
        //  657    664    152    939    Landroid/database/sqlite/SQLiteException;
        //  657    664    148    953    Any
        //  680    691    152    939    Landroid/database/sqlite/SQLiteException;
        //  680    691    148    953    Any
        //  699    709    152    939    Landroid/database/sqlite/SQLiteException;
        //  699    709    148    953    Any
        //  717    722    152    939    Landroid/database/sqlite/SQLiteException;
        //  717    722    148    953    Any
        //  730    743    152    939    Landroid/database/sqlite/SQLiteException;
        //  730    743    148    953    Any
        //  751    757    152    939    Landroid/database/sqlite/SQLiteException;
        //  751    757    148    953    Any
        //  765    787    152    939    Landroid/database/sqlite/SQLiteException;
        //  765    787    148    953    Any
        //  800    819    152    939    Landroid/database/sqlite/SQLiteException;
        //  800    819    148    953    Any
        //  832    851    152    939    Landroid/database/sqlite/SQLiteException;
        //  832    851    148    953    Any
        //  859    868    152    939    Landroid/database/sqlite/SQLiteException;
        //  859    868    148    953    Any
        //  898    917    148    953    Any
        //  921    925    148    953    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 429 out of bounds for length 429
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
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
    
    public final List O(final String s, final String s2, final String s3) {
        A.e(s);
        this.v();
        this.z();
        final ArrayList list = new ArrayList(3);
        list.add((Object)s);
        final StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            list.add((Object)s2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s3);
            sb2.append("*");
            list.add((Object)sb2.toString());
            sb.append(" and name glob ?");
        }
        return this.P(sb.toString(), (String[])list.toArray((Object[])new String[list.size()]));
    }
    
    public final List P(final String s, final String[] array) {
        this.v();
        this.z();
        final ArrayList list = new ArrayList();
        Cursor cursor = null;
        Cursor query = null;
        try {
        Block_9_Outer:
            while (true) {
                Label_0212: {
                    try {
                        final Cursor cursor2 = cursor = (query = this.D().query("conditional_properties", new String[] { "app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event" }, s, array, (String)null, (String)null, "rowid", "1001"));
                        if (!cursor2.moveToFirst()) {
                            cursor2.close();
                            return (List)list;
                        }
                        Label_0159: {
                            query = cursor2;
                        }
                        cursor = cursor2;
                        if (list.size() >= 1000) {
                            query = cursor2;
                            cursor = cursor2;
                            this.j().H.g("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break Label_0587;
                        }
                        break Label_0212;
                    }
                    finally {
                        if (query != null) {
                            query.close();
                        }
                        Label_0634: {
                            return;
                        }
                        final Cursor cursor2;
                        cursor2.close();
                        return (List)list;
                        boolean b = true;
                        while (true) {
                            Label_0290: {
                                break Label_0290;
                                cursor.close();
                                return;
                            }
                            final String string = cursor2.getString(5);
                            final long long1 = cursor2.getLong(6);
                            final T w = this.w();
                            final byte[] blob = cursor2.getBlob(7);
                            final Parcelable$Creator<v> creator = v.CREATOR;
                            final String string2;
                            final String string3;
                            final Object k;
                            final String string4;
                            list.add((Object)new c(string2, string3, new G1(cursor2.getLong(10), k, string4, string3), cursor2.getLong(8), b, string, (v)w.I(blob, creator), long1, (v)this.w().I(cursor2.getBlob(9), creator), cursor2.getLong(11), (v)this.w().I(cursor2.getBlob(12), creator)));
                            query = cursor2;
                            cursor = cursor2;
                            iftrue(Label_0159:)(cursor2.moveToNext());
                            continue Block_9_Outer;
                            final SQLiteException ex;
                            this.j().H.g("Error querying conditional user property value", ex);
                            final List emptyList = Collections.emptyList();
                            iftrue(Label_0634:)(cursor == null);
                            continue;
                        }
                        b = false;
                        final String string2 = cursor2.getString(0);
                        final String string3 = cursor2.getString(1);
                        final String string4 = cursor2.getString(2);
                        final Object k = this.K(cursor2, 3);
                        iftrue(Label_0290:)(cursor2.getInt(4) == 0);
                    }
                }
                break;
            }
        }
        catch (final SQLiteException ex2) {}
    }
    
    public final void Q(final G g, final boolean b) {
        this.v();
        this.z();
        final String f = g.f();
        A.h((Object)f);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f);
        a3.a();
        final n0 n0 = (n0)super.C;
        final K2.d i = n0.I;
        final F x0 = w.X0;
        final boolean g2 = i.G(null, x0);
        final y0 e = y0.E;
        final y1 d = super.D;
        Label_0129: {
            if (g2) {
                if (b) {
                    contentValues.put("app_instance_id", (String)null);
                    break Label_0129;
                }
                if (!d.J(f).i(e)) {
                    break Label_0129;
                }
            }
            contentValues.put("app_instance_id", g.g());
        }
        contentValues.put("gmp_app_id", g.j());
        a3.a();
        final K2.d j = n0.I;
        final boolean g3 = j.G(null, x0);
        final n0 a = g.a;
        if (!g3 || d.J(f).i(y0.D)) {
            final k0 l = a.L;
            K2.n0.f(l);
            l.v();
            contentValues.put("resettable_device_id_hash", g.e);
        }
        final k0 k = a.L;
        K2.n0.f(k);
        k.v();
        contentValues.put("last_bundle_index", Long.valueOf(g.g));
        final k0 m = a.L;
        K2.n0.f(m);
        m.v();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(g.h));
        final k0 l2 = a.L;
        K2.n0.f(l2);
        l2.v();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(g.i));
        contentValues.put("app_version", g.h());
        final k0 l3 = a.L;
        K2.n0.f(l3);
        l3.v();
        contentValues.put("app_store", g.l);
        final k0 l4 = a.L;
        K2.n0.f(l4);
        l4.v();
        contentValues.put("gmp_version", Long.valueOf(g.m));
        final k0 l5 = a.L;
        K2.n0.f(l5);
        l5.v();
        contentValues.put("dev_cert_hash", Long.valueOf(g.n));
        final k0 l6 = a.L;
        K2.n0.f(l6);
        l6.v();
        contentValues.put("measurement_enabled", Boolean.valueOf(g.o));
        final k0 l7 = a.L;
        K2.n0.f(l7);
        l7.v();
        contentValues.put("day", Long.valueOf(g.J));
        final k0 l8 = a.L;
        K2.n0.f(l8);
        l8.v();
        contentValues.put("daily_public_events_count", Long.valueOf(g.K));
        K2.n0.f(l8);
        l8.v();
        contentValues.put("daily_events_count", Long.valueOf(g.L));
        K2.n0.f(l8);
        l8.v();
        contentValues.put("daily_conversions_count", Long.valueOf(g.M));
        final k0 l9 = a.L;
        K2.n0.f(l9);
        l9.v();
        contentValues.put("config_fetched_time", Long.valueOf(g.R));
        final k0 l10 = a.L;
        K2.n0.f(l10);
        l10.v();
        contentValues.put("failed_config_fetch_time", Long.valueOf(g.S));
        contentValues.put("app_version_int", Long.valueOf(g.y()));
        contentValues.put("firebase_instance_id", g.i());
        K2.n0.f(l8);
        l8.v();
        contentValues.put("daily_error_events_count", Long.valueOf(g.N));
        K2.n0.f(l8);
        l8.v();
        contentValues.put("daily_realtime_events_count", Long.valueOf(g.O));
        K2.n0.f(l8);
        l8.v();
        contentValues.put("health_monitor_sample", g.P);
        final k0 l11 = a.L;
        K2.n0.f(l11);
        l11.v();
        contentValues.put("android_id", Long.valueOf(0L));
        final k0 l12 = a.L;
        K2.n0.f(l12);
        l12.v();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(g.p));
        contentValues.put("admob_app_id", g.d());
        contentValues.put("dynamite_version", Long.valueOf(g.N()));
        a3.a();
        if (!j.G(null, x0) || d.J(f).i(e)) {
            final k0 l13 = a.L;
            K2.n0.f(l13);
            l13.v();
            contentValues.put("session_stitching_token", g.u);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(g.o()));
        final k0 l14 = a.L;
        K2.n0.f(l14);
        l14.v();
        contentValues.put("target_os_version", Long.valueOf(g.w));
        final k0 l15 = a.L;
        K2.n0.f(l15);
        l15.v();
        contentValues.put("session_stitching_token_hash", Long.valueOf(g.x));
        b4.a();
        if (j.G(f, w.G0)) {
            final k0 l16 = a.L;
            K2.n0.f(l16);
            l16.v();
            contentValues.put("ad_services_version", Integer.valueOf(g.y));
            final k0 l17 = a.L;
            K2.n0.f(l17);
            l17.v();
            contentValues.put("attribution_eligibility_status", Long.valueOf(g.C));
        }
        final k0 l18 = a.L;
        K2.n0.f(l18);
        l18.v();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(g.z));
        contentValues.put("npa_metadata_value", g.U());
        i4.a();
        if (j.G(f, w.w0)) {
            this.u();
            if (J1.y0(f)) {
                final k0 l19 = a.L;
                K2.n0.f(l19);
                l19.v();
                contentValues.put("bundle_delivery_index", Long.valueOf(g.G));
            }
        }
        i4.a();
        if (j.G(f, w.x0)) {
            contentValues.put("sgtm_preview_key", g.l());
        }
        K2.n0.f(l8);
        l8.v();
        contentValues.put("dma_consent_state", Integer.valueOf(g.E));
        K2.n0.f(l8);
        l8.v();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(g.F));
        contentValues.put("serialized_npa_metadata", g.k());
        final k0 l20 = a.L;
        K2.n0.f(l20);
        l20.v();
        final ArrayList t = g.t;
        if (t != null) {
            if (((List)t).isEmpty()) {
                this.j().K.g("Safelisted events should not be an empty list. appId", f);
            }
            else {
                contentValues.put("safelisted_events", TextUtils.join((CharSequence)",", (Iterable)t));
            }
        }
        m3.D.get();
        if (j.G(null, w.t0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String)null);
        }
        if (j.G(null, w.V0)) {
            final k0 l21 = a.L;
            K2.n0.f(l21);
            l21.v();
            contentValues.put("unmatched_pfo", g.A);
            final k0 l22 = a.L;
            K2.n0.f(l22);
            l22.v();
            contentValues.put("unmatched_uwa", g.B);
        }
        J3.a();
        if (j.G(f, w.T0)) {
            final k0 l23 = a.L;
            K2.n0.f(l23);
            l23.v();
            contentValues.put("ad_campaign_info", g.I);
        }
        Label_1487: {
            try {
                final SQLiteDatabase d2 = this.D();
                if (d2.update("apps", contentValues, "app_id = ?", new String[] { f }) == 0L && d2.insertWithOnConflict("apps", (String)null, contentValues, 5) == -1L) {
                    this.j().H.g("Failed to insert/update app (got -1). appId", K2.P.z(f));
                }
            }
            catch (final SQLiteException ex) {
                break Label_1487;
            }
            return;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(f), ex, "Error storing app. appId");
    }
    
    public final void R(final ContentValues contentValues) {
        Label_0110: {
            SQLiteDatabase d;
            String asString;
            try {
                d = this.D();
                asString = contentValues.getAsString("app_id");
                if (asString == null) {
                    this.j().J.g("Value of the primary key is not set.", K2.P.z("app_id"));
                    return;
                }
            }
            catch (final SQLiteException ex) {
                break Label_0110;
            }
            if (d.update("consent_settings", contentValues, "app_id = ?", new String[] { asString }) == 0L && d.insertWithOnConflict("consent_settings", (String)null, contentValues, 5) == -1L) {
                this.j().H.e(K2.P.z("consent_settings"), K2.P.z("app_id"), "Failed to insert/update table (got -1). key");
            }
            return;
        }
        final SQLiteException ex;
        this.j().H.h("Error storing into table. key", K2.P.z("consent_settings"), K2.P.z("app_id"), ex);
    }
    
    public final void T(n1 z, final boolean b) {
        this.v();
        this.z();
        A.e(z.d2());
        A.k(z.t0());
        this.I0();
        ((n0)super.C).P.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final long j1 = z.J1();
        final F e = w.E;
        if (j1 < currentTimeMillis - (long)e.a(null) || z.J1() > (long)e.a(null) + currentTimeMillis) {
            this.j().K.h("Storing bundle outside of the max uploading time span. appId, now, timestamp", K2.P.z(z.d2()), currentTimeMillis, z.J1());
        }
        final byte[] c = ((S1)z).c();
        try {
            final byte[] i0 = this.w().i0(c);
            this.j().P.g("Saving bundle, size", i0.length);
            final ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", z.d2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(z.J1()));
            contentValues.put("data", i0);
            contentValues.put("has_realtime", Integer.valueOf((int)(b ? 1 : 0)));
            if (z.A0()) {
                contentValues.put("retry_count", Integer.valueOf(z.i1()));
            }
            Label_0311: {
                try {
                    if (this.D().insert("queue", (String)null, contentValues) == -1L) {
                        this.j().H.g("Failed to insert bundle (got -1). appId", K2.P.z(z.d2()));
                        return;
                    }
                }
                catch (final SQLiteException ex) {
                    break Label_0311;
                }
                return;
            }
            final P k = this.j();
            z = (n1)K2.P.z(z.d2());
            final SQLiteException ex;
            k.H.e(z, ex, "Error storing bundle. appId");
        }
        catch (final IOException ex2) {
            this.j().H.e(K2.P.z(z.d2()), ex2, "Data loss. Failed to serialize bundle. appId");
        }
    }
    
    public final void U(final Long n) {
        this.v();
        this.z();
        i4.a();
        if (!((n0)super.C).I.G(null, w.A0)) {
            return;
        }
        if (!this.i0()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
        sb.append((Object)n);
        sb.append(" AND retry_count =  2147483647 LIMIT 1");
        if (this.l0(sb.toString(), null) > 0L) {
            this.j().K.f("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            final SQLiteDatabase d = this.D();
            final StringBuilder sb2 = new StringBuilder("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = ");
            sb2.append((Object)n);
            sb2.append(" AND retry_count < 2147483647");
            d.execSQL(sb2.toString());
        }
        catch (final SQLiteException ex) {
            this.j().H.g("Error incrementing retry count. error", ex);
        }
    }
    
    public final void V(final String s, final r r) {
        A.h((Object)r);
        this.v();
        this.z();
        final ContentValues contentValues = new ContentValues();
        final String a = r.a;
        contentValues.put("app_id", a);
        contentValues.put("name", r.b);
        contentValues.put("lifetime_count", Long.valueOf(r.c));
        contentValues.put("current_bundle_count", Long.valueOf(r.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(r.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(r.g));
        contentValues.put("last_bundled_day", r.h);
        contentValues.put("last_sampled_complex_event_id", r.i);
        contentValues.put("last_sampling_rate", r.j);
        contentValues.put("current_session_count", Long.valueOf(r.e));
        final Boolean k = r.k;
        Long value;
        if (k != null && k) {
            value = 1L;
        }
        else {
            value = null;
        }
        contentValues.put("last_exempt_from_sampling", value);
        Label_0231: {
            try {
                if (this.D().insertWithOnConflict(s, (String)null, contentValues, 5) == -1L) {
                    this.j().H.g("Failed to insert/update event aggregates (got -1). appId", K2.P.z(a));
                }
            }
            catch (final SQLiteException ex) {
                break Label_0231;
            }
            return;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(a), ex, "Error storing event aggregates. appId");
    }
    
    public final void W(final String s, final z0 z0) {
        A.h((Object)s);
        this.v();
        this.z();
        this.n0(s, this.y0(s));
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("storage_consent_at_bundling", z0.m());
        this.R(contentValues);
    }
    
    public final void X(final String s, final s1 s2) {
        this.v();
        this.z();
        A.e(s);
        ((n0)super.C).P.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final F h0 = w.h0;
        final long longValue = (long)h0.a(null);
        final long d = s2.D;
        if (d < currentTimeMillis - longValue || d > (long)h0.a(null) + currentTimeMillis) {
            this.j().K.h("Storing trigger URI outside of the max retention time span. appId, now, timestamp", K2.P.z(s), currentTimeMillis, d);
        }
        this.j().P.f("Saving trigger URI");
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("trigger_uri", s2.C);
        contentValues.put("source", Integer.valueOf(s2.E));
        contentValues.put("timestamp_millis", Long.valueOf(d));
        Label_0236: {
            try {
                if (this.D().insert("trigger_uris", (String)null, contentValues) == -1L) {
                    this.j().H.g("Failed to insert trigger URI (got -1). appId", K2.P.z(s));
                    return;
                }
            }
            catch (final SQLiteException ex) {
                break Label_0236;
            }
            return;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(s), ex, "Error storing trigger URI. appId");
    }
    
    public final void Y(final String s, final Bundle bundle) {
        A.h((Object)bundle);
        this.v();
        this.z();
        final k k = new k(this, s);
        for (List list = k.a(); !list.isEmpty(); list = k.a()) {
            for (final i i : list) {
                final T w = this.w();
                final f1 d = i.d;
                final Bundle bundle2 = new Bundle();
                for (final i1 i2 : d.D()) {
                    if (i2.G()) {
                        ((BaseBundle)bundle2).putDouble(i2.D(), i2.o());
                    }
                    else if (i2.H()) {
                        bundle2.putFloat(i2.D(), i2.v());
                    }
                    else if (i2.I()) {
                        ((BaseBundle)bundle2).putLong(i2.D(), i2.A());
                    }
                    else if (i2.K()) {
                        ((BaseBundle)bundle2).putString(i2.D(), i2.E());
                    }
                    else if (!i2.F().isEmpty()) {
                        bundle2.putParcelableArray(i2.D(), (Parcelable[])T.j0((p2)i2.F()));
                    }
                    else {
                        w.j().H.g("Unexpected parameter type for parameter", i2);
                    }
                }
                String string = ((BaseBundle)bundle2).getString("_o");
                bundle2.remove("_o");
                if (string == null) {
                    string = "";
                }
                this.u().Q(bundle2, bundle);
                final f1 d2 = i.d;
                final s s2 = new s((n0)super.C, string, s, d2.C(), d2.A(), d2.z(), bundle2);
                final long a = i.a;
                this.v();
                this.z();
                final String a2 = s2.a;
                A.e(a2);
                final byte[] c = ((S1)this.w().J(s2)).c();
                final ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", a2);
                contentValues.put("name", s2.b);
                contentValues.put("timestamp", Long.valueOf(s2.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(i.b));
                contentValues.put("data", c);
                contentValues.put("realtime", Integer.valueOf((int)(i.c ? 1 : 0)));
                try {
                    final long n = this.D().update("raw_events", contentValues, "rowid = ?", new String[] { String.valueOf(a) });
                    if (n == 1L) {
                        continue;
                    }
                    this.j().H.e(K2.P.z(a2), n, "Failed to update raw event. appId, updatedRows");
                }
                catch (final SQLiteException ex) {
                    this.j().H.e(K2.P.z(a2), ex, "Error updating raw event. appId");
                }
            }
        }
    }
    
    public final void Z(final String s, final l1 l1, final String s2, final Map map, final int n) {
        this.v();
        this.z();
        A.h((Object)l1);
        A.e(s);
        i4.a();
        final n0 n2 = (n0)super.C;
        if (!n2.I.G(null, w.A0)) {
            return;
        }
        this.v();
        this.z();
        final boolean i0 = this.i0();
        final q2.a p5 = n2.P;
        if (i0) {
            final y1 d = super.D;
            final long a = d.K.H.a();
            p5.getClass();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > (long)w.z.a(null)) {
                d.K.H.b(elapsedRealtime);
                this.v();
                this.z();
                if (this.i0()) {
                    final int delete = this.D().delete("upload_queue", this.j0(), new String[0]);
                    if (delete > 0) {
                        this.j().P.g("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", delete);
                    }
                }
            }
        }
        final ArrayList list = new ArrayList();
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s3 = (String)map$Entry.getKey();
            final String s4 = (String)map$Entry.getValue();
            final StringBuilder sb = new StringBuilder();
            sb.append(s3);
            sb.append("=");
            sb.append(s4);
            list.add((Object)sb.toString());
        }
        final byte[] c = ((S1)l1).c();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("measurement_batch", c);
        contentValues.put("upload_uri", s2);
        final StringBuilder sb2 = new StringBuilder();
        final int size = list.size();
        if (size > 0) {
            sb2.append((CharSequence)list.get(0));
            int j = 1;
            while (j < size) {
                sb2.append((CharSequence)"\r\n");
                final Object value = list.get(j);
                ++j;
                sb2.append((CharSequence)value);
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(e.d(n)));
        p5.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", Integer.valueOf(0));
        Label_0523: {
            try {
                if (this.D().insert("upload_queue", (String)null, contentValues) == -1L) {
                    this.j().H.g("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", s);
                    return;
                }
            }
            catch (final SQLiteException ex) {
                break Label_0523;
            }
            return;
        }
        final SQLiteException ex;
        this.j().H.e(s, ex, "Error storing MeasurementBatch to upload_queue. appId");
    }
    
    public final void a0(final String s, final Long n, final long n2, final f1 f1) {
        this.v();
        this.z();
        A.h((Object)f1);
        A.e(s);
        final byte[] c = ((S1)f1).c();
        this.j().P.e(((n0)super.C).O.c(s), c.length, "Saving complex main event, appId, data size");
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("event_id", n);
        contentValues.put("children_to_process", Long.valueOf(n2));
        contentValues.put("main_event", c);
        Label_0163: {
            try {
                if (this.D().insertWithOnConflict("main_event_params", (String)null, contentValues, 5) == -1L) {
                    this.j().H.g("Failed to insert complex main event (got -1). appId", K2.P.z(s));
                    return;
                }
            }
            catch (final SQLiteException ex) {
                break Label_0163;
            }
            return;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(s), ex, "Error storing complex main event. appId");
    }
    
    public final void b0(final String s, String g) {
        A.e(s);
        A.e(g);
        this.v();
        this.z();
        try {
            this.D().delete("conditional_properties", "app_id=? and name=?", new String[] { s, g });
        }
        catch (final SQLiteException ex) {
            final P j = this.j();
            final Q z = K2.P.z(s);
            g = ((n0)super.C).O.g(g);
            j.H.h("Error deleting conditional property", z, g, ex);
        }
    }
    
    public final void c0(final List list) {
        this.v();
        this.z();
        A.h((Object)list);
        if (((ArrayList)list).size() != 0) {
            if (!this.i0()) {
                return;
            }
            final String g = a.g("(", TextUtils.join((CharSequence)",", (Iterable)list), ")");
            final StringBuilder sb = new StringBuilder("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb.append(g);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (this.l0(sb.toString(), null) > 0L) {
                this.j().K.f("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                final SQLiteDatabase d = this.D();
                final StringBuilder sb2 = new StringBuilder("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(g);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                d.execSQL(sb2.toString());
                return;
            }
            catch (final SQLiteException ex) {
                this.j().H.g("Error incrementing retry count. error", ex);
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }
    
    public final boolean d0(final c c) {
        this.v();
        this.z();
        final String c2 = c.C;
        A.h((Object)c2);
        if (this.v0(c2, c.E.D) == null && this.l0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { c2 }) >= 1000L) {
            return false;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2);
        contentValues.put("origin", c.D);
        contentValues.put("name", c.E.D);
        final Object a = c.E.a();
        A.h(a);
        S(contentValues, a);
        contentValues.put("active", Boolean.valueOf(c.G));
        contentValues.put("trigger_event_name", c.H);
        contentValues.put("trigger_timeout", Long.valueOf(c.J));
        this.u();
        contentValues.put("timed_out_event", J1.l0((Parcelable)c.I));
        contentValues.put("creation_timestamp", Long.valueOf(c.F));
        this.u();
        contentValues.put("triggered_event", J1.l0((Parcelable)c.K));
        contentValues.put("triggered_timestamp", Long.valueOf(c.E.E));
        contentValues.put("time_to_live", Long.valueOf(c.L));
        this.u();
        contentValues.put("expired_event", J1.l0((Parcelable)c.M));
        try {
            if (this.D().insertWithOnConflict("conditional_properties", (String)null, contentValues, 5) == -1L) {
                this.j().H.g("Failed to insert/update conditional user property (got -1)", K2.P.z(c2));
            }
        }
        catch (final SQLiteException ex) {
            this.j().H.e(K2.P.z(c2), ex, "Error storing conditional user property");
        }
        return true;
    }
    
    public final boolean e0(final s s, final long n, final boolean b) {
        this.v();
        this.z();
        final String a = s.a;
        A.e(a);
        final byte[] c = ((S1)this.w().J(s)).c();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a);
        contentValues.put("name", s.b);
        contentValues.put("timestamp", Long.valueOf(s.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(n));
        contentValues.put("data", c);
        contentValues.put("realtime", Integer.valueOf((int)(b ? 1 : 0)));
        Label_0159: {
            try {
                if (this.D().insert("raw_events", (String)null, contentValues) == -1L) {
                    this.j().H.g("Failed to insert raw event (got -1). appId", K2.P.z(a));
                    return false;
                }
            }
            catch (final SQLiteException ex) {
                break Label_0159;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(a), ex, "Error storing raw event. appId");
        return false;
    }
    
    public final boolean f0(final H1 h1) {
        this.v();
        this.z();
        final String a = h1.a;
        final String c = h1.c;
        final H1 v0 = this.v0(a, c);
        final String b = h1.b;
        if (v0 == null) {
            if (J1.B0(c)) {
                if (this.l0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { a }) >= Math.max(Math.min(((n0)super.C).I.A(a, w.I), 100), 25)) {
                    return false;
                }
            }
            else if (!"_npa".equals((Object)c) && this.l0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { a, b }) >= 25L) {
                return false;
            }
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a);
        contentValues.put("origin", b);
        contentValues.put("name", c);
        contentValues.put("set_timestamp", Long.valueOf(h1.d));
        S(contentValues, h1.e);
        try {
            if (this.D().insertWithOnConflict("user_attributes", (String)null, contentValues, 5) == -1L) {
                this.j().H.g("Failed to insert/update user property (got -1). appId", K2.P.z(a));
            }
        }
        catch (final SQLiteException ex) {
            this.j().H.e(K2.P.z(a), ex, "Error storing user property. appId");
        }
        return true;
    }
    
    public final boolean g0(String value, final int n, final w0 w0) {
        this.z();
        this.v();
        A.e(value);
        A.h((Object)w0);
        final boolean empty = w0.v().isEmpty();
        final Object o = null;
        if (empty) {
            final P j = this.j();
            final Q z = K2.P.z(value);
            Object value2 = o;
            if (w0.B()) {
                value2 = w0.s();
            }
            value = String.valueOf(value2);
            j.K.h("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", z, n, value);
            return false;
        }
        final byte[] c = ((S1)w0).c();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", value);
        contentValues.put("audience_id", Integer.valueOf(n));
        Integer value3;
        if (w0.B()) {
            value3 = w0.s();
        }
        else {
            value3 = null;
        }
        contentValues.put("filter_id", value3);
        contentValues.put("event_name", w0.v());
        Boolean value4;
        if (w0.C()) {
            value4 = w0.z();
        }
        else {
            value4 = null;
        }
        contentValues.put("session_scoped", value4);
        contentValues.put("data", c);
        Label_0254: {
            try {
                if (this.D().insertWithOnConflict("event_filters", (String)null, contentValues, 5) == -1L) {
                    this.j().H.g("Failed to insert event filter (got -1). appId", K2.P.z(value));
                }
            }
            catch (final SQLiteException ex) {
                break Label_0254;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(value), ex, "Error storing event filter. appId");
        return false;
    }
    
    public final boolean h0(String value, final int n, final C0 c0) {
        this.z();
        this.v();
        A.e(value);
        A.h((Object)c0);
        final boolean empty = c0.s().isEmpty();
        final Object o = null;
        if (empty) {
            final P j = this.j();
            final Q z = K2.P.z(value);
            Object value2 = o;
            if (c0.w()) {
                value2 = c0.o();
            }
            value = String.valueOf(value2);
            j.K.h("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", z, n, value);
            return false;
        }
        final byte[] c2 = ((S1)c0).c();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", value);
        contentValues.put("audience_id", Integer.valueOf(n));
        Integer value3;
        if (c0.w()) {
            value3 = c0.o();
        }
        else {
            value3 = null;
        }
        contentValues.put("filter_id", value3);
        contentValues.put("property_name", c0.s());
        Boolean value4;
        if (c0.x()) {
            value4 = c0.v();
        }
        else {
            value4 = null;
        }
        contentValues.put("session_scoped", value4);
        contentValues.put("data", c2);
        Label_0253: {
            try {
                if (this.D().insertWithOnConflict("property_filters", (String)null, contentValues, 5) == -1L) {
                    this.j().H.g("Failed to insert property filter (got -1). appId", K2.P.z(value));
                    return false;
                }
            }
            catch (final SQLiteException ex) {
                break Label_0253;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(value), ex, "Error storing property filter. appId");
        return false;
    }
    
    public final boolean i0() {
        return ((n0)super.C).C.getDatabasePath("google_app_measurement.db").exists();
    }
    
    public final String j0() {
        ((n0)super.C).P.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final long longValue = (long)w.F.a(null);
        final StringBuilder sb = new StringBuilder("(upload_type = 1 AND (ABS(creation_timestamp - ");
        sb.append(currentTimeMillis);
        sb.append(") > CAST(");
        sb.append(longValue);
        sb.append(" AS INTEGER)))");
        final String string = sb.toString();
        final long longValue2 = (long)w.E.a(null);
        final StringBuilder sb2 = new StringBuilder("(upload_type != 1 AND (ABS(creation_timestamp - ");
        sb2.append(currentTimeMillis);
        sb2.append(") > CAST(");
        sb2.append(longValue2);
        sb2.append(" AS INTEGER)))");
        return a.i("(", string, " OR ", sb2.toString(), ")");
    }
    
    public final long k0(final String s) {
        A.e(s);
        A.e("first_open_count");
        this.v();
        this.z();
        final SQLiteDatabase d = this.D();
        d.beginTransaction();
        final long n = 0L;
        long h = 0L;
        Label_0276: {
            Label_0169: {
                try {
                    try {
                        if ((h = this.H("select first_open_count from app2 where app_id=?", new String[] { s }, -1L)) != -1L) {
                            break Label_0169;
                        }
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", s);
                        contentValues.put("first_open_count", Integer.valueOf(0));
                        contentValues.put("previous_install_count", Integer.valueOf(0));
                        if (d.insertWithOnConflict("app2", (String)null, contentValues, 5) == -1L) {
                            this.j().H.e(K2.P.z(s), "first_open_count", "Failed to insert column (got -1). appId");
                            d.endTransaction();
                            return -1L;
                        }
                    }
                    finally {}
                }
                catch (final SQLiteException ex) {
                    h = n;
                    break Label_0276;
                }
                h = 0L;
                try {
                    final ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", s);
                    contentValues2.put("first_open_count", Long.valueOf(1L + h));
                    if (d.update("app2", contentValues2, "app_id = ?", new String[] { s }) == 0L) {
                        this.j().H.e(K2.P.z(s), "first_open_count", "Failed to update column (got 0). appId");
                        d.endTransaction();
                        return -1L;
                    }
                }
                catch (final SQLiteException ex) {
                    break Label_0276;
                }
            }
            d.setTransactionSuccessful();
            d.endTransaction();
            return h;
        }
        final SQLiteException ex;
        this.j().H.h("Error inserting column. appId", K2.P.z(s), "first_open_count", ex);
        d.endTransaction();
        return h;
        d.endTransaction();
    }
    
    public final long l0(final String s, String[] array) {
        final SQLiteDatabase d = this.D();
        Object rawQuery = null;
        try {
            try {
                final Cursor cursor;
                array = (String[])(Object)(cursor = (Cursor)(rawQuery = d.rawQuery(s, array)));
                if (((Cursor)(Object)array).moveToFirst()) {
                    rawQuery = array;
                    final long long1 = ((Cursor)(Object)array).getLong(0);
                    ((Cursor)(Object)array).close();
                    return long1;
                }
                throw new SQLiteException("Database returned empty set");
            }
            finally {
                if (rawQuery != null) {
                    ((Cursor)rawQuery).close();
                }
                throw new SQLiteException("Database returned empty set");
                final SQLiteException ex;
                this.j().H.e(s, ex, "Database error");
                throw ex;
            }
        }
        catch (final SQLiteException ex2) {}
    }
    
    public final List m0(String o, String query, final String ex) {
        A.e((String)o);
        this.v();
        this.z();
        final ArrayList list = new ArrayList();
        final String s = null;
        Object o2 = null;
        Object o4;
        final Object o3 = o4 = null;
        Label_0731: {
            String string = null;
            Label_0689: {
                while (true) {
                    try {
                        Label_0154: {
                            ArrayList list2;
                            try {
                                o4 = o3;
                                list2 = new ArrayList(3);
                                o4 = o3;
                                final ArrayList list3 = list2;
                                final Object o5 = o;
                                list3.add(o5);
                                o4 = o3;
                                final StringBuilder sb = new(java.lang.StringBuilder.class)();
                                final StringBuilder sb2 = sb;
                                o4 = o3;
                                final StringBuilder sb3 = sb2;
                                final String s2 = "app_id=?";
                                new StringBuilder(s2);
                                o4 = o3;
                                final String s3 = query;
                                final boolean empty = TextUtils.isEmpty((CharSequence)s3);
                                final boolean empty2 = empty;
                                if (!empty2) {
                                    o2 = query;
                                    o4 = o3;
                                    String s4 = s;
                                    string = (String)o2;
                                    final ArrayList list4 = list2;
                                    final String s5 = (String)o2;
                                    list4.add((Object)s5);
                                    o4 = o3;
                                    s4 = s;
                                    string = (String)o2;
                                    final StringBuilder sb4 = sb2;
                                    final String s6 = " and origin=?";
                                    sb4.append(s6);
                                    break Label_0154;
                                }
                                break Label_0154;
                            }
                            finally {
                                final Object o6;
                                o = o6;
                                break Label_0731;
                            }
                            try {
                                final ArrayList list3 = list2;
                                final Object o5 = o;
                                list3.add(o5);
                                o4 = o3;
                                final StringBuilder sb = new(java.lang.StringBuilder.class)();
                                final StringBuilder sb2 = sb;
                                o4 = o3;
                                final StringBuilder sb3 = sb2;
                                final String s2 = "app_id=?";
                                new StringBuilder(s2);
                                o4 = o3;
                                final String s3 = query;
                                final boolean empty2;
                                final boolean empty = empty2 = TextUtils.isEmpty((CharSequence)s3);
                                if (!empty2) {
                                    o2 = query;
                                    o4 = o3;
                                    String s4 = s;
                                    string = (String)o2;
                                    try {
                                        final ArrayList list4 = list2;
                                        final String s5 = (String)o2;
                                        list4.add((Object)s5);
                                        o4 = o3;
                                        s4 = s;
                                        string = (String)o2;
                                        final StringBuilder sb4 = sb2;
                                        final String s6 = " and origin=?";
                                        sb4.append(s6);
                                    }
                                    catch (final SQLiteException ex) {
                                        query = s4;
                                        break Label_0689;
                                    }
                                }
                                o2 = query;
                                if (!TextUtils.isEmpty((CharSequence)ex)) {
                                    query = (String)new StringBuilder();
                                    ((StringBuilder)query).append((String)ex);
                                    ((StringBuilder)query).append("*");
                                    list2.add((Object)((StringBuilder)query).toString());
                                    sb2.append(" and name glob ?");
                                }
                                query = (String)list2.toArray((Object[])new String[list2.size()]);
                                query = (String)this.D().query("user_attributes", new String[] { "name", "set_timestamp", "value", "origin" }, sb2.toString(), (String[])(Object)query, (String)null, (String)null, "rowid", "1001");
                                if (!((Cursor)query).moveToFirst()) {
                                    ((Cursor)query).close();
                                    return (List)list;
                                }
                                while (true) {
                                    Label_0651: {
                                        if (list.size() >= 1000) {
                                            this.j().H.g("Read more than the max allowed user properties, ignoring excess", 1000);
                                            break Label_0651;
                                        }
                                        final String string2 = ((Cursor)query).getString(0);
                                        Object k = query;
                                        string = (String)o2;
                                        final long long1 = ((Cursor)query).getLong(1);
                                        o4 = query;
                                        try {
                                            Label_0635: {
                                                Label_0599: {
                                                    try {
                                                        k = this.K((Cursor)query, 2);
                                                        o4 = query;
                                                        string = ((Cursor)query).getString(3);
                                                        if (k == null) {
                                                            o4 = query;
                                                            final h h = this;
                                                            final P p = h.j();
                                                            final S s7 = p.H;
                                                            final String s8 = "(2)Read invalid user property value, ignoring it";
                                                            final Object o7 = o;
                                                            final Q q = K2.P.z((String)o7);
                                                            final String s9 = string;
                                                            final SQLiteException ex2 = ex;
                                                            s7.h(s8, q, s9, ex2);
                                                            break Label_0635;
                                                        }
                                                        break Label_0599;
                                                    }
                                                    finally {
                                                        final Object o8;
                                                        o = o8;
                                                        break Label_0731;
                                                    }
                                                    try {
                                                        final h h = this;
                                                        final P p = h.j();
                                                        final S s7 = p.H;
                                                        final String s8 = "(2)Read invalid user property value, ignoring it";
                                                        final Object o7 = o;
                                                        final Q q = K2.P.z((String)o7);
                                                        final String s9 = string;
                                                        final SQLiteException ex2 = ex;
                                                        s7.h(s8, q, s9, ex2);
                                                        break Label_0635;
                                                    }
                                                    catch (final SQLiteException ex) {
                                                        break Label_0689;
                                                    }
                                                }
                                                o2 = new H1((String)o, string, string2, long1, k);
                                                list.add(o2);
                                            }
                                            if (!((Cursor)query).moveToNext()) {
                                                ((Cursor)query).close();
                                                return (List)list;
                                            }
                                            o2 = string;
                                            continue;
                                        }
                                        catch (final SQLiteException ex) {
                                            string = (String)o2;
                                        }
                                    }
                                }
                            }
                            catch (final SQLiteException ex3) {}
                        }
                        string = query;
                        query = (String)o2;
                    }
                    catch (final SQLiteException ex) {
                        continue;
                    }
                    break;
                }
            }
            this.j().H.h("(2)Error querying user properties", K2.P.z((String)o), string, ex);
            final List emptyList = Collections.emptyList();
            if (query != null) {
                ((Cursor)query).close();
            }
            return emptyList;
        }
        if (o4 != null) {
            ((Cursor)o4).close();
        }
    }
    
    public final void n0(final String s, final z0 z0) {
        A.h((Object)s);
        A.h((Object)z0);
        this.v();
        this.z();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("consent_state", z0.m());
        contentValues.put("consent_source", Integer.valueOf(z0.b));
        this.R(contentValues);
    }
    
    public final void o0(final String s, final Bundle bundle) {
        this.v();
        this.z();
        final byte[] c = ((S1)this.w().J(new s((n0)super.C, "", s, "dep", 0L, 0L, bundle))).c();
        this.j().P.e(((n0)super.C).O.c(s), c.length, "Saving default event parameters, appId, data size");
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("parameters", c);
        Label_0159: {
            try {
                if (this.D().insertWithOnConflict("default_event_params", (String)null, contentValues, 5) == -1L) {
                    this.j().H.g("Failed to insert default event parameters (got -1). appId", K2.P.z(s));
                    return;
                }
            }
            catch (final SQLiteException ex) {
                break Label_0159;
            }
            return;
        }
        final SQLiteException ex;
        this.j().H.e(K2.P.z(s), ex, "Error storing default event parameters. appId");
    }
    
    public final void p0(final String s, final ArrayList list) {
        A.e(s);
        this.z();
        this.v();
        final SQLiteDatabase d = this.D();
        try {
            final long l0 = this.l0("select count(1) from audience_filter_values where app_id=?", new String[] { s });
            final int min = Math.min(2000, ((n0)super.C).I.A(s, w.H));
            int i = 0;
            final int max = Math.max(0, min);
            if (l0 <= max) {
                return;
            }
            final ArrayList list2 = new ArrayList();
            while (i < list.size()) {
                final Integer n = (Integer)list.get(i);
                if (n == null) {
                    return;
                }
                list2.add((Object)Integer.toString((int)n));
                ++i;
            }
            d.delete("audience_filter_values", a.g("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a.g("(", TextUtils.join((CharSequence)",", (Iterable)list2), ")"), " order by rowid desc limit -1 offset ?)"), new String[] { s, Integer.toString(max) });
        }
        catch (final SQLiteException ex) {
            this.j().H.e(K2.P.z(s), ex, "Database error querying filters. appId");
        }
    }
    
    public final long q0(final String s) {
        A.e(s);
        this.v();
        this.z();
        return this.H("select first_open_count from app2 where app_id=?", new String[] { s }, -1L);
    }
    
    public final long r0(final String s) {
        A.e(s);
        return this.H("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { s }, 0L);
    }
    
    public final c s0(final String s, final String s2) {
        final n0 n0 = (n0)super.C;
        A.e(s);
        A.e(s2);
        this.v();
        this.z();
        Cursor query = null;
        Label_0583: {
            Cursor cursor = null;
            String string = null;
            Label_0537: {
                try {
                    cursor = (query = this.D().query("conditional_properties", new String[] { "origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event" }, "app_id=? and name=?", new String[] { s, s2 }, (String)null, (String)null, (String)null));
                    try {
                        try {
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return null;
                            }
                            query = cursor;
                            if ((string = cursor.getString(0)) == null) {
                                string = "";
                            }
                        }
                        finally {}
                    }
                    catch (final SQLiteException string) {
                        break Label_0537;
                    }
                    query = cursor;
                    final Object k = this.K(cursor, 1);
                    query = cursor;
                    final boolean b = cursor.getInt(2) != 0;
                    query = cursor;
                    final String string2 = cursor.getString(3);
                    query = cursor;
                    final long long1 = cursor.getLong(4);
                    query = cursor;
                    final T w = this.w();
                    query = cursor;
                    final byte[] blob = cursor.getBlob(5);
                    query = cursor;
                    final Parcelable$Creator<v> creator = v.CREATOR;
                    query = cursor;
                    final v v = (v)w.I(blob, creator);
                    query = cursor;
                    final long long2 = cursor.getLong(6);
                    query = cursor;
                    final v v2 = (v)this.w().I(cursor.getBlob(7), creator);
                    query = cursor;
                    final long long3 = cursor.getLong(8);
                    query = cursor;
                    final long long4 = cursor.getLong(9);
                    query = cursor;
                    final v v3 = (v)this.w().I(cursor.getBlob(10), creator);
                    query = cursor;
                    query = cursor;
                    final G1 g1 = new G1(long3, k, s2, string);
                    query = cursor;
                    query = cursor;
                    final c c = new c(s, string, g1, long2, b, string2, v, long1, v2, long4, v3);
                    query = cursor;
                    if (cursor.moveToNext()) {
                        query = cursor;
                        this.j().H.e(K2.P.z(s), n0.O.g(s2), "Got multiple records for conditional property, expected one");
                    }
                    cursor.close();
                    return c;
                }
                catch (final SQLiteException string) {
                    cursor = null;
                }
                finally {
                    break Label_0583;
                }
            }
            this.j().H.h("Error querying conditional property", K2.P.z(s), n0.O.g(s2), string);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        if (query != null) {
            query.close();
        }
    }
    
    public final r t0(final String s, final String s2, final String s3) {
        Cursor cursor3 = null;
        while (true) {
            A.e(s2);
            A.e(s3);
            this.v();
            this.z();
            Object value = new ArrayList((Collection)Arrays.asList((Object[])new String[] { "lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count" }));
            Cursor query = null;
            while (true) {
                Label_0510: {
                    try {
                        Object o = this.D();
                        boolean b = false;
                        final Cursor cursor = query = ((SQLiteDatabase)o).query(s, (String[])((ArrayList)value).toArray((Object[])new String[0]), "app_id=? and name=?", new String[] { s2, s3 }, (String)null, (String)null, (String)null);
                        long long1 = 0L;
                        long long2 = 0L;
                        long long3 = 0L;
                        long long4 = 0L;
                        Long value2 = null;
                        final Boolean b2;
                        Label_0389: {
                            try {
                                try {
                                    if (!cursor.moveToFirst()) {
                                        cursor.close();
                                        return null;
                                    }
                                    query = cursor;
                                    long1 = cursor.getLong(0);
                                    query = cursor;
                                    long2 = cursor.getLong(1);
                                    query = cursor;
                                    long3 = cursor.getLong(2);
                                    query = cursor;
                                    if (cursor.isNull(3)) {
                                        long4 = 0L;
                                    }
                                    else {
                                        query = cursor;
                                        long4 = cursor.getLong(3);
                                    }
                                    query = cursor;
                                    if (cursor.isNull(4)) {
                                        value = null;
                                    }
                                    else {
                                        query = cursor;
                                        value = cursor.getLong(4);
                                    }
                                    query = cursor;
                                    if (cursor.isNull(5)) {
                                        o = null;
                                    }
                                    else {
                                        query = cursor;
                                        o = cursor.getLong(5);
                                    }
                                    query = cursor;
                                    if (cursor.isNull(6)) {
                                        value2 = null;
                                    }
                                    else {
                                        query = cursor;
                                        value2 = cursor.getLong(6);
                                    }
                                    query = cursor;
                                    if (!cursor.isNull(7)) {
                                        query = cursor;
                                        if (cursor.getLong(7) == 1L) {
                                            b = true;
                                        }
                                        query = cursor;
                                        b;
                                        break Label_0389;
                                    }
                                }
                                finally {}
                            }
                            catch (final SQLiteException value) {
                                break Label_0510;
                            }
                            b2 = null;
                        }
                        final Cursor cursor2;
                        query = cursor2;
                        long long5;
                        if (cursor2.isNull(8)) {
                            long5 = 0L;
                        }
                        else {
                            query = cursor2;
                            long5 = cursor2.getLong(8);
                        }
                        query = cursor2;
                        query = cursor2;
                        final r r = new r(s2, s3, long1, long2, long5, long3, long4, (Long)value, (Long)o, value2, b2);
                        query = cursor2;
                        if (cursor2.moveToNext()) {
                            query = cursor2;
                            this.j().H.g("Got multiple records for event aggregates, expected one. appId", K2.P.z(s2));
                        }
                        cursor2.close();
                        return r;
                    }
                    catch (final SQLiteException value) {
                        cursor3 = null;
                    }
                    finally {
                        cursor3 = query;
                        break;
                    }
                }
                query = cursor3;
                final P j = this.j();
                try {
                    final S h = j.H;
                    query = cursor3;
                    final Q z = K2.P.z(s2);
                    try {
                        h.h("Error querying events. appId", z, ((n0)super.C).O.c(s3), value);
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        return null;
                    }
                    finally {}
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
        if (cursor3 != null) {
            cursor3.close();
        }
    }
    
    public final G u0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        C/u.C:Ljava/lang/Object;
        //     4: checkcast       LK2/n0;
        //     7: astore          14
        //     9: aload_0        
        //    10: getfield        K2/v1.D:LK2/y1;
        //    13: astore          11
        //    15: aload_1        
        //    16: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //    19: aload_0        
        //    20: invokevirtual   C/u.v:()V
        //    23: aload_0        
        //    24: invokevirtual   K2/u1.z:()V
        //    27: aconst_null    
        //    28: astore          10
        //    30: aload_0        
        //    31: invokevirtual   K2/h.D:()Landroid/database/sqlite/SQLiteDatabase;
        //    34: ldc_w           "apps"
        //    37: bipush          44
        //    39: anewarray       Ljava/lang/String;
        //    42: dup            
        //    43: iconst_0       
        //    44: ldc_w           "app_instance_id"
        //    47: aastore        
        //    48: dup            
        //    49: iconst_1       
        //    50: ldc_w           "gmp_app_id"
        //    53: aastore        
        //    54: dup            
        //    55: iconst_2       
        //    56: ldc_w           "resettable_device_id_hash"
        //    59: aastore        
        //    60: dup            
        //    61: iconst_3       
        //    62: ldc_w           "last_bundle_index"
        //    65: aastore        
        //    66: dup            
        //    67: iconst_4       
        //    68: ldc             "last_bundle_start_timestamp"
        //    70: aastore        
        //    71: dup            
        //    72: iconst_5       
        //    73: ldc_w           "last_bundle_end_timestamp"
        //    76: aastore        
        //    77: dup            
        //    78: bipush          6
        //    80: ldc             "app_version"
        //    82: aastore        
        //    83: dup            
        //    84: bipush          7
        //    86: ldc             "app_store"
        //    88: aastore        
        //    89: dup            
        //    90: bipush          8
        //    92: ldc             "gmp_version"
        //    94: aastore        
        //    95: dup            
        //    96: bipush          9
        //    98: ldc             "dev_cert_hash"
        //   100: aastore        
        //   101: dup            
        //   102: bipush          10
        //   104: ldc             "measurement_enabled"
        //   106: aastore        
        //   107: dup            
        //   108: bipush          11
        //   110: ldc             "day"
        //   112: aastore        
        //   113: dup            
        //   114: bipush          12
        //   116: ldc             "daily_public_events_count"
        //   118: aastore        
        //   119: dup            
        //   120: bipush          13
        //   122: ldc             "daily_events_count"
        //   124: aastore        
        //   125: dup            
        //   126: bipush          14
        //   128: ldc             "daily_conversions_count"
        //   130: aastore        
        //   131: dup            
        //   132: bipush          15
        //   134: ldc             "config_fetched_time"
        //   136: aastore        
        //   137: dup            
        //   138: bipush          16
        //   140: ldc             "failed_config_fetch_time"
        //   142: aastore        
        //   143: dup            
        //   144: bipush          17
        //   146: ldc             "app_version_int"
        //   148: aastore        
        //   149: dup            
        //   150: bipush          18
        //   152: ldc             "firebase_instance_id"
        //   154: aastore        
        //   155: dup            
        //   156: bipush          19
        //   158: ldc             "daily_error_events_count"
        //   160: aastore        
        //   161: dup            
        //   162: bipush          20
        //   164: ldc             "daily_realtime_events_count"
        //   166: aastore        
        //   167: dup            
        //   168: bipush          21
        //   170: ldc             "health_monitor_sample"
        //   172: aastore        
        //   173: dup            
        //   174: bipush          22
        //   176: ldc             "android_id"
        //   178: aastore        
        //   179: dup            
        //   180: bipush          23
        //   182: ldc             "adid_reporting_enabled"
        //   184: aastore        
        //   185: dup            
        //   186: bipush          24
        //   188: ldc             "admob_app_id"
        //   190: aastore        
        //   191: dup            
        //   192: bipush          25
        //   194: ldc             "dynamite_version"
        //   196: aastore        
        //   197: dup            
        //   198: bipush          26
        //   200: ldc             "safelisted_events"
        //   202: aastore        
        //   203: dup            
        //   204: bipush          27
        //   206: ldc             "ga_app_id"
        //   208: aastore        
        //   209: dup            
        //   210: bipush          28
        //   212: ldc             "session_stitching_token"
        //   214: aastore        
        //   215: dup            
        //   216: bipush          29
        //   218: ldc             "sgtm_upload_enabled"
        //   220: aastore        
        //   221: dup            
        //   222: bipush          30
        //   224: ldc             "target_os_version"
        //   226: aastore        
        //   227: dup            
        //   228: bipush          31
        //   230: ldc             "session_stitching_token_hash"
        //   232: aastore        
        //   233: dup            
        //   234: bipush          32
        //   236: ldc             "ad_services_version"
        //   238: aastore        
        //   239: dup            
        //   240: bipush          33
        //   242: ldc             "unmatched_first_open_without_ad_id"
        //   244: aastore        
        //   245: dup            
        //   246: bipush          34
        //   248: ldc             "npa_metadata_value"
        //   250: aastore        
        //   251: dup            
        //   252: bipush          35
        //   254: ldc             "attribution_eligibility_status"
        //   256: aastore        
        //   257: dup            
        //   258: bipush          36
        //   260: ldc             "sgtm_preview_key"
        //   262: aastore        
        //   263: dup            
        //   264: bipush          37
        //   266: ldc             "dma_consent_state"
        //   268: aastore        
        //   269: dup            
        //   270: bipush          38
        //   272: ldc             "daily_realtime_dcu_count"
        //   274: aastore        
        //   275: dup            
        //   276: bipush          39
        //   278: ldc             "bundle_delivery_index"
        //   280: aastore        
        //   281: dup            
        //   282: bipush          40
        //   284: ldc             "serialized_npa_metadata"
        //   286: aastore        
        //   287: dup            
        //   288: bipush          41
        //   290: ldc             "unmatched_pfo"
        //   292: aastore        
        //   293: dup            
        //   294: bipush          42
        //   296: ldc             "unmatched_uwa"
        //   298: aastore        
        //   299: dup            
        //   300: bipush          43
        //   302: ldc             "ad_campaign_info"
        //   304: aastore        
        //   305: ldc_w           "app_id=?"
        //   308: iconst_1       
        //   309: anewarray       Ljava/lang/String;
        //   312: dup            
        //   313: iconst_0       
        //   314: aload_1        
        //   315: aastore        
        //   316: aconst_null    
        //   317: aconst_null    
        //   318: aconst_null    
        //   319: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   322: astore          9
        //   324: aload           9
        //   326: astore          10
        //   328: aload           9
        //   330: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   335: istore          5
        //   337: iload           5
        //   339: ifne            351
        //   342: aload           9
        //   344: invokeinterface android/database/Cursor.close:()V
        //   349: aconst_null    
        //   350: areturn        
        //   351: aload           9
        //   353: astore          10
        //   355: new             LK2/G;
        //   358: astore          12
        //   360: aload           9
        //   362: astore          10
        //   364: aload           11
        //   366: getfield        K2/y1.N:LK2/n0;
        //   369: astore          13
        //   371: aload           12
        //   373: aload           13
        //   375: aload_1        
        //   376: invokespecial   K2/G.<init>:(LK2/n0;Ljava/lang/String;)V
        //   379: aload           12
        //   381: getfield        K2/G.a:LK2/n0;
        //   384: astore          13
        //   386: aload           9
        //   388: astore          10
        //   390: invokestatic    com/google/android/gms/internal/measurement/a3.a:()V
        //   393: aload           9
        //   395: astore          10
        //   397: aload           14
        //   399: getfield        K2/n0.I:LK2/d;
        //   402: astore          16
        //   404: aload           9
        //   406: astore          10
        //   408: getstatic       K2/w.X0:LK2/F;
        //   411: astore          15
        //   413: aload           9
        //   415: astore          10
        //   417: aload           16
        //   419: aconst_null    
        //   420: aload           15
        //   422: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //   425: istore          5
        //   427: getstatic       K2/y0.E:LK2/y0;
        //   430: astore          16
        //   432: iload           5
        //   434: ifeq            471
        //   437: aload           9
        //   439: astore          10
        //   441: aload           11
        //   443: aload_1        
        //   444: invokevirtual   K2/y1.J:(Ljava/lang/String;)LK2/z0;
        //   447: aload           16
        //   449: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //   452: ifeq            488
        //   455: goto            471
        //   458: astore_1       
        //   459: aload           10
        //   461: astore          9
        //   463: goto            2520
        //   466: astore          11
        //   468: goto            2483
        //   471: aload           9
        //   473: astore          10
        //   475: aload           12
        //   477: aload           9
        //   479: iconst_0       
        //   480: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   485: invokevirtual   K2/G.r:(Ljava/lang/String;)V
        //   488: iconst_1       
        //   489: istore_3       
        //   490: aload           9
        //   492: astore          10
        //   494: aload           12
        //   496: aload           9
        //   498: iconst_1       
        //   499: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   504: invokevirtual   K2/G.C:(Ljava/lang/String;)V
        //   507: aload           9
        //   509: astore          10
        //   511: invokestatic    com/google/android/gms/internal/measurement/a3.a:()V
        //   514: aload           9
        //   516: astore          10
        //   518: aload           14
        //   520: getfield        K2/n0.I:LK2/d;
        //   523: aconst_null    
        //   524: aload           15
        //   526: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //   529: ifeq            551
        //   532: aload           9
        //   534: astore          10
        //   536: aload           11
        //   538: aload_1        
        //   539: invokevirtual   K2/y1.J:(Ljava/lang/String;)LK2/z0;
        //   542: getstatic       K2/y0.D:LK2/y0;
        //   545: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //   548: ifeq            568
        //   551: aload           9
        //   553: astore          10
        //   555: aload           12
        //   557: aload           9
        //   559: iconst_2       
        //   560: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   565: invokevirtual   K2/G.G:(Ljava/lang/String;)V
        //   568: aload           9
        //   570: astore          10
        //   572: aload           12
        //   574: aload           9
        //   576: iconst_3       
        //   577: invokeinterface android/database/Cursor.getLong:(I)J
        //   582: invokevirtual   K2/G.Q:(J)V
        //   585: aload           9
        //   587: astore          10
        //   589: aload           12
        //   591: aload           9
        //   593: iconst_4       
        //   594: invokeinterface android/database/Cursor.getLong:(I)J
        //   599: invokevirtual   K2/G.R:(J)V
        //   602: aload           9
        //   604: astore          10
        //   606: aload           12
        //   608: aload           9
        //   610: iconst_5       
        //   611: invokeinterface android/database/Cursor.getLong:(I)J
        //   616: invokevirtual   K2/G.P:(J)V
        //   619: aload           9
        //   621: astore          10
        //   623: aload           12
        //   625: aload           9
        //   627: bipush          6
        //   629: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   634: invokevirtual   K2/G.x:(Ljava/lang/String;)V
        //   637: aload           9
        //   639: astore          10
        //   641: aload           12
        //   643: aload           9
        //   645: bipush          7
        //   647: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   652: invokevirtual   K2/G.v:(Ljava/lang/String;)V
        //   655: aload           9
        //   657: astore          10
        //   659: aload           12
        //   661: aload           9
        //   663: bipush          8
        //   665: invokeinterface android/database/Cursor.getLong:(I)J
        //   670: invokevirtual   K2/G.M:(J)V
        //   673: aload           9
        //   675: astore          10
        //   677: aload           12
        //   679: aload           9
        //   681: bipush          9
        //   683: invokeinterface android/database/Cursor.getLong:(I)J
        //   688: invokevirtual   K2/G.J:(J)V
        //   691: aload           9
        //   693: astore          10
        //   695: aload           9
        //   697: bipush          10
        //   699: invokeinterface android/database/Cursor.isNull:(I)Z
        //   704: ifne            732
        //   707: aload           9
        //   709: astore          10
        //   711: aload           9
        //   713: bipush          10
        //   715: invokeinterface android/database/Cursor.getInt:(I)I
        //   720: ifeq            726
        //   723: goto            732
        //   726: iconst_0       
        //   727: istore          5
        //   729: goto            735
        //   732: iconst_1       
        //   733: istore          5
        //   735: aload           9
        //   737: astore          10
        //   739: aload           12
        //   741: iload           5
        //   743: invokevirtual   K2/G.s:(Z)V
        //   746: aload           9
        //   748: astore          10
        //   750: aload           12
        //   752: aload           9
        //   754: bipush          11
        //   756: invokeinterface android/database/Cursor.getLong:(I)J
        //   761: invokevirtual   K2/G.I:(J)V
        //   764: aload           9
        //   766: astore          10
        //   768: aload           12
        //   770: aload           9
        //   772: bipush          12
        //   774: invokeinterface android/database/Cursor.getLong:(I)J
        //   779: invokevirtual   K2/G.F:(J)V
        //   782: aload           9
        //   784: astore          10
        //   786: aload           12
        //   788: aload           9
        //   790: bipush          13
        //   792: invokeinterface android/database/Cursor.getLong:(I)J
        //   797: invokevirtual   K2/G.D:(J)V
        //   800: aload           9
        //   802: astore          10
        //   804: aload           12
        //   806: aload           9
        //   808: bipush          14
        //   810: invokeinterface android/database/Cursor.getLong:(I)J
        //   815: invokevirtual   K2/G.z:(J)V
        //   818: aload           9
        //   820: astore          10
        //   822: aload           12
        //   824: aload           9
        //   826: bipush          15
        //   828: invokeinterface android/database/Cursor.getLong:(I)J
        //   833: invokevirtual   K2/G.w:(J)V
        //   836: aload           9
        //   838: astore          10
        //   840: aload           12
        //   842: aload           9
        //   844: bipush          16
        //   846: invokeinterface android/database/Cursor.getLong:(I)J
        //   851: invokevirtual   K2/G.L:(J)V
        //   854: aload           9
        //   856: astore          10
        //   858: aload           9
        //   860: bipush          17
        //   862: invokeinterface android/database/Cursor.isNull:(I)Z
        //   867: ifeq            878
        //   870: ldc2_w          -2147483648
        //   873: lstore          7
        //   875: goto            894
        //   878: aload           9
        //   880: astore          10
        //   882: aload           9
        //   884: bipush          17
        //   886: invokeinterface android/database/Cursor.getInt:(I)I
        //   891: i2l            
        //   892: lstore          7
        //   894: aload           9
        //   896: astore          10
        //   898: aload           12
        //   900: lload           7
        //   902: invokevirtual   K2/G.q:(J)V
        //   905: aload           9
        //   907: astore          10
        //   909: aload           12
        //   911: aload           9
        //   913: bipush          18
        //   915: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   920: invokevirtual   K2/G.A:(Ljava/lang/String;)V
        //   923: aload           9
        //   925: astore          10
        //   927: aload           12
        //   929: aload           9
        //   931: bipush          19
        //   933: invokeinterface android/database/Cursor.getLong:(I)J
        //   938: invokevirtual   K2/G.B:(J)V
        //   941: aload           9
        //   943: astore          10
        //   945: aload           12
        //   947: aload           9
        //   949: bipush          20
        //   951: invokeinterface android/database/Cursor.getLong:(I)J
        //   956: invokevirtual   K2/G.H:(J)V
        //   959: aload           9
        //   961: astore          10
        //   963: aload           12
        //   965: aload           9
        //   967: bipush          21
        //   969: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   974: invokevirtual   K2/G.E:(Ljava/lang/String;)V
        //   977: aload           9
        //   979: astore          10
        //   981: aload           9
        //   983: bipush          23
        //   985: invokeinterface android/database/Cursor.isNull:(I)Z
        //   990: ifne            1020
        //   993: aload           9
        //   995: astore          10
        //   997: aload           9
        //   999: bipush          23
        //  1001: invokeinterface android/database/Cursor.getInt:(I)I
        //  1006: istore_2       
        //  1007: iload_2        
        //  1008: ifeq            1014
        //  1011: goto            1020
        //  1014: iconst_0       
        //  1015: istore          5
        //  1017: goto            1023
        //  1020: iconst_1       
        //  1021: istore          5
        //  1023: aload           13
        //  1025: getfield        K2/n0.L:LK2/k0;
        //  1028: astore          10
        //  1030: aload           10
        //  1032: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1035: aload           10
        //  1037: invokevirtual   K2/k0.v:()V
        //  1040: aload           12
        //  1042: getfield        K2/G.Q:Z
        //  1045: istore          6
        //  1047: aload           12
        //  1049: getfield        K2/G.p:Z
        //  1052: iload           5
        //  1054: if_icmpeq       1062
        //  1057: iconst_1       
        //  1058: istore_2       
        //  1059: goto            1064
        //  1062: iconst_0       
        //  1063: istore_2       
        //  1064: aload           12
        //  1066: iload           6
        //  1068: iload_2        
        //  1069: ior            
        //  1070: putfield        K2/G.Q:Z
        //  1073: aload           12
        //  1075: iload           5
        //  1077: putfield        K2/G.p:Z
        //  1080: aload           9
        //  1082: astore          10
        //  1084: aload           12
        //  1086: aload           9
        //  1088: bipush          24
        //  1090: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1095: invokevirtual   K2/G.b:(Ljava/lang/String;)V
        //  1098: aload           9
        //  1100: astore          10
        //  1102: aload           9
        //  1104: bipush          25
        //  1106: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1111: ifeq            1120
        //  1114: lconst_0       
        //  1115: lstore          7
        //  1117: goto            1135
        //  1120: aload           9
        //  1122: astore          10
        //  1124: aload           9
        //  1126: bipush          25
        //  1128: invokeinterface android/database/Cursor.getLong:(I)J
        //  1133: lstore          7
        //  1135: aload           9
        //  1137: astore          10
        //  1139: aload           12
        //  1141: lload           7
        //  1143: invokevirtual   K2/G.K:(J)V
        //  1146: aload           9
        //  1148: astore          10
        //  1150: aload           9
        //  1152: bipush          26
        //  1154: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1159: ifne            1190
        //  1162: aload           9
        //  1164: astore          10
        //  1166: aload           12
        //  1168: aload           9
        //  1170: bipush          26
        //  1172: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1177: ldc_w           ","
        //  1180: iconst_m1      
        //  1181: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //  1184: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //  1187: invokevirtual   K2/G.c:(Ljava/util/List;)V
        //  1190: aload           9
        //  1192: astore          10
        //  1194: invokestatic    com/google/android/gms/internal/measurement/a3.a:()V
        //  1197: aload           9
        //  1199: astore          10
        //  1201: aload           14
        //  1203: getfield        K2/n0.I:LK2/d;
        //  1206: aconst_null    
        //  1207: aload           15
        //  1209: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1212: ifeq            1233
        //  1215: aload           9
        //  1217: astore          10
        //  1219: aload           11
        //  1221: aload_1        
        //  1222: invokevirtual   K2/y1.J:(Ljava/lang/String;)LK2/z0;
        //  1225: aload           16
        //  1227: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  1230: ifeq            1295
        //  1233: aload           9
        //  1235: astore          10
        //  1237: aload           9
        //  1239: bipush          28
        //  1241: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1246: astore          11
        //  1248: aload           13
        //  1250: getfield        K2/n0.L:LK2/k0;
        //  1253: astore          10
        //  1255: aload           10
        //  1257: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1260: aload           10
        //  1262: invokevirtual   K2/k0.v:()V
        //  1265: aload           12
        //  1267: aload           12
        //  1269: getfield        K2/G.Q:Z
        //  1272: aload           12
        //  1274: getfield        K2/G.u:Ljava/lang/String;
        //  1277: aload           11
        //  1279: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1282: iconst_1       
        //  1283: ixor           
        //  1284: ior            
        //  1285: putfield        K2/G.Q:Z
        //  1288: aload           12
        //  1290: aload           11
        //  1292: putfield        K2/G.u:Ljava/lang/String;
        //  1295: aload           9
        //  1297: astore          10
        //  1299: invokestatic    com/google/android/gms/internal/measurement/i4.a:()V
        //  1302: aload           9
        //  1304: astore          10
        //  1306: aload           14
        //  1308: getfield        K2/n0.I:LK2/d;
        //  1311: aconst_null    
        //  1312: getstatic       K2/w.w0:LK2/F;
        //  1315: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1318: ifeq            1561
        //  1321: aload           9
        //  1323: astore          10
        //  1325: aload_0        
        //  1326: invokevirtual   C/u.u:()LK2/J1;
        //  1329: pop            
        //  1330: aload           9
        //  1332: astore          10
        //  1334: aload_1        
        //  1335: invokestatic    K2/J1.y0:(Ljava/lang/String;)Z
        //  1338: ifeq            1561
        //  1341: aload           9
        //  1343: astore          10
        //  1345: aload           9
        //  1347: bipush          29
        //  1349: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1354: ifne            1381
        //  1357: aload           9
        //  1359: astore          10
        //  1361: aload           9
        //  1363: bipush          29
        //  1365: invokeinterface android/database/Cursor.getInt:(I)I
        //  1370: istore_2       
        //  1371: iload_2        
        //  1372: ifeq            1381
        //  1375: iconst_1       
        //  1376: istore          5
        //  1378: goto            1384
        //  1381: iconst_0       
        //  1382: istore          5
        //  1384: aload           13
        //  1386: getfield        K2/n0.L:LK2/k0;
        //  1389: astore          10
        //  1391: aload           10
        //  1393: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1396: aload           10
        //  1398: invokevirtual   K2/k0.v:()V
        //  1401: aload           12
        //  1403: getfield        K2/G.Q:Z
        //  1406: istore          6
        //  1408: aload           12
        //  1410: getfield        K2/G.v:Z
        //  1413: iload           5
        //  1415: if_icmpeq       1423
        //  1418: iconst_1       
        //  1419: istore_2       
        //  1420: goto            1425
        //  1423: iconst_0       
        //  1424: istore_2       
        //  1425: aload           12
        //  1427: iload           6
        //  1429: iload_2        
        //  1430: ior            
        //  1431: putfield        K2/G.Q:Z
        //  1434: aload           12
        //  1436: iload           5
        //  1438: putfield        K2/G.v:Z
        //  1441: aload           9
        //  1443: astore          10
        //  1445: aload           12
        //  1447: aload           9
        //  1449: bipush          39
        //  1451: invokeinterface android/database/Cursor.getLong:(I)J
        //  1456: invokevirtual   K2/G.O:(J)V
        //  1459: aload           9
        //  1461: astore          10
        //  1463: aload           14
        //  1465: getfield        K2/n0.I:LK2/d;
        //  1468: aconst_null    
        //  1469: getstatic       K2/w.x0:LK2/F;
        //  1472: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1475: ifeq            1561
        //  1478: aload           9
        //  1480: astore          10
        //  1482: aload           9
        //  1484: bipush          36
        //  1486: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1491: astore          11
        //  1493: aload           13
        //  1495: getfield        K2/n0.L:LK2/k0;
        //  1498: astore          10
        //  1500: aload           10
        //  1502: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1505: aload           10
        //  1507: invokevirtual   K2/k0.v:()V
        //  1510: aload           12
        //  1512: getfield        K2/G.Q:Z
        //  1515: istore          5
        //  1517: aload           12
        //  1519: getfield        K2/G.D:Ljava/lang/String;
        //  1522: aload           11
        //  1524: if_acmpeq       1532
        //  1527: iconst_1       
        //  1528: istore_2       
        //  1529: goto            1534
        //  1532: iconst_0       
        //  1533: istore_2       
        //  1534: aload           12
        //  1536: iload           5
        //  1538: iload_2        
        //  1539: ior            
        //  1540: putfield        K2/G.Q:Z
        //  1543: aload           12
        //  1545: aload           11
        //  1547: putfield        K2/G.D:Ljava/lang/String;
        //  1550: goto            1561
        //  1553: astore_1       
        //  1554: goto            463
        //  1557: astore_1       
        //  1558: goto            463
        //  1561: aload           9
        //  1563: astore          10
        //  1565: aload           12
        //  1567: aload           9
        //  1569: bipush          30
        //  1571: invokeinterface android/database/Cursor.getLong:(I)J
        //  1576: invokevirtual   K2/G.T:(J)V
        //  1579: aload           9
        //  1581: astore          10
        //  1583: aload           12
        //  1585: aload           9
        //  1587: bipush          31
        //  1589: invokeinterface android/database/Cursor.getLong:(I)J
        //  1594: invokevirtual   K2/G.S:(J)V
        //  1597: aload           9
        //  1599: astore          10
        //  1601: invokestatic    com/google/android/gms/internal/measurement/b4.a:()V
        //  1604: aload           9
        //  1606: astore          10
        //  1608: aload           14
        //  1610: getfield        K2/n0.I:LK2/d;
        //  1613: aload_1        
        //  1614: getstatic       K2/w.G0:LK2/F;
        //  1617: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1620: ifeq            1720
        //  1623: aload           9
        //  1625: astore          10
        //  1627: aload           9
        //  1629: bipush          32
        //  1631: invokeinterface android/database/Cursor.getInt:(I)I
        //  1636: istore          4
        //  1638: aload           13
        //  1640: getfield        K2/n0.L:LK2/k0;
        //  1643: astore          10
        //  1645: aload           10
        //  1647: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1650: aload           10
        //  1652: invokevirtual   K2/k0.v:()V
        //  1655: aload           12
        //  1657: getfield        K2/G.Q:Z
        //  1660: istore          5
        //  1662: aload           12
        //  1664: getfield        K2/G.y:I
        //  1667: iload           4
        //  1669: if_icmpeq       1677
        //  1672: iconst_1       
        //  1673: istore_2       
        //  1674: goto            1679
        //  1677: iconst_0       
        //  1678: istore_2       
        //  1679: aload           12
        //  1681: iload           5
        //  1683: iload_2        
        //  1684: ior            
        //  1685: putfield        K2/G.Q:Z
        //  1688: aload           12
        //  1690: iload           4
        //  1692: putfield        K2/G.y:I
        //  1695: aload           9
        //  1697: astore          10
        //  1699: aload           12
        //  1701: aload           9
        //  1703: bipush          35
        //  1705: invokeinterface android/database/Cursor.getLong:(I)J
        //  1710: invokevirtual   K2/G.u:(J)V
        //  1713: goto            1720
        //  1716: astore_1       
        //  1717: goto            463
        //  1720: aload           9
        //  1722: astore          10
        //  1724: aload           9
        //  1726: bipush          33
        //  1728: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1733: ifne            1760
        //  1736: aload           9
        //  1738: astore          10
        //  1740: aload           9
        //  1742: bipush          33
        //  1744: invokeinterface android/database/Cursor.getInt:(I)I
        //  1749: istore_2       
        //  1750: iload_2        
        //  1751: ifeq            1760
        //  1754: iconst_1       
        //  1755: istore          5
        //  1757: goto            1763
        //  1760: iconst_0       
        //  1761: istore          5
        //  1763: aload           13
        //  1765: getfield        K2/n0.L:LK2/k0;
        //  1768: astore          10
        //  1770: aload           10
        //  1772: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1775: aload           10
        //  1777: invokevirtual   K2/k0.v:()V
        //  1780: aload           12
        //  1782: getfield        K2/G.Q:Z
        //  1785: istore          6
        //  1787: aload           12
        //  1789: getfield        K2/G.z:Z
        //  1792: iload           5
        //  1794: if_icmpeq       1802
        //  1797: iconst_1       
        //  1798: istore_2       
        //  1799: goto            1804
        //  1802: iconst_0       
        //  1803: istore_2       
        //  1804: aload           12
        //  1806: iload           6
        //  1808: iload_2        
        //  1809: ior            
        //  1810: putfield        K2/G.Q:Z
        //  1813: aload           12
        //  1815: iload           5
        //  1817: putfield        K2/G.z:Z
        //  1820: aload           9
        //  1822: astore          10
        //  1824: aload           9
        //  1826: bipush          34
        //  1828: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1833: ifeq            1842
        //  1836: aconst_null    
        //  1837: astore          10
        //  1839: goto            1882
        //  1842: aload           9
        //  1844: astore          10
        //  1846: aload           9
        //  1848: bipush          34
        //  1850: invokeinterface android/database/Cursor.getInt:(I)I
        //  1855: ifeq            1864
        //  1858: iconst_1       
        //  1859: istore          5
        //  1861: goto            1867
        //  1864: iconst_0       
        //  1865: istore          5
        //  1867: aload           9
        //  1869: astore          10
        //  1871: iload           5
        //  1873: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1876: astore          11
        //  1878: aload           11
        //  1880: astore          10
        //  1882: aload           13
        //  1884: getfield        K2/n0.L:LK2/k0;
        //  1887: astore          11
        //  1889: aload           11
        //  1891: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1894: aload           11
        //  1896: invokevirtual   K2/k0.v:()V
        //  1899: aload           12
        //  1901: aload           12
        //  1903: getfield        K2/G.Q:Z
        //  1906: aload           12
        //  1908: getfield        K2/G.r:Ljava/lang/Boolean;
        //  1911: aload           10
        //  1913: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1916: iconst_1       
        //  1917: ixor           
        //  1918: ior            
        //  1919: putfield        K2/G.Q:Z
        //  1922: aload           12
        //  1924: aload           10
        //  1926: putfield        K2/G.r:Ljava/lang/Boolean;
        //  1929: aload           9
        //  1931: astore          10
        //  1933: aload           12
        //  1935: aload           9
        //  1937: bipush          37
        //  1939: invokeinterface android/database/Cursor.getInt:(I)I
        //  1944: invokevirtual   K2/G.t:(I)V
        //  1947: aload           9
        //  1949: astore          10
        //  1951: aload           12
        //  1953: aload           9
        //  1955: bipush          38
        //  1957: invokeinterface android/database/Cursor.getInt:(I)I
        //  1962: invokevirtual   K2/G.p:(I)V
        //  1965: aload           9
        //  1967: astore          10
        //  1969: aload           9
        //  1971: bipush          40
        //  1973: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1978: ifeq            1989
        //  1981: ldc_w           ""
        //  1984: astore          10
        //  1986: goto            2017
        //  1989: aload           9
        //  1991: astore          10
        //  1993: aload           9
        //  1995: bipush          40
        //  1997: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  2002: astore          11
        //  2004: aload           9
        //  2006: astore          10
        //  2008: aload           11
        //  2010: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //  2013: aload           11
        //  2015: astore          10
        //  2017: aload           13
        //  2019: getfield        K2/n0.L:LK2/k0;
        //  2022: astore          11
        //  2024: aload           11
        //  2026: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2029: aload           11
        //  2031: invokevirtual   K2/k0.v:()V
        //  2034: aload           12
        //  2036: getfield        K2/G.Q:Z
        //  2039: istore          5
        //  2041: aload           12
        //  2043: getfield        K2/G.H:Ljava/lang/String;
        //  2046: aload           10
        //  2048: if_acmpeq       2056
        //  2051: iconst_1       
        //  2052: istore_2       
        //  2053: goto            2058
        //  2056: iconst_0       
        //  2057: istore_2       
        //  2058: aload           12
        //  2060: iload           5
        //  2062: iload_2        
        //  2063: ior            
        //  2064: putfield        K2/G.Q:Z
        //  2067: aload           12
        //  2069: aload           10
        //  2071: putfield        K2/G.H:Ljava/lang/String;
        //  2074: aload           9
        //  2076: astore          10
        //  2078: aload           14
        //  2080: getfield        K2/n0.I:LK2/d;
        //  2083: aconst_null    
        //  2084: getstatic       K2/w.V0:LK2/F;
        //  2087: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  2090: ifeq            2269
        //  2093: aload           9
        //  2095: astore          10
        //  2097: aload           9
        //  2099: bipush          41
        //  2101: invokeinterface android/database/Cursor.isNull:(I)Z
        //  2106: ifne            2181
        //  2109: aload           9
        //  2111: astore          10
        //  2113: aload           9
        //  2115: bipush          41
        //  2117: invokeinterface android/database/Cursor.getLong:(I)J
        //  2122: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2125: astore          11
        //  2127: aload           13
        //  2129: getfield        K2/n0.L:LK2/k0;
        //  2132: astore          10
        //  2134: aload           10
        //  2136: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2139: aload           10
        //  2141: invokevirtual   K2/k0.v:()V
        //  2144: aload           12
        //  2146: aload           12
        //  2148: getfield        K2/G.Q:Z
        //  2151: aload           12
        //  2153: getfield        K2/G.A:Ljava/lang/Long;
        //  2156: aload           11
        //  2158: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2161: iconst_1       
        //  2162: ixor           
        //  2163: ior            
        //  2164: putfield        K2/G.Q:Z
        //  2167: aload           12
        //  2169: aload           11
        //  2171: putfield        K2/G.A:Ljava/lang/Long;
        //  2174: goto            2181
        //  2177: astore_1       
        //  2178: goto            463
        //  2181: aload           9
        //  2183: astore          10
        //  2185: aload           9
        //  2187: bipush          42
        //  2189: invokeinterface android/database/Cursor.isNull:(I)Z
        //  2194: ifne            2269
        //  2197: aload           9
        //  2199: astore          10
        //  2201: aload           9
        //  2203: bipush          42
        //  2205: invokeinterface android/database/Cursor.getLong:(I)J
        //  2210: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2213: astore          11
        //  2215: aload           13
        //  2217: getfield        K2/n0.L:LK2/k0;
        //  2220: astore          10
        //  2222: aload           10
        //  2224: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2227: aload           10
        //  2229: invokevirtual   K2/k0.v:()V
        //  2232: aload           12
        //  2234: aload           12
        //  2236: getfield        K2/G.Q:Z
        //  2239: aload           12
        //  2241: getfield        K2/G.B:Ljava/lang/Long;
        //  2244: aload           11
        //  2246: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2249: iconst_1       
        //  2250: ixor           
        //  2251: ior            
        //  2252: putfield        K2/G.Q:Z
        //  2255: aload           12
        //  2257: aload           11
        //  2259: putfield        K2/G.B:Ljava/lang/Long;
        //  2262: goto            2269
        //  2265: astore_1       
        //  2266: goto            463
        //  2269: aload           9
        //  2271: astore          10
        //  2273: invokestatic    com/google/android/gms/internal/measurement/J3.a:()V
        //  2276: aload           9
        //  2278: astore          10
        //  2280: aload           14
        //  2282: getfield        K2/n0.I:LK2/d;
        //  2285: aload_1        
        //  2286: getstatic       K2/w.T0:LK2/F;
        //  2289: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  2292: ifeq            2374
        //  2295: aload           9
        //  2297: astore          10
        //  2299: aload           9
        //  2301: bipush          43
        //  2303: invokeinterface android/database/Cursor.getBlob:(I)[B
        //  2308: astore          11
        //  2310: aload           13
        //  2312: getfield        K2/n0.L:LK2/k0;
        //  2315: astore          10
        //  2317: aload           10
        //  2319: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2322: aload           10
        //  2324: invokevirtual   K2/k0.v:()V
        //  2327: aload           12
        //  2329: getfield        K2/G.Q:Z
        //  2332: istore          5
        //  2334: aload           12
        //  2336: getfield        K2/G.I:[B
        //  2339: aload           11
        //  2341: if_acmpeq       2349
        //  2344: iload_3        
        //  2345: istore_2       
        //  2346: goto            2351
        //  2349: iconst_0       
        //  2350: istore_2       
        //  2351: aload           12
        //  2353: iload           5
        //  2355: iload_2        
        //  2356: ior            
        //  2357: putfield        K2/G.Q:Z
        //  2360: aload           12
        //  2362: aload           11
        //  2364: putfield        K2/G.I:[B
        //  2367: goto            2374
        //  2370: astore_1       
        //  2371: goto            463
        //  2374: aload           13
        //  2376: getfield        K2/n0.L:LK2/k0;
        //  2379: astore          10
        //  2381: aload           10
        //  2383: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2386: aload           10
        //  2388: invokevirtual   K2/k0.v:()V
        //  2391: aload           12
        //  2393: iconst_0       
        //  2394: putfield        K2/G.Q:Z
        //  2397: aload           9
        //  2399: astore          10
        //  2401: aload           9
        //  2403: invokeinterface android/database/Cursor.moveToNext:()Z
        //  2408: ifeq            2432
        //  2411: aload           9
        //  2413: astore          10
        //  2415: aload_0        
        //  2416: invokevirtual   C/u.j:()LK2/P;
        //  2419: getfield        K2/P.H:LK2/S;
        //  2422: ldc_w           "Got multiple records for app, expected one. appId"
        //  2425: aload_1        
        //  2426: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  2429: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2432: aload           9
        //  2434: invokeinterface android/database/Cursor.close:()V
        //  2439: aload           12
        //  2441: areturn        
        //  2442: astore_1       
        //  2443: goto            463
        //  2446: astore_1       
        //  2447: goto            463
        //  2450: astore_1       
        //  2451: goto            463
        //  2454: astore_1       
        //  2455: goto            463
        //  2458: astore_1       
        //  2459: goto            463
        //  2462: astore_1       
        //  2463: goto            463
        //  2466: astore_1       
        //  2467: goto            463
        //  2470: astore_1       
        //  2471: aload           10
        //  2473: astore          9
        //  2475: goto            2520
        //  2478: astore          11
        //  2480: aconst_null    
        //  2481: astore          9
        //  2483: aload           9
        //  2485: astore          10
        //  2487: aload_0        
        //  2488: invokevirtual   C/u.j:()LK2/P;
        //  2491: getfield        K2/P.H:LK2/S;
        //  2494: aload_1        
        //  2495: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  2498: aload           11
        //  2500: ldc_w           "Error querying app. appId"
        //  2503: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  2506: aload           9
        //  2508: ifnull          2518
        //  2511: aload           9
        //  2513: invokeinterface android/database/Cursor.close:()V
        //  2518: aconst_null    
        //  2519: areturn        
        //  2520: aload           9
        //  2522: ifnull          2532
        //  2525: aload           9
        //  2527: invokeinterface android/database/Cursor.close:()V
        //  2532: aload_1        
        //  2533: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  30     324    2478   2483   Landroid/database/sqlite/SQLiteException;
        //  30     324    2470   2478   Any
        //  328    337    466    471    Landroid/database/sqlite/SQLiteException;
        //  328    337    458    463    Any
        //  355    360    466    471    Landroid/database/sqlite/SQLiteException;
        //  355    360    458    463    Any
        //  364    371    466    471    Landroid/database/sqlite/SQLiteException;
        //  364    371    458    463    Any
        //  371    386    466    471    Landroid/database/sqlite/SQLiteException;
        //  371    386    2466   2470   Any
        //  390    393    466    471    Landroid/database/sqlite/SQLiteException;
        //  390    393    458    463    Any
        //  397    404    466    471    Landroid/database/sqlite/SQLiteException;
        //  397    404    458    463    Any
        //  408    413    466    471    Landroid/database/sqlite/SQLiteException;
        //  408    413    458    463    Any
        //  417    427    466    471    Landroid/database/sqlite/SQLiteException;
        //  417    427    458    463    Any
        //  441    455    466    471    Landroid/database/sqlite/SQLiteException;
        //  441    455    458    463    Any
        //  475    488    466    471    Landroid/database/sqlite/SQLiteException;
        //  475    488    458    463    Any
        //  494    507    466    471    Landroid/database/sqlite/SQLiteException;
        //  494    507    458    463    Any
        //  511    514    466    471    Landroid/database/sqlite/SQLiteException;
        //  511    514    458    463    Any
        //  518    532    466    471    Landroid/database/sqlite/SQLiteException;
        //  518    532    458    463    Any
        //  536    551    466    471    Landroid/database/sqlite/SQLiteException;
        //  536    551    458    463    Any
        //  555    568    466    471    Landroid/database/sqlite/SQLiteException;
        //  555    568    458    463    Any
        //  572    585    466    471    Landroid/database/sqlite/SQLiteException;
        //  572    585    458    463    Any
        //  589    602    466    471    Landroid/database/sqlite/SQLiteException;
        //  589    602    458    463    Any
        //  606    619    466    471    Landroid/database/sqlite/SQLiteException;
        //  606    619    458    463    Any
        //  623    637    466    471    Landroid/database/sqlite/SQLiteException;
        //  623    637    458    463    Any
        //  641    655    466    471    Landroid/database/sqlite/SQLiteException;
        //  641    655    458    463    Any
        //  659    673    466    471    Landroid/database/sqlite/SQLiteException;
        //  659    673    458    463    Any
        //  677    691    466    471    Landroid/database/sqlite/SQLiteException;
        //  677    691    458    463    Any
        //  695    707    466    471    Landroid/database/sqlite/SQLiteException;
        //  695    707    458    463    Any
        //  711    723    466    471    Landroid/database/sqlite/SQLiteException;
        //  711    723    458    463    Any
        //  739    746    466    471    Landroid/database/sqlite/SQLiteException;
        //  739    746    458    463    Any
        //  750    764    466    471    Landroid/database/sqlite/SQLiteException;
        //  750    764    458    463    Any
        //  768    782    466    471    Landroid/database/sqlite/SQLiteException;
        //  768    782    458    463    Any
        //  786    800    466    471    Landroid/database/sqlite/SQLiteException;
        //  786    800    458    463    Any
        //  804    818    466    471    Landroid/database/sqlite/SQLiteException;
        //  804    818    458    463    Any
        //  822    836    466    471    Landroid/database/sqlite/SQLiteException;
        //  822    836    458    463    Any
        //  840    854    466    471    Landroid/database/sqlite/SQLiteException;
        //  840    854    458    463    Any
        //  858    870    466    471    Landroid/database/sqlite/SQLiteException;
        //  858    870    458    463    Any
        //  882    894    466    471    Landroid/database/sqlite/SQLiteException;
        //  882    894    458    463    Any
        //  898    905    466    471    Landroid/database/sqlite/SQLiteException;
        //  898    905    458    463    Any
        //  909    923    466    471    Landroid/database/sqlite/SQLiteException;
        //  909    923    458    463    Any
        //  927    941    466    471    Landroid/database/sqlite/SQLiteException;
        //  927    941    458    463    Any
        //  945    959    466    471    Landroid/database/sqlite/SQLiteException;
        //  945    959    458    463    Any
        //  963    977    466    471    Landroid/database/sqlite/SQLiteException;
        //  963    977    458    463    Any
        //  981    993    466    471    Landroid/database/sqlite/SQLiteException;
        //  981    993    458    463    Any
        //  997    1007   466    471    Landroid/database/sqlite/SQLiteException;
        //  997    1007   458    463    Any
        //  1023   1057   466    471    Landroid/database/sqlite/SQLiteException;
        //  1023   1057   2462   2466   Any
        //  1064   1080   466    471    Landroid/database/sqlite/SQLiteException;
        //  1064   1080   2462   2466   Any
        //  1084   1098   466    471    Landroid/database/sqlite/SQLiteException;
        //  1084   1098   458    463    Any
        //  1102   1114   466    471    Landroid/database/sqlite/SQLiteException;
        //  1102   1114   458    463    Any
        //  1124   1135   466    471    Landroid/database/sqlite/SQLiteException;
        //  1124   1135   458    463    Any
        //  1139   1146   466    471    Landroid/database/sqlite/SQLiteException;
        //  1139   1146   458    463    Any
        //  1150   1162   466    471    Landroid/database/sqlite/SQLiteException;
        //  1150   1162   458    463    Any
        //  1166   1190   466    471    Landroid/database/sqlite/SQLiteException;
        //  1166   1190   458    463    Any
        //  1194   1197   466    471    Landroid/database/sqlite/SQLiteException;
        //  1194   1197   458    463    Any
        //  1201   1215   466    471    Landroid/database/sqlite/SQLiteException;
        //  1201   1215   458    463    Any
        //  1219   1233   466    471    Landroid/database/sqlite/SQLiteException;
        //  1219   1233   458    463    Any
        //  1237   1248   466    471    Landroid/database/sqlite/SQLiteException;
        //  1237   1248   458    463    Any
        //  1248   1295   466    471    Landroid/database/sqlite/SQLiteException;
        //  1248   1295   2458   2462   Any
        //  1299   1302   466    471    Landroid/database/sqlite/SQLiteException;
        //  1299   1302   458    463    Any
        //  1306   1321   466    471    Landroid/database/sqlite/SQLiteException;
        //  1306   1321   458    463    Any
        //  1325   1330   466    471    Landroid/database/sqlite/SQLiteException;
        //  1325   1330   458    463    Any
        //  1334   1341   466    471    Landroid/database/sqlite/SQLiteException;
        //  1334   1341   458    463    Any
        //  1345   1357   466    471    Landroid/database/sqlite/SQLiteException;
        //  1345   1357   458    463    Any
        //  1361   1371   466    471    Landroid/database/sqlite/SQLiteException;
        //  1361   1371   458    463    Any
        //  1384   1418   466    471    Landroid/database/sqlite/SQLiteException;
        //  1384   1418   1557   1561   Any
        //  1425   1441   466    471    Landroid/database/sqlite/SQLiteException;
        //  1425   1441   1557   1561   Any
        //  1445   1459   466    471    Landroid/database/sqlite/SQLiteException;
        //  1445   1459   458    463    Any
        //  1463   1478   466    471    Landroid/database/sqlite/SQLiteException;
        //  1463   1478   458    463    Any
        //  1482   1493   466    471    Landroid/database/sqlite/SQLiteException;
        //  1482   1493   458    463    Any
        //  1493   1527   466    471    Landroid/database/sqlite/SQLiteException;
        //  1493   1527   1553   1557   Any
        //  1534   1550   466    471    Landroid/database/sqlite/SQLiteException;
        //  1534   1550   1553   1557   Any
        //  1565   1579   466    471    Landroid/database/sqlite/SQLiteException;
        //  1565   1579   458    463    Any
        //  1583   1597   466    471    Landroid/database/sqlite/SQLiteException;
        //  1583   1597   458    463    Any
        //  1601   1604   466    471    Landroid/database/sqlite/SQLiteException;
        //  1601   1604   458    463    Any
        //  1608   1623   466    471    Landroid/database/sqlite/SQLiteException;
        //  1608   1623   458    463    Any
        //  1627   1638   466    471    Landroid/database/sqlite/SQLiteException;
        //  1627   1638   458    463    Any
        //  1638   1672   466    471    Landroid/database/sqlite/SQLiteException;
        //  1638   1672   1716   1720   Any
        //  1679   1695   466    471    Landroid/database/sqlite/SQLiteException;
        //  1679   1695   1716   1720   Any
        //  1699   1713   466    471    Landroid/database/sqlite/SQLiteException;
        //  1699   1713   458    463    Any
        //  1724   1736   466    471    Landroid/database/sqlite/SQLiteException;
        //  1724   1736   458    463    Any
        //  1740   1750   466    471    Landroid/database/sqlite/SQLiteException;
        //  1740   1750   458    463    Any
        //  1763   1797   466    471    Landroid/database/sqlite/SQLiteException;
        //  1763   1797   2454   2458   Any
        //  1804   1820   466    471    Landroid/database/sqlite/SQLiteException;
        //  1804   1820   2454   2458   Any
        //  1824   1836   466    471    Landroid/database/sqlite/SQLiteException;
        //  1824   1836   458    463    Any
        //  1846   1858   466    471    Landroid/database/sqlite/SQLiteException;
        //  1846   1858   458    463    Any
        //  1871   1878   466    471    Landroid/database/sqlite/SQLiteException;
        //  1871   1878   458    463    Any
        //  1882   1929   466    471    Landroid/database/sqlite/SQLiteException;
        //  1882   1929   2450   2454   Any
        //  1933   1947   466    471    Landroid/database/sqlite/SQLiteException;
        //  1933   1947   458    463    Any
        //  1951   1965   466    471    Landroid/database/sqlite/SQLiteException;
        //  1951   1965   458    463    Any
        //  1969   1981   466    471    Landroid/database/sqlite/SQLiteException;
        //  1969   1981   458    463    Any
        //  1993   2004   466    471    Landroid/database/sqlite/SQLiteException;
        //  1993   2004   458    463    Any
        //  2008   2013   466    471    Landroid/database/sqlite/SQLiteException;
        //  2008   2013   458    463    Any
        //  2017   2051   466    471    Landroid/database/sqlite/SQLiteException;
        //  2017   2051   2446   2450   Any
        //  2058   2074   466    471    Landroid/database/sqlite/SQLiteException;
        //  2058   2074   2446   2450   Any
        //  2078   2093   466    471    Landroid/database/sqlite/SQLiteException;
        //  2078   2093   458    463    Any
        //  2097   2109   466    471    Landroid/database/sqlite/SQLiteException;
        //  2097   2109   458    463    Any
        //  2113   2127   466    471    Landroid/database/sqlite/SQLiteException;
        //  2113   2127   458    463    Any
        //  2127   2174   466    471    Landroid/database/sqlite/SQLiteException;
        //  2127   2174   2177   2181   Any
        //  2185   2197   466    471    Landroid/database/sqlite/SQLiteException;
        //  2185   2197   458    463    Any
        //  2201   2215   466    471    Landroid/database/sqlite/SQLiteException;
        //  2201   2215   458    463    Any
        //  2215   2262   466    471    Landroid/database/sqlite/SQLiteException;
        //  2215   2262   2265   2269   Any
        //  2273   2276   466    471    Landroid/database/sqlite/SQLiteException;
        //  2273   2276   458    463    Any
        //  2280   2295   466    471    Landroid/database/sqlite/SQLiteException;
        //  2280   2295   458    463    Any
        //  2299   2310   466    471    Landroid/database/sqlite/SQLiteException;
        //  2299   2310   458    463    Any
        //  2310   2344   466    471    Landroid/database/sqlite/SQLiteException;
        //  2310   2344   2370   2374   Any
        //  2351   2367   466    471    Landroid/database/sqlite/SQLiteException;
        //  2351   2367   2370   2374   Any
        //  2374   2397   466    471    Landroid/database/sqlite/SQLiteException;
        //  2374   2397   2442   2446   Any
        //  2401   2411   466    471    Landroid/database/sqlite/SQLiteException;
        //  2401   2411   458    463    Any
        //  2415   2432   466    471    Landroid/database/sqlite/SQLiteException;
        //  2415   2432   458    463    Any
        //  2487   2506   458    463    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0463:
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
    
    public final H1 v0(final String s, String s2) {
        A.e(s);
        A.e(s2);
        this.v();
        this.z();
        Object query = null;
        Label_0299: {
            Cursor cursor = null;
            Object k = null;
            Label_0248: {
                try {
                    cursor = (Cursor)(query = this.D().query("user_attributes", new String[] { "set_timestamp", "value", "origin" }, "app_id=? and name=?", new String[] { s, s2 }, (String)null, (String)null, (String)null));
                    H1 h1;
                    try {
                        try {
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return null;
                            }
                            query = cursor;
                            final long long1 = cursor.getLong(0);
                            query = cursor;
                            k = this.K(cursor, 1);
                            if (k == null) {
                                cursor.close();
                                return null;
                            }
                            query = cursor;
                            final String string = cursor.getString(2);
                            query = cursor;
                            query = cursor;
                            h1 = new H1(s, string, s2, long1, k);
                            query = cursor;
                            if (cursor.moveToNext()) {
                                query = cursor;
                                this.j().H.g("Got multiple records for user property, expected one. appId", K2.P.z(s));
                            }
                        }
                        finally {
                            s2 = (String)query;
                        }
                    }
                    catch (final SQLiteException k) {
                        break Label_0248;
                    }
                    cursor.close();
                    return h1;
                }
                catch (final SQLiteException k) {
                    cursor = null;
                }
                finally {
                    s2 = (String)query;
                    break Label_0299;
                }
            }
            this.j().H.h("Error querying user property. appId", K2.P.z(s), ((n0)super.C).O.g(s2), k);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        if (s2 != null) {
            ((Cursor)s2).close();
        }
    }
    
    public final z0 w0(final String s) {
        A.h((Object)s);
        this.v();
        this.z();
        return z0.c(100, this.M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[] { s }));
    }
    
    public final void x0(final String s, String g) {
        A.e(s);
        A.e(g);
        this.v();
        this.z();
        try {
            this.D().delete("user_attributes", "app_id=? and name=?", new String[] { s, g });
        }
        catch (final SQLiteException ex) {
            final P j = this.j();
            final Q z = K2.P.z(s);
            g = ((n0)super.C).O.g(g);
            j.H.h("Error deleting user property. appId", z, g, ex);
        }
    }
    
    public final z0 y0(String rawQuery) {
        A.h((Object)rawQuery);
        this.v();
        this.z();
        Object o = null;
        final z0 z0 = null;
        Object o2 = null;
        Label_0172: {
            Label_0130: {
                try {
                    final String s = rawQuery = (String)this.D().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[] { rawQuery });
                    String s2 = null;
                    Label_0086: {
                        try {
                            try {
                                if (((Cursor)s).moveToFirst()) {
                                    break Label_0086;
                                }
                                rawQuery = s;
                                this.j().P.f("No data found");
                                ((Cursor)s).close();
                            }
                            finally {
                                s2 = rawQuery;
                            }
                        }
                        catch (final SQLiteException o) {
                            break Label_0130;
                        }
                    }
                    o = ((Cursor)s2).getString(0);
                    o = K2.z0.c(((Cursor)s2).getInt(1), (String)o);
                    ((Cursor)s2).close();
                }
                catch (final SQLiteException o) {
                    o2 = null;
                }
                finally {
                    o2 = o;
                    break Label_0172;
                }
            }
            this.j().H.g("Error querying database.", o);
            z0 z2 = z0;
            if (o2 != null) {
                ((Cursor)o2).close();
                z2 = z0;
            }
            if (z2 == null) {
                return K2.z0.c;
            }
            return z2;
        }
        if (o2 != null) {
            ((Cursor)o2).close();
        }
    }
    
    public final void z0(final String s, final String s2) {
        A.e(s2);
        this.v();
        this.z();
        try {
            this.D().delete(s, "app_id=?", new String[] { s2 });
        }
        catch (final SQLiteException ex) {
            this.j().H.e(K2.P.z(s2), ex, "Error deleting snapshot. appId");
        }
    }
}
