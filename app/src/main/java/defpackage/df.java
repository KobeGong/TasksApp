package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/* renamed from: df  reason: default package */
/* compiled from: PG */
final class df implements Runnable {
    private final CoordinatorLayout a;
    private final View b;
    private final /* synthetic */ de c;

    df(de deVar, CoordinatorLayout coordinatorLayout, View view) {
        this.c = deVar;
        this.a = coordinatorLayout;
        this.b = view;
    }

    public final void run() {
        if (this.b != null && this.c.c != null) {
            if (this.c.c.computeScrollOffset()) {
                this.c.a_(this.a, this.b, this.c.c.getCurrY());
                sn.a(this.b, this);
                return;
            }
            this.c.a(this.a, this.b);
        }
    }
}
