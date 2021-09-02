package defpackage;

/* renamed from: asj reason: default package */
final /* synthetic */ class asj implements android.view.View.OnFocusChangeListener {
    private final EditTaskFragment a;

    asj(EditTaskFragment asi) {
        this.a = asi;
    }

    public final void onFocusChange(android.view.View view, boolean z) {
        EditTaskFragment asi = this.a;
        if (!z) {
            asi.T();
        }
    }
}
