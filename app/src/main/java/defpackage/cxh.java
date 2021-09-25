package defpackage;

/* renamed from: cxh reason: default package */
/* compiled from: PG */
final class cxh extends defpackage.cxa {
    cxh() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxl cxl, java.lang.Thread thread) {
        cxl.thread = thread;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxl cxl, defpackage.cxl cxl2) {
        cxl.next = cxl2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, defpackage.cxl cxl, defpackage.cxl cxl2) {
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

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, defpackage.cxe cxe, defpackage.cxe cxe2) {
        boolean z;
        synchronized (cwz) {
            if (cwz.taskNode == cxe) {
                cwz.taskNode = cxe2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, java.lang.Object obj, java.lang.Object obj2) {
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
