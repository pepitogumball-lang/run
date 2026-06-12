package A;

import v.e;
import android.content.res.TypedArray;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import java.util.HashMap;
import android.content.res.XmlResourceParser;
import android.content.Context;

public final class b
{
    public boolean a;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;
    
    public b(final b b, final Object o) {
        this.a = false;
        b.getClass();
        this.b = b.b;
        this.b(o);
    }
    
    public static void a(final Context context, final XmlResourceParser xmlResourceParser, final HashMap hashMap) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)xmlResourceParser), s.d);
        final int indexCount = obtainStyledAttributes.getIndexCount();
        String s = null;
        int i = 0;
        boolean a;
        int b = (a = false) ? 1 : 0;
        Object o = null;
        while (i < indexCount) {
            final int index = obtainStyledAttributes.getIndex(i);
            int n = 1;
            String s3 = null;
            Object o2 = null;
            boolean b2 = false;
            Label_0498: {
                if (index == 0) {
                    final String s2 = s3 = obtainStyledAttributes.getString(index);
                    o2 = o;
                    n = b;
                    b2 = a;
                    if (s2 != null) {
                        s3 = s2;
                        o2 = o;
                        n = b;
                        b2 = a;
                        if (s2.length() > 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(Character.toUpperCase(s2.charAt(0)));
                            sb.append(s2.substring(1));
                            s3 = sb.toString();
                            o2 = o;
                            n = b;
                            b2 = a;
                        }
                    }
                }
                else if (index == 10) {
                    s3 = obtainStyledAttributes.getString(index);
                    b2 = true;
                    o2 = o;
                    n = b;
                }
                else if (index == 1) {
                    o2 = obtainStyledAttributes.getBoolean(index, false);
                    n = 6;
                    s3 = s;
                    b2 = a;
                }
                else {
                    final int n2 = 3;
                    Label_0245: {
                        if (index == 3) {
                            o2 = obtainStyledAttributes.getColor(index, 0);
                            n = n2;
                        }
                        else {
                            final int n3 = 4;
                            if (index != 2) {
                                if (index == 7) {
                                    o2 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                                }
                                else if (index == 4) {
                                    o2 = obtainStyledAttributes.getDimension(index, 0.0f);
                                }
                                else {
                                    final int n4 = 5;
                                    if (index == 5) {
                                        o2 = obtainStyledAttributes.getFloat(index, Float.NaN);
                                        n = 2;
                                        s3 = s;
                                        b2 = a;
                                        break Label_0498;
                                    }
                                    if (index == 6) {
                                        o2 = obtainStyledAttributes.getInteger(index, -1);
                                    }
                                    else {
                                        if (index == 9) {
                                            o2 = obtainStyledAttributes.getString(index);
                                            n = n4;
                                            break Label_0245;
                                        }
                                        final int n5 = 8;
                                        s3 = s;
                                        o2 = o;
                                        n = b;
                                        b2 = a;
                                        if (index != 8) {
                                            break Label_0498;
                                        }
                                        int n6;
                                        if ((n6 = obtainStyledAttributes.getResourceId(index, -1)) == -1) {
                                            n6 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        o2 = n6;
                                        n = n5;
                                    }
                                    s3 = s;
                                    b2 = a;
                                    break Label_0498;
                                }
                                n = 7;
                                s3 = s;
                                b2 = a;
                                break Label_0498;
                            }
                            o2 = obtainStyledAttributes.getColor(index, 0);
                            n = n3;
                        }
                    }
                    s3 = s;
                    b2 = a;
                }
            }
            ++i;
            s = s3;
            o = o2;
            b = n;
            a = b2;
        }
        if (s != null && o != null) {
            final Object o3 = new Object();
            ((b)o3).b = b;
            ((b)o3).a = a;
            ((b)o3).b(o);
            hashMap.put((Object)s, o3);
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void b(final Object o) {
        switch (v.e.d(this.b)) {
            case 6: {
                this.d = (float)o;
                break;
            }
            case 5: {
                this.f = (boolean)o;
                break;
            }
            case 4: {
                this.e = (String)o;
                break;
            }
            case 2:
            case 3: {
                this.g = (int)o;
                break;
            }
            case 1: {
                this.d = (float)o;
                break;
            }
            case 0:
            case 7: {
                this.c = (int)o;
                break;
            }
        }
    }
}
