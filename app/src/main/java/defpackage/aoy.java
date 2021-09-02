package defpackage;

/* renamed from: aoy reason: default package */
public final /* synthetic */ class aoy implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;
    private final defpackage.aoe b;
    private final defpackage.cdu c;
    private final defpackage.cyi d;

    public aoy(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, defpackage.aoe aoe, defpackage.cdu cdu, defpackage.cyi cyi) {
        this.a = taskListsActivity;
        this.b = aoe;
        this.c = cdu;
        this.d = cyi;
    }

    public final void run() {
        com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity = this.a;
        taskListsActivity.runOnUiThread(new defpackage.apk(taskListsActivity, this.b, this.c, this.d));
    }
}
