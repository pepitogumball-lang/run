package r0;

import java.util.concurrent.Executor;
import android.content.Context;
import java.util.Iterator;
import java.util.Map$Entry;
import java.nio.charset.Charset;
import java.util.BitSet;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import com.google.android.gms.internal.measurement.L;
import java.io.InputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import android.content.pm.PackageInfo;
import v.e;
import java.io.File;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import c0.b;

public abstract class c
{
    public static final b a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    
    public static byte[] a(final byte[] array) {
        final Deflater deflater = new Deflater(1);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Label_0065: {
            DeflaterOutputStream deflaterOutputStream;
            try {
                final DeflaterOutputStream deflaterOutputStream2;
                deflaterOutputStream = (deflaterOutputStream2 = new DeflaterOutputStream((OutputStream)byteArrayOutputStream, deflater));
                final byte[] array2 = array;
                ((OutputStream)deflaterOutputStream2).write(array2);
                final DeflaterOutputStream deflaterOutputStream3 = deflaterOutputStream;
                deflaterOutputStream3.close();
                final Deflater deflater2 = deflater;
                deflater2.end();
                final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                return byteArrayOutputStream2.toByteArray();
            }
            finally {
                break Label_0065;
            }
            try {
                final DeflaterOutputStream deflaterOutputStream2 = deflaterOutputStream;
                final byte[] array2 = array;
                ((OutputStream)deflaterOutputStream2).write(array2);
                final DeflaterOutputStream deflaterOutputStream3 = deflaterOutputStream;
                deflaterOutputStream3.close();
                final Deflater deflater2 = deflater;
                deflater2.end();
                final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                return byteArrayOutputStream2.toByteArray();
            }
            finally {
                try {
                    deflaterOutputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)(Object)array).addSuppressed(t);
                }
            }
        }
        deflater.end();
    }
    
    public static byte[] b(final a[] array, final byte[] array2) {
        final int length = array.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final a a = array[i];
            n += (a.g * 2 + 7 & 0xFFFFFFF8) / 8 + (a.e * 2 + (d(array2, a.a, a.b).getBytes(StandardCharsets.UTF_8).length + 16) + a.f);
            ++i;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        if (Arrays.equals(array2, r0.c.f)) {
            for (final a a2 : array) {
                p(byteArrayOutputStream, a2, d(array2, a2.a, a2.b));
                r(byteArrayOutputStream, a2);
                final int[] h = a2.h;
                final int length3 = h.length;
                int k = 0;
                int n2 = 0;
                while (k < length3) {
                    final int n3 = h[k];
                    u(byteArrayOutputStream, n3 - n2);
                    ++k;
                    n2 = n3;
                }
                q(byteArrayOutputStream, a2);
            }
        }
        else {
            for (final a a3 : array) {
                p(byteArrayOutputStream, a3, d(array2, a3.a, a3.b));
            }
            for (final a a4 : array) {
                r(byteArrayOutputStream, a4);
                final int[] h2 = a4.h;
                final int length6 = h2.length;
                int n5 = 0;
                int n6 = 0;
                while (n5 < length6) {
                    final int n7 = h2[n5];
                    u(byteArrayOutputStream, n7 - n6);
                    ++n5;
                    n6 = n7;
                }
                q(byteArrayOutputStream, a4);
            }
        }
        if (byteArrayOutputStream.size() == n) {
            return byteArrayOutputStream.toByteArray();
        }
        final StringBuilder sb = new StringBuilder("The bytes saved do not match expectation. actual=");
        sb.append(byteArrayOutputStream.size());
        sb.append(" expected=");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static boolean c(final File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        final File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        final int length = listFiles.length;
        int i = 0;
        boolean b = true;
        while (i < length) {
            b = (c(listFiles[i]) && b);
            ++i;
        }
        return b;
    }
    
    public static String d(final byte[] array, String s, final String s2) {
        final byte[] h = r0.c.h;
        final boolean equals = Arrays.equals(array, h);
        final byte[] g = r0.c.g;
        final String s3 = "!";
        String s4;
        if (!equals && !Arrays.equals(array, g)) {
            s4 = "!";
        }
        else {
            s4 = ":";
        }
        if (s.length() <= 0) {
            String s5;
            if ("!".equals((Object)s4)) {
                s5 = s2.replace((CharSequence)":", (CharSequence)"!");
            }
            else {
                s5 = s2;
                if (":".equals((Object)s4)) {
                    s5 = s2.replace((CharSequence)"!", (CharSequence)":");
                }
            }
            return s5;
        }
        if (s2.equals((Object)"classes.dex")) {
            return s;
        }
        if (s2.contains((CharSequence)"!") || s2.contains((CharSequence)":")) {
            String s6;
            if ("!".equals((Object)s4)) {
                s6 = s2.replace((CharSequence)":", (CharSequence)"!");
            }
            else {
                s6 = s2;
                if (":".equals((Object)s4)) {
                    s6 = s2.replace((CharSequence)"!", (CharSequence)":");
                }
            }
            return s6;
        }
        if (s2.endsWith(".apk")) {
            return s2;
        }
        final StringBuilder b = v.e.b(s);
        if (!Arrays.equals(array, h)) {
            s = s3;
            if (!Arrays.equals(array, g)) {
                return x.a.b(b, s, s2);
            }
        }
        s = ":";
        return x.a.b(b, s, s2);
    }
    
    public static void e(final PackageInfo packageInfo, File file) {
        final File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            file = (File)new DataOutputStream((OutputStream)new FileOutputStream(file2));
            try {
                ((DataOutputStream)file).writeLong(packageInfo.lastUpdateTime);
                ((OutputStream)file).close();
            }
            finally {
                try {
                    ((OutputStream)file).close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)packageInfo).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    public static byte[] f(final InputStream inputStream, final int n) {
        final byte[] array = new byte[n];
        int read;
        for (int i = 0; i < n; i += read) {
            read = inputStream.read(array, i, n - i);
            if (read < 0) {
                throw new IllegalStateException(L.h(n, "Not enough bytes to read: "));
            }
        }
        return array;
    }
    
    public static int[] g(final ByteArrayInputStream byteArrayInputStream, final int n) {
        final int[] array = new int[n];
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 += (int)m((InputStream)byteArrayInputStream, 2);
            array[i] = n2;
            ++i;
        }
        return array;
    }
    
    public static byte[] h(final FileInputStream fileInputStream, final int n, final int n2) {
        final Inflater inflater = new Inflater();
        Label_0265: {
            byte[] array = null;
            int n3 = 0;
            Label_0171: {
            Label_0123:
                while (true) {
                    int n4;
                    int read;
                    try {
                        array = new byte[n2];
                        final byte[] array2 = new byte[2048];
                        n3 = 0;
                        n4 = 0;
                        while (!inflater.finished() && !inflater.needsDictionary() && n3 < n) {
                            read = ((InputStream)fileInputStream).read(array2);
                            if (read < 0) {
                                break Label_0123;
                            }
                            inflater.setInput(array2, 0, read);
                            final Inflater inflater2 = inflater;
                            final byte[] array3 = array;
                            final int n5 = n4;
                            final int n6 = n2;
                            final int n7 = n4;
                            final int n8 = n6 - n7;
                            final int n9 = inflater2.inflate(array3, n5, n8);
                            final int n10 = n4;
                            final int n11 = n9;
                            n4 = n10 + n11;
                            final int n12 = n3;
                            final int n13 = read;
                            final int n14 = n3 = n12 + n13;
                        }
                        break Label_0171;
                    }
                    finally {
                        break Label_0265;
                    }
                    try {
                        final Inflater inflater2 = inflater;
                        final byte[] array3 = array;
                        final int n5 = n4;
                        final int n6 = n2;
                        final int n7 = n4;
                        final int n8 = n6 - n7;
                        final int n9 = inflater2.inflate(array3, n5, n8);
                        final int n10 = n4;
                        final int n11 = n9;
                        n4 = n10 + n11;
                        final int n12 = n3;
                        final int n13 = read;
                        n3 = n12 + n13;
                        continue;
                    }
                    catch (final DataFormatException ex) {
                        throw new IllegalStateException(((Throwable)ex).getMessage());
                    }
                    break;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                sb.append(n);
                sb.append(" bytes");
                throw new IllegalStateException(sb.toString());
            }
            if (n3 != n) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Didn't read enough bytes during decompression. expected=");
                sb2.append(n);
                sb2.append(" actual=");
                sb2.append(n3);
                throw new IllegalStateException(sb2.toString());
            }
            if (inflater.finished()) {
                inflater.end();
                return array;
            }
            throw new IllegalStateException("Inflater did not finish");
        }
        inflater.end();
    }
    
    public static a[] i(FileInputStream fileInputStream, byte[] array, final byte[] array2, final a[] array3) {
        final byte[] i = r0.c.i;
        if (Arrays.equals(array, i)) {
            if (Arrays.equals(r0.c.d, array2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            if (Arrays.equals(array, i)) {
                final int n = (int)m((InputStream)fileInputStream, 1);
                array = h(fileInputStream, (int)m((InputStream)fileInputStream, 4), (int)m((InputStream)fileInputStream, 4));
                if (((InputStream)fileInputStream).read() <= 0) {
                    fileInputStream = (FileInputStream)new ByteArrayInputStream(array);
                    try {
                        final a[] j = j((ByteArrayInputStream)fileInputStream, n, array3);
                        ((InputStream)fileInputStream).close();
                        return j;
                    }
                    finally {
                        try {
                            ((InputStream)fileInputStream).close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)(Object)array).addSuppressed(t);
                        }
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        }
        else {
            if (Arrays.equals(array, r0.c.j)) {
                final int n2 = (int)m((InputStream)fileInputStream, 2);
                array = h(fileInputStream, (int)m((InputStream)fileInputStream, 4), (int)m((InputStream)fileInputStream, 4));
                if (((InputStream)fileInputStream).read() <= 0) {
                    fileInputStream = (FileInputStream)new ByteArrayInputStream(array);
                    try {
                        final a[] k = k((ByteArrayInputStream)fileInputStream, array2, n2, array3);
                        ((InputStream)fileInputStream).close();
                        return k;
                    }
                    finally {
                        try {
                            ((InputStream)fileInputStream).close();
                        }
                        finally {
                            final Throwable t2;
                            ((Throwable)(Object)array).addSuppressed(t2);
                        }
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        }
    }
    
    public static a[] j(final ByteArrayInputStream byteArrayInputStream, final int n, final a[] array) {
        final int available = ((InputStream)byteArrayInputStream).available();
        final int n2 = 0;
        if (available == 0) {
            return new a[0];
        }
        if (n == array.length) {
            final String[] array2 = new String[n];
            final int[] array3 = new int[n];
            int n3 = 0;
            int i;
            while (true) {
                i = n2;
                if (n3 >= n) {
                    break;
                }
                final int n4 = (int)m((InputStream)byteArrayInputStream, 2);
                array3[n3] = (int)m((InputStream)byteArrayInputStream, 2);
                array2[n3] = new String(f((InputStream)byteArrayInputStream, n4), StandardCharsets.UTF_8);
                ++n3;
            }
            while (i < n) {
                final a a = array[i];
                if (!a.b.equals((Object)array2[i])) {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
                final int e = array3[i];
                a.e = e;
                a.h = g(byteArrayInputStream, e);
                ++i;
            }
            return array;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static a[] k(final ByteArrayInputStream byteArrayInputStream, final byte[] array, final int n, final a[] array2) {
        if (((InputStream)byteArrayInputStream).available() == 0) {
            return new a[0];
        }
        if (n == array2.length) {
            for (int i = 0; i < n; ++i) {
                m((InputStream)byteArrayInputStream, 2);
                final String s = new String(f((InputStream)byteArrayInputStream, (int)m((InputStream)byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                final long m = m((InputStream)byteArrayInputStream, 4);
                final int e = (int)m((InputStream)byteArrayInputStream, 2);
                final int length = array2.length;
                final a a = null;
                a a2;
                if (length <= 0) {
                    a2 = a;
                }
                else {
                    int n2;
                    if ((n2 = s.indexOf("!")) < 0) {
                        n2 = s.indexOf(":");
                    }
                    String substring;
                    if (n2 > 0) {
                        substring = s.substring(n2 + 1);
                    }
                    else {
                        substring = s;
                    }
                    int n3 = 0;
                    while (true) {
                        a2 = a;
                        if (n3 >= array2.length) {
                            break;
                        }
                        if (array2[n3].b.equals((Object)substring)) {
                            a2 = array2[n3];
                            break;
                        }
                        ++n3;
                    }
                }
                if (a2 == null) {
                    throw new IllegalStateException("Missing profile key: ".concat(s));
                }
                a2.d = m;
                final int[] g = g(byteArrayInputStream, e);
                if (Arrays.equals(array, r0.c.h)) {
                    a2.e = e;
                    a2.h = g;
                }
            }
            return array2;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static a[] l(FileInputStream fileInputStream, byte[] h, final String s) {
        if (Arrays.equals((byte[])h, r0.c.e)) {
            final int n = (int)m((InputStream)fileInputStream, 1);
            h = h(fileInputStream, (int)m((InputStream)fileInputStream, 4), (int)m((InputStream)fileInputStream, 4));
            if (((InputStream)fileInputStream).read() <= 0) {
                fileInputStream = (FileInputStream)new ByteArrayInputStream((byte[])h);
                try {
                    final a[] n2 = n((ByteArrayInputStream)fileInputStream, s, n);
                    ((InputStream)fileInputStream).close();
                    return n2;
                }
                finally {
                    try {
                        ((InputStream)fileInputStream).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)h).addSuppressed(t);
                    }
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }
    
    public static long m(final InputStream inputStream, final int n) {
        final byte[] f = f(inputStream, n);
        long n2 = 0L;
        for (int i = 0; i < n; ++i) {
            n2 += (long)(f[i] & 0xFF) << i * 8;
        }
        return n2;
    }
    
    public static a[] n(final ByteArrayInputStream byteArrayInputStream, final String s, final int n) {
        if (((InputStream)byteArrayInputStream).available() == 0) {
            return new a[0];
        }
        final a[] array = new a[n];
        for (int i = 0; i < n; ++i) {
            final int n2 = (int)m((InputStream)byteArrayInputStream, 2);
            final int n3 = (int)m((InputStream)byteArrayInputStream, 2);
            array[i] = new a(s, new String(f((InputStream)byteArrayInputStream, n2), StandardCharsets.UTF_8), m((InputStream)byteArrayInputStream, 4), n3, (int)m((InputStream)byteArrayInputStream, 4), (int)m((InputStream)byteArrayInputStream, 4), new int[n3], new TreeMap());
        }
        for (final a a : array) {
            final int n4 = ((InputStream)byteArrayInputStream).available() - a.f;
            int n5 = 0;
            TreeMap k;
            while (true) {
                final int available = ((InputStream)byteArrayInputStream).available();
                k = a.i;
                if (available <= n4) {
                    break;
                }
                final int n6 = n5 + (int)m((InputStream)byteArrayInputStream, 2);
                k.put((Object)n6, (Object)1);
                int n7 = (int)m((InputStream)byteArrayInputStream, 2);
                while (true) {
                    n5 = n6;
                    if (n7 <= 0) {
                        break;
                    }
                    m((InputStream)byteArrayInputStream, 2);
                    final int n8 = (int)m((InputStream)byteArrayInputStream, 1);
                    if (n8 != 6) {
                        int l;
                        if ((l = n8) != 7) {
                            while (l > 0) {
                                m((InputStream)byteArrayInputStream, 1);
                                for (int n9 = (int)m((InputStream)byteArrayInputStream, 1); n9 > 0; --n9) {
                                    m((InputStream)byteArrayInputStream, 2);
                                }
                                --l;
                            }
                        }
                    }
                    --n7;
                }
            }
            if (((InputStream)byteArrayInputStream).available() != n4) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            a.h = g(byteArrayInputStream, a.e);
            final int g = a.g;
            final BitSet value = BitSet.valueOf(f((InputStream)byteArrayInputStream, (g * 2 + 7 & 0xFFFFFFF8) / 8));
            for (int n10 = 0; n10 < g; ++n10) {
                int n11;
                if (value.get(n10)) {
                    n11 = 2;
                }
                else {
                    n11 = 0;
                }
                int n12 = n11;
                if (value.get(n10 + g)) {
                    n12 = (n11 | 0x4);
                }
                if (n12 != 0) {
                    Integer value2;
                    if ((value2 = (Integer)k.get((Object)n10)) == null) {
                        value2 = 0;
                    }
                    k.put((Object)n10, (Object)(n12 | value2));
                }
            }
        }
        return array;
    }
    
    public static boolean o(final ByteArrayOutputStream p0, final byte[] p1, final a[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          15
        //     5: aload_1        
        //     6: aload           15
        //     8: invokestatic    java/util/Arrays.equals:([B[B)Z
        //    11: ifeq            1142
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: iconst_3       
        //    19: invokespecial   java/util/ArrayList.<init>:(I)V
        //    22: astore          13
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: iconst_3       
        //    29: invokespecial   java/util/ArrayList.<init>:(I)V
        //    32: astore_1       
        //    33: new             Ljava/io/ByteArrayOutputStream;
        //    36: dup            
        //    37: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    40: astore          14
        //    42: aload           14
        //    44: aload_2        
        //    45: arraylength    
        //    46: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //    49: iconst_0       
        //    50: istore          4
        //    52: iconst_2       
        //    53: istore_3       
        //    54: iload           4
        //    56: aload_2        
        //    57: arraylength    
        //    58: if_icmpge       173
        //    61: aload_2        
        //    62: iload           4
        //    64: aaload         
        //    65: astore          16
        //    67: aload           14
        //    69: aload           16
        //    71: getfield        r0/a.c:J
        //    74: iconst_4       
        //    75: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //    78: aload           14
        //    80: aload           16
        //    82: getfield        r0/a.d:J
        //    85: iconst_4       
        //    86: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //    89: aload           14
        //    91: aload           16
        //    93: getfield        r0/a.g:I
        //    96: i2l            
        //    97: iconst_4       
        //    98: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   101: aload           15
        //   103: aload           16
        //   105: getfield        r0/a.a:Ljava/lang/String;
        //   108: aload           16
        //   110: getfield        r0/a.b:Ljava/lang/String;
        //   113: invokestatic    r0/c.d:([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   116: astore          16
        //   118: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //   121: astore          17
        //   123: aload           16
        //   125: aload           17
        //   127: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   130: arraylength    
        //   131: istore          5
        //   133: aload           14
        //   135: iload           5
        //   137: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //   140: iload_3        
        //   141: bipush          14
        //   143: iadd           
        //   144: iload           5
        //   146: iadd           
        //   147: istore_3       
        //   148: aload           14
        //   150: aload           16
        //   152: aload           17
        //   154: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   157: invokevirtual   java/io/OutputStream.write:([B)V
        //   160: iinc            4, 1
        //   163: goto            54
        //   166: goto            1126
        //   169: astore_0       
        //   170: goto            166
        //   173: aload           14
        //   175: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   178: astore          15
        //   180: aload           15
        //   182: arraylength    
        //   183: istore          4
        //   185: iload_3        
        //   186: iload           4
        //   188: if_icmpne       1072
        //   191: new             Lr0/j;
        //   194: dup            
        //   195: iconst_1       
        //   196: iconst_0       
        //   197: aload           15
        //   199: invokespecial   r0/j.<init>:(IZ[B)V
        //   202: astore          15
        //   204: aload           14
        //   206: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   209: aload           13
        //   211: aload           15
        //   213: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   216: pop            
        //   217: new             Ljava/io/ByteArrayOutputStream;
        //   220: dup            
        //   221: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   224: astore          14
        //   226: iconst_0       
        //   227: istore_3       
        //   228: iconst_0       
        //   229: istore          4
        //   231: iconst_0       
        //   232: istore          5
        //   234: iload_3        
        //   235: aload_2        
        //   236: arraylength    
        //   237: if_icmpge       341
        //   240: aload_2        
        //   241: iload_3        
        //   242: aaload         
        //   243: astore          15
        //   245: aload           14
        //   247: iload_3        
        //   248: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //   251: aload           14
        //   253: aload           15
        //   255: getfield        r0/a.e:I
        //   258: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //   261: iload           4
        //   263: iconst_4       
        //   264: iadd           
        //   265: aload           15
        //   267: getfield        r0/a.e:I
        //   270: iconst_2       
        //   271: imul           
        //   272: iadd           
        //   273: istore          6
        //   275: aload           15
        //   277: getfield        r0/a.h:[I
        //   280: astore          15
        //   282: aload           15
        //   284: arraylength    
        //   285: istore          8
        //   287: iconst_0       
        //   288: istore          4
        //   290: iload           5
        //   292: iload           8
        //   294: if_icmpge       324
        //   297: aload           15
        //   299: iload           5
        //   301: iaload         
        //   302: istore          7
        //   304: aload           14
        //   306: iload           7
        //   308: iload           4
        //   310: isub           
        //   311: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //   314: iinc            5, 1
        //   317: iload           7
        //   319: istore          4
        //   321: goto            290
        //   324: iinc            3, 1
        //   327: iload           6
        //   329: istore          4
        //   331: goto            231
        //   334: goto            1056
        //   337: astore_0       
        //   338: goto            334
        //   341: aload           14
        //   343: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   346: astore          15
        //   348: iload           4
        //   350: aload           15
        //   352: arraylength    
        //   353: if_icmpne       1001
        //   356: new             Lr0/j;
        //   359: dup            
        //   360: iconst_3       
        //   361: iconst_1       
        //   362: aload           15
        //   364: invokespecial   r0/j.<init>:(IZ[B)V
        //   367: astore          15
        //   369: aload           14
        //   371: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   374: aload           13
        //   376: aload           15
        //   378: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   381: pop            
        //   382: new             Ljava/io/ByteArrayOutputStream;
        //   385: dup            
        //   386: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   389: astore          14
        //   391: iconst_0       
        //   392: istore_3       
        //   393: iconst_0       
        //   394: istore          4
        //   396: iload_3        
        //   397: aload_2        
        //   398: arraylength    
        //   399: if_icmpge       623
        //   402: aload_2        
        //   403: iload_3        
        //   404: aaload         
        //   405: astore          16
        //   407: aload           16
        //   409: getfield        r0/a.i:Ljava/util/TreeMap;
        //   412: invokevirtual   java/util/TreeMap.entrySet:()Ljava/util/Set;
        //   415: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   420: astore          15
        //   422: iconst_0       
        //   423: istore          5
        //   425: aload           15
        //   427: invokeinterface java/util/Iterator.hasNext:()Z
        //   432: ifeq            464
        //   435: iload           5
        //   437: aload           15
        //   439: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   444: checkcast       Ljava/util/Map$Entry;
        //   447: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   452: checkcast       Ljava/lang/Integer;
        //   455: invokevirtual   java/lang/Integer.intValue:()I
        //   458: ior            
        //   459: istore          5
        //   461: goto            425
        //   464: new             Ljava/io/ByteArrayOutputStream;
        //   467: astore          17
        //   469: aload           17
        //   471: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   474: aload           17
        //   476: aload           16
        //   478: invokestatic    r0/c.q:(Ljava/io/ByteArrayOutputStream;Lr0/a;)V
        //   481: aload           17
        //   483: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   486: astore          15
        //   488: aload           17
        //   490: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   493: new             Ljava/io/ByteArrayOutputStream;
        //   496: astore          17
        //   498: aload           17
        //   500: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   503: aload           17
        //   505: aload           16
        //   507: invokestatic    r0/c.r:(Ljava/io/ByteArrayOutputStream;Lr0/a;)V
        //   510: aload           17
        //   512: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   515: astore          16
        //   517: aload           17
        //   519: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   522: aload           14
        //   524: iload_3        
        //   525: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //   528: aload           15
        //   530: arraylength    
        //   531: iconst_2       
        //   532: iadd           
        //   533: aload           16
        //   535: arraylength    
        //   536: iadd           
        //   537: istore          6
        //   539: aload           14
        //   541: iload           6
        //   543: i2l            
        //   544: iconst_4       
        //   545: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   548: aload           14
        //   550: iload           5
        //   552: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //   555: aload           14
        //   557: aload           15
        //   559: invokevirtual   java/io/OutputStream.write:([B)V
        //   562: aload           14
        //   564: aload           16
        //   566: invokevirtual   java/io/OutputStream.write:([B)V
        //   569: iload           4
        //   571: bipush          6
        //   573: iadd           
        //   574: iload           6
        //   576: iadd           
        //   577: istore          4
        //   579: iinc            3, 1
        //   582: goto            396
        //   585: astore_0       
        //   586: goto            985
        //   589: astore_0       
        //   590: aload           17
        //   592: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   595: goto            604
        //   598: astore_1       
        //   599: aload_0        
        //   600: aload_1        
        //   601: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   604: aload_0        
        //   605: athrow         
        //   606: astore_0       
        //   607: aload           17
        //   609: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   612: goto            621
        //   615: astore_1       
        //   616: aload_0        
        //   617: aload_1        
        //   618: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   621: aload_0        
        //   622: athrow         
        //   623: aload           14
        //   625: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   628: astore_2       
        //   629: iload           4
        //   631: aload_2        
        //   632: arraylength    
        //   633: if_icmpne       931
        //   636: new             Lr0/j;
        //   639: dup            
        //   640: iconst_4       
        //   641: iconst_1       
        //   642: aload_2        
        //   643: invokespecial   r0/j.<init>:(IZ[B)V
        //   646: astore_2       
        //   647: aload           14
        //   649: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   652: aload           13
        //   654: aload_2        
        //   655: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   658: pop            
        //   659: iconst_4       
        //   660: i2l            
        //   661: lstore          9
        //   663: lload           9
        //   665: lload           9
        //   667: ladd           
        //   668: ldc2_w          4
        //   671: ladd           
        //   672: aload           13
        //   674: invokevirtual   java/util/ArrayList.size:()I
        //   677: bipush          16
        //   679: imul           
        //   680: i2l            
        //   681: ladd           
        //   682: lstore          11
        //   684: aload_0        
        //   685: aload           13
        //   687: invokevirtual   java/util/ArrayList.size:()I
        //   690: i2l            
        //   691: iconst_4       
        //   692: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   695: iconst_0       
        //   696: istore_3       
        //   697: iload_3        
        //   698: aload           13
        //   700: invokevirtual   java/util/ArrayList.size:()I
        //   703: if_icmpge       901
        //   706: aload           13
        //   708: iload_3        
        //   709: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   712: checkcast       Lr0/j;
        //   715: astore_2       
        //   716: aload_2        
        //   717: getfield        r0/j.a:I
        //   720: istore          4
        //   722: iload           4
        //   724: iconst_1       
        //   725: if_icmpeq       784
        //   728: iload           4
        //   730: iconst_2       
        //   731: if_icmpeq       778
        //   734: iload           4
        //   736: iconst_3       
        //   737: if_icmpeq       770
        //   740: iload           4
        //   742: iconst_4       
        //   743: if_icmpeq       762
        //   746: iload           4
        //   748: iconst_5       
        //   749: if_icmpne       760
        //   752: ldc2_w          4
        //   755: lstore          9
        //   757: goto            790
        //   760: aconst_null    
        //   761: athrow         
        //   762: ldc2_w          3
        //   765: lstore          9
        //   767: goto            757
        //   770: ldc2_w          2
        //   773: lstore          9
        //   775: goto            757
        //   778: lconst_1       
        //   779: lstore          9
        //   781: goto            757
        //   784: lconst_0       
        //   785: lstore          9
        //   787: goto            757
        //   790: aload_0        
        //   791: lload           9
        //   793: iconst_4       
        //   794: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   797: aload_0        
        //   798: lload           11
        //   800: iconst_4       
        //   801: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   804: aload_2        
        //   805: getfield        r0/j.b:[B
        //   808: astore          14
        //   810: aload_2        
        //   811: getfield        r0/j.c:Z
        //   814: ifeq            865
        //   817: aload           14
        //   819: arraylength    
        //   820: i2l            
        //   821: lstore          9
        //   823: aload           14
        //   825: invokestatic    r0/c.a:([B)[B
        //   828: astore_2       
        //   829: aload_1        
        //   830: aload_2        
        //   831: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   834: pop            
        //   835: aload_0        
        //   836: aload_2        
        //   837: arraylength    
        //   838: i2l            
        //   839: iconst_4       
        //   840: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   843: aload_0        
        //   844: lload           9
        //   846: iconst_4       
        //   847: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   850: aload_2        
        //   851: arraylength    
        //   852: istore          4
        //   854: lload           11
        //   856: iload           4
        //   858: i2l            
        //   859: ladd           
        //   860: lstore          11
        //   862: goto            895
        //   865: aload_1        
        //   866: aload           14
        //   868: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   871: pop            
        //   872: aload_0        
        //   873: aload           14
        //   875: arraylength    
        //   876: i2l            
        //   877: iconst_4       
        //   878: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   881: aload_0        
        //   882: lconst_0       
        //   883: iconst_4       
        //   884: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //   887: aload           14
        //   889: arraylength    
        //   890: istore          4
        //   892: goto            854
        //   895: iinc            3, 1
        //   898: goto            697
        //   901: iconst_0       
        //   902: istore_3       
        //   903: iload_3        
        //   904: aload_1        
        //   905: invokevirtual   java/util/ArrayList.size:()I
        //   908: if_icmpge       929
        //   911: aload_0        
        //   912: aload_1        
        //   913: iload_3        
        //   914: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   917: checkcast       [B
        //   920: invokevirtual   java/io/OutputStream.write:([B)V
        //   923: iinc            3, 1
        //   926: goto            903
        //   929: iconst_1       
        //   930: ireturn        
        //   931: new             Ljava/lang/StringBuilder;
        //   934: astore_0       
        //   935: aload_0        
        //   936: invokespecial   java/lang/StringBuilder.<init>:()V
        //   939: aload_0        
        //   940: ldc_w           "Expected size "
        //   943: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   946: pop            
        //   947: aload_0        
        //   948: iload           4
        //   950: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   953: pop            
        //   954: aload_0        
        //   955: ldc_w           ", does not match actual size "
        //   958: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   961: pop            
        //   962: aload_0        
        //   963: aload_2        
        //   964: arraylength    
        //   965: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   968: pop            
        //   969: aload_0        
        //   970: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   973: astore_1       
        //   974: new             Ljava/lang/IllegalStateException;
        //   977: astore_0       
        //   978: aload_0        
        //   979: aload_1        
        //   980: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   983: aload_0        
        //   984: athrow         
        //   985: aload           14
        //   987: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   990: goto            999
        //   993: astore_1       
        //   994: aload_0        
        //   995: aload_1        
        //   996: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   999: aload_0        
        //  1000: athrow         
        //  1001: new             Ljava/lang/StringBuilder;
        //  1004: astore_0       
        //  1005: aload_0        
        //  1006: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1009: aload_0        
        //  1010: ldc_w           "Expected size "
        //  1013: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1016: pop            
        //  1017: aload_0        
        //  1018: iload           4
        //  1020: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1023: pop            
        //  1024: aload_0        
        //  1025: ldc_w           ", does not match actual size "
        //  1028: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1031: pop            
        //  1032: aload_0        
        //  1033: aload           15
        //  1035: arraylength    
        //  1036: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1039: pop            
        //  1040: aload_0        
        //  1041: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1044: astore_1       
        //  1045: new             Ljava/lang/IllegalStateException;
        //  1048: astore_0       
        //  1049: aload_0        
        //  1050: aload_1        
        //  1051: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1054: aload_0        
        //  1055: athrow         
        //  1056: aload           14
        //  1058: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //  1061: goto            1070
        //  1064: astore_1       
        //  1065: aload_0        
        //  1066: aload_1        
        //  1067: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1070: aload_0        
        //  1071: athrow         
        //  1072: new             Ljava/lang/StringBuilder;
        //  1075: astore_0       
        //  1076: aload_0        
        //  1077: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1080: aload_0        
        //  1081: ldc_w           "Expected size "
        //  1084: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1087: pop            
        //  1088: aload_0        
        //  1089: iload_3        
        //  1090: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1093: pop            
        //  1094: aload_0        
        //  1095: ldc_w           ", does not match actual size "
        //  1098: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1101: pop            
        //  1102: aload_0        
        //  1103: aload           15
        //  1105: arraylength    
        //  1106: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1109: pop            
        //  1110: aload_0        
        //  1111: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1114: astore_1       
        //  1115: new             Ljava/lang/IllegalStateException;
        //  1118: astore_0       
        //  1119: aload_0        
        //  1120: aload_1        
        //  1121: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1124: aload_0        
        //  1125: athrow         
        //  1126: aload           14
        //  1128: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //  1131: goto            1140
        //  1134: astore_1       
        //  1135: aload_0        
        //  1136: aload_1        
        //  1137: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1140: aload_0        
        //  1141: athrow         
        //  1142: getstatic       r0/c.e:[B
        //  1145: astore          13
        //  1147: aload_1        
        //  1148: aload           13
        //  1150: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1153: ifeq            1199
        //  1156: aload_2        
        //  1157: aload           13
        //  1159: invokestatic    r0/c.b:([Lr0/a;[B)[B
        //  1162: astore_1       
        //  1163: aload_0        
        //  1164: aload_2        
        //  1165: arraylength    
        //  1166: i2l            
        //  1167: iconst_1       
        //  1168: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1171: aload_0        
        //  1172: aload_1        
        //  1173: arraylength    
        //  1174: i2l            
        //  1175: iconst_4       
        //  1176: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1179: aload_1        
        //  1180: invokestatic    r0/c.a:([B)[B
        //  1183: astore_1       
        //  1184: aload_0        
        //  1185: aload_1        
        //  1186: arraylength    
        //  1187: i2l            
        //  1188: iconst_4       
        //  1189: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1192: aload_0        
        //  1193: aload_1        
        //  1194: invokevirtual   java/io/OutputStream.write:([B)V
        //  1197: iconst_1       
        //  1198: ireturn        
        //  1199: getstatic       r0/c.g:[B
        //  1202: astore          13
        //  1204: aload_1        
        //  1205: aload           13
        //  1207: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1210: ifeq            1411
        //  1213: aload_0        
        //  1214: aload_2        
        //  1215: arraylength    
        //  1216: i2l            
        //  1217: iconst_1       
        //  1218: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1221: aload_2        
        //  1222: arraylength    
        //  1223: istore          5
        //  1225: iconst_0       
        //  1226: istore_3       
        //  1227: iload_3        
        //  1228: iload           5
        //  1230: if_icmpge       1409
        //  1233: aload_2        
        //  1234: iload_3        
        //  1235: aaload         
        //  1236: astore_1       
        //  1237: aload_1        
        //  1238: getfield        r0/a.i:Ljava/util/TreeMap;
        //  1241: invokevirtual   java/util/TreeMap.size:()I
        //  1244: istore          4
        //  1246: aload_1        
        //  1247: getfield        r0/a.b:Ljava/lang/String;
        //  1250: astore          14
        //  1252: aload           13
        //  1254: aload_1        
        //  1255: getfield        r0/a.a:Ljava/lang/String;
        //  1258: aload           14
        //  1260: invokestatic    r0/c.d:([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1263: astore          15
        //  1265: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //  1268: astore          14
        //  1270: aload_0        
        //  1271: aload           15
        //  1273: aload           14
        //  1275: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //  1278: arraylength    
        //  1279: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1282: aload_0        
        //  1283: aload_1        
        //  1284: getfield        r0/a.h:[I
        //  1287: arraylength    
        //  1288: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1291: aload_0        
        //  1292: iload           4
        //  1294: iconst_4       
        //  1295: imul           
        //  1296: i2l            
        //  1297: iconst_4       
        //  1298: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1301: aload_0        
        //  1302: aload_1        
        //  1303: getfield        r0/a.c:J
        //  1306: iconst_4       
        //  1307: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1310: aload_0        
        //  1311: aload           15
        //  1313: aload           14
        //  1315: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //  1318: invokevirtual   java/io/OutputStream.write:([B)V
        //  1321: aload_1        
        //  1322: getfield        r0/a.i:Ljava/util/TreeMap;
        //  1325: invokevirtual   java/util/TreeMap.keySet:()Ljava/util/Set;
        //  1328: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1333: astore          14
        //  1335: aload           14
        //  1337: invokeinterface java/util/Iterator.hasNext:()Z
        //  1342: ifeq            1370
        //  1345: aload_0        
        //  1346: aload           14
        //  1348: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1353: checkcast       Ljava/lang/Integer;
        //  1356: invokevirtual   java/lang/Integer.intValue:()I
        //  1359: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1362: aload_0        
        //  1363: iconst_0       
        //  1364: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1367: goto            1335
        //  1370: aload_1        
        //  1371: getfield        r0/a.h:[I
        //  1374: astore_1       
        //  1375: aload_1        
        //  1376: arraylength    
        //  1377: istore          6
        //  1379: iconst_0       
        //  1380: istore          4
        //  1382: iload           4
        //  1384: iload           6
        //  1386: if_icmpge       1403
        //  1389: aload_0        
        //  1390: aload_1        
        //  1391: iload           4
        //  1393: iaload         
        //  1394: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1397: iinc            4, 1
        //  1400: goto            1382
        //  1403: iinc            3, 1
        //  1406: goto            1227
        //  1409: iconst_1       
        //  1410: ireturn        
        //  1411: getstatic       r0/c.f:[B
        //  1414: astore          13
        //  1416: aload_1        
        //  1417: aload           13
        //  1419: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1422: ifeq            1468
        //  1425: aload_2        
        //  1426: aload           13
        //  1428: invokestatic    r0/c.b:([Lr0/a;[B)[B
        //  1431: astore_1       
        //  1432: aload_0        
        //  1433: aload_2        
        //  1434: arraylength    
        //  1435: i2l            
        //  1436: iconst_1       
        //  1437: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1440: aload_0        
        //  1441: aload_1        
        //  1442: arraylength    
        //  1443: i2l            
        //  1444: iconst_4       
        //  1445: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1448: aload_1        
        //  1449: invokestatic    r0/c.a:([B)[B
        //  1452: astore_1       
        //  1453: aload_0        
        //  1454: aload_1        
        //  1455: arraylength    
        //  1456: i2l            
        //  1457: iconst_4       
        //  1458: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1461: aload_0        
        //  1462: aload_1        
        //  1463: invokevirtual   java/io/OutputStream.write:([B)V
        //  1466: iconst_1       
        //  1467: ireturn        
        //  1468: getstatic       r0/c.h:[B
        //  1471: astore          13
        //  1473: aload_1        
        //  1474: aload           13
        //  1476: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1479: ifeq            1663
        //  1482: aload_0        
        //  1483: aload_2        
        //  1484: arraylength    
        //  1485: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1488: aload_2        
        //  1489: arraylength    
        //  1490: istore          5
        //  1492: iconst_0       
        //  1493: istore_3       
        //  1494: iload_3        
        //  1495: iload           5
        //  1497: if_icmpge       1661
        //  1500: aload_2        
        //  1501: iload_3        
        //  1502: aaload         
        //  1503: astore_1       
        //  1504: aload           13
        //  1506: aload_1        
        //  1507: getfield        r0/a.a:Ljava/lang/String;
        //  1510: aload_1        
        //  1511: getfield        r0/a.b:Ljava/lang/String;
        //  1514: invokestatic    r0/c.d:([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1517: astore          16
        //  1519: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //  1522: astore          15
        //  1524: aload_0        
        //  1525: aload           16
        //  1527: aload           15
        //  1529: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //  1532: arraylength    
        //  1533: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1536: aload_1        
        //  1537: getfield        r0/a.i:Ljava/util/TreeMap;
        //  1540: astore          14
        //  1542: aload_0        
        //  1543: aload           14
        //  1545: invokevirtual   java/util/TreeMap.size:()I
        //  1548: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1551: aload_0        
        //  1552: aload_1        
        //  1553: getfield        r0/a.h:[I
        //  1556: arraylength    
        //  1557: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1560: aload_0        
        //  1561: aload_1        
        //  1562: getfield        r0/a.c:J
        //  1565: iconst_4       
        //  1566: invokestatic    r0/c.t:(Ljava/io/ByteArrayOutputStream;JI)V
        //  1569: aload_0        
        //  1570: aload           16
        //  1572: aload           15
        //  1574: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //  1577: invokevirtual   java/io/OutputStream.write:([B)V
        //  1580: aload           14
        //  1582: invokevirtual   java/util/TreeMap.keySet:()Ljava/util/Set;
        //  1585: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1590: astore          14
        //  1592: aload           14
        //  1594: invokeinterface java/util/Iterator.hasNext:()Z
        //  1599: ifeq            1622
        //  1602: aload_0        
        //  1603: aload           14
        //  1605: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1610: checkcast       Ljava/lang/Integer;
        //  1613: invokevirtual   java/lang/Integer.intValue:()I
        //  1616: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1619: goto            1592
        //  1622: aload_1        
        //  1623: getfield        r0/a.h:[I
        //  1626: astore_1       
        //  1627: aload_1        
        //  1628: arraylength    
        //  1629: istore          6
        //  1631: iconst_0       
        //  1632: istore          4
        //  1634: iload           4
        //  1636: iload           6
        //  1638: if_icmpge       1655
        //  1641: aload_0        
        //  1642: aload_1        
        //  1643: iload           4
        //  1645: iaload         
        //  1646: invokestatic    r0/c.u:(Ljava/io/ByteArrayOutputStream;I)V
        //  1649: iinc            4, 1
        //  1652: goto            1634
        //  1655: iinc            3, 1
        //  1658: goto            1494
        //  1661: iconst_1       
        //  1662: ireturn        
        //  1663: iconst_0       
        //  1664: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  42     49     169    1142   Any
        //  54     61     169    1142   Any
        //  67     140    169    1142   Any
        //  148    160    169    1142   Any
        //  173    185    169    1142   Any
        //  191    204    169    1142   Any
        //  234    240    337    1072   Any
        //  245    287    337    1072   Any
        //  304    314    337    1072   Any
        //  341    369    337    1072   Any
        //  396    402    585    1001   Any
        //  407    422    585    1001   Any
        //  425    461    585    1001   Any
        //  464    474    585    1001   Any
        //  474    488    606    623    Any
        //  488    503    585    1001   Any
        //  503    517    589    606    Any
        //  517    569    585    1001   Any
        //  590    595    598    604    Any
        //  599    604    585    1001   Any
        //  604    606    585    1001   Any
        //  607    612    615    621    Any
        //  616    621    585    1001   Any
        //  621    623    585    1001   Any
        //  623    647    585    1001   Any
        //  931    985    585    1001   Any
        //  985    990    993    999    Any
        //  1001   1056   337    1072   Any
        //  1056   1061   1064   1070   Any
        //  1072   1126   169    1142   Any
        //  1126   1131   1134   1140   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
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
    
    public static void p(final ByteArrayOutputStream byteArrayOutputStream, final a a, final String s) {
        final Charset utf_8 = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, s.getBytes(utf_8).length);
        u(byteArrayOutputStream, a.e);
        t(byteArrayOutputStream, a.f, 4);
        t(byteArrayOutputStream, a.c, 4);
        t(byteArrayOutputStream, a.g, 4);
        ((OutputStream)byteArrayOutputStream).write(s.getBytes(utf_8));
    }
    
    public static void q(final ByteArrayOutputStream byteArrayOutputStream, final a a) {
        final byte[] array = new byte[(a.g * 2 + 7 & 0xFFFFFFF8) / 8];
        for (final Map$Entry map$Entry : a.i.entrySet()) {
            final int intValue = (int)map$Entry.getKey();
            final int intValue2 = (int)map$Entry.getValue();
            if ((intValue2 & 0x2) != 0x0) {
                final int n = intValue / 8;
                array[n] |= (byte)(1 << intValue % 8);
            }
            if ((intValue2 & 0x4) != 0x0) {
                final int n2 = intValue + a.g;
                final int n3 = n2 / 8;
                array[n3] |= (byte)(1 << n2 % 8);
            }
        }
        ((OutputStream)byteArrayOutputStream).write(array);
    }
    
    public static void r(final ByteArrayOutputStream byteArrayOutputStream, final a a) {
        final Iterator iterator = a.i.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)iterator.next();
            final int intValue = (int)map$Entry.getKey();
            if (((int)map$Entry.getValue() & 0x1) == 0x0) {
                continue;
            }
            u(byteArrayOutputStream, intValue - n);
            u(byteArrayOutputStream, 0);
            n = intValue;
        }
    }
    
    public static void s(final Context p0, final Executor p1, final r0.b p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //     4: astore          10
        //     6: aload           10
        //     8: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    11: astore          8
        //    13: aload           10
        //    15: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    18: astore          9
        //    20: aload           10
        //    22: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //    25: astore          13
        //    27: new             Ljava/io/File;
        //    30: dup            
        //    31: aload           9
        //    33: getfield        android/content/pm/ApplicationInfo.sourceDir:Ljava/lang/String;
        //    36: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    39: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    42: astore          9
        //    44: aload_0        
        //    45: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    48: astore          10
        //    50: aload           10
        //    52: aload           8
        //    54: iconst_0       
        //    55: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    58: astore          11
        //    60: aload_0        
        //    61: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    64: astore          10
        //    66: iload_3        
        //    67: ifne            246
        //    70: new             Ljava/io/File;
        //    73: dup            
        //    74: aload           10
        //    76: ldc             "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
        //    78: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    81: astore          15
        //    83: aload           15
        //    85: invokevirtual   java/io/File.exists:()Z
        //    88: ifne            97
        //    91: iconst_0       
        //    92: istore          5
        //    94: goto            199
        //    97: new             Ljava/io/DataInputStream;
        //   100: astore          12
        //   102: new             Ljava/io/FileInputStream;
        //   105: astore          14
        //   107: aload           14
        //   109: aload           15
        //   111: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   114: aload           12
        //   116: aload           14
        //   118: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   121: aload           12
        //   123: invokevirtual   java/io/DataInputStream.readLong:()J
        //   126: lstore          6
        //   128: aload           12
        //   130: invokevirtual   java/io/InputStream.close:()V
        //   133: lload           6
        //   135: aload           11
        //   137: getfield        android/content/pm/PackageInfo.lastUpdateTime:J
        //   140: lcmp           
        //   141: ifne            150
        //   144: iconst_1       
        //   145: istore          4
        //   147: goto            153
        //   150: iconst_0       
        //   151: istore          4
        //   153: iload           4
        //   155: istore          5
        //   157: iload           4
        //   159: ifeq            199
        //   162: aload_2        
        //   163: iconst_2       
        //   164: aconst_null    
        //   165: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   170: iload           4
        //   172: istore          5
        //   174: goto            199
        //   177: astore          14
        //   179: aload           12
        //   181: invokevirtual   java/io/InputStream.close:()V
        //   184: goto            196
        //   187: astore          12
        //   189: aload           14
        //   191: aload           12
        //   193: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   196: aload           14
        //   198: athrow         
        //   199: iload           5
        //   201: ifne            207
        //   204: goto            246
        //   207: new             Ljava/lang/StringBuilder;
        //   210: dup            
        //   211: ldc_w           "Skipping profile installation for "
        //   214: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   217: astore_1       
        //   218: aload_1        
        //   219: aload_0        
        //   220: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   226: pop            
        //   227: ldc_w           "ProfileInstaller"
        //   230: aload_1        
        //   231: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   234: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   237: pop            
        //   238: aload_0        
        //   239: iconst_0       
        //   240: invokestatic    r0/i.c:(Landroid/content/Context;Z)V
        //   243: goto            1360
        //   246: new             Ljava/lang/StringBuilder;
        //   249: dup            
        //   250: ldc_w           "Installing profile for "
        //   253: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   256: astore          12
        //   258: aload           12
        //   260: aload_0        
        //   261: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: pop            
        //   268: ldc_w           "ProfileInstaller"
        //   271: aload           12
        //   273: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   276: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   279: pop            
        //   280: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   283: istore          4
        //   285: new             Ljava/io/File;
        //   288: dup            
        //   289: new             Ljava/io/File;
        //   292: dup            
        //   293: ldc_w           "/data/misc/profiles/cur/0"
        //   296: aload           8
        //   298: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   301: ldc_w           "primary.prof"
        //   304: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   307: astore          12
        //   309: new             Lcom/google/android/gms/internal/ads/g;
        //   312: dup            
        //   313: aload           13
        //   315: aload_1        
        //   316: aload_2        
        //   317: aload           9
        //   319: aload           12
        //   321: invokespecial   com/google/android/gms/internal/ads/g.<init>:(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lr0/b;Ljava/lang/String;Ljava/io/File;)V
        //   324: astore          8
        //   326: aload           8
        //   328: getfield        com/google/android/gms/internal/ads/g.d:Ljava/lang/Object;
        //   331: checkcast       [B
        //   334: astore          14
        //   336: aload           14
        //   338: ifnonnull       355
        //   341: aload           8
        //   343: iconst_3       
        //   344: iload           4
        //   346: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   349: invokevirtual   com/google/android/gms/internal/ads/g.b:(ILjava/io/Serializable;)V
        //   352: goto            1336
        //   355: aload           12
        //   357: invokevirtual   java/io/File.exists:()Z
        //   360: ifeq            381
        //   363: aload           12
        //   365: invokevirtual   java/io/File.canWrite:()Z
        //   368: ifne            387
        //   371: aload           8
        //   373: iconst_4       
        //   374: aconst_null    
        //   375: invokevirtual   com/google/android/gms/internal/ads/g.b:(ILjava/io/Serializable;)V
        //   378: goto            352
        //   381: aload           12
        //   383: invokevirtual   java/io/File.createNewFile:()Z
        //   386: pop            
        //   387: aload           8
        //   389: iconst_1       
        //   390: putfield        com/google/android/gms/internal/ads/g.a:Z
        //   393: getstatic       r0/c.b:[B
        //   396: astore          12
        //   398: aload           8
        //   400: aload           13
        //   402: ldc_w           "dexopt/baseline.prof"
        //   405: invokevirtual   com/google/android/gms/internal/ads/g.a:(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
        //   408: astore_1       
        //   409: goto            437
        //   412: astore_1       
        //   413: aload_2        
        //   414: bipush          7
        //   416: aload_1        
        //   417: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   422: goto            435
        //   425: astore_1       
        //   426: aload_2        
        //   427: bipush          6
        //   429: aload_1        
        //   430: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   435: aconst_null    
        //   436: astore_1       
        //   437: aload_1        
        //   438: ifnull          617
        //   441: aload           12
        //   443: aload_1        
        //   444: iconst_4       
        //   445: invokestatic    r0/c.f:(Ljava/io/InputStream;I)[B
        //   448: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   451: ifeq            511
        //   454: aload_1        
        //   455: aload_1        
        //   456: iconst_4       
        //   457: invokestatic    r0/c.f:(Ljava/io/InputStream;I)[B
        //   460: aload           8
        //   462: getfield        com/google/android/gms/internal/ads/g.f:Ljava/io/Serializable;
        //   465: checkcast       Ljava/lang/String;
        //   468: invokestatic    r0/c.l:(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lr0/a;
        //   471: astore          9
        //   473: aload_1        
        //   474: invokevirtual   java/io/InputStream.close:()V
        //   477: aload           9
        //   479: astore_1       
        //   480: goto            589
        //   483: astore_1       
        //   484: aload_2        
        //   485: bipush          7
        //   487: aload_1        
        //   488: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   493: aload           9
        //   495: astore_1       
        //   496: goto            589
        //   499: astore_0       
        //   500: goto            598
        //   503: astore          9
        //   505: goto            527
        //   508: goto            566
        //   511: new             Ljava/lang/IllegalStateException;
        //   514: astore          9
        //   516: aload           9
        //   518: ldc_w           "Invalid magic"
        //   521: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   524: aload           9
        //   526: athrow         
        //   527: aload_2        
        //   528: bipush          8
        //   530: aload           9
        //   532: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   537: aload_1        
        //   538: invokevirtual   java/io/InputStream.close:()V
        //   541: goto            587
        //   544: astore_1       
        //   545: aload_2        
        //   546: bipush          7
        //   548: aload_1        
        //   549: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   554: goto            587
        //   557: astore_0       
        //   558: goto            500
        //   561: astore          9
        //   563: goto            508
        //   566: aload_2        
        //   567: bipush          7
        //   569: aload           9
        //   571: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   576: aload_1        
        //   577: invokevirtual   java/io/InputStream.close:()V
        //   580: goto            587
        //   583: astore_1       
        //   584: goto            545
        //   587: aconst_null    
        //   588: astore_1       
        //   589: aload           8
        //   591: aload_1        
        //   592: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //   595: goto            617
        //   598: aload_1        
        //   599: invokevirtual   java/io/InputStream.close:()V
        //   602: goto            615
        //   605: astore_1       
        //   606: aload_2        
        //   607: bipush          7
        //   609: aload_1        
        //   610: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   615: aload_0        
        //   616: athrow         
        //   617: aload           8
        //   619: getfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //   622: checkcast       [Lr0/a;
        //   625: astore          9
        //   627: aload           9
        //   629: ifnull          861
        //   632: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   635: istore          4
        //   637: iload           4
        //   639: bipush          34
        //   641: if_icmple       647
        //   644: goto            861
        //   647: iload           4
        //   649: bipush          24
        //   651: if_icmpeq       695
        //   654: iload           4
        //   656: bipush          25
        //   658: if_icmpeq       695
        //   661: iload           4
        //   663: tableswitch {
        //               62: 695
        //               63: 695
        //               64: 695
        //               65: 695
        //          default: 692
        //        }
        //   692: goto            861
        //   695: aload           8
        //   697: aload           13
        //   699: ldc_w           "dexopt/baseline.profm"
        //   702: invokevirtual   com/google/android/gms/internal/ads/g.a:(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
        //   705: astore_1       
        //   706: aload_1        
        //   707: ifnull          802
        //   710: getstatic       r0/c.c:[B
        //   713: aload_1        
        //   714: iconst_4       
        //   715: invokestatic    r0/c.f:(Ljava/io/InputStream;I)[B
        //   718: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   721: ifeq            769
        //   724: aload           8
        //   726: aload_1        
        //   727: aload_1        
        //   728: iconst_4       
        //   729: invokestatic    r0/c.f:(Ljava/io/InputStream;I)[B
        //   732: aload           14
        //   734: aload           9
        //   736: invokestatic    r0/c.i:(Ljava/io/FileInputStream;[B[B[Lr0/a;)[Lr0/a;
        //   739: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //   742: aload_1        
        //   743: invokevirtual   java/io/InputStream.close:()V
        //   746: aload           8
        //   748: astore_1       
        //   749: goto            854
        //   752: astore_1       
        //   753: goto            813
        //   756: astore_1       
        //   757: goto            831
        //   760: astore_1       
        //   761: goto            843
        //   764: astore          9
        //   766: goto            785
        //   769: new             Ljava/lang/IllegalStateException;
        //   772: astore          9
        //   774: aload           9
        //   776: ldc_w           "Invalid magic"
        //   779: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   782: aload           9
        //   784: athrow         
        //   785: aload_1        
        //   786: invokevirtual   java/io/InputStream.close:()V
        //   789: goto            799
        //   792: astore_1       
        //   793: aload           9
        //   795: aload_1        
        //   796: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   799: aload           9
        //   801: athrow         
        //   802: aload_1        
        //   803: ifnull          852
        //   806: aload_1        
        //   807: invokevirtual   java/io/InputStream.close:()V
        //   810: goto            852
        //   813: aload           8
        //   815: aconst_null    
        //   816: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //   819: aload_2        
        //   820: bipush          8
        //   822: aload_1        
        //   823: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   828: goto            852
        //   831: aload_2        
        //   832: bipush          7
        //   834: aload_1        
        //   835: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   840: goto            852
        //   843: aload_2        
        //   844: bipush          9
        //   846: aload_1        
        //   847: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   852: aconst_null    
        //   853: astore_1       
        //   854: aload_1        
        //   855: ifnull          861
        //   858: goto            864
        //   861: aload           8
        //   863: astore_1       
        //   864: aload_1        
        //   865: getfield        com/google/android/gms/internal/ads/g.c:Ljava/lang/Object;
        //   868: checkcast       Lr0/b;
        //   871: astore_2       
        //   872: aload_1        
        //   873: getfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //   876: checkcast       [Lr0/a;
        //   879: astore          9
        //   881: aload           9
        //   883: ifnull          1061
        //   886: aload_1        
        //   887: getfield        com/google/android/gms/internal/ads/g.d:Ljava/lang/Object;
        //   890: checkcast       [B
        //   893: astore          13
        //   895: aload           13
        //   897: ifnonnull       903
        //   900: goto            1061
        //   903: aload_1        
        //   904: getfield        com/google/android/gms/internal/ads/g.a:Z
        //   907: ifeq            1050
        //   910: new             Ljava/io/ByteArrayOutputStream;
        //   913: astore          8
        //   915: aload           8
        //   917: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   920: aload           8
        //   922: aload           12
        //   924: invokevirtual   java/io/OutputStream.write:([B)V
        //   927: aload           8
        //   929: aload           13
        //   931: invokevirtual   java/io/OutputStream.write:([B)V
        //   934: aload           8
        //   936: aload           13
        //   938: aload           9
        //   940: invokestatic    r0/c.o:(Ljava/io/ByteArrayOutputStream;[B[Lr0/a;)Z
        //   943: ifne            982
        //   946: aload_2        
        //   947: iconst_5       
        //   948: aconst_null    
        //   949: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //   954: aload_1        
        //   955: aconst_null    
        //   956: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //   959: aload           8
        //   961: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   964: goto            1061
        //   967: astore          8
        //   969: goto            1019
        //   972: astore          8
        //   974: goto            1032
        //   977: astore          9
        //   979: goto            999
        //   982: aload_1        
        //   983: aload           8
        //   985: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   988: putfield        com/google/android/gms/internal/ads/g.h:Ljava/lang/Object;
        //   991: aload           8
        //   993: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   996: goto            1042
        //   999: aload           8
        //  1001: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //  1004: goto            1016
        //  1007: astore          8
        //  1009: aload           9
        //  1011: aload           8
        //  1013: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1016: aload           9
        //  1018: athrow         
        //  1019: aload_2        
        //  1020: bipush          8
        //  1022: aload           8
        //  1024: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //  1029: goto            1042
        //  1032: aload_2        
        //  1033: bipush          7
        //  1035: aload           8
        //  1037: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //  1042: aload_1        
        //  1043: aconst_null    
        //  1044: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //  1047: goto            1061
        //  1050: new             Ljava/lang/IllegalStateException;
        //  1053: dup            
        //  1054: ldc_w           "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
        //  1057: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1060: athrow         
        //  1061: aload_1        
        //  1062: getfield        com/google/android/gms/internal/ads/g.h:Ljava/lang/Object;
        //  1065: checkcast       [B
        //  1068: astore_2       
        //  1069: aload_2        
        //  1070: ifnonnull       1079
        //  1073: iconst_0       
        //  1074: istore          4
        //  1076: goto            1282
        //  1079: aload_1        
        //  1080: getfield        com/google/android/gms/internal/ads/g.a:Z
        //  1083: ifeq            1317
        //  1086: new             Ljava/io/ByteArrayInputStream;
        //  1089: astore          8
        //  1091: aload           8
        //  1093: aload_2        
        //  1094: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //  1097: new             Ljava/io/FileOutputStream;
        //  1100: astore          9
        //  1102: aload           9
        //  1104: aload_1        
        //  1105: getfield        com/google/android/gms/internal/ads/g.e:Ljava/lang/Object;
        //  1108: checkcast       Ljava/io/File;
        //  1111: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //  1114: sipush          512
        //  1117: newarray        B
        //  1119: astore_2       
        //  1120: aload           8
        //  1122: aload_2        
        //  1123: invokevirtual   java/io/InputStream.read:([B)I
        //  1126: istore          4
        //  1128: iload           4
        //  1130: ifle            1145
        //  1133: aload           9
        //  1135: aload_2        
        //  1136: iconst_0       
        //  1137: iload           4
        //  1139: invokevirtual   java/io/OutputStream.write:([BII)V
        //  1142: goto            1120
        //  1145: aload_1        
        //  1146: iconst_1       
        //  1147: aconst_null    
        //  1148: invokevirtual   com/google/android/gms/internal/ads/g.b:(ILjava/io/Serializable;)V
        //  1151: aload           9
        //  1153: invokevirtual   java/io/OutputStream.close:()V
        //  1156: aload           8
        //  1158: invokevirtual   java/io/InputStream.close:()V
        //  1161: aload_1        
        //  1162: aconst_null    
        //  1163: putfield        com/google/android/gms/internal/ads/g.h:Ljava/lang/Object;
        //  1166: aload_1        
        //  1167: aconst_null    
        //  1168: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //  1171: iconst_1       
        //  1172: istore          4
        //  1174: goto            1282
        //  1177: astore_0       
        //  1178: goto            1305
        //  1181: astore_2       
        //  1182: goto            1249
        //  1185: astore_2       
        //  1186: goto            1269
        //  1189: astore_2       
        //  1190: goto            1223
        //  1193: astore_2       
        //  1194: goto            1201
        //  1197: astore_2       
        //  1198: goto            1194
        //  1201: aload           9
        //  1203: invokevirtual   java/io/OutputStream.close:()V
        //  1206: goto            1217
        //  1209: astore          9
        //  1211: aload_2        
        //  1212: aload           9
        //  1214: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1217: aload_2        
        //  1218: athrow         
        //  1219: astore_2       
        //  1220: goto            1190
        //  1223: aload           8
        //  1225: invokevirtual   java/io/InputStream.close:()V
        //  1228: goto            1239
        //  1231: astore          8
        //  1233: aload_2        
        //  1234: aload           8
        //  1236: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1239: aload_2        
        //  1240: athrow         
        //  1241: astore_2       
        //  1242: goto            1182
        //  1245: astore_2       
        //  1246: goto            1186
        //  1249: aload_1        
        //  1250: bipush          7
        //  1252: aload_2        
        //  1253: invokevirtual   com/google/android/gms/internal/ads/g.b:(ILjava/io/Serializable;)V
        //  1256: aload_1        
        //  1257: aconst_null    
        //  1258: putfield        com/google/android/gms/internal/ads/g.h:Ljava/lang/Object;
        //  1261: aload_1        
        //  1262: aconst_null    
        //  1263: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //  1266: goto            1279
        //  1269: aload_1        
        //  1270: bipush          6
        //  1272: aload_2        
        //  1273: invokevirtual   com/google/android/gms/internal/ads/g.b:(ILjava/io/Serializable;)V
        //  1276: goto            1256
        //  1279: iconst_0       
        //  1280: istore          4
        //  1282: iload           4
        //  1284: istore          5
        //  1286: iload           4
        //  1288: ifeq            1339
        //  1291: aload           11
        //  1293: aload           10
        //  1295: invokestatic    r0/c.e:(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
        //  1298: iload           4
        //  1300: istore          5
        //  1302: goto            1339
        //  1305: aload_1        
        //  1306: aconst_null    
        //  1307: putfield        com/google/android/gms/internal/ads/g.h:Ljava/lang/Object;
        //  1310: aload_1        
        //  1311: aconst_null    
        //  1312: putfield        com/google/android/gms/internal/ads/g.g:Ljava/lang/Object;
        //  1315: aload_0        
        //  1316: athrow         
        //  1317: new             Ljava/lang/IllegalStateException;
        //  1320: dup            
        //  1321: ldc_w           "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
        //  1324: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1327: athrow         
        //  1328: astore_1       
        //  1329: aload           8
        //  1331: iconst_4       
        //  1332: aconst_null    
        //  1333: invokevirtual   com/google/android/gms/internal/ads/g.b:(ILjava/io/Serializable;)V
        //  1336: iconst_0       
        //  1337: istore          5
        //  1339: iload           5
        //  1341: ifeq            1353
        //  1344: iload_3        
        //  1345: ifeq            1353
        //  1348: iconst_1       
        //  1349: istore_3       
        //  1350: goto            1355
        //  1353: iconst_0       
        //  1354: istore_3       
        //  1355: aload_0        
        //  1356: iload_3        
        //  1357: invokestatic    r0/i.c:(Landroid/content/Context;Z)V
        //  1360: return         
        //  1361: astore_1       
        //  1362: aload_2        
        //  1363: bipush          7
        //  1365: aload_1        
        //  1366: invokeinterface r0/b.c:(ILjava/io/Serializable;)V
        //  1371: aload_0        
        //  1372: iconst_0       
        //  1373: invokestatic    r0/i.c:(Landroid/content/Context;Z)V
        //  1376: return         
        //  1377: astore          12
        //  1379: goto            91
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  50     60     1361   1377   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  97     121    1377   1382   Ljava/io/IOException;
        //  121    128    177    199    Any
        //  128    133    1377   1382   Ljava/io/IOException;
        //  179    184    187    196    Any
        //  189    196    1377   1382   Ljava/io/IOException;
        //  196    199    1377   1382   Ljava/io/IOException;
        //  381    387    1328   1336   Ljava/io/IOException;
        //  398    409    425    435    Ljava/io/FileNotFoundException;
        //  398    409    412    425    Ljava/io/IOException;
        //  441    473    561    587    Ljava/io/IOException;
        //  441    473    503    545    Ljava/lang/IllegalStateException;
        //  441    473    499    500    Any
        //  473    477    483    499    Ljava/io/IOException;
        //  511    527    561    587    Ljava/io/IOException;
        //  511    527    503    545    Ljava/lang/IllegalStateException;
        //  511    527    499    500    Any
        //  527    537    557    561    Any
        //  537    541    544    545    Ljava/io/IOException;
        //  566    576    499    500    Any
        //  576    580    583    587    Ljava/io/IOException;
        //  598    602    605    615    Ljava/io/IOException;
        //  695    706    760    764    Ljava/io/FileNotFoundException;
        //  695    706    756    760    Ljava/io/IOException;
        //  695    706    752    756    Ljava/lang/IllegalStateException;
        //  710    742    764    802    Any
        //  742    746    760    764    Ljava/io/FileNotFoundException;
        //  742    746    756    760    Ljava/io/IOException;
        //  742    746    752    756    Ljava/lang/IllegalStateException;
        //  769    785    764    802    Any
        //  785    789    792    799    Any
        //  793    799    760    764    Ljava/io/FileNotFoundException;
        //  793    799    756    760    Ljava/io/IOException;
        //  793    799    752    756    Ljava/lang/IllegalStateException;
        //  799    802    760    764    Ljava/io/FileNotFoundException;
        //  799    802    756    760    Ljava/io/IOException;
        //  799    802    752    756    Ljava/lang/IllegalStateException;
        //  806    810    760    764    Ljava/io/FileNotFoundException;
        //  806    810    756    760    Ljava/io/IOException;
        //  806    810    752    756    Ljava/lang/IllegalStateException;
        //  910    920    972    977    Ljava/io/IOException;
        //  910    920    967    972    Ljava/lang/IllegalStateException;
        //  920    959    977    1019   Any
        //  959    964    972    977    Ljava/io/IOException;
        //  959    964    967    972    Ljava/lang/IllegalStateException;
        //  982    991    977    1019   Any
        //  991    996    972    977    Ljava/io/IOException;
        //  991    996    967    972    Ljava/lang/IllegalStateException;
        //  999    1004   1007   1016   Any
        //  1009   1016   972    977    Ljava/io/IOException;
        //  1009   1016   967    972    Ljava/lang/IllegalStateException;
        //  1016   1019   972    977    Ljava/io/IOException;
        //  1016   1019   967    972    Ljava/lang/IllegalStateException;
        //  1086   1097   1245   1249   Ljava/io/FileNotFoundException;
        //  1086   1097   1241   1245   Ljava/io/IOException;
        //  1086   1097   1177   1181   Any
        //  1097   1114   1219   1223   Any
        //  1114   1120   1197   1201   Any
        //  1120   1128   1197   1201   Any
        //  1133   1142   1197   1201   Any
        //  1145   1151   1193   1194   Any
        //  1151   1156   1189   1190   Any
        //  1156   1161   1185   1186   Ljava/io/FileNotFoundException;
        //  1156   1161   1181   1182   Ljava/io/IOException;
        //  1156   1161   1177   1181   Any
        //  1201   1206   1209   1217   Any
        //  1211   1217   1189   1190   Any
        //  1217   1219   1189   1190   Any
        //  1223   1228   1231   1239   Any
        //  1233   1239   1185   1186   Ljava/io/FileNotFoundException;
        //  1233   1239   1181   1182   Ljava/io/IOException;
        //  1233   1239   1177   1181   Any
        //  1239   1241   1185   1186   Ljava/io/FileNotFoundException;
        //  1239   1241   1181   1182   Ljava/io/IOException;
        //  1239   1241   1177   1181   Any
        //  1249   1256   1177   1181   Any
        //  1269   1276   1177   1181   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0527:
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
    
    public static void t(final ByteArrayOutputStream byteArrayOutputStream, final long n, final int n2) {
        final byte[] array = new byte[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = (byte)(n >> i * 8 & 0xFFL);
        }
        ((OutputStream)byteArrayOutputStream).write(array);
    }
    
    public static void u(final ByteArrayOutputStream byteArrayOutputStream, final int n) {
        t(byteArrayOutputStream, n, 2);
    }
}
