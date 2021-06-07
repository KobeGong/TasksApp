package defpackage;

import android.animation.Animator;

/* access modifiers changed from: package-private */
/* renamed from: ue  reason: default package */
/* compiled from: PG */
public final class ue implements Animator.AnimatorListener {
    private final /* synthetic */ uf a;
    private final /* synthetic */ uc b;

    ue(uc ucVar, uf ufVar) {
        this.b = ucVar;
        this.a = ufVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        uc ucVar = this.b;
        uf ufVar = this.a;
        if (ucVar.f) {
            uc.a(1.0f, ufVar);
            float floor = (float) (Math.floor((double) (ufVar.l / 0.8f)) + 1.0d);
            ufVar.e = ufVar.j + ((ufVar.k - 0.01f) - ufVar.j);
            ufVar.f = ufVar.k;
            ufVar.g = (floor - ufVar.l) + ufVar.l;
        } else {
            float f = ufVar.l;
            float f2 = ufVar.j + 0.79f;
            ufVar.e = f2 - (((1.0f - uc.a.getInterpolation(1.0f)) * 0.79f) + 0.01f);
            ufVar.f = f2;
            ufVar.g = f + 0.20999998f;
            ucVar.c = 216.0f * (ucVar.e + 1.0f);
        }
        this.a.c();
        uf ufVar2 = this.a;
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
