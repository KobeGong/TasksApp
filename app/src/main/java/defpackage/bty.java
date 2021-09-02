package defpackage;

/* renamed from: bty reason: default package */
/* compiled from: PG */
public class bty {
    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (a(2)) {
            f(str, str2, objArr);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (a(2)) {
            f(str, str2, objArr);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (a(3)) {
            f(str, str2, objArr);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (a(4)) {
            f(str, str2, objArr);
        }
    }

    public static void a(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        if (a(5)) {
            android.util.Log.w("Notifications", f(str, str2, objArr), th);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (a(6)) {
            android.util.Log.e("Notifications", f(str, str2, objArr));
        }
    }

    public static void b(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        if (a(6)) {
            android.util.Log.e("Notifications", f(str, str2, objArr), th);
        }
    }

    public static boolean a(int i) {
        return android.util.Log.isLoggable("Notifications", i);
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            str2 = java.lang.String.format(null, str2, objArr);
        }
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 3 + java.lang.String.valueOf(str2).length()).append("[").append(str).append("] ").append(str2).toString();
    }
}
