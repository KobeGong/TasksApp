package defpackage;

import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: aoy  reason: default package */
public final /* synthetic */ class aoy implements Runnable {
    private final TaskListsActivity a;
    private final aoe b;
    private final cdu c;
    private final cyi d;

    public aoy(TaskListsActivity taskListsActivity, aoe aoe, cdu cdu, cyi cyi) {
        this.a = taskListsActivity;
        this.b = aoe;
        this.c = cdu;
        this.d = cyi;
    }

    public final void run() {
        TaskListsActivity taskListsActivity = this.a;
        taskListsActivity.runOnUiThread(new apk(taskListsActivity, this.b, this.c, this.d));
    }
}
