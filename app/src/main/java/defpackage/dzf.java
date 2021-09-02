package defpackage;

/* renamed from: dzf reason: default package */
/* compiled from: PG */
final class dzf extends defpackage.dze {
    private final java.util.concurrent.atomic.AtomicIntegerFieldUpdater a;

    dzf(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    public final boolean a(defpackage.dzd dzd) {
        return this.a.compareAndSet(dzd, 0, -1);
    }

    public final void b(defpackage.dzd dzd) {
        this.a.set(dzd, 0);
    }
}
