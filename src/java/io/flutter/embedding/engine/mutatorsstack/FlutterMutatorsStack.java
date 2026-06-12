package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Path$Direction;
import android.graphics.RectF;
import android.graphics.Rect;
import java.util.ArrayList;
import C3.f;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;
import androidx.annotation.Keep;

@Keep
public class FlutterMutatorsStack
{
    private List<Path> finalClippingPaths;
    private Matrix finalMatrix;
    private float finalOpacity;
    private List<f> mutators;
    
    public FlutterMutatorsStack() {
        this.mutators = (List<f>)new ArrayList();
        this.finalMatrix = new Matrix();
        this.finalClippingPaths = (List<Path>)new ArrayList();
        this.finalOpacity = 1.0f;
    }
    
    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }
    
    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }
    
    public float getFinalOpacity() {
        return this.finalOpacity;
    }
    
    public List<f> getMutators() {
        return this.mutators;
    }
    
    public void pushClipPath(final Path path) {
        this.mutators.add((Object)new f(1));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add((Object)path);
    }
    
    public void pushClipRRect(final int n, final int n2, final int n3, final int n4, final float[] array) {
        final Rect rect = new Rect(n, n2, n3, n4);
        this.mutators.add((Object)new f(1));
        final Path path = new Path();
        path.addRoundRect(new RectF(rect), array, Path$Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add((Object)path);
    }
    
    public void pushClipRect(final int n, final int n2, final int n3, final int n4) {
        final Rect rect = new Rect(n, n2, n3, n4);
        this.mutators.add((Object)new f(1));
        final Path path = new Path();
        path.addRect(new RectF(rect), Path$Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add((Object)path);
    }
    
    public void pushOpacity(final float n) {
        this.mutators.add((Object)new f(1));
        this.finalOpacity *= n;
    }
    
    public void pushTransform(final float[] values) {
        final Matrix matrix = new Matrix();
        matrix.setValues(values);
        this.mutators.add((Object)new f(1));
        this.finalMatrix.preConcat(matrix);
    }
}
