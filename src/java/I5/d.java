package I5;

import android.os.BaseBundle;
import java.util.AbstractCollection;
import android.text.method.TransformationMethod;
import android.text.InputFilter;
import android.view.WindowManager$LayoutParams;
import com.google.android.gms.internal.play_billing.q0;
import h1.E;
import h1.w;
import android.os.Bundle;
import java.util.Map$Entry;
import java.lang.reflect.Array;
import org.json.JSONArray;
import F1.n;
import F4.b;
import Z4.F;
import n5.h;
import Z4.i;
import android.os.Build$VERSION;
import android.widget.EdgeEffect;
import android.database.Cursor;
import java.util.Arrays;
import java.util.Collection;
import e3.g;
import java.util.Set;
import java.util.HashSet;
import e3.f;
import java.util.HashMap;
import java.util.ArrayList;
import Z4.B;
import e3.a;
import android.util.Log;
import java.util.List;
import android.graphics.Rect;
import java.util.Iterator;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.z7;
import com.google.android.gms.internal.ads.kt;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.bp;
import com.google.android.gms.internal.ads.Ys;
import com.google.android.gms.internal.ads.Bp;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import android.app.KeyguardManager;
import I1.M;
import E1.o;
import android.widget.ImageView$ScaleType;
import android.view.View;
import java.util.Map;
import com.google.android.gms.internal.auth.O;
import J1.e;
import org.json.JSONException;
import J1.j;
import F1.p;
import org.json.JSONObject;
import android.graphics.Point;
import android.content.Context;

public abstract class d
{
    public static c a;
    public static long b;
    
    public static JSONObject A(final String s, final Context context, final Point point, final Point point2) {
        JSONObject jsonObject = null;
        final Object o = null;
        JSONObject jsonObject7;
        try {
            final JSONObject jsonObject2 = new JSONObject();
            Label_0175: {
                Object o2 = null;
                Label_0151: {
                    try {
                        jsonObject = new JSONObject();
                        final Point point3 = point2;
                        final int n = point3.x;
                        final p p4 = p.f;
                        final JSONObject jsonObject3 = jsonObject;
                        final String s2 = "x";
                        final p p5 = p4;
                        final e e = p5.a;
                        final Context context2 = context;
                        final int n2 = n;
                        final int n3 = e.f(context2, n2);
                        jsonObject3.put(s2, n3);
                        final Point point4 = point2;
                        final int n4 = point4.y;
                        final JSONObject jsonObject4 = jsonObject;
                        final String s3 = "y";
                        final p p6 = p4;
                        final e e2 = p6.a;
                        final Context context3 = context;
                        final int n5 = n4;
                        final int n6 = e2.f(context3, n5);
                        jsonObject4.put(s3, n6);
                        final Point point5 = point;
                        final int n7 = point5.x;
                        final JSONObject jsonObject5 = jsonObject;
                        final String s4 = "start_x";
                        final p p7 = p4;
                        final e e3 = p7.a;
                        final Context context4 = context;
                        final int n8 = n7;
                        final int n9 = e3.f(context4, n8);
                        jsonObject5.put(s4, n9);
                        final Point point6 = point;
                        final int n10 = point6.y;
                        final JSONObject jsonObject6 = jsonObject;
                        final String s5 = "start_y";
                        final p p8 = p4;
                        final e e4 = p8.a;
                        final Context context5 = context;
                        final int n11 = n10;
                        final int n12 = e4.f(context5, n11);
                        jsonObject6.put(s5, n12);
                        o2 = jsonObject;
                        break Label_0151;
                    }
                    catch (final Exception ex) {
                        break Label_0175;
                    }
                    try {
                        final Point point3 = point2;
                        final int n = point3.x;
                        final p p4 = p.f;
                        final JSONObject jsonObject3 = jsonObject;
                        final String s2 = "x";
                        final p p5 = p4;
                        final e e = p5.a;
                        final Context context2 = context;
                        final int n2 = n;
                        final int n3 = e.f(context2, n2);
                        jsonObject3.put(s2, n3);
                        final Point point4 = point2;
                        final int n4 = point4.y;
                        final JSONObject jsonObject4 = jsonObject;
                        final String s3 = "y";
                        final p p6 = p4;
                        final e e2 = p6.a;
                        final Context context3 = context;
                        final int n5 = n4;
                        final int n6 = e2.f(context3, n5);
                        jsonObject4.put(s3, n6);
                        final Point point5 = point;
                        final int n7 = point5.x;
                        final JSONObject jsonObject5 = jsonObject;
                        final String s4 = "start_x";
                        final p p7 = p4;
                        final e e3 = p7.a;
                        final Context context4 = context;
                        final int n8 = n7;
                        final int n9 = e3.f(context4, n8);
                        jsonObject5.put(s4, n9);
                        final Point point6 = point;
                        final int n10 = point6.y;
                        final JSONObject jsonObject6 = jsonObject;
                        final String s5 = "start_y";
                        final p p8 = p4;
                        final e e4 = p8.a;
                        final Context context5 = context;
                        final int n11 = n10;
                        final int n12 = e4.f(context5, n11);
                        jsonObject6.put(s5, n12);
                        o2 = jsonObject;
                    }
                    catch (final JSONException ex2) {
                        j.g("Error occurred while putting signals into JSON object.", (Throwable)ex2);
                        o2 = o;
                    }
                }
                jsonObject2.put("click_point", o2);
                jsonObject2.put("asset_id", (Object)s);
                jsonObject7 = jsonObject2;
                return jsonObject7;
            }
            jsonObject7 = jsonObject2;
        }
        catch (final Exception ex) {
            jsonObject7 = jsonObject;
        }
        final Exception ex;
        j.g("Error occurred while grabbing click signals.", (Throwable)ex);
        return jsonObject7;
    }
    
