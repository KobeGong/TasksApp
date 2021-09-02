package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: apo reason: default package */
public final /* synthetic */ class apo implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;

    public apo(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void run() {
        com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity = this.a;
        try {
            taskListsActivity.runOnUiThread(new defpackage.apl(taskListsActivity, defpackage.jd.a(taskListsActivity, com.google.android.apps.tasks.R.font.google_sans)));
        } catch (android.content.res.Resources.NotFoundException e) {
            defpackage.azb.b("Could not install task-list-title font. Using default.", new java.lang.Object[0]);
        }
    }
}
