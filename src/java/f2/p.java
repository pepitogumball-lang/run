package f2;

import h2.I;
import o.M;
import t0.k;
import t0.G;
import java.util.ArrayList;
import com.google.android.gms.common.api.Status;
import g.i;
import android.content.Intent;
import android.content.IntentSender;
import n5.h;
import java.util.List;
import h2.l;
import h2.u;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import h2.v;
import h2.D;
import h2.o;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import android.os.Bundle;
import android.app.PendingIntent;
import l2.d;
import android.view.View$BaseSavedState;
import o2.e;
import o2.c;
import o2.g;
import J5.b;
import t0.F;
import android.os.Parcelable;
import a.a;
import android.os.Parcel;
import h2.f;
import android.os.Parcelable$Creator;

public final class p implements Parcelable$Creator
{
    public final int a;
    
    public static void a(final f f, final Parcel parcel, int o) {
        final int d = a.D(parcel, 20293);
        final int c = f.C;
        a.C(parcel, 1, 4);
        parcel.writeInt(c);
        a.C(parcel, 2, 4);
        parcel.writeInt(f.D);
        a.C(parcel, 3, 4);
        parcel.writeInt(f.E);
        a.v(parcel, 4, f.F, false);
        a.s(parcel, 5, f.G);
        a.y(parcel, 6, (Parcelable[])f.H, o);
        a.q(parcel, 7, f.I);
        a.u(parcel, 8, (Parcelable)f.J, o, false);
        a.y(parcel, 10, (Parcelable[])f.K, o);
        a.y(parcel, 11, (Parcelable[])f.L, o);
        a.C(parcel, 12, 4);
        parcel.writeInt((int)(f.M ? 1 : 0));
        a.C(parcel, 13, 4);
        parcel.writeInt(f.N);
        o = (f.O ? 1 : 0);
        a.C(parcel, 14, 4);
        parcel.writeInt(o);
        a.v(parcel, 15, f.P, false);
        a.E(parcel, d);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            default: {
                final Object o = new Object();
                ((G)o).C = parcel.readInt();
                ((G)o).D = parcel.readInt();
                final int int1 = parcel.readInt();
                ((G)o).E = int1;
                if (int1 > 0) {
                    parcel.readIntArray(((G)o).F = new int[int1]);
                }
                final int int2 = parcel.readInt();
                if ((((G)o).G = int2) > 0) {
                    parcel.readIntArray(((G)o).H = new int[int2]);
                }
                final int int3 = parcel.readInt();
                final boolean b = false;
                ((G)o).J = (int3 == 1);
                ((G)o).K = (parcel.readInt() == 1);
                boolean l = b;
                if (parcel.readInt() == 1) {
                    l = true;
                }
                ((G)o).L = l;
                ((G)o).I = parcel.readArrayList(F.class.getClassLoader());
                return o;
            }
            case 26: {
                final Object o2 = new Object();
                ((F)o2).C = parcel.readInt();
                ((F)o2).D = parcel.readInt();
                final int int4 = parcel.readInt();
                boolean f = true;
                if (int4 != 1) {
                    f = false;
                }
                ((F)o2).F = f;
                final int int5 = parcel.readInt();
                if (int5 > 0) {
                    parcel.readIntArray(((F)o2).E = new int[int5]);
                }
                return o2;
            }
            case 25: {
                final Object o3 = new Object();
                ((k)o3).C = parcel.readInt();
                ((k)o3).D = parcel.readInt();
                final int int6 = parcel.readInt();
                boolean e = true;
                if (int6 != 1) {
                    e = false;
                }
                ((k)o3).E = e;
                return o3;
            }
            case 24: {
                final int v = b.V(parcel);
                int i = 0;
                Parcel obtain = null;
                g g = null;
                while (parcel.dataPosition() < v) {
                    final int int7 = parcel.readInt();
                    final char c = (char)int7;
                    if (c != '\u0001') {
                        if (c != '\u0002') {
                            if (c != '\u0003') {
                                b.S(parcel, int7);
                            }
                            else {
                                g = (g)b.p(parcel, int7, o2.g.CREATOR);
                            }
                        }
                        else {
                            final int o4 = b.O(parcel, int7);
                            final int dataPosition = parcel.dataPosition();
                            if (o4 == 0) {
                                obtain = null;
                            }
                            else {
                                obtain = Parcel.obtain();
                                obtain.appendFrom(parcel, dataPosition, o4);
                                parcel.setDataPosition(dataPosition + o4);
                            }
                        }
                    }
                    else {
                        i = b.L(parcel, int7);
                    }
                }
                b.x(parcel, v);
                return new c(i, obtain, g);
            }
            case 23: {
                final int v2 = b.V(parcel);
                String q = null;
                int j = 0;
                ArrayList u = null;
                while (parcel.dataPosition() < v2) {
                    final int int8 = parcel.readInt();
                    final char c2 = (char)int8;
                    if (c2 != '\u0001') {
                        if (c2 != '\u0002') {
                            if (c2 != '\u0003') {
                                b.S(parcel, int8);
                            }
                            else {
                                u = b.u(parcel, int8, o2.f.CREATOR);
                            }
                        }
                        else {
                            q = b.q(parcel, int8);
                        }
                    }
                    else {
                        j = b.L(parcel, int8);
                    }
                }
                b.x(parcel, v2);
                return new e(j, q, u);
            }
            case 22: {
                final int v3 = b.V(parcel);
                ArrayList u2 = null;
                int k = 0;
                String q2 = null;
                while (parcel.dataPosition() < v3) {
                    final int int9 = parcel.readInt();
                    final char c3 = (char)int9;
                    if (c3 != '\u0001') {
                        if (c3 != '\u0002') {
                            if (c3 != '\u0003') {
                                b.S(parcel, int9);
                            }
                            else {
                                q2 = b.q(parcel, int9);
                            }
                        }
                        else {
                            u2 = b.u(parcel, int9, e.CREATOR);
                        }
                    }
                    else {
                        k = b.L(parcel, int9);
                    }
                }
                b.x(parcel, v3);
                return new g(k, q2, u2);
            }
            case 21: {
                final int v4 = b.V(parcel);
                String q3 = null;
                int m = 0;
                o2.a a = null;
                while (parcel.dataPosition() < v4) {
                    final int int10 = parcel.readInt();
                    final char c4 = (char)int10;
                    if (c4 != '\u0001') {
                        if (c4 != '\u0002') {
                            if (c4 != '\u0003') {
                                b.S(parcel, int10);
                            }
                            else {
                                a = (o2.a)b.p(parcel, int10, (Parcelable$Creator)o2.a.CREATOR);
                            }
                        }
                        else {
                            q3 = b.q(parcel, int10);
                        }
                    }
                    else {
                        m = b.L(parcel, int10);
                    }
                }
                b.x(parcel, v4);
                return new o2.f(m, q3, a);
            }
            case 20: {
                final View$BaseSavedState view$BaseSavedState = new View$BaseSavedState(parcel);
                ((M)view$BaseSavedState).C = (parcel.readByte() != 0);
                return view$BaseSavedState;
            }
            case 19: {
                final int v5 = b.V(parcel);
                int l2 = 0;
                String q4 = null;
                int l3 = 0;
                while (parcel.dataPosition() < v5) {
                    final int int11 = parcel.readInt();
                    final char c5 = (char)int11;
                    if (c5 != '\u0001') {
                        if (c5 != '\u0002') {
                            if (c5 != '\u0003') {
                                b.S(parcel, int11);
                            }
                            else {
                                l3 = b.L(parcel, int11);
                            }
                        }
                        else {
                            q4 = b.q(parcel, int11);
                        }
                    }
                    else {
                        l2 = b.L(parcel, int11);
                    }
                }
                b.x(parcel, v5);
                return new n2.c(l2, q4, l3);
            }
            case 18: {
                final int v6 = b.V(parcel);
                ArrayList u3 = null;
                int l4 = 0;
                while (parcel.dataPosition() < v6) {
                    final int int12 = parcel.readInt();
                    final char c6 = (char)int12;
                    if (c6 != '\u0001') {
                        if (c6 != '\u0002') {
                            b.S(parcel, int12);
                        }
                        else {
                            u3 = b.u(parcel, int12, n2.c.CREATOR);
                        }
                    }
                    else {
                        l4 = b.L(parcel, int12);
                    }
                }
                b.x(parcel, v6);
                return new n2.a(l4, u3);
            }
            case 17: {
                final int v7 = b.V(parcel);
                n2.a a2 = null;
                int l5 = 0;
                while (parcel.dataPosition() < v7) {
                    final int int13 = parcel.readInt();
                    final char c7 = (char)int13;
                    if (c7 != '\u0001') {
                        if (c7 != '\u0002') {
                            b.S(parcel, int13);
                        }
                        else {
                            a2 = (n2.a)b.p(parcel, int13, n2.a.CREATOR);
                        }
                    }
                    else {
                        l5 = b.L(parcel, int13);
                    }
                }
                b.x(parcel, v7);
                return new n2.b(l5, a2);
            }
            case 16: {
                final int v8 = b.V(parcel);
                int l6 = 0;
                int l8;
                int l7 = l8 = 0;
                Long n = null;
                Long n2 = null;
                while (parcel.dataPosition() < v8) {
                    final int int14 = parcel.readInt();
                    final char c8 = (char)int14;
                    if (c8 != '\u0001') {
                        if (c8 != '\u0002') {
                            if (c8 != '\u0003') {
                                if (c8 != '\u0004') {
                                    if (c8 != '\u0005') {
                                        b.S(parcel, int14);
                                    }
                                    else {
                                        l8 = b.L(parcel, int14);
                                    }
                                }
                                else {
                                    n2 = b.N(parcel, int14);
                                }
                            }
                            else {
                                n = b.N(parcel, int14);
                            }
                        }
                        else {
                            l7 = b.L(parcel, int14);
                        }
                    }
                    else {
                        l6 = b.L(parcel, int14);
                    }
                }
                b.x(parcel, v8);
                return new d(l6, l7, n, n2, l8);
            }
            case 15: {
                final int v9 = b.V(parcel);
                int l9 = 0;
                boolean j2 = false;
                while (parcel.dataPosition() < v9) {
                    final int int15 = parcel.readInt();
                    final char c9 = (char)int15;
                    if (c9 != '\u0001') {
                        if (c9 != '\u0002') {
                            b.S(parcel, int15);
                        }
                        else {
                            j2 = b.J(parcel, int15);
                        }
                    }
                    else {
                        l9 = b.L(parcel, int15);
                    }
                }
                b.x(parcel, v9);
                return new l2.c(l9, j2);
            }
            case 14: {
                final int v10 = b.V(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < v10) {
                    final int int16 = parcel.readInt();
                    if ((char)int16 != '\u0001') {
                        b.S(parcel, int16);
                    }
                    else {
                        pendingIntent = (PendingIntent)b.p(parcel, int16, PendingIntent.CREATOR);
                    }
                }
                b.x(parcel, v10);
                return new l2.b(pendingIntent);
            }
            case 13: {
                final int v11 = b.V(parcel);
                boolean j3 = false;
                int l10 = 0;
                while (parcel.dataPosition() < v11) {
                    final int int17 = parcel.readInt();
                    final char c10 = (char)int17;
                    if (c10 != '\u0001') {
                        if (c10 != '\u0002') {
                            b.S(parcel, int17);
                        }
                        else {
                            l10 = b.L(parcel, int17);
                        }
                    }
                    else {
                        j3 = b.J(parcel, int17);
                    }
                }
                b.x(parcel, v11);
                return new l2.a(l10, j3);
            }
            case 12: {
                final int v12 = b.V(parcel);
                Scope[] q5 = f.Q;
                Bundle m2 = new Bundle();
                e2.d[] r;
                e2.d[] array = r = f.R;
                String q6 = null;
                Object k2 = null;
                Object q7;
                Object o5 = q7 = k2;
                int l11 = 0;
                int l12 = 0;
                int j4;
                int l13 = j4 = l12;
                int j5;
                int l14 = j5 = j4;
                while (parcel.dataPosition() < v12) {
                    final int int18 = parcel.readInt();
                    switch ((char)int18) {
                        default: {
                            b.S(parcel, int18);
                            continue;
                        }
                        case '\u000f': {
                            q7 = b.q(parcel, int18);
                            continue;
                        }
                        case '\u000e': {
                            j5 = (b.J(parcel, int18) ? 1 : 0);
                            continue;
                        }
                        case '\r': {
                            l14 = b.L(parcel, int18);
                            continue;
                        }
                        case '\f': {
                            j4 = (b.J(parcel, int18) ? 1 : 0);
                            continue;
                        }
                        case '\u000b': {
                            r = (e2.d[])b.t(parcel, int18, (Parcelable$Creator)e2.d.CREATOR);
                            continue;
                        }
                        case '\n': {
                            array = (e2.d[])b.t(parcel, int18, (Parcelable$Creator)e2.d.CREATOR);
                            continue;
                        }
                        case '\b': {
                            o5 = b.p(parcel, int18, Account.CREATOR);
                            continue;
                        }
                        case '\u0007': {
                            m2 = b.m(parcel, int18);
                            continue;
                        }
                        case '\u0006': {
                            q5 = (Scope[])b.t(parcel, int18, Scope.CREATOR);
                            continue;
                        }
                        case '\u0005': {
                            k2 = b.K(parcel, int18);
                            continue;
                        }
                        case '\u0004': {
                            q6 = b.q(parcel, int18);
                            continue;
                        }
                        case '\u0003': {
                            l13 = b.L(parcel, int18);
                            continue;
                        }
                        case '\u0002': {
                            l12 = b.L(parcel, int18);
                            continue;
                        }
                        case '\u0001': {
                            l11 = b.L(parcel, int18);
                            continue;
                        }
                    }
                }
                b.x(parcel, v12);
                return new f(l11, l12, l13, q6, (IBinder)k2, q5, m2, (Account)o5, array, r, (boolean)(j4 != 0), l14, (boolean)(j5 != 0), (String)q7);
            }
            case 11: {
                final int v13 = b.V(parcel);
                o o6 = null;
                int[] o8;
                int[] o7 = o8 = null;
                boolean j6 = false;
                int l15;
                int j7 = l15 = 0;
                while (parcel.dataPosition() < v13) {
                    final int int19 = parcel.readInt();
                    switch ((char)int19) {
                        default: {
                            b.S(parcel, int19);
                            continue;
                        }
                        case '\u0006': {
                            o8 = b.o(parcel, int19);
                            continue;
                        }
                        case '\u0005': {
                            l15 = b.L(parcel, int19);
                            continue;
                        }
                        case '\u0004': {
                            o7 = b.o(parcel, int19);
                            continue;
                        }
                        case '\u0003': {
                            j7 = (b.J(parcel, int19) ? 1 : 0);
                            continue;
                        }
                        case '\u0002': {
                            j6 = b.J(parcel, int19);
                            continue;
                        }
                        case '\u0001': {
                            o6 = (o)b.p(parcel, int19, o.CREATOR);
                            continue;
                        }
                    }
                }
                b.x(parcel, v13);
                return new h2.e(o6, j6, (boolean)(j7 != 0), o7, l15, o8);
            }
            case 10: {
                final int v14 = b.V(parcel);
                Bundle m3 = null;
                h2.e f2 = null;
                int l16 = 0;
                e2.d[] d = null;
                while (parcel.dataPosition() < v14) {
                    final int int20 = parcel.readInt();
                    final char c11 = (char)int20;
                    if (c11 != '\u0001') {
                        if (c11 != '\u0002') {
                            if (c11 != '\u0003') {
                                if (c11 != '\u0004') {
                                    b.S(parcel, int20);
                                }
                                else {
                                    f2 = (h2.e)b.p(parcel, int20, h2.e.CREATOR);
                                }
                            }
                            else {
                                l16 = b.L(parcel, int20);
                            }
                        }
                        else {
                            d = (e2.d[])b.t(parcel, int20, (Parcelable$Creator)e2.d.CREATOR);
                        }
                    }
                    else {
                        m3 = b.m(parcel, int20);
                    }
                }
                b.x(parcel, v14);
                final Object o9 = new Object();
                ((I)o9).C = m3;
                ((I)o9).D = d;
                ((I)o9).E = l16;
                ((I)o9).F = f2;
                return o9;
            }
            case 9: {
                final int v15 = b.V(parcel);
                int l17 = 0;
                while (parcel.dataPosition() < v15) {
                    final int int21 = parcel.readInt();
                    if ((char)int21 != '\u0001') {
                        b.S(parcel, int21);
                    }
                    else {
                        l17 = b.L(parcel, int21);
                    }
                }
                b.x(parcel, v15);
                return new D(l17);
            }
            case 8: {
                final int v16 = b.V(parcel);
                int l18 = 0;
                boolean j9;
                boolean j8 = j9 = false;
                int l20;
                int l19 = l20 = (j9 ? 1 : 0);
                while (parcel.dataPosition() < v16) {
                    final int int22 = parcel.readInt();
                    final char c12 = (char)int22;
                    if (c12 != '\u0001') {
                        if (c12 != '\u0002') {
                            if (c12 != '\u0003') {
                                if (c12 != '\u0004') {
                                    if (c12 != '\u0005') {
                                        b.S(parcel, int22);
                                    }
                                    else {
                                        l20 = b.L(parcel, int22);
                                    }
                                }
                                else {
                                    l19 = b.L(parcel, int22);
                                }
                            }
                            else {
                                j9 = b.J(parcel, int22);
                            }
                        }
                        else {
                            j8 = b.J(parcel, int22);
                        }
                    }
                    else {
                        l18 = b.L(parcel, int22);
                    }
                }
                b.x(parcel, v16);
                return new o(l18, j8, j9, l19, l20);
            }
            case 7: {
                final int v17 = b.V(parcel);
                int l21 = 0;
                boolean j11;
                boolean j10 = j11 = false;
                IBinder k3 = null;
                e2.b b2 = null;
                while (parcel.dataPosition() < v17) {
                    final int int23 = parcel.readInt();
                    final char c13 = (char)int23;
                    if (c13 != '\u0001') {
                        if (c13 != '\u0002') {
                            if (c13 != '\u0003') {
                                if (c13 != '\u0004') {
                                    if (c13 != '\u0005') {
                                        b.S(parcel, int23);
                                    }
                                    else {
                                        j11 = b.J(parcel, int23);
                                    }
                                }
                                else {
                                    j10 = b.J(parcel, int23);
                                }
                            }
                            else {
                                b2 = (e2.b)b.p(parcel, int23, (Parcelable$Creator)e2.b.CREATOR);
                            }
                        }
                        else {
                            k3 = b.K(parcel, int23);
                        }
                    }
                    else {
                        l21 = b.L(parcel, int23);
                    }
                }
                b.x(parcel, v17);
                return new v(l21, k3, b2, j10, j11);
            }
            case 6: {
                final int v18 = b.V(parcel);
                Account account = null;
                int l22 = 0;
                int l23 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < v18) {
                    final int int24 = parcel.readInt();
                    final char c14 = (char)int24;
                    if (c14 != '\u0001') {
                        if (c14 != '\u0002') {
                            if (c14 != '\u0003') {
                                if (c14 != '\u0004') {
                                    b.S(parcel, int24);
                                }
                                else {
                                    googleSignInAccount = (GoogleSignInAccount)b.p(parcel, int24, GoogleSignInAccount.CREATOR);
                                }
                            }
                            else {
                                l23 = b.L(parcel, int24);
                            }
                        }
                        else {
                            account = (Account)b.p(parcel, int24, Account.CREATOR);
                        }
                    }
                    else {
                        l22 = b.L(parcel, int24);
                    }
                }
                b.x(parcel, v18);
                return new u(l22, account, l23, googleSignInAccount);
            }
            case 5: {
                final int v19 = b.V(parcel);
                int l24 = -1;
                int l25 = 0;
                int l26 = 0;
                int l28;
                int l27 = l28 = l26;
                String q8 = null;
                String q9 = null;
                long m4 = 0L;
                long m5 = 0L;
                while (parcel.dataPosition() < v19) {
                    final int int25 = parcel.readInt();
                    switch ((char)int25) {
                        default: {
                            b.S(parcel, int25);
                            continue;
                        }
                        case '\t': {
                            l24 = b.L(parcel, int25);
                            continue;
                        }
                        case '\b': {
                            l28 = b.L(parcel, int25);
                            continue;
                        }
                        case '\u0007': {
                            q9 = b.q(parcel, int25);
                            continue;
                        }
                        case '\u0006': {
                            q8 = b.q(parcel, int25);
                            continue;
                        }
                        case '\u0005': {
                            m5 = b.M(parcel, int25);
                            continue;
                        }
                        case '\u0004': {
                            m4 = b.M(parcel, int25);
                            continue;
                        }
                        case '\u0003': {
                            l27 = b.L(parcel, int25);
                            continue;
                        }
                        case '\u0002': {
                            l26 = b.L(parcel, int25);
                            continue;
                        }
                        case '\u0001': {
                            l25 = b.L(parcel, int25);
                            continue;
                        }
                    }
                }
                b.x(parcel, v19);
                return new l(l25, l26, l27, m4, m5, q8, q9, l28, l24);
            }
            case 4: {
                final int v20 = b.V(parcel);
                Object u4 = null;
                int l29 = 0;
                while (parcel.dataPosition() < v20) {
                    final int int26 = parcel.readInt();
                    final char c15 = (char)int26;
                    if (c15 != '\u0001') {
                        if (c15 != '\u0002') {
                            b.S(parcel, int26);
                        }
                        else {
                            u4 = b.u(parcel, int26, l.CREATOR);
                        }
                    }
                    else {
                        l29 = b.L(parcel, int26);
                    }
                }
                b.x(parcel, v20);
                return new h2.p(l29, (List)u4);
            }
            case 3: {
                h.e("inParcel", (Object)parcel);
                final Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                h.b((Object)parcelable);
                return new i((IntentSender)parcelable, (Intent)parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }
            case 2: {
                return new g.a(parcel);
            }
            case 1: {
                final int v21 = b.V(parcel);
                String q10 = null;
                e2.b b3 = null;
                int l30 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < v21) {
                    final int int27 = parcel.readInt();
                    final char c16 = (char)int27;
                    if (c16 != '\u0001') {
                        if (c16 != '\u0002') {
                            if (c16 != '\u0003') {
                                if (c16 != '\u0004') {
                                    b.S(parcel, int27);
                                }
                                else {
                                    b3 = (e2.b)b.p(parcel, int27, (Parcelable$Creator)e2.b.CREATOR);
                                }
                            }
                            else {
                                pendingIntent2 = (PendingIntent)b.p(parcel, int27, PendingIntent.CREATOR);
                            }
                        }
                        else {
                            q10 = b.q(parcel, int27);
                        }
                    }
                    else {
                        l30 = b.L(parcel, int27);
                    }
                }
                b.x(parcel, v21);
                return new Status(l30, q10, pendingIntent2, b3);
            }
            case 0: {
                final int v22 = b.V(parcel);
                String q11 = null;
                int l31 = 0;
                while (parcel.dataPosition() < v22) {
                    final int int28 = parcel.readInt();
                    final char c17 = (char)int28;
                    if (c17 != '\u0001') {
                        if (c17 != '\u0002') {
                            b.S(parcel, int28);
                        }
                        else {
                            q11 = b.q(parcel, int28);
                        }
                    }
                    else {
                        l31 = b.L(parcel, int28);
                    }
                }
                b.x(parcel, v22);
                return new Scope(l31, q11);
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new G[n];
            }
            case 26: {
                return new F[n];
            }
            case 25: {
                return new k[n];
            }
            case 24: {
                return new c[n];
            }
            case 23: {
                return new e[n];
            }
            case 22: {
                return new g[n];
            }
            case 21: {
                return new o2.f[n];
            }
            case 20: {
                return new M[n];
            }
            case 19: {
                return new n2.c[n];
            }
            case 18: {
                return new n2.a[n];
            }
            case 17: {
                return new n2.b[n];
            }
            case 16: {
                return new d[n];
            }
            case 15: {
                return new l2.c[n];
            }
            case 14: {
                return new l2.b[n];
            }
            case 13: {
                return new l2.a[n];
            }
            case 12: {
                return new f[n];
            }
            case 11: {
                return new h2.e[n];
            }
            case 10: {
                return new I[n];
            }
            case 9: {
                return new D[n];
            }
            case 8: {
                return new o[n];
            }
            case 7: {
                return new v[n];
            }
            case 6: {
                return new u[n];
            }
            case 5: {
                return new l[n];
            }
            case 4: {
                return new h2.p[n];
            }
            case 3: {
                return new i[n];
            }
            case 2: {
                return new g.a[n];
            }
            case 1: {
                return new Status[n];
            }
            case 0: {
                return new Scope[n];
            }
        }
    }
}
