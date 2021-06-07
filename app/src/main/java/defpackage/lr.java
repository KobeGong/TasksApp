package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* access modifiers changed from: package-private */
/* renamed from: lr  reason: default package */
/* compiled from: PG */
public final class lr extends lx {
    public final /* synthetic */ lc a;
    public final /* synthetic */ lp b;
    private final /* synthetic */ ViewGroup c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    lr(lp lpVar, Animation.AnimationListener animationListener, ViewGroup viewGroup, lc lcVar) {
        super(animationListener);
        this.b = lpVar;
        this.c = viewGroup;
        this.a = lcVar;
    }

    @Override // defpackage.lx
    public final void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.c.post(new ls(this));
    }
}
