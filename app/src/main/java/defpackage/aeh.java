package defpackage;

/* renamed from: aeh reason: default package */
/* compiled from: PG */
final class aeh implements android.widget.AbsListView.OnScrollListener {
    private final /* synthetic */ defpackage.aec a;

    aeh(defpackage.aec aec) {
        this.a = aec;
    }

    public final void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
        if (i == 1 && !this.a.j() && this.a.r.getContentView() != null) {
            this.a.o.removeCallbacks(this.a.n);
            this.a.n.run();
        }
    }
}
