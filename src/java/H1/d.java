package h1;

import androidx.appcompat.widget.ActionBarContextView;
import O.e0;

public final class d implements e0
{
    public boolean a;
    public int b;
    public Object c;
    
    public void a() {
        if (this.a) {
            return;
        }
        final ActionBarContextView actionBarContextView = (ActionBarContextView)this.c;
        actionBarContextView.H = null;
        ActionBarContextView.b(actionBarContextView, this.b);
    }
    
    public void b() {
        this.a = true;
    }
    
    public void c() {
        ActionBarContextView.a((ActionBarContextView)this.c);
        this.a = false;
    }
}
