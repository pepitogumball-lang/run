package J5;

import O.k0;
import android.os.BaseBundle;
import w5.a0;
import c1.g;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import java.math.BigInteger;
import java.math.BigDecimal;
import F1.G;
import com.google.android.gms.internal.ads.Np;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.D7;
import android.util.Pair;
import com.google.android.gms.internal.ads.Dk;
import F1.M0;
import O.t0;
import android.view.Display;
import O.h0;
import O.i0;
import O.j0;
import android.graphics.Rect;
import android.graphics.Point;
import K2.G0;
import android.view.WindowManager;
import java.util.concurrent.Executor;
import n3.u0;
import java.util.concurrent.CancellationException;
import g4.q;
import O2.t;
import android.os.StrictMode$ThreadPolicy;
import com.google.android.gms.internal.ads.Vb;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import java.util.concurrent.Callable;
import android.text.TextUtils;
import android.os.Bundle;
import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.lang.reflect.Field;
import android.util.Log;
import java.util.ArrayList;
import android.hardware.display.DisplayManager;
import android.view.ActionMode$Callback;
import android.view.ViewGroup;
import android.view.View;
import Z4.H;
import F4.f;
import android.graphics.Paint$FontMetricsInt;
import android.os.IBinder;
import android.os.Parcel;
import B5.e;
import w5.u;
import m5.l;
import e5.i;
import w5.v;
import m5.p;
import e5.j;
import w5.Q;
import w5.U;
import w5.C;
import X.a;
import android.text.TextDirectionHeuristic;
import T.n;
import android.text.method.PasswordTransformationMethod;
import T.m;
import android.text.TextDirectionHeuristics;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.TextView;
import T.o;
import M.c;
import o.X;
import android.os.Build$VERSION;
import n5.d;
import n5.h;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;

