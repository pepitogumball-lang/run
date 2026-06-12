package w0;

import java.util.Iterator;
import java.util.TreeMap;
import android.database.Cursor;
import java.util.List;
import java.util.ArrayList;
import z0.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public final class e
{
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;
    
    public e(final String a, final HashMap hashMap, final HashSet set, final HashSet set2) {
        this.a = a;
        this.b = Collections.unmodifiableMap((Map)hashMap);
        this.c = Collections.unmodifiableSet((Set)set);
        Set unmodifiableSet;
        if (set2 == null) {
            unmodifiableSet = null;
        }
        else {
            unmodifiableSet = Collections.unmodifiableSet((Set)set2);
        }
        this.d = unmodifiableSet;
    }
    
    public static e a(final b b, final String s) {
        final StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(s);
        sb.append("`)");
        final Cursor i = b.i(sb.toString());
        final HashMap hashMap = new HashMap();
        Label_0787: {
            int n3 = 0;
            int columnIndex = 0;
            int n5 = 0;
            Object string = null;
            Object o = null;
            try {
                int n = i.getColumnCount();
                if (n > 0) {
                    final int n2 = i.getColumnIndex("name");
                    n3 = i.getColumnIndex("type");
                    final int n4 = i.getColumnIndex("notnull");
                    columnIndex = i.getColumnIndex("pk");
                    n5 = i.getColumnIndex("dflt_value");
                    while (i.moveToNext()) {
                        string = i.getString(n2);
                        final String string2 = i.getString(n3);
                        final boolean b2 = i.getInt(n4) != 0;
                        n = i.getInt(columnIndex);
                        o = new a(n, 2, (String)string, string2, i.getString(n5), b2);
                        hashMap.put(string, o);
                    }
                }
            }
            finally {
                break Label_0787;
            }
        Label_0347_Outer:
            while (true) {
                i.close();
                final HashSet set = new HashSet();
                Object b3 = new StringBuilder("PRAGMA foreign_key_list(`");
                ((StringBuilder)b3).append(s);
                ((StringBuilder)b3).append("`)");
                final b b4;
                final Cursor j = b4.i(((StringBuilder)b3).toString());
                Label_0778: {
                Label_0534:
                    while (true) {
                        Label_0528: {
                            int columnIndex2 = 0;
                        Label_0479:
                            while (true) {
                                Label_0476: {
                                    try {
                                        final int n4 = j.getColumnIndex("id");
                                        final int n2 = j.getColumnIndex("seq");
                                        n3 = j.getColumnIndex("table");
                                        n5 = j.getColumnIndex("on_delete");
                                        columnIndex2 = j.getColumnIndex("on_update");
                                        b3 = b(j);
                                        final int n = j.getCount();
                                        columnIndex = 0;
                                        if (columnIndex >= n) {
                                            break Label_0534;
                                        }
                                        j.moveToPosition(columnIndex);
                                        if (j.getInt(n2) != 0) {
                                            break Label_0528;
                                        }
                                        final int int1 = j.getInt(n4);
                                        o = new ArrayList();
                                        string = new ArrayList();
                                        final Object iterator = ((ArrayList)b3).iterator();
                                        if (!((Iterator)iterator).hasNext()) {
                                            break Label_0479;
                                        }
                                        final c c = (c)((Iterator)iterator).next();
                                        if (c.C == int1) {
                                            ((ArrayList)o).add((Object)c.E);
                                            ((ArrayList)string).add((Object)c.F);
                                            break Label_0476;
                                        }
                                        break Label_0476;
                                    }
                                    finally {
                                        break Label_0778;
                                    }
                                }
                                continue;
                            }
                            final Object iterator = new w0.b(j.getString(n3), j.getString(n5), j.getString(columnIndex2), (List)o, (List)string);
                            set.add(iterator);
                        }
                        ++columnIndex;
                        continue;
                    }
                    j.close();
                    Object o2 = new StringBuilder("PRAGMA index_list(`");
                    ((StringBuilder)o2).append(s);
                    ((StringBuilder)o2).append("`)");
                    final b b5;
                    final Cursor k = b5.i(((StringBuilder)o2).toString());
                    Label_0769: {
                        Label_0745: {
                            try {
                                final int columnIndex3 = k.getColumnIndex("name");
                                final int columnIndex4 = k.getColumnIndex("origin");
                                final int columnIndex5 = k.getColumnIndex("unique");
                                Label_0717: {
                                    if (columnIndex3 != -1 && columnIndex4 != -1) {
                                        if (columnIndex5 != -1) {
                                            o2 = new HashSet();
                                            while (k.moveToNext()) {
                                                if (!"c".equals((Object)k.getString(columnIndex4))) {
                                                    continue Label_0347_Outer;
                                                }
                                                final d c2 = c(b5, k.getString(columnIndex3), k.getInt(columnIndex5) == 1);
                                                if (c2 == null) {
                                                    break Label_0717;
                                                }
                                                ((HashSet)o2).add((Object)c2);
                                            }
                                            break Label_0745;
                                        }
                                    }
                                }
                                k.close();
                                final HashSet set2;
                                return new e(s, hashMap, set, set2);
                            }
                            finally {
                                break Label_0769;
                            }
                        }
                        k.close();
                        final HashSet set2 = (HashSet)o2;
                        return new e(s, hashMap, set, set2);
                    }
                    k.close();
                }
                j.close();
            }
        }
        i.close();
    }
    
    public static ArrayList b(final Cursor cursor) {
        final int columnIndex = cursor.getColumnIndex("id");
        final int columnIndex2 = cursor.getColumnIndex("seq");
        final int columnIndex3 = cursor.getColumnIndex("from");
        final int columnIndex4 = cursor.getColumnIndex("to");
        final int count = cursor.getCount();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < count; ++i) {
            cursor.moveToPosition(i);
            list.add((Object)new c(cursor.getString(columnIndex3), cursor.getString(columnIndex4), cursor.getInt(columnIndex), cursor.getInt(columnIndex2)));
        }
        Collections.sort((List)list);
        return list;
    }
    
    public static d c(b i, final String s, final boolean b) {
        final StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(s);
        sb.append("`)");
        i = (b)i.i(sb.toString());
        Label_0203: {
            Label_0195: {
                TreeMap treeMap;
                try {
                    final int columnIndex = ((Cursor)i).getColumnIndex("seqno");
                    final int columnIndex2 = ((Cursor)i).getColumnIndex("cid");
                    final int columnIndex3 = ((Cursor)i).getColumnIndex("name");
                    if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                        break Label_0195;
                    }
                    treeMap = new TreeMap();
                    while (((Cursor)i).moveToNext()) {
                        if (((Cursor)i).getInt(columnIndex2) < 0) {
                            continue;
                        }
                        treeMap.put((Object)((Cursor)i).getInt(columnIndex), (Object)((Cursor)i).getString(columnIndex3));
                    }
                }
                finally {
                    break Label_0203;
                }
                final ArrayList list = new ArrayList(treeMap.size());
                list.addAll(treeMap.values());
                final String s2;
                final d d = new d(s2, b, (List)list);
                ((Cursor)i).close();
                return d;
            }
            ((Cursor)i).close();
            return null;
        }
        ((Cursor)i).close();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && e.class == o.getClass()) {
            final e e = (e)o;
            final String a = e.a;
            final String a2 = this.a;
            Label_0059: {
                if (a2 != null) {
                    if (a2.equals((Object)a)) {
                        break Label_0059;
                    }
                }
                else if (a == null) {
                    break Label_0059;
                }
                return false;
            }
            final Map b = e.b;
            final Map b2 = this.b;
            Label_0092: {
                if (b2 != null) {
                    if (b2.equals((Object)b)) {
                        break Label_0092;
                    }
                }
                else if (b == null) {
                    break Label_0092;
                }
                return false;
            }
            final Set c = e.c;
            final Set c2 = this.c;
            Label_0125: {
                if (c2 != null) {
                    if (c2.equals((Object)c)) {
                        break Label_0125;
                    }
                }
                else if (c == null) {
                    break Label_0125;
                }
                return false;
            }
            final Set d = this.d;
            if (d != null) {
                final Set d2 = e.d;
                if (d2 != null) {
                    return d.equals((Object)d2);
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Map b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Set c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.a);
        sb.append("', columns=");
        sb.append((Object)this.b);
        sb.append(", foreignKeys=");
        sb.append((Object)this.c);
        sb.append(", indices=");
        sb.append((Object)this.d);
        sb.append('}');
        return sb.toString();
    }
}
