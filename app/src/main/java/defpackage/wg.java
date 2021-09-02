package defpackage;

/* renamed from: wg reason: default package */
/* compiled from: PG */
final class wg implements android.widget.AbsListView.OnScrollListener {
    private final /* synthetic */ android.view.View a;
    private final /* synthetic */ android.view.View b;

    wg(android.view.View view, android.view.View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
    }

    public final void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
        android.support.v7.app.AlertController.a(absListView, this.a, this.b);
    }
}
