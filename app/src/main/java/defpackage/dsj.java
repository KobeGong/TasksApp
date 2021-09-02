package defpackage;

/* renamed from: dsj reason: default package */
/* compiled from: PG */
final class dsj extends defpackage.dqc {
    private final defpackage.ecc a;

    dsj(defpackage.ecc ecc) {
        super(0);
        this.a = (defpackage.ecc) defpackage.cld.a((java.lang.Object) ecc, (java.lang.Object) "span");
    }

    public final void a(int i, long j, long j2) {
        defpackage.dsg.b(this.a, defpackage.ecb.SENT, i, j, j2);
    }

    public final void a(int i, long j) {
        defpackage.dsg.b(this.a, defpackage.ecb.RECV, i, j, -1);
    }
}
