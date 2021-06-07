package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: dl  reason: default package */
/* compiled from: PG */
public final class dl extends AnimatorListenerAdapter {
    private final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public dl(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a = null;
    }
}
