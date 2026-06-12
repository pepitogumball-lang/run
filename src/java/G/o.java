package G;

public final class o
{
    public static final o k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;
    
    static {
        final float[] c = b.c;
        final float n = (float)(b.h() * 63.66197723675813 / 100.0);
        final float[][] a = b.a;
        final float n2 = c[0];
        final float[] array = a[0];
        final float n3 = array[0];
        final float n4 = c[1];
        final float n5 = array[1];
        final float n6 = c[2];
        final float n7 = array[2] * n6 + (n5 * n4 + n3 * n2);
        final float[] array2 = a[1];
        final float n8 = array2[2] * n6 + (array2[1] * n4 + array2[0] * n2);
        final float[] array3 = a[2];
        final float n9 = n6 * array3[2] + (n4 * array3[1] + n2 * array3[0]);
        float n10;
        if (1.0f >= 0.9) {
            n10 = 0.69f;
        }
        else {
            n10 = 0.655f;
        }
        float n11 = (1.0f - (float)Math.exp((double)((-n - 42.0f) / 92.0f)) * 0.2777778f) * 1.0f;
        final double n12 = n11;
        if (n12 > 1.0) {
            n11 = 1.0f;
        }
        else if (n12 < 0.0) {
            n11 = 0.0f;
        }
        final float[] array4 = { 100.0f / n7 * n11 + 1.0f - n11, 100.0f / n8 * n11 + 1.0f - n11, 100.0f / n9 * n11 + 1.0f - n11 };
        final float n13 = 1.0f / (5.0f * n + 1.0f);
        final float n14 = n13 * n13 * n13 * n13;
        final float n15 = 1.0f - n14;
        final float n16 = 0.1f * n15 * n15 * (float)Math.cbrt(n * 5.0) + n14 * n;
        final float n17 = b.h() / c[1];
        final double n18 = n17;
        final float n19 = (float)Math.sqrt(n18);
        final float n20 = 0.725f / (float)Math.pow(n18, 0.2);
        final float[] array5 = { (float)Math.pow(array4[0] * n16 * n7 / 100.0, 0.42), (float)Math.pow(array4[1] * n16 * n8 / 100.0, 0.42), (float)Math.pow(array4[2] * n16 * n9 / 100.0, 0.42) };
        final float n21 = array5[0];
        final float n22 = n21 * 400.0f / (n21 + 27.13f);
        final float n23 = array5[1];
        final float n24 = n23 * 400.0f / (n23 + 27.13f);
        final float n25 = array5[2];
        final float[] array6 = { n22, n24, 400.0f * n25 / (n25 + 27.13f) };
        k = new o(n17, (array6[2] * 0.05f + (array6[0] * 2.0f + array6[1])) * n20, n20, n20, n10, 1.0f, array4, n16, (float)Math.pow((double)n16, 0.25), n19 + 1.48f);
    }
    
    public o(final float f, final float a, final float b, final float c, final float d, final float e, final float[] g, final float h, final float i, final float j) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
}
