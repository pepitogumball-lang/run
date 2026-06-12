package c2;

import android.accounts.Account;
import java.util.Iterator;
import java.util.ArrayList;
import android.net.Uri;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import K2.J0;
import com.google.android.gms.common.api.Scope;
import org.json.JSONArray;
import org.json.JSONObject;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.json.JSONException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import h2.A;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

public final class b
{
    public static final ReentrantLock c;
    public static b d;
    public final ReentrantLock a;
    public final SharedPreferences b;
    
    static {
        c = new ReentrantLock();
    }
    
    public b(final Context context) {
        this.a = new ReentrantLock();
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
    
    public static b a(final Context context) {
        A.h((Object)context);
        final ReentrantLock c = b.c;
        c.lock();
        Label_0051: {
            try {
                if (b.d == null) {
                    b.d = new b(context.getApplicationContext());
                }
            }
            finally {
                break Label_0051;
            }
            final b d = b.d;
            c.unlock();
            return d;
        }
        c.unlock();
    }
    
    public static final String g(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(s.length() + 1 + String.valueOf((Object)s2).length());
        sb.append(s);
        sb.append(":");
        sb.append(s2);
        return sb.toString();
    }
    
    public final GoogleSignInAccount b() {
        final String f = this.f("defaultGoogleSignInAccount");
        final boolean empty = TextUtils.isEmpty((CharSequence)f);
        final GoogleSignInAccount googleSignInAccount = null;
        if (empty) {
            return googleSignInAccount;
        }
        final String f2 = this.f(g("googleSignInAccount", f));
        GoogleSignInAccount h = googleSignInAccount;
        if (f2 == null) {
            return h;
        }
        try {
            h = GoogleSignInAccount.h(f2);
            return h;
        }
        catch (final JSONException ex) {
            h = googleSignInAccount;
            return h;
        }
    }
    
    public final GoogleSignInOptions c() {
        final String f = this.f("defaultGoogleSignInAccount");
        final boolean empty = TextUtils.isEmpty((CharSequence)f);
        final GoogleSignInOptions googleSignInOptions = null;
        if (empty) {
            return googleSignInOptions;
        }
        final String f2 = this.f(g("googleSignInOptions", f));
        GoogleSignInOptions h = googleSignInOptions;
        if (f2 == null) {
            return h;
        }
        try {
            h = GoogleSignInOptions.h(f2);
            return h;
        }
        catch (final JSONException ex) {
            h = googleSignInOptions;
            return h;
        }
    }
    
    public final void d(final GoogleSignInAccount googleSignInAccount, final GoogleSignInOptions googleSignInOptions) {
        A.h((Object)googleSignInAccount);
        A.h((Object)googleSignInOptions);
        final String j = googleSignInAccount.J;
        this.e("defaultGoogleSignInAccount", j);
        final String g = g("googleSignInAccount", j);
        final JSONObject jsonObject = new JSONObject();
        try {
            final String c = googleSignInAccount.C;
            if (c != null) {
                jsonObject.put("id", (Object)c);
            }
        }
        catch (final JSONException ex) {
            throw new RuntimeException((Throwable)ex);
        }
        final String d = googleSignInAccount.D;
        if (d != null) {
            jsonObject.put("tokenId", (Object)d);
        }
        final String e = googleSignInAccount.E;
        if (e != null) {
            jsonObject.put("email", (Object)e);
        }
        final String f = googleSignInAccount.F;
        if (f != null) {
            jsonObject.put("displayName", (Object)f);
        }
        final String l = googleSignInAccount.L;
        if (l != null) {
            jsonObject.put("givenName", (Object)l);
        }
        final String m = googleSignInAccount.M;
        if (m != null) {
            jsonObject.put("familyName", (Object)m);
        }
        final Uri g2 = googleSignInAccount.G;
        if (g2 != null) {
            jsonObject.put("photoUrl", (Object)g2.toString());
        }
        final String h = googleSignInAccount.H;
        if (h != null) {
            jsonObject.put("serverAuthCode", (Object)h);
        }
        jsonObject.put("expirationTime", googleSignInAccount.I);
        jsonObject.put("obfuscatedIdentifier", (Object)j);
        final JSONArray jsonArray = new JSONArray();
        final ArrayList k = googleSignInAccount.K;
        final Scope[] array = (Scope[])((List)k).toArray((Object[])new Scope[((List)k).size()]);
        Arrays.sort((Object[])array, (Comparator)J0.D);
        for (int length = array.length, i = 0; i < length; ++i) {
            jsonArray.put((Object)array[i].D);
        }
        jsonObject.put("grantedScopes", (Object)jsonArray);
        jsonObject.remove("serverAuthCode");
        this.e(g, jsonObject.toString());
        final String g3 = g("googleSignInOptions", j);
        final String j2 = googleSignInOptions.J;
        final String i2 = googleSignInOptions.I;
        final JSONObject jsonObject2 = new JSONObject();
        JSONArray jsonArray2;
        try {
            jsonArray2 = new JSONArray();
            final ArrayList d2 = googleSignInOptions.D;
            Collections.sort((List)d2, (Comparator)GoogleSignInOptions.S);
            final Iterator iterator = d2.iterator();
            while (iterator.hasNext()) {
                jsonArray2.put((Object)((Scope)iterator.next()).D);
            }
        }
        catch (final JSONException ex2) {
            throw new RuntimeException((Throwable)ex2);
        }
        jsonObject2.put("scopes", (Object)jsonArray2);
        final Account e2 = googleSignInOptions.E;
        if (e2 != null) {
            jsonObject2.put("accountName", (Object)e2.name);
        }
        jsonObject2.put("idTokenRequested", googleSignInOptions.F);
        jsonObject2.put("forceCodeForRefreshToken", googleSignInOptions.H);
        jsonObject2.put("serverAuthRequested", googleSignInOptions.G);
        if (!TextUtils.isEmpty((CharSequence)i2)) {
            jsonObject2.put("serverClientId", (Object)i2);
        }
        if (!TextUtils.isEmpty((CharSequence)j2)) {
            jsonObject2.put("hostedDomain", (Object)j2);
        }
        this.e(g3, jsonObject2.toString());
    }
    
    public final void e(final String s, final String s2) {
        final ReentrantLock a = this.a;
        a.lock();
        try {
            this.b.edit().putString(s, s2).apply();
        }
        finally {
            a.unlock();
        }
    }
    
    public final String f(String string) {
        final ReentrantLock a = this.a;
        a.lock();
        try {
            string = this.b.getString(string, (String)null);
            return string;
        }
        finally {
            a.unlock();
        }
    }
}
