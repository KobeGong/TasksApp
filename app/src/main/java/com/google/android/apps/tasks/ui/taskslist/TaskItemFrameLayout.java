package com.google.android.apps.tasks.ui.taskslist;

/* compiled from: PG */
public class TaskItemFrameLayout extends android.widget.FrameLayout {
    public java.lang.Runnable a;

    public TaskItemFrameLayout(android.content.Context context) {
        super(context);
    }

    public TaskItemFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TaskItemFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            this.a.run();
        }
    }
}
