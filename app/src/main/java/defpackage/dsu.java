package defpackage;

import java.io.InputStream;

/* renamed from: dsu  reason: default package */
/* compiled from: PG */
final class dsu extends dtk {
    private final /* synthetic */ dzr a;
    private final /* synthetic */ dss b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dsu(dss dss, dzr dzr) {
        super(dss.c.d);
        this.b = dss;
        this.a = dzr;
    }

    @Override // defpackage.dtk
    public final void a() {
        if (this.b.b) {
            dvc.a(this.a);
            return;
        }
        while (true) {
            try {
                InputStream a2 = this.a.a();
                if (a2 != null) {
                    try {
                        this.b.a.a(this.b.c.a.d.a(a2));
                        a2.close();
                    } catch (Throwable th) {
                        dvc.a(a2);
                        throw th;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                dvc.a(this.a);
                dpw a3 = dpw.c.b(th2).a("Failed to read message.");
                this.b.c.e.b(a3);
                this.b.a(a3, new dor());
                return;
            }
        }
    }
}
