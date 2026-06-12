package h1;

import org.json.JSONArray;
import org.json.JSONObject;
import com.google.android.gms.internal.ads.g0;
import java.util.ArrayList;
import V4.G;

public final class i
{
    public final String a;
    public final String b;
    public final String c;
    public final G d;
    public final ArrayList e;
    public final g0 f;
    
    public i(final JSONObject jsonObject) {
        this.a = jsonObject.optString("basePlanId");
        String optString = jsonObject.optString("offerId");
        final boolean empty = optString.isEmpty();
        final g0 g0 = null;
        if (empty) {
            optString = null;
        }
        this.b = optString;
        this.c = jsonObject.getString("offerIdToken");
        this.d = new G(jsonObject.getJSONArray("pricingPhases"));
        final JSONObject optJSONObject = jsonObject.optJSONObject("installmentPlanDetails");
        g0 f;
        if (optJSONObject == null) {
            f = g0;
        }
        else {
            f = new g0(optJSONObject);
        }
        this.f = f;
        final JSONObject optJSONObject2 = jsonObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString("title");
            optJSONObject2.optString("name");
            optJSONObject2.optString("description");
            optJSONObject2.optString("basePlanId");
            final JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
            if (optJSONObject3 != null) {
                optJSONObject3.optString("billingPeriod");
                optJSONObject3.optString("priceCurrencyCode");
                optJSONObject3.optString("formattedPrice");
                optJSONObject3.optLong("priceAmountMicros");
                optJSONObject3.optInt("recurrenceMode");
                optJSONObject3.optInt("billingCycleCount");
            }
        }
        final ArrayList e = new ArrayList();
        final JSONArray optJSONArray = jsonObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); ++i) {
                e.add((Object)optJSONArray.getString(i));
            }
        }
        this.e = e;
    }
}
