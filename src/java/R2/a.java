package R2;

import java.util.HashMap;

public abstract class a
{
    public static final HashMap a;
    public static final HashMap b;
    
    static {
        final HashMap hashMap = a = new HashMap();
        final HashMap hashMap2 = b = new HashMap();
        final Integer value = -1;
        hashMap.put((Object)value, (Object)"The Play Store app is either not installed or not the official version.");
        final Integer value2 = -2;
        hashMap.put((Object)value2, (Object)"Call first requestReviewFlow to get the ReviewInfo.");
        final Integer value3 = -100;
        hashMap.put((Object)value3, (Object)"Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put((Object)value, (Object)"PLAY_STORE_NOT_FOUND");
        hashMap2.put((Object)value2, (Object)"INVALID_REQUEST");
        hashMap2.put((Object)value3, (Object)"INTERNAL_ERROR");
    }
}
