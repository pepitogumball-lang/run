package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;

public class URLCredentialDao
{
    CredentialDatabaseHelper credentialDatabaseHelper;
    String[] projection;
    
    public URLCredentialDao(final CredentialDatabaseHelper credentialDatabaseHelper) {
        this.projection = new String[] { "_id", "username", "password", "protection_space_id" };
        this.credentialDatabaseHelper = credentialDatabaseHelper;
    }
    
    public long delete(final URLCredential urlCredential) {
        return this.credentialDatabaseHelper.getWritableDatabase().delete("credential", "_id = ?", new String[] { urlCredential.getId().toString() });
    }
    
    public URLCredential find(final String s, final String s2, final Long n) {
        final Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query("credential", this.projection, "username = ? AND password = ? AND protection_space_id = ?", new String[] { s, s2, n.toString() }, (String)null, (String)null, (String)null);
        URLCredential urlCredential;
        if (query.moveToNext()) {
            urlCredential = new URLCredential(query.getLong(query.getColumnIndexOrThrow("_id")), query.getString(query.getColumnIndexOrThrow("username")), query.getString(query.getColumnIndexOrThrow("password")), n);
        }
        else {
            urlCredential = null;
        }
        query.close();
        return urlCredential;
    }
    
    public List<URLCredential> getAllByProtectionSpaceId(final Long n) {
        final Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query("credential", this.projection, "protection_space_id = ?", new String[] { n.toString() }, (String)null, (String)null, (String)null);
        final ArrayList list = new ArrayList();
        while (query.moveToNext()) {
            list.add((Object)new URLCredential(query.getLong(query.getColumnIndexOrThrow("_id")), query.getString(query.getColumnIndexOrThrow("username")), query.getString(query.getColumnIndexOrThrow("password")), n));
        }
        query.close();
        return (List<URLCredential>)list;
    }
    
    public long insert(final URLCredential urlCredential) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("username", urlCredential.getUsername());
        contentValues.put("password", urlCredential.getPassword());
        contentValues.put("protection_space_id", urlCredential.getProtectionSpaceId());
        return this.credentialDatabaseHelper.getWritableDatabase().insert("credential", (String)null, contentValues);
    }
    
    public long update(final URLCredential urlCredential) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("username", urlCredential.getUsername());
        contentValues.put("password", urlCredential.getPassword());
        return this.credentialDatabaseHelper.getWritableDatabase().update("credential", contentValues, "protection_space_id = ?", new String[] { urlCredential.getProtectionSpaceId().toString() });
    }
}
