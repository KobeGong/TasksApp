package defpackage;

/* renamed from: cfr reason: default package */
/* compiled from: PG */
final class cfr extends android.view.animation.Animation {
    public final /* synthetic */ defpackage.cfm a;
    private final android.view.View b;
    private final float c;
    private final float d;

    cfr(defpackage.cfm cfm, android.view.View view, boolean z) {
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
        setInterpolator(new defpackage.tu());
        setAnimationListener(new defpackage.cfs(this, z));
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        this.b.getLayoutParams().height = (int) (this.c + (this.d * f));
        this.b.requestLayout();
    }
}
