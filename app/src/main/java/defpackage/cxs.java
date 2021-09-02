package defpackage;

/* renamed from: cxs reason: default package */
/* compiled from: PG */
final class cxs extends defpackage.cxr {
    private final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a;
    private final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b;

    cxs(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxq cxq, java.util.Set set) {
        this.a.compareAndSet(cxq, null, set);
    }

    /* access modifiers changed from: 0000 */
    public final int a(defpackage.cxq cxq) {
        return this.b.decrementAndGet(cxq);
    }
}
