package defpackage;

/* renamed from: ast reason: default package */
final /* synthetic */ class ast implements android.view.View.OnClickListener {
    private final EditTaskFragment a;
    private final SubTaskView b;

    ast(EditTaskFragment asi, SubTaskView atb) {
        this.a = asi;
        this.b = atb;
    }

    public final void onClick(android.view.View view) {
        EditTaskFragment asi = this.a;
        SubTaskView atb = this.b;
        asi.b(atb);
        asi.a(atb);
        defpackage.any.get().c().a(asi.listId, atb.d.d, (java.lang.Object) null);
    }
}
