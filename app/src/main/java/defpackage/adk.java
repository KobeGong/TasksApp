package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: adk  reason: default package */
/* compiled from: PG */
public final class adk extends AnimatorListenerAdapter {
    private boolean a = false;
    private final /* synthetic */ adh b;

    adk(adh adh) {
        this.b = adh;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
        } else if (((Float) this.b.n.getAnimatedValue()).floatValue() == 0.0f) {
            this.b.o = 0;
            this.b.a(0);
        } else {
            this.b.o = 2;
            this.b.j.invalidate();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }
}
