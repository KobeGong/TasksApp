package defpackage;

/* renamed from: dsj  reason: default package */
/* compiled from: PG */
final class dsj extends dqc {
    private final ecc a;

    dsj(ecc ecc) {
        super((short) 0);
        this.a = (ecc) cld.a(ecc, "span");
    }

    @Override // defpackage.dqc
    public final void a(int i, long j, long j2) {
        dsg.b(this.a, ecb.SENT, i, j, j2);
    }

    @Override // defpackage.dqc
    public final void a(int i, long j) {
        dsg.b(this.a, ecb.RECV, i, j, -1);
    }
}
