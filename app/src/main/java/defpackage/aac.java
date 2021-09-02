package defpackage;

/* renamed from: aac reason: default package */
/* compiled from: PG */
final class aac implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ defpackage.aaa a;

    aac(defpackage.aaa aaa) {
        this.a = aaa;
    }

    public final void onViewAttachedToWindow(android.view.View view) {
    }

    public final void onViewDetachedFromWindow(android.view.View view) {
        if (this.a.d != null) {
            if (!this.a.d.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            this.a.d.removeGlobalOnLayoutListener(this.a.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
