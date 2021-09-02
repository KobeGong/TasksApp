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
            defpackage.cde cde = taskListsActivity.o;
            cde.g();
            cde.d.b(cde.c);
            if (!cde.d.l()) {
                cde.d.a(cde.b.getSupportFragmentManager(), defpackage.cde.a);
            }
        }
    }
}
