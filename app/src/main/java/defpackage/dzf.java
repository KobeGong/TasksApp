package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* access modifiers changed from: package-private */
/* renamed from: dzf  reason: default package */
/* compiled from: PG */
public final class dzf extends dze {
    private final AtomicIntegerFieldUpdater a;

    dzf(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.dze
    public final boolean a(dzd dzd) {
        return this.a.compareAndSet(dzd, 0, -1);
    }

    @Override // defpackage.dze
    public final void b(dzd dzd) {
        this.a.set(dzd, 0);
    }
}
