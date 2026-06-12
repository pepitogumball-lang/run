package z4;

import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import org.json.JSONArray;
import android.content.res.XmlResourceParser;
import L3.t;
import android.content.Context;

public abstract class a
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    
    static {
        a = d.class.getName().concat(".aot-shared-library-name");
        b = d.class.getName().concat(".vm-snapshot-data");
        c = d.class.getName().concat(".isolate-snapshot-data");
        d = d.class.getName().concat(".flutter-assets-dir");
    }
    
    public static t a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //     4: aload_0        
        //     5: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //     8: sipush          128
        //    11: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    14: astore          5
        //    16: aload           5
        //    18: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    21: astore_3       
        //    22: aload_3        
        //    23: ifnonnull       31
        //    26: aconst_null    
        //    27: astore_3       
        //    28: goto            40
        //    31: aload_3        
        //    32: getstatic       z4/a.a:Ljava/lang/String;
        //    35: aconst_null    
        //    36: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    39: astore_3       
        //    40: aload           5
        //    42: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    45: astore          4
        //    47: aload           4
        //    49: ifnonnull       55
        //    52: goto            65
        //    55: aload           4
        //    57: getstatic       z4/a.b:Ljava/lang/String;
        //    60: aconst_null    
        //    61: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    64: pop            
        //    65: aload           5
        //    67: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    70: astore          4
        //    72: aload           4
        //    74: ifnonnull       80
        //    77: goto            90
        //    80: aload           4
        //    82: getstatic       z4/a.c:Ljava/lang/String;
        //    85: aconst_null    
        //    86: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    89: pop            
        //    90: aload           5
        //    92: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    95: astore          4
        //    97: aload           4
        //    99: ifnonnull       108
        //   102: aconst_null    
        //   103: astore          4
        //   105: goto            119
        //   108: aload           4
        //   110: getstatic       z4/a.d:Ljava/lang/String;
        //   113: aconst_null    
        //   114: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   117: astore          4
        //   119: aload           5
        //   121: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //   124: astore          6
        //   126: aload           6
        //   128: ifnonnull       136
        //   131: aconst_null    
        //   132: astore_0       
        //   133: goto            231
        //   136: aload           6
        //   138: ldc             "io.flutter.network-policy"
        //   140: iconst_0       
        //   141: invokevirtual   android/os/BaseBundle.getInt:(Ljava/lang/String;I)I
        //   144: istore_1       
        //   145: iload_1        
        //   146: ifgt            152
        //   149: goto            131
        //   152: new             Lorg/json/JSONArray;
        //   155: dup            
        //   156: invokespecial   org/json/JSONArray.<init>:()V
        //   159: astore          6
        //   161: aload_0        
        //   162: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   165: iload_1        
        //   166: invokevirtual   android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
        //   169: astore_0       
        //   170: aload_0        
        //   171: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   176: pop            
        //   177: aload_0        
        //   178: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //   183: istore_1       
        //   184: iload_1        
        //   185: iconst_1       
        //   186: if_icmpeq       225
        //   189: iload_1        
        //   190: iconst_2       
        //   191: if_icmpne       215
        //   194: aload_0        
        //   195: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   200: ldc             "domain-config"
        //   202: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   205: ifeq            215
        //   208: aload_0        
        //   209: aload           6
        //   211: iconst_0       
        //   212: invokestatic    z4/a.b:(Landroid/content/res/XmlResourceParser;Lorg/json/JSONArray;Z)V
        //   215: aload_0        
        //   216: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   221: istore_1       
        //   222: goto            184
        //   225: aload           6
        //   227: invokevirtual   org/json/JSONArray.toString:()Ljava/lang/String;
        //   230: astore_0       
        //   231: aload           5
        //   233: getfield        android/content/pm/ApplicationInfo.nativeLibraryDir:Ljava/lang/String;
        //   236: astore          6
        //   238: aload           5
        //   240: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //   243: astore          5
        //   245: aload           5
        //   247: ifnonnull       255
        //   250: iconst_1       
        //   251: istore_2       
        //   252: goto            264
        //   255: aload           5
        //   257: ldc             "io.flutter.automatically-register-plugins"
        //   259: iconst_1       
        //   260: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //   263: istore_2       
        //   264: new             LL3/t;
        //   267: dup            
        //   268: aload_3        
        //   269: aload           4
        //   271: aload_0        
        //   272: aload           6
        //   274: iload_2        
        //   275: invokespecial   L3/t.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   278: areturn        
        //   279: astore_0       
        //   280: new             Ljava/lang/RuntimeException;
        //   283: dup            
        //   284: aload_0        
        //   285: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   288: athrow         
        //   289: astore_0       
        //   290: goto            131
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      16     279    289    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  161    184    289    293    Ljava/io/IOException;
        //  161    184    289    293    Lorg/xmlpull/v1/XmlPullParserException;
        //  194    215    289    293    Ljava/io/IOException;
        //  194    215    289    293    Lorg/xmlpull/v1/XmlPullParserException;
        //  215    222    289    293    Ljava/io/IOException;
        //  215    222    289    293    Lorg/xmlpull/v1/XmlPullParserException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0184:
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
    
    public static void b(final XmlResourceParser xmlResourceParser, final JSONArray jsonArray, final boolean b) {
        final boolean attributeBooleanValue = ((AttributeSet)xmlResourceParser).getAttributeBooleanValue((String)null, "cleartextTrafficPermitted", b);
        while (true) {
            final int next = ((XmlPullParser)xmlResourceParser).next();
            if (next == 2) {
                if (((XmlPullParser)xmlResourceParser).getName().equals((Object)"domain")) {
                    final boolean attributeBooleanValue2 = ((AttributeSet)xmlResourceParser).getAttributeBooleanValue((String)null, "includeSubdomains", false);
                    ((XmlPullParser)xmlResourceParser).next();
                    if (((XmlPullParser)xmlResourceParser).getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    final String trim = ((XmlPullParser)xmlResourceParser).getText().trim();
                    final JSONArray jsonArray2 = new JSONArray();
                    jsonArray2.put((Object)trim);
                    jsonArray2.put(attributeBooleanValue2);
                    jsonArray2.put(attributeBooleanValue);
                    jsonArray.put((Object)jsonArray2);
                    ((XmlPullParser)xmlResourceParser).next();
                    if (((XmlPullParser)xmlResourceParser).getEventType() == 3) {
                        continue;
                    }
                    throw new IllegalStateException("Expected end of domain tag");
                }
                else if (((XmlPullParser)xmlResourceParser).getName().equals((Object)"domain-config")) {
                    b(xmlResourceParser, jsonArray, attributeBooleanValue);
                }
                else {
                    final String name = ((XmlPullParser)xmlResourceParser).getName();
                    for (int n = ((XmlPullParser)xmlResourceParser).getEventType(); n != 3 || ((XmlPullParser)xmlResourceParser).getName() != name; n = ((XmlPullParser)xmlResourceParser).next()) {}
                }
            }
            else {
                if (next == 3) {
                    return;
                }
                continue;
            }
        }
    }
}
