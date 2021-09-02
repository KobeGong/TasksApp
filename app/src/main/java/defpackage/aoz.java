package defpackage;

/* renamed from: aoz reason: default package */
public final /* synthetic */ class aoz implements android.content.DialogInterface.OnClickListener {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;

    public aoz(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        defpackage.kq.a((android.app.Activity) this.a, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"});
    }
}
