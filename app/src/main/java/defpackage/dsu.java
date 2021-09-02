package defpackage;

/* renamed from: dsu reason: default package */
/* compiled from: PG */
final class dsu extends defpackage.dtk {
    private final /* synthetic */ defpackage.dzr a;
    private final /* synthetic */ defpackage.dss b;

    dsu(defpackage.dss dss, defpackage.dzr dzr) {
        this.b = dss;
        this.a = dzr;
        super(dss.c.d);
    }

    public final void a() {
        java.io.InputStream a2;
        if (this.b.b) {
            defpackage.dvc.a(this.a);
            return;
        }
        while (true) {
            try {
                a2 = this.a.a();
                if (a2 != null) {
                    this.b.a.a(this.b.c.a.d.a(a2));
                    a2.close();
                } else {
                    return;
                }
            } catch (Throwable th) {
                defpackage.dvc.a(this.a);
                defpackage.dpw a3 = defpackage.dpw.c.b(th).a("Failed to read message.");
                this.b.c.e.b(a3);
                this.b.a(a3, new defpackage.dor());
                return;
            }
        }
    }
}
