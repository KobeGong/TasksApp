package com.google.android.apps.tasks.ui;

/* compiled from: PG */
public class TasksAppBarLayout extends android.support.design.widget.AppBarLayout {
    public boolean f = false;

    public TasksAppBarLayout(android.content.Context context) {
        super(context);
        g();
    }

    public TasksAppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    private final void g() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            setStateListAnimator(null);
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            defpackage.dk.a((android.view.View) this, 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        defpackage.sn.b((android.view.View) this, 1);
    }
}
