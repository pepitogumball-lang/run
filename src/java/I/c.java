package I;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.graphics.Bitmap;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.net.Uri;

public abstract class c
{
    public static Uri a(final Object o) {
        if (Build$VERSION.SDK_INT >= 28) {
            return e.d(o);
        }
        Label_0068: {
            Label_0057: {
                try {
                    return (Uri)o.getClass().getMethod("getUri", (Class<?>[])null).invoke(o, (Object[])null);
                }
                catch (final NoSuchMethodException ex) {}
                catch (final InvocationTargetException ex2) {
                    break Label_0057;
                }
                catch (final IllegalAccessException ex3) {
                    break Label_0068;
                }
                final NoSuchMethodException ex;
                Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex);
                return null;
            }
            final InvocationTargetException ex2;
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex2);
            return null;
        }
        final IllegalAccessException ex3;
        Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex3);
        return null;
    }
    
    public static Drawable b(final Icon icon, final Context context) {
        return icon.loadDrawable(context);
    }
    
    public static Icon c(final IconCompat iconCompat, final Context context) {
        final int a = iconCompat.a;
        final String s = null;
        final InputStream inputStream = null;
        Icon icon = null;
        switch (a) {
            default: {
                throw new IllegalArgumentException("Unknown type");
            }
            case 6: {
                if (Build$VERSION.SDK_INT >= 30) {
                    icon = f.a(iconCompat.e());
                    break;
                }
                if (context == null) {
                    final StringBuilder sb = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                    sb.append((Object)iconCompat.e());
                    throw new IllegalArgumentException(sb.toString());
                }
                final Uri e = iconCompat.e();
                final String scheme = e.getScheme();
                Object openInputStream = null;
                Label_0238: {
                    if (!"content".equals((Object)scheme)) {
                        if (!"file".equals((Object)scheme)) {
                            try {
                                openInputStream = new FileInputStream(new File((String)iconCompat.b));
                            }
                            catch (final FileNotFoundException ex) {
                                final StringBuilder sb2 = new StringBuilder("Unable to load image from path: ");
                                sb2.append((Object)e);
                                Log.w("IconCompat", sb2.toString(), (Throwable)ex);
                                openInputStream = inputStream;
                            }
                            break Label_0238;
                        }
                    }
                    try {
                        openInputStream = context.getContentResolver().openInputStream(e);
                    }
                    catch (final Exception ex2) {
                        final StringBuilder sb3 = new StringBuilder("Unable to load image from URI: ");
                        sb3.append((Object)e);
                        Log.w("IconCompat", sb3.toString(), (Throwable)ex2);
                        openInputStream = inputStream;
                    }
                }
                if (openInputStream == null) {
                    final StringBuilder sb4 = new StringBuilder("Cannot load adaptive icon from uri: ");
                    sb4.append((Object)iconCompat.e());
                    throw new IllegalStateException(sb4.toString());
                }
                if (Build$VERSION.SDK_INT >= 26) {
                    icon = d.b(BitmapFactory.decodeStream((InputStream)openInputStream));
                    break;
                }
                icon = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream((InputStream)openInputStream), false));
                break;
            }
            case 5: {
                if (Build$VERSION.SDK_INT >= 26) {
                    icon = d.b((Bitmap)iconCompat.b);
                    break;
                }
                icon = Icon.createWithBitmap(IconCompat.a((Bitmap)iconCompat.b, false));
                break;
            }
            case 4: {
                icon = Icon.createWithContentUri((String)iconCompat.b);
                break;
            }
            case 3: {
                icon = Icon.createWithData((byte[])iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            }
            case 2: {
                String s2 = null;
                Label_0569: {
                    if (a == -1) {
                        final int sdk_INT = Build$VERSION.SDK_INT;
                        final Object b = iconCompat.b;
                        if (sdk_INT >= 28) {
                            s2 = e.b(b);
                        }
                        else {
                            Label_0506: {
                                Label_0491: {
                                    try {
                                        s2 = (String)b.getClass().getMethod("getResPackage", (Class<?>[])null).invoke(b, (Object[])null);
                                        break Label_0569;
                                    }
                                    catch (final NoSuchMethodException ex3) {}
                                    catch (final InvocationTargetException ex4) {
                                        break Label_0491;
                                    }
                                    catch (final IllegalAccessException ex5) {
                                        break Label_0506;
                                    }
                                    final NoSuchMethodException ex3;
                                    Log.e("IconCompat", "Unable to get icon package", (Throwable)ex3);
                                    s2 = s;
                                    break Label_0569;
                                }
                                final InvocationTargetException ex4;
                                Log.e("IconCompat", "Unable to get icon package", (Throwable)ex4);
                                s2 = s;
                                break Label_0569;
                            }
                            final IllegalAccessException ex5;
                            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex5);
                            s2 = s;
                        }
                    }
                    else {
                        if (a != 2) {
                            final StringBuilder sb5 = new StringBuilder("called getResPackage() on ");
                            sb5.append((Object)iconCompat);
                            throw new IllegalStateException(sb5.toString());
                        }
                        final String j = iconCompat.j;
                        if (j != null && !TextUtils.isEmpty((CharSequence)j)) {
                            s2 = iconCompat.j;
                        }
                        else {
                            s2 = ((String)iconCompat.b).split(":", -1)[0];
                        }
                    }
                }
                icon = Icon.createWithResource(s2, iconCompat.e);
                break;
            }
            case 1: {
                icon = Icon.createWithBitmap((Bitmap)iconCompat.b);
                break;
            }
            case -1: {
                return (Icon)iconCompat.b;
            }
        }
        final ColorStateList g = iconCompat.g;
        if (g != null) {
            icon.setTintList(g);
        }
        final PorterDuff$Mode h = iconCompat.h;
        if (h != IconCompat.k) {
            icon.setTintMode(h);
        }
        return icon;
    }
}
