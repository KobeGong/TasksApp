package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cob  reason: default package */
/* compiled from: PG */
public final class cob {
    private static final AtomicReference a = new AtomicReference(null);

    public static void a(clo clo) {
        cky.a(clo);
    }

    public static void b(clo clo) {
        cky.a(clo);
        a.set(null);
    }
}
