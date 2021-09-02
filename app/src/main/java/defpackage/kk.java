package defpackage;

/* renamed from: kk reason: default package */
/* compiled from: PG */
final class kk extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ defpackage.ju a;
    private final /* synthetic */ android.view.View b;

    kk(defpackage.ju juVar, android.view.View view) {
        this.a = juVar;
        this.b = view;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.b(this.b);
    }
}
