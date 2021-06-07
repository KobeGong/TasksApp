package com.google.android.apps.tasks.ui;

import android.content.Context;
import android.support.design.appbar.AppBarLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
public class LockableAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public boolean d;

    public LockableAppBarLayoutBehavior() {
        d();
    }

    public LockableAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    /* access modifiers changed from: private */
    public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return !this.d && super.a(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    private final void d() {
        ((AppBarLayout.BaseBehavior) this).b = new cw(this);
    }
}
