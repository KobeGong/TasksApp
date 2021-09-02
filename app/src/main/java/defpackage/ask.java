package defpackage;

/* renamed from: ask reason: default package */
final /* synthetic */ class ask implements android.view.View.OnFocusChangeListener {
    private final EditTaskFragment a;

    ask(EditTaskFragment asi) {
        this.a = asi;
    }

    public final void onFocusChange(android.view.View view, boolean z) {
        EditTaskFragment asi = this.a;
        if (!z) {
            asi.U();
        }
    }
}
