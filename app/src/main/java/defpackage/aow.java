package defpackage;

import android.view.MenuItem;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: aow  reason: default package */
public final /* synthetic */ class aow implements ahb {
    private final TaskListsActivity a;

    public aow(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    @Override // defpackage.ahb
    public final boolean a(MenuItem menuItem) {
        return this.a.onToolbarMenuItemClicked(menuItem);
    }
}
