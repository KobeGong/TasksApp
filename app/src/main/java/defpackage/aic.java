package defpackage;

/* renamed from: aic reason: default package */
/* compiled from: PG */
class aic implements android.animation.Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final defpackage.afv e;
    public final int f;
    public final android.animation.ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;

    aic(defpackage.afv afv, int i2, float f2, float f3, float f4, float f5) {
        this.f = i2;
        this.e = afv;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.g = android.animation.ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.g.addUpdateListener(new defpackage.aid(this));
        this.g.setTarget(afv.a);
        this.g.addListener(this);
        this.m = 0.0f;
    }

    public void onAnimationStart(android.animation.Animator animator) {
    }

    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.l) {
            this.e.a(true);
        }
        this.l = true;
    }

    public void onAnimationCancel(android.animation.Animator animator) {
        this.m = 1.0f;
    }

    public void onAnimationRepeat(android.animation.Animator animator) {
    }
}
