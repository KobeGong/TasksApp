package defpackage;

/* renamed from: ue reason: default package */
/* compiled from: PG */
final class ue implements android.animation.Animator.AnimatorListener {
    private final /* synthetic */ defpackage.uf a;
    private final /* synthetic */ defpackage.uc b;

    ue(defpackage.uc ucVar, defpackage.uf ufVar) {
        this.b = ucVar;
        this.a = ufVar;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
        this.b.e = 0.0f;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
    }

    public final void onAnimationRepeat(android.animation.Animator animator) {
        defpackage.uc ucVar = this.b;
        defpackage.uf ufVar = this.a;
        if (ucVar.f) {
            defpackage.uc.a(1.0f, ufVar);
            float floor = (float) (java.lang.Math.floor((double) (ufVar.l / 0.8f)) + 1.0d);
            ufVar.e = ufVar.j + ((ufVar.k - 0.01f) - ufVar.j);
            ufVar.f = ufVar.k;
            ufVar.g = (floor - ufVar.l) + ufVar.l;
        } else {
            float f = ufVar.j + 0.79f;
            float f2 = ufVar.l + 0.20999998f;
            float f3 = 216.0f * (ucVar.e + 1.0f);
            ufVar.e = f - (((1.0f - defpackage.uc.a.getInterpolation(1.0f)) * 0.79f) + 0.01f);
            ufVar.f = f;
            ufVar.g = f2;
            ucVar.c = f3;
        }
        this.a.c();
        defpackage.uf ufVar2 = this.a;
        ufVar2.a(ufVar2.a());
        if (this.b.f) {
            this.b.f = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.a.a(false);
            return;
        }
        this.b.e += 1.0f;
    }
}
