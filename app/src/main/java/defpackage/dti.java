package defpackage;

/* renamed from: dti reason: default package */
/* compiled from: PG */
final class dti {
    private java.util.ArrayList a = new java.util.ArrayList();
    private volatile defpackage.dnq b = defpackage.dnq.IDLE;

    dti() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dnq dnq) {
        defpackage.cld.a((java.lang.Object) dnq, (java.lang.Object) "newState");
        if (this.b != dnq && this.b != defpackage.dnq.SHUTDOWN) {
            this.b = dnq;
            if (!this.a.isEmpty()) {
                java.util.ArrayList arrayList = this.a;
                this.a = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    arrayList2.get(0);
                    throw new java.lang.NoSuchMethodError();
                }
            }
        }
    }
}
