package defpackage;

import android.net.Uri;

/* renamed from: cpx  reason: default package */
/* compiled from: PG */
public final class cpx {
    private static cpz a = new cpz();

    static int a() {
        return 0;
    }

    public static String a(String str, int i, int i2, int i3) {
        String a2 = a.a(str, i, i2, i3, cpy.a);
        if (a2 != null) {
            return a2;
        }
        if (i2 == 0 && i3 == 0) {
            return str;
        }
        return cqa.a(i2, i3, str);
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return a.a(str);
    }

    static {
        Uri.parse("https://lh3.googleusercontent.com");
    }
}
