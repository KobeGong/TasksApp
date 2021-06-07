package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.bottomappbar.BottomAppBar;

/* renamed from: dr  reason: default package */
/* compiled from: PG */
final class dr extends AnimatorListenerAdapter {
    private final /* synthetic */ BottomAppBar a;

    dr(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b = null;
    }
}
