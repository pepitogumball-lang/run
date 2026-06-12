package j;

import android.content.Context;
import n.m;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ContextThemeWrapper;

public final class d
{
    public final ContextThemeWrapper a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public String f;
    public CharSequence g;
    public DialogInterface$OnClickListener h;
    public CharSequence i;
    public DialogInterface$OnClickListener j;
    public DialogInterface$OnCancelListener k;
    public m l;
    public Object m;
    public DialogInterface$OnClickListener n;
    public boolean o;
    public int p;
    
    public d(final ContextThemeWrapper a) {
        this.p = -1;
        this.a = a;
        this.b = (LayoutInflater)((Context)a).getSystemService("layout_inflater");
    }
}
