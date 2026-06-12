package L;

import android.content.ContentProviderClient;
import android.net.Uri;
import android.database.Cursor;
import android.content.pm.Signature;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ContentUris;
import android.os.RemoteException;
import android.util.Log;
import android.os.CancellationSignal;
import android.net.Uri$Builder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import h1.w;
import android.content.Context;
import F1.n;

public abstract class b
{
    public static final a a;
    
    static {
        a = new a(0);
    }
    
    public static w a(final n n, Context context) {
        final PackageManager packageManager = context.getPackageManager();
        final Resources resources = context.getResources();
        final String s = (String)n.D;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(s, 0);
        if (resolveContentProvider != null) {
            final String packageName = resolveContentProvider.packageName;
            final String s2 = (String)n.E;
            if (packageName.equals((Object)s2)) {
                final Signature[] signatures = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                final ArrayList list = new ArrayList();
                for (int length = signatures.length, i = 0; i < length; ++i) {
                    list.add((Object)signatures[i].toByteArray());
                }
                final a a = b.a;
                Collections.sort((List)list, (Comparator)a);
                List f = (List)n.G;
                if (f == null) {
                    f = G.b.f(resources, 0);
                }
                int n2 = 0;
                Context context2 = null;
                Cursor cursor = null;
                ProviderInfo providerInfo = null;
            Label_0273:
                while (true) {
                    final int size = f.size();
                    context2 = null;
                    cursor = null;
                    if (n2 >= size) {
                        providerInfo = null;
                        break;
                    }
                    final ArrayList list2 = new ArrayList((Collection)f.get(n2));
                    Collections.sort((List)list2, (Comparator)a);
                    if (list.size() == list2.size()) {
                        int n3 = 0;
                        while (true) {
                            providerInfo = resolveContentProvider;
                            if (n3 >= list.size()) {
                                break Label_0273;
                            }
                            if (!Arrays.equals((byte[])list.get(n3), (byte[])list2.get(n3))) {
                                break;
                            }
                            ++n3;
                        }
                    }
                    ++n2;
                }
                if (providerInfo == null) {
                    return new w(1, (Object)null);
                }
                final String authority = providerInfo.authority;
                final ArrayList list3 = new ArrayList();
                final Uri build = new Uri$Builder().scheme("content").authority(authority).build();
                final Uri build2 = new Uri$Builder().scheme("content").authority(authority).appendPath("file").build();
                final ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                context = context2;
            Label_0619_Outer:
                while (true) {
                    String s3;
                    Object query = null;
                    ArrayList list4 = null;
                    int columnIndex;
                    ArrayList list5;
                    int columnIndex2;
                    int columnIndex3 = 0;
                    int columnIndex4;
                    int columnIndex5 = 0;
                    int columnIndex6;
                    int int1;
                    Uri uri;
                    int int2;
                    int int3;
                    g g;
                    Label_0664_Outer:Label_0705_Outer:
                    while (true) {
                        Label_0617: {
                            try {
                                s3 = (String)n.F;
                                if (acquireUnstableContentProviderClient == null) {
                                    query = cursor;
                                }
                                else {
                                    context = context2;
                                    try {
                                        query = acquireUnstableContentProviderClient.query(build, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { s3 }, (String)null, (CancellationSignal)null);
                                    }
                                    catch (final RemoteException ex) {
                                        context = context2;
                                        Log.w("FontsProvider", "Unable to query the content provider", (Throwable)ex);
                                        query = cursor;
                                    }
                                }
                                list4 = list3;
                                if (query == null) {
                                    break Label_0619_Outer;
                                }
                                context = (Context)query;
                                list4 = list3;
                                if (((Cursor)query).getCount() <= 0) {
                                    break Label_0619_Outer;
                                }
                                context = (Context)query;
                                columnIndex = ((Cursor)query).getColumnIndex("result_code");
                                context = (Context)query;
                                context = (Context)query;
                                list5 = new ArrayList();
                                context = (Context)query;
                                columnIndex2 = ((Cursor)query).getColumnIndex("_id");
                                context = (Context)query;
                                columnIndex3 = ((Cursor)query).getColumnIndex("file_id");
                                context = (Context)query;
                                columnIndex4 = ((Cursor)query).getColumnIndex("font_ttc_index");
                                context = (Context)query;
                                columnIndex5 = ((Cursor)query).getColumnIndex("font_weight");
                                context = (Context)query;
                                columnIndex6 = ((Cursor)query).getColumnIndex("font_italic");
                                context = (Context)query;
                                list4 = list5;
                                if (!((Cursor)query).moveToNext()) {
                                    break Label_0619_Outer;
                                }
                                if (columnIndex != -1) {
                                    context = (Context)query;
                                    int1 = ((Cursor)query).getInt(columnIndex);
                                    break Label_0619;
                                }
                                break Label_0617;
                            }
                            finally {
                                if (context != null) {
                                    ((Cursor)context).close();
                                }
                                if (acquireUnstableContentProviderClient != null) {
                                    acquireUnstableContentProviderClient.close();
                                }
                                Label_0800: {
                                    return new w(0, (Object)list4.toArray((Object[])new g[0]));
                                }
                            Label_0705:
                                while (true) {
                                    while (true) {
                                        Label_0641: {
                                            Label_0790_Outer:Block_20_Outer:
                                            while (true) {
                                                iftrue(Label_0708:)(columnIndex5 == -1);
                                                while (true) {
                                                    while (true) {
                                                        Block_25: {
                                                            Block_22: {
                                                                break Block_22;
                                                                iftrue(Label_0800:)(acquireUnstableContentProviderClient == null);
                                                                Block_26: {
                                                                    break Block_26;
                                                                    Label_0667:
                                                                    uri = ContentUris.withAppendedId(build2, ((Cursor)query).getLong(columnIndex3));
                                                                    continue Label_0790_Outer;
                                                                    int2 = ((Cursor)query).getInt(columnIndex4);
                                                                    break Label_0641;
                                                                    g = new g(uri, int2, int3, columnIndex6 != -1 && ((Cursor)query).getInt(columnIndex6) == 1, int1);
                                                                    context = (Context)query;
                                                                    list5.add((Object)g);
                                                                    continue Label_0619_Outer;
                                                                }
                                                                acquireUnstableContentProviderClient.close();
                                                                return new w(0, (Object)list4.toArray((Object[])new g[0]));
                                                                iftrue(Label_0790:)(query == null);
                                                                break Block_25;
                                                                Label_0639:
                                                                int2 = 0;
                                                                break Label_0641;
                                                            }
                                                            int3 = ((Cursor)query).getInt(columnIndex5);
                                                            continue Label_0705;
                                                        }
                                                        ((Cursor)query).close();
                                                        continue Block_20_Outer;
                                                    }
                                                    iftrue(Label_0639:)(columnIndex4 == -1);
                                                    continue Label_0705_Outer;
                                                }
                                                uri = ContentUris.withAppendedId(build, ((Cursor)query).getLong(columnIndex2));
                                                continue Label_0790_Outer;
                                            }
                                            int1 = 0;
                                            continue Label_0664_Outer;
                                        }
                                        iftrue(Label_0667:)(columnIndex3 != -1);
                                        continue;
                                    }
                                    Label_0708:
                                    int3 = 400;
                                    continue Label_0705;
                                }
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            final StringBuilder sb = new StringBuilder("Found content provider ");
            sb.append(s);
            sb.append(", but package was not ");
            sb.append(s2);
            throw new PackageManager$NameNotFoundException(sb.toString());
        }
        throw new PackageManager$NameNotFoundException(m0.a.f("No package found for authority: ", s));
    }
}
