package H;

import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.Font$Builder;
import java.io.InputStream;
import L.g;
import android.graphics.Typeface;
import android.content.res.Resources;
import G.f;
import android.content.Context;
import android.graphics.fonts.FontStyle;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import com.google.android.gms.internal.auth.m;

public final class k extends m
{
    public static Font G(final FontFamily fontFamily, int i) {
        int n;
        if ((i & 0x1) != 0x0) {
            n = 700;
        }
        else {
            n = 400;
        }
        final int n2 = 1;
        if ((i & 0x2) != 0x0) {
            i = 1;
        }
        else {
            i = 0;
        }
        final FontStyle fontStyle = new FontStyle(n, i);
        Font font = fontFamily.getFont(0);
        final int h = H(fontStyle, font.getStyle());
        i = n2;
        int n3 = h;
        while (i < fontFamily.getSize()) {
            final Font font2 = fontFamily.getFont(i);
            final int h2 = H(fontStyle, font2.getStyle());
            int n4;
            if (h2 < (n4 = n3)) {
                font = font2;
                n4 = h2;
            }
            ++i;
            n3 = n4;
        }
        return font;
    }
    
    public static int H(final FontStyle fontStyle, final FontStyle fontStyle2) {
        final int n = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        int n2;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            n2 = 0;
        }
        else {
            n2 = 2;
        }
        return n + n2;
    }
    
    public final Typeface h(final Context p0, final f p1, final Resources p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          7
        //     3: aload_2        
        //     4: getfield        G/f.a:[LG/g;
        //     7: astore          8
        //     9: aload           8
        //    11: arraylength    
        //    12: istore          6
        //    14: iconst_0       
        //    15: istore          5
        //    17: aconst_null    
        //    18: astore_1       
        //    19: iload           5
        //    21: iload           6
        //    23: if_icmpge       117
        //    26: aload           8
        //    28: iload           5
        //    30: aaload         
        //    31: astore          9
        //    33: new             Landroid/graphics/fonts/Font$Builder;
        //    36: astore_2       
        //    37: aload_2        
        //    38: aload_3        
        //    39: aload           9
        //    41: getfield        G/g.f:I
        //    44: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/content/res/Resources;I)V
        //    47: aload_2        
        //    48: aload           9
        //    50: getfield        G/g.b:I
        //    53: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //    56: aload           9
        //    58: getfield        G/g.c:Z
        //    61: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //    64: aload           9
        //    66: getfield        G/g.e:I
        //    69: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //    72: aload           9
        //    74: getfield        G/g.d:Ljava/lang/String;
        //    77: invokevirtual   android/graphics/fonts/Font$Builder.setFontVariationSettings:(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;
        //    80: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //    83: astore          9
        //    85: aload_1        
        //    86: ifnonnull       104
        //    89: new             Landroid/graphics/fonts/FontFamily$Builder;
        //    92: astore_2       
        //    93: aload_2        
        //    94: aload           9
        //    96: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //    99: aload_2        
        //   100: astore_1       
        //   101: goto            111
        //   104: aload_1        
        //   105: aload           9
        //   107: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   110: pop            
        //   111: iinc            5, 1
        //   114: goto            19
        //   117: aload_1        
        //   118: ifnonnull       123
        //   121: aconst_null    
        //   122: areturn        
        //   123: aload_1        
        //   124: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   127: astore_2       
        //   128: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   131: astore_1       
        //   132: aload_1        
        //   133: aload_2        
        //   134: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   137: aload_1        
        //   138: aload_2        
        //   139: iload           4
        //   141: invokestatic    H/k.G:(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
        //   144: invokevirtual   android/graphics/fonts/Font.getStyle:()Landroid/graphics/fonts/FontStyle;
        //   147: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   150: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   153: astore_1       
        //   154: aload_1        
        //   155: areturn        
        //   156: astore_1       
        //   157: aload           7
        //   159: astore_1       
        //   160: goto            154
        //   163: astore_2       
        //   164: goto            111
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      14     156    163    Ljava/lang/Exception;
        //  33     85     163    167    Ljava/io/IOException;
        //  33     85     156    163    Ljava/lang/Exception;
        //  89     99     163    167    Ljava/io/IOException;
        //  89     99     156    163    Ljava/lang/Exception;
        //  104    111    163    167    Ljava/io/IOException;
        //  104    111    156    163    Ljava/lang/Exception;
        //  123    154    156    163    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final Typeface i(final Context p0, final g[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore          7
        //     6: aload_2        
        //     7: arraylength    
        //     8: istore          5
        //    10: iconst_0       
        //    11: istore          4
        //    13: aconst_null    
        //    14: astore_1       
        //    15: iload           4
        //    17: iload           5
        //    19: if_icmpge       187
        //    22: aload_2        
        //    23: iload           4
        //    25: aaload         
        //    26: astore          9
        //    28: aload_1        
        //    29: astore          6
        //    31: aload           7
        //    33: aload           9
        //    35: getfield        L/g.a:Landroid/net/Uri;
        //    38: ldc             "r"
        //    40: aconst_null    
        //    41: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    44: astore          8
        //    46: aload           8
        //    48: ifnonnull       73
        //    51: aload_1        
        //    52: astore          6
        //    54: aload           8
        //    56: ifnull          178
        //    59: aload_1        
        //    60: astore          6
        //    62: aload           8
        //    64: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    67: aload_1        
        //    68: astore          6
        //    70: goto            178
        //    73: new             Landroid/graphics/fonts/Font$Builder;
        //    76: astore          6
        //    78: aload           6
        //    80: aload           8
        //    82: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/os/ParcelFileDescriptor;)V
        //    85: aload           6
        //    87: aload           9
        //    89: getfield        L/g.c:I
        //    92: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //    95: aload           9
        //    97: getfield        L/g.d:Z
        //   100: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //   103: aload           9
        //   105: getfield        L/g.b:I
        //   108: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //   111: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //   114: astore          6
        //   116: aload_1        
        //   117: ifnonnull       142
        //   120: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   123: dup            
        //   124: aload           6
        //   126: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   129: astore          6
        //   131: aload           6
        //   133: astore_1       
        //   134: goto            59
        //   137: astore          9
        //   139: goto            152
        //   142: aload_1        
        //   143: aload           6
        //   145: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   148: pop            
        //   149: goto            59
        //   152: aload           8
        //   154: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   157: goto            172
        //   160: astore          8
        //   162: aload_1        
        //   163: astore          6
        //   165: aload           9
        //   167: aload           8
        //   169: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   172: aload_1        
        //   173: astore          6
        //   175: aload           9
        //   177: athrow         
        //   178: iinc            4, 1
        //   181: aload           6
        //   183: astore_1       
        //   184: goto            15
        //   187: aload_1        
        //   188: ifnonnull       193
        //   191: aconst_null    
        //   192: areturn        
        //   193: aload_1        
        //   194: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   197: astore_1       
        //   198: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   201: astore_2       
        //   202: aload_2        
        //   203: aload_1        
        //   204: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   207: aload_2        
        //   208: aload_1        
        //   209: iload_3        
        //   210: invokestatic    H/k.G:(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
        //   213: invokevirtual   android/graphics/fonts/Font.getStyle:()Landroid/graphics/fonts/FontStyle;
        //   216: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   219: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   222: astore_1       
        //   223: aload_1        
        //   224: areturn        
        //   225: astore_1       
        //   226: aconst_null    
        //   227: areturn        
        //   228: astore_1       
        //   229: goto            178
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      10     225    228    Ljava/lang/Exception;
        //  31     46     228    232    Ljava/io/IOException;
        //  31     46     225    228    Ljava/lang/Exception;
        //  62     67     228    232    Ljava/io/IOException;
        //  62     67     225    228    Ljava/lang/Exception;
        //  73     116    137    178    Any
        //  120    131    137    178    Any
        //  142    149    137    178    Any
        //  152    157    160    172    Any
        //  165    172    228    232    Ljava/io/IOException;
        //  165    172    225    228    Ljava/lang/Exception;
        //  175    178    228    232    Ljava/io/IOException;
        //  175    178    225    228    Ljava/lang/Exception;
        //  193    223    225    228    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final Typeface j(final Context context, final InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
    
    public final Typeface k(final Context context, final Resources resources, final int n, final String s, final int n2) {
        try {
            final Font build = new Font$Builder(resources, n).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public final g l(final g[] array, final int n) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
