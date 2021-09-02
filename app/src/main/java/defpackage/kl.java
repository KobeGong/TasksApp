package defpackage;

/* renamed from: kl reason: default package */
/* compiled from: PG */
final class kl extends android.animation.AnimatorListenerAdapter implements defpackage.id, defpackage.ji {
    private final android.view.View a;
    private final int b;
    private final android.view.ViewGroup c;
    private final boolean d;
    private boolean e;
    private boolean f = false;

    kl(android.view.View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (android.view.ViewGroup) view.getParent();
        this.d = true;
        a(true);
    }

    public final void onAnimationPause(android.animation.Animator animator) {
        if (!this.f) {
            defpackage.kb.a(this.a, this.b);
        }
    }

    public final void onAnimationResume(android.animation.Animator animator) {
        if (!this.f) {
            defpackage.kb.a(this.a, 0);
        }
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
        this.f = true;
    }

    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    public final void onAnimationStart(android.animation.Animator animator) {
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        d();
    }

    public final void c() {
    }

    public final void a(defpackage.je jeVar) {
        d();
        jeVar.b((defpackage.ji) this);
    }

    public final void a() {
        a(false);
    }

    public final void b() {
        a(true);
    }

    private final void d() {
        if (!this.f) {
            defpackage.kb.a(this.a, this.b);
            if (this.c != null) {
                this.c.invalidate();
            }
        }
        a(false);
    }

    private final void a(boolean z) {
        if (this.d && this.e != z && this.c != null) {
            this.e = z;
            defpackage.jv.a(this.c, z);
        }
    }
}
