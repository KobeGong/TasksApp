package defpackage;

/* renamed from: aqf reason: default package */
final /* synthetic */ class aqf implements android.view.View.OnLayoutChangeListener {
    private final WelcomeFragment a;

    aqf(WelcomeFragment aqa) {
        this.a = aqa;
    }

    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WelcomeFragment aqa = this.a;
        if (aqa.W && i4 > 0) {
            aqa.W = false;
            aqa.a.requestRectangleOnScreen(new android.graphics.Rect(0, i4 - 1, 1, i4));
            aqa.a.removeOnLayoutChangeListener(aqa.U);
        }
    }
}
