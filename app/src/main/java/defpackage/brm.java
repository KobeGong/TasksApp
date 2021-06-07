package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: brm  reason: default package */
/* compiled from: PG */
public final class brm implements ays {
    private final /* synthetic */ bra a;
    private final /* synthetic */ brk b;

    brm(brk brk, bra bra) {
        this.b = brk;
        this.a = bra;
    }

    @Override // defpackage.ays
    public final void a(axq axq) {
        bra bra = this.a;
        bqt a2 = this.b.a(axq);
        coi coi = bra.a;
        cdm.a(3, "ClearcutTransmitter", "onConnectionFailed, result: %b", a2);
        synchronized (coi.b) {
            if (coi.d != null) {
                coi.d.b(coi.e);
                coi.d.b(coi.f);
                coi.d = null;
            }
        }
    }
}
