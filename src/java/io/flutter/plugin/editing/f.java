package io.flutter.plugin.editing;

import android.text.Editable;
import java.util.Iterator;
import java.util.Collection;
import android.text.Spannable;
import android.view.inputmethod.BaseInputConnection;
import android.text.Selection;
import android.util.Log;
import v4.l;
import E4.p;
import java.util.ArrayList;
import android.text.SpannableStringBuilder;

public final class f extends SpannableStringBuilder
{
    public int C;
    public int D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public String H;
    public String I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final d N;
    
    public f(final p p2, final l l) {
        this.C = 0;
        this.D = 0;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.N = new d(l, this);
        if (p2 != null) {
            this.f(p2);
        }
    }
    
    public final void a(final e e) {
        if (this.D > 0) {
            final StringBuilder sb = new StringBuilder("adding a listener ");
            sb.append(e.toString());
            sb.append(" in a listener callback");
            Log.e("ListenableEditingState", sb.toString());
        }
        if (this.C > 0) {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.F.add((Object)e);
        }
        else {
            this.E.add((Object)e);
        }
    }
    
    public final void b() {
        ++this.C;
        if (this.D > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.C == 1 && !this.E.isEmpty()) {
            this.I = this.toString();
            this.J = Selection.getSelectionStart((CharSequence)this);
            this.K = Selection.getSelectionEnd((CharSequence)this);
            this.L = BaseInputConnection.getComposingSpanStart((Spannable)this);
            this.M = BaseInputConnection.getComposingSpanEnd((Spannable)this);
        }
    }
    
    public final void c() {
        final int c = this.C;
        if (c == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        final ArrayList e = this.E;
        final ArrayList f = this.F;
        if (c == 1) {
            for (final e e2 : f) {
                ++this.D;
                e2.a(true);
                --this.D;
            }
            if (!e.isEmpty()) {
                e.size();
                final boolean equals = this.toString().equals((Object)this.I);
                final int j = this.J;
                final int selectionStart = Selection.getSelectionStart((CharSequence)this);
                boolean b = false;
                final boolean b2 = j != selectionStart || this.K != Selection.getSelectionEnd((CharSequence)this);
                if (this.L != BaseInputConnection.getComposingSpanStart((Spannable)this) || this.M != BaseInputConnection.getComposingSpanEnd((Spannable)this)) {
                    b = true;
                }
                this.d(equals ^ true, b2, b);
            }
        }
        e.addAll((Collection)f);
        f.clear();
        --this.C;
    }
    
    public final void d(final boolean b, final boolean b2, final boolean b3) {
        if (b || b2 || b3) {
            for (final e e : this.E) {
                ++this.D;
                e.a(b);
                --this.D;
            }
        }
    }
    
    public final void e(final e e) {
        if (this.D > 0) {
            final StringBuilder sb = new StringBuilder("removing a listener ");
            sb.append(e.toString());
            sb.append(" in a listener callback");
            Log.e("ListenableEditingState", sb.toString());
        }
        this.E.remove((Object)e);
        if (this.C > 0) {
            this.F.remove((Object)e);
        }
    }
    
    public final void f(final p p) {
        this.b();
        this.replace(0, this.length(), (CharSequence)p.a);
        final int b = p.b;
        if (b >= 0) {
            Selection.setSelection((Spannable)this, b, p.c);
        }
        else {
            Selection.removeSelection((Spannable)this);
        }
        final int d = p.d;
        Label_0082: {
            if (d >= 0) {
                final int e = p.e;
                if (d < e) {
                    this.N.setComposingRegion(d, e);
                    break Label_0082;
                }
            }
            BaseInputConnection.removeComposingSpans((Spannable)this);
        }
        this.G.clear();
        this.c();
    }
    
    public final SpannableStringBuilder replace(final int c, final int d, final CharSequence charSequence, int composingSpanStart, int selectionEnd) {
        if (this.D > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        final String string = this.toString();
        final int n = d - c;
        boolean b = n != selectionEnd - composingSpanStart;
        for (int n2 = 0; n2 < n && !b; b |= (this.charAt(c + n2) != charSequence.charAt(composingSpanStart + n2)), ++n2) {}
        if (b) {
            this.H = null;
        }
        final int selectionStart = Selection.getSelectionStart((CharSequence)this);
        final int selectionEnd2 = Selection.getSelectionEnd((CharSequence)this);
        final int composingSpanStart2 = BaseInputConnection.getComposingSpanStart((Spannable)this);
        final int composingSpanEnd = BaseInputConnection.getComposingSpanEnd((Spannable)this);
        final SpannableStringBuilder replace = super.replace(c, d, charSequence, composingSpanStart, selectionEnd);
        final ArrayList g = this.G;
        final int selectionStart2 = Selection.getSelectionStart((CharSequence)this);
        selectionEnd = Selection.getSelectionEnd((CharSequence)this);
        composingSpanStart = BaseInputConnection.getComposingSpanStart((Spannable)this);
        final int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd((Spannable)this);
        final Object o = new Object();
        ((h)o).e = selectionStart2;
        ((h)o).f = selectionEnd;
        ((h)o).g = composingSpanStart;
        ((h)o).h = composingSpanEnd2;
        final String string2 = charSequence.toString();
        ((h)o).a = string;
        ((h)o).b = string2;
        ((h)o).c = c;
        ((h)o).d = d;
        g.add(o);
        if (this.C > 0) {
            return replace;
        }
        this.d(b, Selection.getSelectionStart((CharSequence)this) != selectionStart || Selection.getSelectionEnd((CharSequence)this) != selectionEnd2, BaseInputConnection.getComposingSpanStart((Spannable)this) != composingSpanStart2 || BaseInputConnection.getComposingSpanEnd((Spannable)this) != composingSpanEnd);
        return replace;
    }
    
    public final void setSpan(final Object o, int composingSpanEnd, int selectionEnd, int selectionStart) {
        super.setSpan(o, composingSpanEnd, selectionEnd, selectionStart);
        final ArrayList g = this.G;
        final String string = this.toString();
        selectionStart = Selection.getSelectionStart((CharSequence)this);
        selectionEnd = Selection.getSelectionEnd((CharSequence)this);
        final int composingSpanStart = BaseInputConnection.getComposingSpanStart((Spannable)this);
        composingSpanEnd = BaseInputConnection.getComposingSpanEnd((Spannable)this);
        final Object o2 = new Object();
        ((h)o2).e = selectionStart;
        ((h)o2).f = selectionEnd;
        ((h)o2).g = composingSpanStart;
        ((h)o2).h = composingSpanEnd;
        ((h)o2).a = string;
        ((h)o2).b = "";
        ((h)o2).c = -1;
        ((h)o2).d = -1;
        g.add(o2);
    }
    
    public final String toString() {
        String h = this.H;
        if (h == null) {
            h = super.toString();
            this.H = h;
        }
        return h;
    }
}
