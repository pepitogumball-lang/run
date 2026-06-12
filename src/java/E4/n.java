package E4;

import org.json.JSONArray;
import org.json.JSONException;
import m0.a;
import android.os.Build$VERSION;
import v.e;
import java.util.ArrayList;
import org.json.JSONObject;
import java.util.Locale;
import L3.A;

public final class n
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final o g;
    public final Integer h;
    public final String i;
    public final A j;
    public final String[] k;
    public final n[] l;
    public final Locale[] m;
    
    public n(final boolean a, final boolean b, final boolean c, final boolean d, final boolean e, final int f, final o g, final Integer h, final String i, final A j, final String[] k, final n[] l, final Locale[] m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static n a(final JSONObject jsonObject) {
        final String s = "creditCardExpirationMonth";
        final String s2 = null;
        final String string = jsonObject.getString("inputAction");
        if (string != null) {
            n[] array;
            if (!jsonObject.isNull("fields")) {
                final JSONArray jsonArray = jsonObject.getJSONArray("fields");
                final int length = jsonArray.length();
                array = new n[length];
                for (int i = 0; i < length; ++i) {
                    array[i] = a(jsonArray.getJSONObject(i));
                }
            }
            else {
                array = null;
            }
            Integer n = 1;
            int n2 = 0;
            Label_0316: {
                switch (string.hashCode()) {
                    case 2110497650: {
                        if (!string.equals((Object)"TextInputAction.previous")) {
                            break;
                        }
                        n2 = 7;
                        break Label_0316;
                    }
                    case 1539450297: {
                        if (!string.equals((Object)"TextInputAction.newline")) {
                            break;
                        }
                        n2 = 6;
                        break Label_0316;
                    }
                    case 1241689507: {
                        if (!string.equals((Object)"TextInputAction.go")) {
                            break;
                        }
                        n2 = 5;
                        break Label_0316;
                    }
                    case 469250275: {
                        if (!string.equals((Object)"TextInputAction.search")) {
                            break;
                        }
                        n2 = 4;
                        break Label_0316;
                    }
                    case -736940669: {
                        if (!string.equals((Object)"TextInputAction.send")) {
                            break;
                        }
                        n2 = 3;
                        break Label_0316;
                    }
                    case -737080013: {
                        if (!string.equals((Object)"TextInputAction.none")) {
                            break;
                        }
                        n2 = 2;
                        break Label_0316;
                    }
                    case -737089298: {
                        if (!string.equals((Object)"TextInputAction.next")) {
                            break;
                        }
                        n2 = 1;
                        break Label_0316;
                    }
                    case -737377923: {
                        if (!string.equals((Object)"TextInputAction.done")) {
                            break;
                        }
                        n2 = 0;
                        break Label_0316;
                    }
                }
                n2 = -1;
            }
            Integer value = null;
            Label_0433: {
                switch (n2) {
                    default: {
                        n = 0;
                        break;
                    }
                    case 7: {
                        n = 7;
                        break;
                    }
                    case 2:
                    case 6: {
                        break;
                    }
                    case 5: {
                        n = 2;
                        break;
                    }
                    case 4: {
                        n = 3;
                        break;
                    }
                    case 3: {
                        n = 4;
                        break;
                    }
                    case 1: {
                        n = 5;
                        break;
                    }
                    case 0: {
                        value = 6;
                        break Label_0433;
                    }
                }
                while (true) {
                    value = n;
                    break Label_0433;
                    continue;
                }
            }
            final ArrayList list = new ArrayList();
            JSONArray jsonArray2;
            if (jsonObject.isNull("contentCommitMimeTypes")) {
                jsonArray2 = null;
            }
            else {
                jsonArray2 = jsonObject.getJSONArray("contentCommitMimeTypes");
            }
            if (jsonArray2 != null) {
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    list.add((Object)jsonArray2.optString(j));
                }
            }
            Locale[] array2;
            if (!jsonObject.isNull("hintLocales")) {
                final JSONArray jsonArray3 = jsonObject.getJSONArray("hintLocales");
                array2 = new Locale[jsonArray3.length()];
                for (int k = 0; k < jsonArray3.length(); ++k) {
                    array2[k] = Locale.forLanguageTag(jsonArray3.optString(k));
                }
            }
            else {
                array2 = null;
            }
            final boolean optBoolean = jsonObject.optBoolean("obscureText");
            final boolean optBoolean2 = jsonObject.optBoolean("autocorrect", true);
            final boolean optBoolean3 = jsonObject.optBoolean("enableSuggestions");
            final boolean optBoolean4 = jsonObject.optBoolean("enableIMEPersonalizedLearning");
            final boolean optBoolean5 = jsonObject.optBoolean("enableDeltaModel");
            final String string2 = jsonObject.getString("textCapitalization");
            for (int n3 : e.e(4)) {
                String s3;
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                throw null;
                            }
                            s3 = "TextCapitalization.none";
                        }
                        else {
                            s3 = "TextCapitalization.sentences";
                        }
                    }
                    else {
                        s3 = "TextCapitalization.words";
                    }
                }
                else {
                    s3 = "TextCapitalization.characters";
                }
                if (s3.equals((Object)string2)) {
                    final JSONObject jsonObject2 = jsonObject.getJSONObject("inputType");
                    final o o = new(E4.o.class)();
                    final String string3 = jsonObject2.getString("name");
                    final int[] e2 = e.e(13);
                    final int length3 = e2.length;
                    final String s4 = s;
                    int n4 = 0;
                    final o o2 = o;
                    while (n4 < length3) {
                        final int n5 = e2[n4];
                        String s5 = null;
                        switch (n5) {
                            default: {
                                throw null;
                            }
                            case 13: {
                                s5 = "TextInputType.twitter";
                                break;
                            }
                            case 12: {
                                s5 = "TextInputType.webSearch";
                                break;
                            }
                            case 11: {
                                s5 = "TextInputType.none";
                                break;
                            }
                            case 10: {
                                s5 = "TextInputType.visiblePassword";
                                break;
                            }
                            case 9: {
                                s5 = "TextInputType.url";
                                break;
                            }
                            case 8: {
                                s5 = "TextInputType.emailAddress";
                                break;
                            }
                            case 7: {
                                s5 = "TextInputType.multiline";
                                break;
                            }
                            case 6: {
                                s5 = "TextInputType.phone";
                                break;
                            }
                            case 5: {
                                s5 = "TextInputType.number";
                                break;
                            }
                            case 4: {
                                s5 = "TextInputType.address";
                                break;
                            }
                            case 3: {
                                s5 = "TextInputType.name";
                                break;
                            }
                            case 2: {
                                s5 = "TextInputType.datetime";
                                break;
                            }
                            case 1: {
                                s5 = "TextInputType.text";
                                break;
                            }
                        }
                        if (s5.equals((Object)string3)) {
                            new o(n5, jsonObject2.optBoolean("signed", false), jsonObject2.optBoolean("decimal", false));
                            String string4;
                            if (jsonObject.isNull("actionLabel")) {
                                string4 = null;
                            }
                            else {
                                string4 = jsonObject.getString("actionLabel");
                            }
                            A a;
                            if (jsonObject.isNull("autofill")) {
                                a = null;
                            }
                            else {
                                final JSONObject jsonObject3 = jsonObject.getJSONObject("autofill");
                                final String string5 = jsonObject3.getString("uniqueIdentifier");
                                final JSONArray jsonArray4 = jsonObject3.getJSONArray("hints");
                                String string6;
                                if (jsonObject3.isNull("hintText")) {
                                    string6 = s2;
                                }
                                else {
                                    string6 = jsonObject3.getString("hintText");
                                }
                                final JSONObject jsonObject4 = jsonObject3.getJSONObject("editingValue");
                                final String[] array3 = new String[jsonArray4.length()];
                                int n6 = 0;
                                final String s6 = s4;
                                final JSONArray jsonArray5 = jsonArray4;
                                final String s7 = string5;
                                while (n6 < jsonArray5.length()) {
                                    String string7 = jsonArray5.getString(n6);
                                    final int sdk_INT = Build$VERSION.SDK_INT;
                                    int n7 = 26;
                                    if (sdk_INT >= 26) {
                                        string7.getClass();
                                        Label_2072: {
                                            while (true) {
                                                Label_1927: {
                                                    switch (string7.hashCode()) {
                                                        case 2011773919: {
                                                            if (!string7.equals((Object)"birthdayDay")) {
                                                                break;
                                                            }
                                                            n7 = 35;
                                                            break Label_1927;
                                                        }
                                                        case 2011152728: {
                                                            if (!string7.equals((Object)"postalCode")) {
                                                                break;
                                                            }
                                                            n7 = 34;
                                                            break Label_1927;
                                                        }
                                                        case 1921869058: {
                                                            if (!string7.equals((Object)"postalAddressExtended")) {
                                                                break;
                                                            }
                                                            n7 = 33;
                                                            break Label_1927;
                                                        }
                                                        case 1662667945: {
                                                            if (!string7.equals((Object)"postalAddress")) {
                                                                break;
                                                            }
                                                            n7 = 32;
                                                            break Label_1927;
                                                        }
                                                        case 1469046696: {
                                                            if (!string7.equals((Object)"givenName")) {
                                                                break;
                                                            }
                                                            n7 = 31;
                                                            break Label_1927;
                                                        }
                                                        case 1216985755: {
                                                            if (!string7.equals((Object)"password")) {
                                                                break;
                                                            }
                                                            n7 = 30;
                                                            break Label_1927;
                                                        }
                                                        case 1069376125: {
                                                            if (!string7.equals((Object)"birthday")) {
                                                                break;
                                                            }
                                                            n7 = 29;
                                                            break Label_1927;
                                                        }
                                                        case 991032982: {
                                                            if (!string7.equals((Object)"newUsername")) {
                                                                break;
                                                            }
                                                            n7 = 28;
                                                            break Label_1927;
                                                        }
                                                        case 892233837: {
                                                            if (!string7.equals((Object)"telephoneNumber")) {
                                                                break;
                                                            }
                                                            n7 = 27;
                                                            break Label_1927;
                                                        }
                                                        case 798554127: {
                                                            if (!string7.equals((Object)"familyName")) {
                                                                break;
                                                            }
                                                            break Label_1927;
                                                        }
                                                        case 588174851: {
                                                            if (!string7.equals((Object)"birthdayMonth")) {
                                                                break;
                                                            }
                                                            n7 = 25;
                                                            break Label_1927;
                                                        }
                                                        case 253202685: {
                                                            if (!string7.equals((Object)"addressState")) {
                                                                break;
                                                            }
                                                            n7 = 24;
                                                            break Label_1927;
                                                        }
                                                        case 96619420: {
                                                            if (!string7.equals((Object)"email")) {
                                                                break;
                                                            }
                                                            n7 = 23;
                                                            break Label_1927;
                                                        }
                                                        case 3373707: {
                                                            if (!string7.equals((Object)"name")) {
                                                                break;
                                                            }
                                                            n7 = 22;
                                                            break Label_1927;
                                                        }
                                                        case -265713450: {
                                                            if (!string7.equals((Object)"username")) {
                                                                break;
                                                            }
                                                            n7 = 21;
                                                            break Label_1927;
                                                        }
                                                        case -549230602: {
                                                            if (!string7.equals((Object)"telephoneNumberCountryCode")) {
                                                                break;
                                                            }
                                                            n7 = 20;
                                                            break Label_1927;
                                                        }
                                                        case -613352043: {
                                                            if (!string7.equals((Object)"creditCardExpirationYear")) {
                                                                break;
                                                            }
                                                            n7 = 19;
                                                            break Label_1927;
                                                        }
                                                        case -613980922: {
                                                            if (!string7.equals((Object)"creditCardExpirationDate")) {
                                                                break;
                                                            }
                                                            n7 = 18;
                                                            break Label_1927;
                                                        }
                                                        case -747304516: {
                                                            if (!string7.equals((Object)"nameSuffix")) {
                                                                break;
                                                            }
                                                            n7 = 17;
                                                            break Label_1927;
                                                        }
                                                        case -818219584: {
                                                            if (!string7.equals((Object)"middleName")) {
                                                                break;
                                                            }
                                                            n7 = 16;
                                                            break Label_1927;
                                                        }
                                                        case -835992323: {
                                                            if (!string7.equals((Object)"namePrefix")) {
                                                                break;
                                                            }
                                                            n7 = 15;
                                                            break Label_1927;
                                                        }
                                                        case -1151034798: {
                                                            if (!string7.equals((Object)"creditCardNumber")) {
                                                                break;
                                                            }
                                                            n7 = 14;
                                                            break Label_1927;
                                                        }
                                                        case -1186060294: {
                                                            if (!string7.equals((Object)"postalAddressExtendedPostalCode")) {
                                                                break;
                                                            }
                                                            n7 = 13;
                                                            break Label_1927;
                                                        }
                                                        case -1249512767: {
                                                            if (!string7.equals((Object)"gender")) {
                                                                break;
                                                            }
                                                            n7 = 12;
                                                            break Label_1927;
                                                        }
                                                        case -1377792129: {
                                                            if (!string7.equals((Object)"addressCity")) {
                                                                break;
                                                            }
                                                            n7 = 11;
                                                            break Label_1927;
                                                        }
                                                        case -1413737489: {
                                                            if (!string7.equals((Object)"middleInitial")) {
                                                                break;
                                                            }
                                                            n7 = 10;
                                                            break Label_1927;
                                                        }
                                                        case -1476752575: {
                                                            if (!string7.equals((Object)"countryName")) {
                                                                break;
                                                            }
                                                            n7 = 9;
                                                            break Label_1927;
                                                        }
                                                        case -1567118045: {
                                                            if (!string7.equals((Object)"telephoneNumberDevice")) {
                                                                break;
                                                            }
                                                            n7 = 8;
                                                            break Label_1927;
                                                        }
                                                        case -1658955742: {
                                                            if (!string7.equals((Object)"fullStreetAddress")) {
                                                                break;
                                                            }
                                                            n7 = 7;
                                                            break Label_2072;
                                                        }
                                                        case -1682373820: {
                                                            if (!string7.equals((Object)"creditCardExpirationDay")) {
                                                                break;
                                                            }
                                                            n7 = 6;
                                                            break Label_2072;
                                                        }
                                                        case -1757573738: {
                                                            if (!string7.equals((Object)"creditCardSecurityCode")) {
                                                                break;
                                                            }
                                                            n7 = 5;
                                                            break Label_1927;
                                                        }
                                                        case -1821235109: {
                                                            if (!string7.equals((Object)"newPassword")) {
                                                                break;
                                                            }
                                                            n7 = 4;
                                                            break Label_2072;
                                                        }
                                                        case -1825589953: {
                                                            if (!string7.equals((Object)"telephoneNumberNational")) {
                                                                break;
                                                            }
                                                            n7 = 3;
                                                            break Label_2072;
                                                        }
                                                        case -1844815832: {
                                                            if (!string7.equals((Object)s6)) {
                                                                break;
                                                            }
                                                            n7 = 2;
                                                            break Label_2072;
                                                        }
                                                        case -1917283616: {
                                                            if (!string7.equals((Object)"oneTimeCode")) {
                                                                break;
                                                            }
                                                            n7 = 1;
                                                            break Label_2072;
                                                        }
                                                        case -2058889126: {
                                                            if (!string7.equals((Object)"birthdayYear")) {
                                                                break;
                                                            }
                                                            n7 = 0;
                                                            break Label_2072;
                                                        }
                                                    }
                                                    n7 = -1;
                                                }
                                                break Label_2072;
                                                continue;
                                            }
                                        }
                                        switch (n7) {
                                            case 35: {
                                                string7 = "birthDateDay";
                                                break;
                                            }
                                            case 34: {
                                                string7 = "postalCode";
                                                break;
                                            }
                                            case 33: {
                                                string7 = "extendedAddress";
                                                break;
                                            }
                                            case 32: {
                                                string7 = "postalAddress";
                                                break;
                                            }
                                            case 31: {
                                                string7 = "personGivenName";
                                                break;
                                            }
                                            case 30: {
                                                string7 = "password";
                                                break;
                                            }
                                            case 29: {
                                                string7 = "birthDateFull";
                                                break;
                                            }
                                            case 28: {
                                                string7 = "newUsername";
                                                break;
                                            }
                                            case 27: {
                                                string7 = "phoneNumber";
                                                break;
                                            }
                                            case 26: {
                                                string7 = "personFamilyName";
                                                break;
                                            }
                                            case 25: {
                                                string7 = "birthDateMonth";
                                                break;
                                            }
                                            case 24: {
                                                string7 = "addressRegion";
                                                break;
                                            }
                                            case 23: {
                                                string7 = "emailAddress";
                                                break;
                                            }
                                            case 22: {
                                                string7 = "personName";
                                                break;
                                            }
                                            case 21: {
                                                string7 = "username";
                                                break;
                                            }
                                            case 20: {
                                                string7 = "phoneCountryCode";
                                                break;
                                            }
                                            case 19: {
                                                string7 = "creditCardExpirationYear";
                                                break;
                                            }
                                            case 18: {
                                                string7 = "creditCardExpirationDate";
                                                break;
                                            }
                                            case 17: {
                                                string7 = "personNameSuffix";
                                                break;
                                            }
                                            case 16: {
                                                string7 = "personMiddleName";
                                                break;
                                            }
                                            case 15: {
                                                string7 = "personNamePrefix";
                                                break;
                                            }
                                            case 14: {
                                                string7 = "creditCardNumber";
                                                break;
                                            }
                                            case 13: {
                                                string7 = "extendedPostalCode";
                                                break;
                                            }
                                            case 12: {
                                                string7 = "gender";
                                                break;
                                            }
                                            case 11: {
                                                string7 = "addressLocality";
                                                break;
                                            }
                                            case 10: {
                                                string7 = "personMiddleInitial";
                                                break;
                                            }
                                            case 9: {
                                                string7 = "addressCountry";
                                                break;
                                            }
                                            case 8: {
                                                string7 = "phoneNumberDevice";
                                                break;
                                            }
                                            case 7: {
                                                string7 = "streetAddress";
                                                break;
                                            }
                                            case 6: {
                                                string7 = "creditCardExpirationDay";
                                                break;
                                            }
                                            case 5: {
                                                string7 = "creditCardSecurityCode";
                                                break;
                                            }
                                            case 4: {
                                                string7 = "newPassword";
                                                break;
                                            }
                                            case 3: {
                                                string7 = "phoneNational";
                                                break;
                                            }
                                            case 2: {
                                                string7 = s6;
                                                break;
                                            }
                                            case 1: {
                                                string7 = "smsOTPCode";
                                                break;
                                            }
                                            case 0: {
                                                string7 = "birthDateYear";
                                                break;
                                            }
                                        }
                                    }
                                    array3[n6] = string7;
                                    ++n6;
                                }
                                a = new A(s7, array3, string6, p.a(jsonObject4));
                            }
                            return new n(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, n3, o2, value, string4, a, (String[])list.toArray((Object[])new String[list.size()]), array, array2);
                        }
                        ++n4;
                    }
                    throw new NoSuchFieldException(a.f("No such TextInputType: ", string3));
                }
            }
            throw new NoSuchFieldException(a.f("No such TextCapitalization: ", string2));
        }
        throw new JSONException("Configuration JSON missing 'inputAction' property.");
    }
}
