package defpackage;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: crx  reason: default package */
/* compiled from: PG */
public final class crx {
    private crx() {
    }

    static long a() {
        return System.nanoTime();
    }

    static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }

    static {
        Logger.getLogger(crx.class.getName());
        new crw();
    }
}
