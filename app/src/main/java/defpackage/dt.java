package defpackage;

/* renamed from: dt reason: default package */
/* compiled from: PG */
public final class dt extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ android.support.design.bottomappbar.BottomAppBar a;

    public dt(android.support.design.bottomappbar.BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
        android.support.design.bottomappbar.BottomAppBar bottomAppBar = this.a;
        boolean z = this.a.f;
        if (defpackage.sn.a.r(bottomAppBar)) {
            if (bottomAppBar.b != null) {
                bottomAppBar.b.cancel();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (z) {
                bottomAppBar.b();
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(new float[]{bottomAppBar.a.b, 0.0f});
            ofFloat.addUpdateListener(new defpackage.ds(bottomAppBar));
            ofFloat.setDuration(300);
            arrayList.add(ofFloat);
            android.support.design.floatingactionbutton.FloatingActionButton a2 = bottomAppBar.a();
            if (a2 != null) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(a2, "translationY", new float[]{bottomAppBar.c()});
                ofFloat2.setDuration(300);
                arrayList.add(ofFloat2);
            }
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(arrayList);
            bottomAppBar.b = animatorSet;
            bottomAppBar.b.addListener(new defpackage.dr(bottomAppBar));
            bottomAppBar.b.start();
        }
        android.support.design.bottomappbar.BottomAppBar bottomAppBar2 = this.a;
        if (defpackage.sn.a.r(bottomAppBar2)) {
            if (bottomAppBar2.c != null) {
                bottomAppBar2.c.cancel();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            bottomAppBar2.b();
            android.support.v7.widget.ActionMenuView d = bottomAppBar2.d();
            if (d != null) {
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(d, "alpha", new float[]{1.0f});
                if (bottomAppBar2.f && bottomAppBar2.d == 1) {
                    android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(d, "alpha", new float[]{0.0f});
                    ofFloat4.addListener(new defpackage.dq(bottomAppBar2, d, 0, false));
                    android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                    animatorSet2.setDuration(150);
                    animatorSet2.playSequentially(new android.animation.Animator[]{ofFloat4, ofFloat3});
                    arrayList2.add(animatorSet2);
                } else if (d.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat3);
                }
            }
            android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            bottomAppBar2.c = animatorSet3;
            bottomAppBar2.c.addListener(new defpackage.dp(bottomAppBar2));
            bottomAppBar2.c.start();
        }
    }
}
