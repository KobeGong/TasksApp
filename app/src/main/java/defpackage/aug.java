package defpackage;

/* renamed from: aug reason: default package */
/* compiled from: PG */
public final class aug {
    public final /* synthetic */ defpackage.atg a;

    public final void a(int i, int i2, boolean z) {
        defpackage.dca dca;
        defpackage.dmk dmk;
        if (this.a.f != null) {
            defpackage.dby g = this.a.g(i);
            if (g != null) {
                defpackage.atl atl = this.a.f;
                java.lang.String str = g.d;
                FragmentActivity j = atl.a.getActivity();
                if (z) {
                    defpackage.dby a2 = TasksFragment.N().a(atl.a.X, str);
                    if (a2 != null) {
                        atl.a.Z = a2.d;
                        if (a2.e == null) {
                            dca = defpackage.dca.g;
                        } else {
                            dca = a2.e;
                        }
                        if (dca.d == null) {
                            dmk = defpackage.dmk.d;
                        } else {
                            dmk = dca.d;
                        }
                        defpackage.aqj.a(dmk).a((defpackage.ln) atl.a.t, "datePicker - tasks fragment");
                    }
                } else if (j instanceof defpackage.aux) {
                    ((defpackage.aux) j).a(atl.a.X, str, i2);
                }
            }
        }
    }

    aug(defpackage.atg atg) {
        this.a = atg;
    }
}
