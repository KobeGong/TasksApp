package defpackage;

/* renamed from: yx reason: default package */
/* compiled from: PG */
final class yx implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ defpackage.yv a;

    yx(defpackage.yv yvVar) {
        this.a = yvVar;
    }

    public final void onViewAttachedToWindow(android.view.View view) {
    }

    public final void onViewDetachedFromWindow(android.view.View view) {
        if (this.a.e != null) {
            if (!this.a.e.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            this.a.e.removeGlobalOnLayoutListener(this.a.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
