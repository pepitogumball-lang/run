package C;

import android.media.AudioAttributes;
import android.media.AudioAttributes$Builder;

public abstract class s
{
    public static AudioAttributes a(final AudioAttributes$Builder audioAttributes$Builder) {
        return audioAttributes$Builder.build();
    }
    
    public static AudioAttributes$Builder b() {
        return new AudioAttributes$Builder();
    }
    
    public static AudioAttributes$Builder c(final AudioAttributes$Builder audioAttributes$Builder, final int contentType) {
        return audioAttributes$Builder.setContentType(contentType);
    }
    
    public static AudioAttributes$Builder d(final AudioAttributes$Builder audioAttributes$Builder, final int legacyStreamType) {
        return audioAttributes$Builder.setLegacyStreamType(legacyStreamType);
    }
    
    public static AudioAttributes$Builder e(final AudioAttributes$Builder audioAttributes$Builder, final int usage) {
        return audioAttributes$Builder.setUsage(usage);
    }
}
