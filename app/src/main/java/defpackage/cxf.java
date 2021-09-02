package defpackage;

/* renamed from: cxf reason: default package */
/* compiled from: PG */
final class cxf extends defpackage.cxa {
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e;

    cxf(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxl cxl, java.lang.Thread thread) {
        this.a.lazySet(cxl, thread);
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxl cxl, defpackage.cxl cxl2) {
        this.b.lazySet(cxl, cxl2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, defpackage.cxl cxl, defpackage.cxl cxl2) {
        return this.c.compareAndSet(cwz, cxl, cxl2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, defpackage.cxe cxe, defpackage.cxe cxe2) {
        return this.d.compareAndSet(cwz, cxe, cxe2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, java.lang.Object obj, java.lang.Object obj2) {
        return this.e.compareAndSet(cwz, obj, obj2);
    }
}
