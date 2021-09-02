package defpackage;

/* renamed from: cpx reason: default package */
/* compiled from: PG */
public final class cpx {
    private static defpackage.cpz a = new defpackage.cpz();

    static int a() {
        return 0;
    }

    public static java.lang.String a(java.lang.String str, int i, int i2, int i3) {
        java.lang.String a2 = a.a(str, i, i2, i3, defpackage.cpy.a);
        if (a2 != null) {
            return a2;
        }
        if (i2 == 0 && i3 == 0) {
            return str;
        }
        return defpackage.cqa.a(i2, i3, str);
    }

    public static boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return a.a(str);
    }

    static {
        android.net.Uri.parse("https://lh3.googleusercontent.com");
    }
}
