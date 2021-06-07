package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.bottomappbar.BottomAppBar;

/* renamed from: dp  reason: default package */
/* compiled from: PG */
final class dp extends AnimatorListenerAdapter {
    private final /* synthetic */ BottomAppBar a;

    dp(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.c = null;
    }
}
