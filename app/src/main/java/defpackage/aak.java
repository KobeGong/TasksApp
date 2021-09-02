package defpackage;

/* renamed from: aak reason: default package */
/* compiled from: PG */
public final class aak extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ android.support.v7.widget.ActionBarOverlayLayout a;

    public aak(android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.h = null;
        this.a.e = false;
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
        this.a.h = null;
        this.a.e = false;
    }
}
