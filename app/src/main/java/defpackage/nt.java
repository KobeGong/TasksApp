package defpackage;

/* renamed from: nt reason: default package */
/* compiled from: PG */
final class nt implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnPreDrawListener {
    private final android.view.View a;
    private android.view.ViewTreeObserver b;
    private final java.lang.Runnable c;

    private nt(android.view.View view, java.lang.Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static defpackage.nt a(android.view.View view, java.lang.Runnable runnable) {
        defpackage.nt ntVar = new defpackage.nt(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(ntVar);
        view.addOnAttachStateChangeListener(ntVar);
        return ntVar;
    }

    public final boolean onPreDraw() {
        a();
        this.c.run();
        return true;
    }

    private final void a() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(android.view.View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(android.view.View view) {
        a();
    }
}
