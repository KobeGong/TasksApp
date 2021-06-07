package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

/* renamed from: sp  reason: default package */
/* compiled from: PG */
class sp extends so {
    sp() {
    }

    @Override // defpackage.sw
    public final boolean b(View view) {
        return view.hasTransientState();
    }

    @Override // defpackage.sw
    public final void a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    @Override // defpackage.sw
    public final void c(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // defpackage.sw
    public final void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // defpackage.sw
    public final void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Override // defpackage.sw
    public final int d(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // defpackage.sw
    public void a(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    @Override // defpackage.sw
    public final boolean a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    @Override // defpackage.sw
    public final int e(View view) {
        return view.getMinimumWidth();
    }

    @Override // defpackage.sw
    public final int f(View view) {
        return view.getMinimumHeight();
    }

    @Override // defpackage.sw
    public void g(View view) {
        view.requestFitSystemWindows();
    }

    @Override // defpackage.sw
    public final boolean h(View view) {
        return view.getFitsSystemWindows();
    }

    @Override // defpackage.sw
    public final boolean i(View view) {
        return view.hasOverlappingRendering();
    }

    @Override // defpackage.sw
    public final void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