public abstract class b
{
    public static Activity A(final Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return A(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }
    
    public static final Class B(final s5.b b) {
        h.e("<this>", (Object)b);
        Object a = ((d)b).a();
        if (!((Class)a).isPrimitive()) {
            return (Class)a;
        }
        final String name = ((Class)a).getName();
        switch (name.hashCode()) {
            case 109413500: {
                if (!name.equals((Object)"short")) {
                    break;
                }
                a = Short.class;
                break;
            }
            case 97526364: {
                if (!name.equals((Object)"float")) {
                    break;
                }
                a = Float.class;
                break;
            }
            case 64711720: {
                if (!name.equals((Object)"boolean")) {
                    break;
                }
                a = Boolean.class;
                break;
            }
            case 3625364: {
                if (!name.equals((Object)"void")) {
                    break;
                }
                a = Void.class;
                break;
            }
            case 3327612: {
                if (!name.equals((Object)"long")) {
                    break;
                }
                a = Long.class;
                break;
            }
            case 3052374: {
                if (!name.equals((Object)"char")) {
                    break;
                }
                a = Character.class;
                break;
            }
            case 3039496: {
                if (!name.equals((Object)"byte")) {
                    break;
                }
                a = Byte.class;
                break;
            }
            case 104431: {
                if (!name.equals((Object)"int")) {
                    break;
                }
                a = Integer.class;
                break;
            }
            case -1325958191: {
                if (!name.equals((Object)"double")) {
                    break;
                }
                a = Double.class;
                break;
            }
        }
        return (Class)a;
    }
    
    public static String C(String s) {
        if (Build$VERSION.SDK_INT < 26) {
            final String s2 = s = "TRuntime.".concat(s);
            if (s2.length() > 23) {
                s = s2.substring(0, 23);
            }
            return s;
        }
        return "TRuntime.".concat(s);
    }
    
    public static c D(final X x) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return new c(o.c((TextView)x));
        }
        final TextPaint textPaint = new TextPaint((Paint)((TextView)x).getPaint());
        final TextDirectionHeuristic firststrong_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        final int a = m.a((TextView)x);
        final int d = m.d((TextView)x);
        TextDirectionHeuristic textDirectionHeuristic;
        if (((TextView)x).getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        else {
            boolean b = true;
            if (sdk_INT >= 28 && (((TextView)x).getInputType() & 0xF) == 0x3) {
                final byte directionality = Character.getDirectionality(o.b(n.a(((TextView)x).getTextLocale()))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            }
            else {
                if (((View)x).getLayoutDirection() != 1) {
                    b = false;
                }
                textDirectionHeuristic = firststrong_LTR;
                switch (((View)x).getTextDirection()) {
                    default: {
                        textDirectionHeuristic = firststrong_LTR;
                        if (b) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                    }
                    case 6: {
                        break;
                    }
                    case 7: {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    case 5: {
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    }
                    case 4: {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    }
                    case 3: {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    }
                    case 2: {
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    }
                }
            }
        }
        return new c(textPaint, textDirectionHeuristic, a, d);
    }
    
    public static Y.b E(final String s, a a, final int n) {
        if ((n & 0x2) != 0x0) {
            a = null;
        }
        final Y.a d = Y.a.D;
        Object b = C.b;
        final U u = new U((Q)null);
        ((D5.c)b).getClass();
        if (u != j.C) {
            b = ((a0)u).f(b, (p)new e5.b(1));
        }
        final e a2 = v.a((i)b);
        h.e("name", (Object)s);
        return new Y.b(s, a, (l)d, (u)a2);
    }
    
    public static boolean J(final Parcel parcel, final int n) {
        a0(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static IBinder K(final Parcel parcel, int dataPosition) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + o);
        return strongBinder;
    }
    
    public static int L(final Parcel parcel, final int n) {
        a0(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static long M(final Parcel parcel, final int n) {
        a0(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static Long N(final Parcel parcel, int o) {
        o = O(parcel, o);
        if (o == 0) {
            return null;
        }
        d0(parcel, o, 8);
        return parcel.readLong();
    }
    
    public static int O(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return (char)(n >> 16);
        }
        return parcel.readInt();
    }
    
    public static void P(final TextView textView, final int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (Build$VERSION.SDK_INT >= 28) {
            o.d(textView, n);
            return;
        }
        final Paint$FontMetricsInt fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt();
        int n2;
        if (textView.getIncludeFontPadding()) {
            n2 = fontMetricsInt.top;
        }
        else {
            n2 = fontMetricsInt.ascent;
        }
        if (n > Math.abs(n2)) {
            textView.setPadding(((View)textView).getPaddingLeft(), n + n2, ((View)textView).getPaddingRight(), ((View)textView).getPaddingBottom());
        }
    }
    
    public static void Q(final TextView textView, final int n) {
        if (n >= 0) {
            final Paint$FontMetricsInt fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt();
            int n2;
            if (textView.getIncludeFontPadding()) {
                n2 = fontMetricsInt.bottom;
            }
            else {
                n2 = fontMetricsInt.descent;
            }
            if (n > Math.abs(n2)) {
                textView.setPadding(((View)textView).getPaddingLeft(), ((View)textView).getPaddingTop(), ((View)textView).getPaddingRight(), n - n2);
            }
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void R(final f f, final Z4.m m) {
        h.e("binaryMessenger", (Object)f);
        Object c = null;
        Label_0037: {
            if (m != null) {
                final F1.n a = m.a;
                if (a != null) {
                    c = a.c();
                    break Label_0037;
                }
            }
            c = new X4.c(1);
        }
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", c, (Object)null);
        if (m != null) {
            h.u((F4.b)new H(m, 0));
        }
        else {
            h.u((F4.b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", c, (Object)null);
        if (m != null) {
            h2.u((F4.b)new H(m, 1));
        }
        else {
            h2.u((F4.b)null);
        }
        final Y0.h h3 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", c, (Object)null);
        if (m != null) {
            h3.u((F4.b)new H(m, 2));
        }
        else {
            h3.u((F4.b)null);
        }
        final Y0.h h4 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", c, (Object)null);
        if (m != null) {
            h4.u((F4.b)new H(m, 3));
        }
        else {
            h4.u((F4.b)null);
        }
        final Y0.h h5 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", c, (Object)null);
        if (m != null) {
            h5.u((F4.b)new H(m, 4));
        }
        else {
            h5.u((F4.b)null);
        }
        final Y0.h h6 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", c, (Object)null);
        if (m != null) {
            h6.u((F4.b)new H(m, 5));
        }
        else {
            h6.u((F4.b)null);
        }
    }
    
    public static void S(final Parcel parcel, int o) {
        o = O(parcel, o);
        parcel.setDataPosition(parcel.dataPosition() + o);
    }
    
    public static boolean T(final View view, final a5.c c) {
        if (view == null) {
            return false;
        }
        if (c.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                if (T(viewGroup.getChildAt(i), c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static ActionMode$Callback U(final ActionMode$Callback actionMode$Callback) {
        ActionMode$Callback a = actionMode$Callback;
        if (actionMode$Callback instanceof T.p) {
            a = actionMode$Callback;
            if (Build$VERSION.SDK_INT >= 26) {
                a = ((T.p)actionMode$Callback).a;
            }
        }
        return a;
    }
    
    public static int V(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final int o = O(parcel, int1);
        final char c = (char)int1;
        final int dataPosition = parcel.dataPosition();
        if (c != '\u4f45') {
            throw new i2.b("Expected object header. Got 0x".concat(String.valueOf((Object)Integer.toHexString(int1))), parcel);
        }
        final int n = o + dataPosition;
        if (n >= dataPosition && n <= parcel.dataSize()) {
            return n;
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(n).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(n);
        throw new i2.b(sb.toString(), parcel);
    }
    
    public static ActionMode$Callback W(final ActionMode$Callback actionMode$Callback, final TextView textView) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26 && sdk_INT <= 27 && !(actionMode$Callback instanceof T.p) && actionMode$Callback != null) {
            return (ActionMode$Callback)new T.p(actionMode$Callback, textView);
        }
        return actionMode$Callback;
    }
    
    public static ArrayList X(final DisplayManager displayManager) {
        if (Build$VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        while (true) {
        Label_0149:
            while (true) {
                ArrayList list2;
                Object next;
                Field field;
                try {
                    final Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
                    ((AccessibleObject)declaredField).setAccessible(true);
                    final Object value = declaredField.get((Object)displayManager);
                    final Field declaredField2 = value.getClass().getDeclaredField("mDisplayListeners");
                    ((AccessibleObject)declaredField2).setAccessible(true);
                    final ArrayList list = (ArrayList)declaredField2.get(value);
                    list2 = new ArrayList();
                    final Iterator iterator = list.iterator();
                    final AccessibleObject accessibleObject = null;
                    if (!iterator.hasNext()) {
                        return list2;
                    }
                    next = iterator.next();
                    if ((field = (Field)accessibleObject) == null) {
                        field = next.getClass().getField("mListener");
                        ((AccessibleObject)field).setAccessible(true);
                    }
                }
                catch (final IllegalAccessException ex) {
                    break Label_0149;
                }
                catch (final NoSuchFieldException ex) {
                    break Label_0149;
                }
                list2.add((Object)field.get(next));
                final AccessibleObject accessibleObject = (AccessibleObject)field;
                continue;
            }
            final StringBuilder sb = new StringBuilder("Could not extract WebView's display listeners. ");
            final IllegalAccessException ex;
            sb.append((Object)ex);
            Log.w("DisplayListenerProxy", sb.toString());
            return new ArrayList();
        }
    }
    
    public static int Y(Bundle bundle) {
        final Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        final String string = ((BaseBundle)bundle).getString("query_info_type");
        if (TextUtils.isEmpty((CharSequence)string)) {
            return 2;
        }
        int n = 0;
        Label_0227: {
            switch (string.hashCode()) {
                case 1743582870: {
                    if (string.equals((Object)"requester_type_8")) {
                        n = 8;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582869: {
                    if (string.equals((Object)"requester_type_7")) {
                        n = 7;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582868: {
                    if (string.equals((Object)"requester_type_6")) {
                        n = 6;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582867: {
                    if (string.equals((Object)"requester_type_5")) {
                        n = 5;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582866: {
                    if (string.equals((Object)"requester_type_4")) {
                        n = 4;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582865: {
                    if (string.equals((Object)"requester_type_3")) {
                        n = 3;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582864: {
                    if (string.equals((Object)"requester_type_2")) {
                        n = 2;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582863: {
                    if (string.equals((Object)"requester_type_1")) {
                        n = 1;
                        break Label_0227;
                    }
                    break;
                }
                case 1743582862: {
                    if (string.equals((Object)"requester_type_0")) {
                        n = 0;
                        break Label_0227;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return 2;
            }
            case 8: {
                return 10;
            }
            case 7: {
                return 9;
            }
            case 6: {
                return 8;
            }
            case 5: {
                return 7;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static Object Z(final Context context, final Callable callable) {
        Label_0050: {
            StrictMode$ThreadPolicy threadPolicy;
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder = new(android.os.StrictMode$ThreadPolicy$Builder.class)();
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder3;
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder2 = strictMode$ThreadPolicy$Builder3 = strictMode$ThreadPolicy$Builder;
                final StrictMode$ThreadPolicy strictMode$ThreadPolicy = threadPolicy;
                new StrictMode$ThreadPolicy$Builder(strictMode$ThreadPolicy);
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder4 = strictMode$ThreadPolicy$Builder2;
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder5 = strictMode$ThreadPolicy$Builder4.permitDiskReads();
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder6 = strictMode$ThreadPolicy$Builder5.permitDiskWrites();
                final StrictMode$ThreadPolicy strictMode$ThreadPolicy2 = strictMode$ThreadPolicy$Builder6.build();
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy2);
                final Callable callable2 = callable;
                final Object call = callable2.call();
                return call;
            }
            finally {
                break Label_0050;
            }
            try {
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder = new(android.os.StrictMode$ThreadPolicy$Builder.class)();
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder3;
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder2 = strictMode$ThreadPolicy$Builder3 = strictMode$ThreadPolicy$Builder;
                final StrictMode$ThreadPolicy strictMode$ThreadPolicy = threadPolicy;
                new StrictMode$ThreadPolicy$Builder(strictMode$ThreadPolicy);
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder4 = strictMode$ThreadPolicy$Builder2;
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder5 = strictMode$ThreadPolicy$Builder4.permitDiskReads();
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder6 = strictMode$ThreadPolicy$Builder5.permitDiskWrites();
                final StrictMode$ThreadPolicy strictMode$ThreadPolicy2 = strictMode$ThreadPolicy$Builder6.build();
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy2);
                final Callable callable2 = callable;
                final Object call2;
                final Object call = call2 = callable2.call();
                return call2;
            }
            finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        final Throwable t;
        J1.j.g("Unexpected exception.", t);
        Vb.a(context).b("StrictModeUtil.runWithLaxStrictMode", t);
        return null;
    }
    
    public static final Object a(final t t, final q q) {
        Object o;
        if (t.i()) {
            final Exception f = t.f();
            if (f != null) {
                throw f;
            }
            if (t.d) {
                final StringBuilder sb = new StringBuilder("Task ");
                sb.append((Object)t);
                sb.append(" was cancelled normally.");
                throw new CancellationException(sb.toString());
            }
            o = t.g();
        }
        else {
            final w5.f f2 = new w5.f(1, u0.o((e5.d)q));
            f2.u();
            t.b((Executor)F5.a.C, (O2.d)new C2.f((Object)f2, 11));
            o = f2.t();
        }
        return o;
    }
    
    public static void a0(final Parcel parcel, int length, final int n) {
        final int o = O(parcel, length);
        if (o == n) {
            return;
        }
        final String hexString = Integer.toHexString(o);
        final int length2 = String.valueOf(n).length();
        length = String.valueOf(o).length();
        final StringBuilder sb = new StringBuilder(String.valueOf((Object)hexString).length() + (length2 + 19 + length + 4) + 1);
        sb.append("Expected size ");
        sb.append(n);
        sb.append(" got ");
        sb.append(o);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new i2.b(sb.toString(), parcel);
    }
    
    public static void b(final Context context, final a5.b b) {
        final Activity a = A(context);
        if (a != null) {
            L0.n.a.getClass();
            final int b2 = L0.o.b;
            final int sdk_INT = Build$VERSION.SDK_INT;
            Rect e;
            if (sdk_INT >= 30) {
                e = G0.e(G0.i((WindowManager)((Context)a).getSystemService((Class)WindowManager.class)));
                h.d("wm.maximumWindowMetrics.bounds", (Object)e);
            }
            else {
                final Object systemService = ((Context)a).getSystemService("window");
                h.c("null cannot be cast to non-null type android.view.WindowManager", systemService);
                final Display defaultDisplay = ((WindowManager)systemService).getDefaultDisplay();
                h.d("display", (Object)defaultDisplay);
                final Point point = new Point();
                defaultDisplay.getRealSize(point);
                e = new Rect(0, 0, point.x, point.y);
            }
            t0 t0;
            if (sdk_INT >= 30) {
                if (sdk_INT < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                t0 = P0.a.a.a((Context)a);
            }
            else {
                Object o;
                if (sdk_INT >= 30) {
                    o = new j0();
                }
                else if (sdk_INT >= 29) {
                    o = new i0();
                }
                else {
                    o = new h0();
                }
                t0 = ((k0)o).b();
                h.d("{\n            WindowInse\u2026ilder().build()\n        }", (Object)t0);
            }
            final int left = e.left;
            final int top = e.top;
            final int right = e.right;
            final int bottom = e.bottom;
            if (left > right) {
                throw new IllegalArgumentException(Y3.a.k("Left must be less than or equal to right, left: ", ", right: ", left, right).toString());
            }
            if (top > bottom) {
                throw new IllegalArgumentException(Y3.a.k("top must be less than or equal to bottom, top: ", ", bottom: ", top, bottom).toString());
            }
            h.e("_windowInsetsCompat", (Object)t0);
            ((w4.c)b).a.updateDisplayMetrics(0, (float)new Rect(left, top, right, bottom).width(), (float)new Rect(left, top, right, bottom).height(), context.getResources().getDisplayMetrics().density);
        }
    }
    
    public static String b0(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "unspecified";
        }
        int n = 0;
        Label_0207: {
            switch (s.hashCode()) {
                case 1743582870: {
                    if (s.equals((Object)"requester_type_8")) {
                        n = 8;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582869: {
                    if (s.equals((Object)"requester_type_7")) {
                        n = 7;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582868: {
                    if (s.equals((Object)"requester_type_6")) {
                        n = 6;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582867: {
                    if (s.equals((Object)"requester_type_5")) {
                        n = 5;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582866: {
                    if (s.equals((Object)"requester_type_4")) {
                        n = 4;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582865: {
                    if (s.equals((Object)"requester_type_3")) {
                        n = 3;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582864: {
                    if (s.equals((Object)"requester_type_2")) {
                        n = 2;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582863: {
                    if (s.equals((Object)"requester_type_1")) {
                        n = 1;
                        break Label_0207;
                    }
                    break;
                }
                case 1743582862: {
                    if (s.equals((Object)"requester_type_0")) {
                        n = 0;
                        break Label_0207;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return s;
            }
            case 8: {
                return "8";
            }
            case 7: {
                return "7";
            }
            case 6: {
                return "6";
            }
            case 5: {
                return "5";
            }
            case 4: {
                return "4";
            }
            case 3: {
                return "3";
            }
            case 2: {
                return "2";
            }
            case 1: {
                return "1";
            }
            case 0: {
                return "0";
            }
        }
    }
    
    public static void c0(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                final StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 15);
                sb.append("negative size: ");
                sb.append(n2);
                throw new IllegalArgumentException(sb.toString());
            }
            s = a.a.A("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = a.a.A("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void d0(final Parcel parcel, final int n, final int n2) {
        if (n == n2) {
            return;
        }
        final String hexString = Integer.toHexString(n);
        final StringBuilder sb = new StringBuilder(String.valueOf((Object)hexString).length() + (String.valueOf(n2).length() + 19 + String.valueOf(n).length() + 4) + 1);
        sb.append("Expected size ");
        sb.append(n2);
        sb.append(" got ");
        sb.append(n);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new i2.b(sb.toString(), parcel);
    }
    
    public static String e0(final M0 m0) {
        if (m0 != null) {
            final Bundle e = m0.E;
            if (e != null) {
                return ((BaseBundle)e).getString("query_info_type");
            }
        }
        return "unspecified";
    }
    
    public static void f0(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = a.a.A("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = h0(n2, "end index", n3);
            }
        }
        else {
            s = h0(n, "start index", n3);
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void g0(final Dk dk, final String s, final Pair... array) {
        if (!(boolean)F1.q.d.c.a(D7.F6)) {
            return;
        }
        rd.a.execute((Runnable)new C2.v((Object)dk, s, (Object)array, 15));
    }
    
    public static String h0(final int n, final String s, final int n2) {
        if (n < 0) {
            return a.a.A("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return a.a.A("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 15);
        sb.append("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static Object i(final Class clazz, final InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return clazz.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[] { clazz }, invocationHandler));
    }
    
    public static int i0(final Np np) {
        if (np.r) {
            return 2;
        }
        final M0 d = np.d;
        final G u = d.U;
        final String z = d.Z;
        if (u == null && z == null) {
            return 1;
        }
        if (u != null && z != null) {
            return 5;
        }
        if (u != null) {
            return 3;
        }
        return 4;
    }
    
    public static void j(final String s, final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static void k(final String s, final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static BigDecimal l(final Parcel parcel, int dataPosition) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        final int int1 = parcel.readInt();
        parcel.setDataPosition(dataPosition + o);
        return new BigDecimal(new BigInteger(byteArray), int1);
    }
    
    public static Bundle m(final Parcel parcel, int dataPosition) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + o);
        return bundle;
    }
    
    public static byte[] n(final Parcel parcel, int dataPosition) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + o);
        return byteArray;
    }
    
    public static int[] o(final Parcel parcel, int dataPosition) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + o);
        return intArray;
    }
    
    public static Parcelable p(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + o);
        return parcelable;
    }
    
    public static String q(final Parcel parcel, int o) {
        o = O(parcel, o);
        final int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + o);
        return string;
    }
    
    public static String[] r(final Parcel parcel, int o) {
        o = O(parcel, o);
        final int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + o);
        return stringArray;
    }
    
    public static ArrayList s(final Parcel parcel, int dataPosition) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + o);
        return stringArrayList;
    }
    
    public static Object[] t(final Parcel parcel, int o, final Parcelable$Creator parcelable$Creator) {
        o = O(parcel, o);
        final int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(dataPosition + o);
        return typedArray;
    }
    
    public static ArrayList u(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int o = O(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(dataPosition + o);
        return typedArrayList;
    }
    
    public static void v(String c, final String s, final Object o) {
        c = C(c);
        if (Log.isLoggable(c, 3)) {
            Log.d(c, String.format(s, new Object[] { o }));
        }
    }
    
    public static void w(String c, final String s, final Exception ex) {
        c = C(c);
        if (Log.isLoggable(c, 6)) {
            Log.e(c, s, (Throwable)ex);
        }
    }
    
    public static void x(final Parcel parcel, final int n) {
        if (parcel.dataPosition() == n) {
            return;
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(n);
        throw new i2.b(sb.toString(), parcel);
    }
    
    public abstract void F(final V2.m p0, final V2.m p1);
    
    public abstract void G(final g p0, final g p1);
    
    public abstract void H(final V2.m p0, final Thread p1);
    
    public abstract void I(final g p0, final Thread p1);
    
    public abstract boolean c(final V2.n p0, final V2.d p1, final V2.d p2);
    
    public abstract boolean d(final c1.h p0, final c1.c p1, final c1.c p2);
    
    public abstract boolean e(final V2.n p0, final Object p1, final Object p2);
    
    public abstract boolean f(final c1.h p0, final Object p1, final Object p2);
    
    public abstract boolean g(final V2.n p0, final V2.m p1, final V2.m p2);
    
    public abstract boolean h(final c1.h p0, final g p1, final g p2);
    
    public abstract V2.d y(final V2.n p0);
    
    public abstract V2.m z(final V2.n p0);
}
