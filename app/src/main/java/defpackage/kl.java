package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: kl  reason: default package */
/* compiled from: PG */
final class kl extends AnimatorListenerAdapter implements id, ji {
    private final View a;
    private final int b;
    private final ViewGroup c;
    private final boolean d;
    private boolean e;
    private boolean f = false;

    kl(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        this.d = true;
        a(true);
    }

    @Override // defpackage.id
    public final void onAnimationPause(Animator animator) {
        if (!this.f) {
            kb.a(this.a, this.b);
        }
    }

    @Override // defpackage.id
    public final void onAnimationResume(Animator animator) {
        if (!this.f) {
            kb.a(this.a, 0);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        d();
    }

    @Override // defpackage.ji
    public final void c() {
    }

    @Override // defpackage.ji
    public final void a(je jeVar) {
        d();
        jeVar.b(this);
    }

    @Override // defpackage.ji
    public final void a() {
        a(false);
    }

    @Override // defpackage.ji
    public final void b() {
        a(true);
    }

    private final void d() {
        if (!this.f) {
            kb.a(this.a, this.b);
            if (this.c != null) {
                this.c.invalidate();
            }
        }
        a(false);
    }

    private final void a(boolean z) {
        if (this.d && this.e != z && this.c != null) {
            this.e = z;
            jv.a(this.c, z);
        }
    }
}
