package defpackage;

import java.nio.charset.Charset;

/* renamed from: dmd  reason: default package */
/* compiled from: PG */
public final class dmd {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b = new Object();

    public static void a(dlz dlz, dlz dlz2) {
        if (dlz.j != null) {
            dlz2.j = (dmb) dlz.j.clone();
        }
    }

    static {
        Charset.forName("ISO-8859-1");
    }
}
