package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: yw  reason: default package */
/* compiled from: PG */
final class yw implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ yv a;

    yw(yv yvVar) {
        this.a = yvVar;
    }

    public final void onGlobalLayout() {
        if (this.a.f() && this.a.b.size() > 0 && !((za) this.a.b.get(0)).a.q) {
            View view = this.a.d;
            if (view == null || !view.isShown()) {
                this.a.e();
                return;
            }
            for (za zaVar : this.a.b) {
                zaVar.a.d();
            }
        }
    }
}
