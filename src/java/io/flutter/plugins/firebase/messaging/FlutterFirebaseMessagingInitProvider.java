package io.flutter.plugins.firebase.messaging;

import android.database.Cursor;
import android.content.Context;
import android.util.Log;
import s2.a;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProvider;

public class FlutterFirebaseMessagingInitProvider extends ContentProvider
{
    public final int delete(final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    public final String getType(final Uri uri) {
        return null;
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        return null;
    }
    
    public final boolean onCreate() {
        if (a.c == null) {
            final Context context = this.getContext();
            Context applicationContext;
            if ((applicationContext = context) != null) {
                applicationContext = context;
                if (context.getApplicationContext() != null) {
                    applicationContext = context.getApplicationContext();
                }
            }
            Log.d("FLTFireContextHolder", "received application context.");
            a.c = applicationContext;
        }
        return false;
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return null;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return 0;
    }
}
