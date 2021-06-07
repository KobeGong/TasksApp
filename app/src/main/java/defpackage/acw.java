package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: acw  reason: default package */
/* compiled from: PG */
final class acw extends AnimatorListenerAdapter {
    private final /* synthetic */ afv a;
    private final /* synthetic */ ViewPropertyAnimator b;
    private final /* synthetic */ View c;
    private final /* synthetic */ acs d;

    acw(acs acs, afv afv, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = acs;
        this.a = afv;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.e(this.a);
        this.d.f.remove(this.a);
        this.d.c();
    }
}
