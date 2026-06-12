package F0;

import android.content.res.Resources$NotFoundException;
import android.util.Log;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.FileInputStream;
import android.webkit.WebResourceResponse;
import java.io.IOException;
import java.io.File;
import G0.E;
import android.content.Context;

public final class r implements s
{
    public static final String[] E;
    public final int C;
    public final Object D;
    
    static {
        E = new String[] { "app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/" };
    }
    
    public r(final Context context, final int c) {
        switch (this.C = c) {
            default: {
                this.D = new E((Object)context, 1);
                return;
            }
            case 1: {
                this.D = new E((Object)context, 1);
            }
        }
    }
    
    public r(final Context context, final File file) {
        this.C = 2;
        try {
            this.D = new File(G0.E.b(file));
            if (this.a(context)) {
                return;
            }
            final StringBuilder sb = new StringBuilder("The given directory \"");
            sb.append((Object)file);
            sb.append("\" doesn't exist under an allowed app internal storage directory");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (final IOException ex) {
            final StringBuilder sb2 = new StringBuilder("Failed to resolve the canonical path for the given directory: ");
            sb2.append(file.getPath());
            throw new IllegalArgumentException(sb2.toString(), (Throwable)ex);
        }
    }
    
    public boolean a(final Context context) {
        final String b = G0.E.b((File)this.D);
        final String b2 = G0.E.b(context.getCacheDir());
        final String b3 = G0.E.b(context.getDataDir());
        if (!b.startsWith(b2) && !b.startsWith(b3)) {
            return false;
        }
        if (!b.equals((Object)b2) && !b.equals((Object)b3)) {
            final String[] e = r.E;
            for (int i = 0; i < 5; ++i) {
                final String s = e[i];
                final StringBuilder sb = new StringBuilder();
                sb.append(b3);
                sb.append(s);
                if (b.startsWith(sb.toString())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final WebResourceResponse handle(String s) {
        switch (this.C) {
            default: {
                final File file = (File)this.D;
                Label_0177: {
                    try {
                        final String b = G0.E.b(file);
                        final String canonicalPath = new File(file, s).getCanonicalPath();
                        File file2;
                        if (canonicalPath.startsWith(b)) {
                            file2 = new File(canonicalPath);
                        }
                        else {
                            file2 = null;
                        }
                        if (file2 != null) {
                            Object o;
                            final FileInputStream fileInputStream = (FileInputStream)(o = new FileInputStream(file2));
                            if (file2.getPath().endsWith(".svgz")) {
                                o = new GZIPInputStream((InputStream)fileInputStream);
                            }
                            s = (String)new WebResourceResponse(G0.E.h(s), (String)null, (InputStream)o);
                            return (WebResourceResponse)s;
                        }
                    }
                    catch (final IOException ex) {
                        break Label_0177;
                    }
                    Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", new Object[] { s, file }));
                    return new WebResourceResponse((String)null, (String)null, (InputStream)null);
                }
                final StringBuilder sb = new StringBuilder("Error opening the requested path: ");
                sb.append(s);
                final IOException ex;
                Log.e("WebViewAssetLoader", sb.toString(), (Throwable)ex);
                s = (String)new WebResourceResponse((String)null, (String)null, (InputStream)null);
                return (WebResourceResponse)s;
            }
            case 1: {
                Label_0290: {
                    try {
                        s = (String)new WebResourceResponse(G0.E.h(s), (String)null, ((E)this.D).j(s));
                        return (WebResourceResponse)s;
                    }
                    catch (final IOException ex2) {}
                    catch (final Resources$NotFoundException ex3) {
                        break Label_0290;
                    }
                    final StringBuilder sb2 = new StringBuilder("Error opening resource from the path: ");
                    sb2.append(s);
                    final IOException ex2;
                    Log.e("WebViewAssetLoader", sb2.toString(), (Throwable)ex2);
                    return new WebResourceResponse((String)null, (String)null, (InputStream)null);
                }
                final StringBuilder sb3 = new StringBuilder("Resource not found from the path: ");
                sb3.append(s);
                final Resources$NotFoundException ex3;
                Log.e("WebViewAssetLoader", sb3.toString(), (Throwable)ex3);
                s = (String)new WebResourceResponse((String)null, (String)null, (InputStream)null);
                return (WebResourceResponse)s;
            }
            case 0: {
                try {
                    final E e = (E)this.D;
                    String substring;
                    if (s.length() > 1 && s.charAt(0) == '/') {
                        substring = s.substring(1);
                    }
                    else {
                        substring = s;
                    }
                    Object open;
                    final InputStream inputStream = (InputStream)(open = ((Context)e.D).getAssets().open(substring, 2));
                    if (substring.endsWith(".svgz")) {
                        open = new GZIPInputStream(inputStream);
                    }
                    s = (String)new WebResourceResponse(G0.E.h(s), (String)null, (InputStream)open);
                }
                catch (final IOException ex4) {
                    final StringBuilder sb4 = new StringBuilder("Error opening asset path: ");
                    sb4.append(s);
                    Log.e("WebViewAssetLoader", sb4.toString(), (Throwable)ex4);
                    s = (String)new WebResourceResponse((String)null, (String)null, (InputStream)null);
                }
                return (WebResourceResponse)s;
            }
        }
    }
}
