package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AbsListView;

/* renamed from: wg  reason: default package */
/* compiled from: PG */
final class wg implements AbsListView.OnScrollListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;

    wg(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.a(absListView, this.a, this.b);
    }
}
