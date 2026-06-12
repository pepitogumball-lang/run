package j;

import android.os.Handler;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.a;
import java.lang.ref.WeakReference;
import android.widget.ListAdapter;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.core.widget.NestedScrollView;
import android.os.Message;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertController$RecycleListView;
import android.view.Window;
import android.content.Context;
import H1.d;
import com.google.android.gms.internal.ads.HE;

public final class f
{
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final HE E;
    public final d F;
    public final Context a;
    public final g b;
    public final Window c;
    public CharSequence d;
    public String e;
    public AlertController$RecycleListView f;
    public FrameLayout g;
    public boolean h;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;
    public CharSequence p;
    public Message q;
    public NestedScrollView r;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    public ListAdapter x;
    public int y;
    public final int z;
    
    public f(final Context a, final g b, final Window c) {
        this.h = false;
        this.y = -1;
        this.F = new d((Object)this, 1);
        this.a = a;
        this.b = b;
        this.c = c;
        final HE e = new HE();
        e.b = new WeakReference((Object)b);
        this.E = e;
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes((AttributeSet)null, i.a.e, 2130903086, 0);
        this.z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.B = obtainStyledAttributes.getResourceId(7, 0);
        this.C = obtainStyledAttributes.getResourceId(3, 0);
        this.D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b.d().i(1);
    }
    
    public static boolean a(final View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        int i = viewGroup.getChildCount();
        while (i > 0) {
            if (a(viewGroup.getChildAt(--i))) {
                return true;
            }
        }
        return false;
    }
    
    public static ViewGroup b(View inflate, View inflate2) {
        if (inflate == null) {
            inflate = inflate2;
            if (inflate2 instanceof ViewStub) {
                inflate = ((ViewStub)inflate2).inflate();
            }
            return (ViewGroup)inflate;
        }
        if (inflate2 != null) {
            final ViewParent parent = inflate2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(inflate2);
            }
        }
        inflate2 = inflate;
        if (inflate instanceof ViewStub) {
            inflate2 = ((ViewStub)inflate).inflate();
        }
        return (ViewGroup)inflate2;
    }
    
    public final void c(final int n, final CharSequence p3, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        Message obtainMessage;
        if (dialogInterface$OnClickListener != null) {
            obtainMessage = ((Handler)this.E).obtainMessage(n, (Object)dialogInterface$OnClickListener);
        }
        else {
            obtainMessage = null;
        }
        if (n != -3) {
            if (n != -2) {
                if (n != -1) {
                    throw new IllegalArgumentException("Button does not exist");
                }
                this.j = p3;
                this.k = obtainMessage;
            }
            else {
                this.m = p3;
                this.n = obtainMessage;
            }
        }
        else {
            this.p = p3;
            this.q = obtainMessage;
        }
    }
}
