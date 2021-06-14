package defpackage;

import android.graphics.Typeface;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apl  reason: default package */
final /* synthetic */ class apl implements Runnable {
    private final TaskListsActivity a;
    private final Typeface b;

    apl(TaskListsActivity taskListsActivity, Typeface typeface) {
        this.a = taskListsActivity;
        this.b = typeface;
    }

    public final void run() {
        TaskListsActivity taskListsActivity = this.a;
        Typeface typeface = this.b;
        if (!taskListsActivity.r()) {
            ew ewVar = taskListsActivity.collapsingToolbarLayout.c;
            if (ewVar.l != typeface) {
                ewVar.l = typeface;
                ewVar.c();
            }
            ew ewVar2 = taskListsActivity.collapsingToolbarLayout.c;
            if (ewVar2.k != typeface) {
                ewVar2.k = typeface;
                ewVar2.c();
            }
        }
    }
}
