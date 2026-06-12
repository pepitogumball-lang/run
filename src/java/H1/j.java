package h1;

import org.json.JSONArray;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

public final class j
{
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final ArrayList j;
    public final ArrayList k;
    
    public j(String optString) {
        this.a = optString;
        final JSONObject b = new JSONObject(optString);
        this.b = b;
        final String optString2 = b.optString("productId");
        this.c = optString2;
        optString = b.optString("type");
        this.d = optString;
        if (TextUtils.isEmpty((CharSequence)optString2)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty((CharSequence)optString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = b.optString("title");
        this.f = b.optString("name");
        this.g = b.optString("description");
        b.optString("packageDisplayName");
        b.optString("iconUrl");
        this.h = b.optString("skuDetailsToken");
        this.i = b.optString("serializedDocid");
        final JSONArray optJSONArray = b.optJSONArray("subscriptionOfferDetails");
        final int n = 0;
        if (optJSONArray != null) {
            final ArrayList j = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); ++i) {
                j.add((Object)new i(optJSONArray.getJSONObject(i)));
            }
            this.j = j;
        }
        else {
            ArrayList k;
            if (!optString.equals((Object)"subs") && !optString.equals((Object)"play_pass_subs")) {
                k = null;
            }
            else {
                k = new ArrayList();
            }
            this.j = k;
        }
        final JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        final JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        final ArrayList list = new ArrayList();
        if (optJSONArray2 != null) {
            for (int l = n; l < optJSONArray2.length(); ++l) {
                list.add((Object)new g(optJSONArray2.getJSONObject(l)));
            }
            this.k = list;
            return;
        }
        if (optJSONObject != null) {
            list.add((Object)new g(optJSONObject));
            this.k = list;
            return;
        }
        this.k = null;
    }
    
    public final g a() {
        final ArrayList k = this.k;
        if (k != null && !k.isEmpty()) {
            return (g)k.get(0);
        }
        return null;
    }
    
    public final String b() {
        return this.c;
    }
    
    public final String c() {
        return this.d;
    }
    
    public final String d() {
        return this.b.optString("packageName");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof j && TextUtils.equals((CharSequence)this.a, (CharSequence)((j)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        final String value = String.valueOf((Object)this.j);
        final StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        sb.append(this.a);
        sb.append("', parsedJson=");
        sb.append(string);
        sb.append(", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        sb.append(this.h);
        sb.append("', subscriptionOfferDetails=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
