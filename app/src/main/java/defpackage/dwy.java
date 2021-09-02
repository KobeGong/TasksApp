package defpackage;

/* renamed from: dwy reason: default package */
/* compiled from: PG */
final class dwy {
    public final java.lang.Object a = new java.lang.Object();
    public java.util.Collection b = new java.util.HashSet();

    dwy() {
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dpw a(defpackage.dyb dyb) {
        synchronized (this.a) {
            this.b.add(dyb);
        }
        return null;
    }
}
