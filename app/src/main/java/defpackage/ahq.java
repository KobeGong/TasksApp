package defpackage;

/* renamed from: ahq reason: default package */
/* compiled from: PG */
public final class ahq {
    public final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public final void a(defpackage.afv afv, defpackage.afb afb, defpackage.afb afb2) {
        this.a.e.b(afv);
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        recyclerView.a(afv);
        afv.a(false);
        if (recyclerView.z.a(afv, afb, afb2)) {
            recyclerView.k();
        }
    }

    public final void b(defpackage.afv afv, defpackage.afb afb, defpackage.afb afb2) {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        afv.a(false);
        if (recyclerView.z.b(afv, afb, afb2)) {
            recyclerView.k();
        }
    }

    public final void a(defpackage.afv afv) {
        defpackage.afd afd = this.a.l;
        android.view.View view = afv.a;
        defpackage.afn afn = this.a.e;
        defpackage.acm acm = afd.a;
        int a2 = acm.a.a(view);
        if (a2 >= 0) {
            if (acm.b.d(a2)) {
                acm.b(view);
            }
            acm.a.a(a2);
        }
        afn.a(view);
    }

    public ahq(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
