package defpackage;

/* renamed from: aoy reason: default package */
public final /* synthetic */ class aoy implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity;
    private final defpackage.aoe b;
    private final AbsDeviceOwner deviceOwner;
    private final defpackage.cyi d;

    public aoy(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, defpackage.aoe aoe, AbsDeviceOwner cdu, defpackage.cyi cyi) {
        this.taskListsActivity = taskListsActivity;
        this.b = aoe;
        this.deviceOwner = cdu;
        this.d = cyi;
    }

    public final void run() {
        this.taskListsActivity.runOnUiThread(new defpackage.apk(this.taskListsActivity, this.b, this.deviceOwner, this.d));
    }
}
