package defpackage;

/* renamed from: lv reason: default package */
/* compiled from: PG */
final class lv extends defpackage.lx {
    public android.view.View a;

    lv(android.view.View view, android.view.animation.Animation.AnimationListener animationListener) {
        super(animationListener);
        this.a = view;
    }

    public final void onAnimationEnd(android.view.animation.Animation animation) {
        if (defpackage.sn.a.s(this.a) || android.os.Build.VERSION.SDK_INT >= 24) {
            this.a.post(new defpackage.lw(this));
        } else {
            this.a.setLayerType(0, null);
        }
        super.onAnimationEnd(animation);
    }
}
