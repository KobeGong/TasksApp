package defpackage;

/* renamed from: dsw reason: default package */
/* compiled from: PG */
final class dsw extends defpackage.dtk {
    private final /* synthetic */ defpackage.dss a;

    dsw(defpackage.dss dss) {
        this.a = dss;
        super(dss.c.d);
    }

    public final void a() {
        try {
            this.a.a.a();
        } catch (Throwable th) {
            defpackage.dpw a2 = defpackage.dpw.c.b(th).a("Failed to call onReady.");
            this.a.c.e.b(a2);
            this.a.a(a2, new defpackage.dor());
        }
    }
}
