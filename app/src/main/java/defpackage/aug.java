package defpackage;

/* renamed from: aug  reason: default package */
/* compiled from: PG */
public final class aug {
    public final /* synthetic */ SortableAdapter adapter;

    public final void a(int i, int i2, boolean z) {
        dby g;
        dca dca;
        dmk dmk;
        if (this.adapter.f != null && (g = this.adapter.g(i)) != null) {
            atl atl = this.adapter.f;
            String str = g.d;
            FragmentActivity activity = atl.a.getActivity();
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
            } else if (activity instanceof aux) {
                ((aux) activity).a(atl.a.X, str, i2);
            }
        }
    }

    aug(SortableAdapter atg) {
        this.adapter = atg;
    }
}
