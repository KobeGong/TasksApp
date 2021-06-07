package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: ahq  reason: default package */
/* compiled from: PG */
public final class ahq {
    public final /* synthetic */ RecyclerView a;

    public final void a(afv afv, afb afb, afb afb2) {
        this.a.e.b(afv);
        RecyclerView recyclerView = this.a;
        recyclerView.a(afv);
        afv.a(false);
        if (recyclerView.z.a(afv, afb, afb2)) {
            recyclerView.k();
        }
    }

    public final void b(afv afv, afb afb, afb afb2) {
        RecyclerView recyclerView = this.a;
        afv.a(false);
        if (recyclerView.z.b(afv, afb, afb2)) {
            recyclerView.k();
        }
    }

    public final void a(afv afv) {
        afd afd = this.a.l;
        View view = afv.a;
        afn afn = this.a.e;
        acm acm = afd.a;
        int a2 = acm.a.a(view);
        if (a2 >= 0) {
            if (acm.b.d(a2)) {
                acm.b(view);
            }
            acm.a.a(a2);
        }
        afn.a(view);
    }

    public ahq(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
