package defpackage;

/* renamed from: aoy reason: default package */
public final /* synthetic */ class aoy implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;
    private final defpackage.aoe b;
    private final AbsDeviceOwner c;
    private final defpackage.cyi d;

    public aoy(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, defpackage.aoe aoe, AbsDeviceOwner cdu, defpackage.cyi cyi) {
        this.a = taskListsActivity;
        this.b = aoe;
        this.c = cdu;
        this.d = cyi;
    }

    public final void run() {
        this.a.runOnUiThread(new defpackage.apk(this.a, this.b, this.c, this.d));
    }
}
