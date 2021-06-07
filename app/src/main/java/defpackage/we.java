package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.view.View;

/* renamed from: we  reason: default package */
/* compiled from: PG */
final class we implements uy {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;

    we(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // defpackage.uy
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        AlertController.a(nestedScrollView, this.a, this.b);
    }
}
