package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: dpt  reason: default package */
/* compiled from: PG */
public class dpt {
    public dpt() {
    }

    public dpt(byte b) {
        this();
    }

    public dpt(char c) {
        this();
    }

    private static String a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    private static String a(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    public static void a(String str, String str2, Object... objArr) {
        a(str2, objArr);
        if (a(objArr) != null) {
            a(str);
        } else {
            a(str);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        String a = a(str2, objArr);
        Throwable a2 = a(objArr);
        if (a2 != null) {
            Log.w(a(str), a, a2);
        } else {
            Log.w(a(str), a);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String a = a(str2, objArr);
        Throwable a2 = a(objArr);
        if (a2 != null) {
            Log.e(a(str), a, a2);
        } else {
            Log.e(a(str), a);
        }
    }

    private static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }
}
