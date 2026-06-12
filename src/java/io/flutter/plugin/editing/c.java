package io.flutter.plugin.editing;

import android.os.BaseBundle;
import android.view.KeyEvent;
import java.util.Iterator;
import java.io.Serializable;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.Layout;
import java.io.InputStream;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import F4.o;
import java.util.Arrays;
import F4.p;
import java.util.HashMap;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import S.a;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.text.Spannable;
import android.text.Selection;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import c2.k;
import V4.G;
import android.text.DynamicLayout;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.CursorAnchorInfo$Builder;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.internal.measurement.K1;
import v4.l;
import android.view.inputmethod.BaseInputConnection;

public final class c extends BaseInputConnection implements e
{
    public final l a;
    public final int b;
    public final K1 c;
    public final f d;
    public final EditorInfo e;
    public ExtractedTextRequest f;
    public boolean g;
    public CursorAnchorInfo$Builder h;
    public final ExtractedText i;
    public final InputMethodManager j;
    public final DynamicLayout k;
    public final G l;
    public final k m;
    public int n;
    
    public c(final l a, final int b, final K1 c, final k m, final f d, final EditorInfo e) {
        final FlutterJNI flutterJNI = new FlutterJNI();
        super((View)a, true);
        this.g = false;
        this.i = new ExtractedText();
        this.n = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        (this.d = d).a(this);
        this.e = e;
        this.m = m;
        this.l = new G((Object)flutterJNI, 12);
        this.k = new DynamicLayout((CharSequence)d, new TextPaint(), Integer.MAX_VALUE, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.j = (InputMethodManager)((View)a).getContext().getSystemService("input_method");
    }
    
    public final void a(final boolean b) {
        final f d = this.d;
        d.getClass();
        this.j.updateSelection((View)this.a, Selection.getSelectionStart((CharSequence)d), Selection.getSelectionEnd((CharSequence)d), BaseInputConnection.getComposingSpanStart((Spannable)d), BaseInputConnection.getComposingSpanEnd((Spannable)d));
        final ExtractedTextRequest f = this.f;
        final InputMethodManager j = this.j;
        final l a = this.a;
        if (f != null) {
            j.updateExtractedText((View)a, f.token, this.c(f));
        }
        if (this.g) {
            j.updateCursorAnchorInfo((View)a, this.b());
        }
    }
    
    public final CursorAnchorInfo b() {
        final CursorAnchorInfo$Builder h = this.h;
        if (h == null) {
            this.h = new CursorAnchorInfo$Builder();
        }
        else {
            h.reset();
        }
        final CursorAnchorInfo$Builder h2 = this.h;
        final f d = this.d;
        d.getClass();
        final int selectionStart = Selection.getSelectionStart((CharSequence)d);
        d.getClass();
        h2.setSelectionRange(selectionStart, Selection.getSelectionEnd((CharSequence)d));
        d.getClass();
        final int composingSpanStart = BaseInputConnection.getComposingSpanStart((Spannable)d);
        d.getClass();
        final int composingSpanEnd = BaseInputConnection.getComposingSpanEnd((Spannable)d);
        if (composingSpanStart >= 0 && composingSpanEnd > composingSpanStart) {
            this.h.setComposingText(composingSpanStart, d.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        else {
            this.h.setComposingText(-1, (CharSequence)"");
        }
        return this.h.build();
    }
    
    public final boolean beginBatchEdit() {
        this.d.b();
        ++this.n;
        return super.beginBatchEdit();
    }
    
    public final ExtractedText c(final ExtractedTextRequest extractedTextRequest) {
        final ExtractedText i = this.i;
        i.startOffset = 0;
        i.partialStartOffset = -1;
        i.partialEndOffset = -1;
        final f d = this.d;
        d.getClass();
        i.selectionStart = Selection.getSelectionStart((CharSequence)d);
        d.getClass();
        i.selectionEnd = Selection.getSelectionEnd((CharSequence)d);
        Object string = null;
        Label_0077: {
            if (extractedTextRequest != null) {
                string = d;
                if ((extractedTextRequest.flags & 0x1) != 0x0) {
                    break Label_0077;
                }
            }
            string = d.toString();
        }
        i.text = (CharSequence)string;
        return i;
    }
    
    public final void closeConnection() {
        super.closeConnection();
        this.d.e(this);
        while (this.n > 0) {
            this.endBatchEdit();
            --this.n;
        }
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, int read, Bundle mimeType) {
        if (Build$VERSION.SDK_INT < 25 || (read & 0x1) == 0x0) {
            return false;
        }
        try {
            S.a.d(inputContentInfo);
            if (S.a.a(inputContentInfo).getMimeTypeCount() > 0) {
                S.a.d(inputContentInfo);
                final Uri b = S.a.b(inputContentInfo);
                mimeType = (Bundle)S.a.a(inputContentInfo).getMimeType(0);
                final Context context = ((View)this.a).getContext();
                if (b != null) {
                    try {
                        final InputStream openInputStream = context.getContentResolver().openInputStream(b);
                        if (openInputStream != null) {
                            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            final byte[] array = new byte[65536];
                            while (true) {
                                try {
                                    read = openInputStream.read(array);
                                }
                                catch (final IOException ex) {
                                    read = -1;
                                }
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(array, 0, read);
                            }
                            final byte[] byteArray = byteArrayOutputStream.toByteArray();
                            final HashMap hashMap = new HashMap();
                            hashMap.put((Object)"mimeType", (Object)mimeType);
                            hashMap.put((Object)"data", (Object)byteArray);
                            hashMap.put((Object)"uri", (Object)b.toString());
                            final K1 c = this.c;
                            c.getClass();
                            ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList(new Object[] { this.b, "TextInputAction.commitContent", hashMap }), (o)null);
                            S.a.f(inputContentInfo);
                            return true;
                        }
                    }
                    catch (final FileNotFoundException ex2) {
                        S.a.f(inputContentInfo);
                        return false;
                    }
                }
                S.a.f(inputContentInfo);
            }
            return false;
        }
        catch (final Exception ex3) {
            return false;
        }
    }
    
    public final boolean d(final boolean b, final boolean b2) {
        final f d = this.d;
        final int selectionStart = Selection.getSelectionStart((CharSequence)d);
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)d);
        int n = 0;
        int n2 = 0;
        if (selectionStart >= 0 && selectionEnd >= 0) {
            final G l = this.l;
            int n23;
            if (b) {
                l.getClass();
                int n10 = 0;
                Label_0838: {
                    if (selectionEnd > 1) {
                        final int codePointBefore = Character.codePointBefore((CharSequence)d, selectionEnd);
                        int charCount = Character.charCount(codePointBefore);
                        final int n3 = selectionEnd - charCount;
                        if (n3 != 0) {
                            int n4 = 0;
                            Label_0123: {
                                if (codePointBefore == 10) {
                                    n4 = charCount;
                                    if (Character.codePointBefore((CharSequence)d, n3) == 13) {
                                        n4 = charCount + 1;
                                    }
                                }
                                else {
                                    final FlutterJNI flutterJNI = (FlutterJNI)l.D;
                                    if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                                        final int codePointBefore2 = Character.codePointBefore((CharSequence)d, n3);
                                        int n5 = n3 - Character.charCount(codePointBefore2);
                                        int n6 = 1;
                                        for (int codePointBefore3 = codePointBefore2; n5 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore3); codePointBefore3 = Character.codePointBefore((CharSequence)d, n5), n5 -= Character.charCount(codePointBefore3), ++n6) {}
                                        n4 = charCount;
                                        if (n6 % 2 == 0) {
                                            n4 = charCount + 2;
                                        }
                                    }
                                    else if (codePointBefore == 8419) {
                                        final int codePointBefore4 = Character.codePointBefore((CharSequence)d, n3);
                                        final int n7 = n3 - Character.charCount(codePointBefore4);
                                        int charCount2;
                                        if (n7 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore4)) {
                                            final int codePointBefore5 = Character.codePointBefore((CharSequence)d, n7);
                                            n4 = charCount;
                                            if (!G.t(codePointBefore5)) {
                                                break Label_0123;
                                            }
                                            charCount2 = Character.charCount(codePointBefore5) + Character.charCount(codePointBefore4);
                                        }
                                        else {
                                            n4 = charCount;
                                            if (!G.t(codePointBefore4)) {
                                                break Label_0123;
                                            }
                                            charCount2 = Character.charCount(codePointBefore4);
                                        }
                                        n4 = charCount + charCount2;
                                    }
                                    else {
                                        int n8 = codePointBefore;
                                        n4 = charCount;
                                        int n9 = n3;
                                        if (codePointBefore == 917631) {
                                            for (n8 = Character.codePointBefore((CharSequence)d, n3), n9 = n3 - Character.charCount(n8); n9 > 0 && 917536 <= n8 && n8 <= 917630; n8 = Character.codePointBefore((CharSequence)d, n9), n9 -= Character.charCount(n8)) {
                                                charCount += Character.charCount(n8);
                                            }
                                            if (!flutterJNI.isCodePointEmoji(n8)) {
                                                n10 = selectionEnd - 2;
                                                break Label_0838;
                                            }
                                            n4 = charCount + Character.charCount(n8);
                                        }
                                        int codePointBefore6 = n8;
                                        int n11 = n4;
                                        int n12 = n9;
                                        if (flutterJNI.isCodePointVariantSelector(n8)) {
                                            codePointBefore6 = Character.codePointBefore((CharSequence)d, n9);
                                            if (!flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                                break Label_0123;
                                            }
                                            n11 = n4 + Character.charCount(codePointBefore6);
                                            n12 = n9 - n11;
                                        }
                                        n4 = n11;
                                        if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                            int n13 = 0;
                                            int n14 = 0;
                                            int n15 = n12;
                                            int n16 = n11;
                                            int codePointBefore7;
                                            int n18;
                                            do {
                                                int n17 = n13;
                                                n18 = n16;
                                                if (n13 != 0) {
                                                    n18 = Character.charCount(codePointBefore6) + n14 + 1 + n16;
                                                    n17 = 0;
                                                }
                                                if (flutterJNI.isCodePointEmojiModifier(codePointBefore6)) {
                                                    int n19 = Character.codePointBefore((CharSequence)d, n15);
                                                    final int n20 = n15 - Character.charCount(n19);
                                                    int charCount3;
                                                    if (n20 > 0 && flutterJNI.isCodePointVariantSelector(n19)) {
                                                        n19 = Character.codePointBefore((CharSequence)d, n20);
                                                        if (!flutterJNI.isCodePointEmoji(n19)) {
                                                            n4 = n18;
                                                            break Label_0123;
                                                        }
                                                        charCount3 = Character.charCount(n19);
                                                        Character.charCount(n19);
                                                    }
                                                    else {
                                                        charCount3 = 0;
                                                    }
                                                    n4 = n18;
                                                    if (flutterJNI.isCodePointEmojiModifierBase(n19)) {
                                                        n4 = n18 + (Character.charCount(n19) + charCount3);
                                                    }
                                                }
                                                else {
                                                    codePointBefore7 = codePointBefore6;
                                                    int n21 = 0;
                                                    int charCount4 = 0;
                                                    Label_0784: {
                                                        if ((n21 = n15) > 0) {
                                                            codePointBefore7 = Character.codePointBefore((CharSequence)d, n15);
                                                            n21 = n15 - Character.charCount(codePointBefore7);
                                                            if (codePointBefore7 == 8205) {
                                                                int n22 = Character.codePointBefore((CharSequence)d, n21);
                                                                n21 -= Character.charCount(n22);
                                                                if (n21 > 0 && flutterJNI.isCodePointVariantSelector(n22)) {
                                                                    n22 = Character.codePointBefore((CharSequence)d, n21);
                                                                    charCount4 = Character.charCount(n22);
                                                                    n21 -= Character.charCount(n22);
                                                                }
                                                                else {
                                                                    charCount4 = 0;
                                                                }
                                                                n17 = 1;
                                                                codePointBefore7 = n22;
                                                                break Label_0784;
                                                            }
                                                        }
                                                        charCount4 = 0;
                                                    }
                                                    if (n21 == 0) {
                                                        n4 = n18;
                                                    }
                                                    else {
                                                        n4 = n18;
                                                        if (n17 != 0) {
                                                            n13 = n17;
                                                            n14 = charCount4;
                                                            codePointBefore6 = codePointBefore7;
                                                            n16 = n18;
                                                            n15 = n21;
                                                            continue;
                                                        }
                                                    }
                                                }
                                                break Label_0123;
                                            } while (flutterJNI.isCodePointEmoji(codePointBefore7));
                                            n4 = n18;
                                        }
                                    }
                                }
                            }
                            n10 = selectionEnd - n4;
                            break Label_0838;
                        }
                    }
                    n10 = 0;
                }
                n23 = Math.max(n10, 0);
            }
            else {
                l.getClass();
                final int length = d.length();
                final int n24 = length - 1;
                Label_1573: {
                    if (selectionEnd >= n24) {
                        n = length;
                    }
                    else {
                        int codePoint = Character.codePointAt((CharSequence)d, selectionEnd);
                        final int charCount5 = Character.charCount(codePoint);
                        final int n25 = selectionEnd + charCount5;
                        if (n25 != 0) {
                            int n26 = 0;
                            Label_0937: {
                                if (codePoint == 10) {
                                    n26 = charCount5;
                                    if (Character.codePointAt((CharSequence)d, n25) == 13) {
                                        n26 = charCount5 + 1;
                                    }
                                }
                                else {
                                    final FlutterJNI flutterJNI2 = (FlutterJNI)l.D;
                                    if (flutterJNI2.isCodePointRegionalIndicator(codePoint)) {
                                        if (n25 >= n24 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt((CharSequence)d, n25))) {
                                            n = n25;
                                            break Label_1573;
                                        }
                                        for (int n27 = selectionEnd; n27 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore((CharSequence)d, selectionEnd)); n27 -= Character.charCount(Character.codePointBefore((CharSequence)d, selectionEnd)), ++n2) {}
                                        n26 = charCount5;
                                        if (n2 % 2 == 0) {
                                            n26 = charCount5 + 2;
                                        }
                                    }
                                    else {
                                        int n28 = charCount5;
                                        if (G.t(codePoint)) {
                                            n28 = charCount5 + Character.charCount(codePoint);
                                        }
                                        int n32 = 0;
                                        Label_1179: {
                                            int n30 = 0;
                                            int n31 = 0;
                                            Label_1151: {
                                                if (codePoint == 8419) {
                                                    final int codePointBefore8 = Character.codePointBefore((CharSequence)d, n25);
                                                    final int n29 = Character.charCount(codePointBefore8) + n25;
                                                    if (n29 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore8)) {
                                                        final int codePoint2 = Character.codePointAt((CharSequence)d, n29);
                                                        n26 = n28;
                                                        if (!G.t(codePoint2)) {
                                                            break Label_0937;
                                                        }
                                                        n30 = Character.charCount(codePointBefore8);
                                                        n31 = Character.charCount(codePoint2);
                                                    }
                                                    else {
                                                        n26 = n28;
                                                        if (G.t(codePointBefore8)) {
                                                            n32 = Character.charCount(codePointBefore8);
                                                            break Label_1179;
                                                        }
                                                        break Label_0937;
                                                    }
                                                }
                                                else {
                                                    n26 = n28;
                                                    if (flutterJNI2.isCodePointEmoji(codePoint)) {
                                                        int n33 = 0;
                                                        int n34 = 0;
                                                        int n35 = n25;
                                                        int n36 = n28;
                                                        int n37;
                                                        do {
                                                            int n38 = n33;
                                                            n28 = n36;
                                                            if (n33 != 0) {
                                                                n28 = Character.charCount(codePoint) + n34 + 1 + n36;
                                                                n38 = 0;
                                                            }
                                                            Label_1570: {
                                                                if (flutterJNI2.isCodePointEmojiModifier(codePoint)) {
                                                                    n26 = n28;
                                                                }
                                                                else {
                                                                    n37 = codePoint;
                                                                    int n39 = 0;
                                                                    int charCount6 = 0;
                                                                    Label_1517: {
                                                                        Label_1514: {
                                                                            if ((n39 = n35) < length) {
                                                                                n37 = Character.codePointAt((CharSequence)d, n35);
                                                                                n39 = Character.charCount(n37) + n35;
                                                                                if (n37 != 8419) {
                                                                                    int n40;
                                                                                    if (flutterJNI2.isCodePointEmojiModifier(n37)) {
                                                                                        n40 = Character.charCount(n37);
                                                                                    }
                                                                                    else if (flutterJNI2.isCodePointVariantSelector(n37)) {
                                                                                        n40 = Character.charCount(n37);
                                                                                    }
                                                                                    else {
                                                                                        if (n37 == 8205) {
                                                                                            n37 = Character.codePointAt((CharSequence)d, n39);
                                                                                            n39 += Character.charCount(n37);
                                                                                            if (n39 < length && flutterJNI2.isCodePointVariantSelector(n37)) {
                                                                                                n37 = Character.codePointAt((CharSequence)d, n39);
                                                                                                charCount6 = Character.charCount(n37);
                                                                                                n39 += Character.charCount(n37);
                                                                                            }
                                                                                            else {
                                                                                                charCount6 = 0;
                                                                                            }
                                                                                            n38 = 1;
                                                                                            break Label_1517;
                                                                                        }
                                                                                        break Label_1514;
                                                                                    }
                                                                                    n26 = n28 + n40;
                                                                                    break Label_1570;
                                                                                }
                                                                                final int codePointBefore9 = Character.codePointBefore((CharSequence)d, n39);
                                                                                final int n41 = Character.charCount(codePointBefore9) + n39;
                                                                                if (n41 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                                                                    final int codePoint3 = Character.codePointAt((CharSequence)d, n41);
                                                                                    n26 = n28;
                                                                                    if (G.t(codePoint3)) {
                                                                                        n30 = Character.charCount(codePointBefore9);
                                                                                        n31 = Character.charCount(codePoint3);
                                                                                        break Label_1151;
                                                                                    }
                                                                                    break Label_0937;
                                                                                }
                                                                                else {
                                                                                    n26 = n28;
                                                                                    if (G.t(codePointBefore9)) {
                                                                                        n32 = Character.charCount(codePointBefore9);
                                                                                        break Label_1179;
                                                                                    }
                                                                                    break Label_0937;
                                                                                }
                                                                            }
                                                                        }
                                                                        charCount6 = 0;
                                                                    }
                                                                    if (n39 >= length) {
                                                                        n26 = n28;
                                                                    }
                                                                    else {
                                                                        n26 = n28;
                                                                        if (n38 != 0) {
                                                                            n33 = n38;
                                                                            n34 = charCount6;
                                                                            codePoint = n37;
                                                                            n36 = n28;
                                                                            n35 = n39;
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break Label_0937;
                                                        } while (flutterJNI2.isCodePointEmoji(n37));
                                                        n26 = n28;
                                                    }
                                                    break Label_0937;
                                                }
                                            }
                                            n26 = n28 + (n31 + n30);
                                            break Label_0937;
                                        }
                                        n26 = n28 + n32;
                                    }
                                }
                            }
                            n = selectionEnd + n26;
                        }
                    }
                }
                n23 = Math.min(n, d.length());
            }
            if (selectionStart == selectionEnd && !b2) {
                this.setSelection(n23, n23);
            }
            else {
                this.setSelection(selectionStart, n23);
            }
            return true;
        }
        return false;
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        final f d = this.d;
        d.getClass();
        return Selection.getSelectionStart((CharSequence)d) == -1 || super.deleteSurroundingText(n, n2);
    }
    
    public final boolean e(final boolean b, final boolean b2) {
        final f d = this.d;
        final int selectionStart = Selection.getSelectionStart((CharSequence)d);
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)d);
        final boolean b3 = false;
        if (selectionStart >= 0 && selectionEnd >= 0) {
            int n = b3 ? 1 : 0;
            if (selectionStart == selectionEnd) {
                n = (b3 ? 1 : 0);
                if (!b2) {
                    n = 1;
                }
            }
            this.beginBatchEdit();
            final DynamicLayout k = this.k;
            if (n != 0) {
                if (b) {
                    Selection.moveUp((Spannable)d, (Layout)k);
                }
                else {
                    Selection.moveDown((Spannable)d, (Layout)k);
                }
                final int selectionStart2 = Selection.getSelectionStart((CharSequence)d);
                this.setSelection(selectionStart2, selectionStart2);
            }
            else {
                if (b) {
                    Selection.extendUp((Spannable)d, (Layout)k);
                }
                else {
                    Selection.extendDown((Spannable)d, (Layout)k);
                }
                this.setSelection(Selection.getSelectionStart((CharSequence)d), Selection.getSelectionEnd((CharSequence)d));
            }
            this.endBatchEdit();
            return true;
        }
        return false;
    }
    
    public final boolean endBatchEdit() {
        final boolean endBatchEdit = super.endBatchEdit();
        --this.n;
        this.d.c();
        return endBatchEdit;
    }
    
    public final Editable getEditable() {
        return (Editable)this.d;
    }
    
    public final ExtractedText getExtractedText(final ExtractedTextRequest extractedTextRequest, int n) {
        final int n2 = 1;
        if ((n & 0x1) != 0x0) {
            n = n2;
        }
        else {
            n = 0;
        }
        ExtractedTextRequest f;
        if (n != 0) {
            f = extractedTextRequest;
        }
        else {
            f = null;
        }
        this.f = f;
        return this.c(extractedTextRequest);
    }
    
    public final boolean performContextMenuAction(int n) {
        this.beginBatchEdit();
        final boolean b = true;
        final f d = this.d;
        boolean b2;
        if (n == 16908319) {
            this.setSelection(0, d.length());
            b2 = b;
        }
        else {
            final l a = this.a;
            if (n == 16908320) {
                final int selectionStart = Selection.getSelectionStart((CharSequence)d);
                final int selectionEnd = Selection.getSelectionEnd((CharSequence)d);
                b2 = b;
                if (selectionStart != selectionEnd) {
                    n = Math.min(selectionStart, selectionEnd);
                    final int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager)((View)a).getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", d.subSequence(n, max)));
                    d.delete(n, max);
                    this.setSelection(n, n);
                    b2 = b;
                }
            }
            else if (n == 16908321) {
                final int selectionStart2 = Selection.getSelectionStart((CharSequence)d);
                n = Selection.getSelectionEnd((CharSequence)d);
                b2 = b;
                if (selectionStart2 != n) {
                    ((ClipboardManager)((View)a).getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", d.subSequence(Math.min(selectionStart2, n), Math.max(selectionStart2, n))));
                    b2 = b;
                }
            }
            else if (n == 16908322) {
                final ClipData primaryClip = ((ClipboardManager)((View)a).getContext().getSystemService("clipboard")).getPrimaryClip();
                b2 = b;
                if (primaryClip != null) {
                    final CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(((View)a).getContext());
                    final int max2 = Math.max(0, Selection.getSelectionStart((CharSequence)d));
                    final int max3 = Math.max(0, Selection.getSelectionEnd((CharSequence)d));
                    n = Math.min(max2, max3);
                    final int max4 = Math.max(max2, max3);
                    if (n != max4) {
                        d.delete(n, max4);
                    }
                    d.insert(n, coerceToText);
                    n += coerceToText.length();
                    this.setSelection(n, n);
                    b2 = b;
                }
            }
            else {
                b2 = false;
            }
        }
        this.endBatchEdit();
        return b2;
    }
    
    public final boolean performEditorAction(final int n) {
        final int b = this.b;
        final K1 c = this.c;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                if (n != 7) {
                                    c.getClass();
                                    ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.done" }), (o)null);
                                }
                                else {
                                    c.getClass();
                                    ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.previous" }), (o)null);
                                }
                            }
                            else {
                                c.getClass();
                                ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.next" }), (o)null);
                            }
                        }
                        else {
                            c.getClass();
                            ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.send" }), (o)null);
                        }
                    }
                    else {
                        c.getClass();
                        ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.search" }), (o)null);
                    }
                }
                else {
                    c.getClass();
                    ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.go" }), (o)null);
                }
            }
            else {
                c.getClass();
                ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.newline" }), (o)null);
            }
        }
        else {
            c.getClass();
            ((p)c.D).a("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)b, (Serializable)"TextInputAction.unspecified" }), (o)null);
        }
        return true;
    }
    
    public final boolean performPrivateCommand(final String s, final Bundle bundle) {
        final K1 c = this.c;
        c.getClass();
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"action", (Object)s);
        if (bundle != null) {
            final HashMap hashMap2 = new HashMap();
            for (final String s2 : ((BaseBundle)bundle).keySet()) {
                final Object value = ((BaseBundle)bundle).get(s2);
                if (value instanceof byte[]) {
                    hashMap2.put((Object)s2, (Object)bundle.getByteArray(s2));
                }
                else if (value instanceof Byte) {
                    hashMap2.put((Object)s2, (Object)bundle.getByte(s2));
                }
                else if (value instanceof char[]) {
                    hashMap2.put((Object)s2, (Object)bundle.getCharArray(s2));
                }
                else if (value instanceof Character) {
                    hashMap2.put((Object)s2, (Object)bundle.getChar(s2));
                }
                else if (value instanceof CharSequence[]) {
                    hashMap2.put((Object)s2, (Object)bundle.getCharSequenceArray(s2));
                }
                else if (value instanceof CharSequence) {
                    hashMap2.put((Object)s2, (Object)bundle.getCharSequence(s2));
                }
                else if (value instanceof float[]) {
                    hashMap2.put((Object)s2, (Object)bundle.getFloatArray(s2));
                }
                else {
                    if (!(value instanceof Float)) {
                        continue;
                    }
                    hashMap2.put((Object)s2, (Object)bundle.getFloat(s2));
                }
            }
            hashMap.put((Object)"data", (Object)hashMap2);
        }
        ((p)c.D).a("TextInputClient.performPrivateCommand", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)this.b, (Serializable)hashMap }), (o)null);
        return true;
    }
    
    public final boolean requestCursorUpdates(final int n) {
        if ((n & 0x1) != 0x0) {
            this.j.updateCursorAnchorInfo((View)this.a, this.b());
        }
        this.g = ((n & 0x2) != 0x0);
        return true;
    }
    
    public final boolean sendKeyEvent(final KeyEvent keyEvent) {
        return this.m.r(keyEvent);
    }
    
    public final boolean setComposingText(final CharSequence charSequence, final int n) {
        this.beginBatchEdit();
        boolean b;
        if (charSequence.length() == 0) {
            b = super.commitText(charSequence, n);
        }
        else {
            b = super.setComposingText(charSequence, n);
        }
        this.endBatchEdit();
        return b;
    }
    
    public final boolean setSelection(final int n, final int n2) {
        this.beginBatchEdit();
        final boolean setSelection = super.setSelection(n, n2);
        this.endBatchEdit();
        return setSelection;
    }
}
