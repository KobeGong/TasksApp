package defpackage;

/* renamed from: asl reason: default package */
final /* synthetic */ class asl implements android.view.View.OnFocusChangeListener {
    private final EditTaskFragment taskFragment;
    private final SubTaskView b;

    asl(EditTaskFragment asi, SubTaskView atb) {
        this.taskFragment = asi;
        this.b = atb;
    }

    public final void onFocusChange(android.view.View view, boolean z) {
        if (!z) {
            this.taskFragment.b(this.b);
        }
    }
}
