package o;

import android.widget.ProgressBar;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import I.h;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import c0.j;
import c0.k;
import J5.b;
import a0.i;
import com.google.android.gms.internal.auth.l;
import c0.c;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimationDrawable;
import w2.e;
import i.a;
import android.util.AttributeSet;
import c0.g;
import android.text.method.NumberKeyListener;
import android.text.method.KeyListener;
import V4.G;
import android.widget.EditText;
import android.widget.AbsSeekBar;
import android.view.View;

public class x
{
    public static final int[] d;
    public final int a;
    public View b;
    public Object c;
    
    static {
        d = new int[] { 16843067, 16843068 };
    }
    
    public x(final AbsSeekBar b) {
        this.a = 0;
        this.b = (View)b;
    }
    
    public x(final EditText b) {
        this.a = 1;
        this.b = (View)b;
        this.c = new G(b);
    }
    
    public KeyListener a(final KeyListener keyListener) {
        Object o = keyListener;
        if (!(keyListener instanceof NumberKeyListener)) {
            ((G)this.c).D.getClass();
            if (keyListener instanceof g) {
                o = keyListener;
            }
            else if (keyListener == null) {
                o = null;
            }
            else if (keyListener instanceof NumberKeyListener) {
                o = keyListener;
            }
            else {
                o = new g(keyListener);
            }
        }
        return (KeyListener)o;
    }
    
    public void b(AttributeSet obtainStyledAttributes, int i) {
        switch (this.a) {
            default: {
                obtainStyledAttributes = (AttributeSet)((View)this.b).getContext().obtainStyledAttributes(obtainStyledAttributes, i.a.i, i, 0);
                Label_0088: {
                    boolean boolean1;
                    try {
                        final boolean hasValue = ((TypedArray)obtainStyledAttributes).hasValue(14);
                        boolean1 = true;
                        if (hasValue) {
                            boolean1 = ((TypedArray)obtainStyledAttributes).getBoolean(14, true);
                        }
                    }
                    finally {
                        break Label_0088;
                    }
                    ((TypedArray)obtainStyledAttributes).recycle();
                    this.d(boolean1);
                    return;
                }
                ((TypedArray)obtainStyledAttributes).recycle();
                break;
            }
            case 0: {
                final AbsSeekBar absSeekBar = (AbsSeekBar)this.b;
                final e h = e.H(((View)absSeekBar).getContext(), obtainStyledAttributes, x.d, i);
                final Drawable b = h.B(0);
                if (b != null) {
                    Object indeterminateDrawable = b;
                    if (b instanceof AnimationDrawable) {
                        final AnimationDrawable animationDrawable = (AnimationDrawable)b;
                        final int numberOfFrames = animationDrawable.getNumberOfFrames();
                        indeterminateDrawable = new AnimationDrawable();
                        ((AnimationDrawable)indeterminateDrawable).setOneShot(animationDrawable.isOneShot());
                        Drawable e;
                        for (i = 0; i < numberOfFrames; ++i) {
                            e = this.e(animationDrawable.getFrame(i), true);
                            e.setLevel(10000);
                            ((AnimationDrawable)indeterminateDrawable).addFrame(e, animationDrawable.getDuration(i));
                        }
                        ((Drawable)indeterminateDrawable).setLevel(10000);
                    }
                    ((ProgressBar)absSeekBar).setIndeterminateDrawable((Drawable)indeterminateDrawable);
                }
                final Drawable b2 = h.B(1);
                if (b2 != null) {
                    ((ProgressBar)absSeekBar).setProgressDrawable(this.e(b2, false));
                }
                h.K();
            }
        }
    }
    
    public c c(InputConnection inputConnection, final EditorInfo editorInfo) {
        final G g = (G)this.c;
        if (inputConnection == null) {
            g.getClass();
            inputConnection = null;
        }
        else {
            final l l = (l)g.D;
            l.getClass();
            if (!(inputConnection instanceof c)) {
                inputConnection = (InputConnection)new c((EditText)l.D, inputConnection, editorInfo);
            }
        }
        return (c)inputConnection;
    }
    
    public void d(final boolean e) {
        final Object o = ((l)((G)this.c).D).E;
        if (((k)o).E != e) {
            if (((k)o).D != null) {
                final i a = i.a();
                final j d = ((k)o).D;
                a.getClass();
                J5.b.j("initCallback cannot be null", (Object)d);
                final ReentrantReadWriteLock a2 = a.a;
                a2.writeLock().lock();
                try {
                    a.b.remove(d);
                }
                finally {
                    a2.writeLock().unlock();
                }
            }
            ((k)o).E = e;
            if (e) {
                k.a(((k)o).C, i.a().b());
            }
        }
    }
    
    public Drawable e(final Drawable drawable, final boolean b) {
        if (drawable instanceof I.g) {
            ((h)drawable).getClass();
        }
        else {
            if (drawable instanceof LayerDrawable) {
                final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                final int numberOfLayers = layerDrawable.getNumberOfLayers();
                final Drawable[] array = new Drawable[numberOfLayers];
                final int n = 0;
                for (int i = 0; i < numberOfLayers; ++i) {
                    final int id = layerDrawable.getId(i);
                    array[i] = this.e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                final LayerDrawable layerDrawable2 = new LayerDrawable(array);
                for (int j = n; j < numberOfLayers; ++j) {
                    layerDrawable2.setId(j, layerDrawable.getId(j));
                    layerDrawable2.setLayerGravity(j, layerDrawable.getLayerGravity(j));
                    layerDrawable2.setLayerWidth(j, layerDrawable.getLayerWidth(j));
                    layerDrawable2.setLayerHeight(j, layerDrawable.getLayerHeight(j));
                    layerDrawable2.setLayerInsetLeft(j, layerDrawable.getLayerInsetLeft(j));
                    layerDrawable2.setLayerInsetRight(j, layerDrawable.getLayerInsetRight(j));
                    layerDrawable2.setLayerInsetTop(j, layerDrawable.getLayerInsetTop(j));
                    layerDrawable2.setLayerInsetBottom(j, layerDrawable.getLayerInsetBottom(j));
                    layerDrawable2.setLayerInsetStart(j, layerDrawable.getLayerInsetStart(j));
                    layerDrawable2.setLayerInsetEnd(j, layerDrawable.getLayerInsetEnd(j));
                }
                return (Drawable)layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                final Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.c == null) {
                    this.c = bitmap;
                }
                final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[] { 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f }, (RectF)null, (float[])null));
                shapeDrawable.getPaint().setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.REPEAT, Shader$TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                Object o = shapeDrawable;
                if (b) {
                    o = new ClipDrawable((Drawable)shapeDrawable, 3, 1);
                }
                return (Drawable)o;
            }
        }
        return drawable;
    }
}
