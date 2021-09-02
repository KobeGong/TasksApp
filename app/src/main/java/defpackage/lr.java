package defpackage;

/* renamed from: lr reason: default package */
/* compiled from: PG */
final class lr extends defpackage.lx {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FragmentManagerImpl b;
    private final /* synthetic */ android.view.ViewGroup c;

    lr(FragmentManagerImpl lpVar, android.view.animation.Animation.AnimationListener animationListener, android.view.ViewGroup viewGroup, Fragment lcVar) {
        this.b = lpVar;
        this.c = viewGroup;
        this.a = lcVar;
        super(animationListener);
    }

    public final void onAnimationEnd(android.view.animation.Animation animation) {
        super.onAnimationEnd(animation);
        this.c.post(new defpackage.ls(this));
    }
}
