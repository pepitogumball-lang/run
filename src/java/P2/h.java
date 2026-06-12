package P2;

import android.os.Process;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public abstract class h
{
    public static final HashMap a;
    
    static {
        new HashSet((Collection)Arrays.asList((Object[])new String[] { "native", "unity" }));
        a = new HashMap();
        final int myUid = Process.myUid();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        sb.toString().concat("PlayCoreVersion");
    }
}
