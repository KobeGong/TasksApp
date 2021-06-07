package defpackage;

import android.view.View;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: aph  reason: default package */
public final /* synthetic */ class aph implements View.OnClickListener {
    private final TaskListsActivity a;

    public aph(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(View view) {
        new arx().a(this.a.c(), "AddTaskBottomSheetDialogFragment");
    }
}
