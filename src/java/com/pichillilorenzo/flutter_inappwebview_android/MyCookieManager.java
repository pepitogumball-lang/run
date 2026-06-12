package com.pichillilorenzo.flutter_inappwebview_android;

import java.util.Iterator;
import G0.c;
import java.text.DateFormat;
import v.e;
import F4.m;
import android.util.Log;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Arrays;
import J5.b;
import G0.A;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import G0.z;
import F0.d;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import com.google.android.gms.internal.measurement.L;
import m0.a;
import android.webkit.ValueCallback;
import F4.o;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import F4.p;
import android.webkit.CookieManager;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class MyCookieManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;
    
    public MyCookieManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_cookiemanager"));
        this.plugin = plugin;
    }
    
    public static String getCookieExpirationDate(final Long n) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        ((DateFormat)simpleDateFormat).setTimeZone(TimeZone.getTimeZone("GMT"));
        return ((DateFormat)simpleDateFormat).format(new Date((long)n));
    }
    
    private static CookieManager getCookieManager() {
        if (MyCookieManager.cookieManager == null) {
            try {
                MyCookieManager.cookieManager = CookieManager.getInstance();
            }
            catch (final Exception ex) {
                if (((Throwable)ex).getMessage() != null && ((Throwable)ex).getClass().getCanonicalName().equals((Object)"android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    return null;
                }
                throw ex;
            }
            catch (final IllegalArgumentException ex2) {
                return null;
            }
        }
        return MyCookieManager.cookieManager;
    }
    
    public static void init() {
        if (MyCookieManager.cookieManager == null) {
            MyCookieManager.cookieManager = getCookieManager();
        }
    }
    
    public void deleteAllCookies(final o o) {
        if ((MyCookieManager.cookieManager = getCookieManager()) == null) {
            o.success((Object)Boolean.FALSE);
            return;
        }
        MyCookieManager.cookieManager.removeAllCookies((ValueCallback)new ValueCallback<Boolean>(this, o) {
            final MyCookieManager this$0;
            final o val$result;
            
            public void onReceiveValue(final Boolean b) {
                this.val$result.success((Object)b);
            }
        });
        MyCookieManager.cookieManager.flush();
    }
    
    public void deleteCookie(final String s, String s2, final String s3, String s4, final o o) {
        if ((MyCookieManager.cookieManager = getCookieManager()) == null) {
            o.success((Object)Boolean.FALSE);
            return;
        }
        s4 = (s2 = a.h(s2, "=; Path=", s4, "; Max-Age=-1"));
        if (s3 != null) {
            s2 = L.j(s4, "; Domain=", s3);
        }
        s2 = L.i(s2, ";");
        MyCookieManager.cookieManager.setCookie(s, s2, (ValueCallback)new ValueCallback<Boolean>(this, o) {
            final MyCookieManager this$0;
            final o val$result;
            
            public void onReceiveValue(final Boolean b) {
                this.val$result.success((Object)b);
            }
        });
        MyCookieManager.cookieManager.flush();
    }
    
    public void deleteCookies(final String s, final String s2, final String s3, final o o) {
        final CookieManager cookieManager = MyCookieManager.cookieManager = getCookieManager();
        if (cookieManager == null) {
            o.success((Object)Boolean.FALSE);
            return;
        }
        final String cookie = cookieManager.getCookie(s);
        if (cookie != null) {
            final String[] split = cookie.split(";");
            for (int length = split.length, i = 0; i < length; ++i) {
                String s4 = a.h(split[i].split("=", 2)[0].trim(), "=; Path=", s3, "; Max-Age=-1");
                if (s2 != null) {
                    s4 = L.j(s4, "; Domain=", s2);
                }
                MyCookieManager.cookieManager.setCookie(s, L.i(s4, ";"), (ValueCallback)null);
            }
            MyCookieManager.cookieManager.flush();
        }
        o.success((Object)Boolean.TRUE);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
    
    public List<Map<String, Object>> getCookies(String iterator) {
        final ArrayList list = new ArrayList();
        if ((MyCookieManager.cookieManager = getCookieManager()) == null) {
            return (List<Map<String, Object>>)list;
        }
        final ArrayList list2 = new ArrayList();
        String s = "GET_COOKIE_INFO";
        final boolean a = d.a("GET_COOKIE_INFO");
        String s2 = ";";
        Object o;
        if (a) {
            final CookieManager cookieManager = MyCookieManager.cookieManager;
            if (!((c)z.O).b()) {
                throw z.a();
            }
            o = ((WebViewCookieManagerBoundaryInterface)b.i((Class)WebViewCookieManagerBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)A.a.D).convertCookieManager((Object)cookieManager))).getCookieInfo((String)iterator);
        }
        else {
            final String cookie = MyCookieManager.cookieManager.getCookie((String)iterator);
            o = list2;
            if (cookie != null) {
                o = Arrays.asList((Object[])cookie.split(";"));
            }
        }
        iterator = ((List)o).iterator();
        while (((Iterator)iterator).hasNext()) {
            final String[] split = ((String)((Iterator)iterator).next()).split(s2);
            if (split.length == 0) {
                continue;
            }
            final String[] split2 = split[0].split("=", 2);
            final String trim = split2[0].trim();
            String trim2;
            if (split2.length > 1) {
                trim2 = split2[1].trim();
            }
            else {
                trim2 = "";
            }
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"name", (Object)trim);
            hashMap.put((Object)"value", (Object)trim2);
            hashMap.put((Object)"expiresDate", (Object)null);
            hashMap.put((Object)"isSessionOnly", (Object)null);
            hashMap.put((Object)"domain", (Object)null);
            hashMap.put((Object)"sameSite", (Object)null);
            hashMap.put((Object)"isSecure", (Object)null);
            hashMap.put((Object)"isHttpOnly", (Object)null);
            hashMap.put((Object)"path", (Object)null);
            Object o2 = iterator;
            String s3 = s;
            String s4 = s2;
            if (d.a(s)) {
                final Boolean false = Boolean.FALSE;
                hashMap.put((Object)"isSecure", (Object)false);
                hashMap.put((Object)"isHttpOnly", (Object)false);
                int n = 1;
                while (true) {
                    o2 = iterator;
                    s3 = s;
                    s4 = s2;
                    if (n >= split.length) {
                        break;
                    }
                    final String[] split3 = split[n].split("=", 2);
                    final String trim3 = split3[0].trim();
                    String trim4;
                    if (split3.length > 1) {
                        trim4 = split3[1].trim();
                    }
                    else {
                        trim4 = "";
                    }
                    Label_0692: {
                        if (trim3.equalsIgnoreCase("Expires")) {
                            try {
                                try {
                                    final Date parse = ((DateFormat)new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US)).parse(trim4);
                                    if (parse != null) {
                                        hashMap.put((Object)"expiresDate", (Object)parse.getTime());
                                    }
                                    break Label_0692;
                                }
                                catch (final ParseException trim4) {}
                            }
                            catch (final ParseException ex) {}
                            Log.e("MyCookieManager", "", (Throwable)trim4);
                        }
                        else if (trim3.equalsIgnoreCase("Max-Age")) {
                            try {
                                hashMap.put((Object)"expiresDate", (Object)(System.currentTimeMillis() + Long.parseLong(trim4)));
                            }
                            catch (final NumberFormatException ex2) {
                                Log.e("MyCookieManager", "", (Throwable)ex2);
                            }
                        }
                        else if (trim3.equalsIgnoreCase("Domain")) {
                            hashMap.put((Object)"domain", (Object)trim4);
                        }
                        else if (trim3.equalsIgnoreCase("SameSite")) {
                            hashMap.put((Object)"sameSite", (Object)trim4);
                        }
                        else if (trim3.equalsIgnoreCase("Secure")) {
                            hashMap.put((Object)"isSecure", (Object)Boolean.TRUE);
                        }
                        else if (trim3.equalsIgnoreCase("HttpOnly")) {
                            hashMap.put((Object)"isHttpOnly", (Object)Boolean.TRUE);
                        }
                        else if (trim3.equalsIgnoreCase("Path")) {
                            hashMap.put((Object)"path", (Object)trim4);
                        }
                    }
                    ++n;
                }
            }
            list.add((Object)hashMap);
            s = s3;
            iterator = o2;
            s2 = s4;
        }
        return (List<Map<String, Object>>)list;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        init();
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 1989049945: {
                if (!a.equals((Object)"getCookies")) {
                    break;
                }
                n = 5;
                break;
            }
            case 822411705: {
                if (!a.equals((Object)"deleteAllCookies")) {
                    break;
                }
                n = 4;
                break;
            }
            case 747417188: {
                if (!a.equals((Object)"deleteCookies")) {
                    break;
                }
                n = 3;
                break;
            }
            case 126640486: {
                if (!a.equals((Object)"setCookie")) {
                    break;
                }
                n = 2;
                break;
            }
            case -913968963: {
                if (!a.equals((Object)"removeSessionCookies")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1222815761: {
                if (!a.equals((Object)"deleteCookie")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                o.notImplemented();
                break;
            }
            case 5: {
                o.success((Object)this.getCookies((String)m.a("url")));
                break;
            }
            case 4: {
                this.deleteAllCookies(o);
                break;
            }
            case 3: {
                this.deleteCookies((String)m.a("url"), (String)m.a("domain"), (String)m.a("path"), o);
                break;
            }
            case 2: {
                final String s = (String)m.a("url");
                final String s2 = (String)m.a("name");
                final String s3 = (String)m.a("value");
                final String s4 = (String)m.a("domain");
                final String s5 = (String)m.a("path");
                final String s6 = (String)m.a("expiresDate");
                Long n2;
                if (s6 != null) {
                    n2 = new Long(s6);
                }
                else {
                    n2 = null;
                }
                this.setCookie(s, s2, s3, s4, s5, n2, (Integer)m.a("maxAge"), (Boolean)m.a("isSecure"), (Boolean)m.a("isHttpOnly"), (String)m.a("sameSite"), o);
                break;
            }
            case 1: {
                this.removeSessionCookies(o);
                break;
            }
            case 0: {
                this.deleteCookie((String)m.a("url"), (String)m.a("name"), (String)m.a("domain"), (String)m.a("path"), o);
                break;
            }
        }
    }
    
    public void removeSessionCookies(final o o) {
        if ((MyCookieManager.cookieManager = getCookieManager()) == null) {
            o.success((Object)Boolean.FALSE);
            return;
        }
        MyCookieManager.cookieManager.removeSessionCookies((ValueCallback)new ValueCallback<Boolean>(this, o) {
            final MyCookieManager this$0;
            final o val$result;
            
            public void onReceiveValue(final Boolean b) {
                this.val$result.success((Object)b);
            }
        });
        MyCookieManager.cookieManager.flush();
    }
    
    public void setCookie(final String s, String s2, String s3, final String s4, final String s5, final Long n, final Integer n2, final Boolean b, final Boolean b2, final String s6, final o o) {
        if ((MyCookieManager.cookieManager = getCookieManager()) == null) {
            o.success((Object)Boolean.FALSE);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append("=");
        sb.append(s3);
        sb.append("; Path=");
        sb.append(s5);
        s3 = (s2 = sb.toString());
        if (s4 != null) {
            s2 = L.j(s3, "; Domain=", s4);
        }
        s3 = s2;
        if (n != null) {
            final StringBuilder c = e.c(s2, "; Expires=");
            c.append(getCookieExpirationDate(n));
            s3 = c.toString();
        }
        s2 = s3;
        if (n2 != null) {
            final StringBuilder c2 = e.c(s3, "; Max-Age=");
            c2.append(n2.toString());
            s2 = c2.toString();
        }
        s3 = s2;
        if (b != null) {
            s3 = s2;
            if (b) {
                s3 = L.i(s2, "; Secure");
            }
        }
        s2 = s3;
        if (b2 != null) {
            s2 = s3;
            if (b2) {
                s2 = L.i(s3, "; HttpOnly");
            }
        }
        s3 = s2;
        if (s6 != null) {
            s3 = L.j(s2, "; SameSite=", s6);
        }
        s2 = L.i(s3, ";");
        MyCookieManager.cookieManager.setCookie(s, s2, (ValueCallback)new ValueCallback<Boolean>(this, o) {
            final MyCookieManager this$0;
            final o val$result;
            
            public void onReceiveValue(final Boolean b) {
                this.val$result.success((Object)b);
            }
        });
        MyCookieManager.cookieManager.flush();
    }
}
