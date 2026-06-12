package m;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.view.InflateException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import n.l;
import android.view.SubMenu;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import o.l0;
import android.util.Log;
import n.o;
import i.a;
import android.view.Menu;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.view.MenuInflater;

public final class j extends MenuInflater
{
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;
    
    static {
        f = (e = new Class[] { Context.class });
    }
    
    public j(final Context c) {
        super(c);
        this.c = c;
        final Object[] array = { c };
        this.a = array;
        this.b = array;
    }
    
    public static Object a(final Context context) {
        if (context instanceof Activity) {
            return context;
        }
        Object a = context;
        if (context instanceof ContextWrapper) {
            a = a(((ContextWrapper)context).getBaseContext());
        }
        return a;
    }
    
    public final void b(final XmlResourceParser xmlResourceParser, final AttributeSet set, final Menu menu) {
        final i i = new i(this, menu);
        int n = ((XmlPullParser)xmlResourceParser).getEventType();
        int n2;
        while (true) {
            n2 = 1;
            if (n == 2) {
                final String name = ((XmlPullParser)xmlResourceParser).getName();
                if (name.equals((Object)"menu")) {
                    n = ((XmlPullParser)xmlResourceParser).next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got ".concat(name));
            }
            else {
                n = ((XmlPullParser)xmlResourceParser).next();
                if (n == 1) {
                    break;
                }
                continue;
            }
        }
        int j = 0;
        int n3 = 0;
        Object o = null;
        int next = n;
        while (j == 0) {
            if (next == n2) {
                throw new RuntimeException("Unexpected end of document");
            }
            int n4 = 0;
            Label_1221: {
                if (next != 2) {
                    if (next == 3) {
                        final String name2 = ((XmlPullParser)xmlResourceParser).getName();
                        if (n3 != 0 && name2.equals(o)) {
                            n4 = 0;
                            o = null;
                            break Label_1221;
                        }
                        if (name2.equals((Object)"group")) {
                            i.b = 0;
                            i.c = 0;
                            i.d = 0;
                            i.e = 0;
                            i.f = (n2 != 0);
                            i.g = (n2 != 0);
                        }
                        else if (name2.equals((Object)"item")) {
                            if (!i.h) {
                                final o z = i.z;
                                if (z != null && z.a.hasSubMenu()) {
                                    i.h = (n2 != 0);
                                    i.b(i.a.addSubMenu(i.b, i.i, i.j, i.k).getItem());
                                }
                                else {
                                    i.h = (n2 != 0);
                                    i.b(i.a.add(i.b, i.i, i.j, i.k));
                                }
                            }
                        }
                        else if (name2.equals((Object)"menu")) {
                            j = n2;
                        }
                    }
                }
                else if (n3 == 0) {
                    final String name3 = ((XmlPullParser)xmlResourceParser).getName();
                    final boolean equals = name3.equals((Object)"group");
                    final j e = i.E;
                    if (equals) {
                        final TypedArray obtainStyledAttributes = e.c.obtainStyledAttributes(set, i.a.p);
                        i.b = obtainStyledAttributes.getResourceId(n2, 0);
                        i.c = obtainStyledAttributes.getInt(3, 0);
                        i.d = obtainStyledAttributes.getInt(4, 0);
                        i.e = obtainStyledAttributes.getInt(5, 0);
                        i.f = obtainStyledAttributes.getBoolean(2, (boolean)(n2 != 0));
                        i.g = obtainStyledAttributes.getBoolean(0, (boolean)(n2 != 0));
                        obtainStyledAttributes.recycle();
                    }
                    else {
                        if (name3.equals((Object)"item")) {
                            final Context c = e.c;
                            final TypedArray obtainStyledAttributes2 = c.obtainStyledAttributes(set, i.a.q);
                            i.i = obtainStyledAttributes2.getResourceId(2, 0);
                            i.j = ((obtainStyledAttributes2.getInt(5, i.c) & 0xFFFF0000) | (obtainStyledAttributes2.getInt(6, i.d) & 0xFFFF));
                            i.k = obtainStyledAttributes2.getText(7);
                            i.l = obtainStyledAttributes2.getText(8);
                            i.m = obtainStyledAttributes2.getResourceId(0, 0);
                            final String string = obtainStyledAttributes2.getString(9);
                            char char1;
                            if (string == null) {
                                char1 = '\0';
                            }
                            else {
                                char1 = string.charAt(0);
                            }
                            i.n = char1;
                            i.o = obtainStyledAttributes2.getInt(16, 4096);
                            final String string2 = obtainStyledAttributes2.getString(10);
                            char char2;
                            if (string2 == null) {
                                char2 = '\0';
                            }
                            else {
                                char2 = string2.charAt(0);
                            }
                            i.p = char2;
                            i.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                i.r = (obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0);
                            }
                            else {
                                i.r = i.e;
                            }
                            i.s = obtainStyledAttributes2.getBoolean(3, false);
                            i.t = obtainStyledAttributes2.getBoolean(4, i.f);
                            i.u = obtainStyledAttributes2.getBoolean(1, i.g);
                            i.v = obtainStyledAttributes2.getInt(21, -1);
                            i.y = obtainStyledAttributes2.getString(12);
                            i.w = obtainStyledAttributes2.getResourceId(13, 0);
                            i.x = obtainStyledAttributes2.getString(15);
                            final String string3 = obtainStyledAttributes2.getString(14);
                            final boolean b = string3 != null;
                            if (b && i.w == 0 && i.x == null) {
                                i.z = (o)i.a(string3, m.j.f, e.b);
                            }
                            else {
                                if (b) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                i.z = null;
                            }
                            i.A = obtainStyledAttributes2.getText(17);
                            i.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                i.D = l0.c(obtainStyledAttributes2.getInt(19, -1), i.D);
                            }
                            else {
                                i.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                ColorStateList c2 = null;
                                Label_1081: {
                                    if (obtainStyledAttributes2.hasValue(18)) {
                                        final int resourceId = obtainStyledAttributes2.getResourceId(18, 0);
                                        if (resourceId != 0) {
                                            c2 = s2.a.e(c, resourceId);
                                            if (c2 != null) {
                                                break Label_1081;
                                            }
                                        }
                                    }
                                    c2 = obtainStyledAttributes2.getColorStateList(18);
                                }
                                i.C = c2;
                            }
                            else {
                                i.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            i.h = false;
                            n2 = 1;
                            n4 = n3;
                            break Label_1221;
                        }
                        if (name3.equals((Object)"menu")) {
                            n2 = 1;
                            i.h = true;
                            final SubMenu addSubMenu = i.a.addSubMenu(i.b, i.i, i.j, i.k);
                            i.b(addSubMenu.getItem());
                            this.b(xmlResourceParser, set, (Menu)addSubMenu);
                            n4 = n3;
                            break Label_1221;
                        }
                        n2 = 1;
                        o = name3;
                        n4 = 1;
                        break Label_1221;
                    }
                }
                n4 = n3;
            }
            next = ((XmlPullParser)xmlResourceParser).next();
            n3 = n4;
        }
    }
    
    public final void inflate(final int n, final Menu menu) {
        if (!(menu instanceof l)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser2;
                final XmlResourceParser xmlResourceParser = xmlResourceParser2 = (layout = this.c.getResources().getLayout(n));
                this.b(xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), menu);
                xmlResourceParser.close();
            }
            finally {
                if (layout != null) {
                    layout.close();
                }
                final Throwable t;
                throw new InflateException("Error inflating menu XML", t);
            }
        }
        catch (final IOException ex) {}
        catch (final XmlPullParserException ex2) {}
    }
}
