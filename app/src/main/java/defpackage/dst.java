package defpackage;

/* renamed from: dst reason: default package */
/* compiled from: PG */
final class dst extends defpackage.dtk {
    private final /* synthetic */ defpackage.dor a;
    private final /* synthetic */ defpackage.dss b;

    dst(defpackage.dss dss, defpackage.dor dor) {
        this.b = dss;
        this.a = dor;
        super(dss.c.d);
    }

    public final void a() {
        try {
            if (!this.b.b) {
                this.b.a.a(this.a);
            }
        } catch (Throwable th) {
            defpackage.dpw a2 = defpackage.dpw.c.b(th).a("Failed to read headers");
            this.b.c.e.b(a2);
            this.b.a(a2, new defpackage.dor());
        }
    }
}
