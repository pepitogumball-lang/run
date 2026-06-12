package F1;

import J1.g;
import android.util.JsonWriter;
import z0.b;
import android.os.RemoteException;
import J1.j;
import y0.c;
import J1.f;

public final class c0 implements f, c
{
    public final int C;
    public final String D;
    
    public c0(final b0 b0) {
        this.C = 0;
        String b2;
        try {
            b2 = b0.b();
        }
        catch (final RemoteException ex) {
            j.g("", (Throwable)ex);
            b2 = null;
        }
        this.D = b2;
    }
    
    @Override
    public String a() {
        return this.D;
    }
    
    @Override
    public void b(final b b) {
    }
    
    @Override
    public void e(final JsonWriter jsonWriter) {
        final Object b = g.b;
        jsonWriter.name("params").beginObject();
        final String d = this.D;
        if (d != null) {
            jsonWriter.name("error_description").value(d);
        }
        jsonWriter.endObject();
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 0: {
                return this.D;
            }
        }
    }
}
