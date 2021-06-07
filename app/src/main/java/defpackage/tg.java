package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: tg  reason: default package */
/* compiled from: PG */
public final class tg implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ tj a;

    tg(tj tjVar) {
        this.a = tjVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.a.a.c.getParent()).invalidate();
    }
}
