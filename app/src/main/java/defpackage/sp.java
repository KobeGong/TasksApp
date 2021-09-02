package defpackage;

/* renamed from: sp reason: default package */
/* compiled from: PG */
class sp extends defpackage.so {
    sp() {
    }

    public final boolean b(android.view.View view) {
        return view.hasTransientState();
    }

    public final void a(android.view.View view, boolean z) {
        view.setHasTransientState(z);
    }

    public final void c(android.view.View view) {
        view.postInvalidateOnAnimation();
    }

    public final void a(android.view.View view, java.lang.Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public final void a(android.view.View view, java.lang.Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public final int d(android.view.View view) {
        return view.getImportantForAccessibility();
    }

    public void a(android.view.View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    public final boolean a(android.view.View view, int i, android.os.Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public final int e(android.view.View view) {
        return view.getMinimumWidth();
    }

    public final int f(android.view.View view) {
        return view.getMinimumHeight();
    }

    public void g(android.view.View view) {
        view.requestFitSystemWindows();
    }

    public final boolean h(android.view.View view) {
        return view.getFitsSystemWindows();
    }

    public final boolean i(android.view.View view) {
        return view.hasOverlappingRendering();
    }

    public final void a(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackground(drawable);
    }
}
