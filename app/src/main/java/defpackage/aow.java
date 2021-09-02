package defpackage;

import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: aow reason: default package */
public final /* synthetic */ class aow implements OnMenuItemClickListener {
    private final TaskListsActivity a;

    public aow(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        return this.a.a(menuItem);
    }
}
