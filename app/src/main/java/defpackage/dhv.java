package defpackage;

/* renamed from: dhv reason: default package */
/* compiled from: PG */
final class dhv {
    private static final java.lang.Class a = c();

    private static java.lang.Class c() {
        try {
            return java.lang.Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (java.lang.ClassNotFoundException e) {
            return null;
        }
    }

    public static defpackage.dhw a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (java.lang.Exception e) {
            }
        }
        return defpackage.dhw.a;
    }

    static defpackage.dhw b() {
        defpackage.dhw dhw = null;
        if (a != null) {
            try {
                dhw = a("loadGeneratedRegistry");
            } catch (java.lang.Exception e) {
            }
        }
        if (dhw == null) {
            dhw = defpackage.dhw.c();
        }
        return dhw == null ? a() : dhw;
    }

    private static final defpackage.dhw a(java.lang.String str) {
        return (defpackage.dhw) a.getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
    }
}
