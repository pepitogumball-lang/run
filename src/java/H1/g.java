package h1;

import org.json.JSONArray;
import java.util.List;
import com.google.android.gms.internal.play_billing.D;
import java.util.ArrayList;
import org.json.JSONObject;
import c0.b;

public final class g
{
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final b f;
    
    public g(JSONObject jsonObject) {
        this.a = jsonObject.optString("formattedPrice");
        this.b = jsonObject.optLong("priceAmountMicros");
        this.c = jsonObject.optString("priceCurrencyCode");
        String optString = jsonObject.optString("offerIdToken");
        final boolean empty = optString.isEmpty();
        final b b = null;
        if (empty) {
            optString = null;
        }
        this.d = optString;
        jsonObject.optString("offerId").getClass();
        jsonObject.optString("purchaseOptionId").getClass();
        jsonObject.optInt("offerType");
        final JSONArray optJSONArray = jsonObject.optJSONArray("offerTags");
        final ArrayList list = new ArrayList();
        final int n = 0;
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); ++i) {
                list.add((Object)optJSONArray.getString(i));
            }
        }
        D.x((List)list);
        if (jsonObject.has("fullPriceMicros")) {
            jsonObject.optLong("fullPriceMicros");
        }
        final JSONObject optJSONObject = jsonObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            optJSONObject.getInt("percentageDiscount");
        }
        final JSONObject optJSONObject2 = jsonObject.optJSONObject("validTimeWindow");
        if (optJSONObject2 != null) {
            optJSONObject2.getLong("startTimeMillis");
            optJSONObject2.getLong("endTimeMillis");
        }
        final JSONObject optJSONObject3 = jsonObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject3 != null) {
            optJSONObject3.getInt("maximumQuantity");
            optJSONObject3.getInt("remainingQuantity");
        }
        this.e = jsonObject.optString("serializedDocid");
        final JSONObject optJSONObject4 = jsonObject.optJSONObject("preorderDetails");
        if (optJSONObject4 != null) {
            optJSONObject4.getLong("preorderReleaseTimeMillis");
            optJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        final JSONObject optJSONObject5 = jsonObject.optJSONObject("rentalDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getString("rentalPeriod");
            optJSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        jsonObject = jsonObject.optJSONObject("autoPayDetails");
        Object f;
        if (jsonObject == null) {
            f = b;
        }
        else {
            final Object o = new Object();
            jsonObject.getString("type");
            final JSONArray optJSONArray2 = jsonObject.optJSONArray("balanceThresholds");
            final ArrayList list2 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int j = 0; j < optJSONArray2.length(); ++j) {
                    list2.add((Object)optJSONArray2.getInt(j));
                }
            }
            final JSONArray jsonArray = jsonObject.getJSONArray("pricingPhases");
            final ArrayList list3 = new ArrayList();
            f = o;
            if (jsonArray != null) {
                int n2 = n;
                while (true) {
                    f = o;
                    if (n2 >= jsonArray.length()) {
                        break;
                    }
                    jsonObject = jsonArray.optJSONObject(n2);
                    if (jsonObject != null) {
                        list3.add((Object)new h(jsonObject));
                    }
                    ++n2;
                }
            }
        }
        this.f = (b)f;
    }
}
