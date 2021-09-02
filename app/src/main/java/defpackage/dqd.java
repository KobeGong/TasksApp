package defpackage;

/* renamed from: dqd reason: default package */
/* compiled from: PG */
final class dqd extends defpackage.dnx {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dqd.class.getName());
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    dqd() {
    }

    public final defpackage.dns a(defpackage.dns dns) {
        defpackage.dns a2 = a();
        b.set(dns);
        return a2;
    }

    public final void a(defpackage.dns dns, defpackage.dns dns2) {
        if (a() != dns) {
            a.logp(java.util.logging.Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new java.lang.Throwable().fillInStackTrace());
        }
        a(dns2);
    }

    public final defpackage.dns a() {
        return (defpackage.dns) b.get();
    }
}
