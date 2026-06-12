package j;

import android.widget.ArrayAdapter;

public final class e extends ArrayAdapter
{
    public final long getItemId(final int n) {
        return n;
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
