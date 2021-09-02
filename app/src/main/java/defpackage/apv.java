package defpackage;

/* renamed from: apv reason: default package */
/* compiled from: PG */
public final class apv extends defpackage.cdm {
    private final /* synthetic */ defpackage.aoe a;
    private final /* synthetic */ com.google.android.apps.tasks.ui.TaskListsActivity b;

    public apv(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, defpackage.aoe aoe) {
        this.b = taskListsActivity;
        this.a = aoe;
    }

    public final void h_() {
        this.b.q.b(this);
        if (!this.b.r()) {
            this.b.a(this.a);
        } else {
            this.a.a((java.lang.String) null);
        }
    }
}
