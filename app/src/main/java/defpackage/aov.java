package defpackage;

/* renamed from: aov reason: default package */
public final /* synthetic */ class aov implements android.view.View.OnClickListener {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;

    public aov(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(android.view.View view) {
        this.a.onBackPressed();
    }
}
