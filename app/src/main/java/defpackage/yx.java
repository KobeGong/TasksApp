package defpackage;

import android.view.View;

/* renamed from: yx  reason: default package */
/* compiled from: PG */
final class yx implements View.OnAttachStateChangeListener {
    private final /* synthetic */ yv a;

    yx(yv yvVar) {
        this.a = yvVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.a.e != null) {
            if (!this.a.e.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            this.a.e.removeGlobalOnLayoutListener(this.a.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
