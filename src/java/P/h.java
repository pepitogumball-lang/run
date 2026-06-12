package P;

import android.os.BaseBundle;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import java.util.Collections;
import O.n0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.accessibility.AccessibilityNodeInfo;

public final class h
{
    public static int b;
    public final AccessibilityNodeInfo a;
    
    public h(final AccessibilityNodeInfo a) {
        this.a = a;
    }
    
    public h(final AccessibilityNodeInfo a, final int n) {
        this.a = a;
    }
    
    public static String b(final int n) {
        if (n == 1) {
            return "ACTION_FOCUS";
        }
        if (n == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return "ACTION_UNKNOWN";
                                    }
                                    case 16908375: {
                                        return "ACTION_DRAG_CANCEL";
                                    }
                                    case 16908374: {
                                        return "ACTION_DRAG_DROP";
                                    }
                                    case 16908373: {
                                        return "ACTION_DRAG_START";
                                    }
                                    case 16908372: {
                                        return "ACTION_IME_ENTER";
                                    }
                                }
                                break;
                            }
                            case 16908362: {
                                return "ACTION_PRESS_AND_HOLD";
                            }
                            case 16908361: {
                                return "ACTION_PAGE_RIGHT";
                            }
                            case 16908360: {
                                return "ACTION_PAGE_LEFT";
                            }
                            case 16908359: {
                                return "ACTION_PAGE_DOWN";
                            }
                            case 16908358: {
                                return "ACTION_PAGE_UP";
                            }
                            case 16908357: {
                                return "ACTION_HIDE_TOOLTIP";
                            }
                            case 16908356: {
                                return "ACTION_SHOW_TOOLTIP";
                            }
                        }
                        break;
                    }
                    case 16908349: {
                        return "ACTION_SET_PROGRESS";
                    }
                    case 16908348: {
                        return "ACTION_CONTEXT_CLICK";
                    }
                    case 16908347: {
                        return "ACTION_SCROLL_RIGHT";
                    }
                    case 16908346: {
                        return "ACTION_SCROLL_DOWN";
                    }
                    case 16908345: {
                        return "ACTION_SCROLL_LEFT";
                    }
                    case 16908344: {
                        return "ACTION_SCROLL_UP";
                    }
                    case 16908343: {
                        return "ACTION_SCROLL_TO_POSITION";
                    }
                    case 16908342: {
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                }
                break;
            }
            case 16908382: {
                return "ACTION_SCROLL_IN_DIRECTION";
            }
            case 16908354: {
                return "ACTION_MOVE_WINDOW";
            }
            case 2097152: {
                return "ACTION_SET_TEXT";
            }
            case 524288: {
                return "ACTION_COLLAPSE";
            }
            case 262144: {
                return "ACTION_EXPAND";
            }
            case 131072: {
                return "ACTION_SET_SELECTION";
            }
            case 65536: {
                return "ACTION_CUT";
            }
            case 32768: {
                return "ACTION_PASTE";
            }
            case 16384: {
                return "ACTION_COPY";
            }
            case 8192: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 4096: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 2048: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 1024: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 512: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 256: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 128: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 64: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 32: {
                return "ACTION_LONG_CLICK";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 4: {
                return "ACTION_SELECT";
            }
        }
    }
    
    public final ArrayList a(final String s) {
        final AccessibilityNodeInfo a = this.a;
        ArrayList integerArrayList;
        if ((integerArrayList = a.getExtras().getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList();
            a.getExtras().putIntegerArrayList(s, integerArrayList);
        }
        return integerArrayList;
    }
    
    public final boolean c(final int n) {
        final Bundle extras = this.a.getExtras();
        boolean b = false;
        if (extras == null) {
            return false;
        }
        if ((((BaseBundle)extras).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & n) == n) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final AccessibilityNodeInfo a = ((h)o).a;
        final AccessibilityNodeInfo a2 = this.a;
        if (a2 == null) {
            if (a != null) {
                return false;
            }
        }
        else if (!a2.equals((Object)a)) {
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final AccessibilityNodeInfo a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        final AccessibilityNodeInfo a = this.a;
        a.getBoundsInParent(rect);
        final StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append((Object)rect);
        sb.append(sb2.toString());
        a.getBoundsInScreen(rect);
        final StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append((Object)rect);
        sb.append(sb3.toString());
        if (Build$VERSION.SDK_INT >= 34) {
            f.b(a, rect);
        }
        else {
            final Rect rect2 = (Rect)a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        final StringBuilder sb4 = new StringBuilder("; boundsInWindow: ");
        sb4.append((Object)rect);
        sb.append(sb4.toString());
        sb.append("; packageName: ");
        sb.append(a.getPackageName());
        sb.append("; className: ");
        sb.append(a.getClassName());
        sb.append("; text: ");
        final boolean empty = ((List)this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY")).isEmpty();
        final int n = 0;
        CharSequence text;
        if (!empty) {
            final ArrayList a2 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final ArrayList a3 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final ArrayList a4 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final ArrayList a5 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            final SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring(a.getText(), 0, a.getText().length()));
            int n2 = 0;
            while (true) {
                text = (CharSequence)spannableString;
                if (n2 >= ((List)a2).size()) {
                    break;
                }
                spannableString.setSpan((Object)new a((int)((List)a5).get(n2), this, ((BaseBundle)a.getExtras()).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)((List)a2).get(n2), (int)((List)a3).get(n2), (int)((List)a4).get(n2));
                ++n2;
            }
        }
        else {
            text = a.getText();
        }
        sb.append(text);
        sb.append("; error: ");
        sb.append(a.getError());
        sb.append("; maxTextLength: ");
        sb.append(a.getMaxTextLength());
        sb.append("; stateDescription: ");
        final int sdk_INT = Build$VERSION.SDK_INT;
        CharSequence charSequence;
        if (sdk_INT >= 30) {
            charSequence = d.b(a);
        }
        else {
            charSequence = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(a.getContentDescription());
        sb.append("; tooltipText: ");
        CharSequence charSequence2;
        if (sdk_INT >= 28) {
            charSequence2 = n0.k(a);
        }
        else {
            charSequence2 = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        String s;
        if (sdk_INT >= 33) {
            s = e.g(a);
        }
        else {
            s = ((BaseBundle)a.getExtras()).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(s);
        sb.append("; checkable: ");
        sb.append(a.isCheckable());
        sb.append("; checked: ");
        sb.append(a.isChecked());
        sb.append("; focusable: ");
        sb.append(a.isFocusable());
        sb.append("; focused: ");
        sb.append(a.isFocused());
        sb.append("; selected: ");
        sb.append(a.isSelected());
        sb.append("; clickable: ");
        sb.append(a.isClickable());
        sb.append("; longClickable: ");
        sb.append(a.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(a.isContextClickable());
        sb.append("; enabled: ");
        sb.append(a.isEnabled());
        sb.append("; password: ");
        sb.append(a.isPassword());
        final StringBuilder sb5 = new StringBuilder("; scrollable: ");
        sb5.append(a.isScrollable());
        sb.append(sb5.toString());
        sb.append("; containerTitle: ");
        CharSequence charSequence3;
        if (sdk_INT >= 34) {
            charSequence3 = f.c(a);
        }
        else {
            charSequence3 = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(this.c(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(a.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(a.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        boolean b;
        if (sdk_INT >= 33) {
            b = e.h(a);
        }
        else {
            b = this.c(8388608);
        }
        sb.append(b);
        sb.append("; accessibilityDataSensitive: ");
        boolean b2;
        if (sdk_INT >= 34) {
            b2 = f.f(a);
        }
        else {
            b2 = this.c(64);
        }
        sb.append(b2);
        sb.append("; [");
        final List actionList = a.getActionList();
        List emptyList;
        int i;
        if (actionList != null) {
            final ArrayList list = new ArrayList();
            final int size = actionList.size();
            int n3 = 0;
            while (true) {
                emptyList = (List)list;
                i = n;
                if (n3 >= size) {
                    break;
                }
                list.add((Object)new c(actionList.get(n3), 0, null));
                ++n3;
            }
        }
        else {
            emptyList = Collections.emptyList();
            i = n;
        }
        while (i < emptyList.size()) {
            final c c = (c)emptyList.get(i);
            String s3;
            final String s2 = s3 = b(((AccessibilityNodeInfo$AccessibilityAction)c.a).getId());
            if (s2.equals((Object)"ACTION_UNKNOWN")) {
                final Object a6 = c.a;
                s3 = s2;
                if (((AccessibilityNodeInfo$AccessibilityAction)a6).getLabel() != null) {
                    s3 = ((AccessibilityNodeInfo$AccessibilityAction)a6).getLabel().toString();
                }
            }
            sb.append(s3);
            if (i != emptyList.size() - 1) {
                sb.append(", ");
            }
            ++i;
        }
        sb.append("]");
        return sb.toString();
    }
}
