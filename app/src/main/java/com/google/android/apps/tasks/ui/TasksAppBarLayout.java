package com.google.android.apps.tasks.ui;

import android.content.Context;
import android.os.Build;
import android.support.design.widget.AppBarLayout;
import android.util.AttributeSet;
import android.view.View;

import defpackage.dk;
import defpackage.sn;

/* compiled from: PG */
public class TasksAppBarLayout extends AppBarLayout {
    public boolean f = false;

    public TasksAppBarLayout(Context context) {
        super(context);
        g();
    }

    public TasksAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 21) {
            setStateListAnimator(null);
        } else if (Build.VERSION.SDK_INT >= 21) {
            dk.a(this, 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.appbar.AppBarLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        sn.b((View) this, 1);
    }
}
