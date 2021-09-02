package defpackage;

/* renamed from: cxq reason: default package */
/* compiled from: PG */
abstract class cxq {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.cxq.class.getName());
    public static final defpackage.cxr d;
    public volatile int remaining;
    public volatile java.util.Set seenExceptions = null;

    cxq(int i) {
        this.remaining = i;
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(java.util.Set set);

    static {
        defpackage.cxr cxt;
        java.lang.Throwable th = null;
        try {
            cxt = new defpackage.cxs(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.cxq.class, java.util.Set.class, "seenExceptions"), java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.cxq.class, "remaining"));
        } catch (Throwable th2) {
            th = th2;
            cxt = new defpackage.cxt();
        }
        d = cxt;
        if (th != null) {
            a.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
