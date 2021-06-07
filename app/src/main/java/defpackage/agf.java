package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;

/* renamed from: agf  reason: default package */
/* compiled from: PG */
public final class agf implements View.OnClickListener {
    private final /* synthetic */ SearchView a;

    public agf(SearchView searchView) {
        this.a = searchView;
    }

    public final void onClick(View view) {
        if (view == this.a.c) {
            this.a.g();
        } else if (view == this.a.e) {
            this.a.f();
        } else if (view == this.a.d) {
            this.a.e();
        } else if (view != this.a.f && view == this.a.a) {
            this.a.i();
        }
    }
}
