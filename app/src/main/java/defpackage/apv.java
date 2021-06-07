package defpackage;

import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apv  reason: default package */
/* compiled from: PG */
public final class apv extends cdm {
    private final /* synthetic */ aoe a;
    private final /* synthetic */ TaskListsActivity b;

    public apv(TaskListsActivity taskListsActivity, aoe aoe) {
        this.b = taskListsActivity;
        this.a = aoe;
    }

    @Override // defpackage.cdm
    public final void h_() {
        this.b.q.b(this);
        if (!this.b.r()) {
            this.b.a(this.a);
        } else {
            this.a.a((String) null);
        }
    }
}
