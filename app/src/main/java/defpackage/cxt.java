package defpackage;

/* renamed from: cxt reason: default package */
/* compiled from: PG */
final class cxt extends defpackage.cxr {
    cxt() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxq cxq, java.util.Set set) {
        synchronized (cxq) {
            if (cxq.seenExceptions == null) {
                cxq.seenExceptions = set;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(defpackage.cxq cxq) {
        int i;
        synchronized (cxq) {
            cxq.remaining--;
            i = cxq.remaining;
        }
        return i;
    }
}
