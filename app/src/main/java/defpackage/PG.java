package defpackage;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;

/* renamed from: do  reason: invalid class name and default package and case insensitive filesystem */
public final class PG implements Runnable {
    private final View a;
    private final boolean b;
    private final /* synthetic */ SwipeDismissBehavior c;

    PG(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.c = swipeDismissBehavior;
        this.a = view;
        this.b = z;
    }

    public final void run() {
        if (this.c.a != null && this.c.a.a()) {
            sn.a(this.a, this);
        } else if (this.b && this.c.b != null) {
            this.c.b.a(this.a);
        }
    }
}
