package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cxf  reason: default package */
/* compiled from: PG */
final class cxf extends cxa {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    cxf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final void a(cxl cxl, Thread thread) {
        this.a.lazySet(cxl, thread);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final void a(cxl cxl, cxl cxl2) {
        this.b.lazySet(cxl, cxl2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, cxl cxl, cxl cxl2) {
        return this.c.compareAndSet(cwz, cxl, cxl2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, cxe cxe, cxe cxe2) {
        return this.d.compareAndSet(cwz, cxe, cxe2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, Object obj, Object obj2) {
        return this.e.compareAndSet(cwz, obj, obj2);
    }
}
