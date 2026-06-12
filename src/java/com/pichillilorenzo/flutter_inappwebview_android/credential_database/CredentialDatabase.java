package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import java.util.List;
import android.content.Context;

public class CredentialDatabase
{
    public static final String DATABASE_NAME = "CredentialDatabase.db";
    public static final int DATABASE_VERSION = 2;
    static final String LOG_TAG = "CredentialDatabase";
    private static CredentialDatabase instance;
    public URLCredentialDao credentialDao;
    public CredentialDatabaseHelper db;
    public URLProtectionSpaceDao protectionSpaceDao;
    
    private CredentialDatabase() {
    }
    
    private CredentialDatabase(final CredentialDatabaseHelper db, final URLProtectionSpaceDao protectionSpaceDao, final URLCredentialDao credentialDao) {
        this.db = db;
        this.protectionSpaceDao = protectionSpaceDao;
        this.credentialDao = credentialDao;
    }
    
    public static CredentialDatabase getInstance(final Context context) {
        final CredentialDatabase instance = CredentialDatabase.instance;
        if (instance != null) {
            return instance;
        }
        final CredentialDatabaseHelper credentialDatabaseHelper = new CredentialDatabaseHelper(context);
        return CredentialDatabase.instance = new CredentialDatabase(credentialDatabaseHelper, new URLProtectionSpaceDao(credentialDatabaseHelper), new URLCredentialDao(credentialDatabaseHelper));
    }
    
    public void clearAllAuthCredentials() {
        final CredentialDatabaseHelper db = this.db;
        db.clearAllTables(db.getWritableDatabase());
    }
    
    public List<URLCredential> getHttpAuthCredentials(final String s, final String s2, final String s3, final Integer n) {
        final ArrayList list = new ArrayList();
        final URLProtectionSpace find = this.protectionSpaceDao.find(s, s2, s3, n);
        Object allByProtectionSpaceId = list;
        if (find != null) {
            allByProtectionSpaceId = this.credentialDao.getAllByProtectionSpaceId(find.getId());
        }
        return (List<URLCredential>)allByProtectionSpaceId;
    }
    
    public void removeHttpAuthCredential(final String s, final String s2, final String s3, final Integer n, final String s4, final String s5) {
        final URLProtectionSpace find = this.protectionSpaceDao.find(s, s2, s3, n);
        if (find != null) {
            this.credentialDao.delete(this.credentialDao.find(s4, s5, find.getId()));
        }
    }
    
    public void removeHttpAuthCredentials(final String s, final String s2, final String s3, final Integer n) {
        final URLProtectionSpace find = this.protectionSpaceDao.find(s, s2, s3, n);
        if (find != null) {
            this.protectionSpaceDao.delete(find);
        }
    }
    
    public void setHttpAuthCredential(final String s, final String s2, final String s3, final Integer n, final String username, final String password) {
        final URLProtectionSpace find = this.protectionSpaceDao.find(s, s2, s3, n);
        Long n2;
        if (find == null) {
            n2 = this.protectionSpaceDao.insert(new URLProtectionSpace(null, s, s2, s3, n));
        }
        else {
            n2 = find.getId();
        }
        final URLCredential find2 = this.credentialDao.find(username, password, n2);
        if (find2 != null) {
            final boolean equals = find2.getUsername().equals((Object)username);
            final int n3 = 1;
            int n4;
            if (!equals) {
                find2.setUsername(username);
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            if (!find2.getPassword().equals((Object)password)) {
                find2.setPassword(password);
                n4 = n3;
            }
            if (n4 != 0) {
                this.credentialDao.update(find2);
            }
        }
        else {
            final URLCredential urlCredential = new URLCredential(null, username, password, n2);
            urlCredential.setId(this.credentialDao.insert(urlCredential));
        }
    }
}
