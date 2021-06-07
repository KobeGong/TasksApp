package com.google.android.apps.tasks.ui.taskslist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
public class TaskItemFrameLayout extends FrameLayout {
    public Runnable a;

    public TaskItemFrameLayout(Context context) {
        super(context);
    }

    public TaskItemFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TaskItemFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            this.a.run();
        }
    }
}
