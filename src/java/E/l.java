package E;

import java.util.Iterator;
import android.content.pm.PackageItemInfo;
import android.os.BaseBundle;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.database.MatrixCursor;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.content.ContentValues;
import android.webkit.MimeTypeMap;
import android.annotation.SuppressLint;
import android.net.Uri$Builder;
import java.util.Map$Entry;
import android.net.Uri;
import android.os.Bundle;
import m0.a;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.os.Environment;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.Context;
import java.util.HashMap;
import java.io.File;
import android.content.ContentProvider;

public abstract class l extends ContentProvider
{
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS;
    private static final File DEVICE_ROOT;
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static final HashMap<String, j> sCache;
    private String mAuthority;
    private j mLocalPathStrategy;
    private final Object mLock;
    private final int mResourceId;
    
    static {
        COLUMNS = new String[] { "_display_name", "_size" };
        DEVICE_ROOT = new File("/");
        sCache = new HashMap();
    }
    
    public l() {
        this.mLock = new Object();
        this.mResourceId = 0;
    }
    
    public static String access$000(final String s) {
        String substring = s;
        if (s.length() > 0) {
            substring = s;
            if (s.charAt(s.length() - 1) == '/') {
                substring = s.substring(0, s.length() - 1);
            }
        }
        return substring;
    }
    
    public static j b(final int n, final Context context, final String s) {
        final HashMap<String, j> sCache = l.sCache;
        final HashMap<String, j> hashMap;
        monitorenter(hashMap = sCache);
        while (true) {
            try {
                j j;
                if ((j = (j)sCache.get((Object)s)) == null) {
                    final int n2 = n;
                    final Context context2 = context;
                    final String s2 = s;
                    j = c(n2, context2, s2);
                    final HashMap<String, j> hashMap2 = sCache;
                    final String s3 = s;
                    final j i = j;
                    hashMap2.put((Object)s3, (Object)i);
                }
                break Label_0080;
            }
            finally {
                monitorexit(hashMap);
                monitorexit(hashMap);
                return;
            }
            try {
                final int n2 = n;
                final Context context2 = context;
                final String s2 = s;
                final j j = c(n2, context2, s2);
                final HashMap<String, j> hashMap2 = sCache;
                final String s3 = s;
                final j i = j;
                hashMap2.put((Object)s3, (Object)i);
                continue;
            }
            catch (final XmlPullParserException ex) {}
            catch (final IOException ex2) {}
            break;
        }
    }
    
