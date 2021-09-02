package defpackage;

/* renamed from: aph reason: default package */
public final /* synthetic */ class aph implements android.view.View.OnClickListener {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;

    public aph(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(android.view.View view) {
        new AddTaskFragment().a(this.a.getSupportFragmentManager(), "AddTaskBottomSheetDialogFragment");
    }
}
