package defpackage;

/* renamed from: auc reason: default package */
final /* synthetic */ class auc implements java.lang.Runnable {
    private final defpackage.atx a;

    auc(defpackage.atx atx) {
        this.a = atx;
    }

    public final void run() {
        int i;
        boolean z = true;
        defpackage.atx atx = this.a;
        if (atx.u.getLineCount() <= 1 && atx.u()) {
            z = false;
        }
        if (z) {
            i = 2131689889;
        } else {
            i = 2131689890;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) atx.t.getLayoutParams();
        int dimension = (int) atx.s.getResources().getDimension(i);
        if (dimension != layoutParams.topMargin) {
            layoutParams.topMargin = dimension;
            int left = atx.t.getLeft();
            atx.t.layout(left, dimension, atx.t.getWidth() + left, atx.t.getHeight() + dimension);
        }
    }
}
