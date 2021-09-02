package defpackage;

/* renamed from: aua reason: default package */
final /* synthetic */ class aua implements android.view.View.OnClickListener {
    private final defpackage.atx a;

    aua(defpackage.atx atx) {
        this.a = atx;
    }

    public final void onClick(android.view.View view) {
        defpackage.atx atx = this.a;
        if (atx.v != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            atx.u.getLocationInWindow(iArr);
            atx.s.getLocationInWindow(iArr2);
            float f = atx.B - ((float) (iArr[0] - iArr2[0]));
            if (f >= 0.0f || defpackage.bdk.b(atx.q.getContext())) {
                atx.v.a(atx.d(), atx.u.getOffsetForPosition(f, java.lang.Math.max(0.0f, atx.C - ((float) (iArr[1] - iArr2[1])))), false);
            }
        }
    }
}
