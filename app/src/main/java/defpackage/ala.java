package defpackage;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: ala  reason: default package */
/* compiled from: PG */
public final class ala extends arb {
    public akt U;
    public SwipeRefreshLayout V;
    private alu W;
    public String a;
    public List b;

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.search_results_fragment, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.google.android.apps.tasks.R.id.search_results_list);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.U = new akt();
        recyclerView.setAdapter(this.U);
        this.V = (SwipeRefreshLayout) inflate.findViewById(com.google.android.apps.tasks.R.id.search_results_refresh);
        this.a = this.i.getString("query");
        this.U.b = new aku(this);
        this.W = new alg(this);
        this.V.a = new alb(this);
        return inflate;
    }

    @Override // defpackage.lc
    public final void e() {
        super.e();
        alq.a().b(this.W);
        alq.a().a(this.W);
        c();
    }

    @Override // defpackage.lc
    public final void f() {
        alq.a().b(this.W);
        super.f();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        a(new alc(this));
    }

    static List N() {
        crk crk = crk.a;
        if (!crk.a()) {
            return Collections.emptyList();
        }
        any.get().c().b();
        try {
            return (List) ((akr) crk.b()).c().get();
        } catch (InterruptedException | ExecutionException e) {
            azb.a("Cannot search", e, new Object[0]);
            return Collections.emptyList();
        }
    }
}
