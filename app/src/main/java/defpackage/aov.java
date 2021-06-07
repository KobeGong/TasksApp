package defpackage;

import android.view.View;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: aov  reason: default package */
public final /* synthetic */ class aov implements View.OnClickListener {
    private final TaskListsActivity a;

    public aov(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(View view) {
        this.a.onBackPressed();
    }
}
