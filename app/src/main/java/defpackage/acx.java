package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: acx  reason: default package */
/* compiled from: PG */
final class acx extends AnimatorListenerAdapter {
    private final /* synthetic */ ViewHolder a;
    private final /* synthetic */ View b;
    private final /* synthetic */ ViewPropertyAnimator c;
    private final /* synthetic */ acs d;

    acx(acs acs, ViewHolder afv, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = acs;
        this.a = afv;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.e(this.a);
        this.d.d.remove(this.a);
        this.d.c();
    }
}
