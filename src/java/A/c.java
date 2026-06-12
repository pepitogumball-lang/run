package A;

import android.view.ViewGroup;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.view.ViewGroup$LayoutParams;
import java.util.Arrays;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import x.b;
import android.content.Context;
import android.view.View;

public abstract class c extends View
{
    public int[] C;
    public int D;
    public Context E;
    public b F;
    public String G;
    public String H;
    public HashMap I;
    
    public final void a(final String s) {
        if (s == null) {
            return;
        }
        if (s.length() == 0) {
            return;
        }
        final Context e = this.E;
        if (e == null) {
            return;
        }
        final String trim = s.trim();
        if (this.getParent() instanceof ConstraintLayout) {
            final ConstraintLayout constraintLayout = (ConstraintLayout)this.getParent();
        }
        ConstraintLayout constraintLayout2;
        if (this.getParent() instanceof ConstraintLayout) {
            constraintLayout2 = (ConstraintLayout)this.getParent();
        }
        else {
            constraintLayout2 = null;
        }
        int intValue = 0;
        Label_0149: {
            if (this.isInEditMode() && constraintLayout2 != null) {
                Object value = null;
                Label_0127: {
                    if (trim != null) {
                        final HashMap o = constraintLayout2.O;
                        if (o != null && o.containsKey((Object)trim)) {
                            value = constraintLayout2.O.get((Object)trim);
                            break Label_0127;
                        }
                    }
                    value = null;
                }
                if (value instanceof Integer) {
                    intValue = (int)value;
                    break Label_0149;
                }
            }
            intValue = 0;
        }
        int n = intValue;
        if (intValue == 0) {
            n = intValue;
            if (constraintLayout2 != null) {
                n = this.d(constraintLayout2, trim);
            }
        }
        while (true) {
            int int1;
            if ((int1 = n) != 0) {
                break Label_0187;
            }
            try {
                int1 = r.class.getField(trim).getInt((Object)null);
                if ((n = int1) == 0) {
                    n = e.getResources().getIdentifier(trim, "id", e.getPackageName());
                }
                if (n != 0) {
                    this.I.put((Object)n, (Object)trim);
                    this.b(n);
                }
                else {
                    final StringBuilder sb = new StringBuilder("Could not find id of \"");
                    sb.append(trim);
                    sb.append("\"");
                    Log.w("ConstraintHelper", sb.toString());
                }
            }
            catch (final Exception ex) {
                int1 = n;
                continue;
            }
            break;
        }
    }
    
    public final void b(final int n) {
        if (n == this.getId()) {
            return;
        }
        final int d = this.D;
        final int[] c = this.C;
        if (d + 1 > c.length) {
            this.C = Arrays.copyOf(c, c.length * 2);
        }
        final int[] c2 = this.C;
        final int d2 = this.D;
        c2[d2] = n;
        this.D = d2 + 1;
    }
    
    public final void c(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                if (this.E == null) {
                    return;
                }
                final String trim = s.trim();
                Object o;
                if (this.getParent() instanceof ConstraintLayout) {
                    o = this.getParent();
                }
                else {
                    o = null;
                }
                if (o == null) {
                    Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                    return;
                }
                for (int childCount = ((ViewGroup)o).getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = ((ViewGroup)o).getChildAt(i);
                    final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
                    if (layoutParams instanceof e && trim.equals((Object)((e)layoutParams).Y)) {
                        if (child.getId() == -1) {
                            final StringBuilder sb = new StringBuilder("to use ConstraintTag view ");
                            sb.append(child.getClass().getSimpleName());
                            sb.append(" must have an ID");
                            Log.w("ConstraintHelper", sb.toString());
                        }
                        else {
                            this.b(child.getId());
                        }
                    }
                }
            }
        }
    }
    
    public final int d(final ConstraintLayout constraintLayout, final String s) {
        if (s != null) {
            if (constraintLayout != null) {
                final Resources resources = this.E.getResources();
                if (resources == null) {
                    return 0;
                }
                for (int childCount = ((ViewGroup)constraintLayout).getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = ((ViewGroup)constraintLayout).getChildAt(i);
                    if (child.getId() != -1) {
                        String resourceEntryName;
                        try {
                            resourceEntryName = resources.getResourceEntryName(child.getId());
                        }
                        catch (final Resources$NotFoundException ex) {
                            resourceEntryName = null;
                        }
                        if (s.equals((Object)resourceEntryName)) {
                            return child.getId();
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    public final void e() {
        if (this.F == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof e) {
            ((e)layoutParams).p0 = (x.e)this.F;
        }
    }
    
    public int[] getReferencedIds() {
        return Arrays.copyOf(this.C, this.D);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final String g = this.G;
        if (g != null) {
            this.setIds(g);
        }
        final String h = this.H;
        if (h != null) {
            this.setReferenceTags(h);
        }
    }
    
    public final void onDraw(final Canvas canvas) {
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setIds(final String g) {
        this.G = g;
        if (g == null) {
            return;
        }
        int n = 0;
        this.D = 0;
        while (true) {
            final int index = g.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.a(g.substring(n, index));
            n = index + 1;
        }
        this.a(g.substring(n));
    }
    
    public void setReferenceTags(final String h) {
        this.H = h;
        if (h == null) {
            return;
        }
        int n = 0;
        this.D = 0;
        while (true) {
            final int index = h.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.c(h.substring(n, index));
            n = index + 1;
        }
        this.c(h.substring(n));
    }
    
    public void setReferencedIds(final int[] array) {
        this.G = null;
        int i = 0;
        this.D = 0;
        while (i < array.length) {
            this.b(array[i]);
            ++i;
        }
    }
    
    public final void setTag(final int n, final Object o) {
        super.setTag(n, o);
        if (o == null && this.G == null) {
            this.b(n);
        }
    }
}
