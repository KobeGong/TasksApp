package defpackage;

/* renamed from: dpt reason: default package */
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

    private static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    private static java.lang.String a(java.lang.String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        a(str2, objArr);
        if (a(objArr) != null) {
            a(str);
        } else {
            a(str);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String a = a(str2, objArr);
        java.lang.Throwable a2 = a(objArr);
        if (a2 != null) {
            android.util.Log.w(a(str), a, a2);
        } else {
            android.util.Log.w(a(str), a);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String a = a(str2, objArr);
        java.lang.Throwable a2 = a(objArr);
        if (a2 != null) {
            android.util.Log.e(a(str), a, a2);
        } else {
            android.util.Log.e(a(str), a);
        }
    }

    private static java.lang.Throwable a(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        java.lang.Throwable th = objArr[objArr.length - 1];
        if (!(th instanceof java.lang.Throwable)) {
            return null;
        }
        return th;
    }
}
