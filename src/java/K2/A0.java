package K2;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.SparseArray;
import android.content.SharedPreferences$Editor;
import L3.A;
import android.content.SharedPreferences;
import android.util.Pair;

public final class a0 extends x0
{
    public static final Pair c0;
    public SharedPreferences E;
    public final Object F;
    public SharedPreferences G;
    public d0 H;
    public final b0 I;
    public final c0 J;
    public String K;
    public boolean L;
    public long M;
    public final b0 N;
    public final Y O;
    public final c0 P;
    public final A Q;
    public final Y R;
    public final b0 S;
    public final b0 T;
    public boolean U;
    public final Y V;
    public final Y W;
    public final b0 X;
    public final c0 Y;
    public final c0 Z;
    public final b0 a0;
    public final A b0;
    
    static {
        c0 = new Pair((Object)"", (Object)0L);
    }
    
    public a0(final n0 n0) {
        super(n0);
        this.F = new Object();
        this.N = new b0(this, "session_timeout", 1800000L);
        this.O = new Y(this, "start_new_session", true);
        this.S = new b0(this, "last_pause_time", 0L);
        this.T = new b0(this, "session_id", 0L);
        this.P = new c0(this, "non_personalized_ads");
        this.Q = new A(this, "last_received_uri_timestamps_by_source");
        this.R = new Y(this, "allow_remote_dynamite", false);
        this.I = new b0(this, "first_open_time", 0L);
        h2.A.e("app_install_time");
        this.J = new c0(this, "app_instance_id");
        this.V = new Y(this, "app_backgrounded", false);
        this.W = new Y(this, "deep_link_retrieval_complete", false);
        this.X = new b0(this, "deep_link_retrieval_attempts", 0L);
        this.Y = new c0(this, "firebase_feature_rollouts");
        this.Z = new c0(this, "deferred_attribution_cache");
        this.a0 = new b0(this, "deferred_attribution_cache_timestamp", 0L);
        this.b0 = new A(this, "default_event_parameters");
    }
    
    public final boolean A(final long n) {
        return n - this.N.a() > this.S.a();
    }
    
    public final void B(final boolean b) {
        this.v();
        this.j().P.g("App measurement setting deferred collection", b);
        final SharedPreferences$Editor edit = this.D().edit();
        edit.putBoolean("deferred_analytics_collection", b);
        edit.apply();
    }
    
    public final SharedPreferences C() {
        this.v();
        this.w();
        if (this.G == null) {
            final Object f;
            monitorenter(f = this.F);
            Label_0111: {
                try {
                    if (this.G == null) {
                        final String packageName = ((n0)super.C).C.getPackageName();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(packageName);
                        sb.append("_preferences");
                        final String string = sb.toString();
                        this.j().P.g("Default prefs file", string);
                        this.G = ((n0)super.C).C.getSharedPreferences(string, 0);
                    }
                    break Label_0111;
                }
                finally {
                    monitorexit(f);
                    monitorexit(f);
                }
            }
        }
        return this.G;
    }
    
    public final SharedPreferences D() {
        this.v();
        this.w();
        h2.A.h((Object)this.E);
        return this.E;
    }
    
    public final SparseArray E() {
        final Bundle j = this.Q.j();
        final int[] intArray = ((BaseBundle)j).getIntArray("uriSources");
        final long[] longArray = ((BaseBundle)j).getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.j().H.f("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        final SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; ++i) {
            sparseArray.put(intArray[i], (Object)longArray[i]);
        }
        return sparseArray;
    }
    
    public final z0 F() {
        this.v();
        return z0.c(this.D().getInt("consent_source", 100), this.D().getString("consent_settings", "G1"));
    }
    
    @Override
    public final boolean y() {
        return true;
    }
    
    public final void z(final SparseArray sparseArray) {
        final int[] array = new int[sparseArray.size()];
        final long[] array2 = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); ++i) {
            array[i] = sparseArray.keyAt(i);
            array2[i] = (long)sparseArray.valueAt(i);
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putIntArray("uriSources", array);
        ((BaseBundle)bundle).putLongArray("uriTimestamps", array2);
        this.Q.n(bundle);
    }
}
