package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: aak  reason: default package */
/* compiled from: PG */
public final class aak extends AnimatorListenerAdapter {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public aak(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.h = null;
        this.a.e = false;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.h = null;
        this.a.e = false;
    }
}
