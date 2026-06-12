package l1;

import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import k1.c;
import I5.d;
import java.util.Set;

public final class a
{
    public static final String c;
    public static final Set d;
    public static final a e;
    public static final a f;
    public final String a;
    public final String b;
    
    static {
        final String s = c = I5.d.j("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        final String j = I5.d.j("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        final String i = I5.d.j("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])new c[] { new c("proto"), new c("json") })));
        e = new a(s, null);
        f = new a(j, i);
    }
    
    public a(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static a a(final byte[] array) {
        final String s = new String(array, Charset.forName("UTF-8"));
        if (!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        final String[] split = s.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        final String s2 = split[0];
        if (!s2.isEmpty()) {
            String s3;
            if ((s3 = split[1]).isEmpty()) {
                s3 = null;
            }
            return new a(s2, s3);
        }
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
    }
}
