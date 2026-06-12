package A;

import android.content.res.TypedArray;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.XmlResourceParser;
import android.content.Context;

public final class h
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    
    public h(final Context context, final XmlResourceParser xmlResourceParser) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)xmlResourceParser), s.j);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                final int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                final String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals((Object)resourceTypeName)) {
                    new o().a(context, resourceId);
                }
            }
            else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            }
            else if (index == 2) {
                this.b = obtainStyledAttributes.getDimension(index, this.b);
            }
            else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            }
            else if (index == 4) {
                this.a = obtainStyledAttributes.getDimension(index, this.a);
            }
            else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
