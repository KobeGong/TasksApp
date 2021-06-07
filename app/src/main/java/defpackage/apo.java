package defpackage;

import android.content.res.Resources;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apo  reason: default package */
public final /* synthetic */ class apo implements Runnable {
    private final TaskListsActivity a;

    public apo(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void run() {
        TaskListsActivity taskListsActivity = this.a;
        try {
            taskListsActivity.runOnUiThread(new apl(taskListsActivity, jd.a(taskListsActivity, (int) R.font.google_sans)));
        } catch (Resources.NotFoundException e) {
            azb.b("Could not install task-list-title font. Using default.", new Object[0]);
        }
    }
}
