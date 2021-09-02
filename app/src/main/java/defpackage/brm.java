package defpackage;

/* renamed from: brm reason: default package */
/* compiled from: PG */
final class brm implements defpackage.ays {
    private final /* synthetic */ defpackage.bra a;
    private final /* synthetic */ defpackage.brk b;

    brm(defpackage.brk brk, defpackage.bra bra) {
        this.b = brk;
        this.a = bra;
    }

    public final void a(defpackage.axq axq) {
        defpackage.bra bra = this.a;
        defpackage.bqt a2 = this.b.a(axq);
        defpackage.coi coi = bra.a;
        defpackage.cdm.a(3, "ClearcutTransmitter", "onConnectionFailed, result: %b", a2);
        synchronized (coi.b) {
            if (coi.d != null) {
                coi.d.b(coi.e);
                coi.d.b(coi.f);
                coi.d = null;
            }
        }
    }
}
