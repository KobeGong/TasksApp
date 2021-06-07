package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior;

/* renamed from: cgd  reason: default package */
/* compiled from: PG */
public final class cgd implements Runnable {
    private final View a;
    private final int b;
    private final /* synthetic */ BottomDrawerBehavior c;

    public cgd(BottomDrawerBehavior bottomDrawerBehavior, View view, int i) {
        this.c = bottomDrawerBehavior;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        if (this.c.d == null || !this.c.d.a()) {
            this.c.c(this.b);
        } else {
            sn.a(this.a, this);
        }
    }
}
