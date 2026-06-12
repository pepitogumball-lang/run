package m1;

import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;
import android.util.JsonReader;
import java.io.BufferedReader;

public final class u
{
    public final long a;
    
    public u(final long a) {
        this.a = a;
    }
    
    public static u a(BufferedReader bufferedReader) {
        while (true) {
            bufferedReader = (BufferedReader)new JsonReader((Reader)bufferedReader);
            Label_0104: {
            Label_0067:
                while (true) {
                    Label_0085: {
                        try {
                            ((JsonReader)bufferedReader).beginObject();
                            if (!((JsonReader)bufferedReader).hasNext()) {
                                throw new IOException("Response is missing nextRequestWaitMillis field.");
                            }
                            if (!((JsonReader)bufferedReader).nextName().equals((Object)"nextRequestWaitMillis")) {
                                break Label_0085;
                            }
                            if (((JsonReader)bufferedReader).peek() == JsonToken.STRING) {
                                final u u = new u(Long.parseLong(((JsonReader)bufferedReader).nextString()));
                                ((JsonReader)bufferedReader).close();
                                return u;
                            }
                        }
                        finally {
                            break Label_0104;
                        }
                        break Label_0067;
                    }
                    ((JsonReader)bufferedReader).skipValue();
                    continue;
                }
                final u u2 = new u(((JsonReader)bufferedReader).nextLong());
                ((JsonReader)bufferedReader).close();
                return u2;
            }
            ((JsonReader)bufferedReader).close();
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof u) {
            if (this.a != ((u)o).a) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a >>> 32 ^ a) ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
