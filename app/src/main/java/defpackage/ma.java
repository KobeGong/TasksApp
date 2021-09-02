package defpackage;

/* renamed from: ma reason: default package */
/* compiled from: PG */
final class ma extends android.view.animation.AnimationSet implements java.lang.Runnable {
    private final android.view.ViewGroup a;
    private final android.view.View b;
    private boolean c;
    private boolean d;

    ma(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
        super(false);
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
    }

    public final boolean getTransformation(long j, android.view.animation.Transformation transformation) {
        if (this.c) {
            if (!this.d) {
                return true;
            }
            return false;
        } else if (super.getTransformation(j, transformation)) {
            return true;
        } else {
            this.c = true;
            defpackage.nt.a(this.a, this);
            return true;
        }
    }

    public final boolean getTransformation(long j, android.view.animation.Transformation transformation, float f) {
        if (this.c) {
            if (!this.d) {
                return true;
            }
            return false;
        } else if (super.getTransformation(j, transformation, f)) {
            return true;
        } else {
            this.c = true;
            defpackage.nt.a(this.a, this);
            return true;
        }
    }

    public final void run() {
        this.a.endViewTransition(this.b);
        this.d = true;
    }
}
