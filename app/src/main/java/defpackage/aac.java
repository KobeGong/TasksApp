package defpackage;

import android.view.View;

/* renamed from: aac  reason: default package */
/* compiled from: PG */
final class aac implements View.OnAttachStateChangeListener {
    private final /* synthetic */ aaa a;

    aac(aaa aaa) {
        this.a = aaa;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d != null) {
            if (!this.a.d.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            this.a.d.removeGlobalOnLayoutListener(this.a.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
