package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* access modifiers changed from: package-private */
/* renamed from: cfr  reason: default package */
/* compiled from: PG */
public final class cfr extends Animation {
    public final /* synthetic */ cfm a;
    private final View b;
    private final float c;
    private final float d;

    cfr(cfm cfm, View view, boolean z) {
        float f;
        this.a = cfm;
        this.b = view;
        this.c = (float) view.getHeight();
        if (z) {
            view.measure(-1, -2);
            f = (float) view.getMeasuredHeight();
        } else {
            f = 0.0f;
        }
        this.d = f - this.c;
        setDuration((long) cfm.getResources().getInteger(17694720));
        setInterpolator(new tu());
        setAnimationListener(new cfs(this, z));
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        this.b.getLayoutParams().height = (int) (this.c + (this.d * f));
        this.b.requestLayout();
    }
}
