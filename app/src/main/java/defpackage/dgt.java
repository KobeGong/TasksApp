package defpackage;

/* renamed from: dgt reason: default package */
/* compiled from: PG */
final class dgt {
    public static final java.lang.Class a = a("libcore.io.Memory");
    private static final boolean b = (a("org.robolectric.Robolectric") != null);

    static boolean a() {
        return a != null && !b;
    }

    private static java.lang.Class a(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
