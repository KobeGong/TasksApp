package defpackage;

/* renamed from: apj reason: default package */
public final /* synthetic */ class apj implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;

    public apj(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void run() {
        this.a.removeSplash();
    }
}
