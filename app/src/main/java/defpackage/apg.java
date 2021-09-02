package defpackage;

/* renamed from: apg reason: default package */
public final /* synthetic */ class apg implements android.content.DialogInterface.OnClickListener {
    private final java.lang.String a;
    private final TasksFragment b;

    public apg(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, java.lang.String str, TasksFragment auj) {
        this.a = str;
        this.b = auj;
    }

    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        java.lang.String str = this.a;
        TasksFragment auj = this.b;
        defpackage.any.a().c().e(str);
        auj.a(str, auj.Y, true);
    }
}
