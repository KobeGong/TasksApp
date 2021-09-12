package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: ala reason: default package */
/* compiled from: PG */
public final class ala extends defpackage.arb {
    public defpackage.akt U;
    public android.support.v4.widget.SwipeRefreshLayout V;
    private defpackage.alu W;
    public java.lang.String a;
    public java.util.List b;

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(R.layout.search_results_fragment, null);
        android.support.v7.widget.RecyclerView recyclerView = inflate.findViewById(R.id.search_results_list);
        viewGroup.getContext();
        recyclerView.a(new adw());
        this.U = new defpackage.akt();
        recyclerView.setAdapter(this.U);
        this.V = inflate.findViewById(R.id.search_results_refresh);
        this.a = this.i.getString("query");
        this.U.b = new defpackage.aku(this);
        this.W = new defpackage.alg(this);
        this.V.a = new defpackage.alb(this);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        defpackage.alq.a().b(this.W);
        defpackage.alq.a().a(this.W);
        c();
    }

    public final void onStop() {
        defpackage.alq.a().b(this.W);
        super.onStop();
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        a(new defpackage.alc(this));
    }

    static java.util.List N() {
        defpackage.crk crk = defpackage.crk.a;
        if (!crk.a()) {
            return java.util.Collections.emptyList();
        }
        defpackage.akr akr = (defpackage.akr) crk.b();
        defpackage.any.a().c().b();
        try {
            return (java.util.List) akr.c().get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            defpackage.azb.a("Cannot search", e, new java.lang.Object[0]);
            return java.util.Collections.emptyList();
        }
    }
}
