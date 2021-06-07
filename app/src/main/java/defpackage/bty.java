package defpackage;

import android.util.Log;

/* renamed from: bty  reason: default package */
/* compiled from: PG */
public class bty {
    public static void a(String str, String str2, Object... objArr) {
        if (a(2)) {
            f(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a(2)) {
            f(str, str2, objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (a(3)) {
            f(str, str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (a(4)) {
            f(str, str2, objArr);
        }
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        if (a(5)) {
            Log.w("Notifications", f(str, str2, objArr), th);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (a(6)) {
            Log.e("Notifications", f(str, str2, objArr));
        }
    }

    public static void b(String str, Throwable th, String str2, Object... objArr) {
        if (a(6)) {
            Log.e("Notifications", f(str, str2, objArr), th);
        }
    }

    public static boolean a(int i) {
        return Log.isLoggable("Notifications", i);
    }

    public static String f(String str, String str2, Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            str2 = String.format(null, str2, objArr);
        }
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()).append("[").append(str).append("] ").append(str2).toString();
    }
}
