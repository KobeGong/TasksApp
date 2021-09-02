package defpackage;

/* renamed from: asq reason: default package */
final /* synthetic */ class asq implements android.view.View.OnClickListener {
    private final EditTaskFragment a;

    asq(EditTaskFragment asi) {
        this.a = asi;
    }

    public final void onClick(android.view.View view) {
        EditTaskFragment asi = this.a;
        java.lang.String str = asi.U;
        if (asi.V != null) {
            str = asi.V.b;
        }
        defpackage.atd atd = new defpackage.atd();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("selectedTaskList", str);
        atd.e(bundle);
        atd.a((defpackage.ln) asi.t, "TaskListSelectorBottomSheetDialogFragment");
    }
}
