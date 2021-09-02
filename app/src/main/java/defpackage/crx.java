package defpackage;

/* renamed from: crx reason: default package */
/* compiled from: PG */
public final class crx {
    private crx() {
    }

    static long a() {
        return java.lang.System.nanoTime();
    }

    static java.lang.String a(double d) {
        return java.lang.String.format(java.util.Locale.ROOT, "%.4g", new java.lang.Object[]{java.lang.Double.valueOf(d)});
    }

    public static boolean a(java.lang.String str) {
        return str == null || str.isEmpty();
    }

    static {
        java.util.logging.Logger.getLogger(defpackage.crx.class.getName());
        new defpackage.crw();
    }
}
