package defpackage;

import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apj  reason: default package */
public final /* synthetic */ class apj implements Runnable {
    private final TaskListsActivity a;

    public apj(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void run() {
        this.a.o();
    }
}
