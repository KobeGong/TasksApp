package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: aqf  reason: default package */
final /* synthetic */ class aqf implements View.OnLayoutChangeListener {
    private final aqa a;

    aqf(aqa aqa) {
        this.a = aqa;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        aqa aqa = this.a;
        if (aqa.W && i4 > 0) {
            aqa.W = false;
            aqa.a.requestRectangleOnScreen(new Rect(0, i4 - 1, 1, i4));
            aqa.a.removeOnLayoutChangeListener(aqa.U);
        }
    }
}
