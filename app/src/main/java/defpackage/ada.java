package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ada  reason: default package */
/* compiled from: PG */
final class ada extends AnimatorListenerAdapter {
    private final /* synthetic */ adb a;
    private final /* synthetic */ ViewPropertyAnimator b;
    private final /* synthetic */ View c;
    private final /* synthetic */ acs d;

    ada(acs acs, adb adb, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = acs;
        this.a = adb;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.e(this.a.b);
        this.d.g.remove(this.a.b);
        this.d.c();
    }
}