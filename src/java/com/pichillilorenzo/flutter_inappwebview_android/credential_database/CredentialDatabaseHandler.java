package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.Context;
import java.util.Iterator;
import android.webkit.WebViewDatabase;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class CredentialDatabaseHandler extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "CredentialDatabaseHandler";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
    public static CredentialDatabase credentialDatabase;
    public InAppWebViewFlutterPlugin plugin;
    
    public CredentialDatabaseHandler(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_credential_database"));
        this.plugin = plugin;
    }
    
    public static void init(final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (CredentialDatabaseHandler.credentialDatabase == null) {
            CredentialDatabaseHandler.credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.plugin = null;
        CredentialDatabaseHandler.credentialDatabase = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            init(plugin);
        }
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 1930845769: {
                if (!a.equals((Object)"getAllAuthCredentials")) {
                    break;
                }
                n = 5;
                break;
            }
            case 1084504936: {
                if (!a.equals((Object)"removeHttpAuthCredentials")) {
                    break;
                }
                n = 4;
                break;
            }
            case 998955721: {
                if (!a.equals((Object)"setHttpAuthCredential")) {
                    break;
                }
                n = 3;
                break;
            }
            case 589173355: {
                if (!a.equals((Object)"removeHttpAuthCredential")) {
                    break;
                }
                n = 2;
                break;
            }
            case -410271914: {
                if (!a.equals((Object)"getHttpAuthCredentials")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1851697792: {
                if (!a.equals((Object)"clearAllAuthCredentials")) {
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
                final ArrayList list = new ArrayList();
                final CredentialDatabase credentialDatabase = CredentialDatabaseHandler.credentialDatabase;
                if (credentialDatabase != null) {
                    for (final URLProtectionSpace urlProtectionSpace : credentialDatabase.protectionSpaceDao.getAll()) {
                        final ArrayList list2 = new ArrayList();
                        final Iterator iterator2 = CredentialDatabaseHandler.credentialDatabase.credentialDao.getAllByProtectionSpaceId(urlProtectionSpace.getId()).iterator();
                        while (iterator2.hasNext()) {
                            list2.add((Object)((URLCredential)iterator2.next()).toMap());
                        }
                        final HashMap hashMap = new HashMap();
                        hashMap.put((Object)"protectionSpace", (Object)urlProtectionSpace.toMap());
                        hashMap.put((Object)"credentials", (Object)list2);
                        list.add((Object)hashMap);
                    }
                }
                o.success((Object)list);
                break;
            }
            case 4: {
                if (CredentialDatabaseHandler.credentialDatabase != null) {
                    CredentialDatabaseHandler.credentialDatabase.removeHttpAuthCredentials((String)m.a("host"), (String)m.a("protocol"), (String)m.a("realm"), (Integer)m.a("port"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 3: {
                if (CredentialDatabaseHandler.credentialDatabase != null) {
                    CredentialDatabaseHandler.credentialDatabase.setHttpAuthCredential((String)m.a("host"), (String)m.a("protocol"), (String)m.a("realm"), (Integer)m.a("port"), (String)m.a("username"), (String)m.a("password"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 2: {
                if (CredentialDatabaseHandler.credentialDatabase != null) {
                    CredentialDatabaseHandler.credentialDatabase.removeHttpAuthCredential((String)m.a("host"), (String)m.a("protocol"), (String)m.a("realm"), (Integer)m.a("port"), (String)m.a("username"), (String)m.a("password"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 1: {
                final ArrayList list3 = new ArrayList();
                if (CredentialDatabaseHandler.credentialDatabase != null) {
                    final Iterator iterator3 = CredentialDatabaseHandler.credentialDatabase.getHttpAuthCredentials((String)m.a("host"), (String)m.a("protocol"), (String)m.a("realm"), (Integer)m.a("port")).iterator();
                    while (iterator3.hasNext()) {
                        list3.add((Object)((URLCredential)iterator3.next()).toMap());
                    }
                }
                o.success((Object)list3);
                break;
            }
            case 0: {
                final CredentialDatabase credentialDatabase2 = CredentialDatabaseHandler.credentialDatabase;
                if (credentialDatabase2 != null) {
                    credentialDatabase2.clearAllAuthCredentials();
                    final InAppWebViewFlutterPlugin plugin2 = this.plugin;
                    if (plugin2 != null) {
                        final Context applicationContext = plugin2.applicationContext;
                        if (applicationContext != null) {
                            WebViewDatabase.getInstance(applicationContext).clearHttpAuthUsernamePassword();
                        }
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
        }
    }
}
