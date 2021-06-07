package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dhv  reason: default package */
/* compiled from: PG */
public final class dhv {
    private static final Class a = c();

    private static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static dhw a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return dhw.a;
    }

    static dhw b() {
        dhw dhw = null;
        if (a != null) {
            try {
                dhw = a("loadGeneratedRegistry");
            } catch (Exception e) {
            }
        }
        if (dhw == null) {
            dhw = dhw.c();
        }
        return dhw == null ? a() : dhw;
    }

    private static final dhw a(String str) {
        return (dhw) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
