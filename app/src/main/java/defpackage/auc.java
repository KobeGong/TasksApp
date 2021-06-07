package defpackage;

import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: auc  reason: default package */
public final /* synthetic */ class auc implements Runnable {
    private final atx a;

    auc(atx atx) {
        this.a = atx;
    }

    public final void run() {
        boolean z = true;
        atx atx = this.a;
        if (atx.u.getLineCount() <= 1 && atx.u()) {
            z = false;
        }
        int i = z ? R.dimen.task_item_top_to_check_when_multiline : R.dimen.task_item_top_to_check_when_singleline;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) atx.t.getLayoutParams();
        int dimension = (int) atx.s.getResources().getDimension(i);
        if (dimension != layoutParams.topMargin) {
            layoutParams.topMargin = dimension;
            int left = atx.t.getLeft();
            atx.t.layout(left, dimension, atx.t.getWidth() + left, atx.t.getHeight() + dimension);
        }
    }
}
