package defpackage;

/* renamed from: cfs reason: default package */
/* compiled from: PG */
final class cfs implements android.view.animation.Animation.AnimationListener {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ defpackage.cfr b;

    cfs(defpackage.cfr cfr, boolean z) {
        this.b = cfr;
        this.a = z;
    }

    public final void onAnimationStart(android.view.animation.Animation animation) {
        if (this.a) {
            this.b.a.d();
            this.b.a.accountMenuBodyView.setVisibility(0);
        }
    }

    public final void onAnimationEnd(android.view.animation.Animation animation) {
        if (!this.a) {
            this.b.a.d();
            this.b.a.accountMenuBodyView.setVisibility(8);
        }
    }

    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }
}
