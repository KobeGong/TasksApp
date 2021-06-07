package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aua  reason: default package */
public final /* synthetic */ class aua implements View.OnClickListener {
    private final atx a;

    aua(atx atx) {
        this.a = atx;
    }

    public final void onClick(View view) {
        atx atx = this.a;
        if (atx.v != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            atx.u.getLocationInWindow(iArr);
            atx.s.getLocationInWindow(iArr2);
            float f = atx.B - ((float) (iArr[0] - iArr2[0]));
            if (f >= 0.0f || bdk.b(atx.q.getContext())) {
                atx.v.a(atx.d(), atx.u.getOffsetForPosition(f, Math.max(0.0f, atx.C - ((float) (iArr[1] - iArr2[1])))), false);
            }
        }
    }
}
