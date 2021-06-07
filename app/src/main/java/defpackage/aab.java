package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: aab  reason: default package */
/* compiled from: PG */
final class aab implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ aaa a;

    aab(aaa aaa) {
        this.a = aaa;
    }

    public final void onGlobalLayout() {
        if (this.a.f() && !this.a.a.q) {
            View view = this.a.c;
            if (view == null || !view.isShown()) {
                this.a.e();
            } else {
                this.a.a.d();
            }
        }
    }
}
