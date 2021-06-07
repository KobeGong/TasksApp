package defpackage;

import android.view.View;
import com.google.android.apps.tasks.ui.TaskListsActivity;
import java.util.List;

/* renamed from: apm  reason: default package */
public final /* synthetic */ class apm implements View.OnClickListener {
    private final TaskListsActivity a;

    public apm(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(View view) {
        String str;
        TaskListsActivity taskListsActivity = this.a;
        anc c = any.a().c();
        if (c != null) {
            List d = c.d();
            if (taskListsActivity.h == null) {
                str = null;
            } else {
                str = taskListsActivity.h.b;
            }
            taskListsActivity.a(d, str);
            cde cde = taskListsActivity.o;
            cde.g();
            cde.d.b(cde.c);
            if (!cde.d.l()) {
                cde.d.a(cde.b.c(), cde.a);
            }
        }
    }
}
