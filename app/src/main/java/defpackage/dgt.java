package defpackage;

/* renamed from: dgt  reason: default package */
/* compiled from: PG */
final class dgt {
    public static final Class a = a("libcore.io.Memory");
    private static final boolean b = (a("org.robolectric.Robolectric") != null);

    static boolean a() {
        return a != null && !b;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
