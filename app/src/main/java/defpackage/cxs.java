package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cxs  reason: default package */
/* compiled from: PG */
final class cxs extends cxr {
    private final AtomicReferenceFieldUpdater a;
    private final AtomicIntegerFieldUpdater b;

    cxs(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxr
    public final void a(cxq cxq, Set set) {
        this.a.compareAndSet(cxq, null, set);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxr
    public final int a(cxq cxq) {
        return this.b.decrementAndGet(cxq);
    }
}
