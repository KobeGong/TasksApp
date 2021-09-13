package defpackage;

/* renamed from: apb reason: default package */
public final /* synthetic */ class apb implements android.content.DialogInterface.OnClickListener {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;
    private final java.lang.String b;
    private final int c;

    public apb(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, java.lang.String str, int i) {
        this.a = taskListsActivity;
        this.b = str;
        this.c = i;
    }

    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity = this.a;
        java.lang.String str = this.b;
        defpackage.any.get().c().a(str, this.c, (java.lang.Object) defpackage.ajn.a(str));
        taskListsActivity.a((java.lang.String) null);
    }
}
