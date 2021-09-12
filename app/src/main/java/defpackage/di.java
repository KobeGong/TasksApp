package defpackage;

import android.support.design.widget.CoordinatorLayout;

/* renamed from: di reason: default package */
/* compiled from: PG */
public class di extends defpackage.gx {
    private ViewOffsetHelper viewOffsetHelper;
    private int tempTopBottomOffset = 0;

    public di() {
    }

    public di(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        b(coordinatorLayout, view, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new ViewOffsetHelper(view);
        }
        this.viewOffsetHelper.a();
        if (this.tempTopBottomOffset != 0) {
            this.viewOffsetHelper.setTopAndBottomOffset(this.tempTopBottomOffset);
            this.tempTopBottomOffset = 0;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        coordinatorLayout.a(view, i);
    }

    public final boolean setTopAndBottomOffset(int i) {
        if (this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.setTopAndBottomOffset(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public final int c() {
        if (this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.b;
        }
        return 0;
    }
}
