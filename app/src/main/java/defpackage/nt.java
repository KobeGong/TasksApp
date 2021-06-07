package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
/* renamed from: nt  reason: default package */
/* compiled from: PG */
public final class nt implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private nt(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static nt a(View view, Runnable runnable) {
        nt ntVar = new nt(view, runnable);
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

    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
