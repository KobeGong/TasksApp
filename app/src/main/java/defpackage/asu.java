package defpackage;

/* renamed from: asu reason: default package */
final /* synthetic */ class asu implements android.view.View.OnClickListener {
    private final EditTaskFragment a;
    private final SubTaskView b;

    asu(EditTaskFragment asi, SubTaskView atb) {
        this.a = asi;
        this.b = atb;
    }

    public final void onClick(android.view.View view) {
        EditTaskFragment asi = this.a;
        SubTaskView atb = this.b;
        asi.b(atb);
        asi.a(atb);
        if (defpackage.ajd.b(atb.d)) {
            defpackage.any.a().c().a(asi.listId, atb.d.d, (java.lang.Object) null);
        } else {
            defpackage.any.a().c().a(asi.listId, atb.d.d, true);
        }
    }
}