    public static k c(int next, final Context context, final String s) {
        final k k = new k(s);
        final XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, s, context.getPackageManager().resolveContentProvider(s, 128), next);
        while (true) {
            next = ((XmlPullParser)fileProviderPathsMetaData).next();
            if (next == 1) {
                return k;
            }
            if (next != 2) {
                continue;
            }
            final String name = ((XmlPullParser)fileProviderPathsMetaData).getName();
            final File file = null;
            final String attributeValue = ((AttributeSet)fileProviderPathsMetaData).getAttributeValue((String)null, "name");
            final String attributeValue2 = ((AttributeSet)fileProviderPathsMetaData).getAttributeValue((String)null, "path");
            File file2;
            if ("root-path".equals((Object)name)) {
                file2 = l.DEVICE_ROOT;
            }
            else if ("files-path".equals((Object)name)) {
                file2 = context.getFilesDir();
            }
            else if ("cache-path".equals((Object)name)) {
                file2 = context.getCacheDir();
            }
            else if ("external-path".equals((Object)name)) {
                file2 = Environment.getExternalStorageDirectory();
            }
            else if ("external-files-path".equals((Object)name)) {
                final File[] externalFilesDirs = context.getExternalFilesDirs((String)null);
                file2 = file;
                if (externalFilesDirs.length > 0) {
                    file2 = externalFilesDirs[0];
                }
            }
            else if ("external-cache-path".equals((Object)name)) {
                final File[] externalCacheDirs = context.getExternalCacheDirs();
                file2 = file;
                if (externalCacheDirs.length > 0) {
                    file2 = externalCacheDirs[0];
                }
            }
            else {
                file2 = file;
                if ("external-media-path".equals((Object)name)) {
                    final File[] a = i.a(context);
                    file2 = file;
                    if (a.length > 0) {
                        file2 = a[0];
                    }
                }
            }
            if (file2 == null) {
                continue;
            }
            final String s2 = (new String[] { attributeValue2 })[0];
            File file3 = file2;
            if (s2 != null) {
                file3 = new File(file2, s2);
            }
            if (!TextUtils.isEmpty((CharSequence)attributeValue)) {
                try {
                    k.b.put((Object)attributeValue, (Object)file3.getCanonicalFile());
                    continue;
                }
                catch (final IOException ex) {
                    final StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                    sb.append((Object)file3);
                    throw new IllegalArgumentException(sb.toString(), (Throwable)ex);
                }
                break;
            }
            break;
        }
        throw new IllegalArgumentException("Name must not be empty");
    }
    
    public static XmlResourceParser getFileProviderPathsMetaData(final Context context, final String s, final ProviderInfo providerInfo, final int n) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(a.f("Couldn't find meta-data for provider with authority ", s));
        }
        if (providerInfo.metaData == null && n != 0) {
            ((BaseBundle)(providerInfo.metaData = new Bundle(1))).putInt("android.support.FILE_PROVIDER_PATHS", n);
        }
        final XmlResourceParser loadXmlMetaData = ((PackageItemInfo)providerInfo).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }
    
    public static Uri getUriForFile(final Context context, String s, File iterator) {
        final k k = (k)b(0, context, s);
        try {
            final String canonicalPath = iterator.getCanonicalPath();
            iterator = (File)k.b.entrySet().iterator();
            Map$Entry map$Entry = null;
            while (((Iterator)iterator).hasNext()) {
                final Map$Entry map$Entry2 = (Map$Entry)((Iterator)iterator).next();
                final String path = ((File)map$Entry2.getValue()).getPath();
                if (E.k.a(canonicalPath, path) && (map$Entry == null || path.length() > ((File)map$Entry.getValue()).getPath().length())) {
                    map$Entry = map$Entry2;
                }
            }
            if (map$Entry != null) {
                s = ((File)map$Entry.getValue()).getPath();
                if (s.endsWith("/")) {
                    s = canonicalPath.substring(s.length());
                }
                else {
                    s = canonicalPath.substring(s.length() + 1);
                }
                iterator = (File)new StringBuilder();
                ((StringBuilder)iterator).append(Uri.encode((String)map$Entry.getKey()));
                ((StringBuilder)iterator).append('/');
                ((StringBuilder)iterator).append(Uri.encode(s, "/"));
                return new Uri$Builder().scheme("content").authority(k.a).encodedPath(((StringBuilder)iterator).toString()).build();
            }
            throw new IllegalArgumentException(a.f("Failed to find configured root that contains ", canonicalPath));
        }
        catch (final IOException ex) {
            final StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
            sb.append((Object)iterator);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    @SuppressLint({ "StreamFiles" })
    public static Uri getUriForFile(final Context context, final String s, final File file, final String s2) {
        return getUriForFile(context, s, file).buildUpon().appendQueryParameter("displayName", s2).build();
    }
    
    public final j a() {
        final Object mLock;
        monitorenter(mLock = this.mLock);
        Label_0054: {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = b(this.mResourceId, this.getContext(), this.mAuthority);
                }
                break Label_0054;
            }
            finally {
                monitorexit(mLock);
                throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                final j mLocalPathStrategy = this.mLocalPathStrategy;
                monitorexit(mLock);
                return mLocalPathStrategy;
            }
        }
    }
    
    public void attachInfo(final Context context, final ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                final String mAuthority = providerInfo.authority.split(";")[0];
                final Object mLock = this.mLock;
                synchronized (mLock) {
                    this.mAuthority = mAuthority;
                    monitorexit(mLock);
                    final HashMap<String, j> sCache = l.sCache;
                    synchronized (sCache) {
                        sCache.remove((Object)mAuthority);
                        return;
                    }
                }
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        return ((k)this.a()).b(uri).delete() ? 1 : 0;
    }
    
    public String getType(final Uri uri) {
        final File b = ((k)this.a()).b(uri);
        final int lastIndex = b.getName().lastIndexOf(46);
        if (lastIndex >= 0) {
            final String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b.getName().substring(lastIndex + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }
    
    public String getTypeAnonymous(final Uri uri) {
        return "application/octet-stream";
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }
    
    public boolean onCreate() {
        return true;
    }
    
    @SuppressLint({ "UnknownNullness" })
    public ParcelFileDescriptor openFile(final Uri uri, final String s) {
        final File b = ((k)this.a()).b(uri);
        int n;
        if ("r".equals((Object)s)) {
            n = 268435456;
        }
        else if (!"w".equals((Object)s) && !"wt".equals((Object)s)) {
            if ("wa".equals((Object)s)) {
                n = 704643072;
            }
            else if ("rw".equals((Object)s)) {
                n = 939524096;
            }
            else {
                if (!"rwt".equals((Object)s)) {
                    throw new IllegalArgumentException(a.f("Invalid mode: ", s));
                }
                n = 1006632960;
            }
        }
        else {
            n = 738197504;
        }
        return ParcelFileDescriptor.open(b, n);
    }
    
    public Cursor query(final Uri uri, final String[] array, String queryParameter, final String[] array2, final String s) {
        final File b = ((k)this.a()).b(uri);
        queryParameter = uri.getQueryParameter("displayName");
        String[] columns = array;
        if (array == null) {
            columns = l.COLUMNS;
        }
        final String[] array3 = new String[columns.length];
        final Object[] array4 = new Object[columns.length];
        final int length = columns.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final String s2 = columns[i];
            int n4 = 0;
            Label_0166: {
                int n3;
                if ("_display_name".equals((Object)s2)) {
                    array3[n] = "_display_name";
                    final int n2 = n + 1;
                    String name;
                    if (queryParameter == null) {
                        name = b.getName();
                    }
                    else {
                        name = queryParameter;
                    }
                    array4[n] = name;
                    n3 = n2;
                }
                else {
                    n4 = n;
                    if (!"_size".equals((Object)s2)) {
                        break Label_0166;
                    }
                    array3[n] = "_size";
                    final int n5 = n + 1;
                    array4[n] = b.length();
                    n3 = n5;
                }
                n4 = n3;
            }
            ++i;
            n = n4;
        }
        final String[] array5 = new String[n];
        System.arraycopy((Object)array3, 0, (Object)array5, 0, n);
        final Object[] array6 = new Object[n];
        System.arraycopy((Object)array4, 0, (Object)array6, 0, n);
        final MatrixCursor matrixCursor = new MatrixCursor(array5, 1);
        matrixCursor.addRow(array6);
        return (Cursor)matrixCursor;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("No external updates");
    }
}
