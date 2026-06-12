package h1;

import org.json.JSONObject;

public final class h
{
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    
    public h(final JSONObject jsonObject) {
        this.d = jsonObject.optString("billingPeriod");
        this.c = jsonObject.optString("priceCurrencyCode");
        this.a = jsonObject.optString("formattedPrice");
        this.b = jsonObject.optLong("priceAmountMicros");
        this.f = jsonObject.optInt("recurrenceMode");
        this.e = jsonObject.optInt("billingCycleCount");
    }
}
