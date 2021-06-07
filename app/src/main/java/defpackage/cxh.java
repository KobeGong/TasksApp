package defpackage;

/* renamed from: cxh  reason: default package */
/* compiled from: PG */
final class cxh extends cxa {
    cxh() {
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final void a(cxl cxl, Thread thread) {
        cxl.thread = thread;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final void a(cxl cxl, cxl cxl2) {
        cxl.next = cxl2;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, cxl cxl, cxl cxl2) {
        boolean z;
        synchronized (cwz) {
            if (cwz.waiters == cxl) {
                cwz.waiters = cxl2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, cxe cxe, cxe cxe2) {
        boolean z;
        synchronized (cwz) {
            if (cwz.listeners == cxe) {
                cwz.listeners = cxe2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, Object obj, Object obj2) {
        boolean z;
        synchronized (cwz) {
            if (cwz.value == obj) {
                cwz.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
