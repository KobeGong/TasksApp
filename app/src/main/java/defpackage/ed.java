package defpackage;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* renamed from: ed  reason: default package */
/* compiled from: PG */
public final class ed implements Runnable {
    private final View a;
    private final int b;
    private final /* synthetic */ BottomSheetBehavior c;

    public ed(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        if (this.c.g == null || !this.c.g.a()) {
            this.c.c(this.b);
        } else {
            sn.a(this.a, this);
        }
    }
}
