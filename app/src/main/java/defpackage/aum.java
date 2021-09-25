package defpackage;

/* renamed from: aum reason: default package */
final /* synthetic */ class aum implements android.view.View.OnClickListener {
    private final TasksFragment a;

    aum(TasksFragment auj) {
        this.a = auj;
    }

    public final void onClick(android.view.View view) {
        TasksFragment auj = this.a;
        auj.flattenSubtasksView.setEnabled(false);
        auj.a(true);
        defpackage.any.get().c().f(auj.X);
        defpackage.any.get().c().a(auj.X).a(new defpackage.auq(auj), com.google.android.apps.tasks.common.TaskApplication.getApplication().executor);
    }
}
