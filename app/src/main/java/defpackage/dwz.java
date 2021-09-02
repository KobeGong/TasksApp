package defpackage;

/* renamed from: dwz reason: default package */
/* compiled from: PG */
public final class dwz extends defpackage.duz {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dwz.class.getName());
    private static final java.lang.ref.ReferenceQueue b = new java.lang.ref.ReferenceQueue();
    private static final java.util.concurrent.ConcurrentMap c = new java.util.concurrent.ConcurrentHashMap();

    public dwz(defpackage.dnc dnc) {
        this(dnc, b, c);
    }

    private dwz(defpackage.dnc dnc, java.lang.ref.ReferenceQueue referenceQueue, java.util.concurrent.ConcurrentMap concurrentMap) {
        super(dnc);
        new defpackage.dxa(this, dnc, referenceQueue, concurrentMap);
    }
}
