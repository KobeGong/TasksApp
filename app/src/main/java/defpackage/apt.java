package defpackage;

/* renamed from: apt reason: default package */
/* compiled from: PG */
public final class apt implements defpackage.uy {
    private final /* synthetic */ com.google.android.apps.tasks.ui.TaskListsActivity a;

    public apt(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void a(android.support.v4.widget.NestedScrollView nestedScrollView, int i, int i2) {
        if (i != 0 && i2 == 0) {
            this.a.b(true);
        } else if (i == 0 && i2 != 0) {
            this.a.b(false);
        }
    }
}
