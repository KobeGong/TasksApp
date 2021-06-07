package defpackage;

import android.view.animation.Animation;

/* access modifiers changed from: package-private */
/* renamed from: cfs  reason: default package */
/* compiled from: PG */
public final class cfs implements Animation.AnimationListener {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ cfr b;

    cfs(cfr cfr, boolean z) {
        this.b = cfr;
        this.a = z;
    }

    public final void onAnimationStart(Animation animation) {
        if (this.a) {
            this.b.a.d();
            this.b.a.b.setVisibility(0);
        }
    }

    public final void onAnimationEnd(Animation animation) {
        if (!this.a) {
            this.b.a.d();
            this.b.a.b.setVisibility(8);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
