package defpackage;

/* renamed from: dl reason: default package */
/* compiled from: PG */
public final class dl extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ android.support.design.behavior.HideBottomViewOnScrollBehavior a;

    public dl(android.support.design.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.a = null;
    }
}
