package defpackage;

/* renamed from: dst  reason: default package */
/* compiled from: PG */
final class dst extends dtk {
    private final /* synthetic */ dor a;
    private final /* synthetic */ dss b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dst(dss dss, dor dor) {
        super(dss.c.d);
        this.b = dss;
        this.a = dor;
    }

    @Override // defpackage.dtk
    public final void a() {
        try {
            if (!this.b.b) {
                this.b.a.a(this.a);
            }
        } catch (Throwable th) {
            dpw a2 = dpw.c.b(th).a("Failed to read headers");
            this.b.c.e.b(a2);
            this.b.a(a2, new dor());
        }
    }
}
