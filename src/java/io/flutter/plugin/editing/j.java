package io.flutter.plugin.editing;

import L3.A;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Arrays;
import java.io.Serializable;
import org.json.JSONException;
import android.util.Log;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import android.text.Spannable;
import android.view.inputmethod.BaseInputConnection;
import android.text.Selection;
import F4.o;
import X4.C;
import X.a;
import android.view.View;
import M.b;
import android.os.Build$VERSION;
import E4.p;
import android.graphics.Rect;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import android.view.inputmethod.InputConnection;
import android.util.SparseArray;
import E4.n;
import com.google.android.gms.internal.ads.g0;
import com.google.android.gms.internal.measurement.K1;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import v4.l;

public final class j implements e
{
    public final l a;
    public final InputMethodManager b;
    public final AutofillManager c;
    public final K1 d;
    public g0 e;
    public n f;
    public SparseArray g;
    public f h;
    public boolean i;
    public InputConnection j;
    public final r k;
    public final q l;
    public Rect m;
    public final ImeSyncDeferringInsetsCallback n;
    public p o;
    public boolean p;
    
    public j(final l a, final K1 d, final C2.f f, final r k, final q l) {
        this.e = new g0(1, 0, 6);
        this.a = a;
        this.h = new f(null, a);
        this.b = (InputMethodManager)((View)a).getContext().getSystemService("input_method");
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            this.c = M.b.l(((View)a).getContext().getSystemService(M.b.o()));
        }
        else {
            this.c = null;
        }
        if (sdk_INT >= 30) {
            final ImeSyncDeferringInsetsCallback n = new ImeSyncDeferringInsetsCallback((View)a);
            (this.n = n).install();
            n.setImeVisibilityListener((io.flutter.plugin.editing.a)new a((Object)this, 9));
        }
        this.d = d;
        d.E = new C((Object)this, 9);
        ((F4.p)d.D).a("TextInputClient.requestExistingInputState", (Object)null, (o)null);
        this.k = k;
        k.I = this;
        this.l = l;
        l.H = this;
    }
    
    @Override
    public final void a(final boolean b) {
        if (b) {
            final String string = this.h.toString();
            if (Build$VERSION.SDK_INT >= 26) {
                final AutofillManager c = this.c;
                if (c != null && this.g != null) {
                    io.flutter.plugin.editing.i.q(c, this.a, ((String)this.f.j.D).hashCode(), io.flutter.plugin.editing.i.e(string));
                }
            }
        }
        final f h = this.h;
        h.getClass();
        final int selectionStart = Selection.getSelectionStart((CharSequence)h);
        final f h2 = this.h;
        h2.getClass();
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)h2);
        final f h3 = this.h;
        h3.getClass();
        final int composingSpanStart = BaseInputConnection.getComposingSpanStart((Spannable)h3);
        final f h4 = this.h;
        h4.getClass();
        final int composingSpanEnd = BaseInputConnection.getComposingSpanEnd((Spannable)h4);
        final f h5 = this.h;
        h5.getClass();
        final ArrayList g = h5.G;
        final ArrayList list = new ArrayList((Collection)g);
        g.clear();
        Label_0695: {
            if (this.o != null) {
                if (this.h.toString().equals((Object)this.o.a)) {
                    final p o = this.o;
                    if (selectionStart == o.b && selectionEnd == o.c && composingSpanStart == o.d && composingSpanEnd == o.e) {
                        break Label_0695;
                    }
                }
                this.h.toString();
                final boolean e = this.f.e;
                final K1 d = this.d;
                if (e) {
                    final int c2 = this.e.c;
                    d.getClass();
                    list.size();
                    final HashMap hashMap = new HashMap();
                    final JSONArray jsonArray = new JSONArray();
                    for (final h h6 : list) {
                        h6.getClass();
                        final JSONObject jsonObject = new JSONObject();
                        try {
                            jsonObject.put("oldText", (Object)h6.a.toString());
                            jsonObject.put("deltaText", (Object)h6.b.toString());
                            jsonObject.put("deltaStart", h6.c);
                            jsonObject.put("deltaEnd", h6.d);
                            jsonObject.put("selectionBase", h6.e);
                            jsonObject.put("selectionExtent", h6.f);
                            jsonObject.put("composingBase", h6.g);
                            jsonObject.put("composingExtent", h6.h);
                        }
                        catch (final JSONException ex) {
                            final StringBuilder sb = new StringBuilder("unable to create JSONObject: ");
                            sb.append((Object)ex);
                            Log.e("TextEditingDelta", sb.toString());
                        }
                        jsonArray.put((Object)jsonObject);
                    }
                    hashMap.put((Object)"deltas", (Object)jsonArray);
                    ((F4.p)d.D).a("TextInputClient.updateEditingStateWithDeltas", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)c2, (Serializable)hashMap }), (o)null);
                    this.h.G.clear();
                }
                else {
                    final int c3 = this.e.c;
                    final String string2 = this.h.toString();
                    d.getClass();
                    ((F4.p)d.D).a("TextInputClient.updateEditingState", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)c3, (Serializable)K1.f(string2, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd) }), (o)null);
                }
                this.o = new p(this.h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
                return;
            }
        }
        this.h.G.clear();
    }
    
    public final void b(final int n) {
        final g0 e = this.e;
        final int b = e.b;
        if ((b == 3 || b == 4) && e.c == n) {
            this.e = new g0(1, 0, 6);
            this.d();
            final l a = this.a;
            final IBinder applicationWindowToken = ((View)a).getApplicationWindowToken();
            final InputMethodManager b2 = this.b;
            b2.hideSoftInputFromWindow(applicationWindowToken, 0);
            b2.restartInput((View)a);
            this.i = false;
        }
    }
    
    public final void c() {
        this.k.I = null;
        this.l.H = null;
        this.d.E = null;
        this.d();
        this.h.e(this);
        final ImeSyncDeferringInsetsCallback n = this.n;
        if (n != null) {
            n.remove();
        }
    }
    
    public final void d() {
        if (Build$VERSION.SDK_INT >= 26) {
            final AutofillManager c = this.c;
            if (c != null) {
                final n f = this.f;
                if (f != null) {
                    final A j = f.j;
                    if (j != null && this.g != null) {
                        M.b.x(c, this.a, ((String)j.D).hashCode());
                    }
                }
            }
        }
    }
    
    public final void e(final n n) {
        if (Build$VERSION.SDK_INT < 26) {
            return;
        }
        if (n != null) {
            final A j = n.j;
            if (j != null) {
                final SparseArray g = new SparseArray();
                this.g = g;
                final n[] l = n.l;
                if (l == null) {
                    g.put(((String)j.D).hashCode(), (Object)n);
                }
                else {
                    for (final n n2 : l) {
                        final A k = n2.j;
                        if (k != null) {
                            final SparseArray g2 = this.g;
                            final String s = (String)k.D;
                            g2.put(s.hashCode(), (Object)n2);
                            io.flutter.plugin.editing.i.q(this.c, this.a, s.hashCode(), io.flutter.plugin.editing.i.e(((p)k.F).a));
                        }
                    }
                }
                return;
            }
        }
        this.g = null;
    }
}
