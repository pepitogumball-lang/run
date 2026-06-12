package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;

public class URLProtectionSpaceDao
{
    CredentialDatabaseHelper credentialDatabaseHelper;
    String[] projection;
    
    public URLProtectionSpaceDao(final CredentialDatabaseHelper credentialDatabaseHelper) {
        this.projection = new String[] { "_id", "host", "protocol", "realm", "port" };
        this.credentialDatabaseHelper = credentialDatabaseHelper;
    }
    
    public long delete(final URLProtectionSpace urlProtectionSpace) {
        return this.credentialDatabaseHelper.getWritableDatabase().delete("protection_space", "_id = ?", new String[] { urlProtectionSpace.getId().toString() });
    }
    
    public URLProtectionSpace find(final String s, final String s2, final String s3, final Integer n) {
        final Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query("protection_space", this.projection, "host = ? AND protocol = ? AND realm = ? AND port = ?", new String[] { s, s2, s3, n.toString() }, (String)null, (String)null, (String)null);
        URLProtectionSpace urlProtectionSpace;
        if (query.moveToNext()) {
            urlProtectionSpace = new URLProtectionSpace(query.getLong(query.getColumnIndexOrThrow("_id")), query.getString(query.getColumnIndexOrThrow("host")), query.getString(query.getColumnIndexOrThrow("protocol")), query.getString(query.getColumnIndexOrThrow("realm")), query.getInt(query.getColumnIndexOrThrow("port")));
        }
        else {
            urlProtectionSpace = null;
        }
        query.close();
        return urlProtectionSpace;
    }
    
    public List<URLProtectionSpace> getAll() {
        final Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query("protection_space", this.projection, (String)null, (String[])null, (String)null, (String)null, (String)null);
        final ArrayList list = new ArrayList();
        while (query.moveToNext()) {
            list.add((Object)new URLProtectionSpace(query.getLong(query.getColumnIndexOrThrow("_id")), query.getString(query.getColumnIndexOrThrow("host")), query.getString(query.getColumnIndexOrThrow("protocol")), query.getString(query.getColumnIndexOrThrow("realm")), query.getInt(query.getColumnIndexOrThrow("port"))));
        }
        query.close();
        return (List<URLProtectionSpace>)list;
    }
    
    public long insert(final URLProtectionSpace urlProtectionSpace) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("host", urlProtectionSpace.getHost());
        contentValues.put("protocol", urlProtectionSpace.getProtocol());
        contentValues.put("realm", urlProtectionSpace.getRealm());
        contentValues.put("port", Integer.valueOf(urlProtectionSpace.getPort()));
        return this.credentialDatabaseHelper.getWritableDatabase().insert("protection_space", (String)null, contentValues);
    }
}
