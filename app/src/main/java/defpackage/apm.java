package defpackage;

/* renamed from: apm reason: default package */
public final /* synthetic */ class apm implements android.view.View.OnClickListener {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;

    public apm(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity = this.a;
        defpackage.anc c = defpackage.any.a().c();
        if (c != null) {
            java.util.List d = c.d();
            if (taskListsActivity.h == null) {
                str = null;
            } else {
                str = taskListsActivity.h.b;
            }
            taskListsActivity.a(d, str);
            taskListsActivity.o.g();
            taskListsActivity.o.d.b(taskListsActivity.o.view);
            if (!taskListsActivity.o.d.l()) {
                taskListsActivity.o.d.a(taskListsActivity.o.fragmentActivity.getSupportFragmentManager(), defpackage.cde.TAG);
            }
        }
    }
}
