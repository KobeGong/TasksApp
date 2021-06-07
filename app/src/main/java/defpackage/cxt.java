package defpackage;

import java.util.Set;

/* renamed from: cxt  reason: default package */
/* compiled from: PG */
final class cxt extends cxr {
    cxt() {
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxr
    public final void a(cxq cxq, Set set) {
        synchronized (cxq) {
            if (cxq.seenExceptions == null) {
                cxq.seenExceptions = set;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxr
    public final int a(cxq cxq) {
        int i;
        synchronized (cxq) {
            cxq.remaining--;
            i = cxq.remaining;
        }
        return i;
    }
}
