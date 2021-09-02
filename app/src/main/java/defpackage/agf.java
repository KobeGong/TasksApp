package defpackage;

/* renamed from: agf reason: default package */
/* compiled from: PG */
public final class agf implements android.view.View.OnClickListener {
    private final /* synthetic */ android.support.v7.widget.SearchView a;

    public agf(android.support.v7.widget.SearchView searchView) {
        this.a = searchView;
    }

    public final void onClick(android.view.View view) {
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
