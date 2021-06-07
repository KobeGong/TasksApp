package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
/* renamed from: aic  reason: default package */
/* compiled from: PG */
public class aic implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final afv e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;

    aic(afv afv, int i2, float f2, float f3, float f4, float f5) {
        this.f = i2;
        this.e = afv;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.g = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g.addUpdateListener(new aid(this));
        this.g.setTarget(afv.a);
        this.g.addListener(this);
        this.m = 0.0f;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.l) {
            this.e.a(true);
        }
        this.l = true;
    }

    public void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