    public static JSONObject C(final Context p0, final Map p1, final Map p2, final View p3, final ImageView$ScaleType p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          12
        //     3: new             Lorg/json/JSONObject;
        //     6: dup            
        //     7: invokespecial   org/json/JSONObject.<init>:()V
        //    10: astore          11
        //    12: aload           11
        //    14: astore          13
        //    16: aload_1        
        //    17: ifnull          794
        //    20: aload_3        
        //    21: ifnonnull       31
        //    24: aload           11
        //    26: astore          13
        //    28: goto            794
        //    31: iconst_2       
        //    32: newarray        I
        //    34: astore          10
        //    36: aload_3        
        //    37: aload           10
        //    39: invokevirtual   android/view/View.getLocationOnScreen:([I)V
        //    42: aload_1        
        //    43: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    48: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    53: astore_3       
        //    54: aload           11
        //    56: astore_1       
        //    57: aload_3        
        //    58: astore          11
        //    60: aload           12
        //    62: astore_3       
        //    63: aload_1        
        //    64: astore          13
        //    66: aload           11
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: ifeq            794
        //    76: aload           11
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: checkcast       Ljava/util/Map$Entry;
        //    86: astore          13
        //    88: aload           13
        //    90: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    95: checkcast       Ljava/lang/ref/WeakReference;
        //    98: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //   101: checkcast       Landroid/view/View;
        //   104: astore          14
        //   106: aload           14
        //   108: ifnull          63
        //   111: iconst_2       
        //   112: newarray        I
        //   114: astore          15
        //   116: aload           14
        //   118: aload           15
        //   120: invokevirtual   android/view/View.getLocationOnScreen:([I)V
        //   123: new             Lorg/json/JSONObject;
        //   126: dup            
        //   127: invokespecial   org/json/JSONObject.<init>:()V
        //   130: astore          12
        //   132: new             Lorg/json/JSONObject;
        //   135: dup            
        //   136: invokespecial   org/json/JSONObject.<init>:()V
        //   139: astore          17
        //   141: aload           14
        //   143: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   146: istore          8
        //   148: getstatic       F1/p.f:LF1/p;
        //   151: astore          16
        //   153: aload           16
        //   155: getfield        F1/p.a:LJ1/e;
        //   158: astore_3       
        //   159: aload           16
        //   161: getfield        F1/p.a:LJ1/e;
        //   164: astore          16
        //   166: aload           17
        //   168: ldc             "width"
        //   170: aload_3        
        //   171: aload_0        
        //   172: iload           8
        //   174: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   177: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   180: pop            
        //   181: aload           17
        //   183: ldc             "height"
        //   185: aload           16
        //   187: aload_0        
        //   188: aload           14
        //   190: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   193: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   196: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   199: pop            
        //   200: aload           17
        //   202: ldc             "x"
        //   204: aload           16
        //   206: aload_0        
        //   207: aload           15
        //   209: iconst_0       
        //   210: iaload         
        //   211: aload           10
        //   213: iconst_0       
        //   214: iaload         
        //   215: isub           
        //   216: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   219: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   222: pop            
        //   223: aload           17
        //   225: ldc             "y"
        //   227: aload           16
        //   229: aload_0        
        //   230: aload           15
        //   232: iconst_1       
        //   233: iaload         
        //   234: aload           10
        //   236: iconst_1       
        //   237: iaload         
        //   238: isub           
        //   239: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   242: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   245: pop            
        //   246: aload           17
        //   248: ldc             "relative_to"
        //   250: ldc             "ad_view"
        //   252: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   255: pop            
        //   256: aload           12
        //   258: ldc             "frame"
        //   260: aload           17
        //   262: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   265: pop            
        //   266: new             Landroid/graphics/Rect;
        //   269: astore_3       
        //   270: aload_3        
        //   271: invokespecial   android/graphics/Rect.<init>:()V
        //   274: aload           14
        //   276: aload_3        
        //   277: invokevirtual   android/view/View.getLocalVisibleRect:(Landroid/graphics/Rect;)Z
        //   280: ifeq            298
        //   283: aload_0        
        //   284: aload_3        
        //   285: invokestatic    I5/d.K:(Landroid/content/Context;Landroid/graphics/Rect;)Lorg/json/JSONObject;
        //   288: astore_3       
        //   289: goto            375
        //   292: astore_3       
        //   293: aload_2        
        //   294: astore_3       
        //   295: goto            785
        //   298: new             Lorg/json/JSONObject;
        //   301: astore_3       
        //   302: aload_3        
        //   303: invokespecial   org/json/JSONObject.<init>:()V
        //   306: aload_3        
        //   307: ldc             "width"
        //   309: iconst_0       
        //   310: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   313: pop            
        //   314: aload_3        
        //   315: ldc             "height"
        //   317: iconst_0       
        //   318: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   321: pop            
        //   322: aload_3        
        //   323: ldc             "x"
        //   325: aload           16
        //   327: aload_0        
        //   328: aload           15
        //   330: iconst_0       
        //   331: iaload         
        //   332: aload           10
        //   334: iconst_0       
        //   335: iaload         
        //   336: isub           
        //   337: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   340: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   343: pop            
        //   344: aload_3        
        //   345: ldc             "y"
        //   347: aload           16
        //   349: aload_0        
        //   350: aload           15
        //   352: iconst_1       
        //   353: iaload         
        //   354: aload           10
        //   356: iconst_1       
        //   357: iaload         
        //   358: isub           
        //   359: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   362: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   365: pop            
        //   366: aload_3        
        //   367: ldc             "relative_to"
        //   369: ldc             "ad_view"
        //   371: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   374: pop            
        //   375: aload           12
        //   377: ldc             "visible_bounds"
        //   379: aload_3        
        //   380: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   383: pop            
        //   384: aload           13
        //   386: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   391: checkcast       Ljava/lang/String;
        //   394: ldc             "3010"
        //   396: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   399: ifeq            626
        //   402: getstatic       com/google/android/gms/internal/ads/D7.H7:Lcom/google/android/gms/internal/ads/z7;
        //   405: astore          16
        //   407: getstatic       F1/q.d:LF1/q;
        //   410: astore_3       
        //   411: aload_3        
        //   412: getfield        F1/q.c:Lcom/google/android/gms/internal/ads/B7;
        //   415: astore          15
        //   417: aload_3        
        //   418: getfield        F1/q.c:Lcom/google/android/gms/internal/ads/B7;
        //   421: astore_3       
        //   422: aload           15
        //   424: aload           16
        //   426: invokevirtual   com/google/android/gms/internal/ads/B7.a:(Lcom/google/android/gms/internal/ads/z7;)Ljava/lang/Object;
        //   429: checkcast       Ljava/lang/Boolean;
        //   432: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   435: ifeq            454
        //   438: aload           12
        //   440: ldc             "mediaview_graphics_matrix"
        //   442: aload           14
        //   444: invokevirtual   android/view/View.getMatrix:()Landroid/graphics/Matrix;
        //   447: invokevirtual   android/graphics/Matrix.toShortString:()Ljava/lang/String;
        //   450: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   453: pop            
        //   454: aload_3        
        //   455: getstatic       com/google/android/gms/internal/ads/D7.I7:Lcom/google/android/gms/internal/ads/z7;
        //   458: invokevirtual   com/google/android/gms/internal/ads/B7.a:(Lcom/google/android/gms/internal/ads/z7;)Ljava/lang/Object;
        //   461: checkcast       Ljava/lang/Boolean;
        //   464: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   467: ifeq            513
        //   470: aload           14
        //   472: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   475: astore          15
        //   477: aload           12
        //   479: ldc             "view_width_layout_type"
        //   481: aload           15
        //   483: getfield        android/view/ViewGroup$LayoutParams.width:I
        //   486: invokestatic    I5/d.L:(I)I
        //   489: iconst_1       
        //   490: isub           
        //   491: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   494: pop            
        //   495: aload           12
        //   497: ldc             "view_height_layout_type"
        //   499: aload           15
        //   501: getfield        android/view/ViewGroup$LayoutParams.height:I
        //   504: invokestatic    I5/d.L:(I)I
        //   507: iconst_1       
        //   508: isub           
        //   509: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   512: pop            
        //   513: aload_3        
        //   514: getstatic       com/google/android/gms/internal/ads/D7.J7:Lcom/google/android/gms/internal/ads/z7;
        //   517: invokevirtual   com/google/android/gms/internal/ads/B7.a:(Lcom/google/android/gms/internal/ads/z7;)Ljava/lang/Object;
        //   520: checkcast       Ljava/lang/Boolean;
        //   523: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   526: ifeq            607
        //   529: new             Ljava/util/ArrayList;
        //   532: astore          15
        //   534: aload           15
        //   536: invokespecial   java/util/ArrayList.<init>:()V
        //   539: aload           15
        //   541: aload           14
        //   543: invokevirtual   android/view/View.getId:()I
        //   546: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   549: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   552: pop            
        //   553: aload           14
        //   555: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   558: astore_3       
        //   559: aload_3        
        //   560: instanceof      Landroid/view/View;
        //   563: ifeq            592
        //   566: aload           15
        //   568: aload_3        
        //   569: checkcast       Landroid/view/View;
        //   572: invokevirtual   android/view/View.getId:()I
        //   575: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   578: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   581: pop            
        //   582: aload_3        
        //   583: invokeinterface android/view/ViewParent.getParent:()Landroid/view/ViewParent;
        //   588: astore_3       
        //   589: goto            559
        //   592: aload           12
        //   594: ldc             "view_path"
        //   596: ldc             "/"
        //   598: aload           15
        //   600: invokestatic    android/text/TextUtils.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   603: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   606: pop            
        //   607: aload           4
        //   609: ifnull          626
        //   612: aload           12
        //   614: ldc_w           "mediaview_scale_type"
        //   617: aload           4
        //   619: invokevirtual   java/lang/Enum.ordinal:()I
        //   622: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   625: pop            
        //   626: aload           14
        //   628: instanceof      Landroid/widget/TextView;
        //   631: istore          9
        //   633: iload           9
        //   635: ifeq            704
        //   638: aload           14
        //   640: checkcast       Landroid/widget/TextView;
        //   643: astore_3       
        //   644: aload           12
        //   646: ldc_w           "text_color"
        //   649: aload_3        
        //   650: invokevirtual   android/widget/TextView.getCurrentTextColor:()I
        //   653: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   656: pop            
        //   657: aload_3        
        //   658: invokevirtual   android/widget/TextView.getTextSize:()F
        //   661: fstore          7
        //   663: fload           7
        //   665: f2d            
        //   666: dstore          5
        //   668: aload           12
        //   670: ldc_w           "font_size"
        //   673: dload           5
        //   675: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;D)Lorg/json/JSONObject;
        //   678: pop            
        //   679: aload           12
        //   681: ldc_w           "text"
        //   684: aload_3        
        //   685: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   688: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   691: pop            
        //   692: goto            704
        //   695: aload_2        
        //   696: astore_3       
        //   697: goto            295
        //   700: astore_3       
        //   701: goto            695
        //   704: aload_2        
        //   705: astore_3       
        //   706: aload_3        
        //   707: ifnull          740
        //   710: aload_3        
        //   711: aload           13
        //   713: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   718: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   723: ifeq            740
        //   726: aload           14
        //   728: invokevirtual   android/view/View.isClickable:()Z
        //   731: ifeq            740
        //   734: iconst_1       
        //   735: istore          9
        //   737: goto            743
        //   740: iconst_0       
        //   741: istore          9
        //   743: aload           12
        //   745: ldc_w           "is_clickable"
        //   748: iload           9
        //   750: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Z)Lorg/json/JSONObject;
        //   753: pop            
        //   754: aload           13
        //   756: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   761: checkcast       Ljava/lang/String;
        //   764: astore          13
        //   766: aload_1        
        //   767: aload           13
        //   769: aload           12
        //   771: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   774: pop            
        //   775: goto            63
        //   778: astore          12
        //   780: goto            295
        //   783: astore          12
        //   785: ldc_w           "Unable to get asset views information"
        //   788: invokestatic    J1/j.i:(Ljava/lang/String;)V
        //   791: goto            775
        //   794: aload           13
        //   796: areturn        
        //   797: astore_3       
        //   798: goto            695
        //   801: astore          12
        //   803: goto            295
        //   806: astore          12
        //   808: goto            785
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  141    148    783    785    Lorg/json/JSONException;
        //  148    153    778    783    Lorg/json/JSONException;
        //  153    159    292    295    Lorg/json/JSONException;
        //  166    289    292    295    Lorg/json/JSONException;
        //  298    375    292    295    Lorg/json/JSONException;
        //  375    417    292    295    Lorg/json/JSONException;
        //  422    454    292    295    Lorg/json/JSONException;
        //  454    513    292    295    Lorg/json/JSONException;
        //  513    559    292    295    Lorg/json/JSONException;
        //  559    589    292    295    Lorg/json/JSONException;
        //  592    607    292    295    Lorg/json/JSONException;
        //  612    626    292    295    Lorg/json/JSONException;
        //  626    633    292    295    Lorg/json/JSONException;
        //  638    663    700    704    Lorg/json/JSONException;
        //  668    692    797    801    Lorg/json/JSONException;
        //  710    734    801    806    Lorg/json/JSONException;
        //  743    766    801    806    Lorg/json/JSONException;
        //  766    775    806    811    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 384 out of bounds for length 384
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public static JSONObject E(final Context context, final View view) {
        final JSONObject jsonObject = new JSONObject();
        if (view != null) {
            try {
                final M c = o.B.c;
                jsonObject.put("can_show_on_lock_screen", M.D(view));
                final boolean b = false;
                boolean b2;
                if (context == null) {
                    b2 = b;
                }
                else {
                    final Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager;
                    if (systemService != null && systemService instanceof KeyguardManager) {
                        keyguardManager = (KeyguardManager)systemService;
                    }
                    else {
                        keyguardManager = null;
                    }
                    b2 = b;
                    if (keyguardManager != null) {
                        b2 = b;
                        if (keyguardManager.isKeyguardLocked()) {
                            b2 = true;
                        }
                    }
                }
                jsonObject.put("is_keyguard_locked", b2);
            }
            catch (final JSONException ex) {
                j.i("Unable to get lock screen information");
            }
        }
        return jsonObject;
    }
    
    public static boolean F(final byte b) {
        return b > -65;
    }
    
    public static JSONObject G(final View view) {
        final JSONObject jsonObject = new JSONObject();
        if (view == null) {
            return jsonObject;
        }
        try {
            final boolean booleanValue = (boolean)q.d.c.a(D7.G7);
            boolean b = true;
            final boolean b2 = true;
            if (booleanValue) {
                final M c = o.B.c;
                ViewParent viewParent;
                for (viewParent = view.getParent(); viewParent != null && !(viewParent instanceof ScrollView); viewParent = viewParent.getParent()) {}
                boolean b3 = b2;
                if (viewParent == null) {
                    b3 = false;
                }
                jsonObject.put("contained_in_scroll_view", b3);
            }
            else {
                final M c2 = o.B.c;
                ViewParent viewParent2;
                for (viewParent2 = view.getParent(); viewParent2 != null && !(viewParent2 instanceof AdapterView); viewParent2 = viewParent2.getParent()) {}
                int positionForView;
                if (viewParent2 == null) {
                    positionForView = -1;
                }
                else {
                    positionForView = ((AdapterView)viewParent2).getPositionForView(view);
                }
                if (positionForView == -1) {
                    b = false;
                }
                jsonObject.put("contained_in_scroll_view", b);
            }
            return jsonObject;
        }
        catch (final Exception ex) {
            return jsonObject;
        }
    }
    
    public static JSONObject H(final Context p0, final View p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   org/json/JSONObject.<init>:()V
        //     7: astore          4
        //     9: aload_1        
        //    10: ifnonnull       16
        //    13: goto            619
        //    16: iconst_2       
        //    17: newarray        I
        //    19: astore          5
        //    21: aload_1        
        //    22: aload           5
        //    24: invokevirtual   android/view/View.getLocationOnScreen:([I)V
        //    27: iconst_2       
        //    28: newarray        I
        //    30: astore          6
        //    32: aload           6
        //    34: iconst_0       
        //    35: aload_1        
        //    36: invokevirtual   android/view/View.getMeasuredWidth:()I
        //    39: iastore        
        //    40: aload           6
        //    42: iconst_1       
        //    43: aload_1        
        //    44: invokevirtual   android/view/View.getMeasuredHeight:()I
        //    47: iastore        
        //    48: aload_1        
        //    49: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    52: astore_3       
        //    53: aload_3        
        //    54: instanceof      Landroid/view/ViewGroup;
        //    57: ifeq            108
        //    60: aload_3        
        //    61: checkcast       Landroid/view/ViewGroup;
        //    64: astore          7
        //    66: aload           6
        //    68: iconst_0       
        //    69: aload           7
        //    71: invokevirtual   android/view/View.getMeasuredWidth:()I
        //    74: aload           6
        //    76: iconst_0       
        //    77: iaload         
        //    78: invokestatic    java/lang/Math.min:(II)I
        //    81: iastore        
        //    82: aload           6
        //    84: iconst_1       
        //    85: aload           7
        //    87: invokevirtual   android/view/View.getMeasuredHeight:()I
        //    90: aload           6
        //    92: iconst_1       
        //    93: iaload         
        //    94: invokestatic    java/lang/Math.min:(II)I
        //    97: iastore        
        //    98: aload_3        
        //    99: invokeinterface android/view/ViewParent.getParent:()Landroid/view/ViewParent;
        //   104: astore_3       
        //   105: goto            53
        //   108: new             Lorg/json/JSONObject;
        //   111: astore          8
        //   113: aload           8
        //   115: invokespecial   org/json/JSONObject.<init>:()V
        //   118: aload_1        
        //   119: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   122: istore_2       
        //   123: getstatic       F1/p.f:LF1/p;
        //   126: astore          7
        //   128: aload           7
        //   130: getfield        F1/p.a:LJ1/e;
        //   133: astore_3       
        //   134: aload           7
        //   136: getfield        F1/p.a:LJ1/e;
        //   139: astore          7
        //   141: aload           8
        //   143: ldc             "width"
        //   145: aload_3        
        //   146: aload_0        
        //   147: iload_2        
        //   148: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   151: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   154: pop            
        //   155: aload           8
        //   157: ldc             "height"
        //   159: aload           7
        //   161: aload_0        
        //   162: aload_1        
        //   163: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   166: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   169: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   172: pop            
        //   173: aload           8
        //   175: ldc             "x"
        //   177: aload           7
        //   179: aload_0        
        //   180: aload           5
        //   182: iconst_0       
        //   183: iaload         
        //   184: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   187: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   190: pop            
        //   191: aload           8
        //   193: ldc             "y"
        //   195: aload           7
        //   197: aload_0        
        //   198: aload           5
        //   200: iconst_1       
        //   201: iaload         
        //   202: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   205: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   208: pop            
        //   209: aload           8
        //   211: ldc_w           "maximum_visible_width"
        //   214: aload           7
        //   216: aload_0        
        //   217: aload           6
        //   219: iconst_0       
        //   220: iaload         
        //   221: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   224: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   227: pop            
        //   228: aload           8
        //   230: ldc_w           "maximum_visible_height"
        //   233: aload           7
        //   235: aload_0        
        //   236: aload           6
        //   238: iconst_1       
        //   239: iaload         
        //   240: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   243: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   246: pop            
        //   247: aload           8
        //   249: ldc             "relative_to"
        //   251: ldc_w           "window"
        //   254: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   257: pop            
        //   258: aload           4
        //   260: ldc             "frame"
        //   262: aload           8
        //   264: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   267: pop            
        //   268: new             Landroid/graphics/Rect;
        //   271: astore_3       
        //   272: aload_3        
        //   273: invokespecial   android/graphics/Rect.<init>:()V
        //   276: aload_1        
        //   277: aload_3        
        //   278: invokevirtual   android/view/View.getGlobalVisibleRect:(Landroid/graphics/Rect;)Z
        //   281: ifeq            293
        //   284: aload_0        
        //   285: aload_3        
        //   286: invokestatic    I5/d.K:(Landroid/content/Context;Landroid/graphics/Rect;)Lorg/json/JSONObject;
        //   289: astore_0       
        //   290: goto            363
        //   293: new             Lorg/json/JSONObject;
        //   296: astore_3       
        //   297: aload_3        
        //   298: invokespecial   org/json/JSONObject.<init>:()V
        //   301: aload_3        
        //   302: ldc             "width"
        //   304: iconst_0       
        //   305: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   308: pop            
        //   309: aload_3        
        //   310: ldc             "height"
        //   312: iconst_0       
        //   313: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   316: pop            
        //   317: aload_3        
        //   318: ldc             "x"
        //   320: aload           7
        //   322: aload_0        
        //   323: aload           5
        //   325: iconst_0       
        //   326: iaload         
        //   327: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   330: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   333: pop            
        //   334: aload_3        
        //   335: ldc             "y"
        //   337: aload           7
        //   339: aload_0        
        //   340: aload           5
        //   342: iconst_1       
        //   343: iaload         
        //   344: invokevirtual   J1/e.f:(Landroid/content/Context;I)I
        //   347: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   350: pop            
        //   351: aload_3        
        //   352: ldc             "relative_to"
        //   354: ldc_w           "window"
        //   357: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   360: pop            
        //   361: aload_3        
        //   362: astore_0       
        //   363: aload           4
        //   365: ldc             "visible_bounds"
        //   367: aload_0        
        //   368: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   371: pop            
        //   372: goto            382
        //   375: astore_0       
        //   376: ldc_w           "Unable to get native ad view bounding box"
        //   379: invokestatic    J1/j.i:(Ljava/lang/String;)V
        //   382: aload_1        
        //   383: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   386: astore_0       
        //   387: aload_0        
        //   388: ifnull          430
        //   391: aload_0        
        //   392: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   395: ldc_w           "getTemplateTypeName"
        //   398: aconst_null    
        //   399: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   402: aload_0        
        //   403: aconst_null    
        //   404: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   407: checkcast       Ljava/lang/String;
        //   410: astore_0       
        //   411: goto            434
        //   414: astore_0       
        //   415: goto            423
        //   418: astore_0       
        //   419: goto            423
        //   422: astore_0       
        //   423: ldc_w           "Cannot access method getTemplateTypeName: "
        //   426: aload_0        
        //   427: invokestatic    J1/j.g:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   430: ldc_w           ""
        //   433: astore_0       
        //   434: aload_0        
        //   435: invokevirtual   java/lang/String.hashCode:()I
        //   438: istore_2       
        //   439: iload_2        
        //   440: ldc_w           -2066603854
        //   443: if_icmpeq       471
        //   446: iload_2        
        //   447: ldc_w           2019754500
        //   450: if_icmpeq       456
        //   453: goto            486
        //   456: aload_0        
        //   457: ldc_w           "medium_template"
        //   460: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   463: ifeq            486
        //   466: iconst_1       
        //   467: istore_2       
        //   468: goto            488
        //   471: aload_0        
        //   472: ldc_w           "small_template"
        //   475: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   478: ifeq            486
        //   481: iconst_0       
        //   482: istore_2       
        //   483: goto            488
        //   486: iconst_m1      
        //   487: istore_2       
        //   488: iload_2        
        //   489: ifeq            527
        //   492: iload_2        
        //   493: iconst_1       
        //   494: if_icmpeq       514
        //   497: aload           4
        //   499: ldc_w           "native_template_type"
        //   502: iconst_0       
        //   503: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   506: pop            
        //   507: goto            547
        //   510: astore_0       
        //   511: goto            540
        //   514: aload           4
        //   516: ldc_w           "native_template_type"
        //   519: iconst_2       
        //   520: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   523: pop            
        //   524: goto            547
        //   527: aload           4
        //   529: ldc_w           "native_template_type"
        //   532: iconst_1       
        //   533: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   536: pop            
        //   537: goto            547
        //   540: ldc_w           "Could not log native template signal to JSON"
        //   543: aload_0        
        //   544: invokestatic    J1/j.g:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   547: getstatic       com/google/android/gms/internal/ads/D7.I7:Lcom/google/android/gms/internal/ads/z7;
        //   550: astore_0       
        //   551: getstatic       F1/q.d:LF1/q;
        //   554: getfield        F1/q.c:Lcom/google/android/gms/internal/ads/B7;
        //   557: aload_0        
        //   558: invokevirtual   com/google/android/gms/internal/ads/B7.a:(Lcom/google/android/gms/internal/ads/z7;)Ljava/lang/Object;
        //   561: checkcast       Ljava/lang/Boolean;
        //   564: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   567: ifeq            619
        //   570: aload_1        
        //   571: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   574: astore_0       
        //   575: aload           4
        //   577: ldc             "view_width_layout_type"
        //   579: aload_0        
        //   580: getfield        android/view/ViewGroup$LayoutParams.width:I
        //   583: invokestatic    I5/d.L:(I)I
        //   586: iconst_1       
        //   587: isub           
        //   588: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   591: pop            
        //   592: aload           4
        //   594: ldc             "view_height_layout_type"
        //   596: aload_0        
        //   597: getfield        android/view/ViewGroup$LayoutParams.height:I
        //   600: invokestatic    I5/d.L:(I)I
        //   603: iconst_1       
        //   604: isub           
        //   605: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //   608: pop            
        //   609: goto            619
        //   612: astore_0       
        //   613: ldc_w           "Unable to get native ad view layout types"
        //   616: invokestatic    I1/H.m:(Ljava/lang/String;)V
        //   619: aload           4
        //   621: areturn        
        //   622: astore_0       
        //   623: goto            430
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  16     53     375    382    Ljava/lang/Exception;
        //  53     105    375    382    Ljava/lang/Exception;
        //  108    134    375    382    Ljava/lang/Exception;
        //  141    290    375    382    Ljava/lang/Exception;
        //  293    361    375    382    Ljava/lang/Exception;
        //  363    372    375    382    Ljava/lang/Exception;
        //  391    411    622    626    Ljava/lang/NoSuchMethodException;
        //  391    411    422    423    Ljava/lang/SecurityException;
        //  391    411    418    422    Ljava/lang/IllegalAccessException;
        //  391    411    414    418    Ljava/lang/reflect/InvocationTargetException;
        //  434    439    510    514    Lorg/json/JSONException;
        //  497    507    510    514    Lorg/json/JSONException;
        //  514    524    510    514    Lorg/json/JSONException;
        //  527    537    510    514    Lorg/json/JSONException;
        //  570    609    612    619    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 320 out of bounds for length 320
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public static boolean I(final Context context, final Bp bp) {
        if (!bp.N) {
            return false;
        }
        final z7 k7 = D7.K7;
        final q d = q.d;
        final boolean booleanValue = (boolean)d.c.a(k7);
        final B7 c = d.c;
        if (booleanValue) {
            return (boolean)c.a(D7.N7);
        }
        final String s = (String)c.a(D7.L7);
        if (!s.isEmpty()) {
            if (context != null) {
                final String packageName = context.getPackageName();
                final bp f = bp.f(new Ys(';'));
                final Iterator b = ((lt)f.D).b(f, (CharSequence)s);
                kt kt;
                do {
                    kt = (kt)b;
                    if (kt.hasNext()) {
                        continue;
                    }
                    return false;
                } while (!((String)kt.next()).equals((Object)packageName));
                return true;
            }
        }
        return false;
    }
    
    public static boolean J(final int n) {
        final z7 x3 = D7.x3;
        final q d = q.d;
        return !(boolean)d.c.a(x3) || (boolean)d.c.a(D7.y3) || n <= 15299999;
    }
    
    public static JSONObject K(final Context context, final Rect rect) {
        final JSONObject jsonObject = new JSONObject();
        final int right = rect.right;
        final int left = rect.left;
        final p f = p.f;
        jsonObject.put("width", f.a.f(context, right - left));
        final int bottom = rect.bottom;
        final int top = rect.top;
        final e a = f.a;
        jsonObject.put("height", a.f(context, bottom - top));
        jsonObject.put("x", a.f(context, rect.left));
        jsonObject.put("y", a.f(context, rect.top));
        jsonObject.put("relative_to", (Object)"self");
        return jsonObject;
    }
    
    public static int L(final int n) {
        if (n == -2) {
            return 4;
        }
        if (n != -1) {
            return 2;
        }
        return 3;
    }
    
    public static final List a(final Throwable t) {
        final String simpleName = t.getClass().getSimpleName();
        final String string = t.toString();
        final Throwable cause = t.getCause();
        final String stackTraceString = Log.getStackTraceString(t);
        final StringBuilder sb = new StringBuilder("Cause: ");
        sb.append((Object)cause);
        sb.append(", Stacktrace: ");
        sb.append(stackTraceString);
        return d5.e.D((Object[])new String[] { simpleName, string, sb.toString() });
    }
    
    public static void b(final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    
    public static a c(final String s, final String s2) {
        final a4.a a = new a4.a(s, s2);
        final C2.B b = e3.a.b((Class)a4.a.class);
        b.b = 1;
        b.f = new B((Object)a, 26);
        return b.e();
    }
    
    public static void d(final ArrayList list) {
        final HashMap hashMap = new HashMap(list.size());
        final Iterator iterator = list.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final int n = 0;
            if (hasNext) {
                final a a = (a)iterator.next();
                final e3.e e = new e3.e(a);
                for (final e3.o o : a.b) {
                    final boolean b = a.e == 0;
                    final f f = new f(o, b ^ true);
                    if (!hashMap.containsKey((Object)f)) {
                        hashMap.put((Object)f, (Object)new HashSet());
                    }
                    final Set set = (Set)hashMap.get((Object)f);
                    if (!set.isEmpty() && b) {
                        final StringBuilder sb = new StringBuilder("Multiple components provide ");
                        sb.append((Object)o);
                        sb.append(".");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    set.add((Object)e);
                }
            }
            else {
                final Iterator iterator3 = hashMap.values().iterator();
                while (iterator3.hasNext()) {
                    for (final e3.e e2 : (Set)iterator3.next()) {
                        for (final g g : e2.a.c) {
                            if (g.c == 0) {
                                final Set set2 = (Set)hashMap.get((Object)new f(g.a, g.b == 2));
                                if (set2 == null) {
                                    continue;
                                }
                                for (final e3.e e3 : set2) {
                                    e2.b.add((Object)e3);
                                    e3.c.add((Object)e2);
                                }
                            }
                        }
                    }
                }
                final HashSet set3 = new HashSet();
                final Iterator iterator7 = hashMap.values().iterator();
                while (iterator7.hasNext()) {
                    ((AbstractCollection)set3).addAll((Collection)iterator7.next());
                }
                final HashSet set4 = new HashSet();
                final Iterator iterator8 = set3.iterator();
                int n2;
                while (true) {
                    n2 = n;
                    if (!iterator8.hasNext()) {
                        break;
                    }
                    final e3.e e4 = (e3.e)iterator8.next();
                    if (!e4.c.isEmpty()) {
                        continue;
                    }
                    set4.add((Object)e4);
                }
                while (!set4.isEmpty()) {
                    final e3.e e5 = (e3.e)set4.iterator().next();
                    set4.remove((Object)e5);
                    final int n3 = n2 + 1;
                    final Iterator iterator9 = e5.b.iterator();
                    while (true) {
                        n2 = n3;
                        if (!iterator9.hasNext()) {
                            break;
                        }
                        final e3.e e6 = (e3.e)iterator9.next();
                        e6.c.remove((Object)e5);
                        if (!e6.c.isEmpty()) {
                            continue;
                        }
                        set4.add((Object)e6);
                    }
                }
                if (n2 == list.size()) {
                    return;
                }
                final ArrayList list2 = new ArrayList();
                for (final e3.e e7 : set3) {
                    if (!e7.c.isEmpty() && !e7.b.isEmpty()) {
                        list2.add((Object)e7.a);
                    }
                }
                final StringBuilder sb2 = new StringBuilder("Dependency cycle detected: ");
                sb2.append(Arrays.toString(list2.toArray()));
                throw new RuntimeException(sb2.toString());
            }
        }
    }
    
    public static a e(final String s, final F3.g g) {
        final C2.B b = e3.a.b((Class)a4.a.class);
        b.b = 1;
        b.d(g.c((Class)Context.class));
        b.f = new L3.g(s, 6, g);
        return b.e();
    }
    
    public static int f(final Cursor cursor, final String s) {
        final int columnIndex = cursor.getColumnIndex(s);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        final StringBuilder sb = new StringBuilder("`");
        sb.append(s);
        sb.append("`");
        return cursor.getColumnIndexOrThrow(sb.toString());
    }
    
    public static float g(final EdgeEffect edgeEffect) {
        if (Build$VERSION.SDK_INT >= 31) {
            return T.e.b(edgeEffect);
        }
        return 0.0f;
    }
    
    public static String j(final String s, final String s2) {
        final int n = s.length() - s2.length();
        if (n >= 0 && n <= 1) {
            final StringBuilder sb = new StringBuilder(s2.length() + s.length());
            for (int i = 0; i < s.length(); ++i) {
                sb.append(s.charAt(i));
                if (s2.length() > i) {
                    sb.append(s2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
    
    public static float k(final EdgeEffect edgeEffect, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 31) {
            return T.e.c(edgeEffect, n, n2);
        }
        T.d.a(edgeEffect, n, n2);
        return n;
    }
    
    public static void l(final c p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        I5/c.f:LI5/c;
        //     4: ifnonnull       82
        //     7: aload_0        
        //     8: getfield        I5/c.g:LI5/c;
        //    11: ifnonnull       82
        //    14: aload_0        
        //    15: getfield        I5/c.d:Z
        //    18: ifeq            22
        //    21: return         
        //    22: ldc             LI5/d;.class
        //    24: dup            
        //    25: astore_2       
        //    26: monitorenter   
        //    27: getstatic       I5/d.b:J
        //    30: ldc2_w          8192
        //    33: ladd           
        //    34: lstore_1       
        //    35: lload_1        
        //    36: ldc2_w          65536
        //    39: lcmp           
        //    40: ifle            50
        //    43: aload_2        
        //    44: monitorexit    
        //    45: return         
        //    46: astore_0       
        //    47: goto            78
        //    50: lload_1        
        //    51: putstatic       I5/d.b:J
        //    54: aload_0        
        //    55: getstatic       I5/d.a:LI5/c;
        //    58: putfield        I5/c.f:LI5/c;
        //    61: aload_0        
        //    62: iconst_0       
        //    63: putfield        I5/c.c:I
        //    66: aload_0        
        //    67: iconst_0       
        //    68: putfield        I5/c.b:I
        //    71: aload_0        
        //    72: putstatic       I5/d.a:LI5/c;
        //    75: aload_2        
        //    76: monitorexit    
        //    77: return         
        //    78: aload_2        
        //    79: monitorexit    
        //    80: aload_0        
        //    81: athrow         
        //    82: new             Ljava/lang/IllegalArgumentException;
        //    85: dup            
        //    86: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    89: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  27     35     46     82     Any
        //  43     45     46     82     Any
        //  50     77     46     82     Any
        //  78     80     46     82     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to read from field 'java.util.ArrayList q5.e.c' on a null object reference in method 'void q5.g.c(q5.a[], java.util.ArrayList)'
        //     at q5.g.c(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:871)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2394)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public static void o(final F4.f f, final i i) {
        h.e("binaryMessenger", (Object)f);
        Object c = null;
        Label_0037: {
            if (i != null) {
                final n a = i.a;
                if (a != null) {
                    c = a.c();
                    break Label_0037;
                }
            }
            c = new X4.c(1);
        }
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.View.scrollTo", c, (Object)null);
        if (i != null) {
            h.u((b)new F(i, 0));
        }
        else {
            h.u((b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.View.scrollBy", c, (Object)null);
        if (i != null) {
            h2.u((b)new F(i, 1));
        }
        else {
            h2.u((b)null);
        }
        final Y0.h h3 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", c, (Object)null);
        if (i != null) {
            h3.u((b)new F(i, 2));
        }
        else {
            h3.u((b)null);
        }
        final Y0.h h4 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", c, (Object)null);
        if (i != null) {
            h4.u((b)new F(i, 3));
        }
        else {
            h4.u((b)null);
        }
        final Y0.h h5 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", c, (Object)null);
        if (i != null) {
            h5.u((b)new F(i, 4));
        }
        else {
            h5.u((b)null);
        }
        final Y0.h h6 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", c, (Object)null);
        if (i != null) {
            h6.u((b)new F(i, 5));
        }
        else {
            h6.u((b)null);
        }
    }
    
    public static c p() {
        final Class<d> clazz;
        monitorenter(clazz = d.class);
        Label_0043: {
            try {
                final c a = d.a;
                if (a != null) {
                    d.a = a.f;
                    a.f = null;
                    d.b -= 8192L;
                    monitorexit(clazz);
                    return a;
                }
                break Label_0043;
            }
            finally {
                monitorexit(clazz);
                monitorexit(clazz);
                return new c();
            }
        }
    }
    
    public static Object q(final Object o) {
        if (o == null) {
            return JSONObject.NULL;
        }
        Object o2 = o;
        if (o instanceof JSONArray) {
            return o2;
        }
        if (o instanceof JSONObject) {
            o2 = o;
            return o2;
        }
        if (o.equals(JSONObject.NULL)) {
            return o;
        }
        try {
            if (o instanceof Collection) {
                final JSONArray jsonArray = new JSONArray();
                final Iterator iterator = ((Collection)o).iterator();
                while (iterator.hasNext()) {
                    jsonArray.put(q(iterator.next()));
                }
                return jsonArray;
            }
            if (o.getClass().isArray()) {
                final JSONArray jsonArray2 = new JSONArray();
                for (int length = Array.getLength(o), i = 0; i < length; ++i) {
                    jsonArray2.put(q(Array.get(o, i)));
                }
                return jsonArray2;
            }
            if (o instanceof Map) {
                final JSONObject jsonObject = new JSONObject();
                for (final Map$Entry map$Entry : ((Map)o).entrySet()) {
                    jsonObject.put((String)map$Entry.getKey(), q(map$Entry.getValue()));
                }
                return jsonObject;
            }
            Object string = o;
            if (!(o instanceof Boolean)) {
                string = o;
                if (!(o instanceof Byte)) {
                    string = o;
                    if (!(o instanceof Character)) {
                        string = o;
                        if (!(o instanceof Double)) {
                            string = o;
                            if (!(o instanceof Float)) {
                                string = o;
                                if (!(o instanceof Integer)) {
                                    string = o;
                                    if (!(o instanceof Long)) {
                                        string = o;
                                        if (!(o instanceof Short)) {
                                            if (o instanceof String) {
                                                string = o;
                                            }
                                            else {
                                                if (!o.getClass().getPackage().getName().startsWith("java.")) {
                                                    o2 = null;
                                                    return o2;
                                                }
                                                string = o.toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return string;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static ArrayList r(final Exception ex) {
        final ArrayList list = new ArrayList(3);
        list.add((Object)((Throwable)ex).toString());
        list.add((Object)ex.getClass().getSimpleName());
        final StringBuilder sb = new StringBuilder("Cause: ");
        sb.append((Object)((Throwable)ex).getCause());
        sb.append(", Stacktrace: ");
        sb.append(Log.getStackTraceString((Throwable)ex));
        list.add((Object)sb.toString());
        return list;
    }
    
    public static ArrayList s(final Throwable t) {
        final ArrayList list = new ArrayList(3);
        if (t instanceof U4.h) {
            final U4.h h = (U4.h)t;
            list.add((Object)h.C);
            list.add((Object)((Throwable)h).getMessage());
            list.add((Object)null);
        }
        else {
            list.add((Object)t.toString());
            list.add((Object)t.getClass().getSimpleName());
            final StringBuilder sb = new StringBuilder("Cause: ");
            sb.append((Object)t.getCause());
            sb.append(", Stacktrace: ");
            sb.append(Log.getStackTraceString(t));
            list.add((Object)sb.toString());
        }
        return list;
    }
    
    public static List t(final Throwable t) {
        List list;
        if (t instanceof Z4.a) {
            final Z4.a a = (Z4.a)t;
            list = d5.e.D(new Object[] { a.C, a.D, a.E });
        }
        else {
            final String simpleName = t.getClass().getSimpleName();
            final String string = t.toString();
            final Throwable cause = t.getCause();
            final String stackTraceString = Log.getStackTraceString(t);
            final StringBuilder sb = new StringBuilder("Cause: ");
            sb.append((Object)cause);
            sb.append(", Stacktrace: ");
            sb.append(stackTraceString);
            list = d5.e.D((Object[])new String[] { simpleName, string, sb.toString() });
        }
        return list;
    }
    
    public static w v(final String s, final Bundle bundle) {
        final h1.f i = E.i;
        if (bundle == null) {
            q0.g("BillingClient", s.concat(" got null owned items list"));
            return new w((Object)i, 54);
        }
        final int a = q0.a("BillingClient", bundle);
        final String e = q0.e("BillingClient", bundle);
        final h1.e a2 = h1.f.a();
        a2.a = a;
        a2.b = e;
        final h1.f a3 = a2.a();
        if (a != 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" failed. Response code: ");
            sb.append(a);
            q0.g("BillingClient", sb.toString());
            return new w((Object)a3, 23);
        }
        if (!((BaseBundle)bundle).containsKey("INAPP_PURCHASE_ITEM_LIST") || !((BaseBundle)bundle).containsKey("INAPP_PURCHASE_DATA_LIST") || !((BaseBundle)bundle).containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            final StringBuilder sb2 = new StringBuilder("Bundle returned from ");
            sb2.append(s);
            sb2.append(" doesn't contain required fields.");
            q0.g("BillingClient", sb2.toString());
            return new w((Object)i, 55);
        }
        final ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        final ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        final ArrayList stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            final StringBuilder sb3 = new StringBuilder("Bundle returned from ");
            sb3.append(s);
            sb3.append(" contains null SKUs list.");
            q0.g("BillingClient", sb3.toString());
            return new w((Object)i, 56);
        }
        if (stringArrayList2 == null) {
            final StringBuilder sb4 = new StringBuilder("Bundle returned from ");
            sb4.append(s);
            sb4.append(" contains null purchases list.");
            q0.g("BillingClient", sb4.toString());
            return new w((Object)i, 57);
        }
        if (stringArrayList3 == null) {
            final StringBuilder sb5 = new StringBuilder("Bundle returned from ");
            sb5.append(s);
            sb5.append(" contains null signatures list.");
            q0.g("BillingClient", sb5.toString());
            return new w((Object)i, 58);
        }
        return new w((Object)E.j, 1);
    }
    
    public static void x(final int n, final Object[] array) {
        for (int i = 0; i < n; ++i) {
            if (array[i] == null) {
                final StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 9);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
    }
    
    public static WindowManager$LayoutParams y() {
        final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams(-2, -2, 0, 0, -2);
        windowManager$LayoutParams.flags = (int)q.d.c.a(D7.M7);
        windowManager$LayoutParams.type = 2;
        windowManager$LayoutParams.gravity = 8388659;
        return windowManager$LayoutParams;
    }
    
    public abstract InputFilter[] h(final InputFilter[] p0);
    
    public abstract boolean i();
    
    public abstract void m(final boolean p0);
    
    public abstract void n(final boolean p0);
    
    public abstract TransformationMethod u(final TransformationMethod p0);
}
