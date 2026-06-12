package u0;

import android.util.Log;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
import y0.a;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import android.content.Context;

public final class j
{
    public final String a;
    public final Context b;
    public ArrayList c;
    public Executor d;
    public Executor e;
    public a f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final k j;
    public HashSet k;
    
    public j(final Context b, final String a) {
        this.b = b;
        this.a = a;
        this.h = true;
        final Object j = new Object();
        ((k)j).a = new HashMap();
        this.j = (k)j;
    }
    
    public final void a(final v0.a... array) {
        if (this.k == null) {
            this.k = new HashSet();
        }
        final int length = array.length;
        final int n = 0;
        for (final v0.a a : array) {
            this.k.add((Object)a.a);
            this.k.add((Object)a.b);
        }
        final k j = this.j;
        j.getClass();
        for (int length2 = array.length, k = n; k < length2; ++k) {
            final v0.a a2 = array[k];
            final int a3 = a2.a;
            final HashMap a4 = j.a;
            TreeMap treeMap;
            if ((treeMap = (TreeMap)a4.get((Object)a3)) == null) {
                treeMap = new TreeMap();
                a4.put((Object)a3, (Object)treeMap);
            }
            final int b = a2.b;
            final v0.a a5 = (v0.a)treeMap.get((Object)b);
            if (a5 != null) {
                final StringBuilder sb = new StringBuilder("Overriding migration ");
                sb.append((Object)a5);
                sb.append(" with ");
                sb.append((Object)a2);
                Log.w("ROOM", sb.toString());
            }
            treeMap.put((Object)b, (Object)a2);
        }
    }
}
