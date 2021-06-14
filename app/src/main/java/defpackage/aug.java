package defpackage;

/* renamed from: aug  reason: default package */
/* compiled from: PG */
public final class aug {
    public final /* synthetic */ SortableAdapter a;

    public final void a(int i, int i2, boolean z) {
        dby g;
        dca dca;
        dmk dmk;
        if (this.a.f != null && (g = this.a.g(i)) != null) {
            atl atl = this.a.f;
            String str = g.d;
            lg j = atl.a.j();
            if (z) {
                dby a2 = auj.N().a(atl.a.X, str);
                if (a2 != null) {
                    atl.a.Z = a2.d;
                    if (a2.e == null) {
                        dca = dca.g;
                    } else {
                        dca = a2.e;
                    }
                    if (dca.d == null) {
                        dmk = dmk.d;
                    } else {
                        dmk = dca.d;
                    }
                    aqj.a(dmk).a(atl.a.t, "datePicker - tasks fragment");
                }
            } else if (j instanceof aux) {
                ((aux) j).a(atl.a.X, str, i2);
            }
        }
    }

    aug(SortableAdapter atg) {
        this.a = atg;
    }
}
