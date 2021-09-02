package com.google.android.apps.tasks.ui;

/* compiled from: PG */
public class LockableAppBarLayoutBehavior extends android.support.design.widget.AppBarLayout.Behavior {
    public boolean d;

    public LockableAppBarLayoutBehavior() {
        d();
    }

    public LockableAppBarLayoutBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    /* access modifiers changed from: private */
    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.widget.AppBarLayout appBarLayout, android.view.View view, android.view.View view2, int i, int i2) {
        return !this.d && super.a(coordinatorLayout, (android.support.design.appbar.AppBarLayout) appBarLayout, view, view2, i, i2);
    }

    private final void d() {
        this.b = new defpackage.cw(this);
    }
}
