package com.google.android.apps.tasks.ui.taskslist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
public class TaskItemFrameLayout extends FrameLayout {
    public Runnable action;

    public TaskItemFrameLayout(Context context) {
        super(context);
    }

    public TaskItemFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TaskItemFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.action != null) {
            this.action.run();
        }
    }
}
