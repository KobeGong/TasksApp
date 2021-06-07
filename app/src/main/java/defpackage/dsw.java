package defpackage;

/* renamed from: dsw  reason: default package */
/* compiled from: PG */
final class dsw extends dtk {
    private final /* synthetic */ dss a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dsw(dss dss) {
        super(dss.c.d);
        this.a = dss;
    }

    @Override // defpackage.dtk
    public final void a() {
        try {
            this.a.a.a();
        } catch (Throwable th) {
            dpw a2 = dpw.c.b(th).a("Failed to call onReady.");
            this.a.c.e.b(a2);
            this.a.a(a2, new dor());
        }
    }
}
