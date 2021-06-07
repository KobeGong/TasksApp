package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.floatingactionbutton.FloatingActionButton;
import android.support.v7.widget.ActionMenuView;
import java.util.ArrayList;

/* renamed from: dt  reason: default package */
/* compiled from: PG */
public final class dt extends AnimatorListenerAdapter {
    private final /* synthetic */ BottomAppBar a;

    public dt(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.a;
        boolean z = this.a.f;
        if (sn.a.r(bottomAppBar)) {
            if (bottomAppBar.b != null) {
                bottomAppBar.b.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                bottomAppBar.b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(bottomAppBar.a.b, 0.0f);
            ofFloat.addUpdateListener(new ds(bottomAppBar));
            ofFloat.setDuration(300L);
            arrayList.add(ofFloat);
            FloatingActionButton a2 = bottomAppBar.a();
            if (a2 != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a2, "translationY", bottomAppBar.c());
                ofFloat2.setDuration(300L);
                arrayList.add(ofFloat2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            bottomAppBar.b = animatorSet;
            bottomAppBar.b.addListener(new dr(bottomAppBar));
            bottomAppBar.b.start();
        }
        BottomAppBar bottomAppBar2 = this.a;
        if (sn.a.r(bottomAppBar2)) {
            if (bottomAppBar2.c != null) {
                bottomAppBar2.c.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            bottomAppBar2.b();
            ActionMenuView d = bottomAppBar2.d();
            if (d != null) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d, "alpha", 1.0f);
                if (bottomAppBar2.f && bottomAppBar2.d == 1) {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(d, "alpha", 0.0f);
                    ofFloat4.addListener(new dq(bottomAppBar2, d, 0, false));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(ofFloat4, ofFloat3);
                    arrayList2.add(animatorSet2);
                } else if (d.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat3);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            bottomAppBar2.c = animatorSet3;
            bottomAppBar2.c.addListener(new dp(bottomAppBar2));
            bottomAppBar2.c.start();
        }
    }
}
