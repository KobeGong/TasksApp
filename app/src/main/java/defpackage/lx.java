package defpackage;

import android.view.animation.Animation;

/* access modifiers changed from: package-private */
/* renamed from: lx  reason: default package */
/* compiled from: PG */
public class lx implements Animation.AnimationListener {
    private final Animation.AnimationListener a;

    lx(Animation.AnimationListener animationListener) {
        this.a = animationListener;
    }

    public void onAnimationStart(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationStart(animation);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationRepeat(animation);
        }
    }
}
