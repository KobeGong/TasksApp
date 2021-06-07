package defpackage;

import android.view.View;

/* renamed from: ceu  reason: default package */
public final /* synthetic */ class ceu implements View.OnClickListener {
    private final cdg a;
    private final cdj b;

    public ceu(cdg cdg, cdj cdj) {
        this.a = cdg;
        this.b = cdj;
    }

    public final void onClick(View view) {
        this.a.a(view, this.b.a().c());
    }
}
