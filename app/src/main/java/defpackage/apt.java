package defpackage;

import android.support.v4.widget.NestedScrollView;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apt  reason: default package */
/* compiled from: PG */
public final class apt implements uy {
    private final /* synthetic */ TaskListsActivity a;

    public apt(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    @Override // defpackage.uy
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        if (i != 0 && i2 == 0) {
            this.a.b(true);
        } else if (i == 0 && i2 != 0) {
            this.a.b(false);
        }
    }
}
