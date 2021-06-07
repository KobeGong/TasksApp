package defpackage;

import android.widget.AbsListView;

/* access modifiers changed from: package-private */
/* renamed from: aeh  reason: default package */
/* compiled from: PG */
public final class aeh implements AbsListView.OnScrollListener {
    private final /* synthetic */ aec a;

    aeh(aec aec) {
        this.a = aec;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.j() && this.a.r.getContentView() != null) {
            this.a.o.removeCallbacks(this.a.n);
            this.a.n.run();
        }
    }
}
