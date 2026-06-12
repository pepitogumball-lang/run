package com.pichillilorenzo.flutter_inappwebview_android;

import java.text.DateFormat;
import android.os.Build$VERSION;
import F4.o;
import F4.m;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Locale;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class PlatformUtil extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "PlatformUtil";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_platformutil";
    public InAppWebViewFlutterPlugin plugin;
    
    public PlatformUtil(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_platformutil"));
        this.plugin = plugin;
    }
    
    public static String formatDate(final long n, final String s, final Locale locale, final TimeZone timeZone) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s, locale);
        ((DateFormat)simpleDateFormat).setTimeZone(timeZone);
        return ((DateFormat)simpleDateFormat).format(new Date(n));
    }
    
    public static Locale getLocaleFromString(String s) {
        if (s == null) {
            return Locale.US;
        }
        final String[] split = s.split("_");
        final String s2 = split[0];
        final int length = split.length;
        String s3 = "";
        if (length > 1) {
            s = split[1];
        }
        else {
            s = "";
        }
        if (split.length > 2) {
            s3 = split[2];
        }
        return new Locale(s2, s, s3);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"formatDate")) {
            if (!a.equals((Object)"getSystemVersion")) {
                o.notImplemented();
            }
            else {
                o.success((Object)String.valueOf(Build$VERSION.SDK_INT));
            }
        }
        else {
            final long longValue = (long)m.a("date");
            final String s = (String)m.a("format");
            final Locale localeFromString = getLocaleFromString((String)m.a("locale"));
            String s2;
            if ((s2 = (String)m.a("timezone")) == null) {
                s2 = "UTC";
            }
            o.success((Object)formatDate(longValue, s, localeFromString, TimeZone.getTimeZone(s2)));
        }
    }
}
