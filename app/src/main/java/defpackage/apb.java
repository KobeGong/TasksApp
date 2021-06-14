package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apb  reason: default package */
public final /* synthetic */ class apb implements DialogInterface.OnClickListener {
    private final TaskListsActivity a;
    private final String b;
    private final int c;

    public apb(TaskListsActivity taskListsActivity, String str, int i) {
        this.a = taskListsActivity;
        this.b = str;
        this.c = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TaskListsActivity taskListsActivity = this.a;
        String str = this.b;
        any.get().c().a(str, this.c, ajn.a(str));
        taskListsActivity.a((String) null);
    }
}
